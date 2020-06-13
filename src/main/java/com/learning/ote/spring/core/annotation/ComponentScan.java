package com.learning.ote.spring.core.annotation;

import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.springframework.context.support.GenericApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ComponentScan {
    GenericApplicationContext context;

    public ComponentScan(GenericApplicationContext context) {
        this.context = context;
    }

    public List<Object> parse(String path) {
        try {
            Reflections reflections = new Reflections(path, new SubTypesScanner(false));
            Set<Class<?>> allClasses = reflections.getSubTypesOf(Object.class);

            Map<String, Class<?>> beans = allClasses.stream()
                    .filter(c -> c.isAnnotationPresent(BeanAnnotation.class))
                    .collect(Collectors.toMap(bean -> bean.getAnnotation(BeanAnnotation.class).name(), bean -> bean));

            addBeansToContext(beans);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private void addBeansToContext(Map<String, Class<?>> beans) {
        beans.forEach(
                (name, bean) -> this.context.registerBean(name, bean)
        );
        context.refresh();
    }
}
