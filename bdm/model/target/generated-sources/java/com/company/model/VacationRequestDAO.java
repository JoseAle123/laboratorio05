
package com.company.model;

import java.time.LocalDate;
import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface VacationRequestDAO
    extends BusinessObjectDAO
{


    public VacationRequest findByPersistenceId(Long persistenceId);

    public List<VacationRequest> findByRequesterBonitaBPMId(Long requesterBonitaBPMId, int startIndex, int maxResults);

    public List<VacationRequest> findByReviewerBonitaBPMId(Long reviewerBonitaBPMId, int startIndex, int maxResults);

    public List<VacationRequest> findByStartDate(LocalDate startDate, int startIndex, int maxResults);

    public List<VacationRequest> findByReturnDate(LocalDate returnDate, int startIndex, int maxResults);

    public List<VacationRequest> findByNumberOfDays(Integer numberOfDays, int startIndex, int maxResults);

    public List<VacationRequest> findByStatus(String status, int startIndex, int maxResults);

    public List<VacationRequest> findByComments(String comments, int startIndex, int maxResults);

    public List<VacationRequest> findByCalendarEventId(String calendarEventId, int startIndex, int maxResults);

    public List<VacationRequest> findByNewRequestProcessInstanceId(Long newRequestProcessInstanceId, int startIndex, int maxResults);

    public List<VacationRequest> find(int startIndex, int maxResults);

    public Long countForFindByRequesterBonitaBPMId(Long requesterBonitaBPMId);

    public Long countForFindByReviewerBonitaBPMId(Long reviewerBonitaBPMId);

    public Long countForFindByStartDate(LocalDate startDate);

    public Long countForFindByReturnDate(LocalDate returnDate);

    public Long countForFindByNumberOfDays(Integer numberOfDays);

    public Long countForFindByStatus(String status);

    public Long countForFindByComments(String comments);

    public Long countForFindByCalendarEventId(String calendarEventId);

    public Long countForFindByNewRequestProcessInstanceId(Long newRequestProcessInstanceId);

    public Long countForFind();

    public List<VacationRequest> findModifiableByBonitaBPMId(Long requesterBonitaBPMId, int startIndex, int maxResults);

    public List<VacationRequest> findCancellableByBonitaBPMId(Long requesterBonitaBPMId, int startIndex, int maxResults);

    public VacationRequest newInstance(Long requesterBonitaBPMId, LocalDate startDate, LocalDate returnDate, Integer numberOfDays, String status, Long newRequestProcessInstanceId);

}
