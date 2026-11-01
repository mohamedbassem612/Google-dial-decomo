package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amdb {
    private static final aigf b = aigf.n(alrb.b, "music", alrb.c, "speech", alrb.e, "silence", alrb.d, "telephony");
    public alrb a = alrb.a;
    private final defpackage.amaj c;

    public amdb(defpackage.amaj amajVar) {
        this.c = amajVar;
    }

    public final boolean a(alra alraVar, alrb alrbVar) {
        defpackage.amak amakVar = this.c.e;
        if (amakVar == null) {
            amakVar = defpackage.amak.a;
        }
        java.lang.String str = (java.lang.String) b.getOrDefault(alrbVar, "unknown");
        j$.util.Objects.requireNonNull(str);
        java.lang.Float f = (java.lang.Float) amakVar.d.get(str);
        float fFloatValue = f != null ? f.floatValue() : Float.POSITIVE_INFINITY;
        alrb alrbVarB = alrb.b(alraVar.c);
        if (alrbVarB == null) {
            alrbVarB = alrb.a;
        }
        return alrbVarB == alrbVar && alraVar.d >= ((double) fFloatValue);
    }
}
