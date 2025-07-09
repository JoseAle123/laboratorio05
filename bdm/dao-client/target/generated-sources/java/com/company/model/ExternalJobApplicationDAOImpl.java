
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

public class ExternalJobApplicationDAOImpl
    implements ExternalJobApplicationDAO
{

    private APISession session;
    private BusinessObjectDeserializer deserializer;
    private Proxyfier proxyfier;

    public ExternalJobApplicationDAOImpl(APISession session) {
        this.session = session;
        this.deserializer = new BusinessObjectDeserializer();
        LazyLoader lazyLoader = new LazyLoader(session);
        this.proxyfier = new Proxyfier(lazyLoader);
    }

    public com.company.model.ExternalJobApplication findByPersistenceId(Long persistenceId) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "ExternalJobApplication.findByPersistenceId");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "com.company.model.ExternalJobApplication");
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("persistenceId", persistenceId);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserialize(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.ExternalJobApplication.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<com.company.model.ExternalJobApplication> findByApplicantUsername(String applicantUsername, int startIndex, int maxResults) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "ExternalJobApplication.findByApplicantUsername");
            commandParameters.put("returnsList", true);
            commandParameters.put("returnType", "com.company.model.ExternalJobApplication");
            commandParameters.put("startIndex", startIndex);
            commandParameters.put("maxResults", maxResults);
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("applicantUsername", applicantUsername);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserializeList(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.ExternalJobApplication.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<com.company.model.ExternalJobApplication> findByText(String text, int startIndex, int maxResults) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "ExternalJobApplication.findByText");
            commandParameters.put("returnsList", true);
            commandParameters.put("returnType", "com.company.model.ExternalJobApplication");
            commandParameters.put("startIndex", startIndex);
            commandParameters.put("maxResults", maxResults);
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("text", text);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserializeList(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.ExternalJobApplication.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<com.company.model.ExternalJobApplication> findByAnswer(String answer, int startIndex, int maxResults) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "ExternalJobApplication.findByAnswer");
            commandParameters.put("returnsList", true);
            commandParameters.put("returnType", "com.company.model.ExternalJobApplication");
            commandParameters.put("startIndex", startIndex);
            commandParameters.put("maxResults", maxResults);
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("answer", answer);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserializeList(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.ExternalJobApplication.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<com.company.model.ExternalJobApplication> findByCancelled(Boolean cancelled, int startIndex, int maxResults) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "ExternalJobApplication.findByCancelled");
            commandParameters.put("returnsList", true);
            commandParameters.put("returnType", "com.company.model.ExternalJobApplication");
            commandParameters.put("startIndex", startIndex);
            commandParameters.put("maxResults", maxResults);
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("cancelled", cancelled);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserializeList(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.ExternalJobApplication.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<com.company.model.ExternalJobApplication> findByCancellationMessage(String cancellationMessage, int startIndex, int maxResults) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "ExternalJobApplication.findByCancellationMessage");
            commandParameters.put("returnsList", true);
            commandParameters.put("returnType", "com.company.model.ExternalJobApplication");
            commandParameters.put("startIndex", startIndex);
            commandParameters.put("maxResults", maxResults);
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("cancellationMessage", cancellationMessage);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserializeList(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.ExternalJobApplication.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<com.company.model.ExternalJobApplication> find(int startIndex, int maxResults) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "ExternalJobApplication.find");
            commandParameters.put("returnsList", true);
            commandParameters.put("returnType", "com.company.model.ExternalJobApplication");
            commandParameters.put("startIndex", startIndex);
            commandParameters.put("maxResults", maxResults);
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserializeList(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.ExternalJobApplication.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Long countForFindByApplicantUsername(String applicantUsername) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "ExternalJobApplication.countForFindByApplicantUsername");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "java.lang.Long");
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("applicantUsername", applicantUsername);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return ((Long) deserializer.deserialize(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), Long.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Long countForFindByText(String text) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "ExternalJobApplication.countForFindByText");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "java.lang.Long");
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("text", text);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return ((Long) deserializer.deserialize(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), Long.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Long countForFindByAnswer(String answer) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "ExternalJobApplication.countForFindByAnswer");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "java.lang.Long");
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("answer", answer);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return ((Long) deserializer.deserialize(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), Long.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Long countForFindByCancelled(Boolean cancelled) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "ExternalJobApplication.countForFindByCancelled");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "java.lang.Long");
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("cancelled", cancelled);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return ((Long) deserializer.deserialize(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), Long.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Long countForFindByCancellationMessage(String cancellationMessage) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "ExternalJobApplication.countForFindByCancellationMessage");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "java.lang.Long");
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("cancellationMessage", cancellationMessage);
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
            commandParameters.put("queryName", "ExternalJobApplication.countForFind");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "java.lang.Long");
            return ((Long) deserializer.deserialize(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), Long.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public com.company.model.ExternalJobApplication newInstance() {
        com.company.model.ExternalJobApplication instance = new com.company.model.ExternalJobApplication();
        return instance;
    }

}
