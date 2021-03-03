//package com.sandbox.backendsandbox.security.jwt;
//
//import com.sandbox.backendsandbox.security.services.UserDetailsImpl;
//import io.jsonwebtoken.*;
//import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//import java.security.Signature;
//import java.security.SignatureException;
//import java.util.Date;
//import java.util.logging.Logger;
//
//@Component
//public class JwtUtils {
//
//    @Value("${sandbox.app.jwtSecret}")
//    private String jwtSecret;
//
//    @Value("${sandbox.app.jwtExpirationMs}")
//    private int jwtExpirationMs;
//
//    public String generateJwtToken(Authentication authentication) {
//
//        UserDetailsImpl userPrincipal = (UserDetailsImpl) authentication.getPrincipal();
//
//        return Jwts.builder()
//                .setSubject((userPrincipal.getUsername()))
//                .setIssuedAt(new Date())
//                .setExpiration(new Date(new Date().getTime() + jwtExpirationMs))
//                .signWith(SignatureAlgorithm.HS512, jwtSecret)
//                .compact();
//    }
//
//    public String getUserNameFromJwtToken(String token) {
//        return Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody().getSubject();
//    }
//
//    public boolean validateJwtToken(String authToken){
//        try{
//            Jwts.parser().setSigningKey(jwtSecret).parseCliamsJws(authToken);
//            return true;
//        } catch(SignatureException e){
//            Logger.error("Invalid JWT signature: {}", e.getMessage());
//        } catch(MalformedJwtException e){
//            Logger.error("Invalid JWT token: {}", e.getMessage());
//        } catch(ExpiredJwtException e){
//            Logger.error("JWT token is expired: {}", e.getMessage());
//        } catch(UnsupportedJwtException e){
//            Logger.error("JWT token is unsupported: {}", e.getMessage());
//        } catch( e){
//            Logger.error("JWT  claims string is empty: {}", e.getMessage());
//        }
//        return false;
//    }
//}
