
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
@javax.persistence.Entity(name = "Customer")
@Table(name = "CUSTOMER")
@NamedQueries({
    @NamedQuery(name = "Customer.findByPersistenceId", query = "SELECT c\nFROM Customer c\nWHERE c.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "Customer.findByFirstName", query = "SELECT c\nFROM Customer c\nWHERE c.firstName= :firstName\nORDER BY c.persistenceId"),
    @NamedQuery(name = "Customer.findByLastName", query = "SELECT c\nFROM Customer c\nWHERE c.lastName= :lastName\nORDER BY c.persistenceId"),
    @NamedQuery(name = "Customer.findByDedicatedSalesAdmin", query = "SELECT c\nFROM Customer c\nWHERE c.dedicatedSalesAdmin= :dedicatedSalesAdmin\nORDER BY c.persistenceId"),
    @NamedQuery(name = "Customer.find", query = "SELECT c\nFROM Customer c\nORDER BY c.persistenceId"),
    @NamedQuery(name = "Customer.countForFindByFirstName", query = "SELECT COUNT(c)\nFROM Customer c\nWHERE c.firstName= :firstName\n"),
    @NamedQuery(name = "Customer.countForFindByLastName", query = "SELECT COUNT(c)\nFROM Customer c\nWHERE c.lastName= :lastName\n"),
    @NamedQuery(name = "Customer.countForFindByDedicatedSalesAdmin", query = "SELECT COUNT(c)\nFROM Customer c\nWHERE c.dedicatedSalesAdmin= :dedicatedSalesAdmin\n"),
    @NamedQuery(name = "Customer.countForFind", query = "SELECT COUNT(c)\nFROM Customer c\n")
})
public class Customer implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
    @Column(name = "FIRSTNAME", nullable = true, length = 255)
    private String firstName;
    @Column(name = "LASTNAME", nullable = true, length = 255)
    private String lastName;
    @Column(name = "DEDICATEDSALESADMIN", nullable = true, length = 255)
    private String dedicatedSalesAdmin;

    public Customer() {
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDedicatedSalesAdmin(String dedicatedSalesAdmin) {
        this.dedicatedSalesAdmin = dedicatedSalesAdmin;
    }

    public String getDedicatedSalesAdmin() {
        return dedicatedSalesAdmin;
    }

}
