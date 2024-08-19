package com.zosh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zosh.model.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
