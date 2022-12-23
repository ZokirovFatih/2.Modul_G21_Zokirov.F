import model.User;
import service.AuthService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInt=new Scanner(System.in);
        Scanner scannerStr=new Scanner(System.in);

        AuthService authService=new AuthService();

        //Vaqtinchalik admini kaliti
        String adminPassword="03090309";

        int a=100;
        while (a!=0){
            System.out.println("1) Registration");
            System.out.println("2) Login");
            System.out.print("-> ");
            a=scannerInt.nextInt();
            switch (a){
                case 1->{
                    System.out.print("Name: ");
                    String name=scannerStr.nextLine();
                    System.out.print("User Name: ");
                    String userName=scannerStr.nextLine();
                    System.out.print("Password: ");
                    String password=scannerStr.nextLine();
                    System.out.println(authService.addUser(name, userName, password));
                }
                case 2->{
                    int b=0;
                    switch (b){
                        case 1->{
                            System.out.println("User Name");
                            String userName = scannerStr.nextLine();
                            System.out.print("Password: ");
                            String password = scannerStr.nextLine();
                            if (authService.Login(userName, password) == null) {
                                System.out.println("Error !!!");
                            } else {
                                System.out.println("Welcome to the academy !");
                            }
                        }

                        case 2-> {
                            System.out.println("User Name");
                            String userName = scannerStr.nextLine();
                            System.out.print("Password: ");
                            String password = scannerStr.nextLine();
                            if (authService.Login(userName, password) == null) {
                                System.out.println("Error !!!");
                            } else {
                                int d=100;
                                while (d!=0){
                                    System.out.println("1) Gruppaga odam qoshish");
                                    System.out.println("2) Group");
                                    System.out.print("->");
                                    d=scannerInt.nextInt();
                                    switch (d){
                                        case 1->{

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}