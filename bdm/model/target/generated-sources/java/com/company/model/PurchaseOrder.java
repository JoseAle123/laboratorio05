
package com.company.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.Version;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


/**
 * 
 */
@javax.persistence.Entity(name = "PurchaseOrder")
@Table(name = "PURCHASEORDER")
@NamedQueries({
    @NamedQuery(name = "PurchaseOrder.findByPersistenceId", query = "SELECT p\nFROM PurchaseOrder p\nWHERE p.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "PurchaseOrder.findByCustomer", query = "SELECT p\nFROM PurchaseOrder p\nWHERE p.customer= :customer\nORDER BY p.persistenceId"),
    @NamedQuery(name = "PurchaseOrder.findByOrderDate", query = "SELECT p\nFROM PurchaseOrder p\nWHERE p.orderDate= :orderDate\nORDER BY p.persistenceId"),
    @NamedQuery(name = "PurchaseOrder.find", query = "SELECT p\nFROM PurchaseOrder p\nORDER BY p.persistenceId"),
    @NamedQuery(name = "PurchaseOrder.countForFindByCustomer", query = "SELECT COUNT(p)\nFROM PurchaseOrder p\nWHERE p.customer= :customer\n"),
    @NamedQuery(name = "PurchaseOrder.countForFindByOrderDate", query = "SELECT COUNT(p)\nFROM PurchaseOrder p\nWHERE p.orderDate= :orderDate\n"),
    @NamedQuery(name = "PurchaseOrder.countForFind", query = "SELECT COUNT(p)\nFROM PurchaseOrder p\n")
})
public class PurchaseOrder implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
    @Column(name = "CUSTOMER", nullable = true, length = 255)
    private String customer;
    @Column(name = "ORDERDATE", nullable = true, length = 10)
    @Convert(converter = org.bonitasoft.engine.business.data.generator.DateConverter.class)
    private LocalDate orderDate;
    @OneToMany(orphanRemoval = true, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "PURCHASEORDER_PID", nullable = false)
    @OrderColumn
    private List<com.company.model.OrderItem> orderItem = new ArrayList<com.company.model.OrderItem>(10);

    public PurchaseOrder() {
    }

    public void setPersistenceId(Long persistenceId) {
        this.persistenceId = persistenceId;
    }

    public Long getPersistenceId() {
        return persistenceId;
    }

    public void setPersistenceVersion(Long persistenceVersion) {
        this.persistenceVersion = persistenceVersion;
    }

    public Long getPersistenceVersion() {
        return persistenceVersion;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderItem(List<com.company.model.OrderItem> orderItem) {
        if (this.orderItem == null) {
            this.orderItem = orderItem;
        } else {
            List<com.company.model.OrderItem> copy = new ArrayList(orderItem);
            this.orderItem.clear();
            this.orderItem.addAll(copy);
        }
    }

    public List<com.company.model.OrderItem> getOrderItem() {
        return orderItem;
    }

    public void addToOrderItem(com.company.model.OrderItem addTo) {
        List orderItem = getOrderItem();
        orderItem.add(addTo);
    }

    public void removeFromOrderItem(com.company.model.OrderItem removeFrom) {
        List orderItem = getOrderItem();
        orderItem.remove(removeFrom);
    }

}
