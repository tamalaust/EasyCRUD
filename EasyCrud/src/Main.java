

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

import models.SuperUser;
import models.User;

public class Main {

	public static void main(String[] args) {
		
		User user= new User();
		SuperUser sup= new SuperUser();
		
		try {
			getBeanProperties(sup);
		} catch (IntrospectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getBeanProperties(Object obj) throws IntrospectionException{
		
		BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
		for (PropertyDescriptor propertyDesc : beanInfo.getPropertyDescriptors()) {
		    String propertyName = propertyDesc.getName();
		    		    
		   /* PROPERTIES ARE COMING FINE JUST AVOID "CLASS" PROPERTY*/
		    System.out.println("property name ::::::"+propertyName);
		}
	}

}
