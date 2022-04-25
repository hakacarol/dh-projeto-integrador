package com.digitalbooking.service;

import com.digitalbooking.model.Role;
import com.digitalbooking.model.UserAccount;
import com.digitalbooking.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserAccountRepository userAccountRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserAccount userAccount = userAccountRepository.findByEmail(username);

        Set<GrantedAuthority> grantList = new HashSet<GrantedAuthority>();
        for (Role role: userAccount.getRoles()) {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role.getName());
            grantList.add(grantedAuthority);
        }
        UserDetails user = null;
        user = (UserDetails) new User(username, userAccount.getPassword(), grantList);
        return user;
    }

    public static void main(String[] args) {
        // usei pra gerar o password codigicado que deve estar no banco
        System.out.println(new BCryptPasswordEncoder().encode("helenas"));
    }
}
