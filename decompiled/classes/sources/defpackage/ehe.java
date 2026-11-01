package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ehe extends defpackage.ega implements defpackage.ehx {
    public final defpackage.ehg a;
    public defpackage.ehg b;

    public ehe(defpackage.ehg ehgVar) {
        this.a = ehgVar;
        if (ehgVar.s()) {
            throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = h();
    }

    private final defpackage.ehg h() {
        return this.a.l();
    }

    @Override // defpackage.ega
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.ehe clone() {
        defpackage.ehe eheVarM = this.a.m();
        eheVarM.b = e();
        return eheVarM;
    }

    public final defpackage.ehg d() {
        defpackage.ehg ehgVarE = e();
        if (defpackage.ehg.t(ehgVarE)) {
            return ehgVarE;
        }
        throw new defpackage.eim();
    }

    public final defpackage.ehg e() {
        boolean zS = this.b.s();
        defpackage.ehg ehgVar = this.b;
        if (!zS) {
            return ehgVar;
        }
        ehgVar.n();
        return this.b;
    }

    @Override // defpackage.ehx
    public final /* bridge */ /* synthetic */ defpackage.ehw f() {
        throw null;
    }

    public final void g() {
        if (this.b.s()) {
            return;
        }
        defpackage.ehg ehgVarH = h();
        defpackage.eid.a.a(ehgVarH).e(ehgVarH, this.b);
        this.b = ehgVarH;
    }

    public ehe() {
        this(defpackage.efr.DEFAULT_INSTANCE);
    }
}
