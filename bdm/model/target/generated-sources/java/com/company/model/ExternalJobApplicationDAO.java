
package com.company.model;

import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface ExternalJobApplicationDAO
    extends BusinessObjectDAO
{


    public ExternalJobApplication findByPersistenceId(Long persistenceId);

    public List<ExternalJobApplication> findByApplicantUsername(String applicantUsername, int startIndex, int maxResults);

    public List<ExternalJobApplication> findByText(String text, int startIndex, int maxResults);

    public List<ExternalJobApplication> findByAnswer(String answer, int startIndex, int maxResults);

    public List<ExternalJobApplication> findByCancelled(Boolean cancelled, int startIndex, int maxResults);

    public List<ExternalJobApplication> findByCancellationMessage(String cancellationMessage, int startIndex, int maxResults);

    public List<ExternalJobApplication> find(int startIndex, int maxResults);

    public Long countForFindByApplicantUsername(String applicantUsername);

    public Long countForFindByText(String text);

    public Long countForFindByAnswer(String answer);

    public Long countForFindByCancelled(Boolean cancelled);

    public Long countForFindByCancellationMessage(String cancellationMessage);

    public Long countForFind();

    public ExternalJobApplication newInstance();

}
