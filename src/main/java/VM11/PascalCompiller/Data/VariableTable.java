package VM11.PascalCompiller.Data;

import java.util.ArrayList;

/*!
 * \brief Таблица переменных
 */
public class VariableTable {
	ArrayList<Variable> _data; //!< Переменные, внесённые в таблицу

	/*!
	 * \brief Конструктор по умолчанию
	 */
	public VariableTable() {
		_data = new ArrayList<Variable>();
	}
	
	/*!
	 * \brief Добавление новой переменной в таблицу.
	 * 
	 * Возвращает false, если переменную не удалось добавить
	 * (переменная с таким именем уже добавлена)
	 */
	public boolean Add(Variable var) {
		if (Find(var.getName()) != null)
			return false;
		_data.add(new Variable(var));
		return true;
	}
	
	/*!
	 * \brief Удаление переменной из таблицы
	 */
	public void Remove(String name) {
		int idx = 0;
		while (_data.get(idx).getName() != name)
			idx++;
		if (idx != _data.size())
			_data.remove(idx);
	}

	/*!
	 * \brief Поиск переменной по имени
	 */
	public Variable Find(String name) {
		for (Variable curVar : _data)
			if (curVar.getName().compareTo(name) == 0)
				return new Variable(curVar);
		return null;
	}

	/*!
	 * \brief Получение массива внесённых переменных
	 */
	public ArrayList<Variable> getArrayList()
	{
		return _data;
	}

	/*!
	 * \brief Очистка таблицы переменных
	 */
	public void clear() {
		_data.clear();
	}
}
