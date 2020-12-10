
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ecc_errorsType", propOrder = {
        "_volatile",
        "aggregate"
})
public class EccErrorsType {

    @XmlElement(name = "volatile", required = true)
    protected VolatileType _volatile;
    @XmlElement(required = true)
    protected AggregateType aggregate;

    /**
     * Gets the value of the volatile property.
     *
     * @return possible object is
     * {@link VolatileType }
     */
    public VolatileType getVolatile() {
        return _volatile;
    }

    /**
     * Sets the value of the volatile property.
     *
     * @param value allowed object is
     *              {@link VolatileType }
     */
    public void setVolatile(VolatileType value) {
        this._volatile = value;
    }

    /**
     * Gets the value of the aggregate property.
     *
     * @return possible object is
     * {@link AggregateType }
     */
    public AggregateType getAggregate() {
        return aggregate;
    }

    /**
     * Sets the value of the aggregate property.
     *
     * @param value allowed object is
     *              {@link AggregateType }
     */
    public void setAggregate(AggregateType value) {
        this.aggregate = value;
    }

}
