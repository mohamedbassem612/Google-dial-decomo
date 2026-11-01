package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aakj {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    public aakj(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    final int a() {
        if (!this.a) {
            return 1;
        }
        if (this.c) {
            return 4;
        }
        return this.b ? 3 : 2;
    }

    final boolean b() {
        return a() == 4 || a() == 3;
    }
}
