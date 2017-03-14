package com.pluralsigth.service;

import java.util.List;

import com.pluralsigth.model.Custumer;
import com.pluralsigth.repository.CustumerRepository;

public class CustumerServiceImpl implements CustumerService {

	
	private CustumerRepository custumerRepository;
	
	public CustumerServiceImpl() {
	}
	
	public CustumerServiceImpl(CustumerRepository custumerRepository) {
		this.custumerRepository = custumerRepository;
	}

	/* (non-Javadoc)
	 * @see com.pluralsigth.service.CustumerService#findAll()
	 */
	@Override
	public List<Custumer> findAll(){
		return custumerRepository.findAll();
	}

	public void setCustumerRepository(CustumerRepository custumerRepository) {
		this.custumerRepository = custumerRepository;
	}
}
