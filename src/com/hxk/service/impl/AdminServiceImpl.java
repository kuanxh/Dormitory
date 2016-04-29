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

import com.hxk.mapper.AdminStuMapper;
import com.hxk.model.AdminStu;
import com.hxk.service.AdminService;


@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminStuMapper adminStuMapper;
	
	//管理员学生信息管理
	public List<AdminStu> getAllStudent() {
		// TODO Auto-generated method stub
		List<AdminStu> stu = adminStuMapper.selectAllStudent();
		return stu;
	}

	@Override
	public AdminStu getStudent(String id) {
		return adminStuMapper.selectStudentById(id);
	}
	


	@Override
	//文件上传
	public void importAdminStuXls(InputStream in) throws IOException{  
		System.out.println("importAdminStuXls");
        List<AdminStu> adminStus  = readAdminStuXls(in); 
        for (AdminStu adminStu : adminStus) {  
        	System.out.println("importAdminStuXls1"+in);
        	//与数据库交互插入数据
        	//adminStuMapper.updateByConditions(adminStu);  
        	System.out.println(adminStu);
        }  
    }
	
	//读取XLS文件
	private List<AdminStu> readAdminStuXls(InputStream is)
			throws IOException {
		System.out.println("readAdminStuXls");
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
		System.out.println(hssfWorkbook.toString());
		List<AdminStu> adminStus = new ArrayList<AdminStu>();
		AdminStu adminStu;
		// 循环工作表Sheet
		for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
			System.out.println(numSheet);
			HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
			if (hssfSheet == null) {
				
				System.out.println("hssfSheet_null");
				continue;
			}
			System.out.println("hssfSheet "+hssfSheet);
			// 循环行Row
			for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
				System.out.println("row");
				adminStu = new AdminStu();
				HSSFRow hssfRow = hssfSheet.getRow(rowNum);
				for (int i = 0; i < hssfRow.getLastCellNum(); i++) {
					HSSFCell adminStuHSSFCell = hssfRow.getCell(i);
					if (i == 0) {
						adminStu.setId(adminStuHSSFCell.getStringCellValue());
						System.out.println(adminStuHSSFCell.getStringCellValue());
					} else if (i == 1) {
						adminStu.setId(adminStuHSSFCell.getStringCellValue());
					} else if (i == 2) {
						adminStu.setId(adminStuHSSFCell.getStringCellValue());
					} else if (i == 3) {
						adminStu.setId(adminStuHSSFCell.getStringCellValue());
					} else if (i == 4) {
						adminStu.setId(adminStuHSSFCell.getStringCellValue());
					} else if (i == 5) {
						adminStu.setId(adminStuHSSFCell.getStringCellValue());
					}
				}
				adminStus.add(adminStu);
			}
		}
		System.out.println(adminStus);
		return adminStus;
		
	}
}
