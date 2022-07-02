



package com.utility;

import java.io.*;
import java.util.Properties;


public class GarbageFileNotifier {
	

public int GCleaner(String path,long threshold_time)
{
	
	File dir=new File(path);
	File[] fileList=dir.listFiles();
	long sysTime=System.currentTimeMillis();
	long fileTime;
	for(File file:fileList){
		
		fileTime=sysTime-file.lastModified();
		if(fileTime>threshold_time){
			
			System.out.println(file.getName()+"   can be deleted....");
		}
	}
	
return 0;
}

public static void main(String...arg) throws IOException {

	Properties props= new Properties();
	props.load(new FileInputStream("//config//garbageCleanerConfig.properties"));
	String path=props.getProperty("garbageCleaner.dir.path");
	long thtime=1000*60;
	GarbageFileNotifier fbg=new GarbageFileNotifier();
	fbg.GCleaner(path,thtime);
	
	
	
}


}
