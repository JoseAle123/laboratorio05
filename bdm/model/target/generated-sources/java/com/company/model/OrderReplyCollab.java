
package com.company.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Convert;
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
@javax.persistence.Entity(name = "OrderReplyCollab")
@Table(name = "ORDERREPLYCOLLAB")
@NamedQueries({
    @NamedQuery(name = "OrderReplyCollab.findByPersistenceId", query = "SELECT o\nFROM OrderReplyCollab o\nWHERE o.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "OrderReplyCollab.findByOrderID", query = "SELECT o\nFROM OrderReplyCollab o\nWHERE o.orderID= :orderID\nORDER BY o.persistenceId"),
    @NamedQuery(name = "OrderReplyCollab.findByAmount", query = "SELECT o\nFROM OrderReplyCollab o\nWHERE o.amount= :amount\nORDER BY o.persistenceId"),
    @NamedQuery(name = "OrderReplyCollab.findByProduct", query = "SELECT o\nFROM OrderReplyCollab o\nWHERE o.product= :product\nORDER BY o.persistenceId"),
    @NamedQuery(name = "OrderReplyCollab.findByConfirmed", query = "SELECT o\nFROM OrderReplyCollab o\nWHERE o.confirmed= :confirmed\nORDER BY o.persistenceId"),
    @NamedQuery(name = "OrderReplyCollab.findByShipped", query = "SELECT o\nFROM OrderReplyCollab o\nWHERE o.shipped= :shipped\nORDER BY o.persistenceId"),
    @NamedQuery(name = "OrderReplyCollab.findByShipmentDate", query = "SELECT o\nFROM OrderReplyCollab o\nWHERE o.shipmentDate= :shipmentDate\nORDER BY o.persistenceId"),
    @NamedQuery(name = "OrderReplyCollab.find", query = "SELECT o\nFROM OrderReplyCollab o\nORDER BY o.persistenceId"),
    @NamedQuery(name = "OrderReplyCollab.countForFindByOrderID", query = "SELECT COUNT(o)\nFROM OrderReplyCollab o\nWHERE o.orderID= :orderID\n"),
    @NamedQuery(name = "OrderReplyCollab.countForFindByAmount", query = "SELECT COUNT(o)\nFROM OrderReplyCollab o\nWHERE o.amount= :amount\n"),
    @NamedQuery(name = "OrderReplyCollab.countForFindByProduct", query = "SELECT COUNT(o)\nFROM OrderReplyCollab o\nWHERE o.product= :product\n"),
    @NamedQuery(name = "OrderReplyCollab.countForFindByConfirmed", query = "SELECT COUNT(o)\nFROM OrderReplyCollab o\nWHERE o.confirmed= :confirmed\n"),
    @NamedQuery(name = "OrderReplyCollab.countForFindByShipped", query = "SELECT COUNT(o)\nFROM OrderReplyCollab o\nWHERE o.shipped= :shipped\n"),
    @NamedQuery(name = "OrderReplyCollab.countForFindByShipmentDate", query = "SELECT COUNT(o)\nFROM OrderReplyCollab o\nWHERE o.shipmentDate= :shipmentDate\n"),
    @NamedQuery(name = "OrderReplyCollab.countForFind", query = "SELECT COUNT(o)\nFROM OrderReplyCollab o\n")
})
public class OrderReplyCollab implements org.bonitasoft.engine.bdm.Entity
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
    @Column(name = "AMOUNT", nullable = true)
    private Integer amount;
    @Column(name = "PRODUCT", nullable = true, length = 255)
    private String product;
    @Column(name = "CONFIRMED", nullable = true)
    private Boolean confirmed;
    @Column(name = "SHIPPED", nullable = true)
    private Boolean shipped;
    @Column(name = "SHIPMENTDATE", nullable = true, length = 10)
    @Convert(converter = org.bonitasoft.engine.business.data.generator.DateConverter.class)
    private LocalDate shipmentDate;

    public OrderReplyCollab() {
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

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    public Boolean isConfirmed() {
        return confirmed;
    }

    public void setShipped(Boolean shipped) {
        this.shipped = shipped;
    }

    public Boolean isShipped() {
        return shipped;
    }

    public void setShipmentDate(LocalDate shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public LocalDate getShipmentDate() {
        return shipmentDate;
    }

}
