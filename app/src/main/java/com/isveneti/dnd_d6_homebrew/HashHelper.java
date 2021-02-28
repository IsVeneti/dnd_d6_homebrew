package com.isveneti.dnd_d6_homebrew;


import java.util.HashMap;

public class HashHelper {
    static HashMap<Integer,String> attmap = new HashMap<>();
    static HashMap<Integer,String> defmap = new HashMap<>();
    static HashMap<Integer,String> defmapc = new HashMap<>();
    static HashMap<Integer,String> defmapm = new HashMap<>();
    static HashMap<Integer,String> healmap = new HashMap<>();
    static HashMap<Integer,String> distmap = new HashMap<>();

    static{
        defmap.put(1,"4 def");
        defmap.put(2,"2 def");
        defmap.put(3,"2 def");
        defmap.put(4,"2 def");
        defmap.put(5,"0 def");
        defmap.put(6,"3 def");

        defmapc.put(1,"2 def");
        defmapc.put(2,"1 def");
        defmapc.put(3,"1 def");
        defmapc.put(4,"1 def");
        defmapc.put(5,"0 def");
        defmapc.put(6,"3 def");

        defmapm.put(1,"0 def");
        defmapm.put(2,"1 def");
        defmapm.put(3,"0 def");
        defmapm.put(4,"1 def");
        defmapm.put(5,"0 def");
        defmapm.put(6,"2 def");

        attmap.put(1,"3 dmg 1 heal");
        attmap.put(2,"2 dmg");
        attmap.put(3,"2 dmg");
        attmap.put(4,"3 dmg");
        attmap.put(5,"1 dmg");
        attmap.put(6,"2 dmg");

        healmap.put(1,"3 heal 1 ability");
        healmap.put(2,"2 heal");
        healmap.put(3,"2 heal");
        healmap.put(4,"3 heal");
        healmap.put(5,"1 heal");
        healmap.put(6,"2 heal");

        distmap.put(1,"Miss!");
        distmap.put(2,"6 range 1 dmg 1 heal");
        distmap.put(3,"5 range 1 dmg");
        distmap.put(4,"3 range 2 dmg");
        distmap.put(5,"2 range 2 dmg");
        distmap.put(6,"4 range 2 dmg");



    }
}
