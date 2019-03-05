package io.cloudhpc.api.entity;

import javax.persistence.*;

@Entity
@Table(name = "cluster")
public class Cluster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column
    private String name;
}
