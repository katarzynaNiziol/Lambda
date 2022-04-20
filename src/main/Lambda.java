package main;

public class Lambda {
    public static void main(String[] args) {
        KalkulatorInterface dodaj = (a, b) -> a + b;
        KalkulatorInterface odejmij = (a, b) -> a - b;
        KalkulatorInterface pomnoz = (a, b) -> a * b;
        KalkulatorInterface podziel = (a, b) -> a / b;

        System.out.println(dodaj.oblicz(2,4));
        System.out.println(odejmij.oblicz(5, 1));
        System.out.println(pomnoz.oblicz(6,5));
        System.out.println(podziel.oblicz(22,2));
    }
}
