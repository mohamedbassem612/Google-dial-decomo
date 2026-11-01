package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uik {
    public byte a;
    public int b;
    private defpackage.udj c;
    private java.lang.Long d;
    private defpackage.uio e;

    public final defpackage.uin a() {
        int i = ~this.a;
        if ((i & 1) == 0) {
            return new defpackage.uin(this.c, this.b, this.d, this.e, i & 14);
        }
        throw new java.lang.IllegalStateException("Missing required properties: spamStatus");
    }

    public final void b(defpackage.uio uioVar) {
        this.e = uioVar;
        this.a = (byte) (this.a | 8);
    }

    public final void c(defpackage.udj udjVar) {
        if (udjVar == null) {
            throw new java.lang.NullPointerException("Null spamStatus");
        }
        this.c = udjVar;
        this.a = (byte) (this.a | 1);
    }

    public final void d(java.lang.Long l) {
        this.d = l;
        this.a = (byte) (this.a | 4);
    }
}
