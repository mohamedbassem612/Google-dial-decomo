package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apbo {
    public static final defpackage.apcm a = new defpackage.apcm("UNDEFINED");
    public static final defpackage.apcm b = new defpackage.apcm("REUSABLE_CLAIMED");

    public static final void a(defpackage.aoln aolnVar, java.lang.Object obj) throws defpackage.aotd {
        if (!(aolnVar instanceof defpackage.apbn)) {
            aolnVar.w(obj);
            return;
        }
        defpackage.apbn apbnVar = (defpackage.apbn) aolnVar;
        java.lang.Object objV = defpackage.aosv.v(obj);
        defpackage.aosp aospVar = apbnVar.a;
        defpackage.aolr aolrVarU = apbnVar.u();
        try {
            boolean zDB = aospVar.dB(aolrVarU);
            if (zDB) {
                apbnVar.c = objV;
                apbnVar.e = 1;
                defpackage.aosp aospVar2 = apbnVar.a;
                defpackage.aolr aolrVarU2 = apbnVar.u();
                try {
                    aospVar2.a(aolrVarU2, apbnVar);
                    return;
                } catch (java.lang.Throwable th) {
                    throw new defpackage.aotd(th, aospVar2, aolrVarU2);
                }
            }
            boolean z = defpackage.aosu.a;
            java.lang.ThreadLocal threadLocal = defpackage.aovj.a;
            defpackage.aotm aotmVarA = defpackage.aovj.a();
            if (aotmVarA.q()) {
                apbnVar.c = objV;
                apbnVar.e = 1;
                aotmVarA.o(apbnVar);
                return;
            }
            aotmVarA.p(true);
            try {
                defpackage.aoub aoubVar = (defpackage.aoub) apbnVar.u().get(defpackage.aoub.d);
                if (aoubVar == null || aoubVar.t()) {
                    defpackage.aoln aolnVar2 = apbnVar.b;
                    java.lang.Object obj2 = apbnVar.d;
                    defpackage.aolr aolrVarU3 = aolnVar2.u();
                    java.lang.Object objB = defpackage.apcp.b(aolrVarU3, obj2);
                    defpackage.aovo aovoVarC = objB != defpackage.apcp.a ? defpackage.aosn.c(aolnVar2, aolrVarU3, objB) : null;
                    try {
                        aolnVar2.w(obj);
                        if (aovoVarC == null || aovoVarC.X()) {
                            defpackage.apcp.c(aolrVarU3, objB);
                        }
                    } catch (java.lang.Throwable th2) {
                        if (aovoVarC == null || aovoVarC.X()) {
                            defpackage.apcp.c(aolrVarU3, objB);
                        }
                        throw th2;
                    }
                } else {
                    apbnVar.w(new defpackage.aoiv(aoubVar.o()));
                }
                while (aotmVarA.s()) {
                }
            } catch (java.lang.Throwable th3) {
                try {
                    apbnVar.H(th3);
                } finally {
                    aotmVarA.n(true);
                }
            }
        } catch (java.lang.Throwable th4) {
            throw new defpackage.aotd(th4, aospVar, aolrVarU);
        }
    }

    public static final void b(defpackage.aosp aospVar, defpackage.aolr aolrVar, java.lang.Runnable runnable) throws defpackage.aotd {
        try {
            aospVar.a(aolrVar, runnable);
        } catch (java.lang.Throwable th) {
            throw new defpackage.aotd(th, aospVar, aolrVar);
        }
    }

    public static final boolean c(defpackage.aosp aospVar, defpackage.aolr aolrVar) throws defpackage.aotd {
        try {
            return aospVar.dB(aolrVar);
        } catch (java.lang.Throwable th) {
            throw new defpackage.aotd(th, aospVar, aolrVar);
        }
    }
}
