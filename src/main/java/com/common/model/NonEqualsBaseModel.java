package com.common.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public abstract class NonEqualsBaseModel<T extends Cloneable> implements
        Cloneable, Serializable {
    private static final long serialVersionUID = -3613939348089186582L;

    @Override
    public T clone() {
        try {
            return (T) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
