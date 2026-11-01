package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ckn extends defpackage.cko {
    private final defpackage.aonj a;
    private int b;

    public ckn(long j, defpackage.ckv ckvVar, defpackage.aonj aonjVar) {
        super(j, ckvVar);
        this.a = aonjVar;
        this.b = 1;
    }

    @Override // defpackage.cko
    public final defpackage.cko b(defpackage.aonj aonjVar) {
        defpackage.ckw.t(this);
        return new ckm(this.i, this.h, defpackage.ckw.o(aonjVar, this.a, true), this);
    }

    @Override // defpackage.cko
    public final void d() {
        if (this.j) {
            return;
        }
        g();
        super.d();
    }

    @Override // defpackage.cko
    public final void f() {
        this.b++;
    }

    @Override // defpackage.cko
    public final void g() {
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            y();
        }
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
        defpackage.ckw.u();
        throw new defpackage.aoiq();
    }

    @Override // defpackage.cko
    public final boolean r() {
        return true;
    }

    @Override // defpackage.cko
    public final void e() {
    }
}
