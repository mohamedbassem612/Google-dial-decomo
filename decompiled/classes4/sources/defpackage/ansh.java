package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ansh implements defpackage.anqn {
    public static anqw b(java.lang.Throwable th) {
        return anqw.k.e(th).f("Authorization future failed");
    }

    @Override // defpackage.anqn
    public final defpackage.antw a(defpackage.anql anqlVar, anph anphVar, defpackage.anqm anqmVar) {
        ajcq ajcqVarY;
        ajcq ajcqVarA;
        anqw anqwVarB;
        defpackage.ansj ansjVar = (defpackage.ansj) anqlVar.b().a(defpackage.ansk.a);
        defpackage.anpk anpkVarF = anqlVar.f();
        java.lang.String str = anpkVarF.c;
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = ansjVar.b;
        ajcq ajcqVar = (ajcq) concurrentHashMap.get(str);
        if (ajcqVar != null) {
            ajcqVarA = aiql.A(ajcqVar);
        } else {
            ajdd ajddVar = new ajdd();
            ajcq ajcqVar2 = (ajcq) concurrentHashMap.putIfAbsent(str, ajddVar);
            if (ajcqVar2 != null) {
                ajcqVarA = aiql.A(ajcqVar2);
            } else {
                if (ansjVar.d) {
                    ajddVar.cancel(false);
                } else {
                    try {
                        aprf aprfVar = ansjVar.e;
                        int i = ansjVar.a;
                        java.lang.Object obj = aprfVar.a;
                        anrm anrmVar = (anrt) ((aigf) ((defpackage.apjb) obj).a).getOrDefault(str, ((defpackage.apjb) obj).b);
                        if (anrmVar instanceof anrm) {
                            ajcqVarY = anrmVar.b(i);
                        } else {
                            try {
                                ajcqVarY = aiql.z(anrmVar.a(i));
                            } catch (java.lang.Exception e) {
                                ajcqVarY = aiql.y(e);
                            }
                        }
                        ajddVar.q(ajcqVarY);
                    } catch (java.lang.Exception e2) {
                        ajddVar.p(e2);
                    }
                }
                aiql.I(ajddVar, new defpackage.ansi(ansjVar, anpkVarF, str, ajddVar), ajbm.a);
                ajcqVarA = aiql.A(ajddVar);
            }
        }
        if (!ajcqVarA.isDone()) {
            java.util.concurrent.Executor executor = ansjVar.c;
            defpackage.antq antqVar = new defpackage.antq();
            aiql.I(ajcqVarA, new defpackage.ansg(this, anqlVar, antqVar, anphVar, anqmVar), executor);
            return antqVar;
        }
        try {
            anqwVarB = (anqw) aiql.H(ajcqVarA);
        } catch (java.util.concurrent.CancellationException e3) {
            anqwVarB = b(e3);
        } catch (java.util.concurrent.ExecutionException e4) {
            anqwVarB = b(e4.getCause());
        }
        if (anqwVarB.h()) {
            return anqmVar.a(anqlVar, anphVar);
        }
        anqlVar.a(anqwVarB, new anph());
        return new defpackage.antw(this);
    }
}
