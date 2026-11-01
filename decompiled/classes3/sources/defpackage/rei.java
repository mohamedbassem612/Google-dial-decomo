package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rei {
    public defpackage.rea a;
    private int c;
    private byte e;
    private j$.util.OptionalInt b = j$.util.OptionalInt.empty();
    private final j$.util.OptionalInt d = j$.util.OptionalInt.empty();

    public final defpackage.rej a() {
        defpackage.rea reaVar;
        if (this.e == 1 && (reaVar = this.a) != null) {
            return new defpackage.rej(reaVar, this.b, this.c, this.d);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == null) {
            sb.append(" featureControllerKey");
        }
        if (this.e == 0) {
            sb.append(" primaryTextRes");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b() {
        this.b = j$.util.OptionalInt.of(2131231550);
    }

    public final void c(int i) {
        this.c = i;
        this.e = (byte) 1;
    }
}
