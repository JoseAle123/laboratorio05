
package com.company.model;

import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface JobPostingDAO
    extends BusinessObjectDAO
{


    public JobPosting findByPersistenceId(Long persistenceId);

    public List<JobPosting> findByJobTitle(String jobTitle, int startIndex, int maxResults);

    public List<JobPosting> findByJobDescription(String jobDescription, int startIndex, int maxResults);

    public List<JobPosting> find(int startIndex, int maxResults);

    public Long countForFindByJobTitle(String jobTitle);

    public Long countForFindByJobDescription(String jobDescription);

    public Long countForFind();

    public JobPosting newInstance();

}
