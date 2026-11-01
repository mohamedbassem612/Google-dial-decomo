package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acyu {
    public final android.content.Context a;
    public final defpackage.adba b;
    public final defpackage.acxa c;
    public final defpackage.acyv d;
    public final defpackage.ahyn e;
    public final java.util.concurrent.Executor f;
    public final defpackage.ahyn g;
    public final defpackage.ahyn h;
    public final defpackage.acvl i;
    public final defpackage.adlt j;
    public final defpackage.abrz k;
    public final defpackage.tvn l = new defpackage.tvn((byte[]) null, (byte[]) null);
    public final defpackage.aogc m;
    private final java.util.concurrent.Executor n;

    public acyu(android.content.Context context, defpackage.adba adbaVar, defpackage.acxa acxaVar, defpackage.acyv acyvVar, defpackage.adlt adltVar, defpackage.abrz abrzVar, defpackage.ahyn ahynVar, java.util.concurrent.Executor executor, defpackage.ahyn ahynVar2, defpackage.aogc aogcVar, defpackage.ahyn ahynVar3, defpackage.acvl acvlVar, java.util.concurrent.Executor executor2) {
        this.a = context;
        this.b = adbaVar;
        this.c = acxaVar;
        this.d = acyvVar;
        this.j = adltVar;
        this.k = abrzVar;
        this.e = ahynVar;
        this.f = executor;
        this.n = executor2;
        this.g = ahynVar2;
        this.m = aogcVar;
        this.h = ahynVar3;
        this.i = acvlVar;
    }

    public static void A(int i, defpackage.adba adbaVar, acvu acvuVar) {
        adbaVar.m(i, acvuVar.d, acvuVar.f, acvuVar.s, acvuVar.t);
    }

    public static void B(defpackage.adba adbaVar, acvu acvuVar, acvr acvrVar, int i) {
        defpackage.akzx akzxVarM = aiwp.a.m();
        akzxVarM.u();
        aiwp aiwpVar = akzxVarM.b;
        aiwpVar.c = airh.k(i);
        aiwpVar.b |= 1;
        java.lang.String str = acvuVar.d;
        akzxVarM.u();
        aiwp aiwpVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        aiwpVar2.b |= 2;
        aiwpVar2.d = str;
        int i2 = acvuVar.f;
        akzxVarM.u();
        aiwp aiwpVar3 = akzxVarM.b;
        aiwpVar3.b |= 4;
        aiwpVar3.e = i2;
        long j = acvuVar.s;
        akzxVarM.u();
        aiwp aiwpVar4 = akzxVarM.b;
        aiwpVar4.b |= 128;
        aiwpVar4.i = j;
        java.lang.String str2 = acvuVar.t;
        akzxVarM.u();
        aiwp aiwpVar5 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        aiwpVar5.b |= 256;
        aiwpVar5.j = str2;
        java.lang.String str3 = acvrVar.c;
        akzxVarM.u();
        aiwp aiwpVar6 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str3);
        aiwpVar6.b |= 8;
        aiwpVar6.f = str3;
        adbaVar.e((aiwp) akzxVarM.r());
    }

    public static defpackage.ahyn a(acvu acvuVar, acvu acvuVar2) {
        if (acvuVar2.s != acvuVar.s) {
            return defpackage.ahyn.h(aixh.c);
        }
        if (!acvuVar2.t.equals(acvuVar.t)) {
            return defpackage.ahyn.h(aixh.d);
        }
        if (acvuVar2.f != acvuVar.f) {
            return defpackage.ahyn.h(aixh.e);
        }
        if (!s(acvuVar, acvuVar2)) {
            return defpackage.ahyn.h(aixh.f);
        }
        defpackage.akyp akypVar = acvuVar2.h;
        if (akypVar == null) {
            akypVar = defpackage.akyp.a;
        }
        defpackage.akyp akypVar2 = acvuVar.h;
        if (akypVar2 == null) {
            akypVar2 = defpackage.akyp.a;
        }
        if (!akypVar.equals(akypVar2)) {
            return defpackage.ahyn.h(aixh.m);
        }
        if (acvuVar2.k != acvuVar.k) {
            return defpackage.ahyn.h(aixh.g);
        }
        if (acvuVar2.l != acvuVar.l) {
            return defpackage.ahyn.h(aixh.h);
        }
        acvw acvwVar = acvuVar2.m;
        if (acvwVar == null) {
            acvwVar = acvw.a;
        }
        acvw acvwVar2 = acvuVar.m;
        if (acvwVar2 == null) {
            acvwVar2 = acvw.a;
        }
        if (!acvwVar.equals(acvwVar2)) {
            return defpackage.ahyn.h(aixh.i);
        }
        int iAQ = defpackage.a.aQ(acvuVar2.j);
        if (iAQ == 0) {
            iAQ = 1;
        }
        int iAQ2 = defpackage.a.aQ(acvuVar.j);
        if (iAQ2 == 0) {
            iAQ2 = 1;
        }
        if (iAQ != iAQ2) {
            return defpackage.ahyn.h(aixh.j);
        }
        int iY = defpackage.afsq.Y(acvuVar2.r);
        if (iY == 0) {
            iY = 1;
        }
        int iY2 = defpackage.afsq.Y(acvuVar.r);
        if (iY != (iY2 != 0 ? iY2 : 1)) {
            return defpackage.ahyn.h(aixh.k);
        }
        aphh aphhVar = acvuVar2.v;
        if (aphhVar == null) {
            aphhVar = aphh.a;
        }
        aphh aphhVar2 = acvuVar.v;
        if (aphhVar2 == null) {
            aphhVar2 = aphh.a;
        }
        return !aphhVar.equals(aphhVar2) ? defpackage.ahyn.h(aixh.l) : defpackage.ahwt.a;
    }

    public static boolean s(acvu acvuVar, acvu acvuVar2) {
        return acvuVar.o.equals(acvuVar2.o);
    }

    public static boolean u(acwg acwgVar, long j) {
        return j > acwgVar.f;
    }

    public static final aiwm v(acvu acvuVar) {
        defpackage.akzx akzxVarM = aiwm.a.m();
        java.lang.String str = acvuVar.d;
        akzxVarM.u();
        aiwm aiwmVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        aiwmVar.b |= 1;
        aiwmVar.c = str;
        java.lang.String str2 = acvuVar.e;
        akzxVarM.u();
        aiwm aiwmVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        aiwmVar2.b |= 4;
        aiwmVar2.e = str2;
        int i = acvuVar.f;
        akzxVarM.u();
        aiwm aiwmVar3 = akzxVarM.b;
        aiwmVar3.b |= 2;
        aiwmVar3.d = i;
        long j = acvuVar.s;
        akzxVarM.u();
        aiwm aiwmVar4 = akzxVarM.b;
        aiwmVar4.b |= 64;
        aiwmVar4.i = j;
        java.lang.String str3 = acvuVar.t;
        akzxVarM.u();
        aiwm aiwmVar5 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str3);
        aiwmVar5.b |= 128;
        aiwmVar5.j = str3;
        return akzxVarM.r();
    }

    public static final void w(java.util.List list, acwb acwbVar) throws defpackage.acvh {
        defpackage.adbe.e("%s downloadFileGroup %s %s can't finish!", "FileGroupManager", acwbVar.c, acwbVar.d);
        defpackage.acup.b(list, "Failed to download file group %s", acwbVar.c);
        defpackage.adbe.c("%s: An unknown error has occurred during download", "FileGroupManager");
        yg ygVarB = defpackage.acvh.b();
        ygVarB.b = acvg.c;
        throw ygVarB.d();
    }

    final defpackage.ajcq C(acwb acwbVar, acvu acvuVar, defpackage.ajat ajatVar, vaa vaaVar) {
        int i = defpackage.adbe.a;
        defpackage.akzx akzxVarL = acwbVar.L();
        akzxVarL.u();
        acwb acwbVar2 = akzxVarL.b;
        acwbVar2.b |= 8;
        acwbVar2.f = true;
        acwb acwbVarR = akzxVarL.r();
        defpackage.akzx akzxVarL2 = acwbVar.L();
        akzxVarL2.u();
        acwb acwbVar3 = akzxVarL2.b;
        acwbVar3.b |= 8;
        acwbVar3.f = false;
        acwb acwbVarR2 = akzxVarL2.r();
        acvs acvsVar = acvuVar.c;
        if (acvsVar == null) {
            acvsVar = acvs.a;
        }
        boolean z = (acvsVar.b & 4) != 0;
        long jV = defpackage.abrz.V();
        acvs acvsVar2 = acvuVar.c;
        if (acvsVar2 == null) {
            acvsVar2 = acvs.a;
        }
        defpackage.akzx akzxVarL3 = acvsVar2.L();
        akzxVarL3.u();
        acvs acvsVar3 = akzxVarL3.b;
        acvsVar3.b |= 4;
        acvsVar3.e = jV;
        acvs acvsVarR = akzxVarL3.r();
        defpackage.akzx akzxVarL4 = acvuVar.L();
        akzxVarL4.u();
        acvu acvuVar2 = akzxVarL4.b;
        j$.util.Objects.requireNonNull(acvsVarR);
        acvuVar2.c = acvsVarR;
        acvuVar2.b |= 1;
        acvu acvuVarR = akzxVarL4.r();
        adcs adcsVarE = adcs.e(h(acvuVar));
        acyp acypVar = new acyp(this, vaaVar, acvuVar, acwbVarR2, ajatVar, acwbVarR, acvuVarR, z);
        java.util.concurrent.Executor executor = this.f;
        return adcsVarE.g(acypVar, executor).g(new acwk(this, 20), executor);
    }

    public final defpackage.aigf b(acvu acvuVar) {
        defpackage.aigb aigbVar = new defpackage.aigb(4);
        android.net.Uri uriAn = defpackage.afsq.an(this.a, this.g, acvuVar);
        for (acvr acvrVar : acvuVar.o) {
            aigbVar.i(acvrVar, defpackage.afsq.am(uriAn, acvrVar));
        }
        return aigbVar.e(false);
    }

    public final defpackage.aigf c(defpackage.aigf aigfVar, defpackage.aigf aigfVar2) {
        defpackage.aigb aigbVar = new defpackage.aigb(4);
        defpackage.ailj it = aigfVar2.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (entry.getValue() != null && aigfVar.containsKey(entry.getKey())) {
                android.net.Uri uri = (android.net.Uri) aigfVar.get(entry.getKey());
                android.net.Uri uri2 = (android.net.Uri) entry.getValue();
                try {
                    if (this.m.R(uri)) {
                        try {
                            if (defpackage.afsq.Z(this.a, uri).toString().equals(uri2.toString())) {
                                aigbVar.i((acvr) entry.getKey(), uri);
                            } else {
                                defpackage.adbe.e("%s verifyIsolatedFileUris isolated file uri does match expected on-device uri! %s %s", "FileGroupManager", uri, uri2);
                            }
                        } catch (java.io.IOException unused) {
                            defpackage.adbe.e("%s verifyIsolatedFileUris unable to read symlink using isolated file uri! %s %s", "FileGroupManager", uri, uri2);
                        }
                    } else {
                        defpackage.adbe.e("%s verifyIsolatedFileUris isolated uri does not exist -- unable to verify it matches the expected target! %s %s", "FileGroupManager", uri, uri2);
                    }
                } catch (java.io.IOException unused2) {
                    defpackage.adbe.e("%s verifyIsolatedFileUris unable to check if isolated uri exists! %s %s", "FileGroupManager", uri, uri2);
                }
            }
        }
        return aigbVar.e(false);
    }

    public final defpackage.ajcq d(acvu acvuVar) {
        if (!acvuVar.n) {
            return defpackage.ajcm.a;
        }
        try {
            defpackage.afsq.cU(this.a, this.g, acvuVar, this.m);
            defpackage.alat alatVar = acvuVar.o;
            if (defpackage.ahvr.aT(alatVar.iterator(), new evz(10)).f()) {
                return defpackage.aiql.y(new java.lang.UnsupportedOperationException("Preserve File Paths is invalid with Android Blob Sharing"));
            }
            defpackage.aigf aigfVarB = b(acvuVar);
            defpackage.ajcq ajcqVarK = k(acvuVar);
            zum zumVar = new zum(this, alatVar, aigfVarB, 20, (byte[]) null);
            java.util.concurrent.Executor executor = this.f;
            defpackage.ajcq ajcqVarI = defpackage.ahvr.I(ajcqVarK, zumVar, executor);
            defpackage.ahvr.J(ajcqVarI, new kxp(this, acvuVar, 11), executor);
            return ajcqVarI;
        } catch (java.io.IOException e) {
            yg ygVarB = defpackage.acvh.b();
            ygVarB.b = acvg.N;
            ygVarB.d = "Unable to cleanup symlink structure";
            ygVarB.c = e;
            return defpackage.aiql.y(ygVarB.d());
        }
    }

    public final defpackage.ajcq e(acwb acwbVar, acvw acvwVar, defpackage.ajat ajatVar) {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return defpackage.ahvr.C(q(g(acwbVar, false), new acyf(this, acwbVar, atomicReference, acvwVar, ajatVar, 0)), java.lang.Exception.class, new zum(this, atomicReference, acwbVar, 19, (byte[]) null), this.f);
    }

    public final defpackage.ajcq f(acwg acwgVar, acvr acvrVar, acvu acvuVar) {
        if (acwgVar.e) {
            return defpackage.aiql.z(acys.b);
        }
        if (acvrVar.o.isEmpty()) {
            return defpackage.aiql.z(acys.c);
        }
        android.content.Context context = this.a;
        java.lang.String str = acvrVar.o;
        defpackage.aogc aogcVar = this.m;
        return p(defpackage.ahvr.G(new defpackage.uej(context, str, aogcVar, acvrVar, acvuVar, 9), this.n), new ymu(20));
    }

    public final defpackage.ajcq g(acwb acwbVar, boolean z) {
        defpackage.akzx akzxVarL = acwbVar.L();
        akzxVarL.u();
        acwb acwbVar2 = akzxVarL.b;
        acwbVar2.b |= 8;
        acwbVar2.f = z;
        return this.d.g(akzxVarL.r());
    }

    public final defpackage.ajcq h(acvu acvuVar) {
        return i(acvuVar, false, false, 0, acvuVar.o.size());
    }

    public final defpackage.ajcq i(acvu acvuVar, boolean z, boolean z2, int i, int i2) {
        if (i < i2) {
            acvr acvrVar = (acvr) acvuVar.o.get(i);
            return defpackage.afsq.au(acvrVar) ? i(acvuVar, z, z2, i + 1, i2) : adcs.e(j(acvrVar, acvuVar)).g(new acyr(this, acvrVar, acvuVar, z, z2, i, i2), this.f);
        }
        if (z) {
            return defpackage.aiql.z(acyt.c);
        }
        return z2 ? defpackage.aiql.z(acyt.a) : defpackage.aiql.z(acyt.b);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq j(acvr acvrVar, acvu acvuVar) {
        int iAQ = defpackage.a.aQ(acvuVar.j);
        if (iAQ == 0) {
            iAQ = 1;
        }
        acwe acweVarAB = defpackage.afsq.aB(acvrVar, iAQ);
        defpackage.adlt adltVar = this.j;
        return adcs.e(defpackage.ahvr.I(adltVar.k(acweVarAB), new acwn(9), adltVar.h)).d(aczv.class, new wzg(this, acvuVar, 19), this.f);
    }

    final defpackage.ajcq k(acvu acvuVar) {
        defpackage.aigb aigbVar = new defpackage.aigb(4);
        defpackage.aigb aigbVar2 = new defpackage.aigb(4);
        for (acvr acvrVar : acvuVar.o) {
            if (defpackage.afsq.au(acvrVar)) {
                aigbVar.i(acvrVar, android.net.Uri.parse(acvrVar.d));
            } else {
                int iAQ = defpackage.a.aQ(acvuVar.j);
                if (iAQ == 0) {
                    iAQ = 1;
                }
                aigbVar2.i(acvrVar, defpackage.afsq.aB(acvrVar, iAQ));
            }
        }
        defpackage.aigf aigfVarE = aigbVar2.e(false);
        return adcs.e(this.j.j(defpackage.aihd.o(aigfVarE.values()))).f(new defpackage.wym(aigfVarE, aigbVar, 10), this.f);
    }

    public final defpackage.ajcq l(acvu acvuVar, acvr acvrVar, acwe acweVar) {
        return defpackage.ahvr.C(this.j.k(acweVar), aczv.class, new acyj(this, acweVar, acvuVar, acvrVar, 4), this.f);
    }

    public final defpackage.ajcq m(defpackage.ajat ajatVar) {
        return q(this.d.d(), new acyh(this, new java.util.ArrayList(), ajatVar, 10));
    }

    public final defpackage.ajcq n(acwb acwbVar, defpackage.acvh acvhVar, long j, java.lang.String str) {
        defpackage.akzx akzxVarM = aiwm.a.m();
        java.lang.String str2 = acwbVar.c;
        akzxVarM.u();
        aiwm aiwmVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        aiwmVar.b |= 1;
        aiwmVar.c = str2;
        java.lang.String str3 = acwbVar.d;
        akzxVarM.u();
        aiwm aiwmVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str3);
        aiwmVar2.b |= 4;
        aiwmVar2.e = str3;
        akzxVarM.u();
        aiwm aiwmVar3 = akzxVarM.b;
        aiwmVar3.b |= 64;
        aiwmVar3.i = j;
        akzxVarM.u();
        aiwm aiwmVar4 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        aiwmVar4.b |= 128;
        aiwmVar4.j = str;
        defpackage.akzx akzxVarL = acwbVar.L();
        akzxVarL.u();
        acwb acwbVar2 = akzxVarL.b;
        acwbVar2.b |= 8;
        acwbVar2.f = false;
        return q(this.d.g(akzxVarL.r()), new acyh(this, akzxVarM, acvhVar, 3));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v2, types: [aczw, java.lang.Object] */
    public final defpackage.ajcq o(acvu acvuVar, int i, int i2) {
        if (i >= i2) {
            return defpackage.aiql.z(java.lang.Boolean.TRUE);
        }
        acvr acvrVar = (acvr) acvuVar.o.get(i);
        if (defpackage.afsq.au(acvrVar)) {
            return o(acvuVar, i + 1, i2);
        }
        int iAQ = defpackage.a.aQ(acvuVar.j);
        acwe acweVarAB = defpackage.afsq.aB(acvrVar, iAQ != 0 ? iAQ : 1);
        defpackage.adlt adltVar = this.j;
        return q(defpackage.ahvr.I(adltVar.e.e(acweVarAB), new acze(adltVar, acweVarAB, 7, (byte[]) null), adltVar.h), new tbh(this, acvuVar, i, i2, 2));
    }

    public final defpackage.ajcq p(defpackage.ajcq ajcqVar, defpackage.ahyc ahycVar) {
        return defpackage.ahvr.H(ajcqVar, ahycVar, this.f);
    }

    public final defpackage.ajcq q(defpackage.ajcq ajcqVar, defpackage.ajat ajatVar) {
        return defpackage.ahvr.I(ajcqVar, ajatVar, this.f);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq r(acvu acvuVar, acvr acvrVar, acwe acweVar, long j) {
        defpackage.adlt adltVar = this.j;
        return q(defpackage.ahvr.I(adltVar.k(acweVar), new vkg(adltVar, j, acweVar, 3), adltVar.h), new zum(this, acvrVar, acvuVar, 16));
    }

    public final boolean t(java.lang.String str) {
        try {
            this.a.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final defpackage.ajcq x(acvu acvuVar, acvr acvrVar, acwe acweVar, acwg acwgVar, int i) {
        return q(z(acvuVar, acvrVar, acwgVar, acweVar, acvrVar.o, acvuVar.l, i), new acyo(this, i, acvuVar, acvrVar, acweVar, 0));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: adbt */
    public final defpackage.ajcq y(acvu acvuVar, acvr acvrVar, acwe acweVar, acwg acwgVar, int i) throws adbt {
        java.lang.String str = acvrVar.o;
        long j = acvuVar.l;
        int iAQ = defpackage.a.aQ(acweVar.f);
        if (iAQ == 0) {
            iAQ = 1;
        }
        android.content.Context context = this.a;
        android.net.Uri uriP = defpackage.abrz.P(context, iAQ, acwgVar.c, acvrVar.g, this.c, this.g, false);
        if (uriP == null) {
            defpackage.adbe.c("%s: Failed to get file uri!", "FileGroupManager");
            throw new adbt(28, "Failed to get local file uri");
        }
        defpackage.aogc aogcVar = this.m;
        return adcs.e(defpackage.ahvr.G(new vuh(context, str, aogcVar, uriP, acvrVar, acvuVar, 4), this.n)).g(new acyk(this, acvuVar, acvrVar, acwgVar, acweVar, str, j, i), this.f);
    }

    final defpackage.ajcq z(acvu acvuVar, acvr acvrVar, acwg acwgVar, acwe acweVar, java.lang.String str, long j, int i) {
        if (acwgVar.e && !u(acwgVar, j)) {
            B(this.b, acvuVar, acvrVar, i);
            return defpackage.aiql.z(java.lang.Boolean.TRUE);
        }
        long jMax = java.lang.Math.max(j, acwgVar.f);
        android.content.Context context = this.a;
        defpackage.aogc aogcVar = this.m;
        return q(defpackage.ahvr.G(new adbs(context, str, jMax, aogcVar, acvrVar, acvuVar), this.n), new acyd(this, acweVar, str, jMax, acvrVar, acvuVar, i));
    }
}
