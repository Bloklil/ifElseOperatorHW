import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
short age = 18;
if ( age >= 18 ) {
    System.out.println("Совершеннолетний");
} else {
    System.out.println("Ты не достиг совершеннолетия");
}

        System.out.println("Задание 2");
short outdoorTemperature = 5;
if ( outdoorTemperature <=5) {
    System.out.println( "На улице " +outdoorTemperature+ " градусов. Нужно надеть шапку, да и вообще теплее одеться.");
} else {
    System.out.println( "На улице " +outdoorTemperature+ " градусов, можно идти без шапки, тепло.");
}

        System.out.println("Задание 3");
short speedCar = 61;
if ( speedCar >60 ) {
    System.out.println( "Если ваша скорость " +speedCar+ " км/ч, вам придётся заплатить штраф");
} else {
    System.out.println("Ваша скорость " +speedCar+ " км/ч, ширафа нет");
}

        System.out.println("Задание 4");
short agePipl = 45;
if (agePipl >= 2 && agePipl <= 6) {
    System.out.println("Если возраст человека " +agePipl+ " лет/года, то нужно ходить в садик");
} else if ( agePipl >= 7 && agePipl <= 17) {
    System.out.println("Вам " +agePipl+ " лет, нужно ходить в школу");
        } else if (agePipl >= 18 && agePipl <= 24) {
    System.out.println( "Вам " +agePipl+ " (лет/года), нужно ходить в университет");
        } else {
    System.out.println( "Вам " +agePipl+ " (года/лет), пора начать ходить на работу");
        }

        System.out.println("Задание 5");
short ageKids = 15;
if ( ageKids < 5) {
    System.out.println( "Ребёнку меньше 5 лет, на атрракционе кататься запрещено");
} else if ( ageKids >= 5 && ageKids <= 14) {
    System.out.println( "Ребёнку " +ageKids+ " лет, он может кататься в сопровождении взрослых, если взрослого нет, то кататься запрещено");
} else {
    System.out.println("Ребёнок может кататься без сопровождения взрослых");
}

        System.out.println("Задание 6");

short boughtTicket = 2;
if ( boughtTicket <= 60 ) {
    System.out.println("Есть сидячие места");
} else if ( boughtTicket >= 61 && boughtTicket <= 102 ) {
    System.out.println( "Есть стоячие места");
} else {
    System.out.println( "К сожалению мест нет");
}

        System.out.println("Задание 7");

int one = 900;
int twoo = 1_111;
int three = 290;
if ( one > twoo && one > three) {
    System.out.println(one);
} else if ( twoo > one && twoo > three) {
    System.out.println(twoo);
} else {
    System.out.println(three);
}



    }
}