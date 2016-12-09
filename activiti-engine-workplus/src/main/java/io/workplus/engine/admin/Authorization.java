package io.workplus.engine.admin;

/**
 * Created by yyang on 2016/12/5.
 */
public class Authorization {
    private String userId;
    private String orgId;

    public Authorization() {
    }

    public Authorization(String userId, String orgId) {
        this.userId = userId;
        this.orgId = orgId;
    }

    public String getUserId() {
        return userId;
    }

    public String getOrgId() {
        return orgId;
    }
}
