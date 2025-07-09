
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

public class VacationRequestDAOImpl
    implements VacationRequestDAO
{

    private APISession session;
    private BusinessObjectDeserializer deserializer;
    private Proxyfier proxyfier;

    public VacationRequestDAOImpl(APISession session) {
        this.session = session;
        this.deserializer = new BusinessObjectDeserializer();
        LazyLoader lazyLoader = new LazyLoader(session);
        this.proxyfier = new Proxyfier(lazyLoader);
    }

    public com.company.model.VacationRequest findByPersistenceId(Long persistenceId) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "VacationRequest.findByPersistenceId");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "com.company.model.VacationRequest");
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("persistenceId", persistenceId);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserialize(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.VacationRequest.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<com.company.model.VacationRequest> findByRequesterBonitaBPMId(Long requesterBonitaBPMId, int startIndex, int maxResults) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "VacationRequest.findByRequesterBonitaBPMId");
            commandParameters.put("returnsList", true);
            commandParameters.put("returnType", "com.company.model.VacationRequest");
            commandParameters.put("startIndex", startIndex);
            commandParameters.put("maxResults", maxResults);
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("requesterBonitaBPMId", requesterBonitaBPMId);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserializeList(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.VacationRequest.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<com.company.model.VacationRequest> findByReviewerBonitaBPMId(Long reviewerBonitaBPMId, int startIndex, int maxResults) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "VacationRequest.findByReviewerBonitaBPMId");
            commandParameters.put("returnsList", true);
            commandParameters.put("returnType", "com.company.model.VacationRequest");
            commandParameters.put("startIndex", startIndex);
            commandParameters.put("maxResults", maxResults);
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("reviewerBonitaBPMId", reviewerBonitaBPMId);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserializeList(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.VacationRequest.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<com.company.model.VacationRequest> findByStartDate(LocalDate startDate, int startIndex, int maxResults) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "VacationRequest.findByStartDate");
            commandParameters.put("returnsList", true);
            commandParameters.put("returnType", "com.company.model.VacationRequest");
            commandParameters.put("startIndex", startIndex);
            commandParameters.put("maxResults", maxResults);
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("startDate", startDate);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserializeList(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.VacationRequest.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<com.company.model.VacationRequest> findByReturnDate(LocalDate returnDate, int startIndex, int maxResults) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "VacationRequest.findByReturnDate");
            commandParameters.put("returnsList", true);
            commandParameters.put("returnType", "com.company.model.VacationRequest");
            commandParameters.put("startIndex", startIndex);
            commandParameters.put("maxResults", maxResults);
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("returnDate", returnDate);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserializeList(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.VacationRequest.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<com.company.model.VacationRequest> findByNumberOfDays(Integer numberOfDays, int startIndex, int maxResults) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "VacationRequest.findByNumberOfDays");
            commandParameters.put("returnsList", true);
            commandParameters.put("returnType", "com.company.model.VacationRequest");
            commandParameters.put("startIndex", startIndex);
            commandParameters.put("maxResults", maxResults);
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("numberOfDays", numberOfDays);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserializeList(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.VacationRequest.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<com.company.model.VacationRequest> findByStatus(String status, int startIndex, int maxResults) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "VacationRequest.findByStatus");
            commandParameters.put("returnsList", true);
            commandParameters.put("returnType", "com.company.model.VacationRequest");
            commandParameters.put("startIndex", startIndex);
            commandParameters.put("maxResults", maxResults);
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("status", status);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserializeList(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.VacationRequest.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<com.company.model.VacationRequest> findByComments(String comments, int startIndex, int maxResults) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "VacationRequest.findByComments");
            commandParameters.put("returnsList", true);
            commandParameters.put("returnType", "com.company.model.VacationRequest");
            commandParameters.put("startIndex", startIndex);
            commandParameters.put("maxResults", maxResults);
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("comments", comments);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserializeList(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.VacationRequest.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<com.company.model.VacationRequest> findByCalendarEventId(String calendarEventId, int startIndex, int maxResults) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "VacationRequest.findByCalendarEventId");
            commandParameters.put("returnsList", true);
            commandParameters.put("returnType", "com.company.model.VacationRequest");
            commandParameters.put("startIndex", startIndex);
            commandParameters.put("maxResults", maxResults);
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("calendarEventId", calendarEventId);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserializeList(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.VacationRequest.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<com.company.model.VacationRequest> findByNewRequestProcessInstanceId(Long newRequestProcessInstanceId, int startIndex, int maxResults) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "VacationRequest.findByNewRequestProcessInstanceId");
            commandParameters.put("returnsList", true);
            commandParameters.put("returnType", "com.company.model.VacationRequest");
            commandParameters.put("startIndex", startIndex);
            commandParameters.put("maxResults", maxResults);
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("newRequestProcessInstanceId", newRequestProcessInstanceId);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserializeList(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.VacationRequest.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<com.company.model.VacationRequest> find(int startIndex, int maxResults) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "VacationRequest.find");
            commandParameters.put("returnsList", true);
            commandParameters.put("returnType", "com.company.model.VacationRequest");
            commandParameters.put("startIndex", startIndex);
            commandParameters.put("maxResults", maxResults);
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserializeList(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.VacationRequest.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Long countForFindByRequesterBonitaBPMId(Long requesterBonitaBPMId) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "VacationRequest.countForFindByRequesterBonitaBPMId");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "java.lang.Long");
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("requesterBonitaBPMId", requesterBonitaBPMId);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return ((Long) deserializer.deserialize(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), Long.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Long countForFindByReviewerBonitaBPMId(Long reviewerBonitaBPMId) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "VacationRequest.countForFindByReviewerBonitaBPMId");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "java.lang.Long");
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("reviewerBonitaBPMId", reviewerBonitaBPMId);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return ((Long) deserializer.deserialize(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), Long.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Long countForFindByStartDate(LocalDate startDate) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "VacationRequest.countForFindByStartDate");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "java.lang.Long");
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("startDate", startDate);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return ((Long) deserializer.deserialize(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), Long.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Long countForFindByReturnDate(LocalDate returnDate) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "VacationRequest.countForFindByReturnDate");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "java.lang.Long");
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("returnDate", returnDate);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return ((Long) deserializer.deserialize(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), Long.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Long countForFindByNumberOfDays(Integer numberOfDays) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "VacationRequest.countForFindByNumberOfDays");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "java.lang.Long");
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("numberOfDays", numberOfDays);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return ((Long) deserializer.deserialize(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), Long.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Long countForFindByStatus(String status) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "VacationRequest.countForFindByStatus");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "java.lang.Long");
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("status", status);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return ((Long) deserializer.deserialize(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), Long.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Long countForFindByComments(String comments) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "VacationRequest.countForFindByComments");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "java.lang.Long");
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("comments", comments);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return ((Long) deserializer.deserialize(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), Long.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Long countForFindByCalendarEventId(String calendarEventId) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "VacationRequest.countForFindByCalendarEventId");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "java.lang.Long");
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("calendarEventId", calendarEventId);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return ((Long) deserializer.deserialize(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), Long.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Long countForFindByNewRequestProcessInstanceId(Long newRequestProcessInstanceId) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "VacationRequest.countForFindByNewRequestProcessInstanceId");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "java.lang.Long");
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("newRequestProcessInstanceId", newRequestProcessInstanceId);
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
            commandParameters.put("queryName", "VacationRequest.countForFind");
            commandParameters.put("returnsList", false);
            commandParameters.put("returnType", "java.lang.Long");
            return ((Long) deserializer.deserialize(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), Long.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<com.company.model.VacationRequest> findModifiableByBonitaBPMId(Long requesterBonitaBPMId, int startIndex, int maxResults) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "VacationRequest.findModifiableByBonitaBPMId");
            commandParameters.put("returnsList", true);
            commandParameters.put("returnType", "com.company.model.VacationRequest");
            commandParameters.put("startIndex", startIndex);
            commandParameters.put("maxResults", maxResults);
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("requesterBonitaBPMId", requesterBonitaBPMId);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserializeList(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.VacationRequest.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<com.company.model.VacationRequest> findCancellableByBonitaBPMId(Long requesterBonitaBPMId, int startIndex, int maxResults) {
        try {
            CommandAPI commandApi = org.bonitasoft.engine.api.TenantAPIAccessor.getCommandAPI(session);
            Map<String, Serializable> commandParameters = new HashMap<String, Serializable>();
            commandParameters.put("queryName", "VacationRequest.findCancellableByBonitaBPMId");
            commandParameters.put("returnsList", true);
            commandParameters.put("returnType", "com.company.model.VacationRequest");
            commandParameters.put("startIndex", startIndex);
            commandParameters.put("maxResults", maxResults);
            Map<String, Serializable> queryParameters = new HashMap<String, Serializable>();
            queryParameters.put("requesterBonitaBPMId", requesterBonitaBPMId);
            commandParameters.put("queryParameters", ((Serializable) queryParameters));
            return proxyfier.proxify(deserializer.deserializeList(((byte[]) commandApi.execute("executeBDMQuery", commandParameters)), com.company.model.VacationRequest.class));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public com.company.model.VacationRequest newInstance(Long requesterBonitaBPMId, LocalDate startDate, LocalDate returnDate, Integer numberOfDays, String status, Long newRequestProcessInstanceId) {
        if (requesterBonitaBPMId == null) {
            throw new IllegalArgumentException("requesterBonitaBPMId cannot be null");
        }
        if (startDate == null) {
            throw new IllegalArgumentException("startDate cannot be null");
        }
        if (returnDate == null) {
            throw new IllegalArgumentException("returnDate cannot be null");
        }
        if (numberOfDays == null) {
            throw new IllegalArgumentException("numberOfDays cannot be null");
        }
        if (status == null) {
            throw new IllegalArgumentException("status cannot be null");
        }
        if (newRequestProcessInstanceId == null) {
            throw new IllegalArgumentException("newRequestProcessInstanceId cannot be null");
        }
        com.company.model.VacationRequest instance = new com.company.model.VacationRequest();
        instance.setRequesterBonitaBPMId(requesterBonitaBPMId);
        instance.setStartDate(startDate);
        instance.setReturnDate(returnDate);
        instance.setNumberOfDays(numberOfDays);
        instance.setStatus(status);
        instance.setNewRequestProcessInstanceId(newRequestProcessInstanceId);
        return instance;
    }

}
