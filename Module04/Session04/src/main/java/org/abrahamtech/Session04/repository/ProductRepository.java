package org.abrahamtech.Session04.repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.abrahamtech.Session04.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    
    //REPOSITORY -> Es una capa en la cual se expone metodos para poder manejar la persistencia (Base de DAtos, Lista) de lo que voy a almacenar

    private long currentId;
    private List<Product> products;

    public ProductRepository() {
        currentId = 1;
        products = new LinkedList<>();
    }

    public List<Product> getAll() {
        return products;
    }

    public Product getById(long id) {
        /*JUNIOR Version*/
        Product data = null;

        for(Product product : products) {
            if (product.getId() == id) {
                data = product;
                break;
            }
        }

        return data;
    }

    //Optional = Null Safe, es decir, evitamos usar "null" directamente
    public Optional<Product> getByIdJunior(long id) {
        /*JUNIOR Version*/
        Product data = null;

        for(Product product : products) {
            if (product.getId() == id) {
                return Optional.of(product);
            }
        }

        return Optional.empty();

        /*SENIOR Version */
        //return products.stream().filter( x -> x.getId() == id).findFirst();
    }

    public Product save(Product data) {
        data.setId(++currentId);
        products.add(data);
        return data;
    }

    public void update(long id, Product data) {
        Optional<Product> entry = getByIdJunior(id);

        if (!entry.isPresent()) {
            return;
        }

        Product product = entry.get();

        if(data.getName() != null) {
            product.setName(data.getName());
        }

        if(data.getPrice() > 0) {
            product.setPrice(data.getPrice());
        }

        if(data.getQuantity() > 0) {
            product.setQuantity(data.getQuantity());
        }
    }
} 
