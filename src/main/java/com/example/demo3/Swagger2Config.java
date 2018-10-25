package com.example.demo3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
class Swagger2Config {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("HelloWorld")
                .apiInfo(apiInfo())
                .select()
                // 扫描的包所在位置
                .apis(RequestHandlerSelectors.basePackage("com.example.demo3.Web"))
                // 扫描的 URL 规则
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo() {
        // 联系信息
        return new ApiInfoBuilder()
                // 大标题
                .title("")
                // 描述
                .description("")
                // 服务条款 URL
                .termsOfServiceUrl("")
                // 版本
                .version("")
                .build();
    }
}
