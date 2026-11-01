package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahob extends defpackage.ahms implements defpackage.ahnj {
    public static final defpackage.ahnh a = new defpackage.ahni();
    public final boolean b;
    private final java.lang.Exception c;

    public ahob(java.util.UUID uuid, java.lang.String str, java.lang.Exception exc, boolean z, defpackage.ahpe ahpeVar) {
        super("<missing root>", uuid, str, ahpeVar);
        this.c = exc;
        this.b = z;
    }

    public static defpackage.ahob m(defpackage.ahpe ahpeVar) {
        java.util.UUID uuidB = defpackage.ahnt.a.b();
        java.lang.String strFo = defpackage.ahms.fo(uuidB);
        if (!defpackage.ahpl.a()) {
            s();
            return new defpackage.ahob(uuidB, strFo, a, false, ahpeVar);
        }
        defpackage.ahnh ahnhVar = new defpackage.ahnh();
        s();
        return new defpackage.ahob(uuidB, strFo, ahnhVar, defpackage.ahns.p(ahnhVar), ahpeVar);
    }

    public static void s() {
        defpackage.aihd aihdVar = (defpackage.aihd) defpackage.ahns.b.get();
        if (aihdVar.isEmpty()) {
            return;
        }
        j$.lang.Iterable.-EL.forEach(aihdVar, new uwm(20));
    }

    @Override // defpackage.ahnj
    public final defpackage.ahpj c(java.lang.String str, defpackage.ahou ahouVar, boolean z, defpackage.ahpe ahpeVar) {
        if (z) {
            defpackage.ahns.t(true);
        }
        return new defpackage.ahoc(str, this, ahouVar, z, ahpeVar);
    }

    @Override // defpackage.ahnj
    public final java.lang.Exception h() {
        return this.c;
    }

    @Override // defpackage.ahnj
    public final boolean i() {
        return this.b;
    }

    @Override // defpackage.ahpj
    public final defpackage.ahou j() {
        return defpackage.ahot.a;
    }

    @Override // defpackage.ahpj
    public final defpackage.ahor k(defpackage.agab agabVar) {
        return defpackage.ahor.d(2);
    }

    @Override // defpackage.ahpj
    public final long l() {
        return -1L;
    }

    @Override // defpackage.ahpj
    public final defpackage.ahou n() {
        throw null;
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

    @Override // defpackage.ahpj
    public final void u(defpackage.agab agabVar, java.lang.Object obj) {
    }
}
