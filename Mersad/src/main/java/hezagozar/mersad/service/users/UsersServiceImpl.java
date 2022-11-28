package hezagozar.mersad.service.users;

import hezagozar.mersad.web.model.users.UsersDto;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Slf4j
@Service
public class UsersServiceImpl  implements  UsersService{

    @Builder.Default
    private final List<UsersDto>  users=new ArrayList<>();


    @Override
    public List<UsersDto> findAll() throws Exception {
        return null;
    }

    @Override
    public List<UsersDto> findByProperty(Object object) throws Exception {
        return null;
    }

    @Override
    public UsersDto findById(UUID id) throws Exception {
        return null;
    }

    @Override
    public UsersDto saveOrUpdate(UUID id, UsersDto dto) throws Exception {
        return null;
    }

    @Override
    public boolean removeById(UUID id) throws Exception {
        return false;
    }

    @Override
    public boolean removeByDto(UsersDto dto) throws Exception {
        return false;
    }
}
