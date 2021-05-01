package com.deadpool.emergencydepartment.secutrity;

import com.deadpool.emergencydepartment.repository.patient.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailService implements UserDetailsService {
    private final PatientRepository patientRepository;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {


        return null;
    }
}
