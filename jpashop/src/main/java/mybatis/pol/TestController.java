package mybatis.pol;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class TestController {
    private final TestService testService;



    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/test")
    public List<Portfolio> test() {
        System.out.println("testService.getAllDataList() = " + testService.getAllDataList());
        return testService.getAllDataList();
    }
}
