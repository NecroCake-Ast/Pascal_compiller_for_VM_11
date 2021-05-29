package VM11.PascalCompiller.Data;

/*!
 * \brief Данные о количестве дополнительных переменных
 */
public class AdditionVariableCount {
	private int _intCnt;  //!< Количество дополнительных целочисленных переменных
	private int _realCnt; //!< Количество дополнительных вещественных переменных
	
	public AdditionVariableCount(int intCnt, int realCnt) {
		_intCnt = intCnt;
		_realCnt = realCnt;
	}
	
	/*!
	 * \brief Возвращает количество дополнительных целочисленных переменных
	 */
	public int getIntCnt() {
		return _intCnt;
	}

	/*!
	 * \brief Возвращает количество дополнительных вещественных переменных
	 */
	public int getRealCnt() {
		return _realCnt;
	}

}
