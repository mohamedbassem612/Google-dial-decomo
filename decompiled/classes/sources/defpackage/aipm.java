package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aipm {
    public static final defpackage.ajmk a;
    private static final java.util.Set b;

    static {
        java.util.Set setSingleton = java.util.Collections.singleton(defpackage.ainc.a);
        b = setSingleton;
        a = new defpackage.ajmk(setSingleton);
    }

    public static java.lang.String a(defpackage.aiom aiomVar) {
        return defpackage.aiop.b(aiomVar.p());
    }

    public static boolean b(defpackage.aiom aiomVar, defpackage.aipi aipiVar, java.util.Set set) {
        return (aiomVar.o() == null && aipiVar.a() <= set.size() && set.containsAll(aipiVar.c())) ? false : true;
    }

    public static void c(defpackage.aipi aipiVar, defpackage.aioy aioyVar, java.lang.StringBuilder sb) {
        defpackage.aiol aiolVar = new defpackage.aiol(sb);
        aipiVar.d(aioyVar, aiolVar);
        if (aiolVar.c) {
            aiolVar.b.append(aiolVar.a);
        }
    }
}
