package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aexl implements defpackage.aexi {
    private final defpackage.aata a;

    public aexl(defpackage.aata aataVar) {
        this.a = aataVar;
    }

    private static defpackage.ajcq l(defpackage.aaum aaumVar) {
        defpackage.ajcq ajcqVarE = defpackage.aazc.e(aaumVar);
        defpackage.uqd uqdVar = new defpackage.uqd(9);
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        int i = defpackage.aizu.d;
        defpackage.aizs aizsVar = new defpackage.aizs(ajcqVarE, defpackage.aacw.class, uqdVar);
        ajcqVarE.c(aizsVar, defpackage.aiql.t(ajbmVar, aizsVar));
        return aizsVar;
    }

    @Override // defpackage.aexi
    public final defpackage.ajcq a(defpackage.ajsy... ajsyVarArr) {
        defpackage.ahvr.ci(ajsyVarArr);
        com.google.android.gms.phenotype.RegistrationInfo[] registrationInfoArr = new com.google.android.gms.phenotype.RegistrationInfo[ajsyVarArr.length];
        for (int i = 0; i < ajsyVarArr.length; i++) {
            defpackage.ajsy ajsyVar = ajsyVarArr[i];
            int[] iArr = new int[ajsyVar.j.size()];
            for (int i2 = 0; i2 < ajsyVar.j.size(); i2++) {
                iArr[i2] = ajsyVar.j.e(i2);
            }
            java.lang.String str = ajsyVar.g;
            int iIntValue = ajsyVar.c == 2 ? ((java.lang.Integer) ajsyVar.d).intValue() : 0;
            java.lang.String[] strArr = (java.lang.String[]) ajsyVar.i.toArray(new java.lang.String[0]);
            byte[] bArrD = ajsyVar.k.D();
            boolean z = ajsyVar.l;
            java.lang.String str2 = ajsyVar.e == 7 ? (java.lang.String) ajsyVar.f : "";
            byte[] bArr = com.google.android.gms.phenotype.RegistrationInfo.a;
            defpackage.ajsw ajswVarB = defpackage.ajsw.b(ajsyVar.p);
            if (ajswVarB == null) {
                ajswVarB = defpackage.ajsw.UNKNOWN;
            }
            registrationInfoArr[i] = new com.google.android.gms.phenotype.RegistrationInfo(str, iIntValue, strArr, bArrD, z, iArr, str2, bArr, 1, ajswVarB.h);
        }
        return l(this.a.a(registrationInfoArr));
    }

    @Override // defpackage.aexi
    public final defpackage.ajcq b(java.lang.String str) {
        defpackage.ahvr.ci(str);
        return l(this.a.b(str));
    }

    @Override // defpackage.aexi
    public final defpackage.ajcq c(final defpackage.aexf aexfVar) {
        final defpackage.aata aataVar = this.a;
        return l(aataVar.c(aexfVar).c(defpackage.ajbm.INSTANCE, new defpackage.aaua() { // from class: aasy
            /* JADX WARN: Code duplicated, block: B:22:0x0044  */
            /* JADX WARN: Code duplicated, block: B:24:0x004f  */
            /* JADX WARN: Code duplicated, block: B:34:0x0063 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:35:0x0051 A[SYNTHETIC] */
            @Override // defpackage.aaua
            public final java.lang.Object a(defpackage.aaum aaumVar) {
                defpackage.aacw aacwVar;
                java.lang.Exception excF = aaumVar.f();
                if (excF == null) {
                    return aaumVar;
                }
                j$.util.Objects.requireNonNull(excF);
                int i = 0;
                while (true) {
                    defpackage.aexf aexfVar2 = aexfVar;
                    defpackage.aata aataVar2 = aataVar;
                    j$.util.Objects.checkIndex(i, 4);
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                return aaumVar;
                            }
                        }
                        if (excF instanceof defpackage.aacw) {
                            return aaumVar;
                        }
                        aacwVar = (defpackage.aacw) excF;
                        if (aacwVar.a() != 17) {
                            com.google.android.gms.common.ConnectionResult connectionResult = aacwVar.a.i;
                            return (connectionResult == null || connectionResult.c != 26) ? aaumVar : aataVar2.b(aexfVar2.c);
                        }
                        i = 3;
                    } else if (excF instanceof defpackage.aado) {
                        return aataVar2.b(aexfVar2.c);
                    }
                    if (excF instanceof defpackage.aacw) {
                        if (((defpackage.aacw) excF).a() == 29514) {
                            return aataVar2.b(aexfVar2.c);
                        }
                        i = 2;
                    } else {
                        if (excF instanceof defpackage.aacw) {
                            return aaumVar;
                        }
                        aacwVar = (defpackage.aacw) excF;
                        if (aacwVar.a() != 17) {
                            com.google.android.gms.common.ConnectionResult connectionResult2 = aacwVar.a.i;
                            if (connectionResult2 == null) {
                                return aaumVar;
                            }
                        }
                        i = 3;
                    }
                }
            }
        }));
    }

    @Override // defpackage.aexi
    public final defpackage.ajcq d(java.lang.String str, java.lang.String str2) {
        defpackage.ahvr.ci(str);
        defpackage.ahvr.ci(str2);
        return l(this.a.d(str, str2, null).b(defpackage.ajbm.INSTANCE, new defpackage.aexk()));
    }

    @Override // defpackage.aexi
    public final defpackage.ajcq e() {
        return l(this.a.e());
    }

    @Override // defpackage.aexi
    public final defpackage.ajcq f(java.lang.String str, int i, java.lang.String[] strArr, byte[] bArr) {
        defpackage.ahvr.ci(str);
        defpackage.ahvr.ci(strArr);
        return l(this.a.n(str, i, strArr, bArr));
    }

    @Override // defpackage.aexi
    public final defpackage.ajcq g(java.lang.String str, defpackage.ajsx ajsxVar) {
        return l(this.a.o(str, ajsxVar));
    }

    @Override // defpackage.aexi
    public final defpackage.ajcq h(java.lang.String str, defpackage.ajsx ajsxVar, byte[] bArr) {
        defpackage.aata aataVar = this.a;
        return l(aataVar.o(str, ajsxVar).c(defpackage.ajbm.INSTANCE, new aass(aataVar, str, bArr)));
    }

    @Override // defpackage.aexi
    public final boolean i() {
        return this.a.p(12200000);
    }

    @Override // defpackage.aexi
    public final defpackage.ajcq j(defpackage.aezh aezhVar) {
        java.lang.String str;
        java.lang.String simpleName = defpackage.aatg.class.getSimpleName();
        defpackage.aata aataVar = this.a;
        defpackage.aafe aafeVarV = aataVar.v(aezhVar, simpleName);
        java.lang.String strA = defpackage.aair.a();
        if (strA == null) {
            str = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            str = strA + '|' + java.lang.System.identityHashCode(defpackage.aatg.class);
        }
        defpackage.aast aastVar = new defpackage.aast(aataVar, str, aafeVarV, 0);
        defpackage.aasu aasuVar = new defpackage.aasu(0);
        defpackage.aafl aaflVar = new defpackage.aafl();
        aaflVar.c = aafeVarV;
        aaflVar.a = aastVar;
        aaflVar.b = aasuVar;
        aaflVar.d = new com.google.android.gms.common.Feature[]{defpackage.aasp.d};
        aaflVar.e = false;
        return l(aataVar.l(aaflVar.a()));
    }

    @Override // defpackage.aexi
    public final defpackage.ajcq k(java.lang.String str) {
        return l(this.a.t(str).b(defpackage.ajbm.INSTANCE, new defpackage.aexk()));
    }
}
