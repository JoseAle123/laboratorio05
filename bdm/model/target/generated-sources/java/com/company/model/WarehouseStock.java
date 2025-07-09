
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
@javax.persistence.Entity(name = "WarehouseStock")
@Table(name = "WAREHOUSESTOCK")
@NamedQueries({
    @NamedQuery(name = "WarehouseStock.findByPersistenceId", query = "SELECT w\nFROM WarehouseStock w\nWHERE w.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "WarehouseStock.findByAmount", query = "SELECT w\nFROM WarehouseStock w\nWHERE w.amount= :amount\nORDER BY w.persistenceId"),
    @NamedQuery(name = "WarehouseStock.find", query = "SELECT w\nFROM WarehouseStock w\nORDER BY w.persistenceId"),
    @NamedQuery(name = "WarehouseStock.countForFindByAmount", query = "SELECT COUNT(w)\nFROM WarehouseStock w\nWHERE w.amount= :amount\n"),
    @NamedQuery(name = "WarehouseStock.countForFind", query = "SELECT COUNT(w)\nFROM WarehouseStock w\n")
})
public class WarehouseStock implements org.bonitasoft.engine.bdm.Entity
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

    public WarehouseStock() {
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
