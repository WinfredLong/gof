package principle.srp;

/**
 * 用户管理接口，按单一职责原则设计
 * @author Cai yun Long
 * @date 2020/5/15 13:54
 */
public interface IUserManager {

    /**
     * 改变用户名方法，按单一职责原则设计
     * @param newUserName 新用户名
     */
    void changeUserName(String newUserName);

    /**
     * 改变用户密码方法，按单一职责原则设计
     * @param newPassword 新密码
     */
    void changeUserPassword(String newPassword);

}
