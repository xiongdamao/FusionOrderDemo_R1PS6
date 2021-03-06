<?xml version="1.0" encoding="UTF-8" ?>
<?oracle-xsl-mapper
  <!-- SPECIFICATION OF MAP SOURCES AND TARGETS, DO NOT MODIFY. -->
  <mapSources>
    <source type="XSD">
      <schema location="../xsd/EDI_X12/4010/850/850_Def/850.xsd"/>
      <rootElement name="Transaction-850" namespace="urn:oracle:integration:b2b:X12/4010/850"/>
    </source>
  </mapSources>
  <mapTargets>
    <target type="XSD">
      <schema location="../xsd/EDI_X12/4010/855/855_Def/855.xsd"/>
      <rootElement name="Transaction-855" namespace="urn:oracle:b2b:X12/V4010/855"/>
    </target>
  </mapTargets>
  <!-- GENERATED BY ORACLE XSL MAPPER 11.1.1.0.0(build 081117.2000.2189) AT [THU NOV 20 08:58:14 PST 2008]. -->
?>
<xsl:stylesheet version="1.0"
                xmlns:xpath20="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.Xpath20"
                xmlns:bpws="http://schemas.xmlsoap.org/ws/2003/03/business-process/"
                xmlns:oraext="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.ExtFunc"
                xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                xmlns:dvm="http://www.oracle.com/XSL/Transform/java/oracle.tip.dvm.LookupValue"
                xmlns:hwf="http://xmlns.oracle.com/bpel/workflow/xpath"
                xmlns:ns0="urn:oracle:integration:b2b:X12/4010/850"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:med="http://schemas.oracle.com/mediator/xpath"
                xmlns:mhdr="http://www.oracle.com/XSL/Transform/java/oracle.tip.mediator.service.common.functions.GetRequestHeaderExtnFunction"
                xmlns:ids="http://xmlns.oracle.com/bpel/services/IdentityService/xpath"
                xmlns:xdk="http://schemas.oracle.com/bpel/extension/xpath/function/xdk"
                xmlns:xref="http://www.oracle.com/XSL/Transform/java/oracle.tip.xref.xpath.XRefXPathFunctions"
                xmlns:xsd="http://www.w3.org/2001/XMLSchema"
                xmlns:ora="http://schemas.oracle.com/xpath/extension"
                xmlns:ns1="urn:oracle:b2b:X12/V4010/855"
                xmlns:ldap="http://schemas.oracle.com/xpath/extension/ldap"
                exclude-result-prefixes="xsi xsl ns0 xsd ns1 xpath20 bpws oraext dvm hwf med mhdr ids xdk xref ora ldap">
  <xsl:template match="/">
    <ns1:Transaction-855>
      <xsl:attribute name="XDataVersion">
        <xsl:value-of select="/ns0:Transaction-850/@XDataVersion"/>
      </xsl:attribute>
      <xsl:attribute name="Standard">
        <xsl:value-of select="/ns0:Transaction-850/@Standard"/>
      </xsl:attribute>
      <xsl:attribute name="Version">
        <xsl:value-of select="/ns0:Transaction-850/@Version"/>
      </xsl:attribute>
      <xsl:attribute name="GUID">
        <xsl:value-of select="/ns0:Transaction-850/@GUID"/>
      </xsl:attribute>
      <ns1:Segment-ST>
        <ns1:Element-143>
          <xsl:value-of select='concat("855","")'/>
        </ns1:Element-143>
        <ns1:Element-329>
          <xsl:value-of select='concat("#ControlNumber#","")'/>
        </ns1:Element-329>
      </ns1:Segment-ST>
      <ns1:Segment-BAK>
        <ns1:Element-353>
          <xsl:value-of select='concat("00","")'/>
        </ns1:Element-353>
        <ns1:Element-587>
          <xsl:value-of select='concat("AC","")'/>
        </ns1:Element-587>
        <ns1:Element-324>
          <xsl:attribute name="EDIDataType">
            <xsl:value-of select="/ns0:Transaction-850/ns0:Segment-BEG/ns0:Element-324/@EDIDataType"/>
          </xsl:attribute>
          <xsl:attribute name="ID">
            <xsl:value-of select="/ns0:Transaction-850/ns0:Segment-BEG/ns0:Element-324/@ID"/>
          </xsl:attribute>
          <xsl:attribute name="Name">
            <xsl:value-of select="/ns0:Transaction-850/ns0:Segment-BEG/ns0:Element-324/@Name"/>
          </xsl:attribute>
          <xsl:attribute name="Type">
            <xsl:value-of select="/ns0:Transaction-850/ns0:Segment-BEG/ns0:Element-324/@Type"/>
          </xsl:attribute>
          <xsl:attribute name="Macro">
            <xsl:value-of select="/ns0:Transaction-850/ns0:Segment-BEG/ns0:Element-324/@Macro"/>
          </xsl:attribute>
          <xsl:attribute name="ApplicationInfo">
            <xsl:value-of select="/ns0:Transaction-850/ns0:Segment-BEG/ns0:Element-324/@ApplicationInfo"/>
          </xsl:attribute>
          <xsl:value-of select="/ns0:Transaction-850/ns0:Segment-BEG/ns0:Element-324"/>
        </ns1:Element-324>
        <ns1:Element-373>
          <xsl:value-of select='concat("20080909","")'/>
        </ns1:Element-373>
        <ns1:Element-367>
          <xsl:value-of select='concat("ContractNumber","")'/>
        </ns1:Element-367>
      </ns1:Segment-BAK>
      <ns1:Loop-CTT>
        <ns1:Segment-CTT>
          <ns1:Element-354>
            <xsl:value-of select='concat("1","")'/>
          </ns1:Element-354>
          <ns1:Element-347>
            <xsl:value-of select='concat("10","")'/>
          </ns1:Element-347>
        </ns1:Segment-CTT>
        <ns1:Segment-AMT>
          <ns1:Element-522>
            <xsl:value-of select='concat("TT","")'/>
          </ns1:Element-522>
          <ns1:Element-782>
            <xsl:attribute name="EDIDataType">
              <xsl:value-of select="/ns0:Transaction-850/ns0:Loop-CTT/ns0:Segment-AMT/ns0:Element-782/@EDIDataType"/>
            </xsl:attribute>
            <xsl:attribute name="ID">
              <xsl:value-of select="/ns0:Transaction-850/ns0:Loop-CTT/ns0:Segment-AMT/ns0:Element-782/@ID"/>
            </xsl:attribute>
            <xsl:attribute name="Name">
              <xsl:value-of select="/ns0:Transaction-850/ns0:Loop-CTT/ns0:Segment-AMT/ns0:Element-782/@Name"/>
            </xsl:attribute>
            <xsl:attribute name="Type">
              <xsl:value-of select="/ns0:Transaction-850/ns0:Loop-CTT/ns0:Segment-AMT/ns0:Element-782/@Type"/>
            </xsl:attribute>
            <xsl:attribute name="Macro">
              <xsl:value-of select="/ns0:Transaction-850/ns0:Loop-CTT/ns0:Segment-AMT/ns0:Element-782/@Macro"/>
            </xsl:attribute>
            <xsl:attribute name="ApplicationInfo">
              <xsl:value-of select="/ns0:Transaction-850/ns0:Loop-CTT/ns0:Segment-AMT/ns0:Element-782/@ApplicationInfo"/>
            </xsl:attribute>
            <xsl:value-of select="/ns0:Transaction-850/ns0:Loop-CTT/ns0:Segment-AMT/ns0:Element-782"/>
          </ns1:Element-782>
        </ns1:Segment-AMT>
      </ns1:Loop-CTT>
      <ns1:Segment-SE>
        <ns1:Element-96>
          <xsl:value-of select='concat("#SegmentCount#","")'/>
        </ns1:Element-96>
        <ns1:Element-329>
          <xsl:value-of select='concat("#ControlNumber#","")'/>
        </ns1:Element-329>
      </ns1:Segment-SE>
    </ns1:Transaction-855>
  </xsl:template>
</xsl:stylesheet>