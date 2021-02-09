package kr.co.iexe.springboot.web;

import kr.co.iexe.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value="/hello")
    public String hello() {
        return "hello";
    }

    // http://localhost:8080/hello/dto?name=한돈희&amount=1000
    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(
            @RequestParam("name") String name,
            @RequestParam("amount") int amount) {

        return new HelloResponseDto(name, amount);
    }

}
