//package com.codeup.codeupspringblog.services;
//
//import com.codeup.codeupspringblog.models.Post;
//import com.sendgrid.*;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//import java.io.IOException;
//
//@Service("EmailService")
//public class EmailService {
//
//    @Value("${spring.sendgrid.api-key}")
//    private String apiKey;
//
//    @Value("${RANDOM_API_KEY}")
//    private String key2;
//
//    public String sendTextEmail(Post post) {
//        Email from = new Email("jearredondo13@gmail.com");
//        String subject = "New Post has been created!";
//        Email to = new Email(post.getUser().getEmail());
//        Content content = new Content("text/plain", "Thank you for submitting a new post.");
//        Mail mail = new Mail(from, subject, to, content);
//
//        SendGrid sg = new SendGrid(apiKey);
//        System.out.println(apiKey);
//        System.out.println(key2);
//        Request request = new Request();
//
//        try {
//            request.setMethod(Method.POST);
//            request.setEndpoint("mail/send");
//            request.setBody(mail.build());
//            Response response = sg.api(request);
//            return response.getBody();
//        } catch(IOException ex) {
//            return ex.getMessage();
//        }
//    }
//}
