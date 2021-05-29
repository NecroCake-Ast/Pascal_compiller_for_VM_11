package VM11.PascalCompiller.Data;

import java.util.ArrayList;

import VM11.PascalCompiller.Data.Variable.Type;

public class ErrorsTable {
	private static final String TYPE_CAST_ERROR_CODE         = "E1"; //!< Код ошибки приведения типов
	private static final String UNKNOWN_VARIABLE_ERROR_CODE  = "E2"; //!< Код ошибки о нахождении необъявленной переменной
	private static final String INVALID_OPERATION_ERROR_CODE = "E3"; //!< Код ошибки о применении недопустимой операции
	
	private static final String CRITICAL_ERROR_CODE = "CRT";
	
	private ArrayList<String> _errors;
	
	/*!
	 * \brief Конструктор по умолчанию
	 */
	public ErrorsTable() {
		_errors = new ArrayList<String>();
	}
	
	/*!
	 * \brief Получение текущего списка ошибок
	 */
	public ArrayList<String> getErrors() {
		return _errors;
	}
	
	/*!
	 * \brief Добавление ошибки в арифметических выражениях
	 */
	public void TypeCastError(int line, Variable.Type discoveredType, Variable.Type expectedType) {
		_errors.add(TYPE_CAST_ERROR_CODE + " (строка " + line + 
				"): Недопустимое преобразование из типа  " + ".");
	}
	
	/*!
	 * \brief Добавление ошибки о нахождении необъявленной переменной
	 */
	public void UnknownVariableError(int line, String varName) {
		_errors.add(UNKNOWN_VARIABLE_ERROR_CODE + " (строка " + line + 
				"): Обнаружена необъявленная переменная " + varName + ".");
	}

	/*!
	 * \brief Добавление критической ошибки
	 */
	public void CriticalError(String text) {
		_errors.add(CRITICAL_ERROR_CODE + ": " + text);
	}

	/*!
	 * \brief Добавление ошибки о применении недопустимой операции
	 */
	public void InvalidOperationError(int line, String operation, Type type) {
		_errors.add(INVALID_OPERATION_ERROR_CODE + " (строка " + line + 
				"): Недопустимая операция " + operation + " для типа "
				+ Variable.GetNameByType(type) + ".");
	}
}
