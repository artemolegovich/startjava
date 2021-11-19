public class Variables {

    public static void main (String[] args) {
        // инициализируем переменные различных типов
        byte cpuCoreNumber = 6;
        short cpuThreadNumber = 12;
        int cpuClockRateMHz = 3000;
        long ramMB = 16384;
        float screenSize = 16.1F;
        double weightInKg = 1.74;
        char cpuSeries = '4';
        boolean isItLaptop = true;
        // выводим значения переменных в консоль
        System.out.println("Характеристики компьютера:");
        System.out.println();
        System.out.println("Количество ядер процессора: " + cpuCoreNumber);
        System.out.println("Количество потоков: " + cpuThreadNumber);
        System.out.println("Тактовая частота процессора, МГц: " + cpuClockRateMHz);
        System.out.println("Объём оперативной памяти, МБ: " + ramMB);
        System.out.println("Размер экрана, дюйм: " + screenSize);
        System.out.println("Вес, кг: " + weightInKg);
        System.out.println("Поколение процессора: " + cpuSeries);
        /* задаем условие для определения типа компьютера, исходя из значения
        переменной типа boolean и выводим результат в консоль*/
        if (isItLaptop) {
            System.out.println("Это ноутбук.");
        } else {
            System.out.println("Это стационарный компьютер.");
        }
    }
}