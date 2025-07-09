
package com.company.model;

import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface VacationAvailableDAO
    extends BusinessObjectDAO
{


    public VacationAvailable findByPersistenceId(Long persistenceId);

    public VacationAvailable findByBonitaBPMId(Long bonitaBPMId);

    public List<VacationAvailable> findByDaysAvailableCounter(Integer daysAvailableCounter, int startIndex, int maxResults);

    public List<VacationAvailable> find(int startIndex, int maxResults);

    public Long countForFindByDaysAvailableCounter(Integer daysAvailableCounter);

    public Long countForFind();

    public VacationAvailable newInstance(Long bonitaBPMId, Integer daysAvailableCounter);

}
