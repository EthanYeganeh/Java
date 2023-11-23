/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaming_pc_building_pkg;

import gaming_pcs_pkg.GamingPC;

/**
 * Student Name: Mohammadhassan Yeganeshenas
 * Student Number: 041086643
 * Course & Section #: 22S_CST8288_031
 * Declaration: Factory Lab
 * This is my own original work and is free from Plagiarism.
 *
 * This abstract class represents the framework for building gaming PCs.
 * It declares an abstract method makeGamingPC() that concrete subclasses must implement
 * to create specific types of gaming PCs.
 */
public abstract class GamingPCBuilding {

    /**
     * Creates and returns a specific type of GamingPC based on the provided type.
     *
     * @param typeOfGamingPC The type of GamingPC to create.
     * @return The created GamingPC object.
     */
    protected abstract GamingPC makeGamingPC(String typeOfGamingPC);

    /**
     * Orders a specific type of GamingPC and returns the created GamingPC.
     *
     * @param typeOfGamingPC The type of GamingPC to order.
     * @return The ordered GamingPC object.
     */
    public GamingPC orderTheGamingPC(String typeOfGamingPC) {
        GamingPC theGamingPC = makeGamingPC(typeOfGamingPC);
        theGamingPC.equipGamingPC();
        return theGamingPC;
    }

}
