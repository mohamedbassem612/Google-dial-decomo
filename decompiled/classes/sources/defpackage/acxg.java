package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acxg {
    private static defpackage.acxg c;
    public final java.lang.Object a;
    public final java.lang.Object b;

    public acxg(java.lang.String str, defpackage.aais aaisVar, defpackage.aais aaisVar2) {
        if (aaisVar == null) {
            throw new java.lang.NullPointerException("Cannot construct an Api with a null ClientBuilder");
        }
        if (aaisVar2 == null) {
            throw new java.lang.NullPointerException("Cannot construct an Api with a null ClientKey");
        }
        this.a = str;
        this.b = aaisVar;
    }

    public static defpackage.ahyn f(java.lang.Class cls) {
        try {
            return defpackage.ahyn.h((abcq) cls.getDeclaredConstructor(null).newInstance(null));
        } catch (java.lang.ReflectiveOperationException unused) {
            return defpackage.ahwt.a;
        }
    }

    public static /* synthetic */ defpackage.aigf g() {
        return defpackage.aikj.a(8, new java.lang.Object[]{zvl.b, abdb.class, zvl.d, abde.class, zvl.e, abdc.class, zvl.f, abdg.class, zvl.i, abdf.class, zvl.j, abdi.class, zvl.l, abda.class, zvl.n, abdj.class}, null);
    }

    public static synchronized defpackage.acxg x(android.content.Context context) {
        defpackage.acxg acxgVar;
        acxgVar = c;
        if (acxgVar == null) {
            acxgVar = new defpackage.acxg(context, (byte[]) null);
            c = acxgVar;
        }
        return acxgVar;
    }

    private static java.lang.String y(android.content.Context context, java.lang.Throwable th) {
        boolean z = th instanceof defpackage.aacw;
        java.lang.String string = th.toString();
        if (z) {
            com.google.android.gms.common.api.Status status = ((defpackage.aacw) th).a;
            java.lang.String name = th.getClass().getName();
            java.lang.String strAA = defpackage.aais.aA(status.f);
            java.lang.String str = status.g;
            com.google.android.gms.common.ConnectionResult connectionResult = status.i;
            string = java.lang.String.format("%s: %s: %s%s", name, strAA, str, connectionResult == null ? "" : ", ".concat(connectionResult.toString()));
        }
        ahwm ahwmVar = ahwm.a;
        java.lang.String strConcat = java.lang.String.format(java.util.Locale.US, "ERROR : %s\nAPI_LEVEL: %d\nGMSCORE_VERSION: %s", string, java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT), "26.42.30-000");
        if (th != null) {
            strConcat = java.lang.String.valueOf(strConcat).concat(java.lang.String.valueOf(java.lang.String.format(java.util.Locale.US, "\nEXCEPTION: %s\nSTACK_TRACE: %s", th, android.util.Log.getStackTraceString(th))));
        }
        return android.util.Base64.encodeToString(defpackage.aaoo.u(defpackage.aaoo.t(context, java.lang.String.valueOf(strConcat).concat(java.lang.String.valueOf(java.lang.String.format(java.util.Locale.US, "\nBuild.FINGERPRINT: %s", android.os.Build.FINGERPRINT))).getBytes(java.nio.charset.StandardCharsets.UTF_8), ahwmVar)), 11);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ecx, java.lang.Object] */
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        return defpackage.aoov.au(this.b.b(), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.alcf alcfVar, defpackage.aoln aolnVar) {
        acih acihVar;
        if (aolnVar instanceof acih) {
            acihVar = (acih) aolnVar;
            int i = acihVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                acihVar.b = i - Integer.MIN_VALUE;
            } else {
                acihVar = new acih(this, aolnVar);
            }
        } else {
            acihVar = new acih(this, aolnVar);
        }
        java.lang.Object objBQ = acihVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = acihVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objBQ);
            java.lang.Object obj = this.a;
            defpackage.nhv nhvVar = new defpackage.nhv(this, alcfVar, (defpackage.aoln) null, 14, (byte[]) null);
            acihVar.b = 1;
            objBQ = defpackage.agab.bQ((defpackage.apdp) obj, nhvVar, acihVar);
            if (objBQ == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objBQ);
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.alcf alcfVar, defpackage.aoln aolnVar) {
        acii aciiVar;
        if (aolnVar instanceof acii) {
            aciiVar = (acii) aolnVar;
            int i = aciiVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aciiVar.b = i - Integer.MIN_VALUE;
            } else {
                aciiVar = new acii(this, aolnVar);
            }
        } else {
            aciiVar = new acii(this, aolnVar);
        }
        java.lang.Object objBQ = aciiVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aciiVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objBQ);
            java.lang.Object obj = this.a;
            defpackage.nhv nhvVar = new defpackage.nhv(this, alcfVar, (defpackage.aoln) null, 15, (char[]) null);
            aciiVar.b = 1;
            objBQ = defpackage.agab.bQ((defpackage.apdp) obj, nhvVar, aciiVar);
            if (objBQ == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objBQ);
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(java.lang.String str, defpackage.aoln aolnVar) {
        acij acijVar;
        if (aolnVar instanceof acij) {
            acijVar = (acij) aolnVar;
            int i = acijVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                acijVar.b = i - Integer.MIN_VALUE;
            } else {
                acijVar = new acij(this, aolnVar);
            }
        } else {
            acijVar = new acij(this, aolnVar);
        }
        java.lang.Object objBQ = acijVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = acijVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objBQ);
            java.lang.Object obj = this.a;
            defpackage.nhv nhvVar = new defpackage.nhv(this, str, (defpackage.aoln) null, 16);
            acijVar.b = 1;
            objBQ = defpackage.agab.bQ((defpackage.apdp) obj, nhvVar, acijVar);
            if (objBQ == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objBQ);
        }
        return defpackage.aojh.a;
    }

    public final void e(final defpackage.acxg acxgVar) {
        ((defpackage.aclt) this.a).b(new defpackage.acls() { // from class: acne
            @Override // defpackage.acls
            public final java.util.List a() {
                java.lang.Object obj = this.a.b;
                defpackage.aiwd aiwdVarA = defpackage.aclm.a();
                ((defpackage.adae) obj).y();
                defpackage.acxg acxgVar2 = acxgVar;
                java.lang.Object[] objArr = {acxgVar2.a};
                defpackage.ahvr.ay(objArr, 1);
                java.lang.Object[] objArr2 = {new defpackage.acnl(aiwdVarA, new defpackage.aike(objArr, 1), (defpackage.acmf) acxgVar2.b, -1L, true)};
                defpackage.ahvr.ay(objArr2, 1);
                return new defpackage.aike(objArr2, 1);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [abcp, java.lang.Object] */
    public final void h(android.content.Context context, zvl zvlVar, defpackage.zvj zvjVar) {
        android.util.Log.e("AppDoctor", "Failed on fix: " + zvlVar.a());
        defpackage.akzx akzxVarM = zvk.a.m();
        java.lang.String packageName = context.getPackageName();
        akzxVarM.u();
        zvk zvkVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(packageName);
        zvkVar.b |= 1;
        zvkVar.c = packageName;
        akzxVarM.u();
        zvk zvkVar2 = akzxVarM.b;
        zvkVar2.g = zvjVar.a();
        zvkVar2.b |= 16;
        akzxVarM.u();
        zvk zvkVar3 = akzxVarM.b;
        zvkVar3.f = defpackage.a.S(6);
        zvkVar3.b |= 8;
        akzxVarM.u();
        zvk zvkVar4 = akzxVarM.b;
        zvkVar4.e = zvlVar.a();
        zvkVar4.b |= 4;
        this.a.a(akzxVarM.r());
    }

    public final void i(android.content.Context context, zwa zwaVar, defpackage.zvj zvjVar) {
        zvl zvlVarB;
        if (zwaVar != null) {
            zvlVarB = zvl.b(zwaVar.b);
            if (zvlVarB == null) {
                zvlVarB = zvl.p;
            }
        } else {
            zvlVarB = zvl.a;
        }
        h(context, zvlVarB, zvjVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [abcp, java.lang.Object] */
    public final void j(android.content.Context context, zvl zvlVar, defpackage.zvj zvjVar) {
        defpackage.akzx akzxVarM = zvk.a.m();
        java.lang.String packageName = context.getPackageName();
        akzxVarM.u();
        zvk zvkVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(packageName);
        zvkVar.b |= 1;
        zvkVar.c = packageName;
        akzxVarM.u();
        zvk zvkVar2 = akzxVarM.b;
        zvkVar2.g = zvjVar.a();
        zvkVar2.b |= 16;
        akzxVarM.u();
        zvk zvkVar3 = akzxVarM.b;
        zvkVar3.f = defpackage.a.S(5);
        zvkVar3.b |= 8;
        akzxVarM.u();
        zvk zvkVar4 = akzxVarM.b;
        zvkVar4.e = zvlVar.a();
        zvkVar4.b |= 4;
        this.a.a(akzxVarM.r());
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [abcp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [ajcq, java.lang.Object] */
    public final boolean k(android.content.Context context, defpackage.zvj zvjVar) {
        java.util.List<zwa> list;
        zvl zvlVarB;
        if (!defpackage.aazc.d(context)) {
            return false;
        }
        abcu abcuVar = new abcu();
        abcuVar.b = context;
        abcuVar.a = zvjVar;
        abcuVar.c = this.a;
        abcv abcvVarA = abcuVar.a();
        try {
            defpackage.abcn abcnVar = new defpackage.abcn(context);
            try {
                afpl afplVar = new afpl(new ajxi(this, abcnVar, abcvVarA, (byte[]) null));
                defpackage.aigf aigfVarG = g();
                android.os.Bundle bundleCall = abcnVar.b.call("get_fixes", null, abcnVar.a());
                if (bundleCall == null) {
                    android.util.Log.e("AppDoctorProviderClient", "Failed to get config from AppDoctorProvider.");
                    list = defpackage.aike.a;
                } else {
                    byte[] byteArray = bundleCall.getByteArray("com.google.android.gms.common.appdoctor.teledoctorconfig");
                    if (byteArray == null) {
                        android.util.Log.e("AppDoctorProviderClient", "TeleDoctor Config empty");
                        list = defpackage.aike.a;
                    } else {
                        try {
                            zwb zwbVarE = defpackage.alad.E(zwb.a, byteArray, 0, byteArray.length, defpackage.akzq.a);
                            defpackage.alad.V(zwbVarE);
                            list = zwbVarE.b;
                        } catch (defpackage.alaz e) {
                            android.util.Log.e("AppDoctorProviderClient", "Failed to parse TeleDoctorConfig.", e);
                            list = defpackage.aike.a;
                        }
                    }
                }
                for (zwa zwaVar : list) {
                    zvl zvlVarB2 = zvl.b(zwaVar.b);
                    if (zvlVarB2 == null) {
                        zvlVarB2 = zvl.p;
                    }
                    if (aigfVarG.containsKey(zvlVarB2)) {
                        zvl zvlVarB3 = zvl.b(zwaVar.b);
                        if (zvlVarB3 == null) {
                            zvlVarB3 = zvl.p;
                        }
                        defpackage.ahyn ahynVarF = f((java.lang.Class) aigfVarG.get(zvlVarB3));
                        if (ahynVarF.f()) {
                            java.lang.String str = zwaVar.d;
                            zvl zvlVarB4 = zvl.b(zwaVar.b);
                            if (zvlVarB4 == null) {
                                zvlVarB4 = zvl.p;
                            }
                            zvz zvzVar = zwaVar.c;
                            if (zvzVar == null) {
                                zvzVar = zvz.a;
                            }
                            afplVar.J(new abct(str, zvlVarB4, zvzVar, (abcq) ahynVarF.b(), abct.a));
                        } else {
                            i(abcvVarA.b, zwaVar, abcvVarA.a);
                        }
                    } else {
                        android.content.Context context2 = abcvVarA.b;
                        defpackage.zvj zvjVar2 = abcvVarA.a;
                        if (zwaVar != null) {
                            zvlVarB = zvl.b(zwaVar.b);
                            if (zvlVarB == null) {
                                zvlVarB = zvl.p;
                            }
                        } else {
                            zvlVarB = zvl.a;
                        }
                        j(context2, zvlVarB, zvjVar2);
                    }
                }
                akwb akwbVarK = afplVar.K(abcvVarA);
                try {
                    akwbVarK.a.get();
                    boolean z = akwbVarK.b;
                    abcnVar.close();
                    return z;
                } catch (java.lang.InterruptedException | java.lang.RuntimeException | java.util.concurrent.ExecutionException unused) {
                    i(context, zwa.a, zvjVar);
                    abcnVar.close();
                    return false;
                }
            } catch (java.lang.Throwable th) {
                try {
                    abcnVar.close();
                    throw th;
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (android.os.RemoteException | java.lang.RuntimeException unused2) {
            i(context, zwa.a, zvjVar);
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [abav, java.lang.Object] */
    public final defpackage.abav l(defpackage.aazd aazdVar) {
        defpackage.aooh.f(aazdVar, "clientId");
        ((defpackage.adae) this.b).F(aazdVar);
        return this.a;
    }

    public final void m(defpackage.ammf ammfVar) {
        defpackage.akzx akzxVarM = defpackage.ammg.a.m();
        akzxVarM.u();
        ((defpackage.ammg) akzxVarM.b).c = 484;
        akzxVarM.u();
        defpackage.ammg ammgVar = (defpackage.ammg) akzxVarM.b;
        j$.util.Objects.requireNonNull(ammfVar);
        ammgVar.d = ammfVar;
        ammgVar.b |= 16777216;
        defpackage.ammg ammgVar2 = (defpackage.ammg) akzxVarM.r();
        defpackage.akzx akzxVarM2 = defpackage.apia.a.m();
        akzxVarM2.u();
        defpackage.apia apiaVar = (defpackage.apia) akzxVarM2.b;
        j$.util.Objects.requireNonNull(ammgVar2);
        apiaVar.c = ammgVar2;
        apiaVar.b |= 1;
        ((defpackage.zzd) ((defpackage.zzx) this.a).a).g((defpackage.apia) akzxVarM2.r()).d();
    }

    public final void n(defpackage.ammc ammcVar) {
        defpackage.akzx akzxVarM = defpackage.ammf.a.m();
        akzxVarM.u();
        ((defpackage.ammf) akzxVarM.b).d = 12;
        akzxVarM.u();
        defpackage.ammf ammfVar = (defpackage.ammf) akzxVarM.b;
        java.lang.Object obj = this.b;
        j$.util.Objects.requireNonNull(obj);
        ammfVar.e = (java.lang.String) obj;
        akzxVarM.u();
        ((defpackage.ammf) akzxVarM.b).f = defpackage.a.S(4);
        akzxVarM.u();
        defpackage.ammf ammfVar2 = (defpackage.ammf) akzxVarM.b;
        j$.util.Objects.requireNonNull(ammcVar);
        ammfVar2.c = ammcVar;
        ammfVar2.b = 15;
        m((defpackage.ammf) akzxVarM.r());
    }

    public final void o(int i, defpackage.ahyn ahynVar) {
        defpackage.akzx akzxVarM = defpackage.ammf.a.m();
        akzxVarM.u();
        ((defpackage.ammf) akzxVarM.b).d = i - 2;
        akzxVarM.u();
        defpackage.ammf ammfVar = (defpackage.ammf) akzxVarM.b;
        java.lang.Object obj = this.b;
        j$.util.Objects.requireNonNull(obj);
        ammfVar.e = (java.lang.String) obj;
        akzxVarM.u();
        ((defpackage.ammf) akzxVarM.b).f = 1;
        if (ahynVar.f()) {
            java.lang.String str = (java.lang.String) ahynVar.b();
            akzxVarM.u();
            defpackage.ammf ammfVar2 = (defpackage.ammf) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            ammfVar2.h = str;
        }
        m((defpackage.ammf) akzxVarM.r());
    }

    public final void p(int i) {
        defpackage.akzx akzxVarM = defpackage.ammf.a.m();
        akzxVarM.u();
        ((defpackage.ammf) akzxVarM.b).d = 6;
        akzxVarM.u();
        defpackage.ammf ammfVar = (defpackage.ammf) akzxVarM.b;
        java.lang.Object obj = this.b;
        j$.util.Objects.requireNonNull(obj);
        ammfVar.e = (java.lang.String) obj;
        akzxVarM.u();
        ((defpackage.ammf) akzxVarM.b).f = 2;
        defpackage.akzx akzxVarM2 = defpackage.amlw.a.m();
        akzxVarM2.u();
        ((defpackage.amlw) akzxVarM2.b).b = i - 2;
        akzxVarM.u();
        defpackage.ammf ammfVar2 = (defpackage.ammf) akzxVarM.b;
        defpackage.amlw amlwVar = (defpackage.amlw) akzxVarM2.r();
        j$.util.Objects.requireNonNull(amlwVar);
        ammfVar2.c = amlwVar;
        ammfVar2.b = 7;
        m((defpackage.ammf) akzxVarM.r());
    }

    public final void q(int i) {
        defpackage.akzx akzxVarM = defpackage.ammf.a.m();
        akzxVarM.u();
        ((defpackage.ammf) akzxVarM.b).d = 5;
        akzxVarM.u();
        defpackage.ammf ammfVar = (defpackage.ammf) akzxVarM.b;
        java.lang.Object obj = this.b;
        j$.util.Objects.requireNonNull(obj);
        ammfVar.e = (java.lang.String) obj;
        akzxVarM.u();
        ((defpackage.ammf) akzxVarM.b).f = defpackage.a.S(4);
        defpackage.akzx akzxVarM2 = defpackage.amme.a.m();
        akzxVarM2.u();
        ((defpackage.amme) akzxVarM2.b).b = defpackage.a.R(i);
        akzxVarM.u();
        defpackage.ammf ammfVar2 = (defpackage.ammf) akzxVarM.b;
        defpackage.amme ammeVar = (defpackage.amme) akzxVarM2.r();
        j$.util.Objects.requireNonNull(ammeVar);
        ammfVar2.c = ammeVar;
        ammfVar2.b = 6;
        m((defpackage.ammf) akzxVarM.r());
    }

    public final void r(int i) {
        defpackage.akzx akzxVarM = defpackage.ammf.a.m();
        akzxVarM.u();
        ((defpackage.ammf) akzxVarM.b).d = 3;
        akzxVarM.u();
        defpackage.ammf ammfVar = (defpackage.ammf) akzxVarM.b;
        java.lang.Object obj = this.b;
        j$.util.Objects.requireNonNull(obj);
        ammfVar.e = (java.lang.String) obj;
        akzxVarM.u();
        ((defpackage.ammf) akzxVarM.b).f = defpackage.a.S(i);
        m((defpackage.ammf) akzxVarM.r());
    }

    public final void s(int i) {
        defpackage.akzx akzxVarM = defpackage.ammf.a.m();
        akzxVarM.u();
        ((defpackage.ammf) akzxVarM.b).d = 12;
        akzxVarM.u();
        defpackage.ammf ammfVar = (defpackage.ammf) akzxVarM.b;
        java.lang.Object obj = this.b;
        j$.util.Objects.requireNonNull(obj);
        ammfVar.e = (java.lang.String) obj;
        akzxVarM.u();
        ((defpackage.ammf) akzxVarM.b).f = defpackage.a.S(5);
        akzxVarM.u();
        ((defpackage.ammf) akzxVarM.b).g = i - 2;
        m((defpackage.ammf) akzxVarM.r());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final java.lang.String t(java.lang.String str, java.util.Map map) {
        java.lang.Object obj;
        acxk acxkVar = new acxk();
        acxkVar.d(true);
        acxkVar.c = new android.os.Bundle();
        acxkVar.d(false);
        if (acxkVar.b != 1 || (obj = acxkVar.c) == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (acxkVar.b == 0) {
                sb.append(" reinitializeHandleOnGetSnapshot");
            }
            if (acxkVar.c == null) {
                sb.append(" extras");
            }
            throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        aajm aajmVar = new aajm(acxkVar.a, (android.os.Bundle) obj);
        try {
            java.lang.Object obj2 = this.b;
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
            aajl aajlVar = new aajl(java.util.Arrays.asList(anei.a.b().a().split(",", -1)).contains(str) ? aajk.c : aajk.b);
            aajlVar.c(2, aajk.b);
            defpackage.aaum aaumVarW = ((defpackage.gat) ((defpackage.ahbq) obj2).a).w(1, 1, new aajv((defpackage.ahbq) obj2, str, aajmVar, aajlVar));
            ?? r2 = ((defpackage.ahbq) obj2).c;
            aaumVarW.n(r2, new aajw(obj2, jElapsedRealtime2, jCurrentTimeMillis2, 0));
            defpackage.aaum aaumVarE = aaumVarW.e(r2, new aakp(obj2, map, 1));
            aaumVarE.n(r2, new aajw(obj2, jElapsedRealtime, jCurrentTimeMillis, 1));
            return android.util.Base64.encodeToString((byte[]) ((uzx) defpackage.aazc.u(aaumVarE, 60000L, java.util.concurrent.TimeUnit.MILLISECONDS)).a, 11);
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            return y((android.content.Context) this.a, e);
        } catch (java.util.concurrent.ExecutionException e2) {
            java.lang.Object obj3 = this.a;
            java.lang.Throwable cause = e2.getCause();
            java.util.concurrent.ExecutionException cause2 = e2;
            if (cause != null) {
                cause2 = e2.getCause();
            }
            return y((android.content.Context) obj3, cause2);
        } catch (java.util.concurrent.TimeoutException e3) {
            return y((android.content.Context) this.a, e3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    public final void u(boolean z, com.google.android.gms.common.api.Status status) {
        java.util.HashMap map;
        java.util.HashMap map2;
        ?? r0 = this.b;
        synchronized (r0) {
            map = new java.util.HashMap((java.util.Map) r0);
        }
        ?? r3 = this.a;
        synchronized (r3) {
            map2 = new java.util.HashMap((java.util.Map) r3);
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (z || ((java.lang.Boolean) entry.getValue()).booleanValue()) {
                ((com.google.android.gms.common.api.internal.BasePendingResult) entry.getKey()).j(status);
            }
        }
        for (java.util.Map.Entry entry2 : map2.entrySet()) {
            if (z || ((java.lang.Boolean) entry2.getValue()).booleanValue()) {
                ((defpackage.zzx) entry2.getKey()).h(new defpackage.aacw(status));
            }
        }
    }

    public final defpackage.ajcq v(zrx zrxVar) {
        defpackage.aooh.f(zrxVar, "callParameter");
        java.lang.String str = zrxVar.e;
        defpackage.aooh.f(str, "phoneNumber");
        java.lang.String schemeSpecificPart = android.net.Uri.parse(str).getSchemeSpecificPart();
        defpackage.aooh.e(schemeSpecificPart, "getSchemeSpecificPart(...)");
        java.lang.Object obj = this.b;
        defpackage.zsk zskVar = (defpackage.zsk) obj;
        return defpackage.ahrv.g(((defpackage.oko) ((defpackage.ipc) zskVar.f.a).a).j(schemeSpecificPart)).i(new wzg(obj, zrxVar, 6), zskVar.e);
    }

    public final void w(zrx zrxVar) {
        defpackage.aooh.f(zrxVar, "callParameter");
        ((defpackage.agsm) this.a).g(v(zrxVar), 10L, java.util.concurrent.TimeUnit.SECONDS);
    }

    public acxg(defpackage.acck acckVar, defpackage.aoss aossVar) {
        defpackage.aooh.f(aossVar, "futureScope");
        this.a = acckVar;
        this.b = aossVar;
    }

    public acxg(defpackage.adae adaeVar, defpackage.abav abavVar) {
        defpackage.aooh.f(adaeVar, "clientRoleConfigProvider");
        defpackage.aooh.f(abavVar, "telemetryLogger");
        this.b = adaeVar;
        this.a = abavVar;
    }

    public acxg(defpackage.ecx ecxVar, defpackage.apdp apdpVar) {
        defpackage.aooh.f(ecxVar, "syncDataStore");
        defpackage.aooh.f(apdpVar, "mutex");
        this.b = ecxVar;
        this.a = apdpVar;
    }

    public acxg(java.lang.Class cls, java.lang.Object obj) {
        this.b = cls;
        this.a = obj;
    }

    public acxg(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public acxg(android.content.Context context) {
        this.a = context.getPackageName();
        this.b = android.accounts.AccountManager.get(context);
    }

    private acxg(android.content.Context context, byte[] bArr) {
        this.a = new defpackage.zzx(context, (byte[]) null);
        this.b = context.getPackageName();
    }

    public acxg(defpackage.aoin aoinVar, defpackage.aoss aossVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("permissionRequestsStateDataStoreProvider");
        }
        if (aossVar == null) {
            defpackage.aooh.i("backgroundScope");
        }
        this.a = aoinVar;
        this.b = aossVar;
    }

    public acxg(defpackage.zsk zskVar, defpackage.agsm agsmVar) {
        if (agsmVar == null) {
            defpackage.aooh.i("androidFutures");
        }
        this.b = zskVar;
        this.a = agsmVar;
    }

    public acxg(byte[] bArr) {
        defpackage.abcx abcxVar = new defpackage.abcx();
        this.b = new defpackage.aihb();
        this.a = abcxVar;
    }

    public acxg(defpackage.acxg acxgVar) {
        this.a = acxgVar.a;
        this.b = ((defpackage.aihb) acxgVar.b).g();
    }

    public acxg(defpackage.aoin aoinVar, defpackage.aoin aoinVar2) {
        aoinVar.getClass();
        this.b = aoinVar;
        aoinVar2.getClass();
        this.a = aoinVar2;
    }

    protected acxg() {
        throw null;
    }

    public acxg(char[] cArr) {
        this.b = j$.util.DesugarCollections.synchronizedMap(new java.util.WeakHashMap());
        this.a = j$.util.DesugarCollections.synchronizedMap(new java.util.WeakHashMap());
    }
}
