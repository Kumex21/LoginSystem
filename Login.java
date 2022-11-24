import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        ArrayList<String> DataBase = new ArrayList<String>();
        Scanner scann = new Scanner(System.in);
        String Username;
        System.out.println("Enter Username: ");
        Username = scann.nextLine();
        String Password;
        System.out.println("Enter Password: ");
        Password = scann.nextLine();

        switch (Username){
            case "Aivis Krūmiņš":
                if("riepa123".equals(Password)) {
                    System.out.println("Laipni lūgts Aivi");
                    break;
                }
                else {
                    System.out.println("Nav pareizs lietotāja vārds vai parole");
                    System.exit(0);
                }
            case "Dana Doniņa":
                if("koks123".equals(Password)) {
                    System.out.println("Laipni lūgta Dana");
                    break;
                }
                else {
                    System.out.println("Nav pareizs lietotāja vārds vai parole");
                    System.exit(0);
                }
            case "Alvis Krūmiņš":
                if("klans123".equals(Password)) {
                    System.out.println("Laipni lūgts Alvi");
                    break;
                }
                else {
                    System.out.println("Nav pareizs lietotāja vārds vai parole");
                }
        }
        DataBase.add(Username);
        DataBase.add(Password);


        System.out.println(DataBase);

    }
}