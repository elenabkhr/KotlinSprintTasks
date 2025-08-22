package org.example.lesson19

enum class Product {
    CLOTHES {
        override fun getCategory(): String {
            return ("Одежда")
        }
    },
    OFFICE_SUPPLIES {
        override fun getCategory(): String {
            return ("Канцелярские товары")
        }
    },
    DIFFERENT {
        override fun getCategory(): String {
            return ("Разное")
        }
    };

    abstract fun getCategory(): String
}

class ProductDescription(val name: String, val id: Int, val category: Product) {
    fun getProductInfo() {
        println("Название: $name\nid: $id\nКатегория: ${category.getCategory()}")
    }
}