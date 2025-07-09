
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

public class VacationAvailableDAOImpl
    implements VacationAvailableDAO
{

    private APISession session;
    private BusinessObjectDeserializer deserializer;
    private Proxyfier proxyfier;

    public VacationAvailableDAOImpl(APISession session) {
        this.session = session;
        this.deserializer = new BusinessObjectDeserializer();
        LazyLoader lazyLoader = new LazyLoader(session);
        this.proxyfier = new Proxyfier(lazyLoader);
    }

    public com.company.model.VacationAvailable findByPersistenceId(Long persistenceId) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "VacationAvailable.findByPersistenceId");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "com.company.model.VacationAvailable");
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("persistenceId", persistenceId);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserialize(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.VacationAvailable.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public com.company.model.VacationAvailable findByBonitaBPMId(Long bonitaBPMId) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "VacationAvailable.findByBonitaBPMId");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "com.company.model.VacationAvailable");
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("bonitaBPMId", bonitaBPMId);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserialize(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.VacationAvailable.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<com.company.model.VacationAvailable> findByDaysAvailableCounter(Integer daysAvailableCounter, int startIndex, int maxResults) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "VacationAvailable.findByDaysAvailableCounter");
            commandParameters.put("returnsList", true);
            commandParameters.put("returnType", "com.company.model.VacationAvailable");
            commandParameters.put("startIndex", startIndex);
            commandParameters.put("maxResults", maxResults);
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("daysAvailableCounter", daysAvailableCounter);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserializeList(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.VacationAvailable.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<com.company.model.VacationAvailable> find(int startIndex, int maxResults) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "VacationAvailable.find");
            commandParameters.put("returnsList", true);
            commandParameters.put("returnType", "com.company.model.VacationAvailable");
            commandParameters.put("startIndex", startIndex);
            commandParameters.put("maxResults", maxResults);
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserializeList(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.VacationAvailable.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Long countForFindByDaysAvailableCounter(Integer daysAvailableCounter) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "VacationAvailable.countForFindByDaysAvailableCounter");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "java.lang.Long");
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("daysAvailableCounter", daysAvailableCounter);
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
            commandParameters.put("queryName", "VacationAvailable.countForFind");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "java.lang.Long");
            return ((Long) deserializer.deserialize(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), Long.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public com.company.model.VacationAvailable newInstance(Long bonitaBPMId, Integer daysAvailableCounter) {
        if (bonitaBPMId == null) {
            throw new IllegalArgumentException("bonitaBPMId cannot be null");
        }
        if (daysAvailableCounter == null) {
            throw new IllegalArgumentException("daysAvailableCounter cannot be null");
        }
        com.company.model.VacationAvailable instance = new com.company.model.VacationAvailable();
        instance.setBonitaBPMId(bonitaBPMId);
        instance.setDaysAvailableCounter(daysAvailableCounter);
        return instance;
    }

}
