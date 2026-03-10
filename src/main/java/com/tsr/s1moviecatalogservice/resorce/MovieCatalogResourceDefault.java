package com.tsr.s1moviecatalogservice.resorce;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsr.s1moviecatalogservice.model.CatalogItem;
import com.tsr.s1moviecatalogservice.model.Movie;

@RestController
//@RequestMapping("/")
public class MovieCatalogResourceDefault {
	
	static int cnt=100;
	
	@RequestMapping("/")
	public List<CatalogItem> getCatalog(){
		cnt++;
		return Arrays.asList(new CatalogItem("movie-" + cnt, "Default standalone response", 4));
	}
	
	@RequestMapping("/movie/{movieId}")
	public Movie getMovieInfo(@PathVariable String movieId) {
		System.out.println("TSR123 -- inside getMovieInfo()");
		return new Movie(movieId, "Hatyara1");
	}
	
	@RequestMapping("/hello")
	public String hello() {
        String hostname = System.getenv().getOrDefault("HOSTNAME", "unknown");
	      String message = System.getenv().getOrDefault("APP_MSG", null);
	      String response = "";

      	if (message == null)
      	  response = "Hello world from host "+hostname+"\n";
      	else
      	  response = "Hello world from host ["+hostname+"]. Message received = "+message+"\n";

        return response;
    }

}
