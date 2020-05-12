public class Return {
    public static void main(String[] args) {
        // fullNameメソッドの結果を変数name
        String name = fullName("Kasai", "Sirou");
        
        printData(name, 27);
        printData("Yamada Tarou", 35);
    }
    
    public static void printData(String name, int age) {
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    }
    
      // fullNameメソッドを定義
    public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
    }
}