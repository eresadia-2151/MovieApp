public class Bank {

    int amount;
    int balance;

    String name;


    //method overloading; this is when a method of the same name changes its signature i.e, parameters andf arguments

     int total(int amount){

         int MultiplyAmount=amount*amount;
        return amount;
    }
    int total(int amount,int balance){

        int MultiplyAmount=amount*balance;
        return amount;
    }
    int total(int amount,int balance, int x){
        int MultiplyAmount=amount*balance*x;
        return amount;
    }



}
