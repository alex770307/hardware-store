package org.hardwarestore.front;

import org.hardwarestore.back.dto.RequestCategoryDto;
import org.hardwarestore.back.dto.RequestProductDto;
import org.hardwarestore.back.dto.ResponseCategoryDto;
import org.hardwarestore.back.dto.ResponseProductDto;
import org.hardwarestore.back.entity.Category;
import org.hardwarestore.back.entity.Product;
import org.hardwarestore.back.repository.CategoryRepository;
import org.hardwarestore.back.repository.CategoryRepositoryImpl;
import org.hardwarestore.back.repository.ProductRepository;
import org.hardwarestore.back.repository.ProductRepositoryImpl;
import org.hardwarestore.back.service.*;

import java.util.List;

public class StoreApp {
    public static void main(String[] args) {

        CategoryRepository categoryRepository = new CategoryRepositoryImpl();
        ProductRepository productRepository = new ProductRepositoryImpl();

        AddCategoryService addCategoryService = new AddCategoryService(categoryRepository);
        AddProductService addProductService = new AddProductService(productRepository);
        FindCategoryService findCategoryService = new FindCategoryService(categoryRepository);
        FindProductService findProductService = new FindProductService(productRepository);
        DeleteCategoryService deleteCategoryService = new DeleteCategoryService(categoryRepository);
        DeleteProductService deleteProductService = new DeleteProductService(productRepository);

        addCategoryService.addCategory(new RequestCategoryDto("Processors","AMD, Intel"));
        addCategoryService.addCategory(new RequestCategoryDto("Mainboards","Asus, Gigabyte, Msi"));

        addProductService.addProduct(new RequestProductDto("AMD Ryzen 5 4500 - 3.6 GHz - 6 Kerne - 12 Threads",
                179.90, "AMD", new Category(1,"Processors", "AMD")));
        addProductService.addProduct(new RequestProductDto("GIGABYTE X870, Mainboard",
                250.00,"GIGABYTE", new Category(2,"Mainboards",
                "GIGABYTE X870 AORUS ELITE WIFI7 ICE .")));

        printCategoryList(findCategoryService.findAllCategory());
        printProductList(findProductService.findAllProduct());
    }
    private static void printProductList(List<ResponseProductDto>  productList) {
        for (ResponseProductDto productDto : productList) {
            System.out.println(productDto);
        }
    }
    private static void printCategoryList(List<ResponseCategoryDto> categoryList) {
        for (ResponseCategoryDto categoryDto : categoryList) {
            System.out.println(categoryDto);
        }
    }
}
