
package com.company.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bonitasoft.engine.api.CommandAPI;
import org.bonitasoft.engine.bdm.dao.client.resources.BusinessObjectDeserializer;
import org.bonitasoft.engine.bdm.dao.client.resources.proxy.LazyLoader;
import org.bonitasoft.engine.bdm.dao.client.resources.proxy.Proxyfier;
import org.bonitasoft.engine.session.APISession;

public class PurchaseOrderDAOImpl
    implements PurchaseOrderDAO
{

    private APISession session;
    private BusinessObjectDeserializer deserializer;
    private Proxyfier proxyfier;

    public PurchaseOrderDAOImpl(APISession session) {
        this.session = session;
        this.deserializer = new BusinessObjectDeserializer();
        LazyLoader lazyLoader = new LazyLoader(session);
        this.proxyfier = new Proxyfier(lazyLoader);
    }

    public com.company.model.PurchaseOrder findByPersistenceId(Long persistenceId) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "PurchaseOrder.findByPersistenceId");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "com.company.model.PurchaseOrder");
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("persistenceId", persistenceId);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserialize(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.PurchaseOrder.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<com.company.model.PurchaseOrder> findByCustomer(String customer, int startIndex, int maxResults) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "PurchaseOrder.findByCustomer");
            commandParameters.put("returnsList", true);
            commandParameters.put("returnType", "com.company.model.PurchaseOrder");
            commandParameters.put("startIndex", startIndex);
            commandParameters.put("maxResults", maxResults);
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("customer", customer);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserializeList(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.PurchaseOrder.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<com.company.model.PurchaseOrder> findByOrderDate(LocalDate orderDate, int startIndex, int maxResults) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "PurchaseOrder.findByOrderDate");
            commandParameters.put("returnsList", true);
            commandParameters.put("returnType", "com.company.model.PurchaseOrder");
            commandParameters.put("startIndex", startIndex);
            commandParameters.put("maxResults", maxResults);
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("orderDate", orderDate);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserializeList(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.PurchaseOrder.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<com.company.model.PurchaseOrder> find(int startIndex, int maxResults) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "PurchaseOrder.find");
            commandParameters.put("returnsList", true);
            commandParameters.put("returnType", "com.company.model.PurchaseOrder");
            commandParameters.put("startIndex", startIndex);
            commandParameters.put("maxResults", maxResults);
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserializeList(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.PurchaseOrder.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Long countForFindByCustomer(String customer) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "PurchaseOrder.countForFindByCustomer");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "java.lang.Long");
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("customer", customer);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return ((Long) deserializer.deserialize(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), Long.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Long countForFindByOrderDate(LocalDate orderDate) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "PurchaseOrder.countForFindByOrderDate");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "java.lang.Long");
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("orderDate", orderDate);
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
            commandParameters.put("queryName", "PurchaseOrder.countForFind");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "java.lang.Long");
            return ((Long) deserializer.deserialize(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), Long.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public com.company.model.PurchaseOrder newInstance() {
        com.company.model.PurchaseOrder instance = new com.company.model.PurchaseOrder();
        return instance;
    }

}
