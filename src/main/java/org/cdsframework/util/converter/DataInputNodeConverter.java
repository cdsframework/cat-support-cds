package org.cdsframework.util.converter;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.cdsframework.base.BaseDTOConverter;
import org.cdsframework.dto.DataInputNodeDTO;
import org.cdsframework.lookup.DataInputNodeDTOList;


/**
 *
 * @author HLN Consulting, LLC
 */
@Named
@RequestScoped
public class DataInputNodeConverter extends BaseDTOConverter<DataInputNodeDTO> {

    @Inject
    protected DataInputNodeDTOList dataInputNodeDTOList;

    public DataInputNodeConverter() {
        super(DataInputNodeConverter.class);
    }

    @Override
    protected void initialize() {
        setBaseDTOList(dataInputNodeDTOList);
    }

    @Override
    protected String getStringFromObject(DataInputNodeDTO item) {
        return item != null ? item.getNodeId(): null;
    }

}
