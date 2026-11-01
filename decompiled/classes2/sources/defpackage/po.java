package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class po {
    private final java.lang.String a;
    private final java.lang.String b = "";
    private int c = 2;
    private int d = 0;
    private int e = 0;
    private int f = 0;

    public po(java.lang.String str) {
        dzk.x(str);
        this.a = str;
    }

    public final defpackage.pp a() {
        int i = this.e;
        int i2 = this.d;
        if (i == 0) {
            dzk.v(i2 == 0, "Cannot set TOKENIZER_TYPE_NONE with an indexing type other than INDEXING_TYPE_NONE.");
        } else {
            dzk.v(i2 != 0, "Cannot set TOKENIZER_TYPE_PLAIN with INDEXING_TYPE_NONE.");
        }
        return new defpackage.pp(new defpackage.sj((java.lang.String) j$.util.Objects.requireNonNull(this.a), 1, this.c, null, (defpackage.si) j$.util.Objects.requireNonNull(new defpackage.si(this.d, this.e)), null, null, (defpackage.sh) j$.util.Objects.requireNonNull(new defpackage.sh(this.f)), (java.lang.String) j$.util.Objects.requireNonNull(this.b), null, false));
    }

    public final void b(int i) {
        dzk.w(i, 1, 3, "cardinality");
        this.c = i;
    }

    public final void c(int i) {
        dzk.w(i, 0, 2, "indexingType");
        this.d = i;
    }

    public final void d(int i) {
        dzk.w(i, 0, 1, "joinableValueType");
        this.f = i;
    }

    public final void e(int i) {
        dzk.w(i, 0, 3, "tokenizerType");
        this.e = i;
    }
}
