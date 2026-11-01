package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cly extends defpackage.cko {
    public defpackage.cko a;
    private final long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cly(defpackage.cko ckoVar) {
        super(0L, defpackage.ckv.a);
        defpackage.aonj aonjVar = defpackage.ckw.a;
        this.a = ckoVar;
        this.b = java.lang.Thread.currentThread().getId();
    }

    private final defpackage.cko a() {
        defpackage.cko ckoVar = this.a;
        return ckoVar == null ? defpackage.ckw.h : ckoVar;
    }

    @Override // defpackage.cko
    public final defpackage.cko b(defpackage.aonj aonjVar) {
        return a().b(aonjVar);
    }

    @Override // defpackage.cko
    public final void d() {
        this.j = true;
        this.a = null;
        if (this.b == java.lang.Thread.currentThread().getId()) {
            defpackage.ckw.k.l(this);
        }
    }

    @Override // defpackage.cko
    public final void e() {
        a().e();
    }

    @Override // defpackage.cko
    public final /* synthetic */ void f() {
        defpackage.cki.a();
    }

    @Override // defpackage.cko
    public final /* synthetic */ void g() {
        defpackage.cki.a();
    }

    @Override // defpackage.cko
    public final int h() {
        return a().h();
    }

    @Override // defpackage.cko
    public final /* bridge */ /* synthetic */ defpackage.aonj i() {
        return a().i();
    }

    @Override // defpackage.cko
    public final defpackage.aonj k() {
        return a().k();
    }

    @Override // defpackage.cko
    public final /* bridge */ /* synthetic */ void n(defpackage.clr clrVar) {
        defpackage.ckw.u();
        throw new defpackage.aoiq();
    }

    @Override // defpackage.cko
    public final void q(int i) {
        a().q(i);
    }

    @Override // defpackage.cko
    public final boolean r() {
        return true;
    }

    @Override // defpackage.cko
    public final long v() {
        return a().v();
    }

    @Override // defpackage.cko
    public final defpackage.ckv x() {
        return a().x();
    }
}
