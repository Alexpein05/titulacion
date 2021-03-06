package ec.edu.ug.erp.dao.facturacion.impl;

import org.springframework.stereotype.Repository;

import ec.edu.ug.erp.dao.facturacion.FacturacionDao;
import ec.edu.ug.erp.dto.facturacion.GenericFacturacionDTO;
import ec.edu.ug.erp.util.dao.impl.GenericDAOImpl;

@Repository("facturacionDAO")
public class FacturacionDaoImpl extends GenericDAOImpl <GenericFacturacionDTO<?>>implements FacturacionDao{

}
