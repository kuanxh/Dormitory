package com.hxk.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hxk.mapper.AdminDorMapper;
import com.hxk.mapper.AdminStuMapper;
import com.hxk.mapper.DorRepairMapper;
import com.hxk.mapper.SanitationMapper;
import com.hxk.mapper.VisitorMapper;
import com.hxk.model.AdminDor;
import com.hxk.model.AdminStu;
import com.hxk.model.DorRepair;
import com.hxk.model.Sanitation;
import com.hxk.model.Visitor;
import com.hxk.service.AdminService;


@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminStuMapper adminStuMapper;
	
	@Autowired
	private VisitorMapper visitorMapper;
	
	@Autowired
	private AdminDorMapper adminDorMapper;
	
	@Autowired
	private SanitationMapper sanitationMapper;
	
	@Autowired
	private DorRepairMapper dorRepairMapper;
	
	//管理员学生信息管理
	public List<AdminStu> getAllStudent() {
		// TODO Auto-generated method stub
		List<AdminStu> stu = adminStuMapper.selectAllStudent();
		return stu;
	}
	
	//管理员宿舍信息管理
	public List<AdminDor> getAllDor() {
		// TODO Auto-generated method stub
		List<AdminDor> dor = adminDorMapper.selectAllDor();
		return dor;
	}
	
	@Override
	public AdminStu getStudent(String id) {
		return adminStuMapper.selectStudentById(id);
	}
	
	//获取所有游客的信息
	@Override
	public List<Visitor> getAllVisitor() {
		List<Visitor> viss= visitorMapper.selectAllVisitor();
		return viss;
	}
	
	//插入单条游客的信息
	@Override
	public void insertVis(Visitor visitor) {
		visitorMapper.insertVisitor(visitor);
	}
	
	
	
	//获取所有卫生信息
	@Override
	public List<Sanitation> getAllSan() {
		List<Sanitation> sanitations = sanitationMapper.selectAllSanitation();
		return sanitations;
	}
	
	//卫生文件信息的插入
	@Override
	public void insertSan(InputStream in) throws IOException {
		importAdminSanitationXls(in);
	}
	
	
	//获取所有的报修信息
	@Override
	public List<DorRepair> getAllDorRepair() {
		List<DorRepair> dorR = dorRepairMapper.selectAllDorRepair();
		return dorR;
	}
	
	
	
	
	
	
	
	//学生文件上传
	public void importAdminStuXls(InputStream in) throws IOException{  
        List<AdminStu> adminStus  = readAdminStuXls(in); 
        for (AdminStu adminStu : adminStus) {  
        	//与数据库交互插入数据
        	adminStuMapper.insertStudent(adminStu);  
        }  
    }
	
	//学生读取XLS文件
	private List<AdminStu> readAdminStuXls(InputStream is)
			throws IOException {
		System.out.println("readAdminStuXls");
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
		List<AdminStu> adminStus = new ArrayList<AdminStu>();
		AdminStu adminStu;
		// 循环工作表Sheet
		for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
			HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
			if (hssfSheet == null) {
				continue;
			}
			// 循环行Row
			for (int rowNum = 0; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
				adminStu = new AdminStu();
				HSSFRow hssfRow = hssfSheet.getRow(rowNum);
				for (int i = 0; i < hssfRow.getLastCellNum(); i++) {
					HSSFCell adminStuHSSFCell = hssfRow.getCell(i);
					if (i == 0) {
						adminStu.setId(adminStuHSSFCell.getStringCellValue());
						//adminStu.setId(Double.toString(adminStuHSSFCell.getNumericCellValue()));
					} else if (i == 1) {
						//adminStu.setYear(Double.toString(adminStuHSSFCell.getNumericCellValue()));
						adminStu.setYear(adminStuHSSFCell.getStringCellValue());
					} else if (i == 2) {
						adminStu.setName(adminStuHSSFCell.getStringCellValue());
					} else if (i == 3) {
						adminStu.setAddress(adminStuHSSFCell.getStringCellValue());
					} else if (i == 4) {
						//adminStu.setNumber(Double.toString(adminStuHSSFCell.getNumericCellValue()));
						adminStu.setNumber(adminStuHSSFCell.getStringCellValue());
					} else if (i == 5) {
						//adminStu.setPhone(Double.toString(adminStuHSSFCell.getNumericCellValue()));
						adminStu.setPhone(adminStuHSSFCell.getStringCellValue());
					}
				}
				adminStus.add(adminStu);
			}
		}
		System.out.println(adminStus);
		return adminStus;
	}
	
	//宿舍文件上传
	public void importAdminDorXls(InputStream in) throws IOException{  
        List<AdminDor> adminDors  = readAdminDorXls(in); 
        for (AdminDor adminDor : adminDors) {  
        	//与数据库交互插入数据
        	adminDorMapper.insertDor(adminDor);  
        }  
    }
	
	//宿舍读取XLS文件
	private List<AdminDor> readAdminDorXls(InputStream is)
			throws IOException {
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
		List<AdminDor> adminDors = new ArrayList<AdminDor>();
		AdminDor adminDor;
		// 循环工作表Sheet
		for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
			HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
			if (hssfSheet == null) {
				continue;
			}
			// 循环行Row
			for (int rowNum = 0; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
				adminDor = new AdminDor();
				HSSFRow hssfRow = hssfSheet.getRow(rowNum);
				for (int i = 0; i < hssfRow.getLastCellNum(); i++) {
					HSSFCell adminDorHSSFCell = hssfRow.getCell(i);
					if (i == 0) {
						adminDor.setId(adminDorHSSFCell.getStringCellValue());
					} else if (i == 1) {
						adminDor.setCount(adminDorHSSFCell.getStringCellValue());
					} else if (i == 2) {
						adminDor.setName(adminDorHSSFCell.getStringCellValue());
					} else if (i == 3) {
						adminDor.setNumber(adminDorHSSFCell.getStringCellValue());
					} else if (i == 4) {
						adminDor.setPhone(adminDorHSSFCell.getStringCellValue());
					} else if (i == 5) {
						adminDor.setAdmin(adminDorHSSFCell.getStringCellValue());
					}
				}
				adminDors.add(adminDor);
			}
		}
		return adminDors;
	}
	
	
	//卫生文件上传
	public void importAdminSanitationXls(InputStream in) throws IOException{  
        List<Sanitation> sanitations  = readAdminSanitationXls(in); 
        for (Sanitation sanitation : sanitations) {  
        	//与数据库交互插入数据
        	sanitationMapper.insertSanitation(sanitation);  
        }  
    }
	
	//卫生读取XLS文件
	private List<Sanitation> readAdminSanitationXls(InputStream is) throws IOException {
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
		List<Sanitation>sanitations = new ArrayList<Sanitation>();
		Sanitation sanitation;
		// 循环工作表Sheet
		for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
			HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
			if (hssfSheet == null) {
				continue;
			}
			// 循环行Row
			for (int rowNum = 0; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
				sanitation = new Sanitation();
				HSSFRow hssfRow = hssfSheet.getRow(rowNum);
				for (int i = 0; i < hssfRow.getLastCellNum(); i++) {
					HSSFCell sanitationHSSFCell = hssfRow.getCell(i);
					if (i == 0) {
						sanitation.setNumber(sanitationHSSFCell.getStringCellValue());
					} else if (i == 1) {
						sanitation.setBed(sanitationHSSFCell.getStringCellValue());
					} else if (i == 2) {
						sanitation.setFloor(sanitationHSSFCell.getStringCellValue());
					} else if (i == 3) {
						sanitation.setChair(sanitationHSSFCell.getStringCellValue());
					} else if (i == 4) {
						sanitation.setToilet(sanitationHSSFCell.getStringCellValue());
					} else if (i == 5) {
						sanitation.setLoo(sanitationHSSFCell.getStringCellValue());
					} else if (i == 6) {
						sanitation.setComment(sanitationHSSFCell.getStringCellValue());
					}
				}
				sanitations.add(sanitation);
			}
		}
		return sanitations;
	}

	
	

	
}
