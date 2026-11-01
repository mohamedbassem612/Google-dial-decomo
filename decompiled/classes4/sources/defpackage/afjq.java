package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class afjq {
    protected final android.content.Context a;
    public final java.lang.String b;
    protected final java.lang.String c;
    protected final java.lang.String d;
    public oqf e;
    private final android.os.Handler f;
    private anor g;
    private java.lang.String h;
    private final aprf i;

    public afjq(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f = new android.os.Handler(android.os.Looper.getMainLooper());
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    static anpc f() {
        anoz anozVar = anph.b;
        int i = anpc.d;
        return new anoy("Cookie", anozVar);
    }

    public final com.google.android.libraries.surveys.SurveyData a(defpackage.amhl amhlVar) {
        java.lang.String str = amhlVar.g;
        amip amipVar = amhlVar.d;
        if (amipVar == null) {
            amipVar = amip.a;
        }
        amip amipVar2 = amipVar;
        java.lang.String str2 = this.b;
        if (android.text.TextUtils.isEmpty(str2)) {
            throw new java.lang.IllegalArgumentException("Trigger ID cannot be null or empty.");
        }
        if (amipVar2 == null) {
            throw new java.lang.IllegalArgumentException("Payload is null.");
        }
        defpackage.amje amjeVar = amhlVar.c;
        if (amjeVar == null) {
            amjeVar = defpackage.amje.a;
        }
        defpackage.amje amjeVar2 = amjeVar;
        java.lang.String str3 = amhlVar.e;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        aify aifyVarN = aify.n(amhlVar.f);
        if (jCurrentTimeMillis != 0) {
            return new com.google.android.libraries.surveys.internal.model.SurveyDataImpl(str2, str, jCurrentTimeMillis, amjeVar2, amipVar2, str3, aifyVarN);
        }
        throw new java.lang.IllegalStateException("Trigger time is not set");
    }

    public final void b(afjd afjdVar) {
        if (this.e != null) {
            this.f.post(new aekf(this, afjdVar, 12, (byte[]) null));
        } else {
            android.util.Log.w("SurveyNetworkConnection", "RequestSurveyCallback was null for trigger request.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:18:? A[RETURN, SYNTHETIC] */
    public final ahwd c() {
        defpackage.afje afjeVar;
        android.content.Context context = this.a;
        java.lang.String str = this.c;
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                ahvu ahvuVar = new ahvu(new zxi(context).b(context, new android.accounts.Account(str, "com.google"), "oauth2:https://www.googleapis.com/auth/supportcontent"));
                j$.time.Duration duration = ahwd.b;
                afjeVar = new defpackage.afje(new ahwd(ahvuVar, ahwd.c, ahwd.b));
            } catch (java.lang.Exception e) {
                android.util.Log.e("GoogleAuthProviderImpl", "Exception occurred while getting auth credentials", e);
                afjeVar = null;
            } catch (com.google.android.gms.auth.UserRecoverableAuthException e2) {
                android.util.Log.e("GoogleAuthProviderImpl", "User recoverable exception happened while getting authentication token. You need to allowlist your application.", e2);
                afjeVar = null;
            }
            if (afjeVar instanceof defpackage.afje) {
                return afjeVar.a;
            }
            return null;
        }
        android.util.Log.w("GoogleAuthProviderImpl", "Account was not set.");
        afjeVar = null;
        if (afjeVar instanceof defpackage.afje) {
            return afjeVar.a;
        }
        return null;
    }

    public final anmc d(ahwd ahwdVar) {
        java.lang.String strE;
        zoe zoeVar;
        try {
            long j = defpackage.afjz.a;
            if (android.text.TextUtils.isEmpty(this.h) && (zoeVar = afjg.a.d) != null) {
                this.h = zoeVar.G();
            }
            this.g = defpackage.anue.h(afjg.a.a(), 443, (org.chromium.net.CronetEngine) this.i.a).a();
            java.lang.String str = this.h;
            anph anphVar = new anph();
            aehj aehjVar = defpackage.afjy.c;
            android.content.Context context = defpackage.afjy.b;
            if (!defpackage.afjy.b(true)) {
                anphVar.h(f(), str);
            } else if (ahwdVar == null && !android.text.TextUtils.isEmpty(str)) {
                anphVar.h(f(), str);
            }
            java.lang.String str2 = this.d;
            if (!android.text.TextUtils.isEmpty(str2)) {
                anoz anozVar = anph.b;
                int i = anpc.d;
                anphVar.h(new anoy("X-Goog-Api-Key", anozVar), str2);
            }
            android.content.Context context2 = this.a;
            try {
                strE = defpackage.afjz.e(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 64));
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                android.util.Log.e("SurveyUtils", "Package not found.", e);
                strE = null;
            }
            if (!android.text.TextUtils.isEmpty(strE)) {
                anoz anozVar2 = anph.b;
                int i2 = anpc.d;
                anphVar.h(new anoy("X-Android-Cert", anozVar2), strE);
            }
            java.lang.String packageName = this.a.getPackageName();
            if (!android.text.TextUtils.isEmpty(packageName)) {
                anoz anozVar3 = anph.b;
                int i3 = anpc.d;
                anphVar.h(new anoy("X-Android-Package", anozVar3), packageName);
            }
            anoz anozVar4 = anph.b;
            int i4 = anpc.d;
            anphVar.h(new anoy("Authority", anozVar4), afjg.a.a());
            return ajsz.dt(this.g, new anme[]{new aohs(anphVar)});
        } catch (java.lang.Exception e2) {
            android.util.Log.e("NetworkCallerGrpc", "Could not get managed channel.", e2);
            e();
            return null;
        }
    }

    public final void e() {
        anor anorVar = this.g;
        if (anorVar != null) {
            anorVar.d();
        }
    }

    public final void g(defpackage.amhk amhkVar, defpackage.amhl amhlVar, apdh apdhVar) {
        aekf tblVar;
        defpackage.amhl amhlVar2;
        defpackage.afjq afjqVar;
        if (amhlVar == null) {
            android.util.Log.e("SurveyNetworkConnection", "Survey trigger response was null for trigger id: ".concat(java.lang.String.valueOf(this.b)));
            b(afjd.b);
            return;
        }
        amip amipVar = amhlVar.d;
        if (amipVar == null) {
            amipVar = amip.a;
        }
        if (amipVar.g.size() == 0) {
            b(afjd.c);
            return;
        }
        long j = defpackage.afjz.a;
        if (this.e == null) {
            android.util.Log.w("SurveyNetworkConnection", "RequestSurveyCallback was null for trigger request.");
            return;
        }
        amip amipVar2 = amhlVar.d;
        if (amipVar2 == null) {
            amipVar2 = amip.a;
        }
        defpackage.amhz amhzVar = amipVar2.e;
        if (amhzVar == null) {
            amhzVar = defpackage.amhz.b;
        }
        defpackage.amhx amhxVar = amhzVar.d;
        if (amhxVar == null) {
            amhxVar = defpackage.amhx.a;
        }
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        akzm akzmVar = amhxVar.b;
        if (akzmVar == null) {
            akzmVar = akzm.a;
        }
        long millis = timeUnit.toMillis(akzmVar.b);
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.NANOSECONDS;
        akzm akzmVar2 = amhxVar.b;
        if (akzmVar2 == null) {
            akzmVar2 = akzm.a;
        }
        long j2 = millis + (((long) akzmVar2.c) / 1000000);
        android.os.Handler handler = this.f;
        if (j2 < 100) {
            tblVar = new aekf(this, amhlVar, 11);
            afjqVar = this;
            amhlVar2 = amhlVar;
        } else {
            amhlVar2 = amhlVar;
            afjqVar = this;
            tblVar = new tbl(afjqVar, j2, amhlVar2, 3);
        }
        handler.post(tblVar);
        android.content.Context context = afjqVar.a;
        java.lang.String str = afjqVar.c;
        if (true == android.text.TextUtils.isEmpty(str)) {
            str = null;
        }
        aehj.B(amhkVar, amhlVar2, apdhVar, context, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [afjq] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v8, types: [anan, java.lang.Object] */
    public final /* synthetic */ void h(defpackage.amhk amhkVar, apdh apdhVar) {
        defpackage.afjq afjqVar;
        defpackage.amhk amhkVarA;
        apdh apdhVar2;
        ajcq ajcqVarA;
        defpackage.anpk anpkVarA;
        defpackage.anpk anpkVarA2;
        ajcq ajcqVarA2;
        defpackage.anpk anpkVarA3;
        defpackage.anpk anpkVarA4;
        try {
            ahwd ahwdVarC = c();
            anmc anmcVarD = d(ahwdVarC);
            if (anmcVarD == null) {
                android.util.Log.e("NetworkCallerGrpc", "Could not get channel for trigger.");
                return;
            }
            afjqVar = afjg.a.b;
            try {
                if (afjqVar == 0) {
                    afjqVar = this;
                    amhkVarA = amhkVar;
                    apdhVar2 = apdhVar;
                    if (ahwdVarC != null) {
                        defpackage.amjj amjjVar = (defpackage.amjj) defpackage.amjk.a(anmcVarD).l(new defpackage.anrj(ahwdVarC));
                        anmc anmcVar = ((aohh) amjjVar).a;
                        defpackage.anpk anpkVar = defpackage.amjk.a;
                        if (anpkVar == null) {
                            synchronized (defpackage.amjk.class) {
                                try {
                                    anpkVarA4 = defpackage.amjk.a;
                                    if (anpkVarA4 == null) {
                                        defpackage.aal aalVarD = defpackage.anpk.d();
                                        aalVarD.b = defpackage.anpj.a;
                                        aalVarD.d = defpackage.anpk.c("scone.v1.SurveyService", "Trigger");
                                        aalVarD.b();
                                        defpackage.amhk amhkVar2 = defpackage.amhk.a;
                                        akzq akzqVar = aohd.a;
                                        aalVarD.e = new defpackage.aohc(amhkVar2);
                                        aalVarD.c = new defpackage.aohc(defpackage.amhl.a);
                                        anpkVarA4 = aalVarD.a();
                                        defpackage.amjk.a = anpkVarA4;
                                    }
                                } catch (java.lang.Throwable th) {
                                    throw th;
                                }
                            }
                            anpkVar = anpkVarA4;
                        }
                        ajcqVarA2 = defpackage.aohp.a(anmcVar.b(anpkVar, ((aohh) amjjVar).b), amhkVarA);
                    } else {
                        defpackage.amjj amjjVarA = defpackage.amjk.a(anmcVarD);
                        anmc anmcVar2 = ((aohh) amjjVarA).a;
                        defpackage.anpk anpkVar2 = defpackage.amjk.b;
                        if (anpkVar2 == null) {
                            synchronized (defpackage.amjk.class) {
                                try {
                                    anpkVarA3 = defpackage.amjk.b;
                                    if (anpkVarA3 == null) {
                                        defpackage.aal aalVarD2 = defpackage.anpk.d();
                                        aalVarD2.b = defpackage.anpj.a;
                                        aalVarD2.d = defpackage.anpk.c("scone.v1.SurveyService", "TriggerAnonymous");
                                        aalVarD2.b();
                                        defpackage.amhk amhkVar3 = defpackage.amhk.a;
                                        akzq akzqVar2 = aohd.a;
                                        aalVarD2.e = new defpackage.aohc(amhkVar3);
                                        aalVarD2.c = new defpackage.aohc(defpackage.amhl.a);
                                        anpkVarA3 = aalVarD2.a();
                                        defpackage.amjk.b = anpkVarA3;
                                    }
                                } catch (java.lang.Throwable th2) {
                                    throw th2;
                                }
                            }
                            anpkVar2 = anpkVarA3;
                        }
                        ajcqVarA2 = defpackage.aohp.a(anmcVar2.b(anpkVar2, ((aohh) amjjVarA).b), amhkVarA);
                    }
                    aiql.I(ajcqVarA2, new afjo((defpackage.afjq) afjqVar, amhkVarA, apdhVar2, 3), afjm.a());
                    return;
                }
                try {
                    akzc akzcVarF = amhkVar.f();
                    amhkVarA = akzq.a();
                    apdhVar2 = defpackage.anan.a;
                    afjqVar = (defpackage.anan) alad.z(apdhVar2, akzcVarF, amhkVarA);
                    if (ahwdVarC != null) {
                        defpackage.anaq anaqVar = (defpackage.anaq) anar.d(anmcVarD).l(new defpackage.anrj(ahwdVarC));
                        anmc anmcVar3 = ((aohh) anaqVar).a;
                        defpackage.anpk anpkVar3 = anar.g;
                        if (anpkVar3 == null) {
                            synchronized (anar.class) {
                                try {
                                    anpkVarA2 = anar.g;
                                    if (anpkVarA2 == null) {
                                        defpackage.aal aalVarD3 = defpackage.anpk.d();
                                        aalVarD3.b = defpackage.anpj.a;
                                        aalVarD3.d = defpackage.anpk.c("google.internal.feedback.v1.SurveyService", "Trigger");
                                        aalVarD3.b();
                                        defpackage.anan ananVar = defpackage.anan.a;
                                        akzq akzqVar3 = aohd.a;
                                        aalVarD3.e = new defpackage.aohc(ananVar);
                                        aalVarD3.c = new defpackage.aohc(defpackage.anao.a);
                                        anpkVarA2 = aalVarD3.a();
                                        anar.g = anpkVarA2;
                                    }
                                } catch (java.lang.Throwable th3) {
                                    throw th3;
                                }
                            }
                            anpkVar3 = anpkVarA2;
                        }
                        ajcqVarA = defpackage.aohp.a(anmcVar3.b(anpkVar3, ((aohh) anaqVar).b), afjqVar);
                    } else {
                        defpackage.anaq anaqVarD = anar.d(anmcVarD);
                        anmc anmcVar4 = ((aohh) anaqVarD).a;
                        defpackage.anpk anpkVar4 = anar.h;
                        if (anpkVar4 == null) {
                            synchronized (anar.class) {
                                try {
                                    anpkVarA = anar.h;
                                    if (anpkVarA == null) {
                                        defpackage.aal aalVarD4 = defpackage.anpk.d();
                                        aalVarD4.b = defpackage.anpj.a;
                                        aalVarD4.d = defpackage.anpk.c("google.internal.feedback.v1.SurveyService", "TriggerAnonymous");
                                        aalVarD4.b();
                                        defpackage.anan ananVar2 = defpackage.anan.a;
                                        akzq akzqVar4 = aohd.a;
                                        aalVarD4.e = new defpackage.aohc(ananVar2);
                                        aalVarD4.c = new defpackage.aohc(defpackage.anao.a);
                                        anpkVarA = aalVarD4.a();
                                        anar.h = anpkVarA;
                                    }
                                } catch (java.lang.Throwable th4) {
                                    throw th4;
                                }
                            }
                            anpkVar4 = anpkVarA;
                        }
                        ajcqVarA = defpackage.aohp.a(anmcVar4.b(anpkVar4, ((aohh) anaqVarD).b), afjqVar);
                    }
                    aiql.I(ajcqVarA, new afjo(this, amhkVar, apdhVar, 4, (byte[]) null), afjm.a());
                    return;
                } catch (alaz e) {
                    android.util.Log.e("NetworkCallerGrpc", "Failed to convert scone trigger request to feedback1p.", e);
                    afjd afjdVar = afjd.b;
                    b(afjdVar);
                    akzx akzxVarM = defpackage.amhl.a.m();
                    akzxVarM.bf(afjdVar.name());
                    defpackage.amhl amhlVar = (defpackage.amhl) akzxVarM.p();
                    android.content.Context context = this.a;
                    java.lang.String str = this.c;
                    if (true == android.text.TextUtils.isEmpty(str)) {
                        str = null;
                    }
                    aehj.B(amhkVar, amhlVar, apdhVar, context, str);
                    return;
                }
            } catch (java.lang.UnsupportedOperationException e2) {
                e = e2;
            }
            e = e2;
        } catch (java.lang.UnsupportedOperationException e3) {
            e = e3;
            afjqVar = this;
            amhkVarA = amhkVar;
            apdhVar2 = apdhVar;
        }
        aehj aehjVar = defpackage.afjy.c;
        if (!defpackage.afjy.b(defpackage.anlo.a.eZ().a(defpackage.afjy.b))) {
            throw e;
        }
        android.util.Log.e("NetworkCallerGrpc", "The configured transport is not supported: ".concat(e.toString()));
        afjd afjdVar2 = afjd.e;
        afjqVar.b(afjdVar2);
        akzx akzxVarM2 = defpackage.amhl.a.m();
        akzxVarM2.bf(afjdVar2.name());
        defpackage.amhl amhlVar2 = (defpackage.amhl) akzxVarM2.p();
        android.content.Context context2 = afjqVar.a;
        java.lang.String str2 = afjqVar.c;
        aehj.B(amhkVarA, amhlVar2, apdhVar2, context2, true != android.text.TextUtils.isEmpty(str2) ? str2 : null);
    }

    public final void i(amhi amhiVar, apdh apdhVar) {
        int i;
        long j = defpackage.afjz.a;
        java.lang.String str = this.c;
        java.lang.String str2 = true == android.text.TextUtils.isEmpty(str) ? null : str;
        aehj aehjVar = defpackage.afjy.c;
        if (defpackage.afjy.c(defpackage.anjv.c(defpackage.afjy.b))) {
            akzx akzxVarM = defpackage.alhp.a.m();
            char c = 2;
            if ((amhiVar.b & 1) != 0) {
                amik amikVar = amhiVar.c;
                if (amikVar == null) {
                    amikVar = amik.a;
                }
                akzx akzxVarM2 = defpackage.algo.a.m();
                if ((amikVar.b & 1) != 0) {
                    akzm akzmVar = amikVar.e;
                    if (akzmVar == null) {
                        akzmVar = akzm.a;
                    }
                    akzxVarM2.u();
                    defpackage.algo algoVar = (defpackage.algo) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(akzmVar);
                    algoVar.e = akzmVar;
                    algoVar.b |= 1;
                }
                int i2 = amikVar.c;
                if (i2 == 0) {
                    i = 6;
                } else if (i2 == 2) {
                    i = 1;
                } else if (i2 == 3) {
                    i = 2;
                } else if (i2 == 4) {
                    i = 3;
                } else if (i2 != 5) {
                    i = i2 != 6 ? 0 : 5;
                } else {
                    i = 4;
                }
                if (i == 0) {
                    throw null;
                }
                int i3 = i - 1;
                if (i3 == 0) {
                    defpackage.algn algnVar = defpackage.algn.a;
                    akzxVarM2.u();
                    defpackage.algo algoVar2 = (defpackage.algo) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(algnVar);
                    algoVar2.d = algnVar;
                    algoVar2.c = 2;
                } else if (i3 == 1) {
                    defpackage.amih amihVar = i2 == 3 ? (defpackage.amih) amikVar.d : defpackage.amih.a;
                    akzx akzxVarM3 = defpackage.algl.a.m();
                    if ((amihVar.b & 2) != 0) {
                        defpackage.amit amitVar = amihVar.c;
                        if (amitVar == null) {
                            amitVar = defpackage.amit.a;
                        }
                        akzx akzxVarM4 = defpackage.alhe.a.m();
                        java.lang.String str3 = amitVar.d;
                        akzxVarM4.u();
                        defpackage.alhe alheVar = (defpackage.alhe) akzxVarM4.b;
                        j$.util.Objects.requireNonNull(str3);
                        alheVar.d = str3;
                        if ((amitVar.b & 1) != 0) {
                            akzx akzxVarM5 = defpackage.alhd.a.m();
                            defpackage.amis amisVar = amitVar.c;
                            if (amisVar == null) {
                                amisVar = defpackage.amis.a;
                            }
                            alat alatVar = amisVar.c;
                            akzxVarM5.u();
                            defpackage.alhd alhdVar = (defpackage.alhd) akzxVarM5.b;
                            alat alatVar2 = alhdVar.b;
                            if (!alatVar2.c()) {
                                alhdVar.b = alad.J(alatVar2);
                            }
                            akyl.i(alatVar, alhdVar.b);
                            akzxVarM4.u();
                            defpackage.alhe alheVar2 = (defpackage.alhe) akzxVarM4.b;
                            defpackage.alhd alhdVar2 = (defpackage.alhd) akzxVarM5.p();
                            j$.util.Objects.requireNonNull(alhdVar2);
                            alheVar2.c = alhdVar2;
                            alheVar2.b |= 1;
                        }
                        akzxVarM3.u();
                        defpackage.algl alglVar = (defpackage.algl) akzxVarM3.b;
                        defpackage.alhe alheVar3 = (defpackage.alhe) akzxVarM4.p();
                        j$.util.Objects.requireNonNull(alheVar3);
                        alglVar.c = alheVar3;
                        alglVar.b |= 1;
                    }
                    if ((amihVar.b & 4) != 0) {
                        defpackage.amjd amjdVar = amihVar.d;
                        if (amjdVar == null) {
                            amjdVar = defpackage.amjd.a;
                        }
                        akzx akzxVarM6 = defpackage.alhm.a.m();
                        if ((amjdVar.b & 1) != 0) {
                            defpackage.amjc amjcVar = amjdVar.c;
                            if (amjcVar == null) {
                                amjcVar = defpackage.amjc.a;
                            }
                            akzx akzxVarM7 = defpackage.alhl.a.m();
                            if ((amjcVar.b & 2) != 0) {
                                defpackage.amjb amjbVar = amjcVar.c;
                                if (amjbVar == null) {
                                    amjbVar = defpackage.amjb.a;
                                }
                                akzx akzxVarM8 = defpackage.alhk.a.m();
                                if ((amjbVar.b & 1) != 0) {
                                    defpackage.amja amjaVar = amjbVar.c;
                                    if (amjaVar == null) {
                                        amjaVar = defpackage.amja.a;
                                    }
                                    akzx akzxVarM9 = defpackage.alhj.a.m();
                                    java.lang.String str4 = amjaVar.b;
                                    akzxVarM9.u();
                                    defpackage.alhj alhjVar = (defpackage.alhj) akzxVarM9.b;
                                    j$.util.Objects.requireNonNull(str4);
                                    alhjVar.b = str4;
                                    java.lang.String str5 = amjaVar.c;
                                    akzxVarM9.u();
                                    defpackage.alhj alhjVar2 = (defpackage.alhj) akzxVarM9.b;
                                    j$.util.Objects.requireNonNull(str5);
                                    alhjVar2.c = str5;
                                    java.lang.String str6 = amjaVar.d;
                                    akzxVarM9.u();
                                    defpackage.alhj alhjVar3 = (defpackage.alhj) akzxVarM9.b;
                                    j$.util.Objects.requireNonNull(str6);
                                    alhjVar3.d = str6;
                                    java.lang.String str7 = amjaVar.e;
                                    akzxVarM9.u();
                                    defpackage.alhj alhjVar4 = (defpackage.alhj) akzxVarM9.b;
                                    j$.util.Objects.requireNonNull(str7);
                                    alhjVar4.e = str7;
                                    java.lang.String str8 = amjaVar.f;
                                    akzxVarM9.u();
                                    defpackage.alhj alhjVar5 = (defpackage.alhj) akzxVarM9.b;
                                    j$.util.Objects.requireNonNull(str8);
                                    alhjVar5.f = str8;
                                    defpackage.alhj alhjVar6 = (defpackage.alhj) akzxVarM9.p();
                                    akzxVarM8.u();
                                    defpackage.alhk alhkVar = (defpackage.alhk) akzxVarM8.b;
                                    j$.util.Objects.requireNonNull(alhjVar6);
                                    alhkVar.c = alhjVar6;
                                    alhkVar.b |= 1;
                                }
                                if ((amjbVar.b & 2) != 0) {
                                    defpackage.amiz amizVar = amjbVar.d;
                                    if (amizVar == null) {
                                        amizVar = defpackage.amiz.a;
                                    }
                                    akzx akzxVarM10 = defpackage.alhi.a.m();
                                    if (amizVar.b.size() > 0) {
                                        for (defpackage.amiy amiyVar : amizVar.b) {
                                            akzx akzxVarM11 = defpackage.alhh.a.m();
                                            java.lang.String str9 = amiyVar.b;
                                            akzxVarM11.u();
                                            char c2 = c;
                                            defpackage.alhh alhhVar = (defpackage.alhh) akzxVarM11.b;
                                            j$.util.Objects.requireNonNull(str9);
                                            alhhVar.b = str9;
                                            java.lang.String str10 = amiyVar.c;
                                            akzxVarM11.u();
                                            defpackage.alhh alhhVar2 = (defpackage.alhh) akzxVarM11.b;
                                            j$.util.Objects.requireNonNull(str10);
                                            alhhVar2.c = str10;
                                            defpackage.alhh alhhVar3 = (defpackage.alhh) akzxVarM11.p();
                                            akzxVarM10.u();
                                            defpackage.alhi alhiVar = (defpackage.alhi) akzxVarM10.b;
                                            j$.util.Objects.requireNonNull(alhhVar3);
                                            alat alatVar3 = alhiVar.b;
                                            if (!alatVar3.c()) {
                                                alhiVar.b = alad.J(alatVar3);
                                            }
                                            alhiVar.b.add(alhhVar3);
                                            c = c2;
                                        }
                                    }
                                    akzxVarM8.u();
                                    defpackage.alhk alhkVar2 = (defpackage.alhk) akzxVarM8.b;
                                    defpackage.alhi alhiVar2 = (defpackage.alhi) akzxVarM10.p();
                                    j$.util.Objects.requireNonNull(alhiVar2);
                                    alhkVar2.d = alhiVar2;
                                    alhkVar2.b |= 2;
                                }
                                akzxVarM7.u();
                                defpackage.alhl alhlVar = (defpackage.alhl) akzxVarM7.b;
                                defpackage.alhk alhkVar3 = (defpackage.alhk) akzxVarM8.p();
                                j$.util.Objects.requireNonNull(alhkVar3);
                                alhlVar.c = alhkVar3;
                                alhlVar.b |= 2;
                            }
                            akzxVarM6.u();
                            defpackage.alhm alhmVar = (defpackage.alhm) akzxVarM6.b;
                            defpackage.alhl alhlVar2 = (defpackage.alhl) akzxVarM7.p();
                            j$.util.Objects.requireNonNull(alhlVar2);
                            alhmVar.c = alhlVar2;
                            alhmVar.b |= 1;
                        }
                        akzxVarM3.u();
                        defpackage.algl alglVar2 = (defpackage.algl) akzxVarM3.b;
                        defpackage.alhm alhmVar2 = (defpackage.alhm) akzxVarM6.p();
                        j$.util.Objects.requireNonNull(alhmVar2);
                        alglVar2.d = alhmVar2;
                        alglVar2.b |= 2;
                    }
                    akzxVarM2.u();
                    defpackage.algo algoVar3 = (defpackage.algo) akzxVarM2.b;
                    defpackage.algl alglVar3 = (defpackage.algl) akzxVarM3.p();
                    j$.util.Objects.requireNonNull(alglVar3);
                    algoVar3.d = alglVar3;
                    algoVar3.c = 3;
                } else if (i3 == 2) {
                    akzx akzxVarM12 = defpackage.alge.a.m();
                    boolean z = (amikVar.c == 4 ? (defpackage.amia) amikVar.d : defpackage.amia.a).b;
                    akzxVarM12.u();
                    ((defpackage.alge) akzxVarM12.b).b = z;
                    akzxVarM2.u();
                    defpackage.algo algoVar4 = (defpackage.algo) akzxVarM2.b;
                    defpackage.alge algeVar = (defpackage.alge) akzxVarM12.p();
                    j$.util.Objects.requireNonNull(algeVar);
                    algoVar4.d = algeVar;
                    algoVar4.c = 4;
                } else if (i3 == 3) {
                    defpackage.amig amigVar = i2 == 5 ? (defpackage.amig) amikVar.d : defpackage.amig.a;
                    akzx akzxVarM13 = defpackage.algk.a.m();
                    int i4 = amigVar.d;
                    akzxVarM13.u();
                    ((defpackage.algk) akzxVarM13.b).d = i4;
                    int i5 = amigVar.b;
                    int iAc = a.ac(i5);
                    int i6 = iAc - 1;
                    if (iAc == 0) {
                        throw null;
                    }
                    if (i6 == 0) {
                        defpackage.amif amifVar = i5 == 2 ? (defpackage.amif) amigVar.c : defpackage.amif.a;
                        akzx akzxVarM14 = defpackage.algj.a.m();
                        if ((amifVar.b & 1) != 0) {
                            amie amieVar = amifVar.c;
                            if (amieVar == null) {
                                amieVar = amie.a;
                            }
                            defpackage.algi algiVarZ = aehj.z(amieVar);
                            akzxVarM14.u();
                            defpackage.algj algjVar = (defpackage.algj) akzxVarM14.b;
                            j$.util.Objects.requireNonNull(algiVarZ);
                            algjVar.c = algiVarZ;
                            algjVar.b |= 1;
                        }
                        akzxVarM13.u();
                        defpackage.algk algkVar = (defpackage.algk) akzxVarM13.b;
                        defpackage.algj algjVar2 = (defpackage.algj) akzxVarM14.p();
                        j$.util.Objects.requireNonNull(algjVar2);
                        algkVar.c = algjVar2;
                        algkVar.b = 2;
                    } else if (i6 == 1) {
                        defpackage.amib amibVar = i5 == 3 ? (defpackage.amib) amigVar.c : defpackage.amib.a;
                        akzx akzxVarM15 = defpackage.algf.a.m();
                        if (amibVar.b.size() > 0) {
                            java.util.Iterator it = amibVar.b.iterator();
                            while (it.hasNext()) {
                                defpackage.algi algiVarZ2 = aehj.z((amie) it.next());
                                akzxVarM15.u();
                                defpackage.algf algfVar = (defpackage.algf) akzxVarM15.b;
                                j$.util.Objects.requireNonNull(algiVarZ2);
                                alat alatVar4 = algfVar.b;
                                if (!alatVar4.c()) {
                                    algfVar.b = alad.J(alatVar4);
                                }
                                algfVar.b.add(algiVarZ2);
                            }
                        }
                        akzxVarM13.u();
                        defpackage.algk algkVar2 = (defpackage.algk) akzxVarM13.b;
                        defpackage.algf algfVar2 = (defpackage.algf) akzxVarM15.p();
                        j$.util.Objects.requireNonNull(algfVar2);
                        algkVar2.c = algfVar2;
                        algkVar2.b = 3;
                    } else if (i6 == 2) {
                        defpackage.amid amidVar = i5 == 4 ? (defpackage.amid) amigVar.c : defpackage.amid.a;
                        akzx akzxVarM16 = defpackage.algh.a.m();
                        if ((amidVar.b & 1) != 0) {
                            amie amieVar2 = amidVar.c;
                            if (amieVar2 == null) {
                                amieVar2 = amie.a;
                            }
                            defpackage.algi algiVarZ3 = aehj.z(amieVar2);
                            akzxVarM16.u();
                            defpackage.algh alghVar = (defpackage.algh) akzxVarM16.b;
                            j$.util.Objects.requireNonNull(algiVarZ3);
                            alghVar.c = algiVarZ3;
                            alghVar.b |= 1;
                        }
                        akzxVarM13.u();
                        defpackage.algk algkVar3 = (defpackage.algk) akzxVarM13.b;
                        defpackage.algh alghVar2 = (defpackage.algh) akzxVarM16.p();
                        j$.util.Objects.requireNonNull(alghVar2);
                        algkVar3.c = alghVar2;
                        algkVar3.b = 4;
                    } else if (i6 == 3) {
                        akzx akzxVarM17 = defpackage.algg.a.m();
                        java.lang.String str11 = (amigVar.b == 5 ? (defpackage.amic) amigVar.c : defpackage.amic.a).b;
                        akzxVarM17.u();
                        defpackage.algg alggVar = (defpackage.algg) akzxVarM17.b;
                        j$.util.Objects.requireNonNull(str11);
                        alggVar.b = str11;
                        akzxVarM13.u();
                        defpackage.algk algkVar4 = (defpackage.algk) akzxVarM13.b;
                        defpackage.algg alggVar2 = (defpackage.algg) akzxVarM17.p();
                        j$.util.Objects.requireNonNull(alggVar2);
                        algkVar4.c = alggVar2;
                        algkVar4.b = 5;
                    }
                    akzxVarM2.u();
                    defpackage.algo algoVar5 = (defpackage.algo) akzxVarM2.b;
                    defpackage.algk algkVar5 = (defpackage.algk) akzxVarM13.p();
                    j$.util.Objects.requireNonNull(algkVar5);
                    algoVar5.d = algkVar5;
                    algoVar5.c = 5;
                } else if (i3 == 4) {
                    defpackage.algm algmVar = defpackage.algm.a;
                    akzxVarM2.u();
                    defpackage.algo algoVar6 = (defpackage.algo) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(algmVar);
                    algoVar6.d = algmVar;
                    algoVar6.c = 6;
                }
                akzxVarM.u();
                defpackage.alhp alhpVar = (defpackage.alhp) akzxVarM.b;
                defpackage.algo algoVar7 = (defpackage.algo) akzxVarM2.p();
                j$.util.Objects.requireNonNull(algoVar7);
                alhpVar.c = algoVar7;
                alhpVar.b |= 1;
            }
            if ((amhiVar.b & 2) != 0) {
                akzx akzxVarM18 = defpackage.alhn.a.m();
                defpackage.amje amjeVar = amhiVar.d;
                if (amjeVar == null) {
                    amjeVar = defpackage.amje.a;
                }
                java.lang.String str12 = amjeVar.b;
                akzxVarM18.u();
                defpackage.alhn alhnVar = (defpackage.alhn) akzxVarM18.b;
                j$.util.Objects.requireNonNull(str12);
                alhnVar.b = str12;
                defpackage.amje amjeVar2 = amhiVar.d;
                if (amjeVar2 == null) {
                    amjeVar2 = defpackage.amje.a;
                }
                akzc akzcVar = amjeVar2.c;
                akzxVarM18.u();
                defpackage.alhn alhnVar2 = (defpackage.alhn) akzxVarM18.b;
                j$.util.Objects.requireNonNull(akzcVar);
                alhnVar2.c = akzcVar;
                defpackage.alhn alhnVar3 = (defpackage.alhn) akzxVarM18.p();
                akzxVarM.u();
                defpackage.alhp alhpVar2 = (defpackage.alhp) akzxVarM.b;
                j$.util.Objects.requireNonNull(alhnVar3);
                alhpVar2.d = alhnVar3;
                alhpVar2.b |= 2;
            }
            android.content.Context context = this.a;
            defpackage.amac amacVarT = defpackage.amac.t();
            akzx akzxVarM19 = defpackage.algp.a.m();
            akzxVarM19.u();
            defpackage.algp algpVar = (defpackage.algp) akzxVarM19.b;
            defpackage.alhp alhpVar3 = (defpackage.alhp) akzxVarM.p();
            j$.util.Objects.requireNonNull(alhpVar3);
            algpVar.c = alhpVar3;
            algpVar.b = 3;
            defpackage.alhq alhqVar = defpackage.alhq.a;
            akzxVarM19.u();
            defpackage.algp algpVar2 = (defpackage.algp) akzxVarM19.b;
            j$.util.Objects.requireNonNull(alhqVar);
            algpVar2.e = alhqVar;
            algpVar2.d = 5;
            amacVarT.p((defpackage.algp) akzxVarM19.p(), apdhVar.b(), apdhVar.a(), context, str2);
        }
    }

    public final /* synthetic */ void j(defpackage.anaj anajVar, ajxi ajxiVar) {
        defpackage.anpk anpkVarA;
        try {
            ahwd ahwdVarC = c();
            afjg afjgVar = afjg.a;
            boolean z = afjgVar.b;
            afjgVar.b = true;
            anmc anmcVarD = d(ahwdVarC);
            afjgVar.b = z;
            if (anmcVarD == null) {
                android.util.Log.e("NetworkCallerGrpc", "Could not get channel for survey startup config.");
                afjgVar.b = false;
                return;
            }
            defpackage.anaq anaqVarD = anar.d(anmcVarD);
            anmc anmcVar = ((aohh) anaqVarD).a;
            defpackage.anpk anpkVar = anar.k;
            if (anpkVar == null) {
                synchronized (anar.class) {
                    try {
                        anpkVarA = anar.k;
                        if (anpkVarA == null) {
                            defpackage.aal aalVarD = defpackage.anpk.d();
                            aalVarD.b = defpackage.anpj.a;
                            aalVarD.d = defpackage.anpk.c("google.internal.feedback.v1.SurveyService", "GetSurveyStartupConfig");
                            aalVarD.b();
                            defpackage.anaj anajVar2 = defpackage.anaj.a;
                            akzq akzqVar = aohd.a;
                            aalVarD.e = new defpackage.aohc(anajVar2);
                            aalVarD.c = new defpackage.aohc(defpackage.anak.a);
                            anpkVarA = aalVarD.a();
                            anar.k = anpkVarA;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                anpkVar = anpkVarA;
            }
            aiql.I(defpackage.aohp.a(anmcVar.b(anpkVar, ((aohh) anaqVarD).b), anajVar), new kxp(this, ajxiVar, 14), afjm.a());
        } catch (java.lang.UnsupportedOperationException e) {
            android.util.Log.e("NetworkCallerGrpc", "The configured transport is not supported: ".concat(e.toString()));
            b(afjd.e);
        }
    }

    public final void k(ajxi ajxiVar) {
        this.f.post(new aetv(ajxiVar, 17));
    }

    public afjq(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, aprf aprfVar) {
        this(context, str, str2, str3);
        this.i = aprfVar;
    }
}
