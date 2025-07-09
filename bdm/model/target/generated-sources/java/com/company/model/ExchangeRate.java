
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
@javax.persistence.Entity(name = "ExchangeRate")
@Table(name = "EXCHANGERATE")
@NamedQueries({
    @NamedQuery(name = "ExchangeRate.findByPersistenceId", query = "SELECT e\nFROM ExchangeRate e\nWHERE e.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "ExchangeRate.findByCurrencyCode", query = "SELECT e\nFROM ExchangeRate e\nWHERE e.currencyCode= :currencyCode\nORDER BY e.persistenceId"),
    @NamedQuery(name = "ExchangeRate.findByRateValue", query = "SELECT e\nFROM ExchangeRate e\nWHERE e.rateValue= :rateValue\nORDER BY e.persistenceId"),
    @NamedQuery(name = "ExchangeRate.find", query = "SELECT e\nFROM ExchangeRate e\nORDER BY e.persistenceId"),
    @NamedQuery(name = "ExchangeRate.countForFindByCurrencyCode", query = "SELECT COUNT(e)\nFROM ExchangeRate e\nWHERE e.currencyCode= :currencyCode\n"),
    @NamedQuery(name = "ExchangeRate.countForFindByRateValue", query = "SELECT COUNT(e)\nFROM ExchangeRate e\nWHERE e.rateValue= :rateValue\n"),
    @NamedQuery(name = "ExchangeRate.countForFind", query = "SELECT COUNT(e)\nFROM ExchangeRate e\n")
})
public class ExchangeRate implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
    @Column(name = "CURRENCYCODE", nullable = true, length = 255)
    private String currencyCode;
    @Column(name = "RATEVALUE", nullable = true, length = 255)
    private String rateValue;

    public ExchangeRate() {
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

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setRateValue(String rateValue) {
        this.rateValue = rateValue;
    }

    public String getRateValue() {
        return rateValue;
    }

}
