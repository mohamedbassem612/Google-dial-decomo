package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class pi {
    private final java.lang.String b;
    private java.util.ArrayList c = new java.util.ArrayList();
    public java.util.LinkedHashSet a = new java.util.LinkedHashSet();
    private final java.util.Set d = new acc(0);
    private boolean e = false;

    public pi(java.lang.String str) {
        dzk.x(str);
        this.b = str;
    }

    public final defpackage.pq a() {
        this.e = true;
        return new defpackage.pq(this.b, this.c, new java.util.ArrayList(this.a));
    }

    public final void b() {
        if (this.e) {
            this.c = new java.util.ArrayList(this.c);
            this.a = new java.util.LinkedHashSet(this.a);
            this.e = false;
        }
    }

    public final void c(defpackage.pn pnVar) {
        dzk.x(pnVar);
        b();
        java.util.Set set = this.d;
        java.lang.String strA = pnVar.a();
        if (!set.add(strA)) {
            throw new defpackage.qw("Property defined more than once: ".concat(java.lang.String.valueOf(strA)));
        }
        this.c.add(pnVar.a);
    }
}
