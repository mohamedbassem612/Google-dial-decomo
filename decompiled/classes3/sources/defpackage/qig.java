package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qig {
    public java.lang.CharSequence a;
    public byte b;
    private defpackage.qio c;
    private java.lang.CharSequence d;
    private java.lang.CharSequence e;
    private java.lang.CharSequence f;

    public final defpackage.qin a() {
        int i = ~this.b;
        if ((i & 9) != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if ((this.b & 1) == 0) {
                sb.append(" priority");
            }
            if ((this.b & 8) == 0) {
                sb.append(" contentText");
            }
            throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        defpackage.qio qioVar = this.c;
        java.lang.CharSequence charSequence = this.d;
        java.lang.CharSequence charSequence2 = this.e;
        java.lang.CharSequence charSequence3 = this.f;
        java.lang.CharSequence charSequence4 = this.a;
        if ((i & 2) != 0) {
            charSequence = null;
        }
        return new defpackage.qin(qioVar, charSequence, (i & 4) != 0 ? null : charSequence2, charSequence3, (i & 16) == 0 ? charSequence4 : null);
    }

    public final void b(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            throw new java.lang.NullPointerException("Null contentText");
        }
        this.f = charSequence;
        this.b = (byte) (this.b | 8);
    }

    public final void c(defpackage.qio qioVar) {
        this.c = qioVar;
        this.b = (byte) (this.b | 1);
    }

    public final /* synthetic */ void d(j$.util.Optional optional) {
        aooh.f(optional, "contentTitle");
        this.d = (java.lang.CharSequence) aooh.q(optional);
        this.b = (byte) (this.b | 2);
    }

    public final /* synthetic */ void e(j$.util.Optional optional) {
        aooh.f(optional, "publicContentTitle");
        this.e = (java.lang.CharSequence) aooh.q(optional);
        this.b = (byte) (this.b | 4);
    }
}
