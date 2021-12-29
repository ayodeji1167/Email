import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String passWord;
    private String email;
    final static int passwordLength = 10;
    private String department ;
    private int mailBoxCapacity ;
    private String alternateEmail;
    final String companyName = "ganAndGarage";


    Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        department = getDepartment();
        passWord = getPassWord(passwordLength);
        email =  firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase()
                + "." + companyName.toLowerCase() + ".com";

        System.out.println("PASSWORD: " + passWord);


    }

    public String getDepartment(){
        Scanner input = new Scanner(System.in);

        System.out.println("WHAT'S YOUR DEPARTMENT?");
        System.out.println("1 for sales\n2 for development\n3 for accounting \n0 for none");
        int depChoice = input.nextInt();
        if(depChoice == 1)
            return "sales";
        else if(depChoice == 2)
            return "dev";
        else if(depChoice == 3)
            return "acc";

        else
            return "";

    }

    public String getPassWord(int length){
        String possibleCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789$#*&!";
        char[] ch = new char[length];
        for (int i = 0; i < ch.length; i++){
            int rand = (int) (Math.random() * possibleCharacters.length());

            ch[i] = possibleCharacters.charAt(rand);
        }
        return new String(ch);
    }

    public  void  setMailBoxCapacity(int capacity){
        mailBoxCapacity = capacity;

    }

    public  void setNewPassword(String newPassword){
        this.passWord = newPassword;
    }

    public  void setAlternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
    }

    public String getAlternateEmail(){
        return  alternateEmail;
    }

    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }

    public String getEmailInfo(){
        return "NAME: " + firstName + " " + lastName +
                "\nEMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailBoxCapacity + "mb";
    }

}
