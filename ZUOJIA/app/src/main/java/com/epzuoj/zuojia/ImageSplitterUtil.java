package com.epzuoj.zuojia;

import android.graphics.Bitmap;
import java.util.List;
import java.util.ArrayList;
/**
 * Created by wujianxing on 16/8/6.
 */
public class ImageSplitterUtil {

    /**
     *
     * @param bitmap
     * @param piece 切成 piece*piece
     * @return
     */
    public static List<ImagPiece>splitImage(Bitmap bitmap,int piece){
    List<ImagPiece>imagPieces = new ArrayList<ImagPiece>();
        int width =bitmap.getWidth();
        int height = bitmap.getHeight();
        int pieceWidth = Math.max(width,height)/piece;
        for (int i=0; i<piece;i++){
            for (int j=0;j<piece;j++){
                ImagPiece imagPiece = new ImagPiece();
                imagPiece.setIndex(j+i*piece);

                int x = j*pieceWidth;
                int y = i*pieceWidth;
                imagPiece.setBitmap(Bitmap.createBitmap(bitmap,x,y,pieceWidth,pieceWidth));

                imagPieces.add(imagPiece);
            }
        }
    }
}
