package org.fudan.cs.dsm;

import ifc2x3javatoolbox.ifc2x3tc1.*;
import ifc2x3javatoolbox.ifcmodel.IfcModel;

import java.io.File;
import java.util.Collection;

/**
 * Created by 80494 on 2016/12/9.
 */
public class ifcRelationFind {
    public static void main(String arg[]){
        try{
            IfcModel ifcModel = new IfcModel();
            //File stepFile = new File("src\\main\\resources\\ifcfiles\\AC90R1-Jasmin-Sun-105-2x3.ifc");
            File stepFile = new File("src\\main\\resources\\ifcfiles\\rac_basic_sample_project.ifc");
            //File stepFile = new File("src\\main\\resources\\ifcfiles\\竣工 北线 第一施工段2015 第二版.ifc");
            ifcModel.readStepFile(stepFile);
            //Collection<IfcRelConnectsPathElements> ifcRelConnectsPathElements = ifcModel.getCollection(IfcRelConnectsPathElements.class);
            //System.out.println(ifcRelConnectsPathElements);
            Collection<IfcRelConnectsElements> ifcRelConnectsElements = ifcModel.getCollection(IfcRelConnectsElements.class);
            for(IfcRelConnectsElements i : ifcRelConnectsElements) {
                System.out.println(i.toString()+" "+i.getStepLineNumber());
                System.out.println("RelatedElement:"+i.getRelatedElement());
                System.out.println("RelatingElement:"+i.getRelatingElement());
            }
            Collection<IfcRelConnectsPorts> ifcRelConnectsPorts = ifcModel.getCollection(IfcRelConnectsPorts.class);
            Collection<IfcRelConnectsPortToElement>  ifcRelConnectsPortToElement = ifcModel.getCollection(IfcRelConnectsPortToElement.class);
            Collection<IfcRelConnectsStructuralActivity> ifcRelConnectsStructuralActivity = ifcModel.getCollection(IfcRelConnectsStructuralActivity.class);
            Collection<IfcRelConnectsStructuralElement> ifcRelConnectsStructuralElement = ifcModel.getCollection(IfcRelConnectsStructuralElement.class);
            Collection<IfcRelConnectsStructuralMember> ifcRelConnectsStructuralMembersfcRelConnectsStructuralMember = ifcModel.getCollection(IfcRelConnectsStructuralMember.class);
            Collection<IfcRelContainedInSpatialStructure> ifcRelContainedInSpatialStructure = ifcModel.getCollection(IfcRelContainedInSpatialStructure.class);
            Collection<IfcRelCoversBldgElements> ifcRelCoversBldgElements = ifcModel.getCollection(IfcRelCoversBldgElements.class);
            Collection<IfcRelCoversSpaces> ifcRelCoversSpaces = ifcModel.getCollection(IfcRelCoversSpaces.class);
            Collection<IfcRelFillsElement> ifcRelFillsElement = ifcModel.getCollection(IfcRelFillsElement.class);
            Collection<IfcRelFlowControlElements>  ifcRelFlowControlElements = ifcModel.getCollection(IfcRelFlowControlElements.class);
            Collection<IfcRelInteractionRequirements> ifcRelInteractionRequirements = ifcModel.getCollection(IfcRelInteractionRequirements.class);
            Collection<IfcRelProjectsElement> ifcRelProjectsElement = ifcModel.getCollection(IfcRelProjectsElement.class);
            Collection<IfcRelReferencedInSpatialStructure> ifcRelReferencedInSpatialStructure = ifcModel.getCollection(IfcRelReferencedInSpatialStructure.class);
            Collection<IfcRelSequence>  ifcRelSequence = ifcModel.getCollection(IfcRelSequence.class);
            Collection<IfcRelServicesBuildings> ifcRelServicesBuildings = ifcModel.getCollection(IfcRelServicesBuildings.class);
            Collection<IfcRelSpaceBoundary> ifcRelSpaceBoundary = ifcModel.getCollection(IfcRelSpaceBoundary.class);
            Collection<IfcRelVoidsElement> ifcRelVoidsElement = ifcModel.getCollection(IfcRelVoidsElement.class);
            Collection<IfcRelAggregates> ifcRelAggregates = ifcModel.getCollection(IfcRelAggregates.class);
            Collection<IfcRelNests> ifcRelNests = ifcModel.getCollection(IfcRelNests.class);


            System.out.println(ifcRelCoversSpaces);

            //Collection<IfcRelationship> IfcRelationship = ifcModel.getCollection(IfcRelationship.class);
            //int p=0;
            //for(IfcRelationship i : IfcRelationship){
                //System.out.println(i.getStepLine());
                //System.out.println(i.getDescription());
                //System.out.println(i.getStepParameter(false));
             //   int k = i.getStepLineNumber();
               // String q = i.getClass().getName();
                //System.out.println(k + "\t" + q);
             //   p++;
                //System.out.println(i.getStepLineNumber());
                //System.out.println(i.getName());
                //System.out.println(i.toString());
                //System.out.println(ifcModel.getIfcObjectByEntityInstanceName(k));
           //}
            ///System.out.println(p);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
