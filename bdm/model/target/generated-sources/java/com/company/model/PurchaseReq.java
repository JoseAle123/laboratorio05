
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
@javax.persistence.Entity(name = "PurchaseReq")
@Table(name = "PURCHASEREQ")
@NamedQueries({
    @NamedQuery(name = "PurchaseReq.findByPersistenceId", query = "SELECT p\nFROM PurchaseReq p\nWHERE p.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "PurchaseReq.findByRequestorUsername", query = "SELECT p\nFROM PurchaseReq p\nWHERE p.requestorUsername= :requestorUsername\nORDER BY p.persistenceId"),
    @NamedQuery(name = "PurchaseReq.findByProduct", query = "SELECT p\nFROM PurchaseReq p\nWHERE p.product= :product\nORDER BY p.persistenceId"),
    @NamedQuery(name = "PurchaseReq.findByReason", query = "SELECT p\nFROM PurchaseReq p\nWHERE p.reason= :reason\nORDER BY p.persistenceId"),
    @NamedQuery(name = "PurchaseReq.findByCosts", query = "SELECT p\nFROM PurchaseReq p\nWHERE p.costs= :costs\nORDER BY p.persistenceId"),
    @NamedQuery(name = "PurchaseReq.findByIsComplete", query = "SELECT p\nFROM PurchaseReq p\nWHERE p.isComplete= :isComplete\nORDER BY p.persistenceId"),
    @NamedQuery(name = "PurchaseReq.findByApproved", query = "SELECT p\nFROM PurchaseReq p\nWHERE p.approved= :approved\nORDER BY p.persistenceId"),
    @NamedQuery(name = "PurchaseReq.find", query = "SELECT p\nFROM PurchaseReq p\nORDER BY p.persistenceId"),
    @NamedQuery(name = "PurchaseReq.countForFindByRequestorUsername", query = "SELECT COUNT(p)\nFROM PurchaseReq p\nWHERE p.requestorUsername= :requestorUsername\n"),
    @NamedQuery(name = "PurchaseReq.countForFindByProduct", query = "SELECT COUNT(p)\nFROM PurchaseReq p\nWHERE p.product= :product\n"),
    @NamedQuery(name = "PurchaseReq.countForFindByReason", query = "SELECT COUNT(p)\nFROM PurchaseReq p\nWHERE p.reason= :reason\n"),
    @NamedQuery(name = "PurchaseReq.countForFindByCosts", query = "SELECT COUNT(p)\nFROM PurchaseReq p\nWHERE p.costs= :costs\n"),
    @NamedQuery(name = "PurchaseReq.countForFindByIsComplete", query = "SELECT COUNT(p)\nFROM PurchaseReq p\nWHERE p.isComplete= :isComplete\n"),
    @NamedQuery(name = "PurchaseReq.countForFindByApproved", query = "SELECT COUNT(p)\nFROM PurchaseReq p\nWHERE p.approved= :approved\n"),
    @NamedQuery(name = "PurchaseReq.countForFind", query = "SELECT COUNT(p)\nFROM PurchaseReq p\n")
})
public class PurchaseReq implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
    @Column(name = "REQUESTORUSERNAME", nullable = true, length = 255)
    private String requestorUsername;
    @Column(name = "PRODUCT", nullable = true, length = 255)
    private String product;
    @Column(name = "REASON", nullable = true, length = 255)
    private String reason;
    @Column(name = "COSTS", nullable = true, length = 255)
    private String costs;
    @Column(name = "ISCOMPLETE", nullable = true)
    private Boolean isComplete;
    @Column(name = "APPROVED", nullable = true)
    private Boolean approved;

    public PurchaseReq() {
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

    public void setRequestorUsername(String requestorUsername) {
        this.requestorUsername = requestorUsername;
    }

    public String getRequestorUsername() {
        return requestorUsername;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public void setCosts(String costs) {
        this.costs = costs;
    }

    public String getCosts() {
        return costs;
    }

    public void setIsComplete(Boolean isComplete) {
        this.isComplete = isComplete;
    }

    public Boolean isIsComplete() {
        return isComplete;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public Boolean isApproved() {
        return approved;
    }

}
