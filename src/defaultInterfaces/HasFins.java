/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultInterfaces;

/**
 *
 * @author madw
 */
public interface HasFins {

    public default int getNumberOfFins() {
        return 4;
    }

    public default double getLongestFinLength() {
        return 20.0;
    }

    public default boolean doFinsHaveScales() {
        return true;
    }
}

interface SharkFamily extends HasFins {

    @Override
    public default int getNumberOfFins() {
        return 8;
    }

    @Override
    public double getLongestFinLength();

    @Override
    public boolean doFinsHaveScales();
}
