package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class pl {
    private final java.lang.String b;
    private final java.lang.String c = "";
    private int d = 2;
    private int e = 0;
    public boolean a = false;

    public pl(java.lang.String str) {
        dzk.x(str);
        this.b = str;
    }

    public final defpackage.pm a() {
        int i = this.d;
        int i2 = this.e;
        return new defpackage.pm(new defpackage.sj((java.lang.String) j$.util.Objects.requireNonNull(this.b), 2, i, null, null, null, new defpackage.sg(i2), null, (java.lang.String) j$.util.Objects.requireNonNull(this.c), null, this.a));
    }

    public final void b(int i) {
        dzk.w(i, 1, 3, "cardinality");
        this.d = i;
    }

    public final void c(int i) {
        dzk.w(i, 0, 1, "indexingType");
        this.e = i;
    }
}
