package com.acmehealth.company.api.client.prometheus;

import com.acmehealth.company.api.dto.prometheus.PrometheusMetric;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoopPrometheusClient implements PrometheusClient {
  private static final Logger logger = LoggerFactory.getLogger(NoopPrometheusClient.class);

  @Override
  public PrometheusMetric getCounterValues(String counter) {
    logger.info("Mock call to getCounterValues");
    return null;
  }
}
