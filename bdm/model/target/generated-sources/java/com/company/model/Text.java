
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
@javax.persistence.Entity(name = "Text")
@Table(name = "TEXT")
@NamedQueries({
    @NamedQuery(name = "Text.findByPersistenceId", query = "SELECT t\nFROM Text t\nWHERE t.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "Text.findByContent", query = "SELECT t\nFROM Text t\nWHERE t.content= :content\nORDER BY t.persistenceId"),
    @NamedQuery(name = "Text.findByStatus", query = "SELECT t\nFROM Text t\nWHERE t.status= :status\nORDER BY t.persistenceId"),
    @NamedQuery(name = "Text.find", query = "SELECT t\nFROM Text t\nORDER BY t.persistenceId"),
    @NamedQuery(name = "Text.countForFindByContent", query = "SELECT COUNT(t)\nFROM Text t\nWHERE t.content= :content\n"),
    @NamedQuery(name = "Text.countForFindByStatus", query = "SELECT COUNT(t)\nFROM Text t\nWHERE t.status= :status\n"),
    @NamedQuery(name = "Text.countForFind", query = "SELECT COUNT(t)\nFROM Text t\n")
})
public class Text implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
    @Column(name = "CONTENT", nullable = true, length = 255)
    private String content;
    @Column(name = "STATUS", nullable = true, length = 255)
    private String status;

    public Text() {
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

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

}
