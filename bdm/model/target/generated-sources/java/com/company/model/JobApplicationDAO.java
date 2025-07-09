
package com.company.model;

import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface JobApplicationDAO
    extends BusinessObjectDAO
{


    public JobApplication findByPersistenceId(Long persistenceId);

    public List<JobApplication> findByApplicantUsername(String applicantUsername, int startIndex, int maxResults);

    public List<JobApplication> findByText(String text, int startIndex, int maxResults);

    public List<JobApplication> find(int startIndex, int maxResults);

    public Long countForFindByApplicantUsername(String applicantUsername);

    public Long countForFindByText(String text);

    public Long countForFind();

    public JobApplication newInstance();

}
