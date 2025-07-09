
package com.company.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Version;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


/**
 * 
 */
@javax.persistence.Entity(name = "WarehouseOrder")
@Table(name = "WAREHOUSEORDER")
@NamedQueries({
    @NamedQuery(name = "WarehouseOrder.findByPersistenceId", query = "SELECT w\nFROM WarehouseOrder w\nWHERE w.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "WarehouseOrder.findByOrderID", query = "SELECT w\nFROM WarehouseOrder w\nWHERE w.orderID= :orderID\nORDER BY w.persistenceId"),
    @NamedQuery(name = "WarehouseOrder.findByProduct", query = "SELECT w\nFROM WarehouseOrder w\nWHERE w.product= :product\nORDER BY w.persistenceId"),
    @NamedQuery(name = "WarehouseOrder.findByAmount", query = "SELECT w\nFROM WarehouseOrder w\nWHERE w.amount= :amount\nORDER BY w.persistenceId"),
    @NamedQuery(name = "WarehouseOrder.findByStatus", query = "SELECT w\nFROM WarehouseOrder w\nWHERE w.status= :status\nORDER BY w.persistenceId"),
    @NamedQuery(name = "WarehouseOrder.find", query = "SELECT w\nFROM WarehouseOrder w\nORDER BY w.persistenceId"),
    @NamedQuery(name = "WarehouseOrder.countForFindByOrderID", query = "SELECT COUNT(w)\nFROM WarehouseOrder w\nWHERE w.orderID= :orderID\n"),
    @NamedQuery(name = "WarehouseOrder.countForFindByProduct", query = "SELECT COUNT(w)\nFROM WarehouseOrder w\nWHERE w.product= :product\n"),
    @NamedQuery(name = "WarehouseOrder.countForFindByAmount", query = "SELECT COUNT(w)\nFROM WarehouseOrder w\nWHERE w.amount= :amount\n"),
    @NamedQuery(name = "WarehouseOrder.countForFindByStatus", query = "SELECT COUNT(w)\nFROM WarehouseOrder w\nWHERE w.status= :status\n"),
    @NamedQuery(name = "WarehouseOrder.countForFind", query = "SELECT COUNT(w)\nFROM WarehouseOrder w\n")
})
public class WarehouseOrder implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
    @Column(name = "ORDERID", nullable = true)
    private Long orderID;
    @Column(name = "PRODUCT", nullable = true, length = 255)
    private String product;
    @Column(name = "AMOUNT", nullable = true)
    private Integer amount;
    @Column(name = "STATUS", nullable = true, length = 255)
    private String status;

    public WarehouseOrder() {
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

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public Long getOrderID() {
        return orderID;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

}
