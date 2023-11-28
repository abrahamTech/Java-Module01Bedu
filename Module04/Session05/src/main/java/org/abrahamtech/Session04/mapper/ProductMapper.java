package org.abrahamtech.Session04.mapper;

import org.abrahamtech.Session04.dto.CreateProductDTO;
import org.abrahamtech.Session04.dto.ProductDTO;
import org.abrahamtech.Session04.model.Product;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ProductMapper {
    
    //Metodo para convertir de Modelo (Fuente de datos) a DTO

    // source: Product
    // target: ProductDTO

    //No hay anotaciones porque la conversion es uno a uno, es decir:
    //Product.id -> ProductDTO.id
    //Product.name -> ProductDTO.name
    ProductDTO toDTO(Product model);
    


    //Metodo para convertir de DTO a Modelo

    // source: CreateProductDTO
    // target: Product

    //En el target se va a ignorar el campo "id"
    @Mapping(target = "id", ignore = true)
    //"stock" en el source pasa a ser "quantity" en el target
    @Mapping(source = "stock", target = "quantity")
    Product toModel(CreateProductDTO dto);
}
