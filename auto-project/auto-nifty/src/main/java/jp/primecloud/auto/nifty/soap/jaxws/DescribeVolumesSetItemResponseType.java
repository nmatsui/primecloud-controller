
package jp.primecloud.auto.nifty.soap.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * <p>Java class for DescribeVolumesSetItemResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeVolumesSetItemResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="volumeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="snapshotId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="availabilityZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="attachmentSet" type="{https://cp.cloud.nifty.com/api/1.3/}AttachmentSetResponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeVolumesSetItemResponseType", propOrder = {
    "volumeId",
    "size",
    "snapshotId",
    "availabilityZone",
    "status",
    "createTime",
    "attachmentSet"
})
public class DescribeVolumesSetItemResponseType {

    @XmlElement(required = true)
    protected String volumeId;
    @XmlElement(required = true)
    protected String size;
    @XmlElement(required = true)
    protected String snapshotId;
    @XmlElement(required = true)
    protected String availabilityZone;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    @XmlElement(required = true)
    protected AttachmentSetResponseType attachmentSet;

    /**
     * Gets the value of the volumeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeId() {
        return volumeId;
    }

    /**
     * Sets the value of the volumeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeId(String value) {
        this.volumeId = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Gets the value of the snapshotId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * Sets the value of the snapshotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnapshotId(String value) {
        this.snapshotId = value;
    }

    /**
     * Gets the value of the availabilityZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * Sets the value of the availabilityZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailabilityZone(String value) {
        this.availabilityZone = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the attachmentSet property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentSetResponseType }
     *     
     */
    public AttachmentSetResponseType getAttachmentSet() {
        return attachmentSet;
    }

    /**
     * Sets the value of the attachmentSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentSetResponseType }
     *     
     */
    public void setAttachmentSet(AttachmentSetResponseType value) {
        this.attachmentSet = value;
    }

    public DescribeVolumesSetItemResponseType withVolumeId(String value) {
        setVolumeId(value);
        return this;
    }

    public DescribeVolumesSetItemResponseType withSize(String value) {
        setSize(value);
        return this;
    }

    public DescribeVolumesSetItemResponseType withSnapshotId(String value) {
        setSnapshotId(value);
        return this;
    }

    public DescribeVolumesSetItemResponseType withAvailabilityZone(String value) {
        setAvailabilityZone(value);
        return this;
    }

    public DescribeVolumesSetItemResponseType withStatus(String value) {
        setStatus(value);
        return this;
    }

    public DescribeVolumesSetItemResponseType withCreateTime(XMLGregorianCalendar value) {
        setCreateTime(value);
        return this;
    }

    public DescribeVolumesSetItemResponseType withAttachmentSet(AttachmentSetResponseType value) {
        setAttachmentSet(value);
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
