public class Overload {
    public static void main(String[] args) {
        printData(fullName("Kasai", "Sirou"), 25);
        printData(fullName("Yamada", "Satou", "Tarou"), 30);  
    }
    
    public static void printData(String name, int age) {
        System.out.println("私の名前は" + name + "です");
        System.out.println("年齢は" + age + "歳です");
    }
    
    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static String fullName(String firstName, String middleName, String lastName) {
        return firstName + " " + middleName + " " + lastName;
    }
}