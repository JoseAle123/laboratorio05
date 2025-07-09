
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
@javax.persistence.Entity(name = "ProductDescription")
@Table(name = "PRODUCTDESCRIPTION")
@NamedQueries({
    @NamedQuery(name = "ProductDescription.findByPersistenceId", query = "SELECT p\nFROM ProductDescription p\nWHERE p.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "ProductDescription.findByText", query = "SELECT p\nFROM ProductDescription p\nWHERE p.text= :text\nORDER BY p.persistenceId"),
    @NamedQuery(name = "ProductDescription.findByHardwareSpec", query = "SELECT p\nFROM ProductDescription p\nWHERE p.hardwareSpec= :hardwareSpec\nORDER BY p.persistenceId"),
    @NamedQuery(name = "ProductDescription.findBySoftwareSpec", query = "SELECT p\nFROM ProductDescription p\nWHERE p.softwareSpec= :softwareSpec\nORDER BY p.persistenceId"),
    @NamedQuery(name = "ProductDescription.find", query = "SELECT p\nFROM ProductDescription p\nORDER BY p.persistenceId"),
    @NamedQuery(name = "ProductDescription.countForFindByText", query = "SELECT COUNT(p)\nFROM ProductDescription p\nWHERE p.text= :text\n"),
    @NamedQuery(name = "ProductDescription.countForFindByHardwareSpec", query = "SELECT COUNT(p)\nFROM ProductDescription p\nWHERE p.hardwareSpec= :hardwareSpec\n"),
    @NamedQuery(name = "ProductDescription.countForFindBySoftwareSpec", query = "SELECT COUNT(p)\nFROM ProductDescription p\nWHERE p.softwareSpec= :softwareSpec\n"),
    @NamedQuery(name = "ProductDescription.countForFind", query = "SELECT COUNT(p)\nFROM ProductDescription p\n")
})
public class ProductDescription implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
    @Column(name = "TEXT", nullable = true, length = 255)
    private String text;
    @Column(name = "HARDWARESPEC", nullable = true, length = 255)
    private String hardwareSpec;
    @Column(name = "SOFTWARESPEC", nullable = true, length = 255)
    private String softwareSpec;

    public ProductDescription() {
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

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setHardwareSpec(String hardwareSpec) {
        this.hardwareSpec = hardwareSpec;
    }

    public String getHardwareSpec() {
        return hardwareSpec;
    }

    public void setSoftwareSpec(String softwareSpec) {
        this.softwareSpec = softwareSpec;
    }

    public String getSoftwareSpec() {
        return softwareSpec;
    }

}
