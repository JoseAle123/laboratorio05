
package com.company.model;

import java.time.LocalDate;
import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface PurchaseOrderDAO
    extends BusinessObjectDAO
{


    public PurchaseOrder findByPersistenceId(Long persistenceId);

    public List<PurchaseOrder> findByCustomer(String customer, int startIndex, int maxResults);

    public List<PurchaseOrder> findByOrderDate(LocalDate orderDate, int startIndex, int maxResults);

    public List<PurchaseOrder> find(int startIndex, int maxResults);

    public Long countForFindByCustomer(String customer);

    public Long countForFindByOrderDate(LocalDate orderDate);

    public Long countForFind();

    public PurchaseOrder newInstance();

}
