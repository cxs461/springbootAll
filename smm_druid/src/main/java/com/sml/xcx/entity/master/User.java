package com.sml.xcx.entity.master;

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
public class User extends SuperEntity {

    private static final long serialVersionUID=1L;

    private String username;

    private String password;


}
