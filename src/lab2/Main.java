package lab2;

import pokemon.*;
import ru.ifmo.se.pokemon.*;
import move.*;

public class Main {
    public static void main(String[] args){
        Battle b = new Battle();
        b.addAlly(new Suicine("Suicine",5));
        b.addAlly(new Crabrawler("Crabrawler",5));
        b.addAlly(new Azuril("Azuril",5));
        b.addFoe(new Crabominable("Crabominable",5));
        b.addFoe(new Marill("Marill",5));
        b.addFoe(new Azumarill("Azumarill",5));
        Pokemon p1 = new Pokemon("Чужой",1);
        Pokemon p2 = new Pokemon("Хищник",1);
        b.addFoe(p1);
        b.addFoe(p2);
        b.go();

    }
}