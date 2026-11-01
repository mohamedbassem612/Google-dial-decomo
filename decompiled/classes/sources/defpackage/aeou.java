package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeou extends defpackage.aipo {
    private final defpackage.adai a;

    public aeou(defpackage.adai adaiVar) {
        super("");
        this.a = adaiVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    @Override // defpackage.aion
    public final void a(defpackage.aiom aiomVar) {
        defpackage.aeor aeorVar;
        defpackage.aeos aeosVar;
        int i;
        java.lang.Long l;
        java.lang.Boolean bool = (java.lang.Boolean) aiomVar.n().d(defpackage.aeoq.a);
        if (bool == null || !bool.booleanValue()) {
            aeorVar = null;
        } else {
            defpackage.aipn aipnVarO = aiomVar.o();
            java.lang.String string = aipnVarO == null ? aiomVar.p().toString() : aipnVarO.b;
            java.lang.String strE = aiomVar.f().e();
            if (strE == null || (l = (java.lang.Long) aiomVar.n().d(defpackage.aeoq.c)) == null) {
                aeorVar = null;
            } else {
                aeorVar = new defpackage.aeor(aiomVar.r(), string, strE, l.longValue());
            }
        }
        if (aiomVar.o() == null) {
            aeosVar = new defpackage.aeos(aiomVar.f().b(), aiomVar.f().d(), aiomVar.f().a(), aiomVar.e(), aeorVar);
        } else {
            java.lang.Object[] objArrV = aiomVar.V();
            int i2 = 0;
            for (java.lang.Object obj : objArrV) {
                if (defpackage.aeos.a(obj)) {
                    i2++;
                }
            }
            if (i2 == 0) {
                aeosVar = new defpackage.aeos(aiomVar.f().b(), aiomVar.f().d(), aiomVar.f().a(), aiomVar.e(), aeorVar);
            } else {
                int[] iArr = new int[i2];
                java.lang.String[] strArr = new java.lang.String[i2];
                int i3 = 0;
                for (int i4 = 0; i4 < objArrV.length; i4++) {
                    java.lang.Object obj2 = objArrV[i4];
                    if (defpackage.aeos.a(obj2)) {
                        iArr[i3] = i4;
                        strArr[i3] = obj2 == null ? "null" : ((defpackage.aepe) obj2).b();
                        i3++;
                    }
                }
                aeosVar = new defpackage.aeos(aiomVar.f().b(), aiomVar.f().d(), aiomVar.f().a(), aiomVar.e(), iArr, strArr, aeorVar);
            }
        }
        defpackage.aeoz aeozVar = (defpackage.aeoz) ((java.lang.ThreadLocal) this.a.b).get();
        int i5 = aeozVar.b;
        aeozVar.a.set(i5 % 20, aeosVar);
        if (i5 == Integer.MAX_VALUE) {
            int i6 = aeozVar.d;
            i = 28;
        } else {
            i = i5 + 1;
        }
        aeozVar.b = i;
        aeozVar.c = i;
    }

    @Override // defpackage.aion
    public final boolean b(java.util.logging.Level level) {
        return true;
    }

    @Override // defpackage.aipo, defpackage.aion
    public final void c(java.lang.RuntimeException runtimeException, defpackage.aiom aiomVar) {
        android.util.Log.e("PrimesFloggerBackend", "Internal logging error", runtimeException);
    }
}
