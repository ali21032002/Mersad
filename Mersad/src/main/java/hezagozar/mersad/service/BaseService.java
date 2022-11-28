package hezagozar.mersad.service;


import java.util.List;
import java.util.UUID;

public interface BaseService<T>  {
    List<T> findAll()  throws  Exception;

    List<T> findByProperty(Object object) throws  Exception;

    T findById(UUID id) throws Exception;

    T saveOrUpdate (UUID id, T dto) throws  Exception;

    boolean removeById(UUID id) throws  Exception;

    boolean removeByDto(T dto ) throws  Exception;


}
