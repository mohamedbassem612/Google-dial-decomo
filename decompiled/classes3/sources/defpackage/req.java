package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class req {
    private int a;
    private int b;
    private j$.util.OptionalInt c = j$.util.OptionalInt.empty();
    private int d;
    private byte e;

    public final defpackage.rer a() {
        if (this.e == 7) {
            return new defpackage.rer(this.a, this.b, this.c, this.d);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" titleRes");
        }
        if ((this.e & 2) == 0) {
            sb.append(" messageRes");
        }
        if ((this.e & 4) == 0) {
            sb.append(" negativeButtonTextRes");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.b = i;
        this.e = (byte) (this.e | 2);
    }

    public final void c(int i) {
        this.d = i;
        this.e = (byte) (this.e | 4);
    }

    public final void d(int i) {
        this.c = j$.util.OptionalInt.of(i);
    }

    public final void e(int i) {
        this.a = i;
        this.e = (byte) (this.e | 1);
    }
}
