package io.cloudhpc.api.service;

import io.cloudhpc.api.entity.Cluster;
import io.cloudhpc.api.repository.ClusterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClusterService {

    @Autowired
    private ClusterRepository clusterRepository;

    public List<Cluster> findAll(){
        return clusterRepository.findAll();
    }

}
