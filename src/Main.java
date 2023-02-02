public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        //task4();
        // task5();
        //task6();
        // task7();
    }
    public static void task1() {
        System.out.println("Задача 1"); // Код задачи 1
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");// задача 2
        int outdoorTemperature = 4;
        if (outdoorTemperature < 5) {
            System.out.println("На улице " + outdoorTemperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + outdoorTemperature + "  градусов, можно идти без шапки");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");// задача 3
        int speedDrivers = 70;
        if (speedDrivers > 60) {
            System.out.println("Если скорость " + speedDrivers + " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speedDrivers + " можно ездить спокойно.");
        }
    }
}