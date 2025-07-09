
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
@javax.persistence.Entity(name = "SimpleOrder")
@Table(name = "SIMPLEORDER")
@NamedQueries({
    @NamedQuery(name = "SimpleOrder.findByPersistenceId", query = "SELECT s\nFROM SimpleOrder s\nWHERE s.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "SimpleOrder.findByItem", query = "SELECT s\nFROM SimpleOrder s\nWHERE s.item= :item\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SimpleOrder.findByAmount", query = "SELECT s\nFROM SimpleOrder s\nWHERE s.amount= :amount\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SimpleOrder.findByRating", query = "SELECT s\nFROM SimpleOrder s\nWHERE s.rating= :rating\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SimpleOrder.findByRelationshipDuration", query = "SELECT s\nFROM SimpleOrder s\nWHERE s.relationshipDuration= :relationshipDuration\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SimpleOrder.findByApproved", query = "SELECT s\nFROM SimpleOrder s\nWHERE s.approved= :approved\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SimpleOrder.find", query = "SELECT s\nFROM SimpleOrder s\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SimpleOrder.countForFindByItem", query = "SELECT COUNT(s)\nFROM SimpleOrder s\nWHERE s.item= :item\n"),
    @NamedQuery(name = "SimpleOrder.countForFindByAmount", query = "SELECT COUNT(s)\nFROM SimpleOrder s\nWHERE s.amount= :amount\n"),
    @NamedQuery(name = "SimpleOrder.countForFindByRating", query = "SELECT COUNT(s)\nFROM SimpleOrder s\nWHERE s.rating= :rating\n"),
    @NamedQuery(name = "SimpleOrder.countForFindByRelationshipDuration", query = "SELECT COUNT(s)\nFROM SimpleOrder s\nWHERE s.relationshipDuration= :relationshipDuration\n"),
    @NamedQuery(name = "SimpleOrder.countForFindByApproved", query = "SELECT COUNT(s)\nFROM SimpleOrder s\nWHERE s.approved= :approved\n"),
    @NamedQuery(name = "SimpleOrder.countForFind", query = "SELECT COUNT(s)\nFROM SimpleOrder s\n")
})
public class SimpleOrder implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
    @Column(name = "ITEM", nullable = true, length = 255)
    private String item;
    @Column(name = "AMOUNT", nullable = true)
    private Integer amount;
    @Column(name = "RATING", nullable = true)
    private Integer rating;
    @Column(name = "RELATIONSHIPDURATION", nullable = true)
    private Integer relationshipDuration;
    @Column(name = "APPROVED", nullable = true)
    private Boolean approved;

    public SimpleOrder() {
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

    public void setItem(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRelationshipDuration(Integer relationshipDuration) {
        this.relationshipDuration = relationshipDuration;
    }

    public Integer getRelationshipDuration() {
        return relationshipDuration;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public Boolean isApproved() {
        return approved;
    }

}
