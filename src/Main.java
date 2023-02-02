public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
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
        System.out.println("Задача 2");// Код задачи 2
        int outdoorTemperature = 4;
        if (outdoorTemperature < 5) {
            System.out.println("На улице " + outdoorTemperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + outdoorTemperature + "  градусов, можно идти без шапки");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");//Код задачи 3
        int speedDrivers = 70;
        if (speedDrivers > 60) {
            System.out.println("Если скорость " + speedDrivers + " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speedDrivers + " можно ездить спокойно.");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");// Код задачи 4
        int age = 25;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        } else {
            if (age >= 7 && age <= 18) {
                System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
            } else {
                if (age > 18 && age < 24) {
                    System.out.println("Если возраст человека равен " + age + " то его место в универитете");
                } else {
                    if (age >= 24) {
                        System.out.println("Если возраст человека равен " + age + " то ему пора ходить на работу");
                    }
                }
            }
        }
    }
    public static void task5() {
        System.out.println("Задача 5");// Код задачи 5
        int ageOfTheChild = 14;
        boolean childsParents = false;
        if (ageOfTheChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageOfTheChild + " то он не может кататься на атракционе");
        } else {
            if (ageOfTheChild >= 5 && ageOfTheChild < 14) {
                System.out.println("Если возраст ребенка равен " + ageOfTheChild + " то он может кататься только в сопровождении взрослого");
            } else {
                if (childsParents) {
                    System.out.println("Если нет взрослого " + childsParents + " то кататься нельзя");
                } else {
                    if (ageOfTheChild >= 14) {
                        System.out.println("Если возраст ребенка старше " + ageOfTheChild + " то он может кататься без сопровождения взрослого");
                    }
                }
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6");// Код задачи 6
        int carCapacity = 102; //общее число мест
        int numberOfSeats = 60;// сидячие места
        int numberOfStandingPlaces = carCapacity - numberOfSeats;//стоячие места
        int occupiedSeats = 60;
        int availableSeats = 30;
        if (occupiedSeats < numberOfSeats) {
            System.out.println("Еще есть " + (numberOfStandingPlaces - occupiedSeats) + " сидячих мест");
        } else {
            System.out.println("Сидячих мест нет");
        }
        if (availableSeats < numberOfStandingPlaces) {
            System.out.println("Еще есть " + (numberOfStandingPlaces - availableSeats) + " стоячих мест");
        } else {
            System.out.println(" Стоячих мест нет");
        }
    }
    public static void task7() {
        System.out.println("Задача 7"); //Код задачи 7
        int one = 2;
        int two = 8;
        int three = 9;
        if (one > two && one > three) {
            System.out.println("Большее чило " + one);
        } else {
            if (two > three) {
                System.out.println("Большее чило " + two);
            } else {
                System.out.println("Большее число " + three);
            }
        }
    }
}