package com.github.onacit.test;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Jin Kwon &lt;onacit at gmail.com&gt;
 */
@Entity
public class MyEntity implements Serializable {

    private static final long serialVersionUID = 3865142974781330310L;

    // -------------------------------------------------------------------------
    @Id
    public Long id;
}
