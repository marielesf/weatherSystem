import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CoordenatesSearchComponent } from './coordenates-search.component';

describe('CoordenatesSearchComponent', () => {
  let component: CoordenatesSearchComponent;
  let fixture: ComponentFixture<CoordenatesSearchComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CoordenatesSearchComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CoordenatesSearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
