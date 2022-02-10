package com.example.cardriver.mapper;

import com.example.cardriver.dto.CarDto;
import com.example.cardriver.dto.CarDto.CarDtoBuilder;
import com.example.cardriver.entity.CarEntity;
import com.example.cardriver.entity.CarEntity.CarEntityBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-03T11:24:00+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class CarMapperImpl implements CarMapper {

    @Override
    public CarDto toDto(CarEntity carEntity) {
        if ( carEntity == null ) {
            return null;
        }

        CarDtoBuilder carDto = CarDto.builder();

        carDto.model( carEntity.getModel() );
        carDto.number( carEntity.getNumber() );
        carDto.color( carEntity.getColor() );
        carDto.year( carEntity.getYear() );
        carDto.category( carEntity.getCategory() );

        return carDto.build();
    }

    @Override
    public CarEntity toEntity(CarDto carDto) {
        if ( carDto == null ) {
            return null;
        }

        CarEntityBuilder carEntity = CarEntity.builder();

        carEntity.model( carDto.getModel() );
        carEntity.number( carDto.getNumber() );
        carEntity.color( carDto.getColor() );
        carEntity.year( carDto.getYear() );
        carEntity.category( carDto.getCategory() );

        return carEntity.build();
    }

    @Override
    public List<CarDto> toDtoList(List<CarEntity> carEntities) {
        if ( carEntities == null ) {
            return null;
        }

        List<CarDto> list = new ArrayList<CarDto>( carEntities.size() );
        for ( CarEntity carEntity : carEntities ) {
            list.add( toDto( carEntity ) );
        }

        return list;
    }

    @Override
    public CarEntity updateFromDto(CarDto source, CarEntity target) {
        if ( source == null ) {
            return null;
        }

        if ( source.getModel() != null ) {
            target.setModel( source.getModel() );
        }
        if ( source.getNumber() != null ) {
            target.setNumber( source.getNumber() );
        }
        if ( source.getColor() != null ) {
            target.setColor( source.getColor() );
        }
        if ( source.getYear() != null ) {
            target.setYear( source.getYear() );
        }
        if ( source.getCategory() != null ) {
            target.setCategory( source.getCategory() );
        }

        return target;
    }
}
