package com.reba.personascrud.service.impl;

import com.reba.personascrud.service.StatusService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StatusServiceImpl implements StatusService {
    private final EntityManager em;

    public StatusServiceImpl(EntityManager em) {
        this.em = em;
    }

    public List<Map<String, String>> getStats(){
        List<Map<String, String>> statusList = new ArrayList<>();
        Query query = em.createNativeQuery("SELECT c.name, round((( count(*)*100.00) / (select COUNT(*) from person)), 2) as cantidad FROM country c inner join person p on p.country_id = c.id group by c.id, c.name");
        List<Object[]> resultList = query.getResultList();
        for (Object[] status : resultList){
            Map<String, String> statusMap = new HashMap<>();
            statusMap.put("country", status[0].toString());
            statusMap.put("percentage", status[1].toString());
            statusList.add(statusMap);
        }
        return statusList;
    }
}
