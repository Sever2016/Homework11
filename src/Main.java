import java.time.LocalDate;

public class Main {
    public static void cheakYear(int year) {
        if (year % 4 == 0 && year % 400 == 0 && year >= 1584) {
            System.out.println(year + " год является високосным");
        } else if (year % 4 == 0 && year % 100 != 0 && year >= 1584) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void chooseVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
        } else if (clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        }
    }

    public static int calculateDeliveryTime(int deliveryDistance) {
        if (deliveryDistance >= 100) {
            return -1;
        } else if (deliveryDistance >= 60) {
            return 3;
        } else if (deliveryDistance >= 20) {
            return 2;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        //Задача 1
        int year = 2021;
        cheakYear(year);
        //Задача 2
        int clientOS = 1;
        int clientDeviceYear = 2023;
        chooseVersion(clientOS, clientDeviceYear);
        //Задача 3
        int deliveryDistance = 89;
        switch (calculateDeliveryTime(deliveryDistance)) {
            case -1:
                System.out.println("Доставка не осуществляется");
                break;
            case 1:
                System.out.println("Доставка займёт 1 день");
                break;
            case 2:
                System.out.println("Доставка займёт 2 дня");
                break;
            case 3:
                System.out.println("Доставка займёт 3 дня");
                break;
        }
    }
}