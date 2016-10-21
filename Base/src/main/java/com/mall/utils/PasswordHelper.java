/**   
 * @Title: PasswordHelper.java
 * @Package com.mall.utils
 * @Description: TODO(用一句话描述该文件做什么)
 * @author 庄友权   
 * @date 2016年9月9日 下午5:25:57
 * @version V1.0   
 */

package com.mall.utils;

import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

import com.mall.model.user.UserLogin;

/**
 * @ClassName: 用户注册的时候密码生成工具
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年9月9日 下午5:25:57
 * 
 */

public class PasswordHelper {
    private static RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();
    private static String algorithmName = "md5";
    private final static int hashIterations = 2;

    public static void encryptPassword(UserLogin userLogin) {
    	userLogin.setSalt(randomNumberGenerator.nextBytes().toHex());
        String newPassword = new SimpleHash(algorithmName, userLogin.getPassword(),
                ByteSource.Util.bytes(userLogin.getCredentialsSalt()),
                hashIterations).toHex();
        userLogin.setPassword(newPassword);
    }
}
