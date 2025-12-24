import java.io.*;

class FileHandling1{
	
	static void basicFileMethods() throws Exception{
		
		
	}
	public static void main(String[] args) throws Exception{
		
		File f  = new File("name.txt");
		System.out.println("File Exist "+ f.exists());
		System.out.println("File Exist "+ f.getAbsolutePath());
		System.out.println("File Exist "+ f.getName());
		System.out.println("File Exist "+ f.getParent());
		System.out.println("File Exist "+ f.canRead());
	
	
	FileWriter fw = new FileWriter("name.txt");
	fw.write("this is file handling ");
	fw.close();
	
	FileReader fr =  new FileReader("name.txt");
	int ch;
	while((ch = fr.read()) != -1){
		System.out.print((char)ch);
	}
	fr.close();
	
	
	// copy file
	
//	FileInputStream fis = FileInputStream("name.txt");
//	FileOutputStream fos = new FileOutputStream("namecopy.txt");
//	int ch2;
//	while((ch = fis.read()) != -1){
//		
//		fos.write(ch2);
//	}
//	fis.close();
//	fos.close();
//	
//	
//	// Buffer Reader
//	
//	BufferReader br = new BufferReader(new FileReader("name.txt"));
//	String line;
//	while((line = br.readLine()) != null){
//		
//		System.out.println(line);
//	}
//	br.close();
}
}