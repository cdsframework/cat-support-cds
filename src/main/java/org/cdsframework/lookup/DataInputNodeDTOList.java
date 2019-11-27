package org.cdsframework.lookup;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import org.cdsframework.base.BaseDTOList;
import org.cdsframework.dto.DataInputNodeDTO;

/**
 *
 * @author HLN Consulting, LLC
 */
@Named
@ApplicationScoped
public class DataInputNodeDTOList extends BaseDTOList<DataInputNodeDTO> {

    private static final long serialVersionUID = -3821997725914536986L;

    @Override
    protected void initialize() throws Exception {
    }

}
