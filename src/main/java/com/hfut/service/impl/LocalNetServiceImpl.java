package com.hfut.service.impl;

import com.hfut.entity.LNetWorkload;
import com.hfut.entity.LNetWorkloadExample;
import com.hfut.mapper.LNetWorkloadMapper;
import com.hfut.service.LocalNetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class LocalNetServiceImpl implements LocalNetService {
    @Autowired
    private LNetWorkloadMapper workloadMapper;

    @Override
    public List<LNetWorkload> findAllLoad(Integer page, Integer limit) throws Exception {
        LNetWorkloadExample example = new LNetWorkloadExample();
        LNetWorkloadExample.Criteria criteria = example.createCriteria();
        criteria.andIdIsNotNull();
        example.setOffset(page);
        example.setLimit(limit);
        return workloadMapper.selectByExample(example);
    }

    @Override
    public int getCount() throws Exception {
        LNetWorkloadExample example = new LNetWorkloadExample();
        LNetWorkloadExample.Criteria criteria = example.createCriteria();
        criteria.andIdIsNotNull();
        return workloadMapper.countByExample(example);
    }

    @Override
    public boolean updateLoad(LNetWorkload workload) throws Exception {
        //计算工作量 课时
        workload.setWorkload((float) (12 + (workload.getAnswer() - 20) * 0.12));
        workload.setWorkload((float) (Math.round(workload.getWorkload()*100)/100));

        LNetWorkloadExample workloadExample = new LNetWorkloadExample();
        LNetWorkloadExample.Criteria criteria = workloadExample.createCriteria();
        criteria.andIdEqualTo(workload.getId());
        if (workloadMapper.updateByExample(workload, workloadExample) == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean removeLoad(Integer id) throws Exception {
        LNetWorkloadExample expWorkloadExample = new LNetWorkloadExample();
        LNetWorkloadExample.Criteria criteria = expWorkloadExample.createCriteria();
        criteria.andIdEqualTo(id);
        if (workloadMapper.deleteByExample(expWorkloadExample) == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean insertLoad(LNetWorkload workload) throws Exception {
        workload.setWorkload((float) (12 + (workload.getAnswer() - 20) * 0.12));
        workload.setWorkload((float) (Math.round(workload.getWorkload()*100)/100));

        if (workloadMapper.insertSelective(workload) == 0) {
            return false;
        }
        return true;
    }

    @Override
    public List<LNetWorkload> insertLoadByList(List<LNetWorkload> list) throws Exception {
        ArrayList<LNetWorkload> ret = new ArrayList<LNetWorkload>();
        for (LNetWorkload workload : list) {
            if (!insertLoad(workload)) {
                ret.add(workload);
            }
        }
        return ret;
    }

    @Override
    public boolean removeLoad(List list) {
        LNetWorkloadExample expWorkloadExample = new LNetWorkloadExample();
        LNetWorkloadExample.Criteria criteria = expWorkloadExample.createCriteria();
        criteria.andIdIn(list);
        if (workloadMapper.deleteByExample(expWorkloadExample) == 0) {
            return false;
        } else {
            return true;
        }
    }

}
