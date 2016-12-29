package com.team.foodybox.utils;

import java.io.IOException;
import java.io.Serializable;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team.foodybox.exception.MightyAppException;
import com.team.foodybox.logger.FoodyLogger;

/**
 * 
 * @author Shankara
 *
 */
public class JsonUtil implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static FoodyLogger logger = FoodyLogger.getLogger(JsonUtil.class);

	private static ObjectMapper objMap = new ObjectMapper();
	
	private JsonUtil(){}
	
	public static <T> T jsonToObj(String json,Class<T> clzz) throws MightyAppException {
		T obj = null;
		try {
			obj = (T) objMap.readValue(json,clzz);
			objMap.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
			logger.debug("After conversion of Json to Object", obj);
		} catch (JsonParseException e) {
			throw new MightyAppException( "Json Parsing Exception in JasonUtil class", HttpStatus.INTERNAL_SERVER_ERROR, e);
		} catch (JsonMappingException e) {
			throw new MightyAppException( "Json Mapping Exception in JasonUtil class", HttpStatus.INTERNAL_SERVER_ERROR, e);
		} catch (IOException e) {
			throw new MightyAppException( "Json IO Exception in JasonUtil class", HttpStatus.INTERNAL_SERVER_ERROR, e);
		}
		return obj;
	}
	
	public static <T> String objToJson(T obj) throws MightyAppException {
		String json = null;
		try {			
			json = objMap.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			throw new MightyAppException("Json Processing Exception in JasonUtil class in Obj to Json",HttpStatus.INTERNAL_SERVER_ERROR, e);
		}
		return json;
	}
}