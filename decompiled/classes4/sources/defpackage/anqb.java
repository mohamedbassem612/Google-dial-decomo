package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public class anqb extends defpackage.anql {
    private final defpackage.anql a;

    protected anqb(defpackage.anql anqlVar) {
        this.a = anqlVar;
    }

    @Override // defpackage.anql
    public void a(anqw anqwVar, anph anphVar) {
        this.a.a(anqwVar, anphVar);
    }

    @Override // defpackage.anql
    public final defpackage.anlw b() {
        return this.a.b();
    }

    @Override // defpackage.anql
    public final void c(int i) {
        this.a.c(i);
    }

    @Override // defpackage.anql
    public final void d(anph anphVar) {
        this.a.d(anphVar);
    }

    @Override // defpackage.anql
    public final boolean e() {
        return this.a.e();
    }

    @Override // defpackage.anql
    public final defpackage.anpk f() {
        return this.a.f();
    }

    @Override // defpackage.anql
    public final void g(java.lang.Object obj) {
        this.a.g(obj);
    }

    public final java.lang.String toString() {
        defpackage.anql anqlVar = this.a;
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("delegate", anqlVar);
        return ahymVarL.toString();
    }
}
