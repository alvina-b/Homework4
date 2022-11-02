public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("  Задача 1");
     int age = 20;
     if (age >= 18) {
         System.out.println("Поздравляю с совершеннолетием!");
     }
     if (age < 18) {
         System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
     }

        //Задача 2
        System.out.println("  Задача 2");

          int humanStatus = 19;
     if (humanStatus >= 7 && humanStatus < 18) {
         System.out.println("Ты ходишь в школу");
     }
         if (humanStatus >= 18 && humanStatus < 24) {
         System.out.println("Ты закончил школу и можешь отправляться в универитет.");
     }
         if (humanStatus >= 24) {
         System.out.println("Ты окончил университет и пора искать первую работу.");
     }

        //Задача 3
        System.out.println("  Задача 3");

     int seatsOnTheBus = 53;
     if (seatsOnTheBus < 60) {
         System.out.println("В автобусе есть места сидячие и стоячие.");
     }
     if (seatsOnTheBus >= 60 && seatsOnTheBus < 102) {
         System.out.println("В автобусе есть только стоячие места.");
     }
     if (seatsOnTheBus > 102) {
         System.out.println("К сожалению, в автобусе нет мест.");
     }
    }
}