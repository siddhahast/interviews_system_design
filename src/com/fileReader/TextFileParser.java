package com.fileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TextFileParser implements FileReaderFacade{
	
	private String FILENAME_DELIMITER = "/";
	private String FILE_TEXT_DELIMITER = ",";
	
	@Override
	public void parseFile(FileObject fileObject) {
		
		File selectedFile = new File(fileObject.getPath() + FILENAME_DELIMITER + fileObject.getFilename());
		try {
			FileReader fileReader = new FileReader(selectedFile);
			BufferedReader br = new BufferedReader(fileReader);
			String line = null;
			String[] headers = br.readLine().split(FILE_TEXT_DELIMITER);
			while((line=br.readLine())!=null){
				Person person = preparePersonObject(line, headers);
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private Map<String, Object> preparePersonDataMap(String line, String[] headers) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		String[] lineData = line.split(FILE_TEXT_DELIMITER);
		for(int i=0;i<headers.length;i++){
			map.put(headers[i], lineData[i]);
		}
		return map;
	}
	
	private Person preparePersonObject(String line, String[] headers){
		Map<String, Object> map = preparePersonDataMap(line, headers);

		Person person = new Person();
		person.setId((Long) map.get("id"));
		person.setFirst_name((String) map.get("first_name"));
		person.setLast_name((String) map.get("last_name"));
		person.setPan((String) map.get("pan"));
		person.setPin((Integer) map.get("pincode"));
		
		return person;
	}

}
