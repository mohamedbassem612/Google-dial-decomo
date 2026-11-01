package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class adle implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;

    public /* synthetic */ adle(acyu acyuVar, defpackage.acwb acwbVar, defpackage.acvu acvuVar, defpackage.acvr acvrVar, defpackage.acwe acweVar, defpackage.acvw acvwVar, int i) {
        this.$cid = i;
        this.a = acyuVar;
        this.f = acwbVar;
        this.c = acvuVar;
        this.b = acvrVar;
        this.d = acweVar;
        this.e = acvwVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0177 A[Catch: RuntimeException -> 0x0221, TryCatch #0 {RuntimeException -> 0x0221, blocks: (B:13:0x00d5, B:15:0x00fa, B:16:0x00fc, B:19:0x0116, B:20:0x012d, B:23:0x0141, B:25:0x015a, B:27:0x0165, B:29:0x017b, B:28:0x0177), top: B:35:0x00d5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [acxa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a(java.lang.Object obj) {
        ajcq ajcqVarZ;
        java.lang.Object obj2;
        ajcq ajcqVarD;
        int i = this.$cid;
        if (i == 0) {
            java.lang.String str = ((adhb) this.c).b;
            adhl.a();
            ((adhh) ((ajxw) this.d).a).a();
            ((gat) this.a).r((adhw) this.b, (adhw) this.e, (com.google.android.libraries.micore.superpacks.common.PackManifest) this.f);
            return aiql.z((java.lang.Object) null);
        }
        if (i != 1) {
            ajxw ajxwVar = (ajxw) this.d;
            java.lang.Object obj3 = ajxwVar.b;
            java.lang.Object obj4 = this.c;
            java.lang.Object obj5 = this.b;
            gat gatVar = (gat) this.a;
            adjz adjzVar = (adjz) gatVar.e;
            adhw adhwVar = (adhw) obj5;
            final java.io.File fileE = adjzVar.e(adhwVar);
            adhw adhwVar2 = (adhw) obj4;
            final java.io.File fileE2 = adjzVar.e(adhwVar2);
            adld adldVar = (adld) obj3;
            admd admdVarF = adldVar.f();
            ahvr.ci(admdVarF);
            final java.lang.String str2 = adldVar.b().b;
            aiof aiofVar = adhn.c;
            adik.d(fileE);
            adik.d(fileE2);
            agab.cl(admdVarF);
            final com.google.android.libraries.micore.superpacks.common.PackManifest packManifestF = adldVar.d().f();
            adhb adhbVarP = packManifestF.p();
            java.lang.String str3 = adhbVarP.b;
            adhl.a();
            ahvr.ci(str2);
            aiof aiofVar2 = adhn.a;
            adik.d(fileE);
            adik.d(fileE2);
            if (!admd.f(str2)) {
                throw new java.lang.IllegalArgumentException("Scheme not supported: ".concat(str2));
            }
            java.lang.Object obj6 = this.e;
            java.lang.Object obj7 = this.f;
            ajcq ajcqVarAh = admdVarF.a.ah(packManifestF.p(), new adih() { // from class: adly
                public final java.lang.Object a(adhh adhhVar) throws java.io.IOException {
                    aisj aisjVar;
                    defpackage.admc admbVar;
                    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(fileE);
                    java.lang.String str4 = str2;
                    java.io.File file = fileE2;
                    com.google.android.libraries.micore.superpacks.common.PackManifest packManifest = packManifestF;
                    try {
                        aisj bufferedInputStream = new java.io.BufferedInputStream(fileInputStream);
                        try {
                            java.lang.Object obj8 = packManifest.o().b.get("padding_bytes");
                            int iIntValue = 0;
                            if (obj8 != null) {
                                try {
                                    iIntValue = ((java.lang.Integer) obj8).intValue();
                                } catch (java.lang.ClassCastException e) {
                                    adhv.c("padding_bytes", "Integer", e);
                                }
                            }
                            if (iIntValue == 0) {
                                aisjVar = bufferedInputStream;
                            } else {
                                long jC = packManifest.c() - ((long) iIntValue);
                                int i2 = aisk.a;
                                aisjVar = new aisj(bufferedInputStream, jC);
                            }
                            try {
                                java.util.Set set = (java.util.Set) packManifest.o().a("slice_prefixes_to_keep");
                                ahyr adbmVar = set == null ? ahyr.a : new adbm(set, 2);
                                int iHashCode = str4.hashCode();
                                if (iHashCode == -281254653) {
                                    if (str4.equals("zip_zip")) {
                                        admbVar = new defpackage.admb(new defpackage.adma());
                                        admd.e(aisjVar, file, admbVar, adhhVar, adbmVar);
                                        aisjVar.close();
                                        bufferedInputStream.close();
                                        fileInputStream.close();
                                        return null;
                                    }
                                    throw new java.lang.IllegalArgumentException("Unsupported scheme.");
                                }
                                if (iHashCode == 120609 && str4.equals("zip")) {
                                    admbVar = new defpackage.adma();
                                    admd.e(aisjVar, file, admbVar, adhhVar, adbmVar);
                                    aisjVar.close();
                                    bufferedInputStream.close();
                                    fileInputStream.close();
                                    return null;
                                }
                                throw new java.lang.IllegalArgumentException("Unsupported scheme.");
                            } catch (java.lang.Throwable th) {
                                try {
                                    aisjVar.close();
                                } catch (java.lang.Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (java.lang.Throwable th3) {
                            try {
                                bufferedInputStream.close();
                            } catch (java.lang.Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (java.lang.Throwable th5) {
                        try {
                            fileInputStream.close();
                        } catch (java.lang.Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
            });
            defpackage.acyj acyjVar = new defpackage.acyj(gatVar, adhwVar, (adhw) adhbVarP, packManifestF, 13);
            ?? r9 = gatVar.d;
            return ajan.g(aiql.A(ajan.g(aizu.g(ajcqVarAh, java.lang.Throwable.class, acyjVar, (java.util.concurrent.Executor) r9), new defpackage.adle(gatVar, adhwVar, (adhw) adhbVarP, ajxwVar, adhwVar2, packManifestF, 0), (java.util.concurrent.Executor) r9)), new defpackage.acyf(gatVar, ajxwVar, (com.google.android.libraries.micore.superpacks.common.PackManifest) obj7, adhwVar2, (adhw) obj6, 9), (java.util.concurrent.Executor) r9);
        }
        java.lang.Object obj8 = this.a;
        java.lang.Object obj9 = this.f;
        java.lang.Object obj10 = this.c;
        java.lang.Object obj11 = this.b;
        java.lang.Object obj12 = this.e;
        try {
            final adlt adltVar = ((acyu) obj8).j;
            final int i2 = ((defpackage.acvu) obj10).f;
            final long j = ((defpackage.acvu) obj10).s;
            final java.lang.String str4 = ((defpackage.acvu) obj10).t;
            final int i3 = ((defpackage.acvu) obj10).p;
            final alat alatVar = ((defpackage.acvu) obj10).q;
            akyp akypVar = ((defpackage.acvu) obj10).i;
            if (akypVar == null) {
                akypVar = akyp.a;
            }
            final akyp akypVar2 = akypVar;
            java.lang.String str5 = ((defpackage.acvr) obj11).d;
            int i4 = adbe.a;
            boolean zStartsWith = ((defpackage.acvr) obj11).d.startsWith("inlinefile");
            java.lang.Object obj13 = this.d;
            if (zStartsWith) {
                yg ygVarB = acvh.b();
                ygVarB.b = defpackage.acvg.INVALID_INLINE_FILE_URL_SCHEME;
                ygVarB.d = "downloading a file with an inlinefile scheme is not supported, use importFiles instead.";
                ajcqVarD = aiql.y(ygVarB.d());
                obj2 = obj13;
            } else {
                final ajcq ajcqVarK = adltVar.k((defpackage.acwe) obj13);
                int iAQ = a.aQ(((defpackage.acwe) obj13).f);
                if (iAQ == 0) {
                    iAQ = 1;
                }
                if (afsq.aC((android.content.Context) adltVar.l, (acxa) adltVar.d).d >= defpackage.aczc.USE_CHECKSUM_ONLY.d) {
                    java.lang.Object obj14 = adltVar.k;
                    if (((ahyn) obj14).f()) {
                        ajcqVarZ = adltVar.m(((defpackage.acvr) obj11).l, 0, iAQ);
                    } else {
                        ajcqVarZ = aiql.z((java.lang.Object) null);
                    }
                } else {
                    ajcqVarZ = aiql.z((java.lang.Object) null);
                }
                defpackage.vaa vaaVarAe = abrz.ae(new ajcq[]{ajcqVarK, ajcqVarZ});
                final ajcq ajcqVar = ajcqVarZ;
                defpackage.wwx wwxVar = new defpackage.wwx((java.lang.Object) ajcqVarK, (java.lang.Object) ajcqVar, obj11, 8, (char[]) null);
                java.util.concurrent.Executor executor = ajbm.a;
                final ajcq ajcqVarD2 = vaaVarAe.D(wwxVar, executor);
                obj2 = obj13;
                defpackage.aczq aczqVar = new defpackage.aczq(adltVar, obj2, obj11, 4, (int[]) null);
                ?? r10 = adltVar.h;
                final ajcq ajcqVarI = ahvr.I(ajcqVarD2, aczqVar, (java.util.concurrent.Executor) r10);
                final defpackage.acwe acweVar = (defpackage.acwe) obj2;
                final defpackage.acvw acvwVar = (defpackage.acvw) obj12;
                final defpackage.acvr acvrVar = (defpackage.acvr) obj11;
                final defpackage.acwb acwbVar = (defpackage.acwb) obj9;
                ajcqVarD = defpackage.adcs.e(abrz.ae(new ajcq[]{ajcqVarK, ajcqVar, ajcqVarD2, ajcqVarI}).E(new defpackage.wok(2), executor)).g(new ajat() { // from class: aczs
                    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, java.util.concurrent.Executor] */
                    public final ajcq a(java.lang.Object obj15) {
                        defpackage.acwg acwgVar = (defpackage.acwg) aiql.H(ajcqVarK);
                        final defpackage.acvv acvvVar = (defpackage.acvv) aiql.H(ajcqVar);
                        final java.lang.String str6 = (java.lang.String) aiql.H(ajcqVarD2);
                        final android.net.Uri uri = (android.net.Uri) aiql.H(ajcqVarI);
                        int i5 = acwgVar.d;
                        final defpackage.acvr acvrVar2 = acvrVar;
                        java.lang.String str7 = acvrVar2.d;
                        int i6 = adbe.a;
                        int i7 = acwgVar.d;
                        defpackage.acwa acwaVarB = defpackage.acwa.b(i7);
                        if (acwaVarB == null) {
                            acwaVarB = defpackage.acwa.NONE;
                        }
                        final defpackage.acwb acwbVar2 = acwbVar;
                        final adlt adltVar2 = adltVar;
                        if (acwaVarB == defpackage.acwa.DOWNLOAD_COMPLETE) {
                            ahyn ahynVar = (ahyn) adltVar2.a;
                            if (ahynVar.f()) {
                                adce adceVar = (adce) ahynVar.b();
                                java.lang.String str8 = acwbVar2.c;
                                long j2 = acvrVar2.j;
                                if (j2 <= 0) {
                                    j2 = acvrVar2.e;
                                }
                                adceVar.g(str8, j2);
                            }
                            return ajcm.a;
                        }
                        defpackage.acwa acwaVarB2 = defpackage.acwa.b(i7);
                        if (acwaVarB2 == null) {
                            acwaVarB2 = defpackage.acwa.NONE;
                        }
                        final akyp akypVar3 = akypVar2;
                        final java.util.List list = alatVar;
                        final int i8 = i3;
                        final defpackage.acvw acvwVar2 = acvwVar;
                        final java.lang.String str9 = str4;
                        final long j3 = j;
                        final int i9 = i2;
                        final defpackage.acwe acweVar2 = acweVar;
                        if (acwaVarB2 != defpackage.acwa.DOWNLOAD_IN_PROGRESS) {
                            return adltVar2.h(acweVar2, str6, i9, j3, str9, acwbVar2, acvrVar2, acvvVar, acvwVar2, i8, list, akypVar3);
                        }
                        return ahvr.I(((adax) adltVar2.f).a(acweVar2.e, uri), new ajat() { // from class: aczu
                            public final ajcq a(java.lang.Object obj16) {
                                ahyn ahynVar2 = (ahyn) obj16;
                                boolean zF = ahynVar2.f();
                                adlt adltVar3 = adltVar2;
                                defpackage.acwb acwbVar3 = acwbVar2;
                                if (zF) {
                                    adltVar3.l(acwbVar3, uri);
                                    return (ajcq) ahynVar2.b();
                                }
                                akyp akypVar4 = akypVar3;
                                java.util.List list2 = list;
                                int i10 = i8;
                                defpackage.acvw acvwVar3 = acvwVar2;
                                defpackage.acvv acvvVar2 = acvvVar;
                                defpackage.acvr acvrVar3 = acvrVar2;
                                java.lang.String str10 = str9;
                                long j4 = j3;
                                int i11 = i9;
                                return adltVar3.h(acweVar2, str6, i11, j4, str10, acwbVar3, acvrVar3, acvvVar2, acvwVar3, i10, list2, akypVar4);
                            }
                        }, (java.util.concurrent.Executor) adltVar2.h);
                    }
                }, r10).d(defpackage.aczv.class, new defpackage.acze(adltVar, obj2, 10, null), r10);
            }
            acyu acyuVar = (acyu) obj8;
            return acyuVar.q(ajcqVarD, new jsc(acyuVar, (defpackage.acvu) obj10, (defpackage.acvr) obj11, (defpackage.acwe) obj2, 19));
        } catch (java.lang.RuntimeException e) {
            yg ygVarB2 = acvh.b();
            ygVarB2.b = defpackage.acvg.UNKNOWN_ERROR;
            ygVarB2.c = e;
            return aiql.y(ygVarB2.d());
        }
    }

    public /* synthetic */ adle(gat gatVar, adhw adhwVar, adhw adhwVar2, ajxw ajxwVar, adhw adhwVar3, com.google.android.libraries.micore.superpacks.common.PackManifest packManifest, int i) {
        this.$cid = i;
        this.a = gatVar;
        this.b = adhwVar;
        this.c = adhwVar2;
        this.d = ajxwVar;
        this.e = adhwVar3;
        this.f = packManifest;
    }

    public /* synthetic */ adle(gat gatVar, adhw adhwVar, adhw adhwVar2, ajxw ajxwVar, com.google.android.libraries.micore.superpacks.common.PackManifest packManifest, adhw adhwVar3, int i) {
        this.$cid = i;
        this.a = gatVar;
        this.b = adhwVar;
        this.c = adhwVar2;
        this.d = ajxwVar;
        this.f = packManifest;
        this.e = adhwVar3;
    }
}
