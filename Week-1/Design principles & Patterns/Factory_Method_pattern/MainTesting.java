package data.org;

public class MainTesting {
	public static void main(String[] args) {
		DocumentFactory wf = new WordFactory();
		Document wordDocment = wf.createDocument()
;		wordDocment.open();

		DocumentFactory pf = new PdfFactory();
		Document pdfDocument= pf.createDocument();
		pdfDocument.open();
		
		DocumentFactory ed =new ExcelFactory();
		Document excelDocument= ed.createDocument();
		excelDocument.open();
		}
}


