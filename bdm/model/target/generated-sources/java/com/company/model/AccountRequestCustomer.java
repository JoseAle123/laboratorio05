
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
@javax.persistence.Entity(name = "AccountRequestCustomer")
@Table(name = "ACCOUNTREQUESTCUSTOMER")
@NamedQueries({
    @NamedQuery(name = "AccountRequestCustomer.findByPersistenceId", query = "SELECT a\nFROM AccountRequestCustomer a\nWHERE a.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "AccountRequestCustomer.findByRequestID", query = "SELECT a\nFROM AccountRequestCustomer a\nWHERE a.requestID= :requestID\nORDER BY a.persistenceId"),
    @NamedQuery(name = "AccountRequestCustomer.findByUsername", query = "SELECT a\nFROM AccountRequestCustomer a\nWHERE a.username= :username\nORDER BY a.persistenceId"),
    @NamedQuery(name = "AccountRequestCustomer.findByEmail", query = "SELECT a\nFROM AccountRequestCustomer a\nWHERE a.email= :email\nORDER BY a.persistenceId"),
    @NamedQuery(name = "AccountRequestCustomer.findByCmsAccessRequested", query = "SELECT a\nFROM AccountRequestCustomer a\nWHERE a.cmsAccessRequested= :cmsAccessRequested\nORDER BY a.persistenceId"),
    @NamedQuery(name = "AccountRequestCustomer.findByCrmAccessRequested", query = "SELECT a\nFROM AccountRequestCustomer a\nWHERE a.crmAccessRequested= :crmAccessRequested\nORDER BY a.persistenceId"),
    @NamedQuery(name = "AccountRequestCustomer.findByErpAccessRequested", query = "SELECT a\nFROM AccountRequestCustomer a\nWHERE a.erpAccessRequested= :erpAccessRequested\nORDER BY a.persistenceId"),
    @NamedQuery(name = "AccountRequestCustomer.findByRequestAccepted", query = "SELECT a\nFROM AccountRequestCustomer a\nWHERE a.requestAccepted= :requestAccepted\nORDER BY a.persistenceId"),
    @NamedQuery(name = "AccountRequestCustomer.findByMessageFromIT", query = "SELECT a\nFROM AccountRequestCustomer a\nWHERE a.messageFromIT= :messageFromIT\nORDER BY a.persistenceId"),
    @NamedQuery(name = "AccountRequestCustomer.find", query = "SELECT a\nFROM AccountRequestCustomer a\nORDER BY a.persistenceId"),
    @NamedQuery(name = "AccountRequestCustomer.countForFindByRequestID", query = "SELECT COUNT(a)\nFROM AccountRequestCustomer a\nWHERE a.requestID= :requestID\n"),
    @NamedQuery(name = "AccountRequestCustomer.countForFindByUsername", query = "SELECT COUNT(a)\nFROM AccountRequestCustomer a\nWHERE a.username= :username\n"),
    @NamedQuery(name = "AccountRequestCustomer.countForFindByEmail", query = "SELECT COUNT(a)\nFROM AccountRequestCustomer a\nWHERE a.email= :email\n"),
    @NamedQuery(name = "AccountRequestCustomer.countForFindByCmsAccessRequested", query = "SELECT COUNT(a)\nFROM AccountRequestCustomer a\nWHERE a.cmsAccessRequested= :cmsAccessRequested\n"),
    @NamedQuery(name = "AccountRequestCustomer.countForFindByCrmAccessRequested", query = "SELECT COUNT(a)\nFROM AccountRequestCustomer a\nWHERE a.crmAccessRequested= :crmAccessRequested\n"),
    @NamedQuery(name = "AccountRequestCustomer.countForFindByErpAccessRequested", query = "SELECT COUNT(a)\nFROM AccountRequestCustomer a\nWHERE a.erpAccessRequested= :erpAccessRequested\n"),
    @NamedQuery(name = "AccountRequestCustomer.countForFindByRequestAccepted", query = "SELECT COUNT(a)\nFROM AccountRequestCustomer a\nWHERE a.requestAccepted= :requestAccepted\n"),
    @NamedQuery(name = "AccountRequestCustomer.countForFindByMessageFromIT", query = "SELECT COUNT(a)\nFROM AccountRequestCustomer a\nWHERE a.messageFromIT= :messageFromIT\n"),
    @NamedQuery(name = "AccountRequestCustomer.countForFind", query = "SELECT COUNT(a)\nFROM AccountRequestCustomer a\n")
})
public class AccountRequestCustomer implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
    @Column(name = "REQUESTID", nullable = true)
    private Long requestID;
    @Column(name = "USERNAME", nullable = true, length = 255)
    private String username;
    @Column(name = "EMAIL", nullable = true, length = 255)
    private String email;
    @Column(name = "CMSACCESSREQUESTED", nullable = true)
    private Boolean cmsAccessRequested;
    @Column(name = "CRMACCESSREQUESTED", nullable = true)
    private Boolean crmAccessRequested;
    @Column(name = "ERPACCESSREQUESTED", nullable = true)
    private Boolean erpAccessRequested;
    @Column(name = "REQUESTACCEPTED", nullable = true)
    private Boolean requestAccepted;
    @Column(name = "MESSAGEFROMIT", nullable = true, length = 255)
    private String messageFromIT;

    public AccountRequestCustomer() {
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

    public void setRequestID(Long requestID) {
        this.requestID = requestID;
    }

    public Long getRequestID() {
        return requestID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setCmsAccessRequested(Boolean cmsAccessRequested) {
        this.cmsAccessRequested = cmsAccessRequested;
    }

    public Boolean isCmsAccessRequested() {
        return cmsAccessRequested;
    }

    public void setCrmAccessRequested(Boolean crmAccessRequested) {
        this.crmAccessRequested = crmAccessRequested;
    }

    public Boolean isCrmAccessRequested() {
        return crmAccessRequested;
    }

    public void setErpAccessRequested(Boolean erpAccessRequested) {
        this.erpAccessRequested = erpAccessRequested;
    }

    public Boolean isErpAccessRequested() {
        return erpAccessRequested;
    }

    public void setRequestAccepted(Boolean requestAccepted) {
        this.requestAccepted = requestAccepted;
    }

    public Boolean isRequestAccepted() {
        return requestAccepted;
    }

    public void setMessageFromIT(String messageFromIT) {
        this.messageFromIT = messageFromIT;
    }

    public String getMessageFromIT() {
        return messageFromIT;
    }

}
