
package com.company.model;

import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface AccountRequestITDAO
    extends BusinessObjectDAO
{


    public AccountRequestIT findByPersistenceId(Long persistenceId);

    public List<AccountRequestIT> findByCustomerRequestID(Long customerRequestID, int startIndex, int maxResults);

    public List<AccountRequestIT> findByCustomerUsername(String customerUsername, int startIndex, int maxResults);

    public List<AccountRequestIT> findByCustomerEmail(String customerEmail, int startIndex, int maxResults);

    public List<AccountRequestIT> findByCmsAccessRequested(Boolean cmsAccessRequested, int startIndex, int maxResults);

    public List<AccountRequestIT> findByCrmAccessRequested(Boolean crmAccessRequested, int startIndex, int maxResults);

    public List<AccountRequestIT> findByErpAccessRequested(Boolean erpAccessRequested, int startIndex, int maxResults);

    public List<AccountRequestIT> findByRequestComplete(Boolean requestComplete, int startIndex, int maxResults);

    public List<AccountRequestIT> findByMessageToCustomer(String messageToCustomer, int startIndex, int maxResults);

    public List<AccountRequestIT> find(int startIndex, int maxResults);

    public Long countForFindByCustomerRequestID(Long customerRequestID);

    public Long countForFindByCustomerUsername(String customerUsername);

    public Long countForFindByCustomerEmail(String customerEmail);

    public Long countForFindByCmsAccessRequested(Boolean cmsAccessRequested);

    public Long countForFindByCrmAccessRequested(Boolean crmAccessRequested);

    public Long countForFindByErpAccessRequested(Boolean erpAccessRequested);

    public Long countForFindByRequestComplete(Boolean requestComplete);

    public Long countForFindByMessageToCustomer(String messageToCustomer);

    public Long countForFind();

    public AccountRequestIT newInstance();

}
