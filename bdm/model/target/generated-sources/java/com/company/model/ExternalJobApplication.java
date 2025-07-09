
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
@javax.persistence.Entity(name = "ExternalJobApplication")
@Table(name = "EXTERNALJOBAPPLICATION")
@NamedQueries({
    @NamedQuery(name = "ExternalJobApplication.findByPersistenceId", query = "SELECT e\nFROM ExternalJobApplication e\nWHERE e.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "ExternalJobApplication.findByApplicantUsername", query = "SELECT e\nFROM ExternalJobApplication e\nWHERE e.applicantUsername= :applicantUsername\nORDER BY e.persistenceId"),
    @NamedQuery(name = "ExternalJobApplication.findByText", query = "SELECT e\nFROM ExternalJobApplication e\nWHERE e.text= :text\nORDER BY e.persistenceId"),
    @NamedQuery(name = "ExternalJobApplication.findByAnswer", query = "SELECT e\nFROM ExternalJobApplication e\nWHERE e.answer= :answer\nORDER BY e.persistenceId"),
    @NamedQuery(name = "ExternalJobApplication.findByCancelled", query = "SELECT e\nFROM ExternalJobApplication e\nWHERE e.cancelled= :cancelled\nORDER BY e.persistenceId"),
    @NamedQuery(name = "ExternalJobApplication.findByCancellationMessage", query = "SELECT e\nFROM ExternalJobApplication e\nWHERE e.cancellationMessage= :cancellationMessage\nORDER BY e.persistenceId"),
    @NamedQuery(name = "ExternalJobApplication.find", query = "SELECT e\nFROM ExternalJobApplication e\nORDER BY e.persistenceId"),
    @NamedQuery(name = "ExternalJobApplication.countForFindByApplicantUsername", query = "SELECT COUNT(e)\nFROM ExternalJobApplication e\nWHERE e.applicantUsername= :applicantUsername\n"),
    @NamedQuery(name = "ExternalJobApplication.countForFindByText", query = "SELECT COUNT(e)\nFROM ExternalJobApplication e\nWHERE e.text= :text\n"),
    @NamedQuery(name = "ExternalJobApplication.countForFindByAnswer", query = "SELECT COUNT(e)\nFROM ExternalJobApplication e\nWHERE e.answer= :answer\n"),
    @NamedQuery(name = "ExternalJobApplication.countForFindByCancelled", query = "SELECT COUNT(e)\nFROM ExternalJobApplication e\nWHERE e.cancelled= :cancelled\n"),
    @NamedQuery(name = "ExternalJobApplication.countForFindByCancellationMessage", query = "SELECT COUNT(e)\nFROM ExternalJobApplication e\nWHERE e.cancellationMessage= :cancellationMessage\n"),
    @NamedQuery(name = "ExternalJobApplication.countForFind", query = "SELECT COUNT(e)\nFROM ExternalJobApplication e\n")
})
public class ExternalJobApplication implements org.bonitasoft.engine.bdm.Entity
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
    @Column(name = "ANSWER", nullable = true, length = 255)
    private String answer;
    @Column(name = "CANCELLED", nullable = true)
    private Boolean cancelled;
    @Column(name = "CANCELLATIONMESSAGE", nullable = true, length = 255)
    private String cancellationMessage;

    public ExternalJobApplication() {
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

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setCancelled(Boolean cancelled) {
        this.cancelled = cancelled;
    }

    public Boolean isCancelled() {
        return cancelled;
    }

    public void setCancellationMessage(String cancellationMessage) {
        this.cancellationMessage = cancellationMessage;
    }

    public String getCancellationMessage() {
        return cancellationMessage;
    }

}
