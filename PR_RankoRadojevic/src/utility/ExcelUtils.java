package utility;
        	import java.io.FileInputStream;
            import java.io.FileOutputStream;
            import java.sql.RowIdLifetime;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
        	import org.apache.poi.hssf.usermodel.HSSFSheet;
        	import org.apache.poi.hssf.usermodel.HSSFWorkbook;
        	import org.apache.poi.ss.usermodel.Row;

    public class ExcelUtils {

        		private static HSSFSheet ExcelWSheet;

        		private static HSSFWorkbook ExcelWBook;

        		private static HSSFCell Cell;

        		private static HSSFRow Row1;

    		//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method

    		public static void setExcelFile(String Path,String SheetName) throws Exception {

       			try {

           			// Open the Excel file

					FileInputStream ExcelFile = new FileInputStream(Path);

					// Access the required test data sheet

					ExcelWBook = new HSSFWorkbook(ExcelFile);

					ExcelWSheet = ExcelWBook.getSheet(SheetName);

					} catch (Exception e){

						throw (e);

					}

			}
    		
    		public static int getNumericalCellData(int RowNum, int ColNum) throws Exception{

    		    try{

    		        Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

    		        int CellData = (int) Cell.getNumericCellValue();

    		        return CellData;

    		        }catch (Exception e){

    		        return 0;
    		        }

    		        }

    		//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num

    	    public static String getCellData(int RowNum, int ColNum) throws Exception{

       			try{

          			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

          			String CellData = Cell.getStringCellValue();

          			return CellData;

          			}catch (Exception e){

						return"";

          			}

		    }

    		//This method is to write in the Excel cell, Row num and Col num are the parameters

    		public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception	{

       			try{

          			Row1 = ExcelWSheet.getRow(RowNum);

					Cell = Row1.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);

					if (Cell == null) {

						Cell = Row1.createCell(ColNum);

						Cell.setCellValue(Result);

						} else {

							Cell.setCellValue(Result);

						}

          // Constant variables Test Data path and Test Data file name

          				FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);

          				ExcelWBook.write(fileOut);

          				fileOut.flush();

 						fileOut.close();

						}catch(Exception e){

							throw (e);

					}

				}

	}