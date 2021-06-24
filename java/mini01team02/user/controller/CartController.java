package mini01team02.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mini01team02.user.model.CartVO;


@Controller
public class CartController {


	@Autowired
	CartService cartService;


	@PostMapping("cart")
	public String CartListPost(Model model, CartVO cartVO) throws Exception {
		List<CartVO> cartList = cartService.CartList();
		int insertList = cartService.InsertList(cartVO);
		
		
		model.addAttribute("insertList",insertList);
		model.addAttribute("CartList",cartList);
		
		
		
		int total=0;
		for(int i=0; i<cartList.size(); i++) {
			cartVO = cartList.get(i);
			total = total+cartVO.getMoney();
		}
		model.addAttribute("total",total);

		return "redirect:/cart";
	}
	
	
	@GetMapping("cart")
	public String CartListGet(Model model, CartVO cartVO) throws Exception {
		List<CartVO> cartList = cartService.CartList();
		int insertList = cartService.InsertList(cartVO);
		
		model.addAttribute("CartList",cartList);
		model.addAttribute("insertList",insertList);
		
		int total=0;
		for(int i=0; i<cartList.size(); i++) {
			cartVO = cartList.get(i);
			total = total+cartVO.getMoney();
		}
		model.addAttribute("total",total);

		return "cart";
	}

	
	@GetMapping("CartDelete")
	public String CartDelete(@RequestParam("productId") int productId) throws Exception {
		cartService.CartDelete(productId);
		
		return "redirect:/cart";
		
	}
	


}
