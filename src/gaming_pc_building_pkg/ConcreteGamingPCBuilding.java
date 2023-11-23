/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaming_pc_building_pkg;

import gaming_pc_factories_pkg.G4LGamingPCFactory;
import gaming_pc_factories_pkg.WRGGamingPCFactory;
import gaming_pcs_pkg.G4LGamingPC;
import gaming_pcs_pkg.GamingPC;
import gaming_pcs_pkg.WRGGamingPC;
import gaming_pc_factories_pkg.GamingPCFactory;

/**
 * Student Name: Mohammadhassan Yeganeshenas
 * Student Number: 041086643
 * Course & Section #: 22S_CST8288_031
 * Declaration: Factory Lab
 * This is my own original work and is free from Plagiarism.
 *
 * This class represents a concrete implementation of the GamingPCBuilding abstract class.
 * It provides the implementation for creating specific gaming PCs, such as G4L and WRG models.
 */
public class ConcreteGamingPCBuilding extends GamingPCBuilding {

    /**
     * Creates and returns a specific type of GamingPC based on the provided type.
     *
     * @param typeOfGamingPC The type of GamingPC to create ("G4L" or "WRG").
     * @return The created GamingPC object.
     */
    @Override
    protected GamingPC makeGamingPC(String typeOfGamingPC) {
        GamingPC theGamingPC = null;
        if ("G4L".equalsIgnoreCase(typeOfGamingPC)) {
            GamingPCFactory theGamingPCFactory = new G4LGamingPCFactory();
            theGamingPC = new G4LGamingPC(theGamingPCFactory);
            theGamingPC.setName("G4L G15CE-RI516S-CA Gaming Desktop");
            System.out.println("Created G4L Gaming PC " + theGamingPC.getName());
        } else if ("WRG".equalsIgnoreCase(typeOfGamingPC)) {
            GamingPCFactory theGamingPCFactory = new WRGGamingPCFactory();
            theGamingPC = new WRGGamingPC(theGamingPCFactory);
            theGamingPC.setName("WRG Codex SE 12TH-054CA Gaming Desktop Computer");
            System.out.println("Created WRG Gaming PC " + theGamingPC.getName());
        }
        return theGamingPC;
    }
}
