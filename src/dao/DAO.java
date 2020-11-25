package dao;

import java.util.List;

public interface DAO<E> {
    default List<E> listarTodos(){
        throw new UnsupportedOperationException();
    }
    default List<E> listarDni(String id){
        throw new UnsupportedOperationException();
    }
    default void insertar(E ent){
        throw new UnsupportedOperationException();
    }
    default void modificar(E ent){
        throw new UnsupportedOperationException();
    }
    default void borrar(E ent){
        throw new UnsupportedOperationException();
    }
}
