package com.company;


public class GreetingsInAllLanguages {

     static class FrenchGreetings implements Greetings {
        @Override
        public void greet() {
            System.out.println("Bonjour");
        }

        @Override
        public void greetSomeone(String someone) {
            System.out.println("Bonjour "+ someone);
        }
    }

    static class EnglishGreetings implements Greetings {
        @Override
        public void greet() {
            System.out.println("Hello");
        }

        @Override
        public void greetSomeone(String someone) {
            System.out.println("Hello "+ someone);
        }    }




}
