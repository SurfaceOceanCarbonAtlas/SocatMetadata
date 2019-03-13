package gov.noaa.pmel.sdimetadata.instrument;

import gov.noaa.pmel.sdimetadata.variable.DataVar;

import java.io.Serializable;

/**
 * Basic information about an instrument that is a salinity sensor.  Specific details about values measured
 * by the sensor are part of {@link DataVar}.
 */
public class SalinitySensor extends Analyzer implements Cloneable, Serializable {

    @Override
    public SalinitySensor clone() {
        return (SalinitySensor) super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if ( this == obj )
            return true;
        if ( null == obj )
            return false;
        if ( !(obj instanceof SalinitySensor) )
            return false;
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString().replaceFirst("Analyzer", "SalinitySensor");
    }

}
