package core.dao;

import core.dao.base.AbstractDao;
import core.model.Person;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class PersonsDaoHibernateImpl extends AbstractDao<Person> implements PersonsDao {

    @Override
    public Person GetUserByName(String userName) {
        String hql = "select per from Person as per where first_name = :name";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("name", userName);

        Person person = (Person)query.uniqueResult();

        return person;
    }
}
