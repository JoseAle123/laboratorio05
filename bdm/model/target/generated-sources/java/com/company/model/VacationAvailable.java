
package com.company.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.Parameter;


/**
 * The number of vacation days available to the specified employee.
 * 
 */
@javax.persistence.Entity(name = "VacationAvailable")
@org.hibernate.annotations.Table(appliesTo = "VACATIONAVAILABLE", indexes = {
    @Index(name = "INDEX_4", columnNames = {
        "BONITABPMID"
    })
})
@javax.persistence.Table(name = "VACATIONAVAILABLE", uniqueConstraints = {
    @UniqueConstraint(name = "UNIQUEBONITABPMID", columnNames = {
        "bonitaBPMId"
    })
})
@NamedQueries({
    @NamedQuery(name = "VacationAvailable.findByPersistenceId", query = "SELECT v\nFROM VacationAvailable v\nWHERE v.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "VacationAvailable.findByBonitaBPMId", query = "SELECT v\nFROM VacationAvailable v\nWHERE v.bonitaBPMId= :bonitaBPMId\n"),
    @NamedQuery(name = "VacationAvailable.findByDaysAvailableCounter", query = "SELECT v\nFROM VacationAvailable v\nWHERE v.daysAvailableCounter= :daysAvailableCounter\nORDER BY v.persistenceId"),
    @NamedQuery(name = "VacationAvailable.find", query = "SELECT v\nFROM VacationAvailable v\nORDER BY v.persistenceId"),
    @NamedQuery(name = "VacationAvailable.countForFindByDaysAvailableCounter", query = "SELECT COUNT(v)\nFROM VacationAvailable v\nWHERE v.daysAvailableCounter= :daysAvailableCounter\n"),
    @NamedQuery(name = "VacationAvailable.countForFind", query = "SELECT COUNT(v)\nFROM VacationAvailable v\n")
})
public class VacationAvailable implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
    @Column(name = "BONITABPMID", nullable = false)
    private Long bonitaBPMId;
    @Column(name = "DAYSAVAILABLECOUNTER", nullable = false)
    private Integer daysAvailableCounter;

    public VacationAvailable() {
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

    public void setBonitaBPMId(Long bonitaBPMId) {
        this.bonitaBPMId = bonitaBPMId;
    }

    public Long getBonitaBPMId() {
        return bonitaBPMId;
    }

    public void setDaysAvailableCounter(Integer daysAvailableCounter) {
        this.daysAvailableCounter = daysAvailableCounter;
    }

    public Integer getDaysAvailableCounter() {
        return daysAvailableCounter;
    }

}
