package es.um.asio.domain;

import es.um.asio.abstractions.domain.Operation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PojoLinkData {
	/**
     * Operation to perform.
     */
    private Operation operation;
    
    /**
     * POJO data.
     */
    private Object data;

}
