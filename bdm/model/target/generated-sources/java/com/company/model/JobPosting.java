
package com.company.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.Version;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


/**
 * 
 */
@javax.persistence.Entity(name = "JobPosting")
@Table(name = "JOBPOSTING")
@NamedQueries({
    @NamedQuery(name = "JobPosting.findByPersistenceId", query = "SELECT j\nFROM JobPosting j\nWHERE j.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "JobPosting.findByJobTitle", query = "SELECT j\nFROM JobPosting j\nWHERE j.jobTitle= :jobTitle\nORDER BY j.persistenceId"),
    @NamedQuery(name = "JobPosting.findByJobDescription", query = "SELECT j\nFROM JobPosting j\nWHERE j.jobDescription= :jobDescription\nORDER BY j.persistenceId"),
    @NamedQuery(name = "JobPosting.find", query = "SELECT j\nFROM JobPosting j\nORDER BY j.persistenceId"),
    @NamedQuery(name = "JobPosting.countForFindByJobTitle", query = "SELECT COUNT(j)\nFROM JobPosting j\nWHERE j.jobTitle= :jobTitle\n"),
    @NamedQuery(name = "JobPosting.countForFindByJobDescription", query = "SELECT COUNT(j)\nFROM JobPosting j\nWHERE j.jobDescription= :jobDescription\n"),
    @NamedQuery(name = "JobPosting.countForFind", query = "SELECT COUNT(j)\nFROM JobPosting j\n")
})
public class JobPosting implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
    @Column(name = "JOBTITLE", nullable = true, length = 255)
    private String jobTitle;
    @Column(name = "JOBDESCRIPTION", nullable = true, length = 255)
    private String jobDescription;
    @OneToMany(orphanRemoval = true, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "JOBPOSTING_PID", nullable = false)
    @OrderColumn
    private List<com.company.model.JobApplication> applications = new ArrayList<com.company.model.JobApplication>(10);

    public JobPosting() {
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

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setApplications(List<com.company.model.JobApplication> applications) {
        if (this.applications == null) {
            this.applications = applications;
        } else {
            List<com.company.model.JobApplication> copy = new ArrayList(applications);
            this.applications.clear();
            this.applications.addAll(copy);
        }
    }

    public List<com.company.model.JobApplication> getApplications() {
        return applications;
    }

    public void addToApplications(com.company.model.JobApplication addTo) {
        List applications = getApplications();
        applications.add(addTo);
    }

    public void removeFromApplications(com.company.model.JobApplication removeFrom) {
        List applications = getApplications();
        applications.remove(removeFrom);
    }

}
