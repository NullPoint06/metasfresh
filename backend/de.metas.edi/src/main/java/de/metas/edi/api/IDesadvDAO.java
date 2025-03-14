/*
 * #%L
 * de.metas.edi
 * %%
 * Copyright (C) 2020 metas GmbH
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

package de.metas.edi.api;

import com.google.common.collect.ImmutableSet;
import de.metas.bpartner.BPartnerId;
import de.metas.edi.model.I_C_Order;
import de.metas.edi.model.I_C_OrderLine;
import de.metas.edi.model.I_M_InOut;
import de.metas.edi.model.I_M_InOutLine;
import de.metas.esb.edi.model.I_EDI_Desadv;
import de.metas.esb.edi.model.I_EDI_DesadvLine;
import de.metas.esb.edi.model.I_M_InOut_Desadv_V;
import de.metas.handlingunits.model.I_M_ShipmentSchedule;
import de.metas.inout.InOutId;
import de.metas.util.ISingletonService;
import lombok.NonNull;

import javax.annotation.Nullable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

public interface IDesadvDAO extends ISingletonService
{
	/**
	 * Retrieves the desadv record for the given query. If there is none, it returns <code>null</code>.
	 *
	 * @return the desadv for the given <code>de.metas.edi.api.EDIDesadvQuery</code>, or <code>null</code> if none exists.
	 */
	@Nullable
	I_EDI_Desadv retrieveMatchingDesadvOrNull(@NonNull EDIDesadvQuery request);

	I_EDI_Desadv retrieveById(@NonNull EDIDesadvId ediDesadvId);

	I_EDI_DesadvLine retrieveLineById(@NonNull EDIDesadvLineId ediDesadvLineId);

	/**
	 * Retrieves the desadv line that has the given <code>desadv</code> and <code>line</code> number.
	 */
	@Nullable
	I_EDI_DesadvLine retrieveMatchingDesadvLinevOrNull(I_EDI_Desadv desadv, int line, BPartnerId bPartnerId);

	/**
	 * @return all desadv lines (incl inactive ones) that reference the given <code>desadv</code>.
	 */
	List<I_EDI_DesadvLine> retrieveAllDesadvLines(I_EDI_Desadv desadv);

	List<I_EDI_DesadvLine> retrieveLinesByIds(Collection<Integer> desadvLineIds);

	/**
	 * @return all <code>M_InOut</code>s (incl inactive ones) that reference the given <code>desadv</code>.
	 */
	List<I_M_InOut> retrieveAllInOuts(I_EDI_Desadv desadv);

	/**
	 * Determine if there are any inOuts referencing the given desadv, including inactive ones. Use the desadv's ctx and trxName.
	 */
	boolean hasInOuts(I_EDI_Desadv desadv);

	/**
	 * @return all <code>M_InOutLine</code>s (incl inactive ones) that reference the given <code>desadvLine</code>.
	 */
	List<I_M_InOutLine> retrieveAllInOutLines(I_EDI_DesadvLine desadvLine);

	/**
	 * Determine if there are any order lines referencing the given desadvLine, including inactive order lines. Use the desadvLine's ctx and trxName.
	 */
	boolean hasOrderLines(I_EDI_DesadvLine desadvLine);

	/**
	 * @return all <code>C_OrderLine</code>s (incl inactive ones) that reference the given <code>desadvLine</code>.
	 */
	List<I_C_OrderLine> retrieveAllOrderLines(I_EDI_DesadvLine desadvLine);

	/**
	 * Determine if there are any desadv lines referencing the given desadv, including inactive ones. Use the desadv's ctx and trxName.
	 */
	boolean hasDesadvLines(I_EDI_Desadv desadv);

	/**
	 * Determine if there are any inout lines referencing the given desadvLine, including inactive inout lines. Use the desadvLine's ctx and trxName.
	 */
	boolean hasInOutLines(I_EDI_DesadvLine desadvLine);

	/**
	 * Determine if there are any orders referencing the given desadv, including inactive ones. Use the desadv's ctx and trxName.
	 */
	boolean hasOrders(I_EDI_Desadv desadv);

	/**
	 * @return all <code>C_Order</code>'s (incl inactive ones) that reference the given <code>desadv</code>.
	 */
	List<I_C_Order> retrieveAllOrders(I_EDI_Desadv desadv);

	@Nullable
	I_M_ShipmentSchedule retrieveM_ShipmentScheduleOrNull(I_EDI_DesadvLine desadvLine);

	/**
	 * Get the value of the minimum sum percentage from the sysconfig 'de.metas.esb.edi.DefaultMinimumPercentage'
	 */
	@Nullable
	BigDecimal retrieveMinimumSumPercentage();

	void save(@NonNull I_EDI_Desadv ediDesadv);

	void save(@NonNull I_EDI_DesadvLine ediDesadvLine);

	@NonNull
	List<I_M_InOut> retrieveShipmentsWithStatus(@NonNull I_EDI_Desadv desadv, @NonNull ImmutableSet<EDIExportStatus> statusSet);

	@NonNull
	I_M_InOut_Desadv_V getInOutDesadvByInOutId(@NonNull InOutId shipmentId);

	/**
	 * @return the max {@link de.metas.esb.edi.model.I_EDI_Desadv_Pack#COLUMNNAME_SeqNo} value for the given desadvId.
	 */
	int retrieveMaxDesadvPackSeqNo(@NonNull EDIDesadvId desadvId);

	/**
	 * @return the max {@link de.metas.esb.edi.model.I_EDI_Desadv_Pack_Item#COLUMNNAME_Line} value for the given desadvId.
	 */
	int retrieveMaxDesadvPackItemLine(@NonNull EDIDesadvId ediDesadvId);
}
