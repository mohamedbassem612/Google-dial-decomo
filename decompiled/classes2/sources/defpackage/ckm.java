package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ckm extends cko {
    private final aonj a;
    private final cko b;

    public ckm(long j, ckv ckvVar, aonj aonjVar, cko ckoVar) {
        super(j, ckvVar);
        this.a = aonjVar;
        this.b = ckoVar;
        ckoVar.f();
    }

    public final /* bridge */ /* synthetic */ cko b(aonj aonjVar) {
        return new defpackage.ckm(((cko) this).i, ((cko) this).h, ckw.o(aonjVar, this.a, true), this.b);
    }

    public final void d() {
        if (((cko) this).j) {
            return;
        }
        long j = ((cko) this).i;
        cko ckoVar = this.b;
        if (j != ckoVar.v()) {
            y();
        }
        ckoVar.g();
        super.d();
    }

    public final /* synthetic */ void f() {
        cki.a();
    }

    public final /* synthetic */ void g() {
        cki.a();
    }

    public final /* synthetic */ aonj i() {
        return this.a;
    }

    public final aonj k() {
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aoiq */
    public final /* bridge */ /* synthetic */ void n(clr clrVar) throws aoiq {
        ckw.u();
        throw new aoiq();
    }

    public final boolean r() {
        return true;
    }

    public final void e() {
    }
}
