package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahoc extends defpackage.ahnk implements defpackage.ahnj {
    public final boolean a;
    private final java.lang.Exception b;
    private final boolean c;

    public ahoc(java.lang.String str, defpackage.ahnj ahnjVar, defpackage.ahou ahouVar, boolean z, defpackage.ahpe ahpeVar) {
        super("<missing root>:".concat(java.lang.String.valueOf(str)), ahnjVar, defpackage.ahou.e(ahouVar, defpackage.ahot.b), ahpeVar);
        this.b = ahnjVar.h();
        this.a = ahnjVar.i();
        this.c = z;
    }

    public static void m() {
        defpackage.aihd aihdVar = (defpackage.aihd) defpackage.ahns.b.get();
        if (aihdVar.isEmpty()) {
            return;
        }
        j$.lang.Iterable.-EL.forEach(aihdVar, new aljd(1));
    }

    @Override // defpackage.ahnj
    public final defpackage.ahpj c(java.lang.String str, defpackage.ahou ahouVar, boolean z, defpackage.ahpe ahpeVar) {
        boolean z2 = true;
        if (z && !this.c) {
            defpackage.ahns.t(true);
        }
        if ((!z || this.c) && !this.c) {
            z2 = false;
        }
        return new defpackage.ahoc(str, this, ahouVar, z2, ahpeVar);
    }

    @Override // defpackage.ahnj
    public final java.lang.Exception h() {
        return this.b;
    }

    @Override // defpackage.ahnj
    public final boolean i() {
        return this.a;
    }

    @Override // defpackage.ahnk, defpackage.ahpj
    public final defpackage.ahor k(defpackage.agab agabVar) {
        defpackage.ahor ahorVarK = super.k(agabVar);
        return ahorVarK.c() == 3 ? defpackage.ahor.d(2) : ahorVarK;
    }

    @Override // defpackage.ahpj
    public final long l() {
        return -1L;
    }

    @Override // defpackage.ahpj
    public final defpackage.ahou n() {
        return defpackage.ahot.a;
    }

    @Override // defpackage.ahpj
    public final boolean q() {
        return false;
    }

    @Override // defpackage.ahpj
    public final defpackage.ahpj r(java.lang.String str, int i, defpackage.ahou ahouVar, defpackage.ahpe ahpeVar) {
        defpackage.ahns.t(true);
        return c(str, ahouVar, true, ahpeVar);
    }

    @Override // defpackage.ahpj
    public final void t() {
    }

    @Override // defpackage.ahpj
    public final void o(int i) {
    }

    @Override // defpackage.ahpj
    public final void p(boolean z) {
    }

    public ahoc(java.util.UUID uuid, java.lang.String str, java.lang.String str2, defpackage.ahou ahouVar, java.lang.Exception exc, boolean z, boolean z2, defpackage.ahpe ahpeVar) {
        super("<missing root>:".concat(java.lang.String.valueOf(str2)), uuid, str, defpackage.ahou.e(ahouVar, defpackage.ahot.b), ahpeVar);
        this.a = z2;
        this.b = exc;
        this.c = z;
    }

    @Override // defpackage.ahpj
    public final void u(defpackage.agab agabVar, java.lang.Object obj) {
    }
}
