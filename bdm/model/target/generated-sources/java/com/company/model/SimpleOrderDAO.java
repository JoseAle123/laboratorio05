
package com.company.model;

import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface SimpleOrderDAO
    extends BusinessObjectDAO
{


    public SimpleOrder findByPersistenceId(Long persistenceId);

    public List<SimpleOrder> findByItem(String item, int startIndex, int maxResults);

    public List<SimpleOrder> findByAmount(Integer amount, int startIndex, int maxResults);

    public List<SimpleOrder> findByRating(Integer rating, int startIndex, int maxResults);

    public List<SimpleOrder> findByRelationshipDuration(Integer relationshipDuration, int startIndex, int maxResults);

    public List<SimpleOrder> findByApproved(Boolean approved, int startIndex, int maxResults);

    public List<SimpleOrder> find(int startIndex, int maxResults);

    public Long countForFindByItem(String item);

    public Long countForFindByAmount(Integer amount);

    public Long countForFindByRating(Integer rating);

    public Long countForFindByRelationshipDuration(Integer relationshipDuration);

    public Long countForFindByApproved(Boolean approved);

    public Long countForFind();

    public SimpleOrder newInstance();

}
