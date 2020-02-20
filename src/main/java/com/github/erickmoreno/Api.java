package com.github.erickmoreno;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.geojson.Feature;
import org.geojson.FeatureCollection;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@RequestScoped
public class Api {

	ObjectMapper mapper = new ObjectMapper();

	public FeatureCollection getGeojson() {

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		FeatureCollection coll = null;
		return coll;
	}
	
	private List<Feature> callUntil(Function<Integer, List<Feature>> call) {
		List<Feature> ret = new ArrayList<>();
		
		return ret;
	}
	
}