package com.fpms.login.helper;

import com.fpms.login.entities.PersonalDets;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

public class Helper {
    public static String[] HEADERS = {"emailId","name","address","bloodGroup"};
    public static String SHEET_NAME = "Info";
    public static ByteArrayInputStream dataToExcel(List<PersonalDets> list){
        Workbook workbook = new XSSFWorkbook();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try{
            Sheet sheet = workbook.createSheet(SHEET_NAME);
            Row row = sheet.createRow(0);
            for(int i=0;i<HEADERS.length;i++){
                Cell cell = row.createCell(i);
                cell.setCellValue(HEADERS[i]);
            }
            int rowIndex = 1;
            for(PersonalDets p:list){
                Row dataRow = sheet.createRow(rowIndex);
                rowIndex++;
                dataRow.createCell(0).setCellValue(p.getEmailId());
                dataRow.createCell(1).setCellValue(p.getName());
                dataRow.createCell(2).setCellValue(p.getAddress());
                dataRow.createCell(3).setCellValue(p.getBloodGrp());
            }
            workbook.write(out);
            return new ByteArrayInputStream(out.toByteArray());
        }catch(IOException e){
            e.printStackTrace();
            return null;
        }
        finally {
            try {
                workbook.close();
                out.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
