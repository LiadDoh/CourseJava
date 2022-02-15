public class Main {
    public static void main(String[] args) {

        StudentAccount studentAccount = new StudentAccount(new Customer("John", "Doe", "0501234567", "sss"),
                1000,true,5);
        PrivateAccount privateAccount1 = new PrivateAccount(new Customer("John", "Doe", "0501234567", "sss"),
                1000,true);
        PrivateAccount privateAccount2 = new PrivateAccount(new Customer("John", "Doe", "0501234567", "sss"),
                1000,false);
        System.out.println(studentAccount.toString());
        System.out.println(studentAccount.getBalance());
        studentAccount.withdraw(500);
        System.out.println(studentAccount.getBalance());
        studentAccount.deposit(200);
        System.out.println(studentAccount.getBalance());
        System.out.println(privateAccount1.toString());
        System.out.println(privateAccount1.getBalance());
        privateAccount1.withdraw(500);
        System.out.println(privateAccount1.getBalance());
        privateAccount1.deposit(200);
        System.out.println(privateAccount1.getBalance());
        System.out.println(privateAccount2.toString());
        System.out.println(privateAccount2.getBalance());
        privateAccount2.withdraw(500);
        System.out.println(privateAccount2.getBalance());
        privateAccount2.deposit(200);
        System.out.println(privateAccount2.getBalance());

    }
}
