//package com.sandbox.backendsandbox.controllers;
//
//
//import com.sandbox.backendsandbox.models.ERole;
//import com.sandbox.backendsandbox.models.Role;
//import com.sandbox.backendsandbox.models.User;
//import com.sandbox.backendsandbox.payload.request.LoginRequest;
//import com.sandbox.backendsandbox.payload.response.JwtResponse;
//import com.sandbox.backendsandbox.payload.response.MessageResponse;
//import com.sandbox.backendsandbox.repository.RoleRepository;
//import com.sandbox.backendsandbox.repository.UserRepository;
//import com.sandbox.backendsandbox.security.jwt.JwtUtils;
//import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//@RestController
//@CrossOrigin()
//@RequestMapping("/api/auth")
//public class AuthController {
//
//    @Autowired
//    AuthenticationManager authenticationManager;
//
//    @Autowired
//    UserRepository userRepository;
//
//    @Autowired
//    RoleRepository roleRepository;
//
//    @Autowired
//    PasswordEncoder encoder;
//
//    @Autowired
//    JwtUtils jwtUtils;
//
//    @PostMapping("/signin")
//    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest){
//
//        Authentication authentication=authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
//
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//        String jwt=jwtUtil.generateJwtToken(authentication);
//
//        UserDetailsImp userDetails=(UserDetailsImp) authentication.getPrincipal();
//        List<String> roles=userDetails.getAuthorities().stream()
//                .map(item -> item.getAuthority())
//                .collect(Collectors.toList());
//
//        return ResponseEntity.ok(new JwtResponse(jwt,
//                              userDetails.getId(),
//                              userDetails.getUsername(),
//                              userDetails.getEmail(),
//                               roles));
//    }
//
//    @PostMapping("/signup")
//    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest){
//        if(userRepository.existsByUsername(signupRequest.getUsername())){
//            return ResponseEntity
//                    .badRequest()
//                    .body(new MessageResponse("Error: Username is already taken!"));
//        }
//
//        if(userRepository.existsByEmail(signUpRequest.getEmail())){
//            return ResponseEntity
//                    .badRequest()
//                    .body(new MessageResponse("Error: Email is already taken!"));
//        }
//
//        // Create new user's account
//        User user=new User(signUpRequest.getUserame(),
//                           signUpRequest.getEmail(),
//                           encoder.encode(signUpRequest.getPassword()));
//
//        Set<String> strRoles=signUpRequest.getRole();
//        Set<Role> roles=new HashSet();
//
//        if(strRoles==null){
//            Role userRole=roleRepository.findByName(ERole.ROLE_USER)
//                    .orElseThrow(() -> new RuntimeException("Error: Roles is not found"));
//            roles.add(adminRole);
//        } else {
//            strRoles.forEach(role -> {
//                switch (role) {
//                    case "admin":
//                        Role adminRole=roleRepository.findByName(ERole.ROLE_ADMIN)
//                                .orElseThrow(() -> new RuntimeException("Error: Roles is not found"));
//                        roles.add(userRole);
//                        break;
//                    case "mod":
//                        Role modRole=roleRepository.findByName(ERole.ROLE_MODERATOR)
//                                .orElseThrow(() -> new RuntimeException("Error: Roles is not found"));
//                        roles.add(modRole);
//                        break;
//                    default:
//                        Role userRole=roleRepository.findByName(ERole.ROLE_USER)
//                                .orElseThrow(() -> new RuntimeException("Error: Roles is not found"));
//                        roles.add(userRole);
//                }
//            });
//        }
//        user.setRoles(roles);
//        userRepository.save(user);
//
//        return ResponseEntity.ok(new MessageResponse("User registered successfully"));
//    }
//
//}
