package com.first.api.repository.actividadProducto;

import com.first.api.model.actividadProducto.Producto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ProductoRepository {

    private List<Producto> productos = new ArrayList<>();

    /*
    public ProductoRepository(List<Producto> productos) {
        crearProductos();
    }

    public void crearProductos(){
        productos = List.of(
                new Producto(1, "Producto01", 10, 1000),
                new Producto(2, "Producto02", 11, 2000),
                new Producto(3, "Producto03", 12, 3000),
                new Producto(4, "Producto04", 13, 4000),
                new Producto(5, "Producto05", 14, 5000),
                new Producto(6, "Producto06", 15, 6000),
                new Producto(7, "Producto07", 16, 7000),
                new Producto(8, "Producto08", 17, 8000),
                new Producto(9, "Producto09", 18, 9000)
        );
    }
*/
    public List<Producto> getAllProductos(){
        return productos;
    }

    public Producto findById(int id){
        for(int i = 0; i < productos.size(); i++){
            if(productos.get(i).getId() == id){
                return productos.get(i);
            }
        }
        return null;
    }

    public List<Producto> search(String nombre){
        return productos.stream()
                .filter(x -> x.getNombre().startsWith(nombre))
                .collect(Collectors.toList());

    }

    public Producto save(Producto p){
        Producto producto = new Producto();
        producto.setId(p.getId());
        producto.setNombre(p.getNombre());
        producto.setCantidad(p.getCantidad());
        producto.setPrecio(p.getPrecio());

        productos.add(producto);
        return producto;
    }

    public String delete(Integer id){
        productos.removeIf(x -> x.getId() == id);
        return null;
    }


    public Producto update(Producto producto){
        int idPos = 0;
        int id = 0;

        for(int i = 0; i < productos.size(); i++){
            if(productos.get(i).getId() == producto.getId()){
                id = producto.getId(); //ID del producto
                idPos = i; //posicion
                break;
            }
        }

        Producto producto1 = new Producto();
        producto1.setId(id);
        producto1.setNombre(producto.getNombre());
        producto1.setCantidad(producto.getCantidad());
        producto1.setPrecio(producto.getPrecio());
        productos.set(idPos, producto);
        return producto1;
    }

}
