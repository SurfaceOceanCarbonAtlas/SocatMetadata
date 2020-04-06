# SDIMetadata

Java library representing metadata with an emphasis on ocean data.  The
top-level class is `gov.noaa.pmel.socatmetadata.SocatMetadata`.  The classes
in the `gov.noaa.pmel.socatmetadata.translate` package are used to read XML to
create an SDIMetadata object and write XML from an SDIMetadata object.
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

#### Legal Disclaimer
*This repository is a software product and is not official communication
of the National Oceanic and Atmospheric Administration (NOAA), or the
United States Department of Commerce (DOC). All NOAA GitHub project
code is provided on an 'as is' basis and the user assumes responsibility
for its use. Any claims against the DOC or DOC bureaus stemming from
the use of this GitHub project will be governed by all applicable Federal
law. Any reference to specific commercial products, processes, or services
by service mark, trademark, manufacturer, or otherwise, does not constitute
or imply their endorsement, recommendation, or favoring by the DOC.
The DOC seal and logo, or the seal and logo of a DOC bureau, shall not
be used in any manner to imply endorsement of any commercial product
or activity by the DOC or the United States Government.*

