package com.stack.sort;

import java.io.Serializable;

/**
 * @author Janwes
 * @version 1.0
 * @package com.stack.sort
 * @date 2021/5/18 20:25
 * @description
 */
public class EmptyStackException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = -8766038608920134747L;

    public EmptyStackException() {
        super();
    }

    public EmptyStackException(String message) {
        super(message);
    }
}
