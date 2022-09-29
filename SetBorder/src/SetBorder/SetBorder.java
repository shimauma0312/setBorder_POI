package SetBorder;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;

public class SetBorder {
    //物件追加の際にセルに枠線を引く
    public static CellStyle setBorder(CellStyle cellStyle, BorderStyle kind) {
        cellStyle.setBorderLeft(kind);
        cellStyle.setBorderRight(kind);
        cellStyle.setBorderTop(kind);
        cellStyle.setBorderBottom(kind);
        return cellStyle;

    }
}

