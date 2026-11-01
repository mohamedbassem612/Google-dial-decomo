package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class dwj {
    public abstract void a(int i);

    public abstract void b(android.graphics.Typeface typeface);

    public final void c(int i) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new defpackage.kjo(this, i, 1));
    }

    public final void d(android.graphics.Typeface typeface) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new defpackage.an(this, typeface, 6));
    }
}
