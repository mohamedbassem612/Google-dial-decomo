package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class clw extends defpackage.ckk {
    public defpackage.aonj l;
    public defpackage.aonj m;
    public final long n;
    private defpackage.ckk o;
    private boolean p;
    private boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clw(defpackage.ckk ckkVar, defpackage.aonj aonjVar, defpackage.aonj aonjVar2, boolean z, boolean z2) {
        defpackage.aonj aonjVarK;
        defpackage.aonj aonjVarI;
        super(0L, defpackage.ckv.a, null, null);
        defpackage.aonj aonjVar3 = defpackage.ckw.a;
        this.o = ckkVar;
        this.p = z;
        this.q = z2;
        this.l = defpackage.ckw.o(aonjVar, (ckkVar == null || (aonjVarI = ckkVar.i()) == null) ? defpackage.ckw.h.a : aonjVarI, z);
        this.m = defpackage.ckw.p(aonjVar2, (ckkVar == null || (aonjVarK = ckkVar.k()) == null) ? defpackage.ckw.h.b : aonjVarK);
        this.n = java.lang.Thread.currentThread().getId();
    }

    private final defpackage.ckk E() {
        defpackage.ckk ckkVar = this.o;
        return ckkVar == null ? defpackage.ckw.h : ckkVar;
    }

    @Override // defpackage.cko
    public final void A(defpackage.ckv ckvVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.cko
    public final void B(long j) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final void D(defpackage.ckk ckkVar, defpackage.aonj aonjVar, boolean z, boolean z2) {
        defpackage.aonj aonjVarI;
        defpackage.aonj aonjVarK;
        this.o = ckkVar;
        if (ckkVar == null || (aonjVarI = ckkVar.i()) == null) {
            aonjVarI = defpackage.ckw.h.a;
        }
        this.l = defpackage.ckw.o(aonjVar, aonjVarI, z);
        if (ckkVar == null || (aonjVarK = ckkVar.k()) == null) {
            aonjVarK = defpackage.ckw.h.b;
        }
        this.m = aonjVarK;
        this.p = z;
        this.q = z2;
        this.j = false;
    }

    @Override // defpackage.ckk
    public final defpackage.ckk a(defpackage.aonj aonjVar, defpackage.aonj aonjVar2) {
        defpackage.aonj aonjVarO = defpackage.ckw.o(aonjVar, this.l, true);
        defpackage.aonj aonjVarP = defpackage.ckw.p(aonjVar2, this.m);
        return !this.p ? new defpackage.clw(E().a(null, aonjVarP), aonjVarO, aonjVarP, false, true) : E().a(aonjVarO, aonjVarP);
    }

    @Override // defpackage.ckk, defpackage.cko
    public final defpackage.cko b(defpackage.aonj aonjVar) {
        defpackage.aonj aonjVarO = defpackage.ckw.o(aonjVar, this.l, true);
        return !this.p ? defpackage.ckw.a(E().b(null), aonjVarO, true) : E().b(aonjVarO);
    }

    @Override // defpackage.ckk
    public final defpackage.cks c() {
        return E().c();
    }

    @Override // defpackage.ckk, defpackage.cko
    public final void d() {
        defpackage.ckk ckkVar;
        this.j = true;
        if (this.q && (ckkVar = this.o) != null) {
            ckkVar.d();
        }
        this.o = null;
        this.l = null;
        this.m = null;
        if (this.n == java.lang.Thread.currentThread().getId()) {
            defpackage.ckw.j.l(this);
        }
    }

    @Override // defpackage.ckk, defpackage.cko
    public final void e() {
        E().e();
    }

    @Override // defpackage.ckk, defpackage.cko
    public final /* synthetic */ void f() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.ckk, defpackage.cko
    public final /* synthetic */ void g() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.ckk, defpackage.cko
    public final int h() {
        return E().h();
    }

    @Override // defpackage.ckk, defpackage.cko
    public final /* synthetic */ defpackage.aonj i() {
        return this.l;
    }

    @Override // defpackage.ckk
    /* JADX INFO: renamed from: j */
    public final defpackage.aonj i() {
        return this.l;
    }

    @Override // defpackage.ckk, defpackage.cko
    public final defpackage.aonj k() {
        return this.m;
    }

    @Override // defpackage.ckk, defpackage.cko
    public final void n(defpackage.clr clrVar) {
        E().n(clrVar);
    }

    @Override // defpackage.ckk, defpackage.cko
    public final void q(int i) {
        E().q(i);
    }

    @Override // defpackage.ckk, defpackage.cko
    public final boolean r() {
        E().r();
        return false;
    }

    @Override // defpackage.ckk
    public final defpackage.ady s() {
        return E().s();
    }

    @Override // defpackage.ckk
    public final void u(defpackage.ady adyVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.cko
    public final long v() {
        return E().v();
    }

    @Override // defpackage.cko
    public final defpackage.ckv x() {
        return E().x();
    }
}
