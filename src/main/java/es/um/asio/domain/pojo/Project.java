package es.um.asio.domain.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Project implements Pojo {
    /**
     * Project ID
     */
    private Long projectId;
    
    /**
     * project name
     */
    private String name;
    
    /**
     * Finalist project
     */
    private String finalistProject;
    
    /**
     * Limitative
     */
    private String limitative;
}
