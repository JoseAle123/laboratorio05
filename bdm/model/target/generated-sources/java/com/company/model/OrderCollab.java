
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
@javax.persistence.Entity(name = "OrderCollab")
@Table(name = "ORDERCOLLAB")
@NamedQueries({
    @NamedQuery(name = "OrderCollab.findByPersistenceId", query = "SELECT o\nFROM OrderCollab o\nWHERE o.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "OrderCollab.findByAmount", query = "SELECT o\nFROM OrderCollab o\nWHERE o.amount= :amount\nORDER BY o.persistenceId"),
    @NamedQuery(name = "OrderCollab.findByProduct", query = "SELECT o\nFROM OrderCollab o\nWHERE o.product= :product\nORDER BY o.persistenceId"),
    @NamedQuery(name = "OrderCollab.findByConfirmed", query = "SELECT o\nFROM OrderCollab o\nWHERE o.confirmed= :confirmed\nORDER BY o.persistenceId"),
    @NamedQuery(name = "OrderCollab.findByShipped", query = "SELECT o\nFROM OrderCollab o\nWHERE o.shipped= :shipped\nORDER BY o.persistenceId"),
    @NamedQuery(name = "OrderCollab.findByShipmentDate", query = "SELECT o\nFROM OrderCollab o\nWHERE o.shipmentDate= :shipmentDate\nORDER BY o.persistenceId"),
    @NamedQuery(name = "OrderCollab.find", query = "SELECT o\nFROM OrderCollab o\nORDER BY o.persistenceId"),
    @NamedQuery(name = "OrderCollab.countForFindByAmount", query = "SELECT COUNT(o)\nFROM OrderCollab o\nWHERE o.amount= :amount\n"),
    @NamedQuery(name = "OrderCollab.countForFindByProduct", query = "SELECT COUNT(o)\nFROM OrderCollab o\nWHERE o.product= :product\n"),
    @NamedQuery(name = "OrderCollab.countForFindByConfirmed", query = "SELECT COUNT(o)\nFROM OrderCollab o\nWHERE o.confirmed= :confirmed\n"),
    @NamedQuery(name = "OrderCollab.countForFindByShipped", query = "SELECT COUNT(o)\nFROM OrderCollab o\nWHERE o.shipped= :shipped\n"),
    @NamedQuery(name = "OrderCollab.countForFindByShipmentDate", query = "SELECT COUNT(o)\nFROM OrderCollab o\nWHERE o.shipmentDate= :shipmentDate\n"),
    @NamedQuery(name = "OrderCollab.countForFind", query = "SELECT COUNT(o)\nFROM OrderCollab o\n")
})
public class OrderCollab implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
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

    public OrderCollab() {
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
