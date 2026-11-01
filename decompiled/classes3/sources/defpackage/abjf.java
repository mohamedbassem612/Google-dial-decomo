package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abjf extends defpackage.yev {
    final /* synthetic */ cdi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abjf(cdi cdiVar) {
        super(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.a = cdiVar;
    }

    @Override // defpackage.yfa
    public final /* synthetic */ void c(java.lang.Object obj, defpackage.yfi yfiVar) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            bitmap = null;
        }
        this.a.b(bitmap);
    }

    @Override // defpackage.yfa
    public final void ei(android.graphics.drawable.Drawable drawable) {
        this.a.b((java.lang.Object) null);
    }
}
