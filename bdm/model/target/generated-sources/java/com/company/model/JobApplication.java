
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
@javax.persistence.Entity(name = "JobApplication")
@Table(name = "JOBAPPLICATION")
@NamedQueries({
    @NamedQuery(name = "JobApplication.findByPersistenceId", query = "SELECT j\nFROM JobApplication j\nWHERE j.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "JobApplication.findByApplicantUsername", query = "SELECT j\nFROM JobApplication j\nWHERE j.applicantUsername= :applicantUsername\nORDER BY j.persistenceId"),
    @NamedQuery(name = "JobApplication.findByText", query = "SELECT j\nFROM JobApplication j\nWHERE j.text= :text\nORDER BY j.persistenceId"),
    @NamedQuery(name = "JobApplication.find", query = "SELECT j\nFROM JobApplication j\nORDER BY j.persistenceId"),
    @NamedQuery(name = "JobApplication.countForFindByApplicantUsername", query = "SELECT COUNT(j)\nFROM JobApplication j\nWHERE j.applicantUsername= :applicantUsername\n"),
    @NamedQuery(name = "JobApplication.countForFindByText", query = "SELECT COUNT(j)\nFROM JobApplication j\nWHERE j.text= :text\n"),
    @NamedQuery(name = "JobApplication.countForFind", query = "SELECT COUNT(j)\nFROM JobApplication j\n")
})
public class JobApplication implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
    @Column(name = "APPLICANTUSERNAME", nullable = true, length = 255)
    private String applicantUsername;
    @Column(name = "TEXT", nullable = true, length = 255)
    private String text;

    public JobApplication() {
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

    public void setApplicantUsername(String applicantUsername) {
        this.applicantUsername = applicantUsername;
    }

    public String getApplicantUsername() {
        return applicantUsername;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
