/*
 * Copyright 2017-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.gcp.autoconfigure.logging.extractors;

/**
 * Extracts trace IDs from HTTP requests using the x-cloud-trace-context header.
 *
 * @author Chengyuan Zhao
 *
 * @deprecated use
 * {@link org.springframework.cloud.gcp.logging.extractors.XCloudTraceIdExtractor}
 */
@Deprecated
public class XCloudTraceIdExtractor extends org.springframework.cloud.gcp.logging.extractors.XCloudTraceIdExtractor {

}
