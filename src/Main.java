import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Задание 1.1
        System.out.println("Задание 1.1");

        int goal = 2_459_000; //цель
        int deposit = 15_000; //
        int countMonth = 1;
        double percent = 0.12;
        int saving = 0;
        while (saving < goal) {
            saving+=deposit;
            if (countMonth %12 == 0) {
                saving+=saving*percent;
            }
            countMonth++;
        }
        System.out.println("Месяц " + countMonth + " ,  сумма накоплений равна " + saving + " рублей.");

        // Задание 1.2
        System.out.println("Задание 1.2");

        int i = 0;
        while ( i < 10 ) {
            i++;
            System.out.print(i+ " ");
        }
        System.out.println();

        for (int k = 10; k >= 1; k--) {
            System.out.print(k+ " ");
        }
        System.out.println();

        //Задание 1.3
        System.out.println("Задание 1.3");

        int population = 12_000_000;
        int birthRatePer1000 = 17;
        int mortalityPer1000 = 8;
        int populationGrowth = birthRatePer1000 - mortalityPer1000;
        for (int year = 1; year <= 10; year++) {
            population+=population*populationGrowth/1000;
            System.out.println("Год " +year+ " , численность населения составляет " +population);

        }


        //Задание 2.1
        System.out.println("Задание 2.1");

        int goalVasi = 12_000_000;
        int countMonthVasi = 1;
        double percentVasi = 0.07;
        int savingVasi = 15_000;
        for (; savingVasi < goalVasi; countMonthVasi++) {
            savingVasi+=savingVasi*percentVasi;
            System.out.println("За " + countMonthVasi + " месяцев, накопил " + savingVasi + " рублей.");
        }

        //Задание 2.2
        System.out.println("Задание 2.2");

        int goalVasi1 = 12_000_000;
        int countMonthVasi1 = 0;
        double percentVasi1 = 0.07;
        int savingVasi1 = 15_000;
        for (; savingVasi1 < goalVasi1; countMonthVasi1++) {
            savingVasi1+=savingVasi1*percentVasi1;
            if (countMonthVasi1 % 6 == 0) {
                System.out.println("За " + countMonthVasi1 + " месяцев, накопил " + savingVasi1 + " рублей.");
            }
        }

        //Задание 2.3
        System.out.println("Задание 2.3");

        int goalVasi2 = 12_000_000;
        int countMonthVasi2 = 1;
        double percentVasi2 = 0.07;
        int savingVasi2 = 15_000;
        for (; countMonthVasi2 <= 9*12; countMonthVasi2++) {
            savingVasi2+=savingVasi2*percentVasi2;
            if (countMonthVasi2 % 6 == 0) {
                System.out.println("За " + countMonthVasi2 + " месяцев, накопил " + savingVasi2 + " рублей.");
            }
        }

        //Задание 2.4
        System.out.println("Задание 2.4");

        int firstFriday = 5;
        for (int day = firstFriday; day <= 31; day+=7) {
            System.out.println("Сегодня пятница, " +day+ " -е число. Необходимо подготовить отчет." );
        }

        //Задание 3.1
        System.out.println("Задание 3.1");

        int year = 0;
        int nowYear = 2023;
        int startYear = nowYear - 200;
        int finishYear = nowYear + 100;
        int period =79;
        while (year <= finishYear) {
            if (year >= startYear) {
                System.out.println(year);
            }
            year += period;
        }

        //Задание 3.2
        System.out.println("Задание 3.2");

        int x = 2;
        for (int y = 1; y <= 10; y++) {
            System.out.println(x + " * " + y + " = " + x * y);
        }
    }
}