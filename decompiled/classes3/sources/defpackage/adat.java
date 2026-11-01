package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adat implements defpackage.adaw {
    private final aczw a;
    private final defpackage.acvr b;
    private final java.lang.String c;
    private final adba d;
    private final defpackage.acwb e;
    private final int f;
    private final long g;
    private final java.lang.String h;
    private final acvl i;
    private final java.util.concurrent.Executor j;
    private final int k;
    private final aogc l;

    public adat(aczw aczwVar, aogc aogcVar, defpackage.acvr acvrVar, int i, adba adbaVar, defpackage.acwb acwbVar, int i2, long j, java.lang.String str, acvl acvlVar, java.util.concurrent.Executor executor) {
        this.a = aczwVar;
        this.l = aogcVar;
        this.b = acvrVar;
        this.k = i;
        this.c = afsq.ap(acvrVar);
        this.d = adbaVar;
        this.e = acwbVar;
        this.f = i2;
        this.g = j;
        this.h = str;
        this.i = acvlVar;
        this.j = executor;
    }

    public static ajcq c(defpackage.acwa acwaVar, defpackage.acvr acvrVar, int i, aczw aczwVar, java.util.concurrent.Executor executor) {
        defpackage.acwe acweVarAB = afsq.aB(acvrVar, i);
        return defpackage.adcs.e(e(aczwVar, acweVarAB, executor)).g(new defpackage.aczq(acwaVar, aczwVar, acweVarAB, 5), executor).g(new defpackage.aczi(acweVarAB, 11), executor);
    }

    static ajcq d(aczw aczwVar, defpackage.acvr acvrVar, int i, aogc aogcVar, android.net.Uri uri, java.lang.String str, adba adbaVar, acvl acvlVar, java.util.concurrent.Executor executor) {
        return defpackage.adcs.e(e(aczwVar, afsq.aB(acvrVar, i), executor)).g(new defpackage.acyf(acvlVar, str, adbaVar, aogcVar, uri, 4), executor);
    }

    private static ajcq e(aczw aczwVar, defpackage.acwe acweVar, java.util.concurrent.Executor executor) {
        return ahvr.I(aczwVar.e(acweVar), new defpackage.aczi(acweVar, 14), executor);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: acvh */
    /* JADX WARN: Code duplicated, block: B:125:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:? A[LOOP:1: B:56:0x01b9->B:126:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x014b A[Catch: IllegalArgumentException -> 0x02b1, acvh -> 0x02da, TryCatch #4 {IllegalArgumentException -> 0x02b1, blocks: (B:37:0x0141, B:39:0x014b, B:40:0x014d), top: B:109:0x0141, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x019f A[Catch: all -> 0x0286, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0286, blocks: (B:44:0x017e, B:47:0x019f, B:79:0x0285, B:78:0x0282, B:75:0x027d, B:45:0x0194), top: B:107:0x017e, inners: #0, #5 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x01a4 A[Catch: IOException -> 0x0293, acvh -> 0x02da, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x0293, blocks: (B:42:0x0171, B:49:0x01a4, B:87:0x0292, B:86:0x028f), top: B:108:0x0171, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x01ad A[Catch: IOException -> 0x0250, acvh -> 0x02da, TryCatch #6 {IOException -> 0x0250, blocks: (B:50:0x01a7, B:52:0x01ad, B:54:0x01b1, B:55:0x01b3, B:56:0x01b9, B:58:0x01bf, B:60:0x01ca, B:62:0x01d6, B:63:0x024d), top: B:113:0x01a7 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x01b1 A[Catch: IOException -> 0x0250, acvh -> 0x02da, TryCatch #6 {IOException -> 0x0250, blocks: (B:50:0x01a7, B:52:0x01ad, B:54:0x01b1, B:55:0x01b3, B:56:0x01b9, B:58:0x01bf, B:60:0x01ca, B:62:0x01d6, B:63:0x024d), top: B:113:0x01a7 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01bf A[Catch: IOException -> 0x0250, acvh -> 0x02da, TryCatch #6 {IOException -> 0x0250, blocks: (B:50:0x01a7, B:52:0x01ad, B:54:0x01b1, B:55:0x01b3, B:56:0x01b9, B:58:0x01bf, B:60:0x01ca, B:62:0x01d6, B:63:0x024d), top: B:113:0x01a7 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01d6 A[Catch: IOException -> 0x0250, acvh -> 0x02da, EDGE_INSN: B:62:0x01d6->B:63:0x024d BREAK  A[LOOP:1: B:56:0x01b9->B:126:?], TryCatch #6 {IOException -> 0x0250, blocks: (B:50:0x01a7, B:52:0x01ad, B:54:0x01b1, B:55:0x01b3, B:56:0x01b9, B:58:0x01bf, B:60:0x01ca, B:62:0x01d6, B:63:0x024d), top: B:113:0x01a7 }] */
    @Override // defpackage.adaw
    public final ajcq a(android.net.Uri uri) {
        defpackage.amlu amluVar;
        android.net.Uri uriBuild;
        adba adbaVar;
        aogc aogcVar;
        defpackage.acwb acwbVar;
        int i;
        long j;
        java.lang.String str;
        defpackage.acvr acvrVar;
        java.io.InputStream inputStream;
        java.io.OutputStream outputStream;
        int iAe;
        defpackage.amlu amluVar2;
        java.util.Iterator it;
        long jK;
        long jK2;
        int i2 = adbe.a;
        defpackage.acvr acvrVar2 = this.b;
        java.lang.String str2 = (acvrVar2.b & 32) != 0 ? acvrVar2.i : acvrVar2.g;
        try {
            aogc aogcVar2 = this.l;
            defpackage.adau.d(aogcVar2, acvrVar2, uri, str2);
            int i3 = acvrVar2.b & 32;
            if (i3 != 0 && i3 != 0) {
                android.net.Uri uriAw = afsq.aw(uri);
                if (afsq.aq(acvrVar2)) {
                    adba adbaVar2 = this.d;
                    defpackage.acwb acwbVar2 = this.e;
                    int i4 = this.f;
                    long j2 = this.g;
                    java.lang.String str3 = this.h;
                    java.lang.String str4 = acvrVar2.c;
                    try {
                        aogcVar2.M(uri, new defpackage.aday(uriAw));
                        try {
                            akzx akzxVarM = aiwm.a.m();
                            java.lang.String str5 = acwbVar2.c;
                            akzxVarM.u();
                            aiwm aiwmVar = akzxVarM.b;
                            j$.util.Objects.requireNonNull(str5);
                            aiwmVar.b |= 1;
                            aiwmVar.c = str5;
                            akzxVarM.u();
                            aiwm aiwmVar2 = akzxVarM.b;
                            aiwmVar2.b |= 2;
                            aiwmVar2.d = i4;
                            akzxVarM.u();
                            aiwm aiwmVar3 = akzxVarM.b;
                            aiwmVar3.b |= 64;
                            aiwmVar3.i = j2;
                            akzxVarM.u();
                            aiwm aiwmVar4 = akzxVarM.b;
                            j$.util.Objects.requireNonNull(str3);
                            aiwmVar4.b |= 128;
                            aiwmVar4.j = str3;
                            java.lang.String str6 = acwbVar2.d;
                            akzxVarM.u();
                            aiwm aiwmVar5 = akzxVarM.b;
                            j$.util.Objects.requireNonNull(str6);
                            aiwmVar5.b |= 4;
                            aiwmVar5.e = str6;
                            adbaVar2.o(akzxVarM.p(), 5, ((java.lang.Long) aogcVar2.M(uriAw, new defpackage.affm(4))).longValue(), aogcVar2.K(uri), str4, 0);
                            aogcVar2.P(uri);
                        } catch (java.io.IOException unused) {
                        }
                    } catch (java.io.IOException e) {
                        adbe.g(e, "%s: Failed to apply zip download transform for file %s.", new java.lang.Object[]{"DownloaderCallbackImpl", uri});
                        yg ygVarB = acvh.b();
                        ygVarB.b = defpackage.acvg.DOWNLOAD_TRANSFORM_IO_ERROR;
                        ygVarB.c = e;
                        throw ygVarB.d();
                    }
                } else {
                    defpackage.acvr acvrVar3 = this.b;
                    if ((acvrVar3.b & 32) != 0) {
                        defpackage.amlu amluVar3 = acvrVar3.h;
                        if (amluVar3 == null) {
                            amluVar3 = defpackage.amlu.a;
                        }
                        java.util.Iterator it2 = amluVar3.b.iterator();
                        while (it2.hasNext()) {
                            if (((amlt) it2.next()).b == 6) {
                                aogc aogcVar3 = this.l;
                                try {
                                    aogcVar3.M(uri, new defpackage.affm(2));
                                    aogcVar3.Q(uri, uriAw);
                                } catch (java.io.IOException e2) {
                                    adbe.g(e2, "%s: Failed to apply defrag download transform for file %s.", new java.lang.Object[]{"DownloaderCallbackImpl", uri});
                                    yg ygVarB2 = acvh.b();
                                    ygVarB2.b = defpackage.acvg.DOWNLOAD_TRANSFORM_IO_ERROR;
                                    ygVarB2.c = e2;
                                    throw ygVarB2.d();
                                }
                            }
                        }
                        android.net.Uri.Builder builderBuildUpon = uri.buildUpon();
                        amluVar = this.b.h;
                        if (amluVar == null) {
                            amluVar = defpackage.amlu.a;
                        }
                        uriBuild = builderBuildUpon.encodedFragment(afgc.a(amluVar)).build();
                        adbaVar = this.d;
                        aogcVar = this.l;
                        acwbVar = this.e;
                        i = this.f;
                        j = this.g;
                        str = this.h;
                        acvrVar = this.b;
                        acvl acvlVar = this.i;
                        ajiu ajiuVar = new ajiu((char[]) null);
                        inputStream = (java.io.InputStream) aogcVar.M(uriBuild, new affr());
                        afft afftVar = new afft();
                        afftVar.a = new ajiu[]{ajiuVar};
                        outputStream = (java.io.OutputStream) aogcVar.M(uriAw, afftVar);
                        aisk.a(inputStream, outputStream);
                        outputStream.flush();
                        acvlVar.S();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if ((acvrVar.b & 32) != 0) {
                            amluVar2 = acvrVar.h;
                            if (amluVar2 == null) {
                                amluVar2 = defpackage.amlu.a;
                            }
                            it = amluVar2.b.iterator();
                            while (it.hasNext()) {
                                if (((amlt) it.next()).b == 1) {
                                    jK = aogcVar.K(uriAw);
                                    jK2 = aogcVar.K(uriBuild);
                                    if (jK > jK2) {
                                        break;
                                    }
                                    akzx akzxVarM2 = aiwm.a.m();
                                    java.lang.String str7 = acwbVar.c;
                                    akzxVarM2.u();
                                    aiwm aiwmVar6 = akzxVarM2.b;
                                    j$.util.Objects.requireNonNull(str7);
                                    aiwmVar6.b |= 1;
                                    aiwmVar6.c = str7;
                                    akzxVarM2.u();
                                    aiwm aiwmVar7 = akzxVarM2.b;
                                    aiwmVar7.b |= 2;
                                    aiwmVar7.d = i;
                                    akzxVarM2.u();
                                    aiwm aiwmVar8 = akzxVarM2.b;
                                    aiwmVar8.b |= 64;
                                    aiwmVar8.i = j;
                                    akzxVarM2.u();
                                    aiwm aiwmVar9 = akzxVarM2.b;
                                    j$.util.Objects.requireNonNull(str);
                                    aiwmVar9.b |= 128;
                                    aiwmVar9.j = str;
                                    java.lang.String str8 = acwbVar.d;
                                    akzxVarM2.u();
                                    aiwm aiwmVar10 = akzxVarM2.b;
                                    j$.util.Objects.requireNonNull(str8);
                                    aiwmVar10.b |= 4;
                                    aiwmVar10.e = str8;
                                    adbaVar.o(akzxVarM2.p(), 3, jK, jK2, acvrVar.c, 0);
                                    break;
                                }
                            }
                        }
                        aogcVar.P(uriBuild);
                        iAe = a.ae(this.b.f);
                        if (iAe != 0) {
                            adbe.d("%s: Final file checksum verification failed. %s.", "DownloaderCallbackImpl", uriAw);
                            yg ygVarB3 = acvh.b();
                            ygVarB3.b = defpackage.acvg.FINAL_FILE_CHECKSUM_MISMATCH_ERROR;
                            throw ygVarB3.d();
                        }
                        adbe.d("%s: Final file checksum verification failed. %s.", "DownloaderCallbackImpl", uriAw);
                        yg ygVarB4 = acvh.b();
                        ygVarB4.b = defpackage.acvg.FINAL_FILE_CHECKSUM_MISMATCH_ERROR;
                        throw ygVarB4.d();
                    }
                    try {
                        android.net.Uri.Builder builderBuildUpon2 = uri.buildUpon();
                        amluVar = this.b.h;
                        if (amluVar == null) {
                            amluVar = defpackage.amlu.a;
                        }
                        uriBuild = builderBuildUpon2.encodedFragment(afgc.a(amluVar)).build();
                        adbaVar = this.d;
                        aogcVar = this.l;
                        acwbVar = this.e;
                        i = this.f;
                        j = this.g;
                        str = this.h;
                        acvrVar = this.b;
                        acvl acvlVar2 = this.i;
                        ajiu ajiuVar2 = new ajiu((char[]) null);
                        try {
                            inputStream = (java.io.InputStream) aogcVar.M(uriBuild, new affr());
                            try {
                                afft afftVar2 = new afft();
                                afftVar2.a = new ajiu[]{ajiuVar2};
                                outputStream = (java.io.OutputStream) aogcVar.M(uriAw, afftVar2);
                                try {
                                    aisk.a(inputStream, outputStream);
                                    outputStream.flush();
                                    acvlVar2.S();
                                    if (outputStream != null) {
                                        outputStream.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    try {
                                        if ((acvrVar.b & 32) != 0) {
                                            amluVar2 = acvrVar.h;
                                            if (amluVar2 == null) {
                                                amluVar2 = defpackage.amlu.a;
                                            }
                                            it = amluVar2.b.iterator();
                                            while (it.hasNext()) {
                                                if (((amlt) it.next()).b == 1) {
                                                    jK = aogcVar.K(uriAw);
                                                    jK2 = aogcVar.K(uriBuild);
                                                    if (jK > jK2) {
                                                        break;
                                                    }
                                                    akzx akzxVarM3 = aiwm.a.m();
                                                    java.lang.String str9 = acwbVar.c;
                                                    akzxVarM3.u();
                                                    aiwm aiwmVar11 = akzxVarM3.b;
                                                    j$.util.Objects.requireNonNull(str9);
                                                    aiwmVar11.b |= 1;
                                                    aiwmVar11.c = str9;
                                                    akzxVarM3.u();
                                                    aiwm aiwmVar12 = akzxVarM3.b;
                                                    aiwmVar12.b |= 2;
                                                    aiwmVar12.d = i;
                                                    akzxVarM3.u();
                                                    aiwm aiwmVar13 = akzxVarM3.b;
                                                    aiwmVar13.b |= 64;
                                                    aiwmVar13.i = j;
                                                    akzxVarM3.u();
                                                    aiwm aiwmVar14 = akzxVarM3.b;
                                                    j$.util.Objects.requireNonNull(str);
                                                    aiwmVar14.b |= 128;
                                                    aiwmVar14.j = str;
                                                    java.lang.String str10 = acwbVar.d;
                                                    akzxVarM3.u();
                                                    aiwm aiwmVar15 = akzxVarM3.b;
                                                    j$.util.Objects.requireNonNull(str10);
                                                    aiwmVar15.b |= 4;
                                                    aiwmVar15.e = str10;
                                                    adbaVar.o(akzxVarM3.p(), 3, jK, jK2, acvrVar.c, 0);
                                                    break;
                                                }
                                            }
                                        }
                                        aogcVar.P(uriBuild);
                                    } catch (java.io.IOException unused2) {
                                    }
                                    iAe = a.ae(this.b.f);
                                    if ((iAe != 0 || iAe != 2) && !defpackage.adau.e(this.l, uriAw, this.c)) {
                                        adbe.d("%s: Final file checksum verification failed. %s.", "DownloaderCallbackImpl", uriAw);
                                        yg ygVarB5 = acvh.b();
                                        ygVarB5.b = defpackage.acvg.FINAL_FILE_CHECKSUM_MISMATCH_ERROR;
                                        throw ygVarB5.d();
                                    }
                                } catch (java.lang.Throwable th) {
                                    if (outputStream == null) {
                                        throw th;
                                    }
                                    try {
                                        outputStream.close();
                                        throw th;
                                    } catch (java.lang.Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            } catch (java.lang.Throwable th3) {
                                if (inputStream == null) {
                                    throw th3;
                                }
                                try {
                                    inputStream.close();
                                    throw th3;
                                } catch (java.lang.Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        } catch (java.io.IOException e3) {
                            adbe.g(e3, "%s: Failed to apply download transform for file %s.", new java.lang.Object[]{"DownloaderCallbackImpl", uriBuild});
                            yg ygVarB6 = acvh.b();
                            ygVarB6.b = defpackage.acvg.DOWNLOAD_TRANSFORM_IO_ERROR;
                            ygVarB6.c = e3;
                            throw ygVarB6.d();
                        }
                    } catch (java.lang.IllegalArgumentException e4) {
                        adbe.g(e4, "%s: Exception while trying to serialize download transform", new java.lang.Object[]{"DownloaderCallbackImpl"});
                        yg ygVarB7 = acvh.b();
                        ygVarB7.b = defpackage.acvg.UNABLE_TO_SERIALIZE_DOWNLOAD_TRANSFORM_ERROR;
                        ygVarB7.c = e4;
                        throw ygVarB7.d();
                    }
                }
            }
            return c(defpackage.acwa.DOWNLOAD_COMPLETE, this.b, this.k, this.a, this.j);
        } catch (acvh e5) {
            if (!e5.a.equals(defpackage.acvg.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR)) {
                return aiql.y(e5);
            }
            aczw aczwVar = this.a;
            defpackage.acvr acvrVar4 = this.b;
            int i5 = this.k;
            aogc aogcVar4 = this.l;
            java.lang.String str11 = this.c;
            adba adbaVar3 = this.d;
            acvl acvlVar3 = this.i;
            java.util.concurrent.Executor executor = this.j;
            return defpackage.adcs.e(d(aczwVar, acvrVar4, i5, aogcVar4, uri, str11, adbaVar3, acvlVar3, executor)).d(java.io.IOException.class, new defpackage.aczi(e5, 12), executor).g(new defpackage.aczi(e5, 13), executor);
        }
    }

    @Override // defpackage.adaw
    public final ajcq b(acvh acvhVar) {
        int i = adbe.a;
        boolean zEquals = acvhVar.a.equals(defpackage.acvg.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR);
        defpackage.acvr acvrVar = this.b;
        if (zEquals) {
            return c(defpackage.acwa.CORRUPTED, acvrVar, this.k, this.a, this.j);
        }
        return c(defpackage.acwa.DOWNLOAD_FAILED, acvrVar, this.k, this.a, this.j);
    }
}
