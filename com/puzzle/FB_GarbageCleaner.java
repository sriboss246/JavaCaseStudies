
Bhawagni---91-9989423159


package coreJava;

import java.io.File;



public class FB_GarbageCleaner {
	

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

public static void main(String...arg){
	
	String path="C:\\Users\\B Sridhar\\Documents\\test";
	long thtime=1000*60;
	FB_GarbageCleaner fbg=new FB_GarbageCleaner();
	fbg.GCleaner(path,thtime);
	
	
	
}


}
