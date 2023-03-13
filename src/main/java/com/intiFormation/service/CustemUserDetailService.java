package com.intiFormation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.intiFormation.entity.Role;
import com.intiFormation.entity.Utilisateur;

@Service
public class CustemUserDetailService implements UserDetailsService {

	@Autowired
	private IUtilisateurservice utilisateurService;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Utilisateur utilisateur=utilisateurService.chercherParUsername(username);
		
		if(utilisateur==null)
		{
			throw new UsernameNotFoundException(username);
		}
		
		Role role=utilisateur.getRole();
		
		List<GrantedAuthority> listeRole= new ArrayList<>();
		
		GrantedAuthority grantedAuthority= new SimpleGrantedAuthority(role.getNom_role());
		
		listeRole.add(grantedAuthority);
		
		UserDetails user= new User(utilisateur.getUsername(), utilisateur.getPassword(),listeRole);
			
			
		return user;
	}

}
