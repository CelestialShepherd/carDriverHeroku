package com.example.cardriver.mapper;

import com.example.cardriver.dto.DriverDto;
import com.example.cardriver.dto.DriverDto.DriverDtoBuilder;
import com.example.cardriver.entity.DriverEntity;
import com.example.cardriver.entity.DriverEntity.DriverEntityBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-03T11:23:59+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class DriverMapperImpl implements DriverMapper {

    @Override
    public DriverDto toDto(DriverEntity driverEntity) {
        if ( driverEntity == null ) {
            return null;
        }

        DriverDtoBuilder driverDto = DriverDto.builder();

        driverDto.firstName( driverEntity.getFirstName() );
        driverDto.lastName( driverEntity.getLastName() );
        driverDto.licenseNumber( driverEntity.getLicenseNumber() );
        driverDto.drivingExp( driverEntity.getDrivingExp() );
        driverDto.category( driverEntity.getCategory() );

        return driverDto.build();
    }

    @Override
    public DriverEntity toEntity(DriverDto driverDto) {
        if ( driverDto == null ) {
            return null;
        }

        DriverEntityBuilder driverEntity = DriverEntity.builder();

        driverEntity.firstName( driverDto.getFirstName() );
        driverEntity.lastName( driverDto.getLastName() );
        driverEntity.licenseNumber( driverDto.getLicenseNumber() );
        driverEntity.drivingExp( driverDto.getDrivingExp() );
        driverEntity.category( driverDto.getCategory() );

        return driverEntity.build();
    }

    @Override
    public List<DriverDto> toDtoList(List<DriverEntity> driverEntities) {
        if ( driverEntities == null ) {
            return null;
        }

        List<DriverDto> list = new ArrayList<DriverDto>( driverEntities.size() );
        for ( DriverEntity driverEntity : driverEntities ) {
            list.add( toDto( driverEntity ) );
        }

        return list;
    }

    @Override
    public DriverEntity updateFromDto(DriverDto source, DriverEntity target) {
        if ( source == null ) {
            return null;
        }

        if ( source.getFirstName() != null ) {
            target.setFirstName( source.getFirstName() );
        }
        if ( source.getLastName() != null ) {
            target.setLastName( source.getLastName() );
        }
        if ( source.getLicenseNumber() != null ) {
            target.setLicenseNumber( source.getLicenseNumber() );
        }
        if ( source.getDrivingExp() != null ) {
            target.setDrivingExp( source.getDrivingExp() );
        }
        if ( source.getCategory() != null ) {
            target.setCategory( source.getCategory() );
        }

        return target;
    }
}
