package week3.src;

public class week3 {
    public static void main(String[] args) throws Exception {
        /*
         * Class ---> Class is a blueprint of an object. Object ---> (real life) a
         * physical entity that you can touch --> name: Monitor --> properties: size,
         * colour, brand --> functionality/behaviour: On() Off()
         * 
         * Object (in programming) ---> object in programming doesn not need to be a
         * physical entity (bank account) --> name: BankAccount --> properties: Balance,
         * acc_type, branch, acc_holder --> functionality: withdraw(), deposit()
         */

        // BankAccount acc1 = new BankAccount();

        // acc1.accHolder = "Gil";
        // acc1.balance = 10000;
        // acc1.bank = "TD";
        // acc1.type = "chequing";

        // string representation of an object (toString())
        // each class you create inherits a couple of functions from class object.
        // System.out.println(acc1);
        // System.out.println(acc1.toString()); // this is the same as above ^
        // System.out.println(acc1.hashCode());
        // System.out.println(Integer.toHexString(acc1.hashCode()));

        BankAccount acc1 = new BankAccount(1000, "Chequing", "TD", "Gil D");
        BankAccount acc2 = new BankAccount(10000, "Savings", "CIBC", "Alex");
        BankAccount acc3 = new BankAccount("TD", "Elfred");

        BankAccount[] acc = { acc1, acc2, acc3, new BankAccount(3000, "Savings", "ScotiaBank", "Joe") };

        System.out.println("------------Bank Accounts-------------\n");

        for (BankAccount bankAccount : acc) {
            System.out.println(bankAccount);
        }

        System.out.println("---------------------------------------");
        Students[] std = {

                new Students(100000, "Gil Dobrovinsky", new double[] { 89, 98, 100, 67, 89, 56 }),

                new Students(123045, "John Doe", new double[] { 89, 98, 100, 67, 89, 56 }),

                new Students(103240, "Jane Doe", new double[] { 89, 98, 100, 67, 89, 56 }),

                new Students(149394, "Sam Smith", new double[] { 89, 98, 100, 67, 89, 56 }) };

        for (Students student : std) {
            System.out.println(student);
        }

        // BankAccount [] accounts = new BankAccount[100];
        // accounts[0] = new BankAccount(3000, "savings", "RBC", "Joe");

        // System.out.println(acc2.getBalance());
        // ;
        // acc2.withdraw(200);
        // System.out.println(acc2.toString());
        // System.out.println(acc1);
        // System.out.println(acc3);

    }
}
