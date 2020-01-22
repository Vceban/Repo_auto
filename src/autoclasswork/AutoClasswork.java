/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoclasswork;

/**
 *
 * @author Vovan
 */
public class AutoClasswork {

private String manufacturer, model;
private int year, motorCapacity;
MotorType type;

    public MotorType getType() {
        return type;
    }

    public String getModel() {
        return model;
    }
    public int getMotorCapacity(){
        return motorCapacity;
    }
    public int getYear(){
        return year;
    }

AutoClasswork(String manufacturer, String model, int year, int motorCapacity, MotorType type){
    this.manufacturer = manufacturer;
    this.model = model;
    this.year = year;
    this.motorCapacity = motorCapacity;
    this.type = type;
}
    
}
