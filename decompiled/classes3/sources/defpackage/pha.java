package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pha extends amzm {
    private final amzg b;

    public pha(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.pha.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.phm phmVar = (defpackage.phm) obj;
        aooh.f(phmVar, "phoneLookupStages");
        ahoq ahoqVarW = ahvr.W(484, "produceModernizedPhoneLookupInfo");
        try {
            ajcq ajcqVar = phmVar.a;
            if (!ajcqVar.isDone()) {
                ajcqVar = phmVar.b;
                if (!ajcqVar.isDone()) {
                    ajcqVar = phmVar.c;
                }
            }
            ajcq ajcqVarB = pez.b(ajcqVar);
            ahoqVarW.a(ajcqVarB);
            aooh.e(ajcqVarB, "attachToFuture(...)");
            ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
            return ajcqVarB;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahoqVarW, th);
                throw th2;
            }
        }
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
