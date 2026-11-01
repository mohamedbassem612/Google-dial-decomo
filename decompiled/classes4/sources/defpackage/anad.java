package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anad extends defpackage.anaa {
    private final aify a;

    public anad(aify aifyVar) {
        this.a = aifyVar;
    }

    @Override // defpackage.anaa
    public final defpackage.amzv a(amzw amzwVar) {
        aift aiftVar = new aift(4);
        int i = 0;
        while (true) {
            aike aikeVar = this.a;
            if (i >= aikeVar.d) {
                break;
            }
            defpackage.anaa anaaVar = (defpackage.anaa) aikeVar.get(i);
            try {
                aiftVar.i(anaaVar.a(amzwVar));
            } catch (java.lang.RuntimeException e) {
                defpackage.anah.d(e, anaaVar, amzwVar);
            }
            i++;
        }
        aike aikeVarH = aiftVar.h();
        if (aikeVarH.isEmpty()) {
            return defpackage.amzv.e;
        }
        return aikeVarH.d == 1 ? new defpackage.anae((defpackage.amzv) ahvr.bm(aikeVarH)) : new defpackage.anab(aikeVarH);
    }
}
