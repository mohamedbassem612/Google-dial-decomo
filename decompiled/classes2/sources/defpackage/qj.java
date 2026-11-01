package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class qj {
    private java.util.List a = new java.util.ArrayList();
    private java.util.List b = new java.util.ArrayList();
    private androidx.appsearch.safeparcel.PackageIdentifierParcel c;
    private boolean d;

    private final void e() {
        if (this.d) {
            this.a = new java.util.ArrayList(this.a);
            this.b = new java.util.ArrayList(this.b);
            this.d = false;
        }
    }

    public final defpackage.qk a() {
        this.d = true;
        return new defpackage.qk(this.a, this.b, this.c);
    }

    public final void b(defpackage.qf qfVar) {
        j$.util.Objects.requireNonNull(qfVar);
        e();
        this.a.add(qfVar.a);
    }

    public final void c(java.util.Set set) {
        j$.util.Objects.requireNonNull(set);
        pf.a();
        dzk.u(!set.isEmpty(), "The set of required permissions cannot be empty");
        e();
        this.b.add(new defpackage.qu(set));
    }

    public final void d(defpackage.qf qfVar) {
        e();
        this.c = qfVar == null ? null : qfVar.a;
    }
}
