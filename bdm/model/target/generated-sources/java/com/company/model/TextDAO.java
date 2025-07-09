
package com.company.model;

import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface TextDAO
    extends BusinessObjectDAO
{


    public Text findByPersistenceId(Long persistenceId);

    public List<Text> findByContent(String content, int startIndex, int maxResults);

    public List<Text> findByStatus(String status, int startIndex, int maxResults);

    public List<Text> find(int startIndex, int maxResults);

    public Long countForFindByContent(String content);

    public Long countForFindByStatus(String status);

    public Long countForFind();

    public Text newInstance();

}
