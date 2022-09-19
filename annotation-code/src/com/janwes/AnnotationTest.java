package com.janwes;

import com.janwes.annotations.MethodInfo;
import com.janwes.annotations.Model;
import com.janwes.annotations.Property;
import com.janwes.pojo.Service;
import com.janwes.pojo.UserInfo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

/**
 * @author Janwes
 * @version 1.0
 * @package com.janwes
 * @date 2021/12/21 18:18
 * @description
 */
public class AnnotationTest {

    private static final String TABLE_NAME = "tableName";

    private static final String PROPERTY_NAME = "name";

    private static final String METHOD_NAME = "name";

    private static final String VALUE = "value";

    private static final String DESC = "desc";

    public static void main(String[] args) {
        getAnnotations();

        getMethod();
    }

    private static void getAnnotations() {
        Map<String, String> map = new HashMap<>();
        UserInfo userInfo = new UserInfo();
        // 获取字节码对象
        Class<? extends UserInfo> clazz = userInfo.getClass();
        // 判断类上是否有@Model注解
        if (clazz.isAnnotationPresent(Model.class)) {
            Model model = clazz.getAnnotation(Model.class);
            if (Objects.nonNull(model)) {
                map.put(TABLE_NAME, model.tableName());
                map.put(VALUE, model.value());
                map.put(DESC, model.desc());
            }
        }
        System.out.println(map);

        List<Map<String, Map<String, String>>> columns = new ArrayList<>();
        // 获取类的属性对象
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            String fieldName = field.getName();
            Map<String, Map<String, String>> columnMap = new HashMap<>();
            Map<String, String> anMap = new HashMap<>();
            // 判断属性上是否有@Property该注解
            if (field.isAnnotationPresent(Property.class)) {
                Property annotation = field.getAnnotation(Property.class);
                if (Objects.nonNull(annotation)) {
                    anMap.put(PROPERTY_NAME, annotation.name());
                    anMap.put(VALUE, annotation.value());
                    anMap.put(DESC, annotation.desc());
                    columnMap.put(fieldName, anMap);
                }
            }
            columns.add(columnMap);
        }
        System.out.println(columns);
    }

    private static void getMethod() {
        Service service = new Service();
        Class<? extends Service> clazz = service.getClass();
        Method[] methods = clazz.getMethods();
        List<Map<String, Map<String, String>>> methodList = new ArrayList<>();
        for (Method method : methods) {
            Map<String, Map<String, String>> methodMap = new HashMap<>();
            Map<String, String> anMap = new HashMap<>();
            String methodName = method.getName();
            if (method.isAnnotationPresent(MethodInfo.class)) {
                MethodInfo annotation = method.getAnnotation(MethodInfo.class);
                if (Objects.nonNull(annotation)) {
                    anMap.put(METHOD_NAME, annotation.name());
                    anMap.put(VALUE, annotation.value());
                    anMap.put(DESC, annotation.desc());
                    methodMap.put(methodName,anMap);
                }
            }
            if (methodMap.size() > 0) {
                methodList.add(methodMap);
            }
        }
        System.out.println(methodList);
    }
}
