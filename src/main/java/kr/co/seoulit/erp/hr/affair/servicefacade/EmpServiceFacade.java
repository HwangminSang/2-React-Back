package kr.co.seoulit.erp.hr.affair.servicefacade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.co.seoulit.erp.hr.affair.to.AssignEmpTO;
import kr.co.seoulit.erp.hr.affair.to.BestEmpTO;
import kr.co.seoulit.erp.hr.affair.to.EmpTO;
import kr.co.seoulit.erp.hr.affair.to.EmployeeBasicTO;
import kr.co.seoulit.erp.hr.affair.to.RegistEMPTO;
import kr.co.seoulit.erp.hr.base.to.DeptTO;


public interface EmpServiceFacade {
	public EmpTO getEmp(String name); // selectEmp

	public String findLastEmpCode();

	public ArrayList<EmpTO> findAllEmpInfo(HashMap<String, String> map);

	public List<EmpTO> findEmpList(String dept); // findEmployeeListByDept

	public List<EmpTO> findEmpMemberList(String dept);

	public List<EmpTO> findEmpList();

	public void registEmployee(RegistEMPTO emp);

	/* public void modifyEmployee(EmpTO emp); */
	public void deleteEmpList(ArrayList<EmpTO> empList);

	public ArrayList<DeptTO> findDeptList();

	public ArrayList<AssignEmpTO> findAssignList(String startDate, String endDate);

	public void empInfoUpdate(Map<String, ArrayList<EmpTO>> empArray);

	public void addAssignInfo(HashMap<String, String> map);

	public ArrayList<EmployeeBasicTO> getEmpBasicInfo(String empCode);

	// update
	public void updateDeptCode(HashMap<String, String> map);

	public ArrayList<BestEmpTO> bestEmp();
}