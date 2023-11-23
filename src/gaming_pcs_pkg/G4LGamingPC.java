/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaming_pcs_pkg;

import gaming_pc_factories_pkg.GamingPCFactory;

/**
 * Student Name: Mohammadhassan Yeganeshenas
 * Student Number: 041086643
 * Course & Section #: 22S_CST8288_031
 * Declaration: Factory Lab
 * This is my own original work and is free from Plagiarism.
 *
 * This class represents a G4L gaming PC that extends the GamingPC class.
 * It takes a GamingPCFactory as a parameter in its constructor to equip
 * the gaming PC with specific components during the equipGamingPC() method call.
 */
public class G4LGamingPC extends GamingPC {

    private final GamingPCFactory theGamingPCFactory;

    /**
     * Constructs a G4LGamingPC object with the provided GamingPCFactory.
     *
     * @param theGamingPCFactory The GamingPCFactory to be used for equipping the gaming PC.
     */
    public G4LGamingPC(GamingPCFactory theGamingPCFactory) {
        this.theGamingPCFactory = theGamingPCFactory;
    }

    /**
     * Equips the G4L gaming PC with components using the specified GamingPCFactory.
     */
    public void equipGamingPC() {
        System.out.println("Adding components to G4L Gaming PC " + getName());
        // Insert code to assign CPU, RAM, storage, and graphics adapter to suitable ones
        this.cpu = theGamingPCFactory.createCPU();
        this.ram = theGamingPCFactory.createRAM();
        this.storage = theGamingPCFactory.createStorage();
        this.graphicsAdapter = theGamingPCFactory.createGraphicsAdapter();
    }

}
