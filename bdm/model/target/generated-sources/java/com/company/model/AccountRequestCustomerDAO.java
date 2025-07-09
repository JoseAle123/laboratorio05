
package com.company.model;

import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface AccountRequestCustomerDAO
    extends BusinessObjectDAO
{


    public AccountRequestCustomer findByPersistenceId(Long persistenceId);

    public List<AccountRequestCustomer> findByRequestID(Long requestID, int startIndex, int maxResults);

    public List<AccountRequestCustomer> findByUsername(String username, int startIndex, int maxResults);

    public List<AccountRequestCustomer> findByEmail(String email, int startIndex, int maxResults);

    public List<AccountRequestCustomer> findByCmsAccessRequested(Boolean cmsAccessRequested, int startIndex, int maxResults);

    public List<AccountRequestCustomer> findByCrmAccessRequested(Boolean crmAccessRequested, int startIndex, int maxResults);

    public List<AccountRequestCustomer> findByErpAccessRequested(Boolean erpAccessRequested, int startIndex, int maxResults);

    public List<AccountRequestCustomer> findByRequestAccepted(Boolean requestAccepted, int startIndex, int maxResults);

    public List<AccountRequestCustomer> findByMessageFromIT(String messageFromIT, int startIndex, int maxResults);

    public List<AccountRequestCustomer> find(int startIndex, int maxResults);

    public Long countForFindByRequestID(Long requestID);

    public Long countForFindByUsername(String username);

    public Long countForFindByEmail(String email);

    public Long countForFindByCmsAccessRequested(Boolean cmsAccessRequested);

    public Long countForFindByCrmAccessRequested(Boolean crmAccessRequested);

    public Long countForFindByErpAccessRequested(Boolean erpAccessRequested);

    public Long countForFindByRequestAccepted(Boolean requestAccepted);

    public Long countForFindByMessageFromIT(String messageFromIT);

    public Long countForFind();

    public AccountRequestCustomer newInstance();

}
