package ru.dinis.library.controllers;

import java.io.Serializable;
/**
 * class LetterController gets letter list.
 * User: Dinis Saetgareev (dinis0086@gmail.com)
 * Date: 26.11.17
 */
public class LetterController implements Serializable {
    /**
     * gets letter list.
     * @return - letter list
     */
    public Character[] getRussianLetters() {
        Character[] letters = new Character[33];
        letters[0] = 'А';
        letters[1] = 'Б';
        letters[2] = 'В';
        letters[3] = 'Г';
        letters[4] = 'Д';
        letters[5] = 'Е';
        letters[6] = 'Ё';
        letters[7] = 'Ж';
        letters[8] = 'З';
        letters[9] = 'И';
        letters[10] = 'Й';
        letters[11] = 'К';
        letters[12] = 'Л';
        letters[13] = 'М';
        letters[14] = 'Н';
        letters[15] = 'О';
        letters[16] = 'П';
        letters[17] = 'Р';
        letters[18] = 'С';
        letters[19] = 'Т';
        letters[20] = 'У';
        letters[21] = 'Ф';
        letters[22] = 'Х';
        letters[23] = 'Ц';
        letters[24] = 'Ч';
        letters[25] = 'Ш';
        letters[26] = 'Щ';
        letters[27] = 'Ь';
        letters[28] = 'Ы';
        letters[29] = 'Ъ';
        letters[30] = 'Э';
        letters[31] = 'Ю';
        letters[32] = 'Я';
        return letters;
    }

}
