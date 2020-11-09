package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		File file = new File("File\\exemplo.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		}catch(FileNotFoundException e){
			System.out.println("Arquivo nao encontrado");
		}
		finally {
			if(sc!=null) {
				sc.close();
				System.out.println("Finally executado");
				e.printStackTrace();//sequencias de chamadas que gerou a excecao
				
			}
		}
	}

}
