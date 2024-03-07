package com.example.bookreviewbackend.Util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ListMapper<T, E> {

    private final ModelMapper modelMapper;

    public ListMapper(ModelMapper modelMapper){
        this.modelMapper = modelMapper;
    }

    public List<?> MapList( T convertTo , List<E> list){
        return list.stream()
                .map(e -> modelMapper.map(e, convertTo.getClass()))
                .collect(Collectors.toList());
    }
}
