
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
@javax.persistence.Entity(name = "ProjectProposal")
@Table(name = "PROJECTPROPOSAL")
@NamedQueries({
    @NamedQuery(name = "ProjectProposal.findByPersistenceId", query = "SELECT p\nFROM ProjectProposal p\nWHERE p.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "ProjectProposal.findByText", query = "SELECT p\nFROM ProjectProposal p\nWHERE p.text= :text\nORDER BY p.persistenceId"),
    @NamedQuery(name = "ProjectProposal.findByAssessmentRegionalBranch", query = "SELECT p\nFROM ProjectProposal p\nWHERE p.assessmentRegionalBranch= :assessmentRegionalBranch\nORDER BY p.persistenceId"),
    @NamedQuery(name = "ProjectProposal.findByAssessmentNationalBranch", query = "SELECT p\nFROM ProjectProposal p\nWHERE p.assessmentNationalBranch= :assessmentNationalBranch\nORDER BY p.persistenceId"),
    @NamedQuery(name = "ProjectProposal.findByAssessmentHQ", query = "SELECT p\nFROM ProjectProposal p\nWHERE p.assessmentHQ= :assessmentHQ\nORDER BY p.persistenceId"),
    @NamedQuery(name = "ProjectProposal.findByConsolidatedAssessment", query = "SELECT p\nFROM ProjectProposal p\nWHERE p.consolidatedAssessment= :consolidatedAssessment\nORDER BY p.persistenceId"),
    @NamedQuery(name = "ProjectProposal.find", query = "SELECT p\nFROM ProjectProposal p\nORDER BY p.persistenceId"),
    @NamedQuery(name = "ProjectProposal.countForFindByText", query = "SELECT COUNT(p)\nFROM ProjectProposal p\nWHERE p.text= :text\n"),
    @NamedQuery(name = "ProjectProposal.countForFindByAssessmentRegionalBranch", query = "SELECT COUNT(p)\nFROM ProjectProposal p\nWHERE p.assessmentRegionalBranch= :assessmentRegionalBranch\n"),
    @NamedQuery(name = "ProjectProposal.countForFindByAssessmentNationalBranch", query = "SELECT COUNT(p)\nFROM ProjectProposal p\nWHERE p.assessmentNationalBranch= :assessmentNationalBranch\n"),
    @NamedQuery(name = "ProjectProposal.countForFindByAssessmentHQ", query = "SELECT COUNT(p)\nFROM ProjectProposal p\nWHERE p.assessmentHQ= :assessmentHQ\n"),
    @NamedQuery(name = "ProjectProposal.countForFindByConsolidatedAssessment", query = "SELECT COUNT(p)\nFROM ProjectProposal p\nWHERE p.consolidatedAssessment= :consolidatedAssessment\n"),
    @NamedQuery(name = "ProjectProposal.countForFind", query = "SELECT COUNT(p)\nFROM ProjectProposal p\n")
})
public class ProjectProposal implements org.bonitasoft.engine.bdm.Entity
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
    @Column(name = "ASSESSMENTREGIONALBRANCH", nullable = true, length = 255)
    private String assessmentRegionalBranch;
    @Column(name = "ASSESSMENTNATIONALBRANCH", nullable = true, length = 255)
    private String assessmentNationalBranch;
    @Column(name = "ASSESSMENTHQ", nullable = true, length = 255)
    private String assessmentHQ;
    @Column(name = "CONSOLIDATEDASSESSMENT", nullable = true, length = 255)
    private String consolidatedAssessment;

    public ProjectProposal() {
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

    public void setAssessmentRegionalBranch(String assessmentRegionalBranch) {
        this.assessmentRegionalBranch = assessmentRegionalBranch;
    }

    public String getAssessmentRegionalBranch() {
        return assessmentRegionalBranch;
    }

    public void setAssessmentNationalBranch(String assessmentNationalBranch) {
        this.assessmentNationalBranch = assessmentNationalBranch;
    }

    public String getAssessmentNationalBranch() {
        return assessmentNationalBranch;
    }

    public void setAssessmentHQ(String assessmentHQ) {
        this.assessmentHQ = assessmentHQ;
    }

    public String getAssessmentHQ() {
        return assessmentHQ;
    }

    public void setConsolidatedAssessment(String consolidatedAssessment) {
        this.consolidatedAssessment = consolidatedAssessment;
    }

    public String getConsolidatedAssessment() {
        return consolidatedAssessment;
    }

}
