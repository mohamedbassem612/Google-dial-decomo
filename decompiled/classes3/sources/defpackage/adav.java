package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class adav implements ajat {
    public final /* synthetic */ adax a;
    public final /* synthetic */ defpackage.acwb b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ java.lang.String e;
    public final /* synthetic */ android.net.Uri f;
    public final /* synthetic */ java.lang.String g;
    public final /* synthetic */ long h;
    public final /* synthetic */ defpackage.acvw i;
    public final /* synthetic */ int j;
    public final /* synthetic */ java.util.List k;
    public final /* synthetic */ akyp l;

    public /* synthetic */ adav(adax adaxVar, defpackage.acwb acwbVar, int i, long j, java.lang.String str, android.net.Uri uri, java.lang.String str2, long j2, defpackage.acvw acvwVar, int i2, java.util.List list, akyp akypVar) {
        this.a = adaxVar;
        this.b = acwbVar;
        this.c = i;
        this.d = j;
        this.e = str;
        this.f = uri;
        this.g = str2;
        this.h = j2;
        this.i = acvwVar;
        this.j = i2;
        this.k = list;
        this.l = akypVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: acvh */
    public final ajcq a(java.lang.Object obj) {
        long jK;
        int i;
        int iAQ;
        float fMin;
        java.lang.String str = this.g;
        adax adaxVar = this.a;
        android.net.Uri uri = this.f;
        long j = this.h;
        if (str.startsWith("http") && adaxVar.g.A() && !str.startsWith("https")) {
            adbe.d("%s: File url = %s is not secure", "MddFileDownloader", str);
            yg ygVarB = acvh.b();
            ygVarB.b = defpackage.acvg.INSECURE_URL_ERROR;
            return aiql.y(ygVarB.d());
        }
        try {
            jK = adaxVar.i.K(uri);
        } catch (java.io.IOException unused) {
            jK = 0;
        }
        try {
            android.content.Context context = adaxVar.a;
            long j2 = j - jK;
            acvl acvlVar = adaxVar.g;
            boolean zK = acvlVar.K();
            defpackage.acvw acvwVar = this.i;
            if (zK && (!afsq.ar(str, new aile("inlinefile")) || j2 != 0)) {
                android.os.StatFs statFs = new android.os.StatFs(context.getFilesDir().getAbsolutePath());
                long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
                long availableBlocks = (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) - j2;
                float f = blockCount;
                double dMin = java.lang.Math.min(acvlVar.a() * f, acvlVar.o());
                if (acvwVar != null) {
                    int iAQ2 = a.aQ(acvwVar.c);
                    if (iAQ2 == 0) {
                        iAQ2 = 1;
                    }
                    int i2 = iAQ2 - 1;
                    if (i2 == 1) {
                        fMin = java.lang.Math.min(f * acvlVar.a(), acvlVar.c());
                    } else if (i2 == 2) {
                        fMin = java.lang.Math.min(f * acvlVar.a(), acvlVar.b());
                    }
                    dMin = fMin;
                }
                if (availableBlocks <= dMin) {
                    yg ygVarB2 = acvh.b();
                    ygVarB2.b = defpackage.acvg.LOW_DISK_ERROR;
                    throw ygVarB2.d();
                }
            }
            defpackage.acwb acwbVar = this.b;
            if (acvlVar.M()) {
                int i3 = this.c;
                long j3 = this.d;
                java.lang.String str2 = this.e;
                adch adchVar = adaxVar.c;
                adbf adbfVar = adaxVar.e;
                akzx akzxVarM = defpackage.acvy.a.m();
                akzxVarM.u();
                defpackage.acvy acvyVar = (defpackage.acvy) akzxVarM.b;
                j$.util.Objects.requireNonNull(acwbVar);
                acvyVar.c = acwbVar;
                i = 4;
                acvyVar.b |= 1;
                akzxVarM.u();
                defpackage.acvy acvyVar2 = (defpackage.acvy) akzxVarM.b;
                acvyVar2.b |= 2;
                acvyVar2.d = j3;
                akzxVarM.u();
                defpackage.acvy acvyVar3 = (defpackage.acvy) akzxVarM.b;
                j$.util.Objects.requireNonNull(str2);
                acvyVar3.b |= 4;
                acvyVar3.e = str2;
                akzxVarM.u();
                defpackage.acvy acvyVar4 = (defpackage.acvy) akzxVarM.b;
                acvyVar4.b |= 8;
                acvyVar4.f = i3;
                defpackage.acvy acvyVar5 = (defpackage.acvy) akzxVarM.p();
                synchronized (adchVar.b) {
                    java.util.HashMap map = adchVar.c;
                    if (!map.containsKey(acvyVar5)) {
                        defpackage.adcg adcgVar = new defpackage.adcg(adchVar.a, adbfVar, acvyVar5);
                        j$.util.Objects.requireNonNull(adchVar.e);
                        map.put(acvyVar5, new defpackage.affl(adcgVar, new defpackage.adcf(0), 10L, java.util.concurrent.TimeUnit.SECONDS));
                    }
                    adchVar.d.put(uri, (defpackage.affl) map.get(acvyVar5));
                }
            } else {
                i = 4;
                adbe.h("%s: NetworkUsageMonitor is disabled", "MddFileDownloader");
            }
            ahyn ahynVar = adaxVar.d;
            if (ahynVar.f()) {
                adce adceVar = (adce) ahynVar.b();
                java.lang.String str3 = acwbVar.c;
                synchronized (adce.class) {
                    adceVar.b.put(uri, str3);
                }
            }
            defpackage.acxn acxnVarA = defpackage.acxo.a();
            acxnVarA.e(uri);
            acxnVarA.g(str);
            if (acvwVar == null || (iAQ = a.aQ(acvwVar.d)) == 0 || iAQ != 2) {
                acxnVarA.c(defpackage.acxm.b);
            } else {
                acxnVarA.c(defpackage.acxm.c);
            }
            int i4 = this.j;
            if (i4 > 0) {
                acxnVarA.f(i4);
            }
            java.util.List<defpackage.acvx> list = this.k;
            aift aiftVar = new aift(i);
            for (defpackage.acvx acvxVar : list) {
                aiftVar.i(android.util.Pair.create(acvxVar.b, acvxVar.c));
            }
            akyp akypVar = this.l;
            acxnVarA.d(aiftVar.h());
            acxnVarA.b(akypVar);
            return ((defpackage.abtr) adaxVar.b.eZ()).b(acxnVarA.a());
        } catch (acvh e) {
            adbe.d("%s: Not enough space to download file %s", "MddFileDownloader", str);
            return aiql.y(e);
        }
    }
}
