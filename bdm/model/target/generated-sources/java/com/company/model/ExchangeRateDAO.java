
package com.company.model;

import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface ExchangeRateDAO
    extends BusinessObjectDAO
{


    public ExchangeRate findByPersistenceId(Long persistenceId);

    public List<ExchangeRate> findByCurrencyCode(String currencyCode, int startIndex, int maxResults);

    public List<ExchangeRate> findByRateValue(String rateValue, int startIndex, int maxResults);

    public List<ExchangeRate> find(int startIndex, int maxResults);

    public Long countForFindByCurrencyCode(String currencyCode);

    public Long countForFindByRateValue(String rateValue);

    public Long countForFind();

    public ExchangeRate newInstance();

}
