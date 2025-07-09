
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
@javax.persistence.Entity(name = "PurchaseRequisition")
@Table(name = "PURCHASEREQUISITION")
@NamedQueries({
    @NamedQuery(name = "PurchaseRequisition.findByPersistenceId", query = "SELECT p\nFROM PurchaseRequisition p\nWHERE p.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "PurchaseRequisition.findByRequistionID", query = "SELECT p\nFROM PurchaseRequisition p\nWHERE p.requistionID= :requistionID\nORDER BY p.persistenceId"),
    @NamedQuery(name = "PurchaseRequisition.findByProduct", query = "SELECT p\nFROM PurchaseRequisition p\nWHERE p.product= :product\nORDER BY p.persistenceId"),
    @NamedQuery(name = "PurchaseRequisition.findByAmount", query = "SELECT p\nFROM PurchaseRequisition p\nWHERE p.amount= :amount\nORDER BY p.persistenceId"),
    @NamedQuery(name = "PurchaseRequisition.findByIsConfirmed", query = "SELECT p\nFROM PurchaseRequisition p\nWHERE p.isConfirmed= :isConfirmed\nORDER BY p.persistenceId"),
    @NamedQuery(name = "PurchaseRequisition.findByComment", query = "SELECT p\nFROM PurchaseRequisition p\nWHERE p.comment= :comment\nORDER BY p.persistenceId"),
    @NamedQuery(name = "PurchaseRequisition.find", query = "SELECT p\nFROM PurchaseRequisition p\nORDER BY p.persistenceId"),
    @NamedQuery(name = "PurchaseRequisition.countForFindByRequistionID", query = "SELECT COUNT(p)\nFROM PurchaseRequisition p\nWHERE p.requistionID= :requistionID\n"),
    @NamedQuery(name = "PurchaseRequisition.countForFindByProduct", query = "SELECT COUNT(p)\nFROM PurchaseRequisition p\nWHERE p.product= :product\n"),
    @NamedQuery(name = "PurchaseRequisition.countForFindByAmount", query = "SELECT COUNT(p)\nFROM PurchaseRequisition p\nWHERE p.amount= :amount\n"),
    @NamedQuery(name = "PurchaseRequisition.countForFindByIsConfirmed", query = "SELECT COUNT(p)\nFROM PurchaseRequisition p\nWHERE p.isConfirmed= :isConfirmed\n"),
    @NamedQuery(name = "PurchaseRequisition.countForFindByComment", query = "SELECT COUNT(p)\nFROM PurchaseRequisition p\nWHERE p.comment= :comment\n"),
    @NamedQuery(name = "PurchaseRequisition.countForFind", query = "SELECT COUNT(p)\nFROM PurchaseRequisition p\n")
})
public class PurchaseRequisition implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
    @Column(name = "REQUISTIONID", nullable = true)
    private Long requistionID;
    @Column(name = "PRODUCT", nullable = true, length = 255)
    private String product;
    @Column(name = "AMOUNT", nullable = true)
    private Integer amount;
    @Column(name = "ISCONFIRMED", nullable = true, length = 255)
    private String isConfirmed;
    @Column(name = "COMMENT", nullable = true, length = 255)
    private String comment;

    public PurchaseRequisition() {
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

    public void setRequistionID(Long requistionID) {
        this.requistionID = requistionID;
    }

    public Long getRequistionID() {
        return requistionID;
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

    public void setIsConfirmed(String isConfirmed) {
        this.isConfirmed = isConfirmed;
    }

    public String getIsConfirmed() {
        return isConfirmed;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

}
