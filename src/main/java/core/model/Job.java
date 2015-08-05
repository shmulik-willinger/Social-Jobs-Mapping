package core.model;

import javax.persistence.*;
import java.sql.Date;
import java.text.DateFormat;

@Entity
@Table(name = "job")
public class Job
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer job_id;

    @Column(name = "start_date")
    private Date StartDate;

    @Column(name = "end_date")
    private Date EndDate;

    @Column(name = "company_id")
    private int CompanyId;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusType status;

  /*  public Job(Date startDate, Date endDate, int companyId) {
        StartDate = startDate;
        EndDate = endDate;
        CompanyId = companyId;
        //this.status = status;
    }*/

    public Integer getJob_id() {
        return job_id;
    }

    public void setJob_id(Integer job_id) {
        this.job_id = job_id;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }

    public int getCompanyId() {
        return CompanyId;
    }

    public void setCompanyId(int companyId) {
        CompanyId = companyId;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }
}
