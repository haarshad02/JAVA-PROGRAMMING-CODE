import java.util.Scanner;
class BankApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username1 = null;
        String password1 = null;
        String address = null;
        long contact = 0;
        double balance = 0.0;

        for(; ;){
            System.out.println();
            System.out.println("************** WELCOME *************");
            System.out.println("          Laxmi Chit Funds          ");
            System.out.println();
            System.out.println("1. Existing User");
            System.out.println("2. Create Account");
            System.out.print("Enter an option : ");
            int opt= sc.nextInt();
            System.out.println();

            if(opt == 1){
                if(username1 == null){
                    System.out.println("Create your Account first !!");
                    continue;
                }
                System.out.println("Login");
                System.out.println();

                for(int i=3; i>=1; i--){
                    System.out.println();
                    System.out.print("Username : ");
                    String username = sc.next();
                    System.out.print("Password : ");
                    String password = sc.next();

                    if(username.equals(username1) && password.equals(password1)){
                        home:
                        for (; ;) {
                            System.out.println();
                            System.out.println("Home Page");
                            System.out.println();
                            System.out.println("1. Deposit");
                            System.out.println("2. Withdraw");
                            System.out.println("3. Check Balance");
                            System.out.println("4. Mini Statement");
                            System.out.println("5. Logout");
                            System.out.println();
                            System.out.print("Enter an Option : ");
                            int opt1 = sc.nextInt();

                            switch (opt1) {
                                case 1:{
                                    System.out.println();
                                    System.out.print("Enter the Amount : ");
                                    double amount = sc.nextDouble();
                                    balance += amount;
                                    System.out.println("Amount Deposited Successfully");
                                    break;
                                }

                                case 2:{
                                    System.out.println();
                                    System.out.println("Enter the Amount : ");
                                    double withdraw = sc.nextDouble();
                                    System.out.println("Enter the Pin : ");
                                    String pin = sc.next();

                                    if(pin.equals(password1)){
                                        if(withdraw <= balance){
                                            balance -= withdraw;
                                            System.out.println("Amount Withdrawn Successfully");
                                        }
                                        else{
                                            System.out.println("Insufficient Balance");
                                        }
                                    }
                                    else{
                                        System.out.println("Invalid Pin");
                                    }
                                    break;
                                }
                                
                                case 3:{
                                    System.out.println("Check Balance");
                                    System.out.println();
                                    for (int j = 3; j>=1; j--) {
                                        System.out.println();
                                        System.out.print("Enter the Pin : ");
                                        String password2 = sc.next();

                                        if(password2.equals(password1)){
                                            System.out.println("Account Balance : "+balance+"rs");
                                            continue home;
                                        }
                                        else{
                                            System.out.println("Invalid Pin");
                                            System.out.println("You have "+(j-1)+" attempts left");
                                        }
                                    }
                                    System.out.println("Your Account has been blocked for 24 Hours");
                                    System.exit(0);
                                    break;
                                }

                                case 4:{
                                    System.out.println("Mini Statement");
                                    break;
                                }
                                
                                case 5:{
                                    System.out.println("Thank u for using our App!!");
                                    System.out.println("Visit Again");
                                    System.exit(0);
                                }
                            }
                        }
                    }
                    else{
                        System.out.println("Invalid Password");
                        System.out.println("You have"+(i-1) +" attempts left");
                    }
                }
            }
            else if(opt == 2){
                System.out.println();
                System.out.println("Account Creation");
                System.out.print("Username : ");
                username1 = sc.next();
                System.out.print("Password : ");
                password1 = sc.next();
                System.out.print("Address : ");
                sc.nextLine();
                address = sc.nextLine();
                System.out.print("Contact : ");
                contact = sc.nextLong();
                System.out.print("Deposit Amount : ");
                balance = sc.nextDouble();
                System.out.println();
                System.out.println("Account Created Successfully");
            }
            else{
                System.out.println("Invalid Option");
            }
        }
    }
}