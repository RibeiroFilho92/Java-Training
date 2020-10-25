package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import Entitites.User;

public class Application {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\Ribeiro\\Documents\\Nova pasta\\inpfile.txt";
		Set<User> users = new HashSet<>();
		
		 try (BufferedReader br = new BufferedReader(new FileReader (path))) {
			 
			 String line = br.readLine();
			 while (line != null) {
				 String[] spliting = line.split(" ");
				 String name = spliting[0];
				 Date date = Date.from(Instant.parse(spliting[1]));
				 
				 users.add(new User(name, date));
				 
				 line = br.readLine();
			 }
			 
			 System.out.print("Total users until now: " + users.size());
			 
		 }
		 catch (IOException e) {
			 e.printStackTrace();
		 }

	}

}
