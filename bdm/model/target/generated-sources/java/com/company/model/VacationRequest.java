
package com.company.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Version;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.Parameter;


/**
 * An employee vacation request.
 * Possible status values are: pending, approved, refused, processing cancellation and cancelled.
 * 
 */
@javax.persistence.Entity(name = "VacationRequest")
@org.hibernate.annotations.Table(appliesTo = "VACATIONREQUEST", indexes = {
    @Index(name = "INDEX_1", columnNames = {
        "REQUESTERBONITABPMID"
    }),
    @Index(name = "INDEX_2", columnNames = {
        "REQUESTERBONITABPMID",
        "STATUS"
    }),
    @Index(name = "INDEX_3", columnNames = {
        "REQUESTERBONITABPMID",
        "STATUS",
        "STARTDATE"
    })
})
@javax.persistence.Table(name = "VACATIONREQUEST")
@NamedQueries({
    @NamedQuery(name = "VacationRequest.findByPersistenceId", query = "SELECT v\nFROM VacationRequest v\nWHERE v.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "VacationRequest.findByRequesterBonitaBPMId", query = "SELECT v\nFROM VacationRequest v\nWHERE v.requesterBonitaBPMId= :requesterBonitaBPMId\nORDER BY v.persistenceId"),
    @NamedQuery(name = "VacationRequest.findByReviewerBonitaBPMId", query = "SELECT v\nFROM VacationRequest v\nWHERE v.reviewerBonitaBPMId= :reviewerBonitaBPMId\nORDER BY v.persistenceId"),
    @NamedQuery(name = "VacationRequest.findByStartDate", query = "SELECT v\nFROM VacationRequest v\nWHERE v.startDate= :startDate\nORDER BY v.persistenceId"),
    @NamedQuery(name = "VacationRequest.findByReturnDate", query = "SELECT v\nFROM VacationRequest v\nWHERE v.returnDate= :returnDate\nORDER BY v.persistenceId"),
    @NamedQuery(name = "VacationRequest.findByNumberOfDays", query = "SELECT v\nFROM VacationRequest v\nWHERE v.numberOfDays= :numberOfDays\nORDER BY v.persistenceId"),
    @NamedQuery(name = "VacationRequest.findByStatus", query = "SELECT v\nFROM VacationRequest v\nWHERE v.status= :status\nORDER BY v.persistenceId"),
    @NamedQuery(name = "VacationRequest.findByComments", query = "SELECT v\nFROM VacationRequest v\nWHERE v.comments= :comments\nORDER BY v.persistenceId"),
    @NamedQuery(name = "VacationRequest.findByCalendarEventId", query = "SELECT v\nFROM VacationRequest v\nWHERE v.calendarEventId= :calendarEventId\nORDER BY v.persistenceId"),
    @NamedQuery(name = "VacationRequest.findByNewRequestProcessInstanceId", query = "SELECT v\nFROM VacationRequest v\nWHERE v.newRequestProcessInstanceId= :newRequestProcessInstanceId\nORDER BY v.persistenceId"),
    @NamedQuery(name = "VacationRequest.find", query = "SELECT v\nFROM VacationRequest v\nORDER BY v.persistenceId"),
    @NamedQuery(name = "VacationRequest.countForFindByRequesterBonitaBPMId", query = "SELECT COUNT(v)\nFROM VacationRequest v\nWHERE v.requesterBonitaBPMId= :requesterBonitaBPMId\n"),
    @NamedQuery(name = "VacationRequest.countForFindByReviewerBonitaBPMId", query = "SELECT COUNT(v)\nFROM VacationRequest v\nWHERE v.reviewerBonitaBPMId= :reviewerBonitaBPMId\n"),
    @NamedQuery(name = "VacationRequest.countForFindByStartDate", query = "SELECT COUNT(v)\nFROM VacationRequest v\nWHERE v.startDate= :startDate\n"),
    @NamedQuery(name = "VacationRequest.countForFindByReturnDate", query = "SELECT COUNT(v)\nFROM VacationRequest v\nWHERE v.returnDate= :returnDate\n"),
    @NamedQuery(name = "VacationRequest.countForFindByNumberOfDays", query = "SELECT COUNT(v)\nFROM VacationRequest v\nWHERE v.numberOfDays= :numberOfDays\n"),
    @NamedQuery(name = "VacationRequest.countForFindByStatus", query = "SELECT COUNT(v)\nFROM VacationRequest v\nWHERE v.status= :status\n"),
    @NamedQuery(name = "VacationRequest.countForFindByComments", query = "SELECT COUNT(v)\nFROM VacationRequest v\nWHERE v.comments= :comments\n"),
    @NamedQuery(name = "VacationRequest.countForFindByCalendarEventId", query = "SELECT COUNT(v)\nFROM VacationRequest v\nWHERE v.calendarEventId= :calendarEventId\n"),
    @NamedQuery(name = "VacationRequest.countForFindByNewRequestProcessInstanceId", query = "SELECT COUNT(v)\nFROM VacationRequest v\nWHERE v.newRequestProcessInstanceId= :newRequestProcessInstanceId\n"),
    @NamedQuery(name = "VacationRequest.countForFind", query = "SELECT COUNT(v)\nFROM VacationRequest v\n"),
    @NamedQuery(name = "VacationRequest.findModifiableByBonitaBPMId", query = "SELECT l \r\nFROM VacationRequest l \r\nWHERE l.requesterBonitaBPMId = :requesterBonitaBPMId\r\nAND l.startDate > CURRENT_DATE\r\nAND l.status IN('pending')\r\nORDER BY l.startDate ASC"),
    @NamedQuery(name = "VacationRequest.findCancellableByBonitaBPMId", query = "SELECT l \r\nFROM VacationRequest l \r\nWHERE l.requesterBonitaBPMId = :requesterBonitaBPMId\r\nAND l.status IN('pending', 'approved')\r\nORDER BY l.startDate ASC")
})
public class VacationRequest implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
    @Column(name = "REQUESTERBONITABPMID", nullable = false)
    private Long requesterBonitaBPMId;
    @Column(name = "REVIEWERBONITABPMID", nullable = true)
    private Long reviewerBonitaBPMId;
    @Column(name = "STARTDATE", nullable = false, length = 10)
    @Convert(converter = org.bonitasoft.engine.business.data.generator.DateConverter.class)
    private LocalDate startDate;
    @Column(name = "RETURNDATE", nullable = false, length = 10)
    @Convert(converter = org.bonitasoft.engine.business.data.generator.DateConverter.class)
    private LocalDate returnDate;
    @Column(name = "NUMBEROFDAYS", nullable = false)
    private Integer numberOfDays;
    @Column(name = "STATUS", nullable = false, length = 255)
    private String status;
    @Column(name = "COMMENTS", nullable = true, length = 255)
    private String comments;
    @Column(name = "CALENDAREVENTID", nullable = true, length = 255)
    private String calendarEventId;
    @Column(name = "NEWREQUESTPROCESSINSTANCEID", nullable = false)
    private Long newRequestProcessInstanceId;

    public VacationRequest() {
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

    public void setRequesterBonitaBPMId(Long requesterBonitaBPMId) {
        this.requesterBonitaBPMId = requesterBonitaBPMId;
    }

    public Long getRequesterBonitaBPMId() {
        return requesterBonitaBPMId;
    }

    public void setReviewerBonitaBPMId(Long reviewerBonitaBPMId) {
        this.reviewerBonitaBPMId = reviewerBonitaBPMId;
    }

    public Long getReviewerBonitaBPMId() {
        return reviewerBonitaBPMId;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setNumberOfDays(Integer numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public Integer getNumberOfDays() {
        return numberOfDays;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getComments() {
        return comments;
    }

    public void setCalendarEventId(String calendarEventId) {
        this.calendarEventId = calendarEventId;
    }

    public String getCalendarEventId() {
        return calendarEventId;
    }

    public void setNewRequestProcessInstanceId(Long newRequestProcessInstanceId) {
        this.newRequestProcessInstanceId = newRequestProcessInstanceId;
    }

    public Long getNewRequestProcessInstanceId() {
        return newRequestProcessInstanceId;
    }

}
