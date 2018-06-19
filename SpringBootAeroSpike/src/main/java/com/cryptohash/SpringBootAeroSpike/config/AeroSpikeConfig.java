package com.cryptohash.SpringBootAeroSpike.config;


import com.aerospike.client.AerospikeClient;
import com.aerospike.client.policy.ClientPolicy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.aerospike.core.AerospikeTemplate;
import org.springframework.data.aerospike.repository.config.EnableAerospikeRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableAerospikeRepositories(basePackages = "com.cryptohash.SpringBootAeroSpike.repository")
public class AeroSpikeConfig {

        @Bean
    public AerospikeTemplate aerospikeTemplate(){
            return new AerospikeTemplate(aerospikeClient(),"test");
        }

    @Bean
    public AerospikeClient aerospikeClient() {
        ClientPolicy clientPolicy = new ClientPolicy();
        clientPolicy.failIfNotConnected=true;
        return new AerospikeClient(clientPolicy,"IP",3000);
    }
}
