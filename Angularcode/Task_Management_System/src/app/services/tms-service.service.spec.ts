import { TestBed } from '@angular/core/testing';

import { TmsServiceService } from './tms-service.service';

describe('LoginServiceService', () => {
  let service: TmsServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TmsServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
