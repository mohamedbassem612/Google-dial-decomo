package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apyd extends defpackage.apxe implements defpackage.apyw {
    public final defpackage.apyf a;
    public defpackage.apyf b;

    public apyd(defpackage.apyf apyfVar) {
        this.a = apyfVar;
        if (apyfVar.q()) {
            throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = h();
    }

    private final defpackage.apyf h() {
        return this.a.k();
    }

    @Override // defpackage.apxe
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.apyd clone() {
        defpackage.apyd apydVarI = this.a.l();
        apydVarI.b = d();
        return apydVarI;
    }

    public final defpackage.apyf c() {
        defpackage.apyf apyfVarD = d();
        if (defpackage.apyf.s(apyfVarD)) {
            return apyfVarD;
        }
        throw new defpackage.apzl();
    }

    public final defpackage.apyf d() {
        boolean zQ = this.b.q();
        defpackage.apyf apyfVar = this.b;
        if (!zQ) {
            return apyfVar;
        }
        apyfVar.m();
        return this.b;
    }

    @Override // defpackage.apyw
    public final /* bridge */ /* synthetic */ defpackage.apyv e() {
        throw null;
    }

    public final void f() {
        if (this.b.q()) {
            return;
        }
        defpackage.apyf apyfVarH = h();
        defpackage.apzb.a.b(apyfVarH).e(apyfVarH, this.b);
        this.b = apyfVarH;
    }

    public final void g(int i) {
        f();
        defpackage.apxa apxaVar = (defpackage.apxa) this.b;
        int i2 = defpackage.apxa.SCHEME_FIELD_NUMBER;
        apxaVar.scheme_ = i - 1;
        apxaVar.bitField0_ |= 1;
    }

    public apyd() {
        this(defpackage.apuj.DEFAULT_INSTANCE);
    }
}
