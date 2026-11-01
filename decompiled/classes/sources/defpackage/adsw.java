package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adsw {
    public final int a;
    public final java.lang.String b;
    public final java.lang.Throwable c;
    public final int d;

    public adsw(int i, int i2, java.lang.String str, java.lang.Throwable th) {
        this.d = i;
        this.a = i2;
        this.b = str;
        this.c = th;
    }

    public static defpackage.adsw a(int i, java.lang.Throwable th) {
        return new defpackage.adsw(i, -1, th.getMessage(), th);
    }
}
