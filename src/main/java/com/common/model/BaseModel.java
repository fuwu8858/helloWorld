package com.common.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true, value = { "dn",
    "hibernateLazyInitializer", "handler" })
public abstract class BaseModel<T extends Cloneable, S> extends
        NonEqualsBaseModel<T> implements IDOwner<S> {
    private static final long serialVersionUID = -3910829862996014763L;

    /**
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
            + (this.getId() == null ? 0 : this.getId().hashCode());
        return result;
    }

    /**
     * @see Object#equals(Object)
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        BaseModel<T, S> other = (BaseModel<T, S>) obj;
        if (this.getId() == null) {
            if (other.getId() != null) {
                return false;
            }
        } else if (!this.getId().equals(other.getId())) {
            return false;
        }
        return true;
    }

    public T cloneWithoutCascade() {
        return this.clone();
    }
}
