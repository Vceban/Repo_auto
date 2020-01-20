/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoclasswork;

import java.time.Year;
import java.util.ArrayList;

/**
 *
 * @author Vovan
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<AutoClasswork> auto = new ArrayList<>();
        AutoClasswork engine = new AutoClasswork("", "Opel", 1997, 1800);
        AutoClasswork engine2 = new AutoClasswork("", "Mercedes", 1995, 4200);
        AutoClasswork engine3 = new AutoClasswork("", "BMW", 2012, 3500);
        AutoClasswork engine4 = new AutoClasswork("Toyota", "Lexus", 2019, 3000);
        AutoClasswork engine5 = new AutoClasswork("abc", "nbituadhba", 2002, 1100);

        auto.add(engine);
        auto.add(engine2);
        auto.add(engine3);
        auto.add(engine4);
        auto.add(engine5);

        auto.sort((o1, o2) -> o1.getModel().compareTo(o2.getModel()));
        for (int i = 0; i < auto.size(); i++) {
            System.out.println(auto.get(i).getModel());
        }
        for(AutoClasswork a : auto){
            
        }

        auto.stream()
                .filter(m -> m.getMotorCapacity() >= 1500)
                .forEach(System.out::println);
        //.filter(y -> year.now - year >= 10)
        
        auto.stream()
                .filter(y -> (2020 - y.getYear() >= 10))
                .forEach(System.out::println);
    }
}
