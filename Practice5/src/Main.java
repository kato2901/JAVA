// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
        Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0);

        Car car = new Car("フェラーリ", "赤");
        // car.setOwner(person1);
        // car.setName("フェラーリ");
        // car.setColor("赤");

        Bicycle bicycle = new Bicycle("ビアンキ", "緑");
        // bicycle.setOwner(person2);
        // bicycle.setName("ビアンキ");
        // bicycle.setColor("緑");

        // buyメソッドを用いて、person1にcarを購入
        person1.buy(car);
        
        // buyメソッドを用いて、person2にbicycleを購入
        person2.buy(bicycle);

        System.out.println("【車の情報】");
        car.printData();

        System.out.println("-----------------");
        System.out.println("【車の所有者の情報】");
        car.getOwner().printData();
        // System.out.print("走る距離を入力してください：");
        // int carDistance = scanner.nextInt();
        // car.run(carDistance);

        // System.out.println("-----------------");
        // System.out.print("給油する量を入力してください：");
        // int litre = scanner.nextInt();
        // car.charge(litre);

        System.out.println("=================");
        System.out.println("【自転車の情報】");
        bicycle.printData();

        System.out.println("-----------------");
        System.out.println("【自転車の所有者の情報】");
        bicycle.getOwner().printData();
        // System.out.print("走る距離を入力してください：");
        // int bicycleDistance = scanner.nextInt();
        // bicycle.run(bicycleDistance);
        // scanner.close();
    }
}