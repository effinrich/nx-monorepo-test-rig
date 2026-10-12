package com.acmehealth.company.api.task;

import com.acmehealth.company.api.entity.ref.VendorRef;
import com.acmehealth.company.api.entity.vendor.Vendor;
import com.acmehealth.company.api.repository.TaskRepository;
import com.acmehealth.company.api.repository.VendorRepository;
import com.acmehealth.company.api.service.helper.RefGenerator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UpdateApiIdInVendorTask extends TaskDefinition implements CommandLineRunner {
  private final VendorRepository vendorRepository;

  public UpdateApiIdInVendorTask(TaskRepository taskRepository, VendorRepository vendorRepository) {
    super(taskRepository);
    this.vendorRepository = vendorRepository;
  }

  @Override
  public void run(String... args) {
    runTask(shouldRunTask());
  }

  @Override
  public void runTaskInternal() {
    var vendors = vendorRepository.findByApiIdIsNull();
    for (Vendor vendor : vendors) {
      vendor.setApiId(RefGenerator.of(vendorRepository, VendorRef.class));
      vendorRepository.save(vendor);
    }
  }
}
