package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apnf {
    private static defpackage.apnf c;
    public int a;
    public final java.lang.Object b;

    public apnf(byte[] bArr) {
        this.b = java.util.Collections.EMPTY_LIST;
        this.a = 0;
    }

    public static synchronized defpackage.apnf j() {
        defpackage.apnf apnfVar;
        apnfVar = c;
        if (apnfVar == null) {
            apnfVar = new defpackage.apnf(null);
            c = apnfVar;
        }
        return apnfVar;
    }

    public final int a(int i) {
        return ((int[]) this.b)[i];
    }

    public final int b() {
        if ((this.a & 2) != 0) {
            return ((int[]) this.b)[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.a & 16) != 0) {
            return ((int[]) this.b)[4];
        }
        return 65535;
    }

    public final int d() {
        if ((this.a & 8) != 0) {
            return ((int[]) this.b)[3];
        }
        return Integer.MAX_VALUE;
    }

    public final void e(defpackage.apnf apnfVar) {
        if (apnfVar == null) {
            defpackage.aooh.i("other");
        }
        for (int i = 0; i < 10; i++) {
            if (apnfVar.f(i)) {
                g(i, apnfVar.a(i));
            }
        }
    }

    public final boolean f(int i) {
        return (this.a & (1 << i)) != 0;
    }

    public final void g(int i, int i2) {
        if (i < 0 || i >= 10) {
            return;
        }
        this.a |= 1 << i;
        ((int[]) this.b)[i] = i2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    public final synchronized java.util.List h() {
        this.a++;
        return this.b;
    }

    public final synchronized void i() {
    }

    public apnf() {
        this.b = new int[10];
    }
}
