/**
 *  Surabaya - a replacement http server for the OpenSimulator
 *  Copyright (C) 2012 Akira Sonoda
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package org.openjgrid.datatypes.llsd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Akira Sonoda
 *
 */
@LLSDMapping(mapTo="struct", mappedName = "")
public class LLSDFetchInventory {

	private static final Logger log = LoggerFactory.getLogger(LLSDFetchInventoryDescendents.class);

	@LLSDMapping(mapTo="uuid", mappedName="agent_id")
    public UUID agent_id;
	@LLSDMapping(mapTo="array", mappedName="items")
    public ArrayList<Object> items = new ArrayList<Object>();

    public LLSDFetchInventory() { }
    
    /**
	 * @param inventoryHashMap
	 */
	public LLSDFetchInventory( HashMap<String, Object> inventoryHashMap) {
		fromLLSDMap(inventoryHashMap);	
	}

	private void fromLLSDMap(HashMap<String, Object> map) {
		try {
			
			// TODO Implement LLSDFetchInventory::fromLLSDMap
			
		} catch (Exception ex) {
			log.error("Exception during conversion from LLSDMap: {}", ex.getMessage());
		}
    }

}
