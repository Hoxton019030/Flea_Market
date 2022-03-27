package tw.com.eeit.test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		File f = new File(
				"C:\\Users\\user\\Documents\\Java\\workspace\\ServletWrokspace\\ServletHomework\\src\\main\\webapp\\image");

		List<String> fileList = Arrays.asList(f.list());

		for (String s : fileList) {

			if (s.toLowerCase().contains("g.")) {
				System.out.println(s);
			}
		}

		System.out.println();

	}

}
