/*
 * #%L
 * de.metas.cucumber
 * %%
 * Copyright (C) 2022 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

package de.metas.cucumber.stepdefs.pporder;

import de.metas.cucumber.stepdefs.StepDefData;
import de.metas.cucumber.stepdefs.StepDefDataGetIdAware;
import org.eevolution.api.PPOrderBOMLineId;
import org.eevolution.model.I_PP_Order_BOMLine;

public class PP_Order_BOMLine_StepDefData extends StepDefData<I_PP_Order_BOMLine>
		implements StepDefDataGetIdAware<PPOrderBOMLineId, I_PP_Order_BOMLine>
{
	public PP_Order_BOMLine_StepDefData()
	{
		super(I_PP_Order_BOMLine.class);
	}

	@Override
	public PPOrderBOMLineId extractIdFromRecord(final I_PP_Order_BOMLine record)
	{
		return PPOrderBOMLineId.ofRepoId(record.getPP_Order_BOMLine_ID());
	}
}
