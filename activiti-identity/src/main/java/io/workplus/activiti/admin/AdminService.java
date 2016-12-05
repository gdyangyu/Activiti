package io.workplus.activiti.admin;

import java.util.Set;

/**
 * 管理服务。设置和查询每个机构的管理员。
 * Created by yyang on 2016/12/5.
 */
public interface AdminService {

    /**
     * 获取指定机构的流程管理员
     * @param orgId 机构ID
     * @return 流程管理员的集合。如果指定机构没有管理员则返回空集合。
     */
    Set<String> getAdministratorsOfOrganization(String orgId);

    /**
     * 判断用户是否指定机构的管理员
     * @param userId 用户ID
     * @param orgId 机构ID
     * @return 如果用户是机构的管理员，返回true，否则反悔false。
     */
    boolean isAdministratorOfOrganization(String userId, String orgId);

    /**
     * 为机构指定流程管理员
     * @param orgId 机构ID
     * @param userIds 用户ID
     */
    void addAdministratorsOfOrganization(String orgId, String... userIds);

    /**
     * 为机构指定流程管理员
     * @param orgId 机构ID
     * @param userIds 用户ID
     */
    void addAdministratorsOfOrganization(String orgId, Set<String> userIds);

    /**
     * 为机构指定流程管理员
     * @param orgId 机构ID
     * @param userIds 用户ID
     */
    void removeAdministratorsOfOrganization(String orgId, String... userIds);

    /**
     * 为机构指定流程管理员
     * @param orgId 机构ID
     * @param userIds 用户ID
     */
    void removeAdministratorsOfOrganization(String orgId, Set<String> userIds);
}
