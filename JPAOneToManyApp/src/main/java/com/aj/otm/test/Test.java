package com.aj.otm.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;

import javax.tools.FileObject;

import com.aj.otm.dao.CategoryDao;
import com.aj.otm.dao.impl.CategoryDaoImpl;
import com.aj.otm.entities.CategoryEntity;
import com.aj.otm.entities.ProductEntity;

public class Test {
	public static void main(String[] args) throws Exception{
		CategoryDao dao = new CategoryDaoImpl();
		
		 // Call saveCategory() method
		CategoryEntity categoryEntity = new CategoryEntity();
		categoryEntity.setCategoryId(12101);
		categoryEntity.setCategoryName("ELECTRONICS");

		ProductEntity productEntity1 = new ProductEntity();
		productEntity1.setProductId(220989);
		productEntity1.setProductName("Mobile");
		
		File file = new File("C:\\Users\\ajays\\Downloads\\phone6.jpg");
		byte[] imageBytes  = new byte[(int)file.length()];
		
		FileInputStream fis = new FileInputStream(file);
		
		fis.read(imageBytes);
		productEntity1.setProductImage(imageBytes);
		
		
		//proudct 2
		ProductEntity productEntity2 = new ProductEntity();
		productEntity2.setProductId(121);
		productEntity2.setProductName("Tv");
		
		File file2 = new File("C:\\Users\\ajays\\Downloads\\phone5.jpg");
		byte[] imageBytes_tv  = new byte[(int)file2.length()];
		
		FileInputStream fis2 = new FileInputStream(file2);
		
		fis2.read(imageBytes_tv);
		productEntity1.setProductImage(imageBytes_tv);
		
		//product 3
		
		ProductEntity productEntity3 = new ProductEntity();
		productEntity3.setProductId(12221);
		productEntity3.setProductName("PHone");
		
		File file3 = new File("C:\\Users\\ajays\\Downloads\\phone4.jpg");
		byte[] imageBytes_phone  = new byte[(int)file3.length()];
		
		FileInputStream fis3 = new FileInputStream(file3);
		
		fis3.read(imageBytes_phone);
		productEntity1.setProductImage(imageBytes_phone);
		
		
		//Add the ProductEntity instances to the Collection ie.e list
		List<ProductEntity> listOfProducts = 
				Arrays.asList(productEntity1, productEntity2,productEntity3);
		// set the collection to the category insatnce
		categoryEntity.setListOfProducts(listOfProducts);
		
		
		dao.saveCategory(categoryEntity);
		

		 
		
		/*
		 * Calling the fetchCatery() method 
		 */
//		CategoryEntity cEntity = dao.fetchCategory(12101);
//		System.out.println("Name of the Category is : "+ cEntity.getCategoryName());
//		List<ProductEntity> lst = cEntity.getListOfProducts();
//		//reading the first element of the list
//		ProductEntity pEntity = lst.get(0);
//		System.out.println("Name of the Product : "+ pEntity.getProductName());
//		byte[] byteOfImage = pEntity.getProductImage();
//		
//		File f1 = new File("C:\\Ajay\\mobil_img");
//		FileOutputStream fos = new FileOutputStream(f1);
//		fos.write(byteOfImage);
//		System.out.println("Please check the image at "+ f1.getAbsolutePath());
	
		
		/*
		 * calling remove removeCategory()
		 */
		//dao.removeCategory(12101);
	}

}
