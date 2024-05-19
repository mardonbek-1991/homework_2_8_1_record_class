package uz.pdp;

public class Main {
    public static void main(String[] args) {

        RecordClass recordClass = new RecordClass("How to make friends", "Deyl Karnegy", 150.5);
        System.out.println(recordClass);

        RecordClass recordClass2 = new RecordClass(null, "Deyl Karnegy", 150.5);
        System.out.println(recordClass2);

        RecordClass recordClass3 = new RecordClass("", "Deyl Karnegy", 150.5);
        System.out.println(recordClass3);

        RecordClass recordClass4 = new RecordClass("How to make friends", "Deyl Karnegy", -150.5);
        System.out.println(recordClass4);


    }

}
