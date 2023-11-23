/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaming_pc_factories_pkg;

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
 * This interface defines the contract for a gaming PC factory.
 * It specifies the methods to create various components such as CPU, RAM, Storage, and GraphicsAdapter.
 * Any class implementing this interface must provide concrete implementations for these methods.
 */
public interface GamingPCFactory {

    /**
     * Creates and returns a CPU object.
     *
     * @return A CPU object.
     */
    public CPU createCPU();

    /**
     * Creates and returns a RAM object.
     *
     * @return A RAM object.
     */
    public RAM createRAM();

    /**
     * Creates and returns a Storage object.
     *
     * @return A Storage object.
     */
    public Storage createStorage();

    /**
     * Creates and returns a GraphicsAdapter object.
     *
     * @return A GraphicsAdapter object.
     */
    public GraphicsAdapter createGraphicsAdapter();

}
