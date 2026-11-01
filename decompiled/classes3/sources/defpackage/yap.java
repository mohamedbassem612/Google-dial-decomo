package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class yap implements defpackage.xuw {
    @Override // defpackage.xuw
    public final defpackage.xxe b(android.content.Context context, defpackage.xxe xxeVar, int i, int i2) {
        if (!defpackage.ygc.l(i, i2)) {
            throw new java.lang.IllegalArgumentException(a.bA(i2, i, "Cannot apply transformation on width: ", " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        defpackage.xxm xxmVar = defpackage.xrr.b(context).b;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) xxeVar.c();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        android.graphics.Bitmap bitmapC = c(xxmVar, bitmap, i, i2);
        return !bitmap.equals(bitmapC) ? defpackage.ybv.g(bitmapC, xxmVar) : xxeVar;
    }

    protected abstract android.graphics.Bitmap c(defpackage.xxm xxmVar, android.graphics.Bitmap bitmap, int i, int i2);
}
