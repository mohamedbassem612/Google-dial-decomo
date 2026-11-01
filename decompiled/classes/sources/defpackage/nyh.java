package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class nyh implements defpackage.nwu {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/duo/impl/MeetCallControllerImpl");
    private static final android.content.ComponentName i = new android.content.ComponentName("com.google.android.apps.tachyon", "com.google.android.apps.tachyon.telecom.TachyonTelecomConnectionService");
    private static final android.content.ComponentName j = new android.content.ComponentName("com.google.android.apps.tachyon", "com.google.android.apps.tachyon.telecom.TelecomFallbackService");
    public final android.content.Context b;
    public final defpackage.rlv c;
    public final java.util.concurrent.atomic.AtomicInteger d = new java.util.concurrent.atomic.AtomicInteger(0);
    public defpackage.nwv e = defpackage.nwv.UNKNOWN_API_PROVIDER_AVAILABILITY;
    public final defpackage.olc f;
    public final defpackage.gpd g;
    public final defpackage.ahbv h;
    private final defpackage.ajct k;
    private final defpackage.ajcu l;
    private final defpackage.ajcu m;
    private final defpackage.aoin n;
    private final defpackage.aoin o;
    private final defpackage.zjv p;
    private final defpackage.rsr q;
    private final defpackage.kaw r;
    private final defpackage.aogc s;

    public nyh(android.content.Context context, defpackage.ajct ajctVar, defpackage.ajcu ajcuVar, defpackage.ajcu ajcuVar2, defpackage.rlv rlvVar, defpackage.gpd gpdVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.olc olcVar, defpackage.rsr rsrVar, defpackage.ahbv ahbvVar, defpackage.zjv zjvVar, defpackage.aogc aogcVar, defpackage.kaw kawVar) {
        this.b = context;
        this.k = ajctVar;
        this.l = ajcuVar;
        this.m = ajcuVar2;
        this.c = rlvVar;
        this.g = gpdVar;
        this.n = aoinVar;
        this.o = aoinVar2;
        this.f = olcVar;
        this.q = rsrVar;
        this.h = ahbvVar;
        this.p = zjvVar;
        this.s = aogcVar;
        this.r = kawVar;
    }

    public static boolean n(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(j);
        boolean z = !context.getPackageManager().queryIntentServices(intent, 786432).isEmpty();
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/duo/impl/MeetCallControllerImpl", "systemSupportsDuoUpgrade", 439, "MeetCallControllerImpl.java")).y("Supported: %b", java.lang.Boolean.valueOf(z));
        return z;
    }

    private final defpackage.ajcq o() {
        defpackage.olc olcVar = this.f;
        return defpackage.ahrv.g(defpackage.aosv.F(olcVar.c, 0, new defpackage.mev(olcVar, (defpackage.aoln) null, 5, (byte[]) null), 3)).h(new defpackage.jyx(this, 5), this.l);
    }

    @Override // defpackage.nwu
    public final defpackage.nwv a() {
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(390, "DuoKitImpl_getCachedMeetAvailability", defpackage.ahot.a, true);
        try {
            defpackage.agsm.i(391, g(true), "Error updating the value of is_bulk_reachability_check_eligible", new java.lang.Object[0]);
            defpackage.nwv nwvVar = this.e;
            ahoqVarX.close();
            return nwvVar;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarX.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.nwu
    public final defpackage.ajcq b() {
        defpackage.ahoq ahoqVarW = defpackage.ahvr.W(392, "MeetCallControllerImpl_getIsBulkReachabilityCheckEligible");
        try {
            defpackage.ajcq ajcqVarH = defpackage.ahvr.H(this.s.bk(), new defpackage.lix(15), defpackage.ajbm.INSTANCE);
            ahoqVarW.close();
            return ajcqVarH;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.nwu
    public final defpackage.ajcq c() {
        defpackage.ajcq ajcqVarBk = this.s.bk();
        defpackage.lix lixVar = new defpackage.lix(13);
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        long j2 = defpackage.ahqx.a;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), lixVar);
        int i2 = defpackage.ajan.c;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarBk, ahqvVar);
        ajcqVarBk.c(ajamVar, defpackage.aiql.t(ajbmVar, ajamVar));
        return ajamVar;
    }

    @Override // defpackage.nwu
    public final defpackage.ajcq d(android.content.Context context) {
        return defpackage.ahvr.F(new omj(context, 1), this.m);
    }

    @Override // defpackage.nwu
    public final defpackage.ajcq e(android.content.Context context) {
        if (!n(context)) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/duo/impl/MeetCallControllerImpl", "isUpgradeSupported", 318, "MeetCallControllerImpl.java")).v("fallback handover not supported");
            return defpackage.aiql.z(java.lang.Boolean.FALSE);
        }
        defpackage.ahoq ahoqVarW = defpackage.ahvr.W(393, "DuoKitImpl_isDuoKitActive");
        try {
            defpackage.ajcq ajcqVarH = defpackage.ahvr.H(o(), new defpackage.lix(14), defpackage.ajbm.INSTANCE);
            ahoqVarW.a(ajcqVarH);
            ahoqVarW.close();
            return ajcqVarH;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.nwu
    public final defpackage.ajcq f() {
        defpackage.ajam ajamVar;
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(394, "DuoKitImpl_updateDuoAvailability", defpackage.ahot.a, true);
        try {
            if (((java.lang.Boolean) this.n.a()).booleanValue() || ((java.lang.Boolean) this.o.a()).booleanValue()) {
                defpackage.ajcq ajcqVarO = o();
                defpackage.olc olcVar = this.f;
                defpackage.ajcq ajcqVarF = defpackage.aosv.F(olcVar.c, 0, new defpackage.mev(olcVar, (defpackage.aoln) null, 6, (char[]) null), 3);
                defpackage.ahda ahdaVar = new defpackage.ahda(new defpackage.anpu(true, defpackage.aify.o(new defpackage.ajcq[]{ajcqVarO, ajcqVarF})), (byte[]) null);
                defpackage.nyf nyfVar = new defpackage.nyf(ajcqVarO, ajcqVarF, 0);
                defpackage.ajcu ajcuVar = this.l;
                defpackage.ahrv ahrvVarI = defpackage.ahrv.g(ahdaVar.o(nyfVar, ajcuVar)).i(new defpackage.jwf(this, 12), ajcuVar);
                defpackage.kvf kvfVar = new defpackage.kvf(6);
                long j2 = defpackage.ahqx.a;
                defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), kvfVar);
                int i2 = defpackage.ajan.c;
                defpackage.ajam ajamVar2 = new defpackage.ajam(ahrvVarI, ahqvVar);
                ahrvVarI.c(ajamVar2, defpackage.aiql.t(ajcuVar, ajamVar2));
                ajamVar = ajamVar2;
            } else {
                defpackage.ajcq ajcqVarO2 = o();
                defpackage.lix lixVar = new defpackage.lix(12);
                defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
                long j3 = defpackage.ahqx.a;
                defpackage.ahqv ahqvVar2 = new defpackage.ahqv(defpackage.ahns.c(false), lixVar);
                int i3 = defpackage.ajan.c;
                ajamVar = new defpackage.ajam(ajcqVarO2, ahqvVar2);
                ajcqVarO2.c(ajamVar, defpackage.aiql.t(ajbmVar, ajamVar));
            }
            ahoqVarX.a(ajamVar);
            ahoqVarX.close();
            return ajamVar;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarX.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.nwu
    public final defpackage.ajcq g(final boolean z) {
        return this.r.p(this.s.bl(new defpackage.dxx() { // from class: nyg
            @Override // defpackage.dxx
            public final java.lang.Object a(java.lang.Object obj) {
                defpackage.aimz aimzVar = defpackage.nyh.a;
                defpackage.akzx akzxVarL = ((defpackage.nwy) obj).L();
                akzxVarL.u();
                defpackage.nwy nwyVar = (defpackage.nwy) akzxVarL.b;
                nwyVar.b |= 4;
                nwyVar.e = z;
                return (defpackage.nwy) akzxVarL.r();
            }
        }));
    }

    @Override // defpackage.nwu
    public final defpackage.ajcq h(defpackage.nwv nwvVar) {
        return this.r.p(this.s.bl(new defpackage.jsd(nwvVar, 14)));
    }

    @Override // defpackage.nwu
    public final void i(android.content.Context context, android.telecom.Call call) {
        j(context, call, j$.util.Optional.empty());
    }

    @Override // defpackage.nwu
    public final void j(android.content.Context context, android.telecom.Call call, j$.util.Optional optional) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("android.telecom.extra.HANDOVER_VIDEO_STATE", 3);
        lwx lwxVar = new lwx(bundle, 12);
        if (true == optional.isPresent()) {
            ((android.os.Bundle) lwxVar.a).putString("com.google.android.apps.tachyon.extra.LOCAL_PHONE_NUMBER", (java.lang.String) optional.get());
        }
        boolean zN = n(context);
        defpackage.aimz aimzVar = a;
        if (!zN) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/duo/impl/MeetCallControllerImpl", "requestUpgrade", (char) 217, "MeetCallControllerImpl.java")).v("upgrade not supported");
            return;
        }
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/duo/impl/MeetCallControllerImpl", "requestUpgrade", 221, "MeetCallControllerImpl.java")).v("upgrade supported, requesting upgrade");
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(j);
        int i2 = android.os.Build.VERSION.SDK_INT >= 34 ? 513 : 1;
        this.p.h(defpackage.mgv.UPGRADE_TO_MEET_CALL, defpackage.aike.a, defpackage.mhc.a, 3);
        context.bindService(intent, (android.content.ServiceConnection) new nye(context, call, bundle), i2);
    }

    @Override // defpackage.nwu
    public final void k(java.lang.String str, nwt nwtVar) {
        defpackage.ahvr.ci(str);
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(this.q.a());
        ljp ljpVar = new ljp(this, str, 12);
        defpackage.ajcu ajcuVar = this.l;
        defpackage.ahvr.J(ahrvVarG.i(ljpVar, ajcuVar).i(new ljp(this, nwtVar, 13, (byte[]) null), ajcuVar), new kxt(this, 7), this.k);
    }

    @Override // defpackage.nwu
    public final boolean l() {
        int i2 = this.d.get();
        if (i2 == 0) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/duo/impl/MeetCallControllerImpl", "isActivated", 304, "MeetCallControllerImpl.java")).v("cachedApiProviderAvailability is unknown");
        } else if (i2 == 3) {
            return true;
        }
        return false;
    }

    @Override // defpackage.nwu
    public final boolean m(java.lang.String str, java.lang.String str2) {
        return i.flattenToString().equals(str) && j$.util.Objects.equals(str2, "0");
    }
}
