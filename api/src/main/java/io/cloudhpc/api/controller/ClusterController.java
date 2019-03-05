package io.cloudhpc.api.controller;

import io.cloudhpc.api.entity.Cluster;
import io.cloudhpc.api.service.ClusterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cluster")
public class ClusterController {
    @Autowired
    private ClusterService clusterService;

    @GetMapping("/all")
    public ResponseEntity<List<Cluster>> all(){
        return ResponseEntity.ok(clusterService.findAll());
    }
}
