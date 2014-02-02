package com.example.globalcompany.ccauth.test;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 100209.2058.51013)

@WebServiceClient(wsdlLocation="http://130.35.103.126:8888/FODServices-CCAuthorizationService-context-root/CreditAuthorizationPort?wsdl",
  targetNamespace="http://www.globalcompany.example.com/ns/CreditAuthorizationService",
  name="CreditAuthorizationService")
public class CreditAuthorizationService
  extends Service
{
  private static URL wsdlLocationURL;

  public CreditAuthorizationService(URL wsdlLocation, QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }

  @WebEndpoint(name="CreditAuthorizationPort")
  public CreditAuthorizationPort getCreditAuthorizationPort()
  {
    return (CreditAuthorizationPort) super.getPort(new QName("http://www.globalcompany.example.com/ns/CreditAuthorizationService",
                                                             "CreditAuthorizationPort"),
                                                   CreditAuthorizationPort.class);
  }

  @WebEndpoint(name="CreditAuthorizationPort")
  public CreditAuthorizationPort getCreditAuthorizationPort(WebServiceFeature... features)
  {
    return (CreditAuthorizationPort) super.getPort(new QName("http://www.globalcompany.example.com/ns/CreditAuthorizationService",
                                                             "CreditAuthorizationPort"),
                                                   CreditAuthorizationPort.class,
                                                   features);
  }
}
