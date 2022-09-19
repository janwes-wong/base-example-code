package com.stack.sort;

import java.io.Serializable;

/**
 * @author Janwes
 * @version 1.0
 * @package com.stack.sort
 * @date 2021/5/18 20:19
 * @description
 */
public class StackException extends RuntimeException implements Serializable {

    public StackException(String message) {
        super(message);
    }
}
