package kr.co.seoulit.erp.hr.affair.applicationservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import kr.co.seoulit.erp.hr.affair.to.AssignEmpTO;
import kr.co.seoulit.erp.hr.affair.to.BestEmpTO;
import kr.co.seoulit.erp.hr.affair.to.EmpTO;
import kr.co.seoulit.erp.hr.affair.to.EmployeeBasicTO;
import kr.co.seoulit.erp.hr.affair.to.RegistEMPTO;
import kr.co.seoulit.erp.hr.base.to.DeptTO;
/*import kr.co.seoulit.erp.hr.emp.dao.object;*/

import kr.co.seoulit.erp.hr.salary.to.BaseSalaryTO;

public interface EmpApplicationService {
	public EmpTO selectEmp(String name);

	public String findLastEmpCode();

	public ArrayList<EmpTO> findEmpMemberListByDept(String deptName);

	public ArrayList<EmpTO> findEmployeeListByDept(String deptName);

	public ArrayList<EmpTO> findEmpList();

	public void registEmployee(RegistEMPTO emp);

	/* public void modifyEmployee(EmpTO emp); */
	public void deleteEmpList(ArrayList<EmpTO> empList);

	public ArrayList<DeptTO> findDeptList();

	public ArrayList<BaseSalaryTO> selectPositionList();

	public ArrayList<EmpTO> findAllEmpInfo(HashMap<String, String> map);

	public void empInfoUpdate(Map<String, ArrayList<EmpTO>> empArray);

	public void insertAssign(HashMap<String, String> map);

	public ArrayList<EmployeeBasicTO> getEmpBasicInfo(String empCode);

	public ArrayList<AssignEmpTO> getAssignList(String startDate, String endDate);

	// update
	public void updateDeptCode(HashMap<String, String> map);

	public ArrayList<BestEmpTO> getBestEmp();
}