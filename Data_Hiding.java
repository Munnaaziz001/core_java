//////Encapsulations
////class Encaps {
////    private int a;
////    private String alpha;
////    public Encaps(int a, String alpha)
////    {
////        this.a = a;
////        this.alpha = alpha;
////        if (a < 10)
////        {
////            System.out.println("valid rollNo");
////        }
////        else
////        {
////            System.out.println("Invalidvalid rollNo");
////        }
////    }
////    public void display()
////    {
////        System.out.println("RollNO = "+a);
////        System.out.println("Name of Student = "+alpha);
////
////    }
////
////    public static void main(String[] args) {
////        Encaps m = new Encaps(8,"Munnaaziz");
////        m.display();
////    }
////}
//// Encapsulation using accessor and Mutators
//public class Encaps {
//    private int age;
//    private String name;
//
//    public Encaps(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//    public String getName()
//    {
//        return name;
//    }
//
//     public void setName(String name) {
//         this.name = name;
//     }
//     public void setAge(int age)
//     {
//         if(age >= 18)
//         {
//             this.age = age;
//
//         }
//         else
//         {
//             System.out.println("you are a child sorry!!");
//         }
//     }
//
//    public static void main(String[] args) {
//        Encaps encaps = new Encaps(17,"Ram_Aashish");
//        System.out.println(encaps.getAge());
//        System.out.println(encaps.getName());
//        System.out.println("-------------------------------------------");
//        encaps.setAge(32);
//        encaps.setName("Ram_lal");
//        System.out.println("After update the data: ");
//        System.out.println(encaps.getAge());
//        System.out.println(encaps.getName());
//
//    }
//}
//Encapsulation, By using data Hiding :
public class Data_Hiding {
    private double balance;
    public Data_Hiding(double initial_balance)
    {
        if(initial_balance >0)
        balance = initial_balance;

    }
    //Accessor method for balance
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public void deposit(double amount)
    {
        if( amount > 0)
        balance = balance + amount;
    }
    public void withdraw(double amount)
    {
        if (amount <= balance  && amount > 0)
            balance -= amount;
    }
    public static void main(String arg[]){
        Data_Hiding dataHiding  = new Data_Hiding(1000);
        System.out.println("INITIAL_BALANCE: "+dataHiding.getBalance());

        dataHiding.deposit(500);
        System.out.println("Balance after depsoit"+dataHiding.getBalance());

        dataHiding.withdraw(700);
        System.out.println("Balance after withdraw: "+ dataHiding.getBalance());


    }
}
