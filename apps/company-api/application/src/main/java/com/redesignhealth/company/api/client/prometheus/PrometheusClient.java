package com.acmehealth.company.api.client.prometheus;

import com.acmehealth.company.api.dto.prometheus.PrometheusMetric;

public interface PrometheusClient {
  PrometheusMetric getCounterValues(String counter);
}
