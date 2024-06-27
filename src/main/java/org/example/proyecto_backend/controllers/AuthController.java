package org.example.proyecto_backend.controllers;

import org.example.proyecto_backend.entities.Empleados;
import org.example.proyecto_backend.security.JwtUtil;
import org.example.proyecto_backend.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class AuthController {
    @Autowired
    private EmpleadoService empleadoService;

    private JwtUtil jwtUtil = new JwtUtil();

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthRequest request) {
        Optional<Empleados> empleado = empleadoService.getEmpleadoByEmail(request.getEmail());
        if (empleado.isPresent() && empleado.get().getContrasena().equals(request.getPassword())) {
            String token = jwtUtil.generateToken(empleado.get().getEmail());
            return ResponseEntity.ok(new AuthResponse(token));
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
    }

    public static class AuthRequest {
        private String email;
        private String password;

        // Getters y setters
        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

    public static class AuthResponse {
        private String token;

        public AuthResponse(String token) {
            this.token = token;
        }

        // Getters y setters
        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }
}

