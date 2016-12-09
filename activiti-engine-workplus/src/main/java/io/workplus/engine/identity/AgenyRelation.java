package io.workplus.engine.identity;

import java.util.Date;

/**
 * 代理关系。每个人可以为自己的某个角色指定一个或多个代理人，在自己不在时代行审批职责。
 * Created by yyang on 2016/12/9.
 */
public class AgenyRelation {
    private String userId;

    private String agentId;

    private String roleId;

    private Date fromDate = new Date();

    private boolean finished = false;

    public AgenyRelation() {
    }

    public AgenyRelation(String userId, String agentId, String roleId) {
        this.userId = userId;
        this.agentId = agentId;
        this.roleId = roleId;
    }

    public AgenyRelation(String userId, String agentId, String roleId, Date fromDate) {
        this(userId, agentId, roleId);
        this.fromDate = fromDate;
    }

    public String getUserId() {
        return userId;
    }

    public String getAgentId() {
        return agentId;
    }

    public String getRoleId() {
        return roleId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public boolean isFinished() {
        return finished;
    }

    public void finish() {
        finished = true;
    }
}
