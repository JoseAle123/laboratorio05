
package com.company.model;

import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface RequestDAO
    extends BusinessObjectDAO
{


    public Request findByPersistenceId(Long persistenceId);

    public List<Request> findByUuid(String uuid, int startIndex, int maxResults);

    public List<Request> findByItem(String item, int startIndex, int maxResults);

    public List<Request> findByQuantity(Integer quantity, int startIndex, int maxResults);

    public List<Request> findByPrice(Integer price, int startIndex, int maxResults);

    public List<Request> findByAccepted(Boolean accepted, int startIndex, int maxResults);

    public List<Request> find(int startIndex, int maxResults);

    public Long countForFindByUuid(String uuid);

    public Long countForFindByItem(String item);

    public Long countForFindByQuantity(Integer quantity);

    public Long countForFindByPrice(Integer price);

    public Long countForFindByAccepted(Boolean accepted);

    public Long countForFind();

    public Request newInstance();

}
