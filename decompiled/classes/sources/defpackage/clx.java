package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class clx extends defpackage.cko {
    public defpackage.aonj a;
    public final long b;
    private final defpackage.cko c;
    private final boolean d;
    private final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clx(defpackage.cko ckoVar, defpackage.aonj aonjVar, boolean z, boolean z2) {
        defpackage.aonj aonjVarI;
        super(0L, defpackage.ckv.a);
        defpackage.aonj aonjVar2 = defpackage.ckw.a;
        this.c = ckoVar;
        this.d = z;
        this.e = z2;
        this.a = defpackage.ckw.o(aonjVar, (ckoVar == null || (aonjVarI = ckoVar.i()) == null) ? defpackage.ckw.h.a : aonjVarI, z);
        this.b = java.lang.Thread.currentThread().getId();
    }

    private final defpackage.cko a() {
        defpackage.cko ckoVar = this.c;
        return ckoVar == null ? defpackage.ckw.h : ckoVar;
    }

    @Override // defpackage.cko
    public final defpackage.cko b(defpackage.aonj aonjVar) {
        defpackage.aonj aonjVarO = defpackage.ckw.o(aonjVar, this.a, true);
        return !this.d ? defpackage.ckw.a(a().b(null), aonjVarO, true) : a().b(aonjVarO);
    }

    @Override // defpackage.cko
    public final void d() {
        defpackage.cko ckoVar;
        this.j = true;
        if (!this.e || (ckoVar = this.c) == null) {
            return;
        }
        ckoVar.d();
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
    public final /* synthetic */ defpackage.aonj i() {
        return this.a;
    }

    @Override // defpackage.cko
    public final defpackage.aonj k() {
        return null;
    }

    @Override // defpackage.cko
    public final void n(defpackage.clr clrVar) {
        a().n(clrVar);
    }

    @Override // defpackage.cko
    public final boolean r() {
        return a().r();
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
