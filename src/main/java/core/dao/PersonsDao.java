package core.dao;

import core.dao.base.BasicDao;
import core.model.Person;

public interface PersonsDao extends BasicDao<Person>
{
    Person GetUserByName(String name);
}
