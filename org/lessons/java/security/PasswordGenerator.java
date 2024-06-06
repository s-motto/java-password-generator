package org.lessons.java.security;
import java.util.Scanner;
public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input= new Scanner(System.in);
       //nome
       System.out.println("Inserisci il tuo nome");
       String nome= input.nextLine();
       //cognome
      System.out.println("Inserisci il tuo cognome");;
       String cognome= input.nextLine();
       //colore
       System.out.println("Inserisci il tuo colore preferito");
       String colore= input.nextLine();
       //data di nascita
       System.out.println("In quale giorno sei nato?");
       int giorno= input.nextInt();
       System.out.println("In quale mese sei nato?");
       int mese= input.nextInt();
       System.out.println("Quale è il tuo anno di nascita?");
       int anno= input.nextInt();
       //somma
       int somma=giorno+mese+anno;
       //password
System.out.println(nome+"-"+cognome+"-"+colore+"-"+somma);
	}

}
