public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("  Задача 1");
     int age = 20;
     if (age >= 18) {
         System.out.println("Поздравляю с совершеннолетием!");
     } else {
              System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
     }

        //Задача 2
        System.out.println("  Задача 2");

          int humanStatus = 19;
     if (humanStatus >= 7 && humanStatus < 18) {
         System.out.println("Ты ходишь в школу");
     } else if (humanStatus >= 18 && humanStatus < 24) {
         System.out.println("Ты закончил школу и можешь отправляться в универитет.");
     } else {
         System.out.println("Ты окончил университет и пора искать первую работу.");
     }

        //Задача 3
        System.out.println("  Задача 3");

     int seatsOnTheBus = 83;
int seating = 60;
int capacity = 102;
     if (seatsOnTheBus < seating) {
         System.out.println("В автобусе есть места сидячие и стоячие.");
     } else if (seatsOnTheBus >= seating && seatsOnTheBus < capacity) {
         System.out.println("В автобусе есть только стоячие места.");
     } else {
         System.out.println("К сожалению, в автобусе нет мест.");
     }

       //Задание 1.блок 3.
        System.out.println("  Задание 1.блок 3.");

     int institution = 16;
     if (institution >= 2 && institution < 6) {
         System.out.println("Если возраст человека от 2 до 6, то ему нужно ходить в детский сад");
     } else if (institution >= 7 && institution < 18) {
         System.out.println("Если человеку от 7 до 18, то ему нужно ходить в школу");
     } else if (institution >= 18 && institution < 24) {
         System.out.println("Если человеку от 18 до 24, то его место в университете");
     } else {
         System.out.println("Если человеку больше 24, то ему нужно ходить на работу");
     }

    }
}