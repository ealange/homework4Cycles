public class Main {
    public static void main(String[] args) {
        //задача 1
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        // задача 2
        for (int firstFriday = 2, dayOfMonth = 1; dayOfMonth <= 31; dayOfMonth++) {
            if (firstFriday % 7 == dayOfMonth % 7) {
                System.out.println("Сегодня пятница, " + dayOfMonth + "-е число. Необходимо подготовить отчет.");
            }
        }
        // задача 3
        int cometYearBefore200=2022-200;
        int cometYearAfter100=2022+100;
        for (int cometYear=0; cometYear < cometYearAfter100; cometYear=cometYear+79){
            if( cometYear>cometYearBefore200&&cometYear<cometYearAfter100){
                System.out.println(cometYear);
            }
        }
    }
}