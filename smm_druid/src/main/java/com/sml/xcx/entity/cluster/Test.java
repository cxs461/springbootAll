package com.sml.xcx.entity.cluster;

import com.sml.xcx.common.SuperEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2020-06-01
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Test extends SuperEntity {

    private static final long serialVersionUID=1L;

    private String name;


}
