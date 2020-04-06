# SocatMetadata

Java library representing metadata with an emphasis on ocean data.  The
top-level class is `gov.noaa.pmel.socatmetadata.SocatMetadata`.  The classes
in the `gov.noaa.pmel.socatmetadata.translate` package are used to read XML to
create an SocatMetadata object and write XML from an SocatMetadata object.
The class `gov.noaa.pmel.socatmetadata.app.CdiacToOcadsConverter` can be
used as a command-line application to covert, to the extent possible,
from CDIAC to OCADS metadata XML.

All classes, except for those in the `gov.noaa.pmel.socatmetadata.translate` package,
are JavaBeans implementing Cloneable.  These classes, except for those in
the `gov.noaa.pmel.socatmetadata.translate` and the `gov.noaa.pmel.socatmetadata.util`
packages, also have a (possibly inherited) method `invalidFieldNames()` that
returns a set of names of required fields that are not acceptably assigned.
Which fields should be considered required has not been fully vetted and
so is subject to change.

This repository contains a Maven `pom.xml` configuration file as well
as some IntelliJ IDEA configuration files.

