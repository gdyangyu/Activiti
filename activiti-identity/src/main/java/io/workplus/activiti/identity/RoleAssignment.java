package io.workplus.activiti.identity;

/**
 * Created by yyang on 2016/12/5.
 */
public class RoleAssignment {

    private String userId;

    private String orgId;

    private String roleId;

    public RoleAssignment() {
    }

    public RoleAssignment(String userId, String orgId, String roleId) {

        this.userId = userId;
        this.orgId = orgId;
        this.roleId = roleId;
    }

    public String getUserId() {
        return userId;
    }

    public String getOrgId() {
        return orgId;
    }

    public String getRoleId() {
        return roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoleAssignment)) return false;

        RoleAssignment that = (RoleAssignment) o;

        if (!getUserId().equals(that.getUserId())) return false;
        if (!getOrgId().equals(that.getOrgId())) return false;
        return getRoleId().equals(that.getRoleId());
    }

    @Override
    public int hashCode() {
        int result = getUserId().hashCode();
        result = 31 * result + getOrgId().hashCode();
        result = 31 * result + getRoleId().hashCode();
        return result;
    }
}
