//package com.han.login.service.utils;
//
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//
//import java.time.LocalDateTime;
//import java.time.ZoneId;
//import java.util.Date;
//import java.util.UUID;
//
///**
// * @Author: Wuj
// * @Description: TODO
// * @DateTime: 2023/5/5 21:36
// **/
//public class JwtUtil {
//
//
//    public static final long EXPIRE_SECONDS = 60*60*24;
//
//
//    public static final String JWT_KEY = "JWT_KEY";
//    public static String createJwtToken(){
//        String baseToken = UUID.randomUUID().toString();
//        LocalDateTime localDateTimeNow = LocalDateTime.now();
//        LocalDateTime localDateTimeExpire = localDateTimeNow.plusSeconds(EXPIRE_SECONDS);
//        Date from = Date.from(localDateTimeNow.atZone(ZoneId.systemDefault()).toInstant());
//        //token过期时间
//        Date expire = Date.from(localDateTimeExpire.atZone(ZoneId.systemDefault()).toInstant());
//        Claims jwtClaims = Jwts.claims().setSubject(baseToken);
//        jwtClaims.put("CLAIM_ID_KEY", "id");
//        String compactJws = Jwts.builder()
//                .setClaims(jwtClaims)
//                .setNotBefore(from)
//                .setExpiration(expire)
//                .signWith(SignatureAlgorithm.HS512, JWT_KEY)
//                .compact();
//        return compactJws;
//
//    }
//
//
//    /**
//     * 根据登陆token获取登陆信息
//     *
//     * @param token
//     * @return
//     */
//    public String getCustomerTokenInfo(String token) {
//        Long customerId = -1L;
//        try {
//            Claims claims = Jwts.parser().setSigningKey(JWT_KEY).parseClaimsJws(token).getBody();
//            String idStr = claims.get(CLAIM_ID_KEY).toString();
//            customerId = Long.valueOf(idStr);
//        } catch (Exception e) {
//            //这里如果token过期会报错
//            //io.jsonwebtoken.ExpiredJwtException: JWT expired at 2020-06-01T11:00:02Z. Current time: 2020-06-01T11:00:03Z, a
//            //difference of 1603 milliseconds.  Allowed clock skew: 0 milliseconds.
//            //出现如上报错说明woken已经过期，本文统一做登录失效处理，也可以根据具体的异常返回具体的信息
//            log.error("getCustomerTokenInfo error:{}", e);
//            return null;
//        }
//        CustomerEntity customer = customerService.getById(customerId);
//        if (customer == null) {
//            return null;
//        }
//        if (CustomerStatusEnum.DISABLED.getValue().equals(customer.getIsDisabled())) {
//            return null;
//        }
//        if (JudgeEnum.YES.equals(customer.getIsDelete())) {
//            return null;
//        }
//        return new RequestTokenBO(customer);
//    }
//
//
//}