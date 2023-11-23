/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaming_pc_factories_pkg;

import gaming_pc_components_pkg.CPU;
import gaming_pc_components_pkg.GraphicsAdapter;
import gaming_pc_components_pkg.RAM;
import gaming_pc_components_pkg.Storage;
import gaming_pc_components_pkg.WRGCPU;
import gaming_pc_components_pkg.WRGGraphicsAdapter;
import gaming_pc_components_pkg.WRGRAM;
import gaming_pc_components_pkg.WRGStorage;

/**
 * Student Name: Mohammadhassan Yeganeshenas
 * Student Number: 041086643
 * Course & Section #: 22S_CST8288_031
 * Declaration: Factory Lab
 * This is my own original work and is free from Plagiarism.
 *
 * This class represents a factory that implements the GamingPCFactory interface.
 * It defines all the components that the WRG gaming PC will use by implementing
 * the methods from the interface. The returned object by each method specifies
 * a specific component that will be used for this gaming PC.
 */
public class WRGGamingPCFactory implements GamingPCFactory {

    /**
     * Creates and returns a WRGCPU object associated with the WRG gaming PC.
     *
     * @return A WRGCPU object.
     */
    @Override
    public CPU createCPU() {
        // Add the required code here
        CPU cpu = new WRGCPU();
        cpu.toString();
        return cpu;
    }

    /**
     * Creates and returns a WRGRAM object associated with the WRG gaming PC.
     *
     * @return A WRGRAM object.
     */
    @Override
    public RAM createRAM() {
        // Add the required code here
        RAM ram = new WRGRAM();
        ram.toString();
        return ram;
    }

    /**
     * Creates and returns a WRGStorage object associated with the WRG gaming PC.
     *
     * @return A WRGStorage object.
     */
    @Override
    public Storage createStorage() {
        // Add the required code here
        Storage st = new WRGStorage();
        st.toString();
        return st;
    }

    /**
     * Creates and returns a WRGGraphicsAdapter object associated with the WRG gaming PC.
     *
     * @return A WRGGraphicsAdapter object.
     */
    @Override
    public GraphicsAdapter createGraphicsAdapter() {
        // Add the required code here
        GraphicsAdapter ga = new WRGGraphicsAdapter();
        ga.toString();
        return ga;
    }

}
