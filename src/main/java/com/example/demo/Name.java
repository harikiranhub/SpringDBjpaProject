package com.example.demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Entity
@Table(name = "user_tbl")
@Data
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "getAllNames",
                                    procedureName = "uspGetName",
        resultClasses = Name.class,
        parameters = { 
        	      @StoredProcedureParameter( name = " name",  type = String.class,  mode = ParameterMode.IN)
        	     
        	     }),

})
public class Name implements Serializable {
	@NotEmpty
	@Id
	private String myname;
}
