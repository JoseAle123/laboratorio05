
package com.company.model;

import java.time.LocalDate;
import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface OrderReplyCollabDAO
    extends BusinessObjectDAO
{


    public OrderReplyCollab findByPersistenceId(Long persistenceId);

    public List<OrderReplyCollab> findByOrderID(Long orderID, int startIndex, int maxResults);

    public List<OrderReplyCollab> findByAmount(Integer amount, int startIndex, int maxResults);

    public List<OrderReplyCollab> findByProduct(String product, int startIndex, int maxResults);

    public List<OrderReplyCollab> findByConfirmed(Boolean confirmed, int startIndex, int maxResults);

    public List<OrderReplyCollab> findByShipped(Boolean shipped, int startIndex, int maxResults);

    public List<OrderReplyCollab> findByShipmentDate(LocalDate shipmentDate, int startIndex, int maxResults);

    public List<OrderReplyCollab> find(int startIndex, int maxResults);

    public Long countForFindByOrderID(Long orderID);

    public Long countForFindByAmount(Integer amount);

    public Long countForFindByProduct(String product);

    public Long countForFindByConfirmed(Boolean confirmed);

    public Long countForFindByShipped(Boolean shipped);

    public Long countForFindByShipmentDate(LocalDate shipmentDate);

    public Long countForFind();

    public OrderReplyCollab newInstance();

}
