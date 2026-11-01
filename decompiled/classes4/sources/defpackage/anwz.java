package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anwz implements anvs {
    final anqw a;
    private final defpackage.anvq b;

    public anwz(anqw anqwVar, defpackage.anvq anvqVar) {
        ahvr.bN(!anqwVar.h(), "error must not be OK");
        this.a = anqwVar;
        this.b = anvqVar;
    }

    public final defpackage.anvp b(defpackage.anpk anpkVar, anph anphVar, anmb anmbVar, anmg[] anmgVarArr) {
        return new defpackage.anwy(this.a, this.b, anmgVarArr);
    }

    public final anns c() {
        throw new java.lang.UnsupportedOperationException("Not a real transport");
    }
}
