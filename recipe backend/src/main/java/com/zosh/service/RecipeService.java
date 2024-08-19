package com.zosh.service;

import java.util.List;


import com.zosh.model.Recipe;
import com.zosh.model.User;

public interface RecipeService {

	public Recipe createRecipe(Recipe recipe, User user);
	public Recipe findRecipeById(Long id) throws Exception;
	public void deleteRecipe(long id) throws Exception;
	public Recipe updateRecipe(Recipe recipe,Long id) throws Exception;
	public List<Recipe> findAllRecipe();
	public Recipe likeRecipe(Long recipeId,User user) throws Exception;
	
}
