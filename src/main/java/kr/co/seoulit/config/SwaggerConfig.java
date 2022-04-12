package kr.co.seoulit.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
 //http://localhost:8088/swagger-ui/index.html   ( 문서 형태)
 // 연락처정보
 private  static  final Contact DEFAULT_CONTACT = new Contact(
         "Seoul IT"
         ,"HAHAHAH"
         ,"alstkd1q1q@naver.com");
    // api 정보
    private static final ApiInfo DEFAULT_API_INFO =new ApiInfo(
            "Awesome API Title"
            ,"My User management REST API service"
            ,"1.0"
            ,"urn:tos"
            ,DEFAULT_CONTACT
            ,"Apache 2.0"
            ,"htttp://www.apache.org/licenses/LICENSE-2.0"
            ,new ArrayList<>());


    //문서타입형식
    //asList메서드는 배열형태로 바꿔줌
    private  static  final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = new HashSet<>(
            Arrays.asList("application/json","application/xml"));


    @Bean
    public Docket restAPI() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(DEFAULT_API_INFO)
                .produces(DEFAULT_PRODUCES_AND_CONSUMES)
                .consumes(DEFAULT_PRODUCES_AND_CONSUMES);
    }


}