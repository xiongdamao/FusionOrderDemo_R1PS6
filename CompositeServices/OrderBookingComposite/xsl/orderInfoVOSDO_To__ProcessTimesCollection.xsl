<?xml version="1.0" encoding="UTF-8" ?>
<?oracle-xsl-mapper
  <!-- SPECIFICATION OF MAP SOURCES AND TARGETS, DO NOT MODIFY. -->
  <mapSources>
    <source type="WSDL">
      <schema location="../FulfillOrder.wsdl"/>
      <rootElement name="orderInfoVOSDO" namespace="/oracle/fodemo/storefront/store/queries/common/"/>
    </source>
  </mapSources>
  <mapTargets>
    <target type="WSDL">
      <schema location="../BAM_ProcessTimeDO.wsdl"/>
      <rootElement name="_ProcessTimesCollection" namespace="http://xmlns.oracle.com/bam"/>
    </target>
  </mapTargets>
  <!-- GENERATED BY ORACLE XSL MAPPER 11.1.1.0.0(build 081211.0200.2279) AT [FRI DEC 12 10:11:11 PST 2008]. -->
?>
<xsl:stylesheet version="1.0"
                xmlns:bpws="http://schemas.xmlsoap.org/ws/2003/03/business-process/"
                xmlns:xpath20="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.Xpath20"
                xmlns:imp1="http://xmlns.oracle.com/bam"
                xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                xmlns:ns5="http://xmlns.oracle.com/pcbpel/adapter/bam/WebLogicFusionOrderDemo/OrderBookingComposite/BAM_ProcessTimeDO/"
                xmlns:plt="http://schemas.xmlsoap.org/ws/2003/05/partner-link/"
                xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/"
                xmlns:ora="http://schemas.oracle.com/xpath/extension"
                xmlns:socket="http://www.oracle.com/XSL/Transform/java/oracle.tip.adapter.socket.ProtocolTranslator"
                xmlns:ns3="http://xmlns.oracle.com/adf/svc/errors/"
                xmlns:oraext="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.ExtFunc"
                xmlns:tns="http://xmlns.oracle.com/WebLogicFusionOrderDemo/OrderBookingComposite/FulfillOrder"
                xmlns:ns1="commonj.sdo/xml"
                xmlns:dvm="http://www.oracle.com/XSL/Transform/java/oracle.tip.dvm.LookupValue"
                xmlns:ns2="http://xmlns.oracle.com/adf/svc/types/"
                xmlns:hwf="http://xmlns.oracle.com/bpel/workflow/xpath"
                xmlns:mhdr="http://www.oracle.com/XSL/Transform/java/oracle.tip.mediator.service.common.functions.GetRequestHeaderExtnFunction"
                xmlns:med="http://schemas.oracle.com/mediator/xpath"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:ns4="commonj.sdo/java"
                xmlns:inp1="/oracle/fodemo/storefront/store/queries/common/"
                xmlns:ids="http://xmlns.oracle.com/bpel/services/IdentityService/xpath"
                xmlns:xdk="http://schemas.oracle.com/bpel/extension/xpath/function/xdk"
                xmlns:xref="http://www.oracle.com/XSL/Transform/java/oracle.tip.xref.xpath.XRefXPathFunctions"
                xmlns:ns0="commonj.sdo"
                xmlns:xsd="http://www.w3.org/2001/XMLSchema"
                xmlns:ldap="http://schemas.oracle.com/xpath/extension/ldap"
                exclude-result-prefixes="xsi xsl wsdl ns3 tns ns1 ns2 ns4 inp1 ns0 xsd imp1 ns5 plt bpws xpath20 ora socket oraext dvm hwf mhdr med ids xdk xref ldap">
  <xsl:template match="/">
    <imp1:_ProcessTimesCollection>
      <imp1:_ProcessTimes>
        <imp1:_InstanceID>
          <xsl:value-of select='substring-after(mhdr:getProperty("in.property.tracking.parentComponentInstanceId"),":")'/>
        </imp1:_InstanceID>
        <imp1:_FulfillmentComplete>
          <xsl:value-of select="xpath20:current-dateTime()"/>
        </imp1:_FulfillmentComplete>
      </imp1:_ProcessTimes>
    </imp1:_ProcessTimesCollection>
  </xsl:template>
</xsl:stylesheet>
