package com.example.ym.link;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import java.util.List;

public class GameView extends View {

    private Piece selectedPiece;
    private Bitmap selectImage;

    //设置连连看的界面属性
    private int piece_width= 180;
    private int  piece_height =180;
    private int begin_imageX=80;
    private int begin_imageY=90;
    private int numberX=5;
    private int numberY=8;
    public static int p=0;
    private Context context_game;
    Piece[][] pieces = new Piece[10][10] ;//图片放到这个里面

    public Piece[][] getPieces(){
        return this.pieces;
    }
    public void setContext_game(Context context) {
        this.context_game = context;
    }

    public GameView(Context context,AttributeSet attrs) {
        super(context,attrs);
    }

    protected  void onDraw(Canvas canvas){
        super.onDraw(canvas);

        //这里来获取图片ImageView
        List<PieceImage> playImages = ImageUtil.getPlayImages(context_game,40);



        for(int i=0; i<numberY;i++){
            for(int j=0; j<numberX;j++ ){
                Piece piece =new Piece(i,j);
                piece.setImage(playImages.get(p));
                p++;
                piece.setBeginX(j*piece_width+begin_imageX);
                piece.setBeginY(i*piece_height+begin_imageY);
                canvas.drawBitmap(piece.getImage().getImage(),piece.getBeginX(),piece.getBeginY(),null);
                this.pieces[i][j]= piece;
            }
        }
    }
}
