
package com.company.model;

import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface ProposalDAO
    extends BusinessObjectDAO
{


    public Proposal findByPersistenceId(Long persistenceId);

    public List<Proposal> findByCustomer(String customer, int startIndex, int maxResults);

    public List<Proposal> findByEmail(String email, int startIndex, int maxResults);

    public List<Proposal> findByInquiry_text(String inquiry_text, int startIndex, int maxResults);

    public List<Proposal> findByDescription(String description, int startIndex, int maxResults);

    public List<Proposal> findByPrice(String price, int startIndex, int maxResults);

    public List<Proposal> findByComment(String comment, int startIndex, int maxResults);

    public List<Proposal> findByStatus(String status, int startIndex, int maxResults);

    public List<Proposal> findByCaseId(Long caseId, int startIndex, int maxResults);

    public List<Proposal> findByDecision(String decision, int startIndex, int maxResults);

    public List<Proposal> find(int startIndex, int maxResults);

    public Long countForFindByCustomer(String customer);

    public Long countForFindByEmail(String email);

    public Long countForFindByInquiry_text(String inquiry_text);

    public Long countForFindByDescription(String description);

    public Long countForFindByPrice(String price);

    public Long countForFindByComment(String comment);

    public Long countForFindByStatus(String status);

    public Long countForFindByCaseId(Long caseId);

    public Long countForFindByDecision(String decision);

    public Long countForFind();

    public Proposal newInstance(String customer, String email, String inquiry_text);

}
