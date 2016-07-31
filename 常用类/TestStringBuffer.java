import java.io.*;
public class TestStringBuffer {
	public static void main(String[] args) {
		String separator = File.separator;
		String fileName = "myfile.txt";
		String directory = "mydir1" + separator + "mydir2";
		File f = new File(directory,fileName);
		if (f.exists()) {
			System.out.println("文件名：" + f.getAbsolutePath());
			System.out.println("文件大小：" + f.length());
		} else {
			f.getParentFile().mkdirs();
			try {
				f.createNewFile();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}


		File f1 = new File("/Users/Arthas/Desktop/Java Test/");
		// System.out.println("文件名：" + f1.getAbsolutePath());
		// for (int i = 0; i < f1.listFiles().length; i ++) {
		// 	File tmpF = f1.listFiles()[i];
		// 	System.out.println("文件名：" + tmpF.getName());

		// }
		enumFile(f1);
	}

	static void enumFile(File f) {
			try {
				for (int i = 0; i < f.listFiles().length; i ++) {
				 	enumFile(f.listFiles()[i]);				
				}
			} catch (NullPointerException ne) {
				System.out.println(f.getName());

				System.out.println("");
			}
	}



}