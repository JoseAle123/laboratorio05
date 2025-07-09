
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
@javax.persistence.Entity(name = "AccountRequestIT")
@Table(name = "ACCOUNTREQUESTIT")
@NamedQueries({
    @NamedQuery(name = "AccountRequestIT.findByPersistenceId", query = "SELECT a\nFROM AccountRequestIT a\nWHERE a.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "AccountRequestIT.findByCustomerRequestID", query = "SELECT a\nFROM AccountRequestIT a\nWHERE a.customerRequestID= :customerRequestID\nORDER BY a.persistenceId"),
    @NamedQuery(name = "AccountRequestIT.findByCustomerUsername", query = "SELECT a\nFROM AccountRequestIT a\nWHERE a.customerUsername= :customerUsername\nORDER BY a.persistenceId"),
    @NamedQuery(name = "AccountRequestIT.findByCustomerEmail", query = "SELECT a\nFROM AccountRequestIT a\nWHERE a.customerEmail= :customerEmail\nORDER BY a.persistenceId"),
    @NamedQuery(name = "AccountRequestIT.findByCmsAccessRequested", query = "SELECT a\nFROM AccountRequestIT a\nWHERE a.cmsAccessRequested= :cmsAccessRequested\nORDER BY a.persistenceId"),
    @NamedQuery(name = "AccountRequestIT.findByCrmAccessRequested", query = "SELECT a\nFROM AccountRequestIT a\nWHERE a.crmAccessRequested= :crmAccessRequested\nORDER BY a.persistenceId"),
    @NamedQuery(name = "AccountRequestIT.findByErpAccessRequested", query = "SELECT a\nFROM AccountRequestIT a\nWHERE a.erpAccessRequested= :erpAccessRequested\nORDER BY a.persistenceId"),
    @NamedQuery(name = "AccountRequestIT.findByRequestComplete", query = "SELECT a\nFROM AccountRequestIT a\nWHERE a.requestComplete= :requestComplete\nORDER BY a.persistenceId"),
    @NamedQuery(name = "AccountRequestIT.findByMessageToCustomer", query = "SELECT a\nFROM AccountRequestIT a\nWHERE a.messageToCustomer= :messageToCustomer\nORDER BY a.persistenceId"),
    @NamedQuery(name = "AccountRequestIT.find", query = "SELECT a\nFROM AccountRequestIT a\nORDER BY a.persistenceId"),
    @NamedQuery(name = "AccountRequestIT.countForFindByCustomerRequestID", query = "SELECT COUNT(a)\nFROM AccountRequestIT a\nWHERE a.customerRequestID= :customerRequestID\n"),
    @NamedQuery(name = "AccountRequestIT.countForFindByCustomerUsername", query = "SELECT COUNT(a)\nFROM AccountRequestIT a\nWHERE a.customerUsername= :customerUsername\n"),
    @NamedQuery(name = "AccountRequestIT.countForFindByCustomerEmail", query = "SELECT COUNT(a)\nFROM AccountRequestIT a\nWHERE a.customerEmail= :customerEmail\n"),
    @NamedQuery(name = "AccountRequestIT.countForFindByCmsAccessRequested", query = "SELECT COUNT(a)\nFROM AccountRequestIT a\nWHERE a.cmsAccessRequested= :cmsAccessRequested\n"),
    @NamedQuery(name = "AccountRequestIT.countForFindByCrmAccessRequested", query = "SELECT COUNT(a)\nFROM AccountRequestIT a\nWHERE a.crmAccessRequested= :crmAccessRequested\n"),
    @NamedQuery(name = "AccountRequestIT.countForFindByErpAccessRequested", query = "SELECT COUNT(a)\nFROM AccountRequestIT a\nWHERE a.erpAccessRequested= :erpAccessRequested\n"),
    @NamedQuery(name = "AccountRequestIT.countForFindByRequestComplete", query = "SELECT COUNT(a)\nFROM AccountRequestIT a\nWHERE a.requestComplete= :requestComplete\n"),
    @NamedQuery(name = "AccountRequestIT.countForFindByMessageToCustomer", query = "SELECT COUNT(a)\nFROM AccountRequestIT a\nWHERE a.messageToCustomer= :messageToCustomer\n"),
    @NamedQuery(name = "AccountRequestIT.countForFind", query = "SELECT COUNT(a)\nFROM AccountRequestIT a\n")
})
public class AccountRequestIT implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
    @Column(name = "CUSTOMERREQUESTID", nullable = true)
    private Long customerRequestID;
    @Column(name = "CUSTOMERUSERNAME", nullable = true, length = 255)
    private String customerUsername;
    @Column(name = "CUSTOMEREMAIL", nullable = true, length = 255)
    private String customerEmail;
    @Column(name = "CMSACCESSREQUESTED", nullable = true)
    private Boolean cmsAccessRequested;
    @Column(name = "CRMACCESSREQUESTED", nullable = true)
    private Boolean crmAccessRequested;
    @Column(name = "ERPACCESSREQUESTED", nullable = true)
    private Boolean erpAccessRequested;
    @Column(name = "REQUESTCOMPLETE", nullable = true)
    private Boolean requestComplete;
    @Column(name = "MESSAGETOCUSTOMER", nullable = true, length = 255)
    private String messageToCustomer;

    public AccountRequestIT() {
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

    public void setCustomerRequestID(Long customerRequestID) {
        this.customerRequestID = customerRequestID;
    }

    public Long getCustomerRequestID() {
        return customerRequestID;
    }

    public void setCustomerUsername(String customerUsername) {
        this.customerUsername = customerUsername;
    }

    public String getCustomerUsername() {
        return customerUsername;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerEmail() {
        return customerEmail;
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

    public void setRequestComplete(Boolean requestComplete) {
        this.requestComplete = requestComplete;
    }

    public Boolean isRequestComplete() {
        return requestComplete;
    }

    public void setMessageToCustomer(String messageToCustomer) {
        this.messageToCustomer = messageToCustomer;
    }

    public String getMessageToCustomer() {
        return messageToCustomer;
    }

}
