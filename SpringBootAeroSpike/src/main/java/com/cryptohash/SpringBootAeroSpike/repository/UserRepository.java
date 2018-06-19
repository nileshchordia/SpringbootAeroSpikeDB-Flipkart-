package com.cryptohash.SpringBootAeroSpike.repository;

import com.cryptohash.SpringBootAeroSpike.model.User;
import org.springframework.data.aerospike.repository.AerospikeRepository;

public interface UserRepository extends AerospikeRepository<User,Integer> {

}
