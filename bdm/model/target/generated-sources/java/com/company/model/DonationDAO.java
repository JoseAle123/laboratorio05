
package com.company.model;

import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface DonationDAO
    extends BusinessObjectDAO
{


    public Donation findByPersistenceId(Long persistenceId);

    public List<Donation> findByAmount(Integer amount, int startIndex, int maxResults);

    public List<Donation> find(int startIndex, int maxResults);

    public Long countForFindByAmount(Integer amount);

    public Long countForFind();

    public Long getTotal();

    public Donation newInstance();

}
