
package com.company.model;

import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface WarehouseStockDAO
    extends BusinessObjectDAO
{


    public WarehouseStock findByPersistenceId(Long persistenceId);

    public List<WarehouseStock> findByAmount(Integer amount, int startIndex, int maxResults);

    public List<WarehouseStock> find(int startIndex, int maxResults);

    public Long countForFindByAmount(Integer amount);

    public Long countForFind();

    public WarehouseStock newInstance();

}
