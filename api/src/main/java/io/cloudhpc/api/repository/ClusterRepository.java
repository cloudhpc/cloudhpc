package io.cloudhpc.api.repository;

import io.cloudhpc.api.entity.Cluster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClusterRepository extends JpaRepository<Cluster,Integer> {
}
