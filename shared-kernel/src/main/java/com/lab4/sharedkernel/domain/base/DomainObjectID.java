package com.lab4.sharedkernel.domain.base;

import lombok.Getter;

import javax.persistence.Embeddable;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@Embeddable
@Getter
public class DomainObjectID implements Serializable {

    private String id;
}
