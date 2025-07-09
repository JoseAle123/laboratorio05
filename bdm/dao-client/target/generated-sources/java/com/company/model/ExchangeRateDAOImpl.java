
package com.company.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bonitasoft.engine.api.CommandAPI;
import org.bonitasoft.engine.bdm.dao.client.resources.BusinessObjectDeserializer;
import org.bonitasoft.engine.bdm.dao.client.resources.proxy.LazyLoader;
import org.bonitasoft.engine.bdm.dao.client.resources.proxy.Proxyfier;
import org.bonitasoft.engine.session.APISession;

public class ExchangeRateDAOImpl
    implements ExchangeRateDAO
{

    private APISession session;
    private BusinessObjectDeserializer deserializer;
    private Proxyfier proxyfier;

    public ExchangeRateDAOImpl(APISession session) {
        this.session = session;
        this.deserializer = new BusinessObjectDeserializer();
        LazyLoader lazyLoader = new LazyLoader(session);
        this.proxyfier = new Proxyfier(lazyLoader);
    }

    public com.company.model.ExchangeRate findByPersistenceId(Long persistenceId) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "ExchangeRate.findByPersistenceId");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "com.company.model.ExchangeRate");
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("persistenceId", persistenceId);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserialize(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.ExchangeRate.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<com.company.model.ExchangeRate> findByCurrencyCode(String currencyCode, int startIndex, int maxResults) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "ExchangeRate.findByCurrencyCode");
            commandParameters.put("returnsList", true);
            commandParameters.put("returnType", "com.company.model.ExchangeRate");
            commandParameters.put("startIndex", startIndex);
            commandParameters.put("maxResults", maxResults);
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("currencyCode", currencyCode);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserializeList(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.ExchangeRate.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<com.company.model.ExchangeRate> findByRateValue(String rateValue, int startIndex, int maxResults) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "ExchangeRate.findByRateValue");
            commandParameters.put("returnsList", true);
            commandParameters.put("returnType", "com.company.model.ExchangeRate");
            commandParameters.put("startIndex", startIndex);
            commandParameters.put("maxResults", maxResults);
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("rateValue", rateValue);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserializeList(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.ExchangeRate.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<com.company.model.ExchangeRate> find(int startIndex, int maxResults) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "ExchangeRate.find");
            commandParameters.put("returnsList", true);
            commandParameters.put("returnType", "com.company.model.ExchangeRate");
            commandParameters.put("startIndex", startIndex);
            commandParameters.put("maxResults", maxResults);
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserializeList(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.ExchangeRate.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Long countForFindByCurrencyCode(String currencyCode) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "ExchangeRate.countForFindByCurrencyCode");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "java.lang.Long");
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("currencyCode", currencyCode);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return ((Long) deserializer.deserialize(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), Long.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Long countForFindByRateValue(String rateValue) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "ExchangeRate.countForFindByRateValue");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "java.lang.Long");
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("rateValue", rateValue);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return ((Long) deserializer.deserialize(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), Long.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Long countForFind() {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "ExchangeRate.countForFind");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "java.lang.Long");
            return ((Long) deserializer.deserialize(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), Long.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public com.company.model.ExchangeRate newInstance() {
        com.company.model.ExchangeRate instance = new com.company.model.ExchangeRate();
        return instance;
    }

}
