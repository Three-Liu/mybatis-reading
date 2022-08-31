package com.liusirui.alibaba.mapper;

import com.liusirui.alibaba.domain.Role;
public interface RoleMapper {
    public Role getRole(Long id);
    public Role findRole(String roleName);
    public int deleteRole(Long id);
    public int insertRole(Role role);
}