package com.company;

public class Main {

    public static void main(String[] args) {
      /*
      #TASK
        #part 1
        Greetings degen interface tuzunuz
        anyn ichine 2 abstract method tuzunuz {greet(), greetSomeone(String someone)}
        #part 2
        3 anonimnyi class tuzunuz {frenchGreetins, englishGreetings, spanishGreetings}
        oshol 3 classtyn realizacialaryn tyzynyz
        ar class ar tilde suilosun
        jana baardyk tilderde metoddordun resultatyn konsolgo chygarynyz
       */

        GreetingsInAllLanguages.FrenchGreetings fr = new GreetingsInAllLanguages.FrenchGreetings();
        fr.greet();
        fr.greetSomeone("Altynbek");

        GreetingsInAllLanguages.EnglishGreetings eng = new GreetingsInAllLanguages.EnglishGreetings();
        eng.greet();
        eng.greetSomeone("Altynbek");

        GreetingsInAllLanguages.SpanishGreetings esp = new GreetingsInAllLanguages.SpanishGreetings();
        esp.greet();
        esp.greetSomeone("Altynbek");

        GreetingsInAllLanguages.KyrgyzGreetings kg = new GreetingsInAllLanguages.KyrgyzGreetings();
        kg.greet();
        kg.greetSomeone("Алтынбек");

    }
}
