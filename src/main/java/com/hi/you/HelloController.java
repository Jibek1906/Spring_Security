package com.hi.you;

import org.apache.catalina.authenticator.SpnegoAuthenticator.AuthenticateAction;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

    @GetMapping("/")

    public String home() {
        return "<h1>Welcome home</h1>";
    }

    @GetMapping("/user")
    public String user(Authentication authentication) {
        return "<h1>Welcome" + authentication.getName() + "!</h1>";
    }

    @GetMapping("/admin")
    public String admin(Authentication authentication) {
        return "<h1>Welcome" + authentication.getName() + "!</h1>";
    }

}
