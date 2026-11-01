package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ckf extends defpackage.ckk {
    public ckf(long j, defpackage.ckv ckvVar) {
        super(j, ckvVar, null, new defpackage.ckc(2));
    }

    @Override // defpackage.ckk
    public final defpackage.ckk a(defpackage.aonj aonjVar, defpackage.aonj aonjVar2) {
        defpackage.deu deuVar = new defpackage.deu(aonjVar, aonjVar2, 1, null);
        defpackage.aonj aonjVar3 = defpackage.ckw.a;
        return (defpackage.ckk) ((defpackage.cko) defpackage.ckw.l(new defpackage.bjp(deuVar, 11)));
    }

    @Override // defpackage.ckk, defpackage.cko
    public final defpackage.cko b(defpackage.aonj aonjVar) {
        defpackage.kgg kggVar = new defpackage.kgg(aonjVar, 1);
        defpackage.aonj aonjVar2 = defpackage.ckw.a;
        return (defpackage.ckn) ((defpackage.cko) defpackage.ckw.l(new defpackage.bjp(kggVar, 11)));
    }

    @Override // defpackage.ckk
    public final defpackage.cks c() {
        throw new java.lang.IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // defpackage.ckk, defpackage.cko
    public final void d() {
        synchronized (defpackage.ckw.b) {
            z();
        }
    }

    @Override // defpackage.ckk, defpackage.cko
    public final void e() {
        defpackage.ckw.l(defpackage.ckw.a);
    }

    @Override // defpackage.ckk, defpackage.cko
    public final /* synthetic */ void f() {
        defpackage.cki.a();
    }

    @Override // defpackage.ckk, defpackage.cko
    public final /* synthetic */ void g() {
        defpackage.cki.a();
    }
}
