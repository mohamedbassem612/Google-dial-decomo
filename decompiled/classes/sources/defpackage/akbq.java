package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akbq implements defpackage.anme {
    private final defpackage.aoin a;
    private final java.lang.Class b;
    private final java.lang.Class c;

    public akbq(defpackage.aoin aoinVar, java.lang.Class cls, java.lang.Class cls2) {
        this.a = aoinVar;
        this.b = cls;
        this.c = cls2;
    }

    @Override // defpackage.anme
    public final defpackage.ajsz b(anpk anpkVar, defpackage.anmb anmbVar, defpackage.anmc anmcVar) {
        try {
            java.lang.Object objA = this.a.a();
            defpackage.ajsz.Y(anpkVar, this.b, true);
            defpackage.ajsz.Y(anpkVar, this.c, false);
            return new akcb(new akbw(anmcVar, anpkVar, anmbVar, (defpackage.aify) objA));
        } catch (defpackage.anqx e) {
            return new akcq(defpackage.anqw.d(e));
        }
    }
}
