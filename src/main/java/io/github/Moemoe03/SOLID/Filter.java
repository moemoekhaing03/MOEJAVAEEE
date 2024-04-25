package io.github.Moemoe03.SOLID;

import java.util.List;

public interface Filter<T> {

	void filter(List<T> items, Condition<T> item);
}