package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vty {
    public int a;
    private java.lang.CharSequence b;
    private boolean c;
    private byte d;

    public final defpackage.vtz a() {
        java.lang.CharSequence charSequence;
        int i;
        if (this.d == 1 && (charSequence = this.b) != null && (i = this.a) != 0) {
            return new defpackage.vtz(charSequence, i, this.c);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.b == null) {
            sb.append(" text");
        }
        if (this.a == 0) {
            sb.append(" actionId");
        }
        if (this.d == 0) {
            sb.append(" isRaised");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.c = z;
        this.d = (byte) 1;
    }

    public final void c(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            throw new java.lang.NullPointerException("Null text");
        }
        this.b = charSequence;
    }
}
