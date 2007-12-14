/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
 * 
 *  This program is free software; you can redistribute it and/or modify it 
 *  under the terms of the GNU General Public License as published by the Free 
 *  Software Foundation; either version 2 of the License, or (at your option) 
 *  any later version.
 * 
 *  This program is distributed in the hope that it will be useful, but 
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY 
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License 
 *  for more details.
 */
package megamek.common.weapons;

import megamek.common.TechConstants;

/**
 * @author Sebastian Brocks
 *
 */
public class ISThunderBolt20 extends ThunderBoltWeapon {

    /**
     * 
     */
    public ISThunderBolt20() {
        super(); 
        this.techLevel = TechConstants.T_IS_LEVEL_3;
        this.name = "Thunderbolt 20";
        this.setInternalName(this.name);
        this.addLookupName("IS Thunderbolt-20");
        this.addLookupName("ISThunderbolt20");
        this.addLookupName("ISTBolt20");
        this.addLookupName("IS Thunderbolt 20");
        this.heat = 8;
        this.minimumRange = 5;
        this.shortRange = 6;
        this.mediumRange = 12;
        this.longRange = 18;
        this.extremeRange = 24;
        this.tonnage = 15.0f;
        this.criticals = 5;
        this.bv = 305;
        this.cost = 450000;
    }
}
