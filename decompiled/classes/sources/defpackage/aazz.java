package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aazz {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/libraries/abuse/hades/download/fetcher/PersephoneGrpcManifestConfigFetcher");
    public final android.content.Context b;
    public final j$.util.Optional c;
    private final defpackage.aazm d;
    private final j$.util.Optional e;
    private final defpackage.ajct f;
    private final j$.util.Optional g;
    private final j$.util.Optional h;
    private final defpackage.aazv i;

    public aazz(android.content.Context context, defpackage.aazv aazvVar, defpackage.aazm aazmVar, j$.util.Optional optional, j$.util.Optional optional2, defpackage.ajct ajctVar, j$.util.Optional optional3, j$.util.Optional optional4) {
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(aazmVar, "encHelper");
        defpackage.aooh.f(optional, "integrityCheck");
        defpackage.aooh.f(optional2, "compression");
        defpackage.aooh.f(ajctVar, "blockingExecutor");
        defpackage.aooh.f(optional3, "bypassTokenProvider");
        defpackage.aooh.f(optional4, "deduplicatorFactory");
        this.b = context;
        this.i = aazvVar;
        this.d = aazmVar;
        this.c = optional;
        this.e = optional2;
        this.f = ajctVar;
        this.g = optional3;
        this.h = optional4;
    }

    public static final void c(java.lang.Exception exc, java.util.Map map) throws defpackage.acvh {
        acvg acvgVar;
        defpackage.anqw anqwVarD = defpackage.anqw.d(exc);
        ((defpackage.aimw) a.d().l("com/google/android/libraries/abuse/hades/download/fetcher/PersephoneGrpcManifestConfigFetcher", "handleGrpcException", 121, "PersephoneGrpcManifestConfigFetcher.kt")).I("Request to download Manifest config failed: %s for request with labels: %s", exc, map);
        int iOrdinal = anqwVarD.o.ordinal();
        if (iOrdinal == 1) {
            acvgVar = acvg.ak;
        } else if (iOrdinal == 5) {
            acvgVar = acvg.al;
        } else if (iOrdinal != 7) {
            acvgVar = iOrdinal != 14 ? acvg.aj : acvg.an;
        } else {
            acvgVar = acvg.am;
        }
        yg ygVarB = defpackage.acvh.b();
        ygVarB.b = acvgVar;
        ygVarB.d = "Request to download Manifest config failed: ".concat(java.lang.String.valueOf(exc.getMessage()));
        ygVarB.c = exc;
        throw ygVarB.d();
    }

    /* JADX WARN: Code duplicated, block: B:113:0x033b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0351  */
    /* JADX WARN: Code duplicated, block: B:117:0x0367  */
    /* JADX WARN: Code duplicated, block: B:120:0x0409  */
    /* JADX WARN: Code duplicated, block: B:123:0x0426  */
    /* JADX WARN: Code duplicated, block: B:126:0x042c  */
    /* JADX WARN: Code duplicated, block: B:135:0x046c  */
    /* JADX WARN: Code duplicated, block: B:137:0x047d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0124  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0489, code lost:
    
        if (r0.a() != r9) goto L139;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.aazd r24, java.util.Map r25, defpackage.aoln r26) throws java.security.GeneralSecurityException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aazz.a(aazd, java.util.Map, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0114  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v4, types: [aoin, java.lang.Object] */
    public final java.lang.Object b(akkw akkwVar, defpackage.akzc akzcVar, defpackage.aazd aazdVar, defpackage.aoln aolnVar) {
        aazy aazyVar;
        java.lang.Exception exc;
        defpackage.akzc akzcVar2;
        defpackage.aazz aazzVar;
        ajyi ajyiVarG;
        if (aolnVar instanceof aazy) {
            aazyVar = (aazy) aolnVar;
            int i = aazyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aazyVar.c = i - Integer.MIN_VALUE;
            } else {
                aazyVar = new aazy(this, aolnVar);
            }
        } else {
            aazyVar = new aazy(this, aolnVar);
        }
        java.lang.Object objAj = aazyVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aazyVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objAj);
            defpackage.apnt apntVar = (defpackage.apnt) defpackage.aooh.q(this.g);
            defpackage.akzc akzcVarJ = null;
            if (apntVar != null) {
                defpackage.aooh.f(aazdVar.b, "clientRole");
                ?? r13 = apntVar.a;
                java.lang.Object objA = r13.a();
                defpackage.aooh.e(objA, "get(...)");
                java.lang.String str = !defpackage.aoov.H((java.lang.CharSequence) objA) ? (java.lang.String) r13.a() : null;
                if (str != null) {
                    akzcVarJ = akmr.j(str);
                }
            }
            this.c.isPresent();
            try {
                defpackage.aotu aotuVar = new defpackage.aotu(this.f);
                aazzVar = this;
                zjq zjqVar = new zjq(aazzVar, akkwVar, akzcVar, (defpackage.aoln) null, 2);
                aazyVar.d = (defpackage.akza) akzcVarJ;
                aazyVar.c = 1;
                objAj = defpackage.aoov.aj(aotuVar, zjqVar, aazyVar);
                if (objAj == aoluVar) {
                    return aoluVar;
                }
                akzcVar2 = akzcVarJ;
            } catch (java.lang.Exception e) {
                exc = e;
                akzcVar2 = akzcVarJ;
                ((defpackage.aimw) ((defpackage.aimw) a.b()).k(exc).l("com/google/android/libraries/abuse/hades/download/fetcher/PersephoneGrpcManifestConfigFetcher", "getIntegrityCheck", 187, "PersephoneGrpcManifestConfigFetcher.kt")).v("Failed to get integrity check");
                ajyiVarG = akky.G(akku.a.m());
                ajyiVarG.ag(6);
                if (akzcVar2 != null) {
                    ajyiVarG.af(akzcVar2);
                }
                return ajyiVarG.ae();
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            akzcVar2 = aazyVar.d;
            try {
                defpackage.aooc.af(objAj);
                aazzVar = this;
            } catch (java.lang.Exception e2) {
                exc = e2;
                ((defpackage.aimw) ((defpackage.aimw) a.b()).k(exc).l("com/google/android/libraries/abuse/hades/download/fetcher/PersephoneGrpcManifestConfigFetcher", "getIntegrityCheck", 187, "PersephoneGrpcManifestConfigFetcher.kt")).v("Failed to get integrity check");
                ajyiVarG = akky.G(akku.a.m());
                ajyiVarG.ag(6);
                if (akzcVar2 != null) {
                    ajyiVarG.af(akzcVar2);
                }
                return ajyiVarG.ae();
            }
        }
        defpackage.akzc akzcVar3 = (defpackage.akzc) objAj;
        aazzVar.c.get();
        ajyi ajyiVarG2 = akky.G(akku.a.m());
        defpackage.aooh.f(akzcVar3, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) ajyiVarG2.a;
        akzxVar.u();
        akku akkuVar = akzxVar.b;
        j$.util.Objects.requireNonNull(akzcVar3);
        akkuVar.b = akzcVar3;
        defpackage.akzc akzcVar4 = defpackage.akzc.d;
        defpackage.aooh.e(akzcVar4, "EMPTY");
        defpackage.aooh.f(akzcVar4, "value");
        akzxVar.u();
        akku akkuVar2 = akzxVar.b;
        j$.util.Objects.requireNonNull(akzcVar4);
        akkuVar2.c = akzcVar4;
        ajyiVarG2.ag(true != akzcVar3.C() ? 3 : 5);
        if (akzcVar2 != null) {
            ajyiVarG2.af(akzcVar2);
        }
        return ajyiVarG2.ae();
    }
}
