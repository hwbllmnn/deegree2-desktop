//$HeadURL: svn+ssh://lbuesching@svn.wald.intevation.de/deegree/base/trunk/resources/eclipse/files_template.xml $
/*----------------------------------------------------------------------------
 This file is part of deegree, http://deegree.org/
 Copyright (C) 2001-2012 by:
 - Department of Geography, University of Bonn -
 and
 - lat/lon GmbH -

 This library is free software; you can redistribute it and/or modify it under
 the terms of the GNU Lesser General Public License as published by the Free
 Software Foundation; either version 2.1 of the License, or (at your option)
 any later version.
 This library is distributed in the hope that it will be useful, but WITHOUT
 ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 details.
 You should have received a copy of the GNU Lesser General Public License
 along with this library; if not, write to the Free Software Foundation, Inc.,
 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA

 Contact information:

 lat/lon GmbH
 Aennchenstr. 19, 53177 Bonn
 Germany
 http://lat-lon.de/

 Department of Geography, University of Bonn
 Prof. Dr. Klaus Greve
 Postfach 1147, 53001 Bonn
 Germany
 http://www.geographie.uni-bonn.de/deegree/

 e-mail: info@deegree.org
 ----------------------------------------------------------------------------*/
package org.deegree.igeo.model.filterencoding;

import java.util.List;

import org.deegree.igeo.commands.SelectFeatureCommand;
import org.deegree.igeo.i18n.Messages;
import org.deegree.igeo.views.DialogFactory;
import org.deegree.igeo.views.swing.map.SelectByAttributeDialog;
import org.deegree.kernel.Command;
import org.deegree.model.Identifier;
import org.deegree.model.feature.Feature;
import org.deegree.model.filterencoding.FilterEvaluationException;
import org.deegree.model.filterencoding.Operation;

/**
 * TODO add class documentation here
 * 
 * @author <a href="mailto:goltz@lat-lon.de">Lyn Goltz</a>
 * @author <a href="mailto:stenger@lat-lon.de">Dirk Stenger</a>
 * @author <a href="mailto:erben@lat-lon.de">Alexander Erben</a>
 * @author last edited by: $Author: lyn $
 * 
 * @version $Revision: $, $Date: $
 */
public class FeatureIdOperation implements Operation {

	private String idToCheck;

	public FeatureIdOperation(String id) {
		if (id.equals(null)) {
			idToCheck = "";
		} else {
			this.idToCheck = id;
		}
		;
	}

	@Override
	public String getOperatorName() {
		// TODO Auto-generated method stub
		return "FeatureIdOperation";
	}

	@Override
	public int getOperatorId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean evaluate(Feature feature) throws FilterEvaluationException {
		return idToCheck.equals(feature.getId());
	}

	@Override
	public StringBuffer to100XML() {
		throw new UnsupportedOperationException(
				"FeatureIdOperation is not implemented!");
	}

	@Override
	public StringBuffer to110XML() {
		throw new UnsupportedOperationException(
				"FeatureIdOperation is not implemented!");
	}

}