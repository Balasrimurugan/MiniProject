package com.configure;

import java.io.IOException;

public class FileReaderManager {
	
private FileReaderManager() {
	
}	
	
public static FileReaderManager getInstanceFRM() {
	FileReaderManager frm = new FileReaderManager();
	return frm;
}
	
	
public configurationreader getInstanceCR() throws IOException {
	
	configurationreader cr = new configurationreader();
	return cr;
}
	
	
}
