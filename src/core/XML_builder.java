package core;

import java.text.DecimalFormat;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONObject;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;


@Path("/")
public class XML_builder {

    JSONObject json = new JSONObject(); 
    JSONObject json_array = new JSONObject(); 
    DecimalFormat df = new DecimalFormat("####0.00");
    DecimalFormat df_au = new DecimalFormat("####0.000000");
    
    @GET
    @Path("xml/kg=>lb/{input}")
    @Produces("application/xml")
    public Response kg_to_lb(

                  @DefaultValue("1") 
                  @PathParam("input") Double input) throws ParserConfigurationException, TransformerException {//==========================================
                  Double kg = input;
                  Double lb = kg * 2.2046;
    
                  String kg_out = df.format(kg).toString();
                  String lb_out = df.format(lb).toString();

                  DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                  DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

                  // root elements
                  Document doc = docBuilder.newDocument();
                  Element rootElement = doc.createElement("calc");
                  rootElement.setAttribute("conversion", "kg to lb");
                  doc.appendChild(rootElement);

                  // id element
                  Element a = doc.createElement("kg");
                  a.appendChild(doc.createTextNode(kg_out));
                  // a.setAttribute("attr", "value");
                  rootElement.appendChild(a);

                  // name element
                  Element b = doc.createElement("lb");
                  b.appendChild(doc.createTextNode(lb_out));
                  rootElement.appendChild(b);

                  DOMSource source = new DOMSource(doc);
return Response.status(200).entity(source).build();            
          
                 
    																											}//=======================================
    @GET
    @Path("xml/lb=>kg/{input}")
    @Produces("application/xml")
    public Response lb_to_kg(

                  @DefaultValue("1") 
                  @PathParam("input") Double input) throws ParserConfigurationException, TransformerException {//==========================================
        Double lb = input;
        Double kg = lb * 0.453592;
    
                  String kg_out = df.format(kg).toString();
                  String lb_out = df.format(lb).toString();

                  DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                  DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

                  // root elements
                  Document doc = docBuilder.newDocument();
                  Element rootElement = doc.createElement("calc");
                  rootElement.setAttribute("DIMAconversion", "lb to kg");
                  doc.appendChild(rootElement);

                  // id element
                  Element a = doc.createElement("lb");
                  a.appendChild(doc.createTextNode(lb_out));
                  // a.setAttribute("attr", "value");
                  rootElement.appendChild(a);

                  // name element
                  Element b = doc.createElement("kg");
                  b.appendChild(doc.createTextNode(kg_out));
                  rootElement.appendChild(b);

                  DOMSource source = new DOMSource(doc);
return Response.status(200).entity(source).build();            
          
                 
    																											}//=======================================
 
    @GET

    @Path("xml/cm=>in/{input}")
    @Produces("application/xml")
    public Response cm_to_in(

                  @DefaultValue("1") 
                  @PathParam("input") Double input) throws ParserConfigurationException, TransformerException {//==========================================
        Double cm = input;
        Double in = cm / 2.54;
    
                  String cm_out = df.format(cm).toString();
                  String in_out = df.format(in).toString();

                  DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                  DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

                  // root elements
                  Document doc = docBuilder.newDocument();
                  Element rootElement = doc.createElement("calc");
                  rootElement.setAttribute("DimaNakhabtsevConversion", "cm to in");
                  doc.appendChild(rootElement);

                  // id element
                  Element a = doc.createElement("cm");
                  a.appendChild(doc.createTextNode(cm_out));
                  // a.setAttribute("attr", "value");
                  rootElement.appendChild(a);

                  // name element
                  Element b = doc.createElement("in");
                  b.appendChild(doc.createTextNode(in_out));
                  rootElement.appendChild(b);

                  DOMSource source = new DOMSource(doc);
return Response.status(200).entity(source).build();            
          
                 
    																											}//======================================= 
    
    @GET

    @Path("xml/in=>cm/{input}")
    @Produces("application/xml")
    public Response in_to_cm(

                  @DefaultValue("1") 
                  @PathParam("input") Double input) throws ParserConfigurationException, TransformerException {//==========================================
        Double in = input;
        Double cm = in*30.5;
    
                  String cm_out = df.format(cm).toString();
                  String in_out = df.format(in).toString();

                  DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                  DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

                  // root elements
                  Document doc = docBuilder.newDocument();
                  Element rootElement = doc.createElement("calc");
                  rootElement.setAttribute("DimaNakhabtsevConversion4", "in to cm");
                  doc.appendChild(rootElement);

                  // id element
                  Element a = doc.createElement("in");
                  a.appendChild(doc.createTextNode(in_out));
                  // a.setAttribute("attr", "value");
                  rootElement.appendChild(a);

                  // name element
                  Element b = doc.createElement("cm");
                  b.appendChild(doc.createTextNode(cm_out));
                  rootElement.appendChild(b);

                  DOMSource source = new DOMSource(doc);
return Response.status(200).entity(source).build();            
          
                 
    																											}//=======================================      
    @GET

    @Path("xml/mi=>au/{input}")
    @Produces("application/xml")
    public Response mi_to_au(

                  @DefaultValue("1") 
                  @PathParam("input") Double input) throws ParserConfigurationException, TransformerException {//==========================================
        Double mi = input;
        Double au = mi / 92956000;
    
                  String mi_out = df.format(mi).toString();
                  String au_out = df_au.format(au).toString();

                  DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                  DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

                  // root elements
                  Document doc = docBuilder.newDocument();
                  Element rootElement = doc.createElement("calc");
                  rootElement.setAttribute("Conversion", "miles to astronomic units");
                  doc.appendChild(rootElement);

                  // id element
                  Element a = doc.createElement("mi");
                  a.appendChild(doc.createTextNode(mi_out));
                  // a.setAttribute("attr", "value");
                  rootElement.appendChild(a);

                  // name element
                  Element b = doc.createElement("au");
                  b.appendChild(doc.createTextNode(au_out));
                  rootElement.appendChild(b);

                  DOMSource source = new DOMSource(doc);
return Response.status(200).entity(source).build();            
          
                 
    																											}//======================================= 92956000     
}



