package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apbh {
    public static final defpackage.apcm a = new defpackage.apcm("CLOSED");

    public static final java.lang.Object a(defpackage.apbi apbiVar, long j, defpackage.aonn aonnVar) {
        while (true) {
            long j2 = apbiVar.b;
            if (j2 >= j && !apbiVar.t()) {
                return apbiVar;
            }
            java.lang.Object objL = apbiVar.l();
            defpackage.apcm apcmVar = a;
            if (objL == apcmVar) {
                return apcmVar;
            }
            defpackage.apbi apbiVar2 = (defpackage.apbi) objL;
            if (apbiVar2 != null) {
                apbiVar = apbiVar2;
            } else {
                defpackage.apbi apbiVar3 = (defpackage.apbi) aonnVar.a(java.lang.Long.valueOf(j2 + 1), apbiVar);
                if (apbiVar.a.d(null, apbiVar3)) {
                    if (apbiVar.t()) {
                        apbiVar.p();
                    }
                    apbiVar = apbiVar3;
                }
            }
        }
    }
}
