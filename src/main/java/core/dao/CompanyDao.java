package core.dao;

import core.dao.base.BasicDao;
import core.model.Company;

public interface CompanyDao extends BasicDao<Company>
{
    Company GetCompanyByName(String name);
}
