package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afzv {
    public static final int[] a = new int[3];
    public static final float[] b = {0.0f, 0.5f, 1.0f};
    public static final int[] c = new int[4];
    public static final float[] d = {0.0f, 0.0f, 0.5f, 1.0f};
    public final android.graphics.Paint e;
    public final android.graphics.Paint f;
    public final android.graphics.Paint g;
    public int h;
    public int i;
    public int j;
    public final android.graphics.Path k = new android.graphics.Path();
    public final android.graphics.Paint l;

    public afzv() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.l = paint;
        this.e = new android.graphics.Paint();
        a(-16777216);
        paint.setColor(0);
        android.graphics.Paint paint2 = new android.graphics.Paint(4);
        this.f = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.g = new android.graphics.Paint(paint2);
    }

    public final void a(int i) {
        int i2 = defpackage.dwm.a;
        int i3 = i & 16777215;
        int i4 = 1140850688 | i3;
        this.h = i4;
        this.i = 335544320 | i3;
        this.j = i3;
        this.e.setColor(i4);
    }
}
