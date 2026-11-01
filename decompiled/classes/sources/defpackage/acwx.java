package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acwx implements defpackage.acwi {
    public final android.content.Context a;
    public final defpackage.adba b;
    public final defpackage.ahyn c;
    public final defpackage.aczk d;
    public final defpackage.acvl e;
    public final java.util.concurrent.Executor f;
    public final defpackage.ahyn g;
    public final defpackage.ahyn h;
    public final defpackage.ahbq j;
    public final defpackage.ahbq k;
    public final defpackage.aogc l;
    public final defpackage.agab m;
    private final java.util.List n;
    private final defpackage.aogc p;
    private final defpackage.tvn o = new defpackage.tvn((byte[]) null, (byte[]) null);
    public final defpackage.ajat i = new defpackage.uqd(2);

    public acwx(android.content.Context context, defpackage.adba adbaVar, defpackage.aczk aczkVar, java.util.concurrent.Executor executor, java.util.List list, defpackage.ahyn ahynVar, defpackage.aogc aogcVar, defpackage.ahyn ahynVar2, defpackage.ahyn ahynVar3, defpackage.acvl acvlVar, defpackage.aogc aogcVar2, defpackage.agab agabVar) {
        this.a = context;
        this.b = adbaVar;
        this.n = list;
        this.c = ahynVar;
        this.f = executor;
        this.d = aczkVar;
        this.l = aogcVar;
        this.g = ahynVar2;
        this.h = ahynVar3;
        this.e = acvlVar;
        this.p = aogcVar2;
        this.k = defpackage.ahbq.l(executor);
        this.j = new defpackage.ahbq(executor, new defpackage.adcc(ahynVar3, context, 1));
        this.m = agabVar;
    }

    public static defpackage.ahyn h(acwb acwbVar, acvu acvuVar, defpackage.acvl acvlVar) {
        if (acvlVar.G()) {
            return (acwbVar.b & 16) != 0 ? defpackage.ahyn.h(acwbVar.g) : defpackage.ahwt.a;
        }
        return acvuVar != null ? defpackage.ahyn.h(acvuVar.t) : defpackage.ahwt.a;
    }

    public static aiwm i(acui acuiVar) {
        defpackage.akzx akzxVarM = aiwm.a.m();
        java.lang.String str = acuiVar.c;
        akzxVarM.u();
        aiwm aiwmVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        aiwmVar.b |= 1;
        aiwmVar.c = str;
        java.lang.String str2 = acuiVar.d;
        akzxVarM.u();
        aiwm aiwmVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        aiwmVar2.b |= 4;
        aiwmVar2.e = str2;
        int i = acuiVar.f;
        akzxVarM.u();
        aiwm aiwmVar3 = akzxVarM.b;
        aiwmVar3.b |= 2;
        aiwmVar3.d = i;
        int size = acuiVar.h.size();
        akzxVarM.u();
        aiwm aiwmVar4 = akzxVarM.b;
        aiwmVar4.b |= 8;
        aiwmVar4.f = size;
        java.lang.String str3 = acuiVar.j;
        akzxVarM.u();
        aiwm aiwmVar5 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str3);
        aiwmVar5.b |= 128;
        aiwmVar5.j = str3;
        long j = acuiVar.i;
        akzxVarM.u();
        aiwm aiwmVar6 = akzxVarM.b;
        aiwmVar6.b |= 64;
        aiwmVar6.i = j;
        return akzxVarM.r();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
    public static final defpackage.ahyn l(defpackage.ahyn ahynVar, java.util.Map map, java.lang.String str) {
        return (ahynVar.f() && ahynVar.b().containsKey(str)) ? defpackage.ahyn.g((defpackage.acxd) ahynVar.b().get(str)) : defpackage.ahyn.g((defpackage.acxd) map.get(str));
    }

    public static java.util.List m(defpackage.aogc aogcVar, android.net.Uri uri, java.lang.String str) throws defpackage.affa {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.net.Uri uri2 : aogcVar.L(uri)) {
            if (aogcVar.S(uri2)) {
                arrayList.addAll(m(aogcVar, uri2, str));
            } else {
                java.lang.String path = uri2.getPath();
                if (path != null) {
                    long jK = aogcVar.K(uri2);
                    defpackage.akzz akzzVar = (defpackage.akzz) acuh.a.m();
                    java.lang.String strReplaceFirst = path.replaceFirst(str, "");
                    akzzVar.u();
                    acuh acuhVar = akzzVar.b;
                    j$.util.Objects.requireNonNull(strReplaceFirst);
                    acuhVar.b |= 1;
                    acuhVar.c = strReplaceFirst;
                    akzzVar.u();
                    acuh acuhVar2 = akzzVar.b;
                    acuhVar2.b |= 4;
                    acuhVar2.e = (int) jK;
                    java.lang.String string = uri2.toString();
                    akzzVar.u();
                    acuh acuhVar3 = akzzVar.b;
                    j$.util.Objects.requireNonNull(string);
                    acuhVar3.b |= 2;
                    acuhVar3.d = string;
                    if (jK > 2147483647L) {
                        defpackage.apdi apdiVar = acuj.e;
                        defpackage.akzx akzxVarM = acuj.a.m();
                        akzxVarM.u();
                        acuj acujVar = akzxVarM.b;
                        acujVar.b |= 1;
                        acujVar.c = jK;
                        akzzVar.bV(apdiVar, akzxVarM.r());
                    }
                    arrayList.add(akzzVar.r());
                }
            }
        }
        return arrayList;
    }

    public static defpackage.ajcq n(acvu acvuVar, defpackage.ahyn ahynVar, java.lang.String str, boolean z, defpackage.aczk aczkVar, java.util.concurrent.Executor executor, defpackage.aogc aogcVar) {
        if (acvuVar == null) {
            return defpackage.aiql.z(null);
        }
        defpackage.akzx akzxVarM = acui.a.m();
        java.lang.String str2 = acvuVar.d;
        akzxVarM.u();
        acui acuiVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        acuiVar.b |= 1;
        acuiVar.c = str2;
        java.lang.String str3 = acvuVar.e;
        akzxVarM.u();
        acui acuiVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str3);
        acuiVar2.b |= 2;
        acuiVar2.d = str3;
        int i = acvuVar.f;
        akzxVarM.u();
        acui acuiVar3 = akzxVarM.b;
        acuiVar3.b |= 8;
        acuiVar3.f = i;
        defpackage.akyp akypVar = acvuVar.g;
        if (akypVar == null) {
            akypVar = defpackage.akyp.a;
        }
        akzxVarM.u();
        acui acuiVar4 = akzxVarM.b;
        j$.util.Objects.requireNonNull(akypVar);
        acuiVar4.l = akypVar;
        acuiVar4.b |= 128;
        long j = acvuVar.s;
        akzxVarM.u();
        acui acuiVar5 = akzxVarM.b;
        acuiVar5.b |= 32;
        acuiVar5.i = j;
        akzxVarM.u();
        acui acuiVar6 = akzxVarM.b;
        acuiVar6.g = 1;
        acuiVar6.b |= 16;
        defpackage.alat alatVar = acvuVar.u;
        akzxVarM.u();
        acui acuiVar7 = akzxVarM.b;
        defpackage.alat alatVar2 = acuiVar7.k;
        if (!alatVar2.c()) {
            acuiVar7.k = defpackage.alad.J(alatVar2);
        }
        defpackage.akyl.i(alatVar, acuiVar7.k);
        if (ahynVar.f()) {
            java.lang.Object objB = ahynVar.b();
            akzxVarM.u();
            acui acuiVar8 = akzxVarM.b;
            j$.util.Objects.requireNonNull(objB);
            acuiVar8.b |= 64;
            acuiVar8.j = (java.lang.String) objB;
        }
        if (str != null) {
            akzxVarM.u();
            acui acuiVar9 = akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            acuiVar9.b |= 4;
            acuiVar9.e = str;
        }
        if ((acvuVar.b & 32) != 0) {
            defpackage.akyp akypVar2 = acvuVar.h;
            if (akypVar2 == null) {
                akypVar2 = defpackage.akyp.a;
            }
            akzxVarM.u();
            acui acuiVar10 = akzxVarM.b;
            j$.util.Objects.requireNonNull(akypVar2);
            acuiVar10.m = akypVar2;
            acuiVar10.b |= 256;
        }
        defpackage.alat alatVar3 = acvuVar.o;
        defpackage.ajcq ajcqVar = defpackage.ajcm.a;
        if (acvuVar.n) {
            java.lang.String string = defpackage.afsq.an(aczkVar.b, aczkVar.h, acvuVar).toString();
            akzxVarM.u();
            acui acuiVar11 = akzxVarM.b;
            j$.util.Objects.requireNonNull(string);
            acuiVar11.b |= 1024;
            acuiVar11.n = string;
        }
        int i2 = defpackage.adbe.a;
        boolean zAt = defpackage.afsq.at(acvuVar);
        defpackage.aigb aigbVar = new defpackage.aigb(4);
        if (zAt) {
            aigbVar.l(aczkVar.d.b(acvuVar));
        }
        defpackage.aigf aigfVarE = aigbVar.e(false);
        adcs adcsVarE = adcs.e(aczkVar.e());
        aczj aczjVar = new aczj(aczkVar, zAt, z, acvuVar, 0);
        java.util.concurrent.Executor executor2 = aczkVar.i;
        return adcs.e(adcs.e(adcsVarE.g(aczjVar, executor2).f(new aczd(aczkVar, zAt, z, aigfVarE), executor2).f(new acym(aczkVar, 5), executor2)).g(new acws(alatVar3, aogcVar, akzxVarM), executor)).f(new zqi(akzxVarM, 16), executor).b(defpackage.acvh.class, new ymu(18), executor);
    }

    private final defpackage.ajcq o(boolean z) {
        adcs adcsVarE = adcs.e(k());
        icz iczVar = new icz(this, z, 7);
        java.util.concurrent.Executor executor = this.f;
        return adcsVarE.g(iczVar, executor).g(new acwk(this, 2), executor).g(new icz(this, z, 8), executor);
    }

    private final void p(int i, defpackage.ajcq ajcqVar, long j, aiwm aiwmVar, acww acwwVar, acwv acwvVar) {
        ajcqVar.c(defpackage.ahqx.h(new acwo(this, j, aiwmVar, ajcqVar, acwvVar, acwwVar, i, 1)), defpackage.ajbm.INSTANCE);
    }

    @Override // defpackage.acwi
    public final defpackage.ajcq a(acuo acuoVar) {
        long jB = defpackage.aazc.b();
        defpackage.ajcq ajcqVarAf = this.o.af(new wwg(this, acuoVar, 16), this.f);
        defpackage.akzx akzxVarM = aiwm.a.m();
        defpackage.acux acuxVar = acuoVar.a;
        java.lang.String str = acuxVar.c;
        akzxVarM.u();
        aiwm aiwmVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        aiwmVar.b |= 1;
        aiwmVar.c = str;
        long j = acuxVar.i;
        akzxVarM.u();
        aiwm aiwmVar2 = akzxVarM.b;
        aiwmVar2.b |= 64;
        aiwmVar2.i = j;
        java.lang.String str2 = acuxVar.j;
        akzxVarM.u();
        aiwm aiwmVar3 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        aiwmVar3.b |= 128;
        aiwmVar3.j = str2;
        boolean zF = acuoVar.b.f();
        akzxVarM.u();
        aiwm aiwmVar4 = akzxVarM.b;
        aiwmVar4.b |= 32;
        aiwmVar4.h = zF;
        akzxVarM.u();
        aiwm aiwmVar5 = akzxVarM.b;
        aiwmVar5.b |= 256;
        aiwmVar5.k = false;
        int i = acuxVar.e;
        akzxVarM.u();
        aiwm aiwmVar6 = akzxVarM.b;
        aiwmVar6.b |= 2;
        aiwmVar6.d = i;
        java.lang.String str3 = acuxVar.d;
        akzxVarM.u();
        aiwm aiwmVar7 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str3);
        aiwmVar7.b |= 4;
        aiwmVar7.e = str3;
        int size = acuxVar.h.size();
        akzxVarM.u();
        aiwm aiwmVar8 = akzxVarM.b;
        aiwmVar8.b |= 8;
        aiwmVar8.f = size;
        aiwm aiwmVar9 = (aiwm) akzxVarM.r();
        p(3, ajcqVarAf, jB, aiwmVar9, new acwq(aiwmVar9), new acwr(0));
        return ajcqVarAf;
    }

    @Override // defpackage.acwi
    public final defpackage.ajcq b(acvj acvjVar) {
        return defpackage.ahvr.G(new wwg(this, acvjVar, 14), this.f);
    }

    @Override // defpackage.acwi
    public final defpackage.ajcq c(acvj acvjVar) {
        this.a.getPackageName();
        int i = defpackage.adbe.a;
        if (!this.h.f()) {
            return defpackage.aiql.y(new java.lang.IllegalArgumentException("downloadFileGroupWithForegroundService: ForegroundDownloadService is not provided!"));
        }
        if (this.g.f()) {
            return defpackage.ahvr.G(new wwg(this, acvjVar, 17), this.f);
        }
        yg ygVarB = defpackage.acvh.b();
        ygVarB.b = acvg.r;
        ygVarB.d = "downloadFileGroupWithForegroundService: Download Monitor is not provided!";
        return defpackage.aiql.y(ygVarB.d());
    }

    @Override // defpackage.acwi
    public final defpackage.ajcq d(acvn acvnVar) {
        long jB = defpackage.aazc.b();
        defpackage.ajcq ajcqVarAf = this.o.af(new wwg(this, acvnVar, 15), this.f);
        defpackage.akzx akzxVarM = aiwm.a.m();
        akzxVarM.u();
        aiwm aiwmVar = akzxVarM.b;
        java.lang.String str = acvnVar.a;
        j$.util.Objects.requireNonNull(str);
        aiwmVar.b |= 1;
        aiwmVar.c = str;
        akzxVarM.u();
        aiwm aiwmVar2 = akzxVarM.b;
        aiwmVar2.b |= 32;
        aiwmVar2.h = false;
        akzxVarM.u();
        aiwm aiwmVar3 = akzxVarM.b;
        aiwmVar3.b |= 2;
        aiwmVar3.d = -1;
        akzxVarM.u();
        aiwm aiwmVar4 = akzxVarM.b;
        aiwmVar4.b |= 64;
        aiwmVar4.i = -1L;
        p(4, ajcqVarAf, jB, (aiwm) akzxVarM.r(), new acwl(), new acwr(1));
        return ajcqVarAf;
    }

    @Override // defpackage.acwi
    public final defpackage.ajcq e(defpackage.acwz acwzVar) {
        return this.o.ae(new defpackage.nyf(this, acwzVar, 11), this.f);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.acwi
    public final void f(java.lang.String str) {
        int i = defpackage.adbe.a;
        defpackage.ahvr.I(this.j.g(str), new acwn(2), this.f);
        defpackage.aogc aogcVar = this.p;
        defpackage.ajcq ajcqVarF = ((defpackage.ahbq) aogcVar.c).f(str);
        acze aczeVar = new acze(aogcVar, str, 14);
        ?? r3 = aogcVar.a;
        defpackage.ahvr.I(defpackage.ahvr.I(ajcqVarF, aczeVar, r3), new acwn(12), r3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    @Override // defpackage.acwi
    public final defpackage.ajcq g(java.lang.String str, defpackage.ahyn ahynVar) {
        defpackage.ajcq ajcqVarY;
        switch (str) {
            case "MDD.MAINTENANCE.PERIODIC.GCM.TASK":
                defpackage.tvn tvnVar = this.o;
                defpackage.aczk aczkVar = this.d;
                j$.util.Objects.requireNonNull(aczkVar);
                ajcqVarY = tvnVar.af(new defpackage.xbw(aczkVar, 18), this.f);
                break;
            case "MDD.CELLULAR.CHARGING.PERIODIC.TASK":
                ajcqVarY = o(false);
                break;
            case "MDD.CHARGING.PERIODIC.TASK":
                ajcqVarY = defpackage.ahvr.I(k(), defpackage.ahqx.c(new acwk(this, 3)), this.f);
                break;
            case "MDD.WIFI.CHARGING.PERIODIC.TASK":
                ajcqVarY = o(true);
                break;
            default:
                int i = defpackage.adbe.a;
                ajcqVarY = defpackage.aiql.y(new java.lang.IllegalArgumentException("Unknown task tag sent to MDD.handleTask() ".concat(str)));
                break;
        }
        defpackage.ahyn ahynVarA = ahynVar.a(new ymu(17));
        adcs adcsVarE = adcs.e(ajcqVarY);
        zum zumVar = new zum(this, str, ahynVarA, 10, (byte[]) null);
        java.util.concurrent.Executor executor = this.f;
        return adcsVarE.g(zumVar, executor).d(java.lang.Exception.class, new zum(this, str, ahynVarA, 11, (byte[]) null), executor);
    }

    public final defpackage.ajcq j(acvj acvjVar) {
        java.lang.String str = acvjVar.a;
        acxu acxuVarA = acxu.a(str);
        defpackage.akzx akzxVarM = acwb.a.m();
        akzxVarM.u();
        acwb acwbVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        acwbVar.b |= 1;
        acwbVar.c = str;
        java.lang.String packageName = this.a.getPackageName();
        akzxVarM.u();
        acwb acwbVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(packageName);
        acwbVar2.b |= 2;
        acwbVar2.d = packageName;
        return this.o.af(new defpackage.uej(this, acxuVarA, akzxVarM.r(), acvjVar, str, 6), this.f);
    }

    public final defpackage.ajcq k() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.n.iterator();
        while (it.hasNext()) {
            arrayList.add(((defpackage.acvk) it.next()).a(this));
        }
        return defpackage.abrz.ac(arrayList).D(new vnc(14), this.f);
    }
}
