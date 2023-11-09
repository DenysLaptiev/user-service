package com.springboot.user_service.controller.mvc;//package com.springboot.user_service.controller.mvc;
//
//import com.springboot.user_service.model.Album;
//import com.springboot.user_service.service.AlbumService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
//import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
//import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
//import org.springframework.security.oauth2.core.oidc.OidcIdToken;
//import org.springframework.security.oauth2.core.oidc.user.OidcUser;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.reactive.function.client.WebClient;
//
//import java.util.List;
//
//@Controller
//@Slf4j
//public class AlbumController {
//
//    //TODO: remove this class
//
//    private final AlbumService albumService;
//    private final OAuth2AuthorizedClientService oAuth2ClientService;
//    private final WebClient webClient;
//
//    @Autowired
//    public AlbumController(AlbumService albumService, OAuth2AuthorizedClientService oAuth2ClientService, WebClient webClient) {
//        this.albumService = albumService;
//        this.oAuth2ClientService = oAuth2ClientService;
//        this.webClient = webClient;
//    }
//
//    //TODO: refactor method, extract into several methods
//    //OidcUser = open id connect user - user yjat is registered using Authentication server (Keycloak)
//    @GetMapping("/albums")
//    public String getAlbums(Model model,
//                            @AuthenticationPrincipal OidcUser principal) {
//
//        log_security_info(principal);
//
//        String url = "http://localhost:8083/albums";
//
//        List<Album> albums = webClient
//                .get()
//                .uri(url)
//                .retrieve()
//                .bodyToMono(new ParameterizedTypeReference<List<Album>>() {
//                }).block();
//
////        List<Album> albums = albumService.getAll();
//        log.info("albums=" + albums);
//        model.addAttribute("albums", albums);
//        return "albums";
//    }
//
//    private String getJwtAccessToken() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        OAuth2AuthenticationToken oauthToken = (OAuth2AuthenticationToken) authentication;
//
//        OAuth2AuthorizedClient oAuth2Client = oAuth2ClientService.loadAuthorizedClient(
//                oauthToken.getAuthorizedClientRegistrationId(),
//                oauthToken.getName()
//        );
//
//        return oAuth2Client.getAccessToken().getTokenValue();
//    }
//
//    private String getOidcIdToken(OidcUser principal) {
//        OidcIdToken oidcIdToken = principal.getIdToken();
//        return oidcIdToken.getTokenValue();
//    }
//
//    private void log_security_info(OidcUser principal) {
//        log.info("--> principal=" + principal);
//
//        String oidcIdTokenValue = getOidcIdToken(principal);
//        log.info("--> oidcIdTokenValue=" + oidcIdTokenValue);
//
//        String jwtAccessToken = getJwtAccessToken();
//        log.info("--> jwtAccessToken=" + jwtAccessToken);
//    }
//}
