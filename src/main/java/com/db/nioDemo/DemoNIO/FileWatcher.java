package com.db.nioDemo.DemoNIO;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileStoreAttributeView;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class FileWatcher 
{
    public static void main( String[] args ) throws Exception{
    	
    	System.out.println(Integer.parseInt("abcd"));
    	
    	/*Object o = new Object();
    	synchronized ("sanjay") {
			o.wait();
			o.notify();
			
		}*/
}

	public static void watcher() throws Exception {/*
		
		
		short a =2;
		int i =a;
		System.out.println(a+1);
		
		
		Double d1 = new Double("2.0");
		Double d2 = new Double("2.00");
		BigDecimal bd1 = new BigDecimal("2.0");
		BigDecimal bd2 = new BigDecimal("2.00");
		
		System.out.println(d1.equals(d2) + ""+bd1.equals(bd2));
		
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		System.out.println(nf.parse("123.123sdaas"));
		
		Path file_dir = Paths.get("S:\\FileWatcher");

		System.out.println("File Watcher Started....");

		try {
			WatchService watcher = file_dir.getFileSystem().newWatchService();
			file_dir.register(watcher, StandardWatchEventKinds.ENTRY_CREATE);
			WatchKey watchKey = watcher.take();
			List<WatchEvent<?>> events = watchKey.pollEvents();
			for (WatchEvent<?> event : events) {
				System.out.println("Someone Just Created the File " + event.context().toString());
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		watcher();
		
		Path filePath = Paths.get("S:/FileWatcher/testingFile.pdf");
		Files.deleteIfExists(filePath);
		Files.createFile(filePath);
	*/}
}
