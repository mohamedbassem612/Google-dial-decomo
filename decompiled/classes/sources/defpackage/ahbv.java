package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahbv {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;
    public final java.lang.Object g;

    public ahbv(android.content.Context context, defpackage.aoin aoinVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("animationTimeoutMillis");
        }
        this.a = context;
        this.c = aoinVar;
        this.f = new defpackage.aoiy(new defpackage.gpg(this, 12));
        this.d = new defpackage.aoiy(new defpackage.gpg(this, 13));
        this.e = new defpackage.aoiy(new defpackage.gpg(this, 14));
        this.g = new defpackage.aoiy(new defpackage.gpg(this, 15));
        this.b = new defpackage.aoiy(new defpackage.gpg(this, 16));
    }

    public static final void D(defpackage.aw awVar) {
        if (awVar == null) {
            defpackage.aooh.i("fragment");
        }
        android.view.View view = awVar.Q;
        android.view.ViewParent parent = view != null ? view.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            defpackage.dza.b(viewGroup, new defpackage.ddv(awVar, 9, null));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoir, java.lang.Object] */
    private final float E() {
        return ((java.lang.Number) this.f.a()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoir, java.lang.Object] */
    private final float F() {
        return ((java.lang.Number) this.d.a()).floatValue();
    }

    public static final boolean w(hkd hkdVar) {
        java.lang.String str = hkdVar.c;
        return str.contains("#") || str.startsWith("*");
    }

    public final android.graphics.drawable.RippleDrawable A(inx inxVar) {
        android.content.res.ColorStateList colorStateListValueOf;
        float fE = inxVar.a ? E() : F();
        float fE2 = inxVar.b ? E() : F();
        defpackage.aguv aguvVar = new defpackage.aguv((byte[]) null);
        aguvVar.i(fE);
        aguvVar.j(fE);
        aguvVar.g(fE2);
        aguvVar.h(fE2);
        defpackage.agaf agafVar = new defpackage.agaf(new defpackage.agal(aguvVar));
        android.content.Context context = (android.content.Context) this.a;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{2130969598});
        defpackage.aooh.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            colorStateListValueOf = android.content.res.ColorStateList.valueOf(defpackage.urg.c(context, 2130969108));
            defpackage.aooh.c(colorStateListValueOf);
        } else {
            colorStateListValueOf = android.content.res.ColorStateList.valueOf(defpackage.urg.c(context, 2130969105));
            defpackage.aooh.c(colorStateListValueOf);
        }
        agafVar.R(colorStateListValueOf);
        android.content.res.ColorStateList colorStateListValueOf2 = android.content.res.ColorStateList.valueOf(defpackage.urg.c(context, 2130968945));
        defpackage.aooh.e(colorStateListValueOf2, "valueOf(...)");
        return new android.graphics.drawable.RippleDrawable(colorStateListValueOf2, agafVar, agafVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aoin, java.lang.Object] */
    public final void B(defpackage.aw awVar) {
        defpackage.aooh.f(awVar, "fragment");
        java.lang.Object objA = this.c.a();
        defpackage.aooh.e(objA, "get(...)");
        awVar.aq(((java.lang.Number) objA).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public final void C(defpackage.agaw agawVar, inx inxVar) {
        defpackage.aooh.f(agawVar, "view");
        float fE = inxVar.a ? E() : F();
        float fE2 = inxVar.b ? E() : F();
        defpackage.aguv aguvVar = new defpackage.aguv(agawVar.es());
        aguvVar.o(fE);
        aguvVar.p(fE);
        aguvVar.m(fE2);
        aguvVar.n(fE2);
        agawVar.q(new defpackage.agal(aguvVar));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [aexi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    public final defpackage.ajcq a(java.lang.String str, boolean z) throws java.io.IOException {
        defpackage.aooh.f(str, "mendelPackage");
        defpackage.ahou ahouVar = defpackage.ahot.a;
        int i = 1;
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1348, "Fetching experiments for device", ahouVar, true);
        try {
            defpackage.ahoq ahoqVarX2 = defpackage.ahvr.X(1349, "PhenotypeApi.getConfigurationSnapshot", ahouVar, true);
            try {
                defpackage.ajcq ajcqVarD = this.e.d(str, "");
                if (z) {
                    ajcqVarD = defpackage.ahrc.a(ajcqVarD, 25L, java.util.concurrent.TimeUnit.SECONDS, this.b);
                }
                ahoqVarX2.a(ajcqVarD);
                defpackage.ajsz.ak(ahoqVarX2, null);
                defpackage.ajcq ajcqVarG = defpackage.ajan.g(ajcqVarD, defpackage.ahqx.c(new defpackage.adpx(this, str, 8)), defpackage.ajbm.INSTANCE);
                ahoqVarX.a(ajcqVarG);
                defpackage.ajsz.ak(ahoqVarX, null);
                defpackage.ajcq ajcqVarD2 = ((defpackage.aewq) this.g).f.d(false);
                defpackage.ahbx ahbxVar = new defpackage.ahbx(new defpackage.rou(16), i);
                defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
                return defpackage.ajan.f(defpackage.agab.aL(defpackage.ajsz.bb(defpackage.ahvr.B(ajcqVarD2, defpackage.aado.class, ahbxVar, ajbmVar), ajcqVarG)), defpackage.ahqx.a(new defpackage.vut(ajcqVarG, 20)), ajbmVar);
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    defpackage.ajsz.ak(ahoqVarX2, th);
                    throw th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            try {
                throw th3;
            } catch (java.lang.Throwable th4) {
                defpackage.ajsz.ak(ahoqVarX, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoir, java.lang.Object] */
    public final java.util.List b() {
        return (java.util.List) this.e.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoir, java.lang.Object] */
    public final java.util.List c() {
        return (java.util.List) this.g.a();
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [aoir, java.lang.Object] */
    public final void d(defpackage.zbw zbwVar, defpackage.zaw zawVar, java.lang.String str) {
        j$.util.Objects.checkIndex(0, 3);
        if (zawVar instanceof defpackage.zav) {
            ((defpackage.zzx) this.a).l(new defpackage.zbv(zbwVar, ((defpackage.zav) zawVar).a, null, null, str));
        } else {
            if (!(zawVar instanceof defpackage.zax)) {
                throw new defpackage.aois();
            }
            defpackage.zax zaxVar = (defpackage.zax) zawVar;
            ?? r7 = this.f;
            java.lang.Integer num = zaxVar.a;
            if (defpackage.ajsz.cj(r7, num) || defpackage.ajsz.cj(c(), zaxVar.c) || defpackage.ajsz.cj((java.util.List) this.b.a(), zaxVar.b)) {
                ((defpackage.zzx) this.a).l(new defpackage.zbv(zbwVar, num, zaxVar.c, zaxVar.b, str));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void e(defpackage.zbw zbwVar, defpackage.zbw zbwVar2, defpackage.ajcq ajcqVar) {
        defpackage.zay zayVar = new defpackage.zay(this, zbwVar2, zbwVar, 0);
        long j = defpackage.ahqx.a;
        ajcqVar.c(new defpackage.ajcc(ajcqVar, new defpackage.sqh(defpackage.ahns.c(false), zayVar, 2)), this.d);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq f(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.ahvr.I(((defpackage.zjm) this.c).l(phoneAccountHandle), new vkn(this, phoneAccountHandle, 20), this.g);
    }

    public final defpackage.ajcq g(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return ((defpackage.aogc) this.d).aM(phoneAccountHandle).g(new vfs(this, phoneAccountHandle, 12)).b(defpackage.mgv.VVM_IS_ACTIVATED).g();
    }

    public final boolean h(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return ((java.lang.Boolean) ((defpackage.aogc) this.d).aM(phoneAccountHandle).a(new vfs(this, phoneAccountHandle, 10)).a(defpackage.mgv.VVM_IS_CELLULAR_REQUIRED).f()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq i(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.ahvr.I(((defpackage.zjm) this.c).l(phoneAccountHandle), new vmq(phoneAccountHandle, 2), this.b);
    }

    @java.lang.Deprecated
    public final boolean j(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return ((java.lang.Boolean) ((defpackage.aogc) this.d).aM(phoneAccountHandle).a(new vfs(this, phoneAccountHandle, 13)).a(defpackage.mgv.VVM_IS_VOICEMAIL_ENABLED).f()).booleanValue();
    }

    public final boolean k() {
        return ((java.lang.Boolean) ((defpackage.mgu) this.a).a(new defpackage.vmp(this, 0)).a(defpackage.mgv.VVM_IS_MODULE_ENABLED).f()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq l(android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z) {
        return defpackage.ahvr.E(new rrq(this, phoneAccountHandle, z, 4), this.e);
    }

    public final defpackage.vcs m(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return (defpackage.vcs) ((defpackage.aoin) ((defpackage.zzx) this.a).k().getOrDefault(((defpackage.vdc) this.e).b(phoneAccountHandle).orElse(defpackage.vdd.VVM_CARRIER_UNKNOWN), new defpackage.rkv(8))).a();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq n(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.ajcq ajcqVarQ = q(phoneAccountHandle);
        defpackage.jyx jyxVar = new defpackage.jyx(this, 16);
        long j = defpackage.ahqx.a;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarQ, new defpackage.ahqv(defpackage.ahns.c(false), jyxVar));
        ajcqVarQ.c(ajamVar, defpackage.aiql.t(this.c, ajamVar));
        return ajamVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq o(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.ajcq ajcqVarQ = q(phoneAccountHandle);
        defpackage.jyx jyxVar = new defpackage.jyx(this, 18);
        long j = defpackage.ahqx.a;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarQ, new defpackage.ahqv(defpackage.ahns.c(false), jyxVar));
        ajcqVarQ.c(ajamVar, defpackage.aiql.t(this.c, ajamVar));
        return ajamVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq p(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.ajcq ajcqVarQ = q(phoneAccountHandle);
        defpackage.jyx jyxVar = new defpackage.jyx(this, 14);
        long j = defpackage.ahqx.a;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarQ, new defpackage.ahqv(defpackage.ahns.c(false), jyxVar));
        ajcqVarQ.c(ajamVar, defpackage.aiql.t(this.c, ajamVar));
        return ajamVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq q(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.ajcq ajcqVarA = ((defpackage.vdc) this.e).a(phoneAccountHandle);
        defpackage.jyx jyxVar = new defpackage.jyx(this, 17);
        long j = defpackage.ahqx.a;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), jyxVar);
        int i = defpackage.ajan.c;
        ?? r3 = this.c;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarA, ahqvVar);
        ajcqVarA.c(ajamVar, defpackage.aiql.t(r3, ajamVar));
        return ajamVar;
    }

    public final j$.util.Optional r(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        java.lang.Object obj = this.b;
        defpackage.vcs vcsVarM = m(phoneAccountHandle);
        defpackage.zzx zzxVar = (defpackage.zzx) obj;
        return !zzxVar.k().containsKey(vcsVarM) ? j$.util.Optional.empty() : j$.util.Optional.of((vch) ((defpackage.aoin) zzxVar.k().get(vcsVarM)).a());
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.Map] */
    public final defpackage.aigf s(defpackage.sso ssoVar, defpackage.aihd aihdVar, java.lang.String str) {
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(829, "DialerPhoneNumbersImpl_parseBulkInternal", defpackage.ahot.a, true);
        try {
            defpackage.aigb aigbVar = new defpackage.aigb(4);
            defpackage.ailj ailjVarK = aihdVar.iterator();
            while (ailjVarK.hasNext()) {
                java.lang.String str2 = (java.lang.String) ailjVarK.next();
                defpackage.sso ssoVar2 = ssoVar;
                java.lang.String str3 = str;
                aigbVar.i(str2, (hkd) j$.util.Map.-EL.computeIfAbsent((java.util.Map) this.e, new ssp(str2, str), new phs(ssoVar2, str2, str3, 4, (char[]) null)));
                ssoVar = ssoVar2;
                str = str3;
            }
            defpackage.aigf aigfVarE = aigbVar.e(true);
            ahoqVarX.close();
            return aigfVarE;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarX.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq t(hkd hkdVar, hkd hkdVar2) {
        return ((java.lang.Boolean) this.d.a()).booleanValue() ? defpackage.ahvr.F(new hsl(this, hkdVar, hkdVar2, 19), this.c) : defpackage.ahvr.H(((defpackage.agtc) this.f).a(), new oqe(hkdVar, hkdVar2, 17), this.c);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq u(defpackage.aihd aihdVar) {
        defpackage.guy guyVar = new defpackage.guy(aihdVar, 17);
        long j = defpackage.ahqx.a;
        defpackage.ajdk ajdkVar = new defpackage.ajdk(new defpackage.ajav(defpackage.ahns.c(false), guyVar, 1));
        this.a.execute(ajdkVar);
        return ajdkVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq v(java.lang.String str, java.lang.String str2) {
        ssp sspVar = new ssp(str, str2);
        if (!((java.lang.Boolean) this.d.a()).booleanValue()) {
            return defpackage.ahvr.H(((defpackage.agtc) this.f).a(), new lda(this, sspVar, str, str2, 3), this.b);
        }
        hkd hkdVar = (hkd) this.e.get(sspVar);
        return hkdVar != null ? defpackage.aiql.z(hkdVar) : defpackage.ahvr.F(new defpackage.joq(this, str, str2, sspVar, 7, (byte[]) null), this.b);
    }

    public final defpackage.ajcq x() {
        return ((defpackage.jyy) this.g).a(new ioi(this, 11));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoir, java.lang.Object] */
    public final float y() {
        return ((java.lang.Number) this.e.a()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoir, java.lang.Object] */
    public final int z() {
        return ((java.lang.Number) this.g.a()).intValue();
    }

    public ahbv(j$.util.Optional optional, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.ahbq ahbqVar, java.util.Map map, defpackage.aexi aexiVar, defpackage.ahda ahdaVar, defpackage.aewq aewqVar) {
        defpackage.aooh.f(optional, "reaper");
        defpackage.aooh.f(scheduledExecutorService, "executor");
        defpackage.aooh.f(ahbqVar, "deviceState");
        defpackage.aooh.f(map, "subpackagedToTier");
        defpackage.aooh.f(aexiVar, "phenotypeApi");
        defpackage.aooh.f(aewqVar, "phenotypeContext");
        this.a = optional;
        this.b = scheduledExecutorService;
        this.c = ahbqVar;
        this.d = map;
        this.e = aexiVar;
        this.f = ahdaVar;
        this.g = aewqVar;
    }

    public ahbv(defpackage.jyy jyyVar, defpackage.zjm zjmVar, defpackage.zjm zjmVar2, defpackage.kdd kddVar, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.aoin aoinVar) {
        this.g = jyyVar;
        this.c = zjmVar;
        this.b = zjmVar2;
        this.f = kddVar;
        this.e = ajctVar;
        this.a = ajctVar2;
        this.d = aoinVar;
    }

    public ahbv(defpackage.zjm zjmVar, defpackage.zjm zjmVar2, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.ajct ajctVar3, defpackage.aogc aogcVar, defpackage.mgu mguVar) {
        this.f = zjmVar;
        this.c = zjmVar2;
        this.b = ajctVar;
        this.g = ajctVar2;
        this.e = ajctVar3;
        this.d = aogcVar;
        this.a = mguVar;
    }

    public ahbv(defpackage.zzx zzxVar, defpackage.zzx zzxVar2, defpackage.zzx zzxVar3, defpackage.zzx zzxVar4, defpackage.ajct ajctVar, defpackage.zzx zzxVar5, defpackage.vdc vdcVar) {
        this.g = zzxVar;
        this.f = zzxVar2;
        this.b = zzxVar3;
        this.d = zzxVar4;
        this.c = ajctVar;
        this.a = zzxVar5;
        this.e = vdcVar;
    }

    public ahbv(android.content.Context context, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.ajct ajctVar3, defpackage.aoin aoinVar) {
        this.e = new j$.util.concurrent.ConcurrentHashMap();
        this.c = ajctVar;
        this.a = ajctVar2;
        this.b = ajctVar3;
        this.f = new defpackage.agtc(new defpackage.lkf(context, ajctVar, 5), defpackage.ajbm.INSTANCE);
        this.g = new defpackage.sso(context);
        this.d = aoinVar;
    }

    public ahbv(android.content.Context context, defpackage.grk grkVar, defpackage.gou gouVar, defpackage.gwj gwjVar, androidx.work.impl.WorkDatabase workDatabase, defpackage.gxl gxlVar, java.util.List list) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (grkVar == null) {
            defpackage.aooh.i("configuration");
        }
        if (workDatabase == null) {
            defpackage.aooh.i("workDatabase");
        }
        this.c = grkVar;
        this.f = gouVar;
        this.e = gwjVar;
        this.b = workDatabase;
        this.g = gxlVar;
        this.d = list;
        android.content.Context applicationContext = context.getApplicationContext();
        defpackage.aooh.e(applicationContext, "getApplicationContext(...)");
        this.a = applicationContext;
        new defpackage.gus((byte[]) null);
    }

    public ahbv(defpackage.zzx zzxVar, defpackage.ajct ajctVar, java.util.Set set, java.util.Set set2) {
        if (ajctVar == null) {
            defpackage.aooh.i("lightweightExecutor");
        }
        if (set == null) {
            defpackage.aooh.i("allCuiProviders");
        }
        if (set2 == null) {
            defpackage.aooh.i("allowlistedSemanticEventIds");
        }
        this.a = zzxVar;
        this.d = ajctVar;
        this.c = set;
        this.f = set2;
        this.e = new defpackage.aoiy(new defpackage.uob(this, 3));
        this.g = new defpackage.aoiy(new defpackage.uob(this, 4));
        this.b = new defpackage.aoiy(new defpackage.uob(this, 5));
    }

    public ahbv(android.content.Context context, defpackage.ajct ajctVar, defpackage.tvn tvnVar, defpackage.vze vzeVar, defpackage.vls vlsVar, defpackage.vli vliVar, defpackage.vdo vdoVar) {
        this.e = context;
        this.c = ajctVar;
        this.b = tvnVar;
        this.d = vzeVar;
        this.f = vlsVar;
        this.g = vliVar;
        this.a = vdoVar;
    }

    public ahbv(defpackage.aerr aerrVar, defpackage.ahzi ahziVar, defpackage.ahzi ahziVar2, java.util.concurrent.Executor executor, defpackage.amwu amwuVar, defpackage.gou gouVar, defpackage.aoin aoinVar) {
        this.d = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.e = aerrVar;
        this.f = ahziVar;
        this.c = ahziVar2;
        this.a = executor;
        this.g = gouVar.D(executor, amwuVar, null);
        this.b = aoinVar;
    }
}
