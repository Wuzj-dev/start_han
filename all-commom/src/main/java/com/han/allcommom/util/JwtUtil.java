package com.han.allcommom.util;


import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.AlgorithmMismatchException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Calendar;
import java.util.UUID;

public class JwtUtil {
    /**
     * 秘钥
     */
    private static final String SECRET = "密码";


    /**
     * 1.token 用户非法访问拦截
     * @return 2个小时，
     */
    public static String creatToken(){
        JWTCreator.Builder builder=JWT.create();
        builder.withClaim("UUID", UUID.randomUUID().toString());//确保RToken是唯一
        Calendar instance=Calendar.getInstance();
        //instance.add(Calendar.DATE,30);//30天
        instance.add(Calendar.HOUR, 2);//2个小时
        builder.withExpiresAt(instance.getTime());
        return builder.sign(Algorithm.HMAC256(SECRET));
    }

    /**
     * 2.是否合法（如果错误会自动抛出异常）重点是401过期
     * @param token 凭证
     * @return 结果
     */
    public static DecodedJWT getToken(String token){
        try{
            Algorithm algorithm=Algorithm.HMAC256(SECRET);
            JWTVerifier build=JWT.require(algorithm).build();//验证对象
            return build.verify(token);
        }catch (SignatureVerificationException e){
            ThrowException.verify(true,400,"无效签名！");
            return null;
        }catch (TokenExpiredException e){
            ThrowException.verify(true,401,"token过期！");
            return null;
        }catch (AlgorithmMismatchException e){
            ThrowException.verify(true,400,"算法不一致！");
            return null;
        }catch (Exception e){
            ThrowException.verify(true,400,"token无效");
            return null;
        }
    }

    public static Integer ExceptionCode(String token){
        try{
            Algorithm algorithm=Algorithm.HMAC256(SECRET);
            JWT.require(algorithm).build();//验证对象
            return 200;
        }catch (SignatureVerificationException e){
            return 400;//无效签名！
        }catch (TokenExpiredException e){
            return 401;//token过期！(重点)
        }catch (AlgorithmMismatchException e){
            return 402;//算法不一致！
        }catch (Exception e){
            return 403;//token其它问题
        }
    }

}
