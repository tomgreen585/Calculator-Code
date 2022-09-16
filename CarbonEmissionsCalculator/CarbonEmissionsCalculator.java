// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102/112 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP-102-112 - 2022T1, Assignment 1
 * Name:
 * Username:
 * ID:
 */

import ecs100.*;

/** Program for calculating carbon emissions */

public class CarbonEmissionsCalculator{

    public static final double EMISSION_FACTOR_POWER = 0.0977;   // emissions factor of electricity per kWh
    public static final double EMISSION_FACTOR_WASTE = 0.299;    // emissions factor of food waste per kg

    public static final double ANNUAL_AVERAGE_POWER_EMISSION_NZ = 266.5;   //Annual average carbon emissions in NZ (kg) from electricity use
    public static final double ANNUAL_AVERAGE_FOOD_WASTE_EMISSION_NZ = 18; //Annual average carbon emissions in NZ (kg) from food waste

    /**
     * Calculates and prints carbon emissions
     */
    public void calculateEmissions(){
        /*# YOUR CODE HERE */

    }

    public void setupGUI(){
        UI.initialise();
        UI.addButton("Calculate Emissions", this::calculateEmissions);
        UI.addButton("Quit", UI::quit);
        UI.setDivider(1);    // Expand the Text pane
    }

    public static void main(String[] args){
        CarbonEmissionsCalculator cec = new CarbonEmissionsCalculator();
        cec.setupGUI();
    }

}
