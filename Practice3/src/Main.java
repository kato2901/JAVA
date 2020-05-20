public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("sotou", "tarou", 25, 1.7, 55.0, "医者");
        person1.printData();

        Person person2 = new Person("yamamoto", "d", "tarou", 30, 1.85, 75.0, "教師");
        person2.printData();
        System.out.println("----------------------------");

        person1.setJob("獣医");

        System.out.println("person1の仕事を" + person1.getJob() + "に変更しました");
        person1.printData();
        Person.printCount();

    }
}