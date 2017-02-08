package com.baby.javaStudy.tij4.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 定义一个注解。该注解可以跟踪项目中的用例
// 注解中含有两个数据成员
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface UseCase {
	public int id();

	public String description() default "default --> no description";
}

class PasswordUtils {

	@UseCase(id = 1,description = "this is my first annotation")
	public boolean validatePassword(String password){
		System.out.println("public boolean validatePassword(String password) is " + password);
		
		return password.matches("\\w*\\d\\w*");
	}
	
	@UseCase(id = 23,description = "this is my 23 annotation")
	public String encryptPassword(String password){
		return new StringBuilder (password).reverse().toString();
	}
	
	@UseCase(id = 3)
	public boolean checkNewPassword(List<String> prevPasswords, String password){
		return !prevPasswords.contains(password);
	}
	
	
	public static void main(String[] strings){
		System.out.println(new PasswordUtils().validatePassword("w1s"));
	}
}

// 创建一个注解处理器。通过反射中的方法，取得方法中的注解信息
public class UseCaseTracker {
	public static void trackUseCase(List<Integer> useCases, Class<?> cl) {
		for (Method m : cl.getDeclaredMethods()) {
			UseCase uc = m.getAnnotation(UseCase.class);

			if (uc != null) {
				System.out.println(uc);
				System.out.println("find use case. id :" + uc.id() + "\t" + uc.description());
				useCases.remove(new Integer(uc.id()));
			}
		}

		for (int i : useCases) {
			System.out.println("warnning: missing use case " + i);
		}
	}

	public static void main(String[] args) {
		List<Integer> useCases = new ArrayList<Integer>();
		Collections.addAll(useCases, 34, 23, 1);
		trackUseCase(useCases, PasswordUtils.class);
	}

}
