
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
@javax.persistence.Entity(name = "Proposal")
@Table(name = "PROPOSAL")
@NamedQueries({
    @NamedQuery(name = "Proposal.findByPersistenceId", query = "SELECT p\nFROM Proposal p\nWHERE p.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "Proposal.findByCustomer", query = "SELECT p\nFROM Proposal p\nWHERE p.customer= :customer\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Proposal.findByEmail", query = "SELECT p\nFROM Proposal p\nWHERE p.email= :email\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Proposal.findByInquiry_text", query = "SELECT p\nFROM Proposal p\nWHERE p.inquiry_text= :inquiry_text\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Proposal.findByDescription", query = "SELECT p\nFROM Proposal p\nWHERE p.description= :description\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Proposal.findByPrice", query = "SELECT p\nFROM Proposal p\nWHERE p.price= :price\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Proposal.findByComment", query = "SELECT p\nFROM Proposal p\nWHERE p.comment= :comment\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Proposal.findByStatus", query = "SELECT p\nFROM Proposal p\nWHERE p.status= :status\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Proposal.findByCaseId", query = "SELECT p\nFROM Proposal p\nWHERE p.caseId= :caseId\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Proposal.findByDecision", query = "SELECT p\nFROM Proposal p\nWHERE p.decision= :decision\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Proposal.find", query = "SELECT p\nFROM Proposal p\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Proposal.countForFindByCustomer", query = "SELECT COUNT(p)\nFROM Proposal p\nWHERE p.customer= :customer\n"),
    @NamedQuery(name = "Proposal.countForFindByEmail", query = "SELECT COUNT(p)\nFROM Proposal p\nWHERE p.email= :email\n"),
    @NamedQuery(name = "Proposal.countForFindByInquiry_text", query = "SELECT COUNT(p)\nFROM Proposal p\nWHERE p.inquiry_text= :inquiry_text\n"),
    @NamedQuery(name = "Proposal.countForFindByDescription", query = "SELECT COUNT(p)\nFROM Proposal p\nWHERE p.description= :description\n"),
    @NamedQuery(name = "Proposal.countForFindByPrice", query = "SELECT COUNT(p)\nFROM Proposal p\nWHERE p.price= :price\n"),
    @NamedQuery(name = "Proposal.countForFindByComment", query = "SELECT COUNT(p)\nFROM Proposal p\nWHERE p.comment= :comment\n"),
    @NamedQuery(name = "Proposal.countForFindByStatus", query = "SELECT COUNT(p)\nFROM Proposal p\nWHERE p.status= :status\n"),
    @NamedQuery(name = "Proposal.countForFindByCaseId", query = "SELECT COUNT(p)\nFROM Proposal p\nWHERE p.caseId= :caseId\n"),
    @NamedQuery(name = "Proposal.countForFindByDecision", query = "SELECT COUNT(p)\nFROM Proposal p\nWHERE p.decision= :decision\n"),
    @NamedQuery(name = "Proposal.countForFind", query = "SELECT COUNT(p)\nFROM Proposal p\n")
})
public class Proposal implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
    @Column(name = "CUSTOMER", nullable = false, length = 255)
    private String customer;
    @Column(name = "EMAIL", nullable = false, length = 255)
    private String email;
    @Column(name = "INQUIRY_TEXT", nullable = false, length = 255)
    private String inquiry_text;
    @Column(name = "DESCRIPTION", nullable = true, length = 255)
    private String description;
    @Column(name = "PRICE", nullable = true, length = 255)
    private String price;
    @Column(name = "COMMENT", nullable = true, length = 255)
    private String comment;
    @Column(name = "STATUS", nullable = true, length = 255)
    private String status;
    @Column(name = "CASEID", nullable = true)
    private Long caseId;
    @Column(name = "DECISION", nullable = true, length = 255)
    private String decision;

    public Proposal() {
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

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setInquiry_text(String inquiry_text) {
        this.inquiry_text = inquiry_text;
    }

    public String getInquiry_text() {
        return inquiry_text;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setCaseId(Long caseId) {
        this.caseId = caseId;
    }

    public Long getCaseId() {
        return caseId;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public String getDecision() {
        return decision;
    }

}
