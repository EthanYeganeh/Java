/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaming_pc_factories_pkg;

import gaming_pc_components_pkg.CPU;
import gaming_pc_components_pkg.G4LCPU;
import gaming_pc_components_pkg.G4LGraphicsAdapter;
import gaming_pc_components_pkg.G4LRAM;
import gaming_pc_components_pkg.G4LStorage;
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
 * This class represents a factory that implements the GamingPCFactory interface.
 * It defines all the components that the G4L gaming PC will use by implementing the methods
 * from the interface. The returned object by each method specifies a specific component
 * that will be used for this gaming PC.
 */
public class G4LGamingPCFactory implements GamingPCFactory {

    /**
     * Creates and returns a G4LCPU object associated with the G4L gaming PC.
     *
     * @return A G4LCPU object.
     */
    public CPU createCPU() {
        // Add the required code here
        CPU cpu = new G4LCPU();
        cpu.toString();
        return cpu;
    }

    /**
     * Creates and returns a G4LRAM object associated with the G4L gaming PC.
     *
     * @return A G4LRAM object.
     */
    public RAM createRAM() {
        // Add the required code here
        RAM ram = new G4LRAM();
        ram.toString();
        return ram;
    }

    /**
     * Creates and returns a G4LStorage object associated with the G4L gaming PC.
     *
     * @return A G4LStorage object.
     */
    public Storage createStorage() {
        // Add the required code here
        Storage storage = new G4LStorage();
        storage.toString();
        return storage;
    }

    /**
     * Creates and returns a G4LGraphicsAdapter object associated with the G4L gaming PC.
     *
     * @return A G4LGraphicsAdapter object.
     */
    public GraphicsAdapter createGraphicsAdapter() {
        // Add the required code here
        GraphicsAdapter ga = new G4LGraphicsAdapter();
        ga.toString();
        return ga;
    }

}
