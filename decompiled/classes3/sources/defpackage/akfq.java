package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akfq {
    public akfg a;
    public boolean b;
    public byte c;
    private boolean d;

    public final defpackage.akfr a() {
        if (this.c == 3) {
            return new defpackage.akfr(this.a, this.d, this.b);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" keepRawInput");
        }
        if ((this.c & 2) == 0) {
            sb.append(" stripNationalPrefixAfterCountryCode");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.d = z;
        this.c = (byte) (this.c | 1);
    }
}
