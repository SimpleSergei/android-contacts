package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<A> {
    boolean  theSameAs (A type);
    boolean equals (Object o);
}
