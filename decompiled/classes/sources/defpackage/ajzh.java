package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajzh implements defpackage.ajzc {
    public static final defpackage.aiof a = defpackage.aiof.i("xRPC");
    public static final java.util.concurrent.atomic.AtomicInteger b = new java.util.concurrent.atomic.AtomicInteger();
    public final java.util.concurrent.Executor c;
    public final defpackage.ajas d;
    private final defpackage.aihd e;

    public ajzh(defpackage.ajzd ajzdVar) {
        this.c = ajzdVar.a;
        this.d = new defpackage.ahmg(new defpackage.agtc(new defpackage.ahmg(ajzdVar, 4), ajzdVar.c), 5);
        this.e = ajzdVar.e.g();
    }

    @Override // defpackage.ajzc
    public final defpackage.ajcq a(ajzm ajzmVar) {
        defpackage.ajcq ajcqVarH;
        defpackage.ahoq ahoqVarW = defpackage.ahvr.W(1485, "Http Request");
        try {
            defpackage.aihd aihdVar = this.e;
            defpackage.aihd aihdVar2 = ajzmVar.i;
            if (aihdVar2.isEmpty() && aihdVar.isEmpty()) {
                ajcqVarH = defpackage.aiql.z(ajzmVar);
            } else {
                defpackage.aift aiftVar = new defpackage.aift(4);
                defpackage.ailj it = aihdVar.iterator();
                while (it.hasNext()) {
                    aiftVar.i(defpackage.aiql.E(((ajzp) it.next()).a(), defpackage.ajbm.INSTANCE));
                }
                defpackage.ailj it2 = aihdVar2.iterator();
                while (it2.hasNext()) {
                    aiftVar.i(defpackage.aiql.E(((ajzp) it2.next()).a(), defpackage.ajbm.INSTANCE));
                }
                ajcqVarH = defpackage.ahvr.M(aiftVar.g()).h(new ahds(ajzmVar, 13), defpackage.ajbm.INSTANCE);
            }
            defpackage.ajcq ajcqVarG = defpackage.ajan.g(ajcqVarH, defpackage.ahqx.c(new agpe(this, 13)), defpackage.ajbm.INSTANCE);
            ahoqVarW.a(ajcqVarG);
            ahoqVarW.close();
            return ajcqVarG;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
