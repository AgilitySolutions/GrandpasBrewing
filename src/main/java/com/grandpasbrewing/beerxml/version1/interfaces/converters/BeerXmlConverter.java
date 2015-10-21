package com.grandpasbrewing.beerxml.version1.interfaces.converters;

import com.grandpasbrewing.objectmodel.ObjectModelBase;
import com.grandpasbrewing.beerxml.version1.objects.BeerXmlObjectBase;

public interface BeerXmlConverter<TBeerXml extends BeerXmlObjectBase, TObjectModel extends ObjectModelBase> {
    TObjectModel toObjectModel(TBeerXml beerXmlObject);
    TBeerXml fromObjectModel(TObjectModel objectModelObject);
}
