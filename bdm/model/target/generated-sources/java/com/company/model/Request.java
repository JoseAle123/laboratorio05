
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
@javax.persistence.Entity(name = "Request")
@Table(name = "REQUEST")
@NamedQueries({
    @NamedQuery(name = "Request.findByPersistenceId", query = "SELECT r\nFROM Request r\nWHERE r.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "Request.findByUuid", query = "SELECT r\nFROM Request r\nWHERE r.uuid= :uuid\nORDER BY r.persistenceId"),
    @NamedQuery(name = "Request.findByItem", query = "SELECT r\nFROM Request r\nWHERE r.item= :item\nORDER BY r.persistenceId"),
    @NamedQuery(name = "Request.findByQuantity", query = "SELECT r\nFROM Request r\nWHERE r.quantity= :quantity\nORDER BY r.persistenceId"),
    @NamedQuery(name = "Request.findByPrice", query = "SELECT r\nFROM Request r\nWHERE r.price= :price\nORDER BY r.persistenceId"),
    @NamedQuery(name = "Request.findByAccepted", query = "SELECT r\nFROM Request r\nWHERE r.accepted= :accepted\nORDER BY r.persistenceId"),
    @NamedQuery(name = "Request.find", query = "SELECT r\nFROM Request r\nORDER BY r.persistenceId"),
    @NamedQuery(name = "Request.countForFindByUuid", query = "SELECT COUNT(r)\nFROM Request r\nWHERE r.uuid= :uuid\n"),
    @NamedQuery(name = "Request.countForFindByItem", query = "SELECT COUNT(r)\nFROM Request r\nWHERE r.item= :item\n"),
    @NamedQuery(name = "Request.countForFindByQuantity", query = "SELECT COUNT(r)\nFROM Request r\nWHERE r.quantity= :quantity\n"),
    @NamedQuery(name = "Request.countForFindByPrice", query = "SELECT COUNT(r)\nFROM Request r\nWHERE r.price= :price\n"),
    @NamedQuery(name = "Request.countForFindByAccepted", query = "SELECT COUNT(r)\nFROM Request r\nWHERE r.accepted= :accepted\n"),
    @NamedQuery(name = "Request.countForFind", query = "SELECT COUNT(r)\nFROM Request r\n")
})
public class Request implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
    @Column(name = "UUID", nullable = true, length = 255)
    private String uuid;
    @Column(name = "ITEM", nullable = true, length = 255)
    private String item;
    @Column(name = "QUANTITY", nullable = true)
    private Integer quantity;
    @Column(name = "PRICE", nullable = true)
    private Integer price;
    @Column(name = "ACCEPTED", nullable = true)
    private Boolean accepted;

    public Request() {
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

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }

    public Boolean isAccepted() {
        return accepted;
    }

}
