import java.util.Scanner;
class BankUser{
   private String name;
    private String idnumber;
    private int totalamount;
    public BankUser(){
        name="";
        idnumber="";
        totalamount=0;
    }
    public void setamount(int a){
        totalamount = a;
    }
    public void setname(String b){
        name = b;
    }
    public void setid(String c){
        idnumber = c;
    }
    public int getamount(){
        return totalamount;
    }
    public String getname(){
        return name;
    }
    public String getid(){
        return idnumber;
    }
    public void addamount(int add){
        totalamount+=add;
    }
    public void deductamount(int deduct){
        totalamount-=deduct;
    }
    
}
public class bank{
    public static void main(String[] args){
        System.out.println("======================");
        Scanner inputinfo = new Scanner(System.in);
        System.out.println("Welcome to Maze Bank please enter your name: ");
        String customername = inputinfo.nextLine();
        BankUser First = new BankUser();
        First.setname(customername);
        System.out.println("Please enter your ID name: ");
        String customerid = inputinfo.nextLine();
        First.setid(customerid);
        System.out.println("Welcome "+First.getname());
        System.out.println("Your id is "+ First.getid());
        char option;
        do{
            System.out.print("\n\n A)Check Balance\n B)Deposit \n C)Withdraw\n D)Exit \n ");
            System.out.println("======================");
            System.out.println("Enter an Option");
            System.out.println("======================");
            option = inputinfo.next().charAt(0);
            if(option=='A'){
                System.out.println("Your current balance is $"+ First.getamount());
            }else if (option == 'B'){
                System.out.println("How much do you want to deposit: ");
                int depo = inputinfo.nextInt();
                First.addamount(depo);
                System.out.println("You Deposited "+depo);
                System.out.println("You total balance: $"+ First.getamount());
            }else if (option=='C'){
                System.out.println("How much do you want to witdraw: ");
                int dedu = inputinfo.nextInt();
                First.deductamount(dedu);
                System.out.println("You Withdraw "+dedu);
                System.out.println("You total balance: $"+ First.getamount());
            }else if (option=='D'){
                
            }
            else{
                System.out.println("Invalid input enter A, B or C");
            }
        }
        while (option !='D');
           System.out.println("Thanks for using Maze Bank Come Back Again");
           inputinfo.close();

        




    }

}
