package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aowj extends defpackage.aors implements defpackage.aowi {
    public final defpackage.aowi b;

    public aowj(defpackage.aolr aolrVar, defpackage.aowi aowiVar) {
        super(aolrVar, true);
        this.b = aowiVar;
    }

    @Override // defpackage.aowu
    public final defpackage.aovx A() {
        return this.b.A();
    }

    @Override // defpackage.aowu
    public final defpackage.apdi B() {
        return this.b.B();
    }

    @Override // defpackage.aoul
    public final void J(java.lang.Throwable th) {
        defpackage.aowi aowiVar = this.b;
        java.util.concurrent.CancellationException cancellationExceptionG = G(th, null);
        aowiVar.s(cancellationExceptionG);
        N(cancellationExceptionG, null);
    }

    @Override // defpackage.aowv
    public final java.lang.Object a(java.lang.Object obj, defpackage.aoln aolnVar) {
        return this.b.a(obj, aolnVar);
    }

    @Override // defpackage.aowv
    public final java.lang.Object b(java.lang.Object obj) {
        return this.b.b(obj);
    }

    @Override // defpackage.aowv
    public final void d(defpackage.aonj aonjVar) {
        throw null;
    }

    @Override // defpackage.aowv
    public final boolean e(java.lang.Throwable th) {
        return this.b.e(th);
    }

    @Override // defpackage.aowv
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.aowu
    public final java.lang.Object i(defpackage.aoln aolnVar) {
        return this.b.i(aolnVar);
    }

    @Override // defpackage.aowu
    public final java.lang.Object j(defpackage.aoln aolnVar) {
        throw null;
    }

    @Override // defpackage.aowu
    public final java.lang.Object m() {
        throw null;
    }

    @Override // defpackage.aoul, defpackage.aoub
    public final void s(java.util.concurrent.CancellationException cancellationException) {
        if (v()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new defpackage.aouc(g(), null, this);
        }
        J(cancellationException);
    }
}
