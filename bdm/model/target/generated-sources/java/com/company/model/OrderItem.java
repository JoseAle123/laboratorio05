
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
@javax.persistence.Entity(name = "OrderItem")
@Table(name = "ORDERITEM")
@NamedQueries({
    @NamedQuery(name = "OrderItem.findByPersistenceId", query = "SELECT o\nFROM OrderItem o\nWHERE o.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "OrderItem.findByNumber", query = "SELECT o\nFROM OrderItem o\nWHERE o.number= :number\nORDER BY o.persistenceId"),
    @NamedQuery(name = "OrderItem.findByProduct", query = "SELECT o\nFROM OrderItem o\nWHERE o.product= :product\nORDER BY o.persistenceId"),
    @NamedQuery(name = "OrderItem.findByAmount", query = "SELECT o\nFROM OrderItem o\nWHERE o.amount= :amount\nORDER BY o.persistenceId"),
    @NamedQuery(name = "OrderItem.findByStatus", query = "SELECT o\nFROM OrderItem o\nWHERE o.status= :status\nORDER BY o.persistenceId"),
    @NamedQuery(name = "OrderItem.find", query = "SELECT o\nFROM OrderItem o\nORDER BY o.persistenceId"),
    @NamedQuery(name = "OrderItem.countForFindByNumber", query = "SELECT COUNT(o)\nFROM OrderItem o\nWHERE o.number= :number\n"),
    @NamedQuery(name = "OrderItem.countForFindByProduct", query = "SELECT COUNT(o)\nFROM OrderItem o\nWHERE o.product= :product\n"),
    @NamedQuery(name = "OrderItem.countForFindByAmount", query = "SELECT COUNT(o)\nFROM OrderItem o\nWHERE o.amount= :amount\n"),
    @NamedQuery(name = "OrderItem.countForFindByStatus", query = "SELECT COUNT(o)\nFROM OrderItem o\nWHERE o.status= :status\n"),
    @NamedQuery(name = "OrderItem.countForFind", query = "SELECT COUNT(o)\nFROM OrderItem o\n")
})
public class OrderItem implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
    @Column(name = "NUMBER", nullable = true)
    private Integer number;
    @Column(name = "PRODUCT", nullable = true, length = 255)
    private String product;
    @Column(name = "AMOUNT", nullable = true)
    private Integer amount;
    @Column(name = "STATUS", nullable = true, length = 255)
    private String status;

    public OrderItem() {
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

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
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
