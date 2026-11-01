package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
abstract class ahnk extends defpackage.ahms {
    private final defpackage.ahou a;

    public ahnk(java.lang.String str, defpackage.ahpj ahpjVar, defpackage.ahou ahouVar, defpackage.ahpe ahpeVar) {
        super(str, ahpjVar, ahpeVar);
        if (!ahouVar.d) {
            throw new java.lang.IllegalArgumentException();
        }
        this.a = ahouVar;
    }

    @Override // defpackage.ahpj
    public final defpackage.ahou j() {
        return defpackage.ahou.e(this.a, n());
    }

    @Override // defpackage.ahpj
    public defpackage.ahor k(defpackage.agab agabVar) {
        return defpackage.ahou.j(agabVar, j());
    }

    public ahnk(java.lang.String str, java.util.UUID uuid, java.lang.String str2, defpackage.ahou ahouVar, defpackage.ahpe ahpeVar) {
        super(str, uuid, str2, ahpeVar);
        if (ahouVar.d) {
            this.a = ahouVar;
            return;
        }
        throw new java.lang.IllegalArgumentException();
    }
}
