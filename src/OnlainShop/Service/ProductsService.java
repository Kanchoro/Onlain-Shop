package OnlainShop.Service;

import OnlainShop.Enum.Category;
import OnlainShop.Models.Products;

public interface ProductsService {
    Products saveProducts();
    void deleteProductById();
    void updateById();
    void getAll();
    void getSizesWithCategory();
    void izbraanyi();
    void deleteById();
    void getAllIz();
    void getById();

}
