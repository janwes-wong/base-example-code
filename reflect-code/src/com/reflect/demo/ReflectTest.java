package com.reflect.demo;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Janwes
 * @version 1.0
 * @package com.reflect.demo
 * @date 2021/10/28 16:57
 * @description
 */
public class ReflectTest {
    public static void main(String[] args) {
        Person person = new Person("jack", "123456", 25, "men");
        // 获取字节码对象
        Class clazz = person.getClass();

        try {
            // 获取所有私有属性
            Field[] declaredFields = clazz.getDeclaredFields();
            for (Field declaredField : declaredFields) {
                // 获取属性名
                String fieldName = declaredField.getName();
                // 属性描述器
                PropertyDescriptor propertyDescriptor = new PropertyDescriptor(fieldName, clazz);
                // 获取get方法
                Method method = propertyDescriptor.getReadMethod();
                // 调用方法获取属性值
                Object value = method.invoke(person);

                System.out.println(fieldName + "--" + value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //invokeSet(person, "password", "qazwsx123");
        try {
            setMethod(person, "password").invoke(person, "qazwsx123");
            //invokeSet(person, "age", 15);
        } catch (Exception e) {
            e.printStackTrace();
        }
        setProperty(person, "username", "judy");
        System.out.println(person);
        setFiledValue(person, "username", "lucy");
        System.out.println(person.toString());
        invokeSet(person,"age",100);
        System.out.println(person.toString());
    }

    /**
     * java反射bean获取get方法
     *
     * @param t
     * @param filedName
     * @param <T>
     * @return
     */
    private static <T> Method getMethod(T t, String filedName) {
        if (t == null || filedName == null) return null;
        try {
            // 获取字节码对象
            Class<?> clazz = t.getClass();
            // 根据字段名获取字段对象
            Field field = clazz.getDeclaredField(filedName);
            // 反射获取字段名
            String fieldName = field.getName();
            // 属性描述器
            PropertyDescriptor propertyDescriptor = new PropertyDescriptor(fieldName, clazz);
            // 获取get方法
            return propertyDescriptor.getReadMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * java反射bean获取set方法
     *
     * @param t
     * @param filedName
     * @param <T>
     * @return
     */
    private static <T> Method setMethod(T t, String filedName) {
        if (t == null || filedName == null) return null;
        try {
            // 获取字节码对象
            Class<?> clazz = t.getClass();
            // 根据字段名获取字段对象
            Field field = clazz.getDeclaredField(filedName);
            // 反射获取字段名
            String fieldName = field.getName();
            // 属性描述器
            PropertyDescriptor propertyDescriptor = new PropertyDescriptor(fieldName, clazz);
            // 获取set方法
            return propertyDescriptor.getWriteMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * java反射执行get方法
     *
     * @param t
     * @param filedName
     * @param <T>
     * @return
     */
    private static <T> Object invokeGet(T t, String filedName) {
        Method method = getMethod(t, filedName);
        try {
            return method.invoke(t);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * java反射执行set方法
     *
     * @param t         泛型类
     * @param filedName 字段名
     * @param value     字段属性值
     * @param <T>
     * @return
     */
    private static <T> void invokeSet(T t, String filedName, Object value) {
        Method method = setMethod(t, filedName);
        try {
            method.invoke(t, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static <T> void setFiledValue(T t, String filedName, Object value) {
        try {
            Class<?> clazz = t.getClass();
            // 拼接组成set方法名
            String methodName = "set" + filedName.substring(0, 1).toUpperCase() + filedName.substring(1);
            // 此处获取方法的参数parameterTypes需做判定处理
            Method method = clazz.getMethod(methodName, String.class);
            method.invoke(t, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * java反射设置字段值
     *
     * @param t         泛型类
     * @param filedName 字段名
     * @param value     字段属性值
     * @param <T>
     * @return
     */
    private static <T> void setProperty(T t, String filedName, Object value) {
        Class<?> clazz = t.getClass();
        try {
            Field field = clazz.getDeclaredField(filedName);
            // 暴力反射 设置私有属性可访问
            field.setAccessible(true);
            // 设置字段值
            field.set(t, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
