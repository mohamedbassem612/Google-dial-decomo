package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class rk {
    public static void a(defpackage.pv pvVar, java.lang.String str, android.app.appsearch.AppSearchBlobHandle[] appSearchBlobHandleArr) {
        int length = appSearchBlobHandleArr.length;
        defpackage.pe[] peVarArr = new defpackage.pe[length];
        for (int i = 0; i < appSearchBlobHandleArr.length; i++) {
            android.app.appsearch.AppSearchBlobHandle appSearchBlobHandle = appSearchBlobHandleArr[i];
            dzk.x(appSearchBlobHandle);
            byte[] sha256Digest = appSearchBlobHandle.getSha256Digest();
            java.lang.String packageName = appSearchBlobHandle.getPackageName();
            java.lang.String databaseName = appSearchBlobHandle.getDatabaseName();
            java.lang.String namespace = appSearchBlobHandle.getNamespace();
            dzk.x(sha256Digest);
            dzk.u(sha256Digest.length == 32, "The digest is not a SHA-256 digest");
            dzk.x(packageName);
            dzk.x(databaseName);
            dzk.x(namespace);
            peVarArr[i] = new defpackage.pe(sha256Digest, packageName, databaseName, namespace);
        }
        dzk.x(str);
        defpackage.pv.d(str);
        for (int i2 = 0; i2 < length; i2++) {
            if (peVarArr[i2] == null) {
                throw new java.lang.IllegalArgumentException(a.bs(i2, "The BlobHandle at ", " is null."));
            }
        }
        defpackage.sd sdVar = pvVar.a;
        j$.util.Objects.requireNonNull(peVarArr);
        defpackage.sk skVar = new defpackage.sk(str);
        skVar.a = (defpackage.pe[]) j$.util.Objects.requireNonNull(peVarArr);
        sdVar.b(str, skVar.a());
    }

    public static void b(defpackage.pv pvVar, java.lang.String str, android.app.appsearch.EmbeddingVector[] embeddingVectorArr, defpackage.rf rfVar) {
        int length = embeddingVectorArr.length;
        defpackage.pu[] puVarArr = new defpackage.pu[length];
        for (int i = 0; i < embeddingVectorArr.length; i++) {
            android.app.appsearch.EmbeddingVector embeddingVector = embeddingVectorArr[i];
            puVarArr[i] = new defpackage.pu(embeddingVector.getValues(), embeddingVector.getModelSignature());
        }
        dzk.x(str);
        defpackage.pv.d(str);
        for (int i2 = 0; i2 < length; i2++) {
            if (puVarArr[i2] == null) {
                throw new java.lang.IllegalArgumentException(a.bs(i2, "The EmbeddingVector at ", " is null."));
            }
        }
        defpackage.sd sdVar = pvVar.a;
        defpackage.sk skVar = new defpackage.sk(str);
        skVar.f(puVarArr);
        sdVar.b(str, skVar.a());
    }

    public static defpackage.qq c(android.app.appsearch.SearchResult searchResult, defpackage.rf rfVar) {
        dzk.x(searchResult);
        defpackage.pw pwVarE = rd.e(mp$.ExternalSyntheticApiModelOutline0.m(searchResult), rfVar);
        defpackage.ql qlVar = new defpackage.ql(rk$.ExternalSyntheticApiModelOutline0.m(searchResult), rk$.ExternalSyntheticApiModelOutline0.m$1(searchResult));
        qlVar.e(pwVarE);
        double dM = rk$.ExternalSyntheticApiModelOutline0.m(searchResult);
        qlVar.b();
        qlVar.b = dM;
        java.util.List listM = rk$.ExternalSyntheticApiModelOutline0.m(searchResult);
        for (int i = 0; i < listM.size(); i++) {
            android.app.appsearch.SearchResult.MatchInfo matchInfoM = rk$.ExternalSyntheticApiModelOutline0.m(listM.get(i));
            dzk.x(matchInfoM);
            defpackage.qm qmVar = new defpackage.qm(rk$.ExternalSyntheticApiModelOutline0.m(matchInfoM));
            qmVar.a = new defpackage.qo(rk$.ExternalSyntheticApiModelOutline0.m(rk$.ExternalSyntheticApiModelOutline0.m(matchInfoM)), rk$.ExternalSyntheticApiModelOutline0.m$1(rk$.ExternalSyntheticApiModelOutline0.m(matchInfoM)));
            qmVar.c = new defpackage.qo(rk$.ExternalSyntheticApiModelOutline0.m(rk$.ExternalSyntheticApiModelOutline0.m$1(matchInfoM)), rk$.ExternalSyntheticApiModelOutline0.m$1(rk$.ExternalSyntheticApiModelOutline0.m$1(matchInfoM)));
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                qmVar.b = new defpackage.qo(defpackage.rv.b(matchInfoM), defpackage.rv.a(matchInfoM));
            }
            qlVar.d(qmVar.a());
        }
        int i2 = dwz.a;
        if (i2 >= 7) {
            java.util.Iterator it = ru.a(searchResult).iterator();
            while (it.hasNext()) {
                qlVar.c(c(mp$.ExternalSyntheticApiModelOutline0.m(it.next()), rfVar));
            }
        }
        if (i2 >= 17) {
            java.util.List listA = defpackage.rt.a(searchResult);
            for (int i3 = 0; i3 < listA.size(); i3++) {
                java.lang.Double d = (java.lang.Double) listA.get(i3);
                d.doubleValue();
                qlVar.b();
                qlVar.c.add(d);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            try {
                qlVar.f(defpackage.rs.a(searchResult));
            } catch (java.lang.NoSuchMethodError e) {
                android.util.Log.e("AppSearchSearchResPlatC", "Failed to set parent type map.", e);
            }
        }
        return qlVar.a();
    }

    public static final cmw d(cmw cmwVar) {
        return dig.b(cmwVar, true, new nq(19));
    }

    public static defpackage.aog e(cav cavVar) {
        cavVar.u(1257603829);
        defpackage.aog aogVar = defpackage.aog.a;
        cavVar.o();
        return aogVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0009  */
    public static final int f(boolean z, boolean z2, boolean z3) {
        if (z) {
            if (!z2) {
                z2 = false;
                if (!z3) {
                    if (z) {
                    }
                }
            }
        } else if (!z3) {
            return (!z || z2) ? 2 : 1;
        }
        return 3;
    }

    public static final void g(boolean z, aonj aonjVar, cmw cmwVar, boolean z2, defpackage.bqa bqaVar, crd crdVar, aonn aonnVar, cav cavVar, int i) {
        int i2;
        cav cavVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-1031402037);
        if (i3 == 0) {
            i2 = (true != cavVarB.C(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aonjVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.C(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.B(bqaVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.B((java.lang.Object) null) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cavVarB.B(crdVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 4194304 : 8388608;
        }
        if (cavVarB.H((4793491 & i2) != 4793490, i2 & 1)) {
            ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            cavVar2 = cavVarB;
            h(z, aonjVar, cmwVar, z2, bqaVar, crdVar, aonnVar, cavVar2, i2 & 33554430);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bpx(z, aonjVar, cmwVar, z2, bqaVar, crdVar, aonnVar, i, 0);
        }
    }

    public static final void h(boolean z, aonj aonjVar, cmw cmwVar, boolean z2, defpackage.bqa bqaVar, crd crdVar, aonn aonnVar, cav cavVar, int i) {
        int i2;
        cmw cmwVar2;
        aonn aonnVar2;
        cav cavVar2;
        long j;
        long j2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(1724745099);
        if (i3 == 0) {
            i2 = (true != cavVarB.C(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aonjVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            cmwVar2 = cmwVar;
            i2 |= true != cavVarB.B(cmwVar2) ? 128 : 256;
        } else {
            cmwVar2 = cmwVar;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.C(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.B(bqaVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.B((java.lang.Object) null) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cavVarB.B(crdVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 4194304 : 8388608;
        }
        int i4 = i2;
        if (cavVarB.H((i4 & 4793491) != 4793490, i4 & 1)) {
            cbt cbtVar = (cbt) cavVarB;
            cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            cavVarB.u(1187952688);
            java.lang.Object objR = cbtVar.R();
            if (objR == cau.a) {
                objR = new kaw((byte[]) null, (char[]) null, (byte[]) null);
                cbtVar.ab(objR);
            }
            kaw kawVar = (kaw) objR;
            cbtVar.W(false);
            cmw cmwVarK = cfd.K(azm.h(bqd.a(cmwVar2), i()), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, crdVar, true, 0, 1042431);
            if (z2) {
                j = !z ? bqaVar.a : bqaVar.e;
            } else {
                j = bqaVar.c;
            }
            cavVar2 = cavVarB;
            aonnVar2 = aonnVar;
            cmw cmwVarJ = wl.j(den.bp(cmwVarK, ((cqg) cdh.g(new cqg(j), cavVarB).a()).a), z, kawVar, bsw.a(false, 0.0f, crdVar, false, 247), z2, new dib(1), aonjVar);
            cye cyeVarB = awo.b(cmh.e, false);
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cavVar2, cmwVarJ);
            aomy aomyVar = dam.a;
            cavVar2.v();
            if (cbtVar.w) {
                cavVar2.j(aomyVar);
            } else {
                cavVar2.x();
            }
            cev.c(cavVar2, cyeVarB, dam.e);
            cev.c(cavVar2, cjeVarAi, dam.d);
            cev.c(cavVar2, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cavVar2, dam.g);
            cev.c(cavVar2, cmwVarM, dam.c);
            if (z2) {
                j2 = !z ? bqaVar.b : bqaVar.f;
            } else {
                j2 = bqaVar.d;
            }
            den.ab(boy.a.b(new cqg(((cqg) cdh.g(new cqg(j2), cavVar2).a()).a)), aonnVar2, cavVar2, ((i4 >> 18) & 112) | 8);
            cbtVar.W(true);
        } else {
            aonnVar2 = aonnVar;
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bpx(z, aonjVar, cmwVar, z2, bqaVar, crdVar, aonnVar2, i, 1);
        }
    }

    public static /* synthetic */ long i() {
        float f;
        if (a.x(1, 0)) {
            f = 8.0f;
        } else if (a.x(1, 1)) {
            f = 16.0f;
        } else {
            f = a.x(1, 2) ? 28.0f : 0.0f;
        }
        return mni.bj(f + 24.0f + 0.0f, 40.0f);
    }

    public static final void j(aomy aomyVar, cmw cmwVar, crd crdVar, long j, long j2, defpackage.bpn bpnVar, aonn aonnVar, cav cavVar, int i) {
        int i2;
        aonn aonnVar2;
        cav cavVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(748201188);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(crdVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.A(j) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.A(j2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.B(bpnVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cavVarB.B((java.lang.Object) null) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            aonnVar2 = aonnVar;
            i2 |= true != cavVarB.D(aonnVar2) ? 4194304 : 8388608;
        } else {
            aonnVar2 = aonnVar;
        }
        if (cavVarB.H((4793491 & i2) != 4793490, i2 & 1)) {
            ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            int i4 = i2 << 9;
            cavVar2 = cavVarB;
            l(aomyVar, bwp.b(9, cavVarB), cmwVar, crdVar, j, j2, bpnVar, aonnVar2, cavVar2, (i2 & 14) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), (i2 >> 21) & 14);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bpt(aomyVar, cmwVar, crdVar, j, j2, bpnVar, aonnVar, i, 1);
        }
    }

    public static final void k(aomy aomyVar, cmw cmwVar, crd crdVar, long j, long j2, defpackage.bpn bpnVar, aonn aonnVar, cav cavVar, int i) {
        int i2;
        cav cavVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(1274576261);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(crdVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.A(j) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.A(j2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.B(bpnVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cavVarB.B((java.lang.Object) null) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 4194304 : 8388608;
        }
        if (cavVarB.H((4793491 & i2) != 4793490, i2 & 1)) {
            ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            cavVar2 = cavVarB;
            j(aomyVar, azm.j(cmwVar, 96.0f, 96.0f, Float.NaN, Float.NaN), crdVar, j, j2, bpnVar, aonnVar, cavVar2, i2 & 33554318);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bpt(aomyVar, cmwVar, crdVar, j, j2, bpnVar, aonnVar, i, 0);
        }
    }

    public static final void l(aomy aomyVar, dkz dkzVar, cmw cmwVar, crd crdVar, long j, long j2, defpackage.bpn bpnVar, aonn aonnVar, cav cavVar, int i, int i2) {
        int i3;
        aonn aonnVar2;
        int i4;
        cav cavVar2;
        boolean z;
        int i5 = i & 6;
        cav cavVarB = cavVar.b(121669932);
        if (i5 == 0) {
            i3 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(dkzVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.y(56.0f) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cavVarB.y(56.0f) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != cavVarB.B(crdVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != cavVarB.A(j) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != cavVarB.A(j2) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != cavVarB.B(bpnVar) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != cavVarB.B((java.lang.Object) null) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            aonnVar2 = aonnVar;
            i4 = i2 | (true != cavVarB.D(aonnVar2) ? 2 : 4);
        } else {
            aonnVar2 = aonnVar;
            i4 = i2;
        }
        if (cavVarB.H(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            cbt cbtVar = (cbt) cavVarB;
            cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            cavVarB.u(-282853233);
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR == obj) {
                objR = new kaw((byte[]) null, (char[]) null, (byte[]) null);
                cbtVar.ab(objR);
            }
            kaw kawVar = (kaw) objR;
            cbtVar.W(false);
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == obj) {
                z = false;
                objR2 = new defpackage.bpr(0);
                cbtVar.ab(objR2);
            } else {
                z = false;
            }
            cmw cmwVarB = dig.b(cmwVar, z, (aonj) objR2);
            float f = bpnVar.a;
            int i6 = i3 >> 21;
            boolean zB = cavVarB.B(kawVar);
            java.lang.Object objR3 = cbtVar.R();
            if (zB || objR3 == obj) {
                objR3 = new defpackage.bpq(f, bpnVar.b, bpnVar.d, bpnVar.c);
                cbtVar.ab(objR3);
            }
            defpackage.bpq bpqVar = (defpackage.bpq) objR3;
            boolean zD = cavVarB.D(bpqVar) | ((((i6 & 112) ^ 48) > 32 && cavVarB.B(bpnVar)) || (i6 & 48) == 32);
            java.lang.Object objR4 = cbtVar.R();
            if (zD || objR4 == obj) {
                objR4 = new bnl(bpqVar, bpnVar, (aoln) null, 4);
                cbtVar.ab(objR4);
            }
            cbp.g(bpnVar, (aonn) objR4, cavVarB);
            boolean zB2 = cavVarB.B(kawVar) | cavVarB.D(bpqVar);
            java.lang.Object objR5 = cbtVar.R();
            if (zB2 || objR5 == obj) {
                objR5 = new defpackage.blj(kawVar, bpqVar, (aoln) null, 2);
                cbtVar.ab(objR5);
            }
            cbp.g(kawVar, (aonn) objR5, cavVarB);
            cavVar2 = cavVarB;
            bvo.d(aomyVar, cmwVarB, false, crdVar, j, j2, f, ((dpi) bpqVar.e.b.a()).a, (amu) null, kawVar, cfo.j(-1779603465, new defpackage.bps(j2, dkzVar, aonnVar2, 0), cavVarB), cavVar2, 260);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.abes(aomyVar, dkzVar, cmwVar, crdVar, j, j2, bpnVar, aonnVar, i, i2, 1);
        }
    }

    public static final void m(cmw cmwVar, aomy aomyVar, boolean z, crd crdVar, defpackage.bpw bpwVar, kaw kawVar, aonn aonnVar, cav cavVar, int i) {
        cmw cmwVar2;
        int i2;
        aonn aonnVar2;
        cbt cbtVar;
        kaw kawVar2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1134296466);
        if (i3 == 0) {
            cmwVar2 = cmwVar;
            i2 = (true != cbtVarB.B(cmwVar2) ? 2 : 4) | i;
        } else {
            cmwVar2 = cmwVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(aomyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.C(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.B(crdVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cbtVarB.B(bpwVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cbtVarB.B(kawVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cbtVarB.D(aonnVar) ? 524288 : 1048576;
        }
        int i4 = i2;
        if (cbtVarB.H((i4 & 599187) != 599186, i4 & 1)) {
            if (kawVar == null) {
                cbtVarB.u(976976045);
                cbt cbtVar2 = cbtVarB;
                java.lang.Object objR = cbtVar2.R();
                if (objR == cau.a) {
                    objR = new kaw((byte[]) null, (char[]) null, (byte[]) null);
                    cbtVar2.ab(objR);
                }
                cbtVar2.W(false);
                kawVar2 = (kaw) objR;
            } else {
                cbtVarB.u(862798698);
                cbtVarB.W(false);
                kawVar2 = kawVar;
            }
            aonnVar2 = aonnVar;
            cmw cmwVarA = den.ca(den.bn(cfd.K(azm.h(bqd.a(cmwVar2), i()), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, crdVar, true, 0, 1042431), bpwVar.a(z), crdVar), kawVar2, bsw.a(false, 0.0f, crdVar, false, 247), z, new dib(0), aomyVar).a(new bxx(new aln(18)));
            cye cyeVarB = awo.b(cmh.e, false);
            cbt cbtVar3 = cbtVarB;
            int iM = anty.M(cbtVar3.x);
            cje cjeVarAi = cbtVar3.ai();
            cbtVar = cbtVarB;
            cmw cmwVarM = cfo.m(cbtVar, cmwVarA);
            aomy aomyVar2 = dam.a;
            cbtVar.v();
            if (cbtVar3.w) {
                cbtVar.j(aomyVar2);
            } else {
                cbtVar.x();
            }
            cev.c(cbtVar, cyeVarB, dam.e);
            cev.c(cbtVar, cjeVarAi, dam.d);
            cev.c(cbtVar, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cbtVar, dam.g);
            cev.c(cbtVar, cmwVarM, dam.c);
            den.ab(boy.a.b(new cqg(bpwVar.b(z))), aonnVar2, cbtVar, ((i4 >> 15) & 112) | 8);
            cbtVar3.W(true);
        } else {
            aonnVar2 = aonnVar;
            cbtVar = cbtVarB;
            cbtVar.s();
        }
        cdk cdkVarI = cbtVar.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bmp(cmwVar, aomyVar, z, crdVar, bpwVar, kawVar, aonnVar2, i, 4);
        }
    }

    public static final void n(aomy aomyVar, cmw cmwVar, boolean z, crd crdVar, defpackage.bpw bpwVar, kaw kawVar, aonn aonnVar, cav cavVar, int i) {
        int i2;
        cav cavVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-399178234);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.C(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(crdVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.B(bpwVar) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i2 |= true != cavVarB.B(kawVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 524288 : 1048576;
        }
        if (cavVarB.H((599187 & i2) != 599186, i2 & 1)) {
            ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            int i4 = (i2 & 14) | 196608;
            int i5 = i2 & 112;
            int i6 = i2 & 896;
            int i7 = i2 & 7168;
            int i8 = 57344 & i2;
            int i9 = i2 << 3;
            cavVar2 = cavVarB;
            o(aomyVar, cmwVar, z, crdVar, bpwVar, kawVar, aonnVar, cavVar2, i4 | i5 | i6 | i7 | i8 | (3670016 & i9) | (i9 & 29360128));
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bmp(aomyVar, cmwVar, z, crdVar, bpwVar, kawVar, aonnVar, i, 3);
        }
    }

    public static final void o(aomy aomyVar, cmw cmwVar, boolean z, crd crdVar, defpackage.bpw bpwVar, kaw kawVar, aonn aonnVar, cav cavVar, int i) {
        aomy aomyVar2;
        int i2;
        cav cavVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-171935091);
        if (i3 == 0) {
            aomyVar2 = aomyVar;
            i2 = (true != cavVarB.D(aomyVar2) ? 2 : 4) | i;
        } else {
            aomyVar2 = aomyVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.C(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(crdVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.B(bpwVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.B((java.lang.Object) null) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cavVarB.B(kawVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 4194304 : 8388608;
        }
        if (cavVarB.H((4793491 & i2) != 4793490, i2 & 1)) {
            cbt cbtVar = (cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (objR == cau.a) {
                objR = new defpackage.bpr(2);
                cbtVar.ab(objR);
            }
            cavVar2 = cavVarB;
            bvo.d(aomyVar2, dig.b(cmwVar, false, (aonj) objR), z, crdVar, bpwVar.a(z), bpwVar.b(z), 0.0f, 0.0f, (amu) null, kawVar, cfo.j(669231714, new axo(aonnVar, 20), cavVarB), cavVar2, 192);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bmp(aomyVar, cmwVar, z, crdVar, bpwVar, kawVar, aonnVar, i, 5);
        }
    }

    public static final void p(aomy aomyVar, cmw cmwVar, boolean z, defpackage.bpw bpwVar, kaw kawVar, crd crdVar, aonn aonnVar, cav cavVar, int i) {
        int i2;
        cav cavVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(1413012038);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.C(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(bpwVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.B(kawVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.B(crdVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 524288 : 1048576;
        }
        if (cavVarB.H((599187 & i2) != 599186, i2 & 1)) {
            ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            int i4 = i2 << 3;
            cavVar2 = cavVarB;
            m(cmwVar, aomyVar, z, crdVar, bpwVar, kawVar, aonnVar, cavVar2, ((i2 >> 3) & 14) | (i4 & 112) | (i2 & 896) | ((i2 >> 6) & 7168) | (57344 & i4) | (i4 & 458752) | (i2 & 3670016));
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bmp(aomyVar, cmwVar, z, bpwVar, kawVar, crdVar, aonnVar, i, 6);
        }
    }
}
