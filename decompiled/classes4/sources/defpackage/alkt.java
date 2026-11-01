package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alkt {
    private static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/IntentExtractionUtils");

    public static aify a(defpackage.allf allfVar, java.lang.String str) {
        return (aify) allfVar.b.getOrDefault(str, aike.a);
    }

    public static aify b(defpackage.allf allfVar, java.lang.String str) {
        return (aify) allfVar.a.getOrDefault(str, aike.a);
    }

    public static aitt c(defpackage.allf allfVar, java.lang.String str, java.lang.String str2) {
        return aitt.n(a(allfVar, str), b(allfVar, str2));
    }

    public static j$.util.Optional d(int i, java.util.List list, java.util.List list2) {
        try {
            return j$.util.Optional.of((java.lang.String) list.get(((java.lang.Integer) list2.get(i)).intValue()));
        } catch (java.lang.IndexOutOfBoundsException unused) {
            a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/IntentExtractionUtils", "getLabelForToken", 103, "IntentExtractionUtils.java").v("Model output for per token predictions is invalid.");
            return j$.util.Optional.empty();
        }
    }

    public static java.lang.String e(defpackage.almz almzVar) {
        apdi apdiVar = defpackage.alnj.f;
        almzVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        alqu alquVar = ((defpackage.alnj) objJ).c;
        if (alquVar == null) {
            alquVar = alqu.a;
        }
        if ((alquVar.c == 1 ? (defpackage.alqm) alquVar.d : defpackage.alqm.a).b.size() > 0) {
            return ((defpackage.alqq) (alquVar.c == 1 ? (defpackage.alqm) alquVar.d : defpackage.alqm.a).b.get(0)).c.trim();
        }
        return "";
    }
}
