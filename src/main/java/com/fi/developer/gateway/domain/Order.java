package com.fi.developer.gateway.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;

/**
 * A Order.
 */
@Entity
@Table(name = "jhi_order")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "devilivery_status")
    private String deviliveryStatus;

    @Column(name = "product_title")
    private String productTitle;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeviliveryStatus() {
        return deviliveryStatus;
    }

    public Order deviliveryStatus(String deviliveryStatus) {
        this.deviliveryStatus = deviliveryStatus;
        return this;
    }

    public void setDeviliveryStatus(String deviliveryStatus) {
        this.deviliveryStatus = deviliveryStatus;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public Order productTitle(String productTitle) {
        this.productTitle = productTitle;
        return this;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Order)) {
            return false;
        }
        return id != null && id.equals(((Order) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Order{" +
            "id=" + getId() +
            ", deviliveryStatus='" + getDeviliveryStatus() + "'" +
            ", productTitle='" + getProductTitle() + "'" +
            "}";
    }
}
