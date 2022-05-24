package com.hyfly.milet.common.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * JwtUtil
 *
 * @author hyfly
 */
@Slf4j
public class JwtUtil {
    /**
     * 密钥，仅服务端存储
     */
    private static final String SECRET = "ko346134h_we]rg3in_yip1!";

    /**
     * @param subject   subject
     * @param issueDate 签发时间
     * @return String
     */
    public static String createToken(String subject, Date issueDate) {
        return Jwts.builder()
                .setSubject(subject)
                .setIssuedAt(issueDate)
                // .setExpiration(issueDate + xxx)
                .signWith(io.jsonwebtoken.SignatureAlgorithm.HS512, SECRET)
                .compact();
    }

    /**
     * 解密 jwt
     *
     * @param token token
     * @return JwtInfo
     */
    public static JwtInfo parseToken(String token) {
        try {
            // xxxx.xxxxx.xxxxxxxx
            Claims claims = Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token).getBody();
            if (claims != null) {
                JwtInfo ji = new JwtInfo();
                ji.setSubject(claims.getSubject());
                ji.setIssueDate(claims.getIssuedAt().getTime());
                return ji;
            }
        } catch (ExpiredJwtException e) {
            e.printStackTrace();
            log.warn("jwt过期了");
        }

        return null;
    }
}
