/*
 * TESTE DE METODO PARA CONVERTER LocalDateTime
 * https://blog.tecsinapse.com.br/usando-localdate-java-8-no-hibernate4-jpa-2-1-972c463a44f9
 * */

package br.com.ecommerce.projetoecommerce.entity;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Date;
import java.time.LocalDate;
	
	@SuppressWarnings("rawtypes")
	@Converter(autoApply = true)
	public class LocalDatePersistenceConverter implements  AttributeConverter {
	
		public Date convertToDatabaseColumn(LocalDate entityValue) {
	   if(entityValue != null) {
	      return Date.valueOf(entityValue);
	   }
	      return null;
	}
	
	public LocalDate convertToEntityAttribute(Date databaseValue) {
	  if(databaseValue != null) {
	     return databaseValue.toLocalDate();
	  }
	     return null;
	  }
	
	@Override
	public Object convertToDatabaseColumn(Object attribute) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Object convertToEntityAttribute(Object dbData) {
		// TODO Auto-generated method stub
		return null;
	}
}