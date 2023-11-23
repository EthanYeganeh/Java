/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaming_pc_components_pkg;

/**
 * Student Name: Mohammadhassan Yeganeshenas
 * Student Number: 041086643
 * Course & Section #: 22S_CST8288_031
 * Declaration: Factory Lab
 * This is my own original work and is free from Plagiarism.
 *
 * This class represents a specific RAM implementation, WRGRAM,
 * that implements the RAM interface.
 * It provides details about the 16GB DDR4 RAM and overrides
 * the toString() method to return a string representation of the RAM.
 */
public class WRGRAM implements RAM {

    // Add the required code here

    /**
     * Returns a string representation of the 16GB DDR4 RAM.
     *
     * @return A string describing the 16GB DDR4 RAM.
     */
    public String toString() {
        return "16GB DDR4 (2 x 8GB) 3200 MHz";
    }
}
