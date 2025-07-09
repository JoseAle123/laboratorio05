
package com.company.model;

import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface OrderItemDAO
    extends BusinessObjectDAO
{


    public OrderItem findByPersistenceId(Long persistenceId);

    public List<OrderItem> findByNumber(Integer number, int startIndex, int maxResults);

    public List<OrderItem> findByProduct(String product, int startIndex, int maxResults);

    public List<OrderItem> findByAmount(Integer amount, int startIndex, int maxResults);

    public List<OrderItem> findByStatus(String status, int startIndex, int maxResults);

    public List<OrderItem> find(int startIndex, int maxResults);

    public Long countForFindByNumber(Integer number);

    public Long countForFindByProduct(String product);

    public Long countForFindByAmount(Integer amount);

    public Long countForFindByStatus(String status);

    public Long countForFind();

    public OrderItem newInstance();

}
