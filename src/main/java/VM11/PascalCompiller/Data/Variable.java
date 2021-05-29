package VM11.PascalCompiller.Data;

/*! 
 * \brief Переменная
 *
 *  Данные о переменной
 */
public class Variable {

	public static final String PASCAL_INT_TYPE_NAME   = "integer";
	public static final String PASCAL_UINT_TYPE_NAME  = "longword";
	public static final String PASCAL_FLOAT_TYPE_NAME = "single";
	public static final String PASCAL_CHAR_TYPE_NAME  = "char";
	
	public static final String INT_TYPE_NAME   = "int";   //!< Наименование целого знакового типа в трансляторе
	public static final String UINT_TYPE_NAME  = "uint";  //!< Наименование целого беззнакового типа в трансляторе
	public static final String FLOAT_TYPE_NAME = "float"; //!< Наименование вещественного типа в трансляторе
	public static final String CHAR_TYPE_NAME  = "char";  //!< Наименование символьного типа в трансляторе
	
	/*!
	 * \brief Перечисление доступных типов данных
	 */
	public enum Type {
		VT_NONE,             //!< Неопределённый
		VT_INTEGER,          //!< Целочисленный знаковый
		VT_UNSIGNED_INTEGER, //!< Целочисленный беззнаковый
		VT_FLOAT,            //!< Вещественный
		VT_CHAR,             //!< Символьный
	}

	/*!
	 * \brief Перечисление доступных модификаторов
	 */
	public enum Modifier {
		MOD_NONE,         //!< Без модификатора
		MOD_ARRAY,        //!< Массив
		MOD_CONST,        //!< Константа
		MOD_CONST_ARRAY   //!< Константный массив
	}
	
	/*!
	 * \brief Сопоставление типов данных паскаля с типами данных VM-11
	 */
	public static Type GetTypeByName(String name) {
		switch (name) {
			case PASCAL_INT_TYPE_NAME: return Type.VT_INTEGER;
			case PASCAL_UINT_TYPE_NAME: return Type.VT_UNSIGNED_INTEGER;
			case PASCAL_FLOAT_TYPE_NAME: return Type.VT_FLOAT;
			case PASCAL_CHAR_TYPE_NAME: return Type.VT_CHAR;
			default: return Type.VT_NONE;
		}
	}
	
	/*!
	 * \brief Сопоставление типов данных VM-11 с наименованиями типов данных Pascal
	 */
	public static String GetNameByType(Type type) {
		switch (type) {
			case VT_INTEGER: return PASCAL_INT_TYPE_NAME;
			case VT_UNSIGNED_INTEGER: return PASCAL_UINT_TYPE_NAME;
			case VT_FLOAT: return PASCAL_FLOAT_TYPE_NAME;
			case VT_CHAR: return PASCAL_CHAR_TYPE_NAME;
			default: return "";
		}
	}
	
	private String   Name;         //!< Имя переменной
	private Type     VariableType; //!< Тип данных
	private Modifier Modifier;     //!< Модификатор
	private int      Size;         //!< Размер (количество элементов массива)
	private String   Value;        //!< Значение при загрузке
	
	/*!
	 * \brief Конструктор по умолчанию
	 */
	public Variable() { }
	
	/*!
	 * \brief Конструктор копирования
	 */
	public Variable(Variable other) {
		Name = other.Name;
		VariableType = other.VariableType;
		Modifier = other.Modifier;
		Size = other.Size;
		Value = other.Value;
	}
	
	/*!
	 * \brief Получение имени переменной
	 */
	public void setName(String name) { Name = name; }
	/*!
	 * \brief Изменение имени переменной
	 */
	public String getName() { return Name; }


	/*!
	 * \brief Получение типа переменной
	 */
	public Type getType() { return VariableType; }
	/*!
	 * \brief Изменение типа переменной
	 */
	public void setType(Type type) { VariableType = type; }

	/*!
	 * \brief Получение модификатора переменной
	 */
	public Modifier getModifier() { return Modifier; }
	/*!
	 * \brief Изменение модификатора переменной
	 */
	public void setModifier(Modifier modifier) { Modifier = modifier; }

	/*!
	 * \brief Получение количества элементов (для массива)
	 */
	public int getSize() { return Size; }
	/*!
	 * \brief Изменение количества элементов (для массива)
	 */
	public void setSize(int size) { Size = size; }

	/*!
	 * \brief Получение значения, устанавливаемого при загрузке
	 */
	public String getValue() { return Value; }
	/*!
	 * \brief Изменение значения, устанавливаемого при загрузке
	 */
	public void setValue(String value) { Value = value; }
}
