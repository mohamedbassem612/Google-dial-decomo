package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahod extends defpackage.ahnk {
    public static final java.util.UUID a;
    public static final java.lang.String b;

    static {
        java.util.UUID uuidRandomUUID = java.util.UUID.randomUUID();
        a = uuidRandomUUID;
        b = defpackage.ahms.fo(uuidRandomUUID);
    }

    private ahod(defpackage.ahod ahodVar, java.lang.String str, defpackage.ahou ahouVar, defpackage.ahpe ahpeVar) {
        super(str, ahodVar, ahouVar, ahpeVar);
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
        return new defpackage.ahod(this, str, ahouVar, ahpeVar);
    }

    public ahod(java.lang.String str, java.util.UUID uuid, java.lang.String str2, defpackage.ahou ahouVar, defpackage.ahpe ahpeVar) {
        super(str, uuid, str2, ahouVar, ahpeVar);
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
