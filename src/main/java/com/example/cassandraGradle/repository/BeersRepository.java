package com.example.cassandraGradle.repository;

import com.example.cassandraGradle.model.Beer;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BeersRepository extends CrudRepository<Beer,String >{
    @Query("update beers set preco = ?0, valormedida = ?1, unidademedida = ?2 where marca = ?3 and tipoEmbalagem = ?4")
    void updateBeer(double preco, double valormedida, String unidademedida, String marca, String tipoEmbalagem);
    @Query("DELETE FROM beers WHERE marca = ?0 and tipoEmbalagem = ?1")
    void deleteByMarcaEqualsAndAndTipoEmbalagem(String marca, String tipoEmbalagem);
    List<Beer> findByMarca(String marca);
}
