package com.fedex.pdsm;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;

import com.fedex.pdsm.excel.ComparisonOfExcelSheets;
import com.sun.media.sound.InvalidFormatException;

/**
 * Hello world!
 *
 */
@SuppressWarnings("restriction")
public class App 
{
	/**
     * @param args the command line arguments
     */
	public static void main(String[] args) throws FileNotFoundException, IOException, InvalidFormatException, JSONException {
        ComparisonOfExcelSheets c = new ComparisonOfExcelSheets();

        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.print("Excel sheet1 link: ");
        String excel1 = sc.next();
        System.out.print("Excel sheet2 link: ");
        String excel2 = sc.next();
        System.out.print("Enter column name: ");
        String colName = sc.next().toLowerCase();
        JSONArray file1 = c.excelToJsonForSheet(excel1, colName);
        JSONArray file2 = c.excelToJsonForSheet(excel2, colName);
        System.out.println(c.comparingTwoSheets(file1, file2, colName));
        System.out.println("hiiiiii");

    }
}
