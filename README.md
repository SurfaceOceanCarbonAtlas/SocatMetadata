# SDIMetadata
Java library representing metadata with an emphasis on ocean data.  The
top-level class is gov.noaa.pmel.sdimetadata.SDIMetadata.  The classes
in the gov.noaa.pmel.sdimetadata.xml package are used to read XML to
create an SDIMetadata object and write XML from an SDIMetadata object.

All classes, except for those in the gov.noaa.pmel.sdimetadata.xml package,
are JavaBeans implementing Cloneable.  These classes, except for those in
the gov.noaa.pmel.sdimetadata.xml and the gov.noaa.pmel.sdimetadata.util
packages, also have a method `invalidFieldNames()` that returns a set of
names of required fields that are not acceptably assigned.

This repository contains a Maven pom.xml configuration file as well
as some IntelliJ IDEA configuration files.

