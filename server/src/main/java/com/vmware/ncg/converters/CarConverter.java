package com.vmware.ncg.converters;

import com.vmware.ncg.dtos.CarDto;
import com.vmware.ncg.entities.Car;

public class CarConverter {

    public static Car dtoToEntity(CarDto dto) {
        Car entity = new Car();
        entity.setCarId(dto.getId());
        entity.setMake(dto.getMake());
        entity.setModel(dto.getModel());
        entity.setAvailable(dto.isAvailable() == null ?
                true : dto.isAvailable());
        entity.setBhp(dto.getBhp());
        return entity;
    }

    public static CarDto entityToDto(Car entity) {
        CarDto dto = new CarDto(
                entity.getCarId(),
                entity.getMake(),
                entity.getModel(),
                entity.getBhp());
        dto.setAvailable(entity.getAvailable());
        return dto;
    }
}
