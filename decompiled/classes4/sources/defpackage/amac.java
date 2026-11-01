package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amac {
    private static defpackage.amac c;
    public final java.lang.Object a;
    public java.lang.Object b;

    public amac(ahvh ahvhVar) {
        this.b = new java.util.ArrayList();
        defpackage.ahue ahueVar = ahvhVar.c;
        if ((ahueVar == null ? defpackage.ahue.a : ahueVar).b.size() > 0) {
            defpackage.ahue ahueVar2 = ahvhVar.c;
            this.a = (ahud) (ahueVar2 == null ? defpackage.ahue.a : ahueVar2).b.get(0);
        } else {
            this.a = ahud.a;
            android.util.Log.e("SessionRequestImpl", "The provided request is empty.");
        }
    }

    public static defpackage.amac t() {
        defpackage.amac amacVar = c;
        if (amacVar != null) {
            return amacVar;
        }
        defpackage.amac amacVar2 = new defpackage.amac();
        c = amacVar2;
        return amacVar2;
    }

    private static boolean u(defpackage.amaz amazVar, java.lang.String str) {
        return str.equals(((defpackage.amay) amazVar.c.get(0)).b.trim());
    }

    private final boolean v(defpackage.amaz amazVar, final java.lang.String str, final java.lang.String str2) {
        java.lang.Object obj = this.b;
        j$.util.Objects.requireNonNull(str2);
        java.lang.Float f = (java.lang.Float) ((defpackage.amaj) obj).c.get(str2);
        return (f != null ? f.floatValue() : 0.0f) > 0.0f && j$.util.Collection.-EL.stream(amazVar.c).anyMatch(new java.util.function.Predicate() { // from class: amaa
            @Override // java.util.function.Predicate
            public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
                return j$.util.function.Predicate.-CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ java.util.function.Predicate negate() {
                return j$.util.function.Predicate.-CC.$default$negate(this);
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
                return j$.util.function.Predicate.-CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj2) {
                defpackage.amay amayVar = (defpackage.amay) obj2;
                if (str.equals(amayVar.b.trim())) {
                    java.lang.String str3 = str2;
                    defpackage.amac amacVar = this.a;
                    float f2 = amayVar.c;
                    java.lang.Object obj3 = amacVar.b;
                    j$.util.Objects.requireNonNull(str3);
                    java.lang.Float f3 = (java.lang.Float) ((defpackage.amaj) obj3).c.get(str3);
                    if (f2 >= (f3 != null ? f3.floatValue() : 1.0f)) {
                        return true;
                    }
                }
                return false;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00e0  */
    private final void w(akzx akzxVar, alcf alcfVar, akzm akzmVar, android.content.Context context, java.lang.String str) {
        android.content.pm.PackageManager.NameNotFoundException e;
        java.lang.String string;
        java.lang.String string2;
        aehj aehjVar = defpackage.afjy.c;
        if (defpackage.afjy.c(defpackage.anjv.a.eZ().b(defpackage.afjy.b))) {
            if (str != null) {
                return;
            } else {
                str = null;
            }
        }
        java.lang.Object obj = this.a;
        akzxVar.u();
        defpackage.alhz alhzVar = (defpackage.alhz) akzxVar.b;
        defpackage.alhz alhzVar2 = defpackage.alhz.a;
        j$.util.Objects.requireNonNull(obj);
        alhzVar.c = (java.lang.String) obj;
        akzx akzxVarM = defpackage.alga.a.m();
        akzxVarM.u();
        defpackage.alga algaVar = (defpackage.alga) akzxVarM.b;
        j$.util.Objects.requireNonNull(alcfVar);
        algaVar.c = alcfVar;
        algaVar.b |= 1;
        akzxVarM.u();
        defpackage.alga algaVar2 = (defpackage.alga) akzxVarM.b;
        j$.util.Objects.requireNonNull(akzmVar);
        algaVar2.d = akzmVar;
        algaVar2.b |= 2;
        java.lang.String language = java.util.Locale.getDefault().getLanguage();
        aehj aehjVar2 = defpackage.afjy.c;
        if (defpackage.afjy.b(defpackage.anlc.c(defpackage.afjy.b))) {
            language = java.util.Locale.getDefault().toLanguageTag();
        }
        akzx akzxVarM2 = defpackage.alhx.a.m();
        akzxVarM2.u();
        defpackage.alhx alhxVar = (defpackage.alhx) akzxVarM2.b;
        j$.util.Objects.requireNonNull(language);
        alhxVar.b = language;
        defpackage.alhx alhxVar2 = (defpackage.alhx) akzxVarM2.p();
        akzxVarM.u();
        defpackage.alga algaVar3 = (defpackage.alga) akzxVarM.b;
        j$.util.Objects.requireNonNull(alhxVar2);
        algaVar3.e = alhxVar2;
        algaVar3.b |= 4;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    java.lang.CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                    string = !android.text.TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                    try {
                        string2 = !android.text.TextUtils.isEmpty(packageInfo.versionName) ? packageInfo.versionName : java.lang.Integer.toString(packageInfo.versionCode);
                    } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                        e = e2;
                        android.util.Log.e("SurveyMetricsLogger", "Exception while retrieving application information.", e);
                        string2 = "Unknown";
                    }
                } else {
                    string = "Unknown";
                    string2 = string;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException e3) {
                e = e3;
                string = "Unknown";
            }
        } else {
            string = "Unknown";
            string2 = string;
        }
        java.lang.String packageName = android.text.TextUtils.isEmpty(context.getPackageName()) ? "Unknown" : context.getPackageName();
        akzx akzxVarM3 = defpackage.alfw.a.m();
        java.lang.String str2 = android.os.Build.MODEL;
        akzxVarM3.u();
        defpackage.alfw alfwVar = (defpackage.alfw) akzxVarM3.b;
        j$.util.Objects.requireNonNull(str2);
        alfwVar.b = str2;
        akzxVarM3.u();
        ((defpackage.alfw) akzxVarM3.b).c = a.T(3);
        java.lang.String str3 = android.os.Build.VERSION.RELEASE;
        akzxVarM3.u();
        defpackage.alfw alfwVar2 = (defpackage.alfw) akzxVarM3.b;
        j$.util.Objects.requireNonNull(str3);
        alfwVar2.d = str3;
        akzxVarM3.u();
        defpackage.alfw alfwVar3 = (defpackage.alfw) akzxVarM3.b;
        j$.util.Objects.requireNonNull(string);
        alfwVar3.e = string;
        akzxVarM3.u();
        defpackage.alfw alfwVar4 = (defpackage.alfw) akzxVarM3.b;
        j$.util.Objects.requireNonNull(packageName);
        alfwVar4.f = packageName;
        akzxVarM3.u();
        defpackage.alfw alfwVar5 = (defpackage.alfw) akzxVarM3.b;
        j$.util.Objects.requireNonNull(string2);
        alfwVar5.g = string2;
        defpackage.alfw alfwVar6 = (defpackage.alfw) akzxVarM3.p();
        java.lang.String id = java.util.TimeZone.getDefault().getID();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        long rawOffset = ((long) j$.util.DesugarTimeZone.getTimeZone(id).getRawOffset()) / 1000;
        akzx akzxVarM4 = akzm.a.m();
        akzxVarM4.u();
        akzxVarM4.b.b = rawOffset;
        akzm akzmVarP = akzxVarM4.p();
        akzx akzxVarM5 = defpackage.alfx.a.m();
        akzxVarM5.u();
        defpackage.alfx alfxVar = (defpackage.alfx) akzxVarM5.b;
        j$.util.Objects.requireNonNull(alfwVar6);
        alfxVar.c = alfwVar6;
        alfxVar.b |= 1;
        akzxVarM5.u();
        defpackage.alfx alfxVar2 = (defpackage.alfx) akzxVarM5.b;
        j$.util.Objects.requireNonNull(akzmVarP);
        alfxVar2.d = akzmVarP;
        alfxVar2.b |= 2;
        defpackage.alfx alfxVar3 = (defpackage.alfx) akzxVarM5.p();
        akzx akzxVarM6 = defpackage.alfy.a.m();
        akzxVarM6.u();
        ((defpackage.alfy) akzxVarM6.b).b = a.Q(4);
        java.lang.String strG = defpackage.afjz.g();
        akzxVarM6.u();
        defpackage.alfy alfyVar = (defpackage.alfy) akzxVarM6.b;
        java.lang.String strConcat = strG.concat("");
        j$.util.Objects.requireNonNull(strConcat);
        alfyVar.c = strConcat;
        defpackage.alfv alfvVar = defpackage.alfv.CLIENT_CAPABILITY_PII;
        akzxVarM6.u();
        defpackage.alfy alfyVar2 = (defpackage.alfy) akzxVarM6.b;
        j$.util.Objects.requireNonNull(alfvVar);
        alak alakVar = alfyVar2.d;
        if (!alakVar.c()) {
            alfyVar2.d = alad.H(alakVar);
        }
        alfyVar2.d.g(alfvVar.a());
        int iA = defpackage.afjz.a();
        akzxVarM6.u();
        ((defpackage.alfy) akzxVarM6.b).e = iA;
        defpackage.alfy alfyVar3 = (defpackage.alfy) akzxVarM6.p();
        akzx akzxVarM7 = defpackage.alfz.a.m();
        akzxVarM7.u();
        defpackage.alfz alfzVar = (defpackage.alfz) akzxVarM7.b;
        j$.util.Objects.requireNonNull(alfxVar3);
        alfzVar.c = alfxVar3;
        alfzVar.b |= 1;
        akzxVarM7.u();
        defpackage.alfz alfzVar2 = (defpackage.alfz) akzxVarM7.b;
        j$.util.Objects.requireNonNull(alfyVar3);
        alfzVar2.d = alfyVar3;
        alfzVar2.b |= 2;
        defpackage.alfz alfzVar3 = (defpackage.alfz) akzxVarM7.p();
        akzxVarM.u();
        defpackage.alga algaVar4 = (defpackage.alga) akzxVarM.b;
        j$.util.Objects.requireNonNull(alfzVar3);
        algaVar4.f = alfzVar3;
        algaVar4.b |= 32;
        defpackage.alga algaVar5 = (defpackage.alga) akzxVarM.p();
        akzxVar.u();
        defpackage.alhz alhzVar3 = (defpackage.alhz) akzxVar.b;
        j$.util.Objects.requireNonNull(algaVar5);
        alhzVar3.d = algaVar5;
        alhzVar3.b |= 1;
        java.lang.Object obj2 = this.b;
        if (obj2 == null) {
            android.util.Log.w("SurveyMetricsLogger", "No logger provider exists, skipped");
            return;
        }
        amdx amdxVar = (amdx) obj2;
        if (amdxVar.a == null) {
            android.content.Context applicationContext = context.getApplicationContext();
            aehj aehjVar3 = defpackage.afjy.c;
            java.lang.String strA = defpackage.anjv.a.eZ().a(defpackage.afjy.b);
            if (amdxVar.a == null) {
                amdxVar.a = new zzd(applicationContext, strA, str);
            }
        }
        java.lang.Object obj3 = this.b;
        alad aladVarP = akzxVar.p();
        java.lang.Object obj4 = ((amdx) obj3).a;
        if (obj4 != null) {
            zzc zzcVarG = ((zzd) obj4).g(aladVarP);
            ((zyy) zzcVarG).o = 1;
            zzcVarG.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x008c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0092  */
    /* JADX WARN: Code duplicated, block: B:21:0x009a  */
    /* JADX WARN: Code duplicated, block: B:22:0x009d  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b3  */
    final defpackage.alzx a(defpackage.amaz amazVar) {
        final double dSum = j$.util.Collection.-EL.stream(amazVar.c).mapToDouble(new defpackage.alyx(2)).sum();
        akzx akzxVarP = amazVar.p();
        akzxVarP.u();
        ((defpackage.amaz) akzxVarP.b).c = albq.a;
        akzxVarP.bc((java.lang.Iterable) j$.util.Collection.-EL.stream(amazVar.c).map(new java.util.function.Function() { // from class: amab
            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                defpackage.amay amayVar = (defpackage.amay) obj;
                akzx akzxVarP2 = amayVar.p();
                double d = amayVar.c;
                akzxVarP2.u();
                ((defpackage.amay) akzxVarP2.b).c = (float) (d / dSum);
                return (defpackage.amay) akzxVarP2.p();
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$compose(this, function);
            }
        }).collect(aido.a));
        defpackage.amaz amazVar2 = (defpackage.amaz) akzxVarP.p();
        if (v(amazVar2, "H", "C")) {
            return defpackage.alzx.b;
        }
        if (u(amazVar2, "H") || v(amazVar2, "H", "H")) {
            return defpackage.alzx.a;
        }
        if (u(amazVar2, "V")) {
            float f = ((defpackage.amay) amazVar2.c.get(0)).c;
            java.lang.Object obj = this.b;
            j$.util.Objects.requireNonNull("I");
            java.lang.Float f2 = (java.lang.Float) ((defpackage.amaj) obj).c.get("I");
            if (f < (f2 != null ? f2.floatValue() : 0.0f)) {
                if (!v(amazVar2, "V", "V")) {
                    if (u(amazVar2, "D")) {
                        return defpackage.alzx.d;
                    }
                    if (u(amazVar2, "W")) {
                        return defpackage.alzx.h;
                    }
                    return u(amazVar2, "N") ? defpackage.alzx.i : defpackage.alzx.g;
                }
            }
        } else if (!v(amazVar2, "V", "V")) {
            if (u(amazVar2, "D")) {
                return defpackage.alzx.d;
            }
            if (u(amazVar2, "W")) {
                return defpackage.alzx.h;
            }
            if (u(amazVar2, "N")) {
            }
        }
        return defpackage.alzx.e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [amad, java.lang.Object] */
    final void b(java.lang.String str) {
        this.b = this.a.b(str);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq c(java.util.concurrent.Callable callable, j$.util.Optional optional) throws defpackage.aljs {
        e();
        boolean zA = ((defpackage.alpg) this.a).a();
        ajcq ajcqVarD = aiql.D(callable, (java.util.concurrent.Executor) ((j$.util.Optional) this.b).get());
        d(ajcqVarD, optional, zA);
        return ajcqVarD;
    }

    public final void d(ajcq ajcqVar, j$.util.Optional optional, boolean z) {
        aiql.I(ajcqVar, new defpackage.alpo(this, optional, z), ajbm.a);
    }

    public final void e() throws defpackage.aljs {
        if (((j$.util.Optional) this.b).isEmpty()) {
            throw new defpackage.aljs("MonitoredExecutor not initialized.", defpackage.aljr.f);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final ajvb f() {
        ?? r1 = this.b;
        return new ajvb((java.lang.String) this.a, r1 == 0 ? java.util.Collections.EMPTY_MAP : j$.util.DesugarCollections.unmodifiableMap(new java.util.HashMap((java.util.Map) r1)));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void g(java.lang.annotation.Annotation annotation) {
        if (this.b == null) {
            this.b = new java.util.HashMap();
        }
        this.b.put(ajvi.class, annotation);
    }

    public final java.lang.String h() {
        return ((ahud) this.a).b;
    }

    public final ahou i() {
        return ahns.q() ? ahou.d(ahvr.ad((android.content.Context) this.a)) : ahot.a;
    }

    public final ahpm j(java.lang.String str) {
        if (ahns.q()) {
            return null;
        }
        java.lang.Object obj = this.a;
        return ahvr.ac((android.content.Context) obj).c(1428, str + ' ' + obj.getClass().getSimpleName(), ahpc.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final ahpm k(android.content.Intent intent) {
        ahou ahouVarD;
        ahpm ahpmVarH;
        java.lang.Object obj = this.a;
        if (intent != null) {
            long j = ahqx.a;
            if (ahqx.p(intent) != null) {
                ahouVarD = ahou.d(ahvr.ad((android.content.Context) obj));
                aooh.c(ahouVarD);
            } else {
                ahouVarD = ahot.a;
                aooh.c(ahouVarD);
            }
        } else {
            ahouVarD = ahot.a;
            aooh.c(ahouVarD);
        }
        java.lang.Class<?> cls = obj.getClass();
        ahpj ahpjVarB = ahns.b();
        java.lang.String strConcat = java.lang.String.valueOf(cls.getName()).concat(".onBind");
        if (intent == null) {
            ahpmVarH = afsq.H((android.app.Service) obj, strConcat);
        } else {
            long j2 = ahqx.a;
            ahpj ahpjVarP = ahqx.p(intent);
            if (ahpjVarP == null) {
                ahpmVarH = afsq.H((android.app.Service) obj, strConcat);
            } else {
                ahns.u(ahpjVarP);
                final int i = 3;
                ahpmVarH = new ahpm() { // from class: ahnv
                    public final void close() {
                        int i2 = i;
                        if (i2 == 1) {
                            boolean z = ahns.a;
                            return;
                        }
                        if (i2 == 2) {
                            ahns.l();
                        } else if (i2 == 3) {
                            afec.c();
                            ahns.u((ahpj) null);
                        }
                    }
                };
            }
        }
        return new ahol(ahvr.X(1431, o("onBind"), ahouVarD, true), ahpmVarH, ahpjVarB);
    }

    public final ahpm l() {
        ahou ahouVarI = i();
        final ahpj ahpjVarB = ahns.b();
        final ahpj ahpjVarC = null;
        if (!ahns.q()) {
            ahpj ahpjVar = ahns.k;
            if (ahpjVar != null) {
                ahns.k = null;
                ahpjVarC = ahpjVar;
            }
            if (ahpjVarC != null) {
                defpackage.ahon ahonVar = new defpackage.ahon(0);
                ahns.u(ahpjVarC);
                ahou ahouVarB = ahou.b();
                ahouVarB.a(ahpc.c, ahonVar);
                this.b = ahvr.X(1430, "Creating ".concat(java.lang.String.valueOf(this.a.getClass().getSimpleName())), ahouVarB.f(), true);
            } else {
                java.lang.Object obj = this.a;
                ahpjVarC = ahvr.ac((android.content.Context) obj).c(1429, "Creating ".concat(java.lang.String.valueOf(obj.getClass().getSimpleName())), ahpc.a);
            }
        }
        final ahoq ahoqVarX = ahvr.X(1432, o("onCreate"), ahouVarI, true);
        return new ahpm() { // from class: ahom
            /* JADX WARN: Type inference failed for: r0v2, types: [ahpm, java.lang.Object] */
            public final void close() {
                ahoqVarX.close();
                ?? r0 = this.d.b;
                if (r0 != 0) {
                    r0.close();
                }
                ahpm ahpmVar = ahpjVarC;
                if (ahpmVar != null) {
                    ahpmVar.close();
                }
                ahns.u(ahpjVarB);
            }
        };
    }

    public final ahpm m(java.lang.String str) {
        ahou ahouVarI = i();
        ahpj ahpjVarB = ahns.b();
        return new ahol(ahvr.X(1433, o(str), ahouVarI, true), j(str), ahpjVarB);
    }

    public final ahpm n() {
        ahou ahouVarI = i();
        ahpj ahpjVarB = ahns.b();
        return new ahol(ahvr.X(1434, o("onDestroy"), ahouVarI, true), j("Destroying"), ahpjVarB);
    }

    public final java.lang.String o(java.lang.String str) {
        return str + ' ' + this.a.getClass().getSimpleName();
    }

    public final void p(defpackage.algp algpVar, alcf alcfVar, akzm akzmVar, android.content.Context context, java.lang.String str) {
        akzx akzxVarM = defpackage.alhz.a.m();
        akzxVarM.u();
        defpackage.alhz alhzVar = (defpackage.alhz) akzxVarM.b;
        j$.util.Objects.requireNonNull(algpVar);
        alhzVar.e = algpVar;
        alhzVar.b |= 2;
        w(akzxVarM, alcfVar, akzmVar, context, str);
    }

    public final void q(defpackage.algy algyVar, alcf alcfVar, akzm akzmVar, android.content.Context context, java.lang.String str) {
        akzx akzxVarM = defpackage.alhz.a.m();
        akzxVarM.u();
        defpackage.alhz alhzVar = (defpackage.alhz) akzxVarM.b;
        j$.util.Objects.requireNonNull(algyVar);
        alhzVar.g = algyVar;
        alhzVar.b |= 8;
        w(akzxVarM, alcfVar, akzmVar, context, str);
    }

    public final void r(alhy alhyVar, alcf alcfVar, akzm akzmVar, android.content.Context context, java.lang.String str) {
        akzx akzxVarM = defpackage.alhz.a.m();
        akzxVarM.u();
        defpackage.alhz alhzVar = (defpackage.alhz) akzxVarM.b;
        j$.util.Objects.requireNonNull(alhyVar);
        alhzVar.f = alhyVar;
        alhzVar.b |= 4;
        w(akzxVarM, alcfVar, akzmVar, context, str);
    }

    public final defpackage.aeis s() {
        java.lang.Object obj = this.b;
        if (obj != null) {
            return new defpackage.aeis((ahyn) this.a, (aehj) obj);
        }
        throw new java.lang.IllegalStateException("Missing required properties: accountCapabilitiesRetriever");
    }

    public amac(java.lang.String str) {
        this.b = null;
        this.a = str;
    }

    public amac(byte[] bArr) {
        this.a = ahwt.a;
    }

    private amac() {
        long jNextLong = new java.security.SecureRandom().nextLong();
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : java.lang.Math.abs(jNextLong);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(jCurrentTimeMillis);
        sb.append('_');
        sb.append(jAbs);
        this.a = sb.toString();
    }

    public amac(java.lang.Object obj) {
        this.a = obj;
    }

    public amac(defpackage.alpg alpgVar) {
        this.b = j$.util.Optional.empty();
        this.a = alpgVar;
    }
}
