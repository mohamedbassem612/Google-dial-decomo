package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anac extends defpackage.amzz {
    private final aify a;

    public anac(java.lang.Iterable iterable) {
        this.a = aify.j(iterable);
    }

    @Override // defpackage.amzz
    public final defpackage.anaa a(java.lang.Object obj) {
        aift aiftVar = new aift(4);
        aify aifyVar = this.a;
        int size = aifyVar.size();
        for (int i = 0; i < size; i++) {
            defpackage.amzz amzzVar = (defpackage.amzz) aifyVar.get(i);
            try {
                aiftVar.i(amzzVar.a(obj));
            } catch (java.lang.RuntimeException e) {
                defpackage.anah.b(e, amzzVar, obj);
            }
        }
        aike aikeVarH = aiftVar.h();
        if (aikeVarH.isEmpty()) {
            return defpackage.anaa.b;
        }
        return aikeVarH.d == 1 ? new defpackage.anag((defpackage.anaa) ahvr.bm(aikeVarH)) : new defpackage.anad(aikeVarH);
    }
}
