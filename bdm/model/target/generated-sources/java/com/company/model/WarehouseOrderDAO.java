
package com.company.model;

import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface WarehouseOrderDAO
    extends BusinessObjectDAO
{


    public WarehouseOrder findByPersistenceId(Long persistenceId);

    public List<WarehouseOrder> findByOrderID(Long orderID, int startIndex, int maxResults);

    public List<WarehouseOrder> findByProduct(String product, int startIndex, int maxResults);

    public List<WarehouseOrder> findByAmount(Integer amount, int startIndex, int maxResults);

    public List<WarehouseOrder> findByStatus(String status, int startIndex, int maxResults);

    public List<WarehouseOrder> find(int startIndex, int maxResults);

    public Long countForFindByOrderID(Long orderID);

    public Long countForFindByProduct(String product);

    public Long countForFindByAmount(Integer amount);

    public Long countForFindByStatus(String status);

    public Long countForFind();

    public WarehouseOrder newInstance();

}
