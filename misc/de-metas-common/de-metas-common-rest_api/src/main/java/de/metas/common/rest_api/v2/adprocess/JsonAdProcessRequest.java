/*
 * #%L
 * de-metas-common-rest_api
 * %%
 * Copyright (C) 2021 metas GmbH
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

package de.metas.common.rest_api.v2.adprocess;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;
import de.metas.common.rest_api.v2.JsonAttributeSetInstance;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.NonNull;
import lombok.Singular;
import lombok.Value;

import javax.annotation.Nullable;
import java.time.Instant;
import java.util.List;

import static de.metas.common.rest_api.v2.SwaggerDocConstants.PRODUCT_IDENTIFIER_DOC;
import static de.metas.common.util.CoalesceUtil.coalesce;
import static de.metas.common.util.CoalesceUtil.coalesceNotNull;

@Value
@Schema(description = "A list of parameters for the AD_Process to be invoked.")
public class JsonAdProcessRequest
{
	@Schema
	List<JsonAdProcessRequestParam> processParameters;

	@Builder
	@JsonCreator
	public JsonAdProcessRequest(
			@JsonProperty("processParameters") @Singular final List<JsonAdProcessRequestParam> processParameters)
	{
		this.processParameters = coalesceNotNull(processParameters, ImmutableList.of());
	}
}
