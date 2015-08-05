package core.dao;

import core.dao.base.AbstractDao;
import core.model.Company;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

@Repository
public class CompaniesDaoHibernateImpl extends AbstractDao<Company> implements CompanyDao
{
    @Override
    public Company GetCompanyByName(String companyName) {
        String hql = "select com from Company as com where name = :name";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("name", companyName);

        Company company = (Company)query.uniqueResult();

        return company;
    }
}
