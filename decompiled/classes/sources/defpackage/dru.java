package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dru {
    static final defpackage.dru a;
    static final defpackage.dru b;
    public final boolean c;
    final java.lang.Throwable d;

    static {
        if (defpackage.dsc.a) {
            b = null;
            a = null;
        } else {
            b = new defpackage.dru(false, null);
            a = new defpackage.dru(true, null);
        }
    }

    public dru(boolean z, java.lang.Throwable th) {
        this.c = z;
        this.d = th;
    }
}
