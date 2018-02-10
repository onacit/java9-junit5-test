package com.github.onacit.test;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jin Kwon &lt;onacit at gmail.com&gt;
 */
@XmlRootElement
public class MyType implements Serializable {

    private static final long serialVersionUID = -1252538613882437521L;

    // -------------------------------------------------------------------------
    @XmlAttribute
    private Long id;
}
