package data.org;

public class WordFactory extends DocumentFactory{
	public Document createDocument() {
        return new WordDocument();
    }
}
