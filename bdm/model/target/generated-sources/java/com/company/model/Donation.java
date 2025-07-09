
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
@javax.persistence.Entity(name = "Donation")
@Table(name = "DONATION")
@NamedQueries({
    @NamedQuery(name = "Donation.findByPersistenceId", query = "SELECT d\nFROM Donation d\nWHERE d.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "Donation.findByAmount", query = "SELECT d\nFROM Donation d\nWHERE d.amount= :amount\nORDER BY d.persistenceId"),
    @NamedQuery(name = "Donation.find", query = "SELECT d\nFROM Donation d\nORDER BY d.persistenceId"),
    @NamedQuery(name = "Donation.countForFindByAmount", query = "SELECT COUNT(d)\nFROM Donation d\nWHERE d.amount= :amount\n"),
    @NamedQuery(name = "Donation.countForFind", query = "SELECT COUNT(d)\nFROM Donation d\n"),
    @NamedQuery(name = "Donation.getTotal", query = "SELECT SUM(d.amount)\r\nFROM Donation d \r\n")
})
public class Donation implements org.bonitasoft.engine.bdm.Entity
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

    public Donation() {
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

}
