package com.example.demo.config;

import com.example.demo.model.OrderDTO;
import com.example.demo.repository.OrderRepository;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import javax.batch.api.chunk.ItemReader;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Autowired
    public OrderRepository orderRepository;

    @Bean
    public ItemReader<OrderDTO> reader(){
        return new FlatFileItemReaderBuilder<OrderDTO>()
                .name("orderItemRead")
                .resource(new ClassPathResource("order.csv"))
                .delimited()
                .names(new String[] { "Order_id", "Name", "Mobile", "Create_date", "Type"})
                .fieldSetMapper(new BeanWrapperFieldSetMapper<OrderDTO>() {{
                    setTargetType(OrderDTO.class);
                }})
                .build()
    }


}
