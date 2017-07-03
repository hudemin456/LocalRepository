package util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import entity.CountResultDetails;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ToExcelDao {
	public void printToExcel(List<CountResultDetails> list, OutputStream ow) {
		try {
			WritableWorkbook book = Workbook.createWorkbook(ow);
			
			WritableSheet sheet = book.createSheet("部门月度统计报表", 0);
			
			String[] titles = { "编号","报销人","报销总额","年份","月份","部门" };
			
			for (int i = 0; i < titles.length; i++) {
				Label label = new Label(i, 0, titles[i]);
				sheet.addCell(label);
			}

			for (int j = 0; j < list.size(); j++) {
				CountResultDetails c = list.get(j);

				String[] cellContents = { String.valueOf(c.getId()),
						c.getName(), String.valueOf(c.getMoney()),
						String.valueOf(c.getYear()),
						String.valueOf(c.getMonth()), c.getPositionName() };
				for (int i = 0; i < cellContents.length; i++) {
					Label label = new Label(i, j + 1, cellContents[i]);
					sheet.addCell(label);
				}
			}
			
			book.write();
			
			book.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RowsExceededException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (WriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
