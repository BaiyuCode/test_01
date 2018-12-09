package bai;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class NewPushpackReader {
	public static void main(String[] args) {
		try(PushbackReader pr=new PushbackReader(new FileReader("E:\\workspace\\20180521\\src\\bai\\NewPushpackReader.java"),64);){
			char[] buf=new char[32];
			int hasRead=0;
			String lastContent="";
			while((hasRead=pr.read(buf))>0) {
				String content=new String(buf,0,hasRead);
				int index=0;
				if((index=(lastContent+content).indexOf("pr.read"))>0) {
					pr.unread((lastContent+content).toCharArray());
					if(index>32) {
						buf=new char[index];
					}
					pr.read(buf, 0, index);
					System.out.println(new String(buf,0,index));
					System.exit(-1);
				}else {
					lastContent=content;
				}
			}
		}
		catch(IOException io) {
			io.printStackTrace();
		}
	}
}
