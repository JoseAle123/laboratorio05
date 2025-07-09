
package com.company.model;

import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface ProductDescriptionDAO
    extends BusinessObjectDAO
{


    public ProductDescription findByPersistenceId(Long persistenceId);

    public List<ProductDescription> findByText(String text, int startIndex, int maxResults);

    public List<ProductDescription> findByHardwareSpec(String hardwareSpec, int startIndex, int maxResults);

    public List<ProductDescription> findBySoftwareSpec(String softwareSpec, int startIndex, int maxResults);

    public List<ProductDescription> find(int startIndex, int maxResults);

    public Long countForFindByText(String text);

    public Long countForFindByHardwareSpec(String hardwareSpec);

    public Long countForFindBySoftwareSpec(String softwareSpec);

    public Long countForFind();

    public ProductDescription newInstance();

}
