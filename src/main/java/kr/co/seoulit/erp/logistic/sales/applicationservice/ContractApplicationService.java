package kr.co.seoulit.erp.logistic.sales.applicationservice;

import java.util.ArrayList;
import java.util.HashMap;

import kr.co.seoulit.erp.logistic.sales.to.ContractDetailTO;
import kr.co.seoulit.erp.logistic.sales.to.ContractInfoTO;
import kr.co.seoulit.erp.logistic.sales.to.ContractTO;
import kr.co.seoulit.erp.logistic.sales.to.EstimateTO;

public interface ContractApplicationService {

	public ArrayList<ContractInfoTO> getContractList(String startDate, String endDate);

	public ArrayList<ContractInfoTO> getContractListByCustomer(String customerCode);

	public ArrayList<ContractDetailTO> getContractDetailList(String estimateNo);

	public ArrayList<EstimateTO> getEstimateListInContractAvailable(String startDate, String endDate);

	public String getNewContractNo(String contractDate);

	public HashMap<String, Object> addNewContract(String contractDate, String personCodeInCharge,
			ContractTO workingContractTO);

	public HashMap<String, Object> batchContractDetailListProcess(ArrayList<ContractDetailTO> contractDetailTOList);

	public void changeContractStatusInEstimate(String estimateNo, String contractStatus);

	public ArrayList<ContractInfoTO> getDeliverableContractList(String searchCondition, String[] paramArray);

}
