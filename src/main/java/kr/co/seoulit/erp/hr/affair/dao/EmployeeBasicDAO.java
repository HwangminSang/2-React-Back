package kr.co.seoulit.erp.hr.affair.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import kr.co.seoulit.erp.hr.affair.to.EmployeeBasicTO;

@Mapper
public interface EmployeeBasicDAO {

	public ArrayList<EmployeeBasicTO> selectEmployeeBasicList(String companyCode);

	public void insertEmployeeBasic(EmployeeBasicTO TO);

	public EmployeeBasicTO selectEmployeeBasicTO(HashMap<String, Object> param);

	public void changeUserAccountStatus(HashMap<String, String> param);

	public ArrayList<EmployeeBasicTO> getEmpBasicInfo(String empCode);

}
