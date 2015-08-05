package core.services;

import core.dao.CompanyDao;
import core.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class CompanyBusinessService
{
    @Autowired
    private CompanyDao companyDao;

    @Transactional
    public void saveCompany(Company company) throws Exception
    {
        if (ValidateUniqeCompanyName(company))
            companyDao.create(company);
        else
            throw new RuntimeException("Company already exist");
    }

    @Transactional
    public Company getById(Integer id) {
        return companyDao.read(Company.class, id);
    }

    @Transactional
    public void update(Company company) {
        companyDao.update(company);
    }

    private boolean ValidateUniqeCompanyName(Company company)
    {
        Company companyWithSameName = companyDao.GetCompanyByName(company.getName());
        return companyWithSameName == null;
    }
}
