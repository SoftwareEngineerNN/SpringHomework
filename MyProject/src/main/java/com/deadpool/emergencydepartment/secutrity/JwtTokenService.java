package com.deadpool.emergencydepartment.secutrity;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class JwtTokenService {

    private static final String secret = "SecretKey";

        public String getUserNameFromToken(String token) {
            return null;
        }

        public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
            Claims claims = getClaims(token);
            return claimsResolver.apply(claims);
        }

        public Claims getClaims(String token) {
            return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
        }


}
