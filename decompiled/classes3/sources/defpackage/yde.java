package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yde implements defpackage.ydf {
    private final defpackage.xxm a;
    private final defpackage.ydf b;
    private final defpackage.ydf c;

    public yde(defpackage.xxm xxmVar, defpackage.ydf ydfVar, defpackage.ydf ydfVar2) {
        this.a = xxmVar;
        this.b = ydfVar;
        this.c = ydfVar2;
    }

    @Override // defpackage.ydf
    public final defpackage.xxe a(defpackage.xxe xxeVar, defpackage.xus xusVar) {
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) xxeVar.c();
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            return this.b.a(defpackage.ybv.g(((android.graphics.drawable.BitmapDrawable) drawable).getBitmap(), this.a), xusVar);
        }
        if (drawable instanceof defpackage.ycv) {
            return this.c.a(xxeVar, xusVar);
        }
        return null;
    }
}
