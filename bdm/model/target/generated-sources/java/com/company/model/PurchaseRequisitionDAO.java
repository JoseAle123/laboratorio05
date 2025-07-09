
package com.company.model;

import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface PurchaseRequisitionDAO
    extends BusinessObjectDAO
{


    public PurchaseRequisition findByPersistenceId(Long persistenceId);

    public List<PurchaseRequisition> findByRequistionID(Long requistionID, int startIndex, int maxResults);

    public List<PurchaseRequisition> findByProduct(String product, int startIndex, int maxResults);

    public List<PurchaseRequisition> findByAmount(Integer amount, int startIndex, int maxResults);

    public List<PurchaseRequisition> findByIsConfirmed(String isConfirmed, int startIndex, int maxResults);

    public List<PurchaseRequisition> findByComment(String comment, int startIndex, int maxResults);

    public List<PurchaseRequisition> find(int startIndex, int maxResults);

    public Long countForFindByRequistionID(Long requistionID);

    public Long countForFindByProduct(String product);

    public Long countForFindByAmount(Integer amount);

    public Long countForFindByIsConfirmed(String isConfirmed);

    public Long countForFindByComment(String comment);

    public Long countForFind();

    public PurchaseRequisition newInstance();

}
