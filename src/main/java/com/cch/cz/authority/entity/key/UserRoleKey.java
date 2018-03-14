package com.cch.cz.authority.entity.key;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Administrator on 2018/3/14.
 *
 */
@Embeddable
public class UserRoleKey implements Serializable {

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long UserId;
    /**
     * 角色Id
     */
    @Column(name = "role_id")
    private Long RoleId;

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    public Long getRoleId() {
        return RoleId;
    }

    public void setRoleId(Long roleId) {
        RoleId = roleId;
    }
}
