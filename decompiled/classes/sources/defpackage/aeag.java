package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeag implements defpackage.adzw {
    public static final defpackage.aiof a = defpackage.aiof.i("GnpSdk");
    public final defpackage.amwu b;
    private final android.content.Context c;
    private final defpackage.adzq d;
    private final defpackage.aolr e;
    private final defpackage.aolr f;
    private final defpackage.apdp g;

    public aeag(android.content.Context context, defpackage.amwu amwuVar, defpackage.adzq adzqVar, defpackage.aolr aolrVar, defpackage.aolr aolrVar2) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (amwuVar == null) {
            defpackage.aooh.i("registrationDataStore");
        }
        if (adzqVar == null) {
            defpackage.aooh.i("registrationTokenManager");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        if (aolrVar2 == null) {
            defpackage.aooh.i("blockingContext");
        }
        this.c = context;
        this.b = amwuVar;
        this.d = adzqVar;
        this.e = aolrVar;
        this.f = aolrVar2;
        this.g = new defpackage.apdp();
    }

    @Override // defpackage.adzw
    public final defpackage.adtz a(boolean z) {
        defpackage.adtz adtzVarD = d(false, z, z ? (java.lang.String) defpackage.aoov.ah(this.f, new defpackage.unj(this, (defpackage.aoln) null, 20)) : null);
        if (!(adtzVarD instanceof defpackage.adub)) {
            return (defpackage.adtv) adtzVarD;
        }
        ajyi ajyiVarA = akmr.A(akpz.a.m());
        defpackage.akra akraVar = (defpackage.akra) ((defpackage.adub) adtzVarD).a;
        defpackage.akrg akrgVar = akraVar.b == 1 ? (defpackage.akrg) akraVar.c : defpackage.akrg.a;
        defpackage.akzx akzxVarM = akqd.a.m();
        if ((akrgVar.b & 1) != 0) {
            java.lang.String str = akrgVar.c;
            akzxVarM.u();
            akqd akqdVar = akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            akqdVar.b |= 1;
            akqdVar.c = str;
        }
        if ((akrgVar.b & 2) != 0) {
            java.lang.String str2 = akrgVar.d;
            akzxVarM.u();
            akqd akqdVar2 = akzxVarM.b;
            j$.util.Objects.requireNonNull(str2);
            akqdVar2.b |= 2;
            akqdVar2.d = str2;
        }
        if ((akrgVar.b & 4) != 0) {
            long j = akrgVar.e;
            akzxVarM.u();
            akqd akqdVar3 = akzxVarM.b;
            akqdVar3.b |= 4;
            akqdVar3.e = j;
        }
        if ((akrgVar.b & 8) != 0) {
            java.lang.String str3 = akrgVar.f;
            akzxVarM.u();
            akqd akqdVar4 = akzxVarM.b;
            j$.util.Objects.requireNonNull(str3);
            akqdVar4.b |= 8;
            akqdVar4.f = str3;
        }
        if ((akrgVar.b & 16) != 0) {
            long j2 = akrgVar.g;
            akzxVarM.u();
            akqd akqdVar5 = akzxVarM.b;
            akqdVar5.b |= 16;
            akqdVar5.g = j2;
        }
        akqd akqdVarR = akzxVarM.r();
        defpackage.aooh.e(akqdVarR, "apply(...)");
        ajyiVarA.D(akqdVarR);
        return new defpackage.adub(ajyiVarA.C());
    }

    @Override // defpackage.adzw
    public final java.lang.Object b(defpackage.adzv adzvVar, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.f, new aeae(this, adzvVar, (defpackage.aoln) null), aolnVar);
    }

    @Override // defpackage.adzw
    public final java.lang.Object c(defpackage.aoln aolnVar) {
        java.lang.Object objAj = defpackage.aoov.aj(this.e, new adzb(this, (defpackage.aoln) null, 2), aolnVar);
        return objAj != defpackage.aolu.a ? defpackage.aojh.a : objAj;
    }

    public final defpackage.adtz d(boolean z, boolean z2, java.lang.String str) {
        java.lang.SecurityException e;
        long jB;
        try {
            defpackage.akzx akzxVarM = defpackage.akra.a.m();
            defpackage.aooh.f(akzxVarM, "builder");
            defpackage.akzx akzxVarM2 = defpackage.akrg.a.m();
            defpackage.aooh.f(akzxVarM2, "builder");
            android.content.Context context = this.c;
            java.lang.String packageName = context.getPackageName();
            defpackage.aooh.e(packageName, "getPackageName(...)");
            defpackage.aooh.f(packageName, "value");
            akzxVarM2.u();
            defpackage.akrg akrgVar = (defpackage.akrg) akzxVarM2.b;
            j$.util.Objects.requireNonNull(packageName);
            akrgVar.b |= 8;
            akrgVar.f = packageName;
            java.lang.Object systemService = context.getSystemService("user");
            defpackage.aooh.d(systemService, "null cannot be cast to non-null type android.os.UserManager");
            long serialNumberForUser = ((android.os.UserManager) systemService).getSerialNumberForUser(android.os.Process.myUserHandle());
            if (serialNumberForUser != -1) {
                akzxVarM2.u();
                defpackage.akrg akrgVar2 = (defpackage.akrg) akzxVarM2.b;
                akrgVar2.b |= 16;
                akrgVar2.g = serialNumberForUser;
            }
            if (z) {
                java.lang.String strC = this.d.c();
                akzxVarM2.u();
                defpackage.akrg akrgVar3 = (defpackage.akrg) akzxVarM2.b;
                j$.util.Objects.requireNonNull(strC);
                akrgVar3.b |= 1;
                akrgVar3.c = strC;
            }
            if (str != null && str.length() != 0) {
                akzxVarM2.u();
                defpackage.akrg akrgVar4 = (defpackage.akrg) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str);
                akrgVar4.b |= 2;
                akrgVar4.d = str;
            }
            if (z2) {
                android.os.UserManager userManager = (android.os.UserManager) context.getSystemService("user");
                try {
                    if (!defpackage.ango.a.eZ().c() || userManager == null || userManager.isSystemUser()) {
                        jB = defpackage.aaym.b(context.getContentResolver(), -1L);
                        if (jB == -1) {
                            try {
                                ((defpackage.aiob) a.d()).v("Failed to get android ID.");
                            } catch (java.lang.SecurityException e2) {
                                e = e2;
                                ((defpackage.aiob) ((defpackage.aiob) a.c()).k(e)).v("Exception reading GServices key.");
                            }
                        }
                    } else {
                        jB = -1;
                    }
                } catch (java.lang.SecurityException e3) {
                    e = e3;
                    jB = -1;
                }
                if (jB != -1) {
                    akzxVarM2.u();
                    defpackage.akrg akrgVar5 = (defpackage.akrg) akzxVarM2.b;
                    akrgVar5.b |= 4;
                    akrgVar5.e = jB;
                }
            }
            defpackage.alad aladVarR = akzxVarM2.r();
            defpackage.aooh.e(aladVarR, "build(...)");
            defpackage.akrg akrgVar6 = (defpackage.akrg) aladVarR;
            defpackage.aooh.f(akrgVar6, "value");
            akzxVarM.u();
            defpackage.akra akraVar = (defpackage.akra) akzxVarM.b;
            j$.util.Objects.requireNonNull(akrgVar6);
            akraVar.c = akrgVar6;
            akraVar.b = 1;
            defpackage.alad aladVarR2 = akzxVarM.r();
            defpackage.aooh.e(aladVarR2, "build(...)");
            return new defpackage.adub((defpackage.akra) aladVarR2);
        } catch (defpackage.adzr e4) {
            return new aead(e4, defpackage.adty.g);
        }
    }

    public final java.lang.Object e(boolean z, defpackage.aoln aolnVar) {
        return defpackage.agab.bQ(this.g, new aeaf(this, z, (defpackage.aoln) null), aolnVar);
    }

    public final java.lang.Object f(defpackage.aoln aolnVar) {
        return defpackage.aoov.au(((defpackage.ecx) this.b.a()).b(), aolnVar);
    }
}
