package mini01team02.user.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mini01team02.user.model.CartDAO;
import mini01team02.user.model.CartVO;





@Service
public class CartServiceImpl implements CartService {


	@Autowired
	CartDAO cartDAO;

	@Override
	public int InsertList(CartVO cartVO) throws SQLException {

		return cartDAO.InsertList(cartVO);
	}

	@Override
	public List<CartVO> CartList() throws SQLException {

		return cartDAO.CartList();
	}

	@Override
	public int CartDelete(int productId) throws SQLException {
		
		return cartDAO.CartDelete(productId);
	}






}
