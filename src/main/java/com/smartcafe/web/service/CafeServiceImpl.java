package com.smartcafe.web.service;

import com.smartcafe.web.dao.CafeDao;
import com.smartcafe.web.domain.Cafe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CafeServiceImpl extends GenericServiceImpl<Cafe, Integer> implements CafeService {

    @Autowired
    CafeDao cafeDao;






}
