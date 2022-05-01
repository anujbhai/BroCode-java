import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		File file = new File("secret_message.txt");

		if(file.exists()) {
			System.out.println("That file exists! :o!");
			System.out.println("File is here: " + file.getPath());
			System.out.println("Absolutely here: " + file.getAbsolutePath());
		} else {
			System.out.println("That file doesn't exist :(");
		}

		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Roses are red \nViolets are blue \n Booty booty booty booty\nRockin' everywhere!");
			writer.append("\n(a poem by bro..)");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
