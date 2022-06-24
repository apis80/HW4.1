public class Main {
    public static void main(String[] args) {
        // Задача 1
        int i = 0;
        while ( i < 10) {
            System.out.print (++i + ",");
        }
            System.out.println ();

       for (int x = 10; x>0; x-- ) {
           System.out.print ( x +",");
       }
        System.out.println();

        // Задача 2
       for (int y=3; y<=31; y=y+7) {
           System.out.println("Сегодня пятница," +y+ "е число. Необходимо подготовить отчет.");

       }
       // Задача 3
        int year = 2022;
        int yearBefore = year - 200;
        int yearComet = 0;
        do {
            if (yearComet >= yearBefore && yearComet <= year) {
                System.out.println(yearComet);
            }
            yearComet += 79;
        } while (yearComet <= year);
        System.out.println(yearComet);



    }
}