public class Main {
    public static void main(String[] args) {
//task1
        System.out.println("task1");
        int monthSum = 0;
        int totalSum = 2_459_000;
        int month = 0;
        while (monthSum <= totalSum) {
            month++;
            monthSum = monthSum + monthSum / 100;
            monthSum = monthSum + 15_000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + monthSum + " рублей");
        }

//task2
        System.out.println("task2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number > 0; number--) {
            System.out.print(number + " ");
        }

//task3
        System.out.println();
        System.out.println("task3");
        int totalPopulation = 12_000_000;
        int birth = 17;
        int death = 8;
        int incrementYearPopulation = (1000 + birth - death) * 12_000 - totalPopulation;
        for (int year = 1; year <= 10; year++) {
            System.out.println("Год " + year + ", численность населения составляет " + (incrementYearPopulation * year + totalPopulation));
        }
//task4
        System.out.println("task4");
        int deposit = 15000;
        int incomeMonth = 0;
        month = 0;
        while (incomeMonth <= 12_000_000) {
            month = month + 1;
            incomeMonth = incomeMonth + (incomeMonth * 7) / 100;
            incomeMonth = incomeMonth + deposit;
            System.out.println("Месяц " + month + ", сумма накоплений " + incomeMonth);
        }
//task5
        System.out.println("task5");
        incomeMonth = 0;
        month = 0;
        while (incomeMonth <= 12_000_000) {
            month = month + 1;
            incomeMonth = incomeMonth + (incomeMonth * 7) / 100;
            incomeMonth = incomeMonth + deposit;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + incomeMonth);
            }
        }
//task6
        System.out.println("task6");
        incomeMonth = 0;
        month = 0;
        int nineYear = 9 * 12;
        while (month <= nineYear) {
            month = month + 1;
            incomeMonth = incomeMonth + (incomeMonth * 7) / 100;
            incomeMonth = incomeMonth + deposit;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + incomeMonth);
            }
        }
//task7
        System.out.println("task7");
        int friday = 3;
        for (int day = friday; day <= 31; day = day + 7) {
            System.out.println("Сегодня пятница " + day + "-ое число. Необходимо подготовить отчёт.");
        }
//task8
        System.out.println("task8");
        int yearNow = 2024;
        int yearBeforeNow = yearNow - 200;
        int yearAfterNow = yearNow + 100;
        for (int year = 0; year <= yearAfterNow; year = year + 79) {
            if (year >= yearBeforeNow && year <= yearAfterNow) {
                System.out.println(year);
            }
        }
    }
}