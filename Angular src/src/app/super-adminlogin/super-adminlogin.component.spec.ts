import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SuperAdminloginComponent } from './super-adminlogin.component';

describe('SuperAdminloginComponent', () => {
  let component: SuperAdminloginComponent;
  let fixture: ComponentFixture<SuperAdminloginComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [SuperAdminloginComponent]
    });
    fixture = TestBed.createComponent(SuperAdminloginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
