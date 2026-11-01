package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ycz extends defpackage.yev {
    final int a;
    public android.graphics.Bitmap b;
    private final android.os.Handler c;
    private final long d;

    public ycz(android.os.Handler handler, int i, long j) {
        super(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.c = handler;
        this.a = i;
        this.d = j;
    }

    @Override // defpackage.yfa
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, defpackage.yfi yfiVar) {
        this.b = (android.graphics.Bitmap) obj;
        android.os.Handler handler = this.c;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.d);
    }

    @Override // defpackage.yfa
    public final void ei(android.graphics.drawable.Drawable drawable) {
        this.b = null;
    }
}
