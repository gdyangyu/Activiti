package io.workplus.activiti.identity;

/**
 * 角色查找接口，查找担任指定角色的人
 * Created by yyang on 2016/12/2.
 */
public interface CandidateFinder {

    /**
     * 查找person的顶头上司
     * @param person 人员
     * @return 如果找到，返回其的用户名，否则返回null
     */
    String bossOf(String person);

    /**
     * 查找person的n级上司。n = 1代表顶头上司，n = 2代表顶头上司的上司，依此类推。
     * @param person 人员
     * @param n 上司层级
     * @return 如果找到，返回其的用户名，否则返回null
     */
    String bossOf(String person, int n);

    /**
     * 查找person的顶头上司
     * @param person 人员
     * @param orgId 人员person所属的机构
     * @return 如果找到，返回其的用户名，否则返回null
     */
    String bossOf(String person, String orgId);

    /**
     * 查找person的n级上司。n = 1代表顶头上司，n = 2代表顶头上司的上司，依此类推。
     * @param person 人员
     * @param orgId 人员person所属的机构
     * @param n 上司层级
     * @return 如果找到，返回其的用户名，否则返回null
     */
    String bossOf(String person, String orgId, int n);

    /**
     * 查找在指定机构担任指定角色的人。
     * @param orgId 机构ID
     * @param role 角色
     * @return 如果orgId代表的机构含有角色role，返回担任该角色的人员用户名；如果本机构不包含该角色，则向上级机构查找，直至顶级机构。如最终没有找到，返回空数组。
     */
    String[] hasRole(String orgId, String role);

}
