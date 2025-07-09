
package com.company.model;

import java.time.LocalDate;
import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface OrderCollabDAO
    extends BusinessObjectDAO
{


    public OrderCollab findByPersistenceId(Long persistenceId);

    public List<OrderCollab> findByAmount(Integer amount, int startIndex, int maxResults);

    public List<OrderCollab> findByProduct(String product, int startIndex, int maxResults);

    public List<OrderCollab> findByConfirmed(Boolean confirmed, int startIndex, int maxResults);

    public List<OrderCollab> findByShipped(Boolean shipped, int startIndex, int maxResults);

    public List<OrderCollab> findByShipmentDate(LocalDate shipmentDate, int startIndex, int maxResults);

    public List<OrderCollab> find(int startIndex, int maxResults);

    public Long countForFindByAmount(Integer amount);

    public Long countForFindByProduct(String product);

    public Long countForFindByConfirmed(Boolean confirmed);

    public Long countForFindByShipped(Boolean shipped);

    public Long countForFindByShipmentDate(LocalDate shipmentDate);

    public Long countForFind();

    public OrderCollab newInstance();

}
