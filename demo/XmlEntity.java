package demo;

import java.io.Serializable;

import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlTransient;

public abstract class XmlEntity implements Serializable {
    private int id = Marshaltest.idGenerator++;

    @XmlTransient
    public int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    @XmlID
    @XmlAttribute(name = "id")
    @Transient
    public String getXmlId() {
        // NOTE: Identifiers must be unique within an XML document so we prepend the id value with the class name.
        return String.format("%s:%d", this.getClass().getSimpleName(), this.id);
    }

    public void setXmlId(String xmlId) {
        int i = xmlId.indexOf(':');
        if (i >= 0) {
            this.id = Integer.parseInt(xmlId.substring(i + 1));
        }
    }
}
