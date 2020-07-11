package com.learning.ote.spring.mvc.specification;

import com.learning.ote.spring.mvc.domain.entity.AuthorEntity;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class AuthorSpecification implements Specification<AuthorEntity> {

    private String field;
    private String value;

    public AuthorSpecification(String field, String value) {
        this.field = field;
        this.value = value;
    }

    @Override
    public Predicate toPredicate(Root<AuthorEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
        if(root.get(field).getJavaType() == String.class) {
            return criteriaBuilder.like(root.<String>get(field), "%" + value + "%");
        }
        else {
            return criteriaBuilder.equal(root.<String>get(field), "%" + value + "%");
        }
    }
}
