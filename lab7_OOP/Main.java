package iot.banks;

public class Main {

    public static void main(String[] args){
        Bank noNameBank = new Bank();
        System.out.println(noNameBank);
        Bank privateBank = new Bank("PrivateBank","National", 10000000, 5000000);
        System.out.println(privateBank);
        Bank monoBank = new Bank("MonoBank", "Private", 7500000, 3500000, 50000000, 40000000, 10000000, 5000000,
                "Ukraine", 6520000);
        System.out.println(monoBank);
        monoBank.printStaticDateOfFoundation();
    }
}
