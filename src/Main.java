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
     } else if (humanStatus >= 24) {
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

     int ageMan = 21;
          if (ageMan >= 2 && ageMan < 6) {
         System.out.println("Если возраст человека " + ageMan + ", то ему нужно ходить в детский сад");
     } else if (ageMan >= 7 && ageMan < 18) {
         System.out.println("Если человеку " + ageMan + ", то ему нужно ходить в школу");
     } else if (ageMan >= 18 && ageMan < 24) {
         System.out.println("Если человеку " + ageMan + ", то его место в университете");
     } else if (ageMan >=24) {
         System.out.println("Если человеку " + ageMan + ", то ему нужно ходить на работу");
     }

     //Задание 2. блок 3
        System.out.println("  Задание 2. блок 3");
     int ageKid = 15;
         if (ageKid < 5) {
         System.out.println("Ты не можешь кататься на аттракционе.");
     } else if (ageKid < 14) {
         System.out.println("Ты можешь кататься в сопровождении взрослого.");
          } else {
            System.out.println("Ты можешь кататься без сопровождения взрослого");
        }

        //Задание 2. блок 3
        System.out.println("  Задание 2. блок 3");
     int one = 2;
     int two = 3;
     int three = 1;
     if (one > two && one > three) {
         System.out.println("Число ONE - самое большое");
     } else if (two > one && two > three) {
         System.out.println("Число TWO - самое большое");
     } else if (three > two && three > one) {
         System.out.println("Число THREE - самое большое");
     }
    }
}