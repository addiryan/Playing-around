package contacts;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.List;

public class Main {
    List<Record> records = new ArrayList<Record>();

    public static void main(String[] args) {
        Main phoneBook = new Main();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter action (add, remove, edit, count, list, exit)");
            String action = scanner.nextLine();

            if (action.equals("count")){
                System.out.println("The Phone Book has " + phoneBook.records.size() + " records.");
            }
            else if(action.equals("add")){
                phoneBook.addRecord(scanner);

            }
            else if(action.equals("remove")) {
                phoneBook.removeRecord(scanner);

            }
            else if(action.equals("edit")){
                phoneBook.editRecord(scanner);
            }
            else if(action.equals("list")){
                phoneBook.listRecords();
            }
            else if(action.equals("exit")){
                break;
            }
        }
    }

    private void addRecord(Scanner scanner){
        System.out.println("Enter the name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter the surname: ");
        String surname = scanner.nextLine();
        System.out.println("Enter the number: ");
        String number = scanner.nextLine();

        Record newRecord = new Record();
        newRecord.setFirstName(firstName);
        newRecord.setSurName(surname);
        newRecord.setPhoneNumber(number);
        this.records.add(newRecord);
        System.out.println("The record added.");

    }

    private void removeRecord(Scanner scanner){
        if (this.records.size()>0){
            this.listRecords();
            System.out.println("Select a record:");
            String chozenRecord = scanner.nextLine();
            this.records.remove(Integer.parseInt(chozenRecord) - 1);
            System.out.println("The record removed!");

        }
        else{
            System.out.println("No records to remove!");
        }
    }

    private void editRecord(Scanner scanner){
        if (this.records.size() > 0){
            this.listRecords();
            System.out.println("Select a record:");
            String chozenRecord = scanner.nextLine();
            System.out.println("Select a field: (name, surname, number)");
            String chozenField = scanner.nextLine();
            Record record = this.records.get(Integer.parseInt(chozenRecord) - 1);
            Integer recordIndex = this.records.indexOf(record);

            if (chozenField.equals("number")){
                System.out.println("Enter number: ");
                String number = scanner.nextLine();
                record.setPhoneNumber(number);
            }
            else if (chozenField.equals("name")){
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                record.setFirstName(name);

            }
            else if (chozenField.equals("surname")){
                System.out.println("Enter surname: ");
                String surname = scanner.nextLine();
                record.setSurName(surname);
            }
            else {
                System.out.println("No such field!");
            }
            System.out.println("The record updated!");
            this.records.set(recordIndex, record);


        }
        else{
            System.out.println("No records to edit!");
        }
    }

    private void listRecords(){
        if (this.records.size()==0){
            System.out.println("No records registered.");
            return;
        }
        for(int i =0; i < this.records.size(); i++){
            System.out.println((i+1) + ". " + this.records.get(i).getFirstName() + " "+ this.records.get(i).getSurName() + ", " +this.records.get(i).getPhoneNumber());
        }
    }
    }

class Record {
    private String firstName;
    private String surName;
    private String phoneNumber;

    public Record(){
        this.firstName = "";
        this.surName = "";
        this.phoneNumber = "[no number]";
    }



    private Boolean isValidNumber(String phoneNumber){
        Pattern pattern = Pattern.compile( "^(?:[\\+]?|\\w{2,})(?:\\(\\w{2,}\\)([\\-\\s][\\w]{2,})*$|\\w{2,}([\\-\\s][\\w]{2,})*$|\\w{2,}[\\-\\s]\\([\\w]{2,}\\)([\\-\\s]\\w*)*$)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.find()){
            return true;
        }
        else{
            return false;
        }

    }

    public Boolean hasNumber(){
        if (this.phoneNumber !="[No Number]"){
            return true;
        }
        else{
            return false;
        }
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getSurName(){
        return this.surName;
    }

    public void setSurName(String surName){
        this.surName = surName;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;

    }

    public void setPhoneNumber(String phoneNumber){
        if (isValidNumber(phoneNumber)){
            this.phoneNumber = phoneNumber;
        }
        else{
            System.out.println("Wrong number format!");
            this.phoneNumber = "[no number]";

        }

    }



}