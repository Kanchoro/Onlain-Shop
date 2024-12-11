package OnlainShop.DAO;

import OnlainShop.Enum.Category;
import OnlainShop.Models.Products;

public interface ProductsDAO {
void addProduct(Products products);
void deleteProductById(long id);
void updateById(long id ,Products products);
void getAll();
void getSizesWithCategory(Category category);
void izbraanyi(long id);
void deleteById(long id);
void getAllIz();
void getById(long id);

}
