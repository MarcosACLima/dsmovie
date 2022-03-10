package com.devsuperior.dsmovie.dto;

public class ScoreDTO {
	
	/* Salvar id do filme, email e valor da avaliacao (1 a 5) */
	private Long movieId;
	private String email;
	private Double score;
	
	public ScoreDTO() {
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}
	
}
