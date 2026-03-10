package com.tsr.s1moviecatalogservice.resorce;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsr.s1moviecatalogservice.model.CatalogItem;
import com.tsr.s1moviecatalogservice.model.Movie;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId){
		return Arrays.asList(
			new CatalogItem("Movie 1 for " + userId, "Standalone demo response", 4),
			new CatalogItem("Movie 2 for " + userId, "Standalone demo response", 5)
		);
	}
	
	@RequestMapping("/movie/{movieId}")
	public Movie getMovieInfo(@PathVariable String movieId) {
		System.out.println("TSR -- inside getMovieInfo()");
		return new Movie(movieId, "Hatyara13");
	}
}
