package com.Kiiko.springcourse.config;

import com.Kiiko.springcourse.beans2.CatAnimal;
import com.Kiiko.springcourse.beans3.BeanE;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScans({
        @ComponentScan(basePackageClasses = CatAnimal.class),
        @ComponentScan(value = "com.Kiiko.springcourse.beans3",
                excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = BeanE.class)
        )
})
public class AppConfig2 {
}
