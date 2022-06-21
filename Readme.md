# Spring boot + Theymeleaf

### 練習 Theymeleaf

1. 新增Controller

```java
@Controller
public class homeController {

    @GetMapping("home")//對應到hom.html
    public String getIndex(Model model) {
        model.addAttribute("userName", "Tom");
        model.addAttribute("userAge", 18);
        model.addAttribute("userSex", "boy");

        return "home";
    }
}
```