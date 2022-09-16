// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102/112 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP-102-112 - 2022T1, LabExercise 1
 * Name:
 * Username:
 * ID:
 */

import ecs100.*;

/** Program for calculating various things
 * Some methods convert between two units
 * Other methods perform other simple calculations 
 */

public class CalculatorExercise{

    /**
     * Ask for miles then convert to kilometers
     */
    public void milesToKilometers(){
        /*# YOUR CODE HERE */

    }	

    /**
     * Ask for base and height, then calculate area of triangle
     */
    public void triangleArea(){
        /*# YOUR CODE HERE */

    }

    /**
     * Ask for grams then convert to ounces
     */
    public void gramsToOunces(){
        /*# YOUR CODE HERE */

    }

    /**
     * Ask for radius, and then compute surface area and the volume of a sphere
     *  see notes or http://math2.org/math/geometry/areasvols.htm  for formulas
     */
    public void surfaceAndVolumeOfSphere(){
        /*# YOUR CODE HERE */

    }

    /**
     * Ask for kelvin then convert to Fahrenheit
     */
    public void kelvinToFahrenheit(){
        /*# YOUR CODE HERE */

    }

    /** 
     * Ask for number of pizzas and cost per pizza, then compute cost of order of pizzas
     */
    public void costOfPizzas(){
        /*# YOUR CODE HERE */

    }

    public void setupGUI(){
        UI.initialise();
        UI.addButton("milesToKilometers", this::milesToKilometers );
        UI.addButton("triangleArea", this::triangleArea );
        UI.addButton("gramsToOunces", this::gramsToOunces );
        UI.addButton("surfaceAndVolumeOfSphere", this::surfaceAndVolumeOfSphere );
        UI.addButton("kelvinToFahrenheit", this::kelvinToFahrenheit );
        UI.addButton("costOfPizzas", this::costOfPizzas );
        UI.addButton("Clear", UI::clearText);
        UI.addButton("Quit", UI::quit);
        UI.setDivider(1);   // expands the text area
    }

    public static void main(String[] arguments){
        CalculatorExercise ce = new CalculatorExercise();
        ce.setupGUI();
    }
}
