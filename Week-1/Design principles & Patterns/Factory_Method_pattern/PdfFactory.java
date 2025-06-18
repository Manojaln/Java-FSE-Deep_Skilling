package data.org;

public class PdfFactory extends DocumentFactory{
	public Document createDocument() {
		return new PdfDocument();
	}
}
