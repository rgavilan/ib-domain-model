package es.um.asio.domain;

import es.um.asio.domain.pojo.Pojo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Pojo data.
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class PojoData {
    /**
     * Operation to perform.
     */
    private Operation operation;
    
    /**
     * POJO data.
     */
    private Pojo data;
}
