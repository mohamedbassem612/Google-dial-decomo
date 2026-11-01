package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahor {
    private static final defpackage.ahor a = new defpackage.ahor(3, null, true);
    private static final defpackage.ahor b = new defpackage.ahor(2, null, true);
    private final java.lang.Object c;
    private boolean d;
    private final int e;

    public ahor(int i, java.lang.Object obj, boolean z) {
        this.e = i;
        this.c = obj;
        this.d = z;
    }

    public static defpackage.ahor d(int i) {
        return i + (-1) != 1 ? a : b;
    }

    public final java.lang.Object a() {
        if (this.d && this.e == 1) {
            return this.c;
        }
        throw new java.lang.IllegalStateException("Calling get() without checking if the extra is present is an error");
    }

    public final boolean b() {
        this.d = true;
        return this.e == 1;
    }

    public final int c() {
        this.d = true;
        return this.e;
    }
}
