package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anyc extends defpackage.anxe {
    public final anve a;
    private final defpackage.anwc b;

    public anyc(defpackage.anwc anwcVar, anve anveVar) {
        this.b = anwcVar;
        this.a = anveVar;
    }

    @Override // defpackage.anxe
    protected final defpackage.anwc a() {
        return this.b;
    }

    @Override // defpackage.anxe
    public final defpackage.anvp b(defpackage.anpk anpkVar, anph anphVar, anmb anmbVar, anmg[] anmgVarArr) {
        return new defpackage.anyb(this, this.b.b(anpkVar, anphVar, anmbVar, anmgVarArr));
    }
}
