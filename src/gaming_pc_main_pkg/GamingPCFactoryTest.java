/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaming_pc_main_pkg;

import gaming_pc_building_pkg.ConcreteGamingPCBuilding;
import gaming_pc_building_pkg.GamingPCBuilding;
import gaming_pcs_pkg.GamingPC;

/**
 * Student Name: Mohammadhassan Yeganeshenas
 * Student Number: 041086643
 * Course & Section #: 22S_CST8288_031
 * Declaration: Factory Lab
 * This is my own original work and is free from Plagiarism.
 *
 * This class serves as a test class for the GamingPCFactory application.
 * It creates a ConcreteGamingPCBuilding object, orders a G4L gaming PC, 
 * displays information about its components, and then orders a WRG gaming PC
 * and displays information about its components.
 */
public class GamingPCFactoryTest {

    /**
     * Main method to run the GamingPCFactoryTest application.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {

        // Create a ConcreteGamingPCBuilding object
        GamingPCBuilding theGamingPCBuilding = new ConcreteGamingPCBuilding();

        // Order and display information about the G4L gaming PC
        GamingPC theG4LGamingPC = theGamingPCBuilding.orderTheGamingPC("G4L");
        theG4LGamingPC.displayCPUInfo();
        theG4LGamingPC.displayRAMInfo();
        theG4LGamingPC.displayStorageInfo();
        theG4LGamingPC.displayGraphicsAdapterInfo();
        System.out.println(theG4LGamingPC + "\n");

        // Order and display information about the WRG gaming PC
        GamingPC theWRGGamingPC = theGamingPCBuilding.orderTheGamingPC("WRG");
        theWRGGamingPC.displayCPUInfo();
        theWRGGamingPC.displayRAMInfo();
        theWRGGamingPC.displayStorageInfo();
        theWRGGamingPC.displayGraphicsAdapterInfo();
        System.out.println(theWRGGamingPC + "\n");

    }

}
