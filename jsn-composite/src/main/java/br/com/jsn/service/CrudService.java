package br.com.jsn.service;

public interface CrudService<E> {

    public E create( E e);
    public E read(Long id);
    public E update(Long id , E e);    
    public boolean delete(Long id );
    
    
}
