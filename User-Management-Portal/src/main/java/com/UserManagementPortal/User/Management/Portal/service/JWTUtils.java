package com.UserManagementPortal.User.Management.Portal.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.security.core.userdetails.UserDetails;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Date;
import java.util.function.Function;

public class JWTUtils {

    private final SecretKey Key;
    private static final long EXPIRE_DURATION = 8640000;

    public JWTUtils() {
        String secreteString = "843567893696976453275974432697R634976R738467TR678T34865R6834R8763T478378637664538745673865783678548735687R3";
        byte[] keyBytes = Base64.getDecoder().decode(secreteString.getBytes(StandardCharsets.UTF_8));
        this.Key = new SecretKeySpec(keyBytes, "HmacSHA256");

    }

    public String createToken(UserDetails userdetails) {
        return Jwts.builder()
                .setSubject(userdetails.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE_DURATION))
                .signWith(Key)
                .compact();
    }

   public String generateToken(UserDetails userdetails) {
       return Jwts.builder()
               .setSubject(userdetails.getUsername())
               .setIssuedAt(new Date(System.currentTimeMillis()))
               .setExpiration(new Date(System.currentTimeMillis() + EXPIRE_DURATION))
               .signWith(Key)
               .compact();
   }

   public String extractUsername(String token) {

       return extractClaims(token,Claims :: getSubject);
   }

    private <T> T extractClaims(String token, Function<Claims,T> claimsTFunction) {
        return  claimsTFunction.apply(Jwts.parser().verifyWith(Key).build().parseSignedClaims(token).getPayload());
    }

    public boolean isValidToken(String token,UserDetails userdetails){
        final String username = extractUsername(token);
        return username.equals(userdetails.getUsername());
    }

    public  boolean isTokenExpired(String token){
        return extractClaims(token,Claims::getExpiration).before(new Date());
    }


}
