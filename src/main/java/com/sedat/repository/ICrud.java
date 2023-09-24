package com.sedat.repository;

public interface ICrud <T> {
    boolean save(T t);
}
