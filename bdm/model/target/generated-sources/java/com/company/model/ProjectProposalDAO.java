
package com.company.model;

import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface ProjectProposalDAO
    extends BusinessObjectDAO
{


    public ProjectProposal findByPersistenceId(Long persistenceId);

    public List<ProjectProposal> findByText(String text, int startIndex, int maxResults);

    public List<ProjectProposal> findByAssessmentRegionalBranch(String assessmentRegionalBranch, int startIndex, int maxResults);

    public List<ProjectProposal> findByAssessmentNationalBranch(String assessmentNationalBranch, int startIndex, int maxResults);

    public List<ProjectProposal> findByAssessmentHQ(String assessmentHQ, int startIndex, int maxResults);

    public List<ProjectProposal> findByConsolidatedAssessment(String consolidatedAssessment, int startIndex, int maxResults);

    public List<ProjectProposal> find(int startIndex, int maxResults);

    public Long countForFindByText(String text);

    public Long countForFindByAssessmentRegionalBranch(String assessmentRegionalBranch);

    public Long countForFindByAssessmentNationalBranch(String assessmentNationalBranch);

    public Long countForFindByAssessmentHQ(String assessmentHQ);

    public Long countForFindByConsolidatedAssessment(String consolidatedAssessment);

    public Long countForFind();

    public ProjectProposal newInstance();

}
