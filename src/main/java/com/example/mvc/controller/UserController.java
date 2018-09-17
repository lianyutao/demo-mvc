package com.example.mvc.controller;

import java.awt.print.Pageable;

import javax.servlet.http.HttpServletRequest;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.mvc.common.Constants;
import com.example.mvc.entity.User;
import com.example.mvc.model.request.UserRequest;
import com.example.mvc.model.response.ResultListResponse;
import com.example.mvc.model.response.UserModel;

@RestController
public class UserController {
	@RequestMapping(value="/api/users",method= RequestMethod.POST)
	public ResultListResponse<UserModel> findUsers(UserRequest userReq, BindingResult result, HttpServletRequest request){
		ResultListResponse<UserModel> res = new ResultListResponse<UserModel>();
		res.setCode(Constants.ResultCode.ERROR);
		if (result.hasErrors()) {
			res.setMessage(result.getAllErrors().get(0).getDefaultMessage());
			return res;
		}
		Sort sort = new Sort(Sort.Direction.ASC,"id");
		Pageable pageable = (Pageable) new PageRequest(userReq.getCurrentPage()-1,userReq.getPagesize(),sort);
//		Specification<User> spec = (root,query,cb) ->
		return res;
		
	}
}
