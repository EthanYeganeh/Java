/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaming_pcs_pkg;

import gaming_pc_components_pkg.CPU;
import gaming_pc_components_pkg.GraphicsAdapter;
import gaming_pc_components_pkg.RAM;
import gaming_pc_components_pkg.Storage;

/**
 * Student Name: Mohammadhassan Yeganeshenas
 * Student Number: 041086643
 * Course & Section #: 22S_CST8288_031
 * Declaration: Factory Lab
 * This is my own original work and is free from Plagiarism.
 *
 * This abstract class represents a Gaming PC. It defines the common structure
 * and behavior for all gaming PCs. It includes components such as CPU, RAM,
 * storage, and graphics adapter. The concrete implementations of GamingPC, 
 * such as G4LGamingPC and WRGGamingPC, will provide specific components by 
 * implementing the equipGamingPC() method.
 */
public abstract class GamingPC {

    private String name;

    // Newly defined objects that represent the CPU, RAM, storage, & graphics adapter.
    // These can be changed easily by assigning new parts 
    // in G4LGamingPCFactory or WRGGamingPCFactory
    protected CPU cpu;
    protected RAM ram;
    protected Storage storage;
    protected GraphicsAdapter graphicsAdapter;

    /**
     * Gets the name of the gaming PC.
     *
     * @return The name of the gaming PC.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the gaming PC.
     *
     * @param name The name to set for the gaming PC.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Abstract method to equip the gaming PC with components.
     */
    public abstract void equipGamingPC();

    /**
     * Displays information about the CPU of the gaming PC.
     */
    public void displayCPUInfo() {
        System.out.println(getName() + " CPU:  " + cpu);
    }

    /**
     * Displays information about the RAM of the gaming PC.
     */
    public void displayRAMInfo() {
        System.out.println(getName() + " RAM:  " + ram);
    }

    /**
     * Displays information about the storage of the gaming PC.
     */
    public void displayStorageInfo() {
        System.out.println(getName() + " Storage:  " + storage);
    }

    /**
     * Displays information about the graphics adapter of the gaming PC.
     */
    public void displayGraphicsAdapterInfo() {
        System.out.println(getName() + " Graphics Adapter:  " + graphicsAdapter);
    }

    /**
     * Returns a string representation of the gaming PC's information.
     *
     * @return A string containing information about the gaming PC.
     */
    @Override
    public String toString() {
        String gamingPCInfo = "The " + getName() + " has\n\t" + cpu + ",\n\t"
                + ram + ",\n\t" + storage + " , and\n\t" + graphicsAdapter;
        return gamingPCInfo;
    }

}
