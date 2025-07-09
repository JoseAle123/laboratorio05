
package com.company.model;

import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface PurchaseReqDAO
    extends BusinessObjectDAO
{


    public PurchaseReq findByPersistenceId(Long persistenceId);

    public List<PurchaseReq> findByRequestorUsername(String requestorUsername, int startIndex, int maxResults);

    public List<PurchaseReq> findByProduct(String product, int startIndex, int maxResults);

    public List<PurchaseReq> findByReason(String reason, int startIndex, int maxResults);

    public List<PurchaseReq> findByCosts(String costs, int startIndex, int maxResults);

    public List<PurchaseReq> findByIsComplete(Boolean isComplete, int startIndex, int maxResults);

    public List<PurchaseReq> findByApproved(Boolean approved, int startIndex, int maxResults);

    public List<PurchaseReq> find(int startIndex, int maxResults);

    public Long countForFindByRequestorUsername(String requestorUsername);

    public Long countForFindByProduct(String product);

    public Long countForFindByReason(String reason);

    public Long countForFindByCosts(String costs);

    public Long countForFindByIsComplete(Boolean isComplete);

    public Long countForFindByApproved(Boolean approved);

    public Long countForFind();

    public PurchaseReq newInstance();

}
