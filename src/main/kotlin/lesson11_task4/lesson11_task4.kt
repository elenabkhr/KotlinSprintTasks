package org.example.lesson11_task4

class RecipeCategories (
    val idCategories: Int,
    val nameCategories: List<Recipe>,
)

class Recipe (
    val id: Int,
    val name: String,
    val category: String,
    val cookingMethod: String,
    val inFavorite: Boolean = false,
    val ingredients: List<Ingredients>,
)

class Ingredients(
    val nameIngredients: String,
    val numberIngredients: Int,
    val numberServings: Int,
)