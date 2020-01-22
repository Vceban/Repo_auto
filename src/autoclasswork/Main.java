/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoclasswork;

import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Vovan
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<AutoClasswork> auto = new ArrayList<>();
        AutoClasswork engine = new AutoClasswork("", "Opel", 1997, 1800, MotorType.PETROL);
        AutoClasswork engine2 = new AutoClasswork("", "Mercedes", 1995, 4200, MotorType.DIESEL);
        AutoClasswork engine3 = new AutoClasswork("", "BMW", 2012, 3500, MotorType.DIESEL);
        AutoClasswork engine4 = new AutoClasswork("Toyota", "Lexus", 2019, 3000, MotorType.PETROL);
        AutoClasswork engine5 = new AutoClasswork("abc", "nbituadhba", 2002, 1100, MotorType.PETROL);

        auto.add(engine);
        auto.add(engine2);
        auto.add(engine3);
        auto.add(engine4);
        auto.add(engine5);

        auto.sort((o1, o2) -> o1.getModel().compareTo(o2.getModel()));
        for (int i = 0; i < auto.size(); i++) {
            System.out.println(auto.get(i).getModel());
        }

        auto.stream()
                .filter(m -> m.getMotorCapacity() >= 1500)
                //.sorted((o1, o2) -> o1.getMotorCapacity().compareTo(o2.getMotorCApacity()))
                .forEach(nameVar -> System.out.println(nameVar.getMotorCapacity()));
        //.filter(y -> year.now - year >= 10)
        
        auto.stream()
                .filter(y -> (Year.now().getValue() - y.getYear() >= 10))
                .forEach(test -> System.out.println(test.getYear()));
        Map<MotorType, ArrayList<AutoClasswork>> groupped = new HashMap<>();
        groupped.put(MotorType.DIESEL, new ArrayList<>());
        groupped.put(MotorType.PETROL, new ArrayList<>());
        for (AutoClasswork autos : auto) {
            groupped.get(autos.getType()).add(autos);
        }
        
        Map<MotorType, List<AutoClasswork>> groupped2
                = auto.stream().collect(Collectors.groupingBy((a) -> a.getType()));
    }
    }

