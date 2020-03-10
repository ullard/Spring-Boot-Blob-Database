package com.blob.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blob.domain.DBFile;

@Repository
public interface DBFileRepository extends JpaRepository<DBFile, String>
{

}