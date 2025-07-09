
package com.company.model;

import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface CustomerDAO
    extends BusinessObjectDAO
{


    public Customer findByPersistenceId(Long persistenceId);

    public List<Customer> findByFirstName(String firstName, int startIndex, int maxResults);

    public List<Customer> findByLastName(String lastName, int startIndex, int maxResults);

    public List<Customer> findByDedicatedSalesAdmin(String dedicatedSalesAdmin, int startIndex, int maxResults);

    public List<Customer> find(int startIndex, int maxResults);

    public Long countForFindByFirstName(String firstName);

    public Long countForFindByLastName(String lastName);

    public Long countForFindByDedicatedSalesAdmin(String dedicatedSalesAdmin);

    public Long countForFind();

    public Customer newInstance();

}
