package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class nwn implements defpackage.zta {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/dualsim/impl/CallingAccountLoaderPrecallIntegration");
    public final defpackage.zjs b;
    public final defpackage.rlv c;
    public final defpackage.suf d;
    private final android.content.Context e;
    private final defpackage.aoss f;

    public nwn(android.content.Context context, defpackage.aoss aossVar, defpackage.zjs zjsVar, defpackage.suf sufVar, defpackage.rlv rlvVar) {
        if (context == null) {
            defpackage.aooh.i("applicationContext");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (zjsVar == null) {
            defpackage.aooh.i("dialerTelecom");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        this.e = context;
        this.f = aossVar;
        this.b = zjsVar;
        this.d = sufVar;
        this.c = rlvVar;
    }

    @Override // defpackage.zta
    public final al a(zrx zrxVar) {
        throw new java.lang.UnsupportedOperationException("CallingAccountLoaderPrecallIntegration does not have an UI");
    }

    @Override // defpackage.zta
    public final defpackage.ajcq b(zrx zrxVar) {
        defpackage.aooh.f(zrxVar, "callParameter");
        if ((zrxVar.b & 8) != 0) {
            ((defpackage.aimw) a.b().l("com/android/dialer/dualsim/impl/CallingAccountLoaderPrecallIntegration", "requestDecision", 51, "CallingAccountLoaderPrecallIntegration.kt")).v("CallingAccountSelector not used because CallIntent already has phoneAccountHandle.");
            return defpackage.aiql.z(zsz.b);
        }
        if (((zrxVar.c == 2 ? (zsf) zrxVar.d : zsf.a).b & 4096) == 0) {
            return defpackage.aosv.F(this.f, 0, new defpackage.nto(this, (defpackage.aoln) null, 10), 3);
        }
        ((defpackage.aimw) a.b().l("com/android/dialer/dualsim/impl/CallingAccountLoaderPrecallIntegration", "requestDecision", 56, "CallingAccountLoaderPrecallIntegration.kt")).v("dialog data already provided.");
        return defpackage.aiql.z(zsz.b);
    }

    @Override // defpackage.zta
    public final defpackage.ajcq c(zrx zrxVar) {
        defpackage.aooh.f(zrxVar, "callParameter");
        return defpackage.aosv.F(this.f, 0, new nwm(zrxVar, this, (defpackage.aoln) null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b9 A[Catch: all -> 0x025b, TRY_ENTER, TryCatch #2 {all -> 0x025b, blocks: (B:13:0x002d, B:32:0x00a4, B:35:0x00b9, B:37:0x00d2, B:38:0x00e3, B:40:0x0100, B:41:0x0109, B:44:0x0118, B:45:0x013d, B:47:0x0144, B:55:0x01c3, B:57:0x021d, B:58:0x0223, B:60:0x023c, B:61:0x0245, B:50:0x014f, B:52:0x015e), top: B:76:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d2 A[Catch: all -> 0x025b, TryCatch #2 {all -> 0x025b, blocks: (B:13:0x002d, B:32:0x00a4, B:35:0x00b9, B:37:0x00d2, B:38:0x00e3, B:40:0x0100, B:41:0x0109, B:44:0x0118, B:45:0x013d, B:47:0x0144, B:55:0x01c3, B:57:0x021d, B:58:0x0223, B:60:0x023c, B:61:0x0245, B:50:0x014f, B:52:0x015e), top: B:76:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0100 A[Catch: all -> 0x025b, TryCatch #2 {all -> 0x025b, blocks: (B:13:0x002d, B:32:0x00a4, B:35:0x00b9, B:37:0x00d2, B:38:0x00e3, B:40:0x0100, B:41:0x0109, B:44:0x0118, B:45:0x013d, B:47:0x0144, B:55:0x01c3, B:57:0x021d, B:58:0x0223, B:60:0x023c, B:61:0x0245, B:50:0x014f, B:52:0x015e), top: B:76:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0118 A[Catch: all -> 0x025b, TRY_ENTER, TryCatch #2 {all -> 0x025b, blocks: (B:13:0x002d, B:32:0x00a4, B:35:0x00b9, B:37:0x00d2, B:38:0x00e3, B:40:0x0100, B:41:0x0109, B:44:0x0118, B:45:0x013d, B:47:0x0144, B:55:0x01c3, B:57:0x021d, B:58:0x0223, B:60:0x023c, B:61:0x0245, B:50:0x014f, B:52:0x015e), top: B:76:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0144 A[Catch: all -> 0x025b, TryCatch #2 {all -> 0x025b, blocks: (B:13:0x002d, B:32:0x00a4, B:35:0x00b9, B:37:0x00d2, B:38:0x00e3, B:40:0x0100, B:41:0x0109, B:44:0x0118, B:45:0x013d, B:47:0x0144, B:55:0x01c3, B:57:0x021d, B:58:0x0223, B:60:0x023c, B:61:0x0245, B:50:0x014f, B:52:0x015e), top: B:76:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:52:0x015e A[Catch: all -> 0x025b, TRY_LEAVE, TryCatch #2 {all -> 0x025b, blocks: (B:13:0x002d, B:32:0x00a4, B:35:0x00b9, B:37:0x00d2, B:38:0x00e3, B:40:0x0100, B:41:0x0109, B:44:0x0118, B:45:0x013d, B:47:0x0144, B:55:0x01c3, B:57:0x021d, B:58:0x0223, B:60:0x023c, B:61:0x0245, B:50:0x014f, B:52:0x015e), top: B:76:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:57:0x021d A[Catch: all -> 0x025b, TryCatch #2 {all -> 0x025b, blocks: (B:13:0x002d, B:32:0x00a4, B:35:0x00b9, B:37:0x00d2, B:38:0x00e3, B:40:0x0100, B:41:0x0109, B:44:0x0118, B:45:0x013d, B:47:0x0144, B:55:0x01c3, B:57:0x021d, B:58:0x0223, B:60:0x023c, B:61:0x0245, B:50:0x014f, B:52:0x015e), top: B:76:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:60:0x023c A[Catch: all -> 0x025b, TryCatch #2 {all -> 0x025b, blocks: (B:13:0x002d, B:32:0x00a4, B:35:0x00b9, B:37:0x00d2, B:38:0x00e3, B:40:0x0100, B:41:0x0109, B:44:0x0118, B:45:0x013d, B:47:0x0144, B:55:0x01c3, B:57:0x021d, B:58:0x0223, B:60:0x023c, B:61:0x0245, B:50:0x014f, B:52:0x015e), top: B:76:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:80:0x014f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v16, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [aonj, java.lang.Object] */
    public final java.lang.Object d(zrx zrxVar, defpackage.aoln aolnVar) throws java.io.IOException {
        nwl nwlVar;
        defpackage.ahoq ahoqVarW;
        java.lang.String schemeSpecificPart;
        defpackage.suf sufVar;
        java.lang.Object objM;
        defpackage.ahoq ahoqVar;
        zrx zrxVar2;
        suc sucVar;
        j$.util.Optional optional;
        android.telecom.PhoneAccountHandle phoneAccountHandle;
        java.util.Iterator it;
        zsc zscVar;
        defpackage.alat alatVar;
        j$.util.Optional optional2;
        lwx lwxVar;
        defpackage.aimz aimzVar;
        j$.util.Optional optional3;
        lwx lwxVar2;
        if (aolnVar instanceof nwl) {
            nwlVar = (nwl) aolnVar;
            int i = nwlVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nwlVar.c = i - Integer.MIN_VALUE;
            } else {
                nwlVar = new nwl(this, aolnVar);
            }
        } else {
            nwlVar = new nwl(this, aolnVar);
        }
        java.lang.Object obj = nwlVar.a;
        zrx zrxVarA = defpackage.aolu.a;
        int i2 = nwlVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.suf sufVar2 = nwlVar.g;
                schemeSpecificPart = nwlVar.e;
                defpackage.ahoq ahoqVar2 = nwlVar.f;
                zrx zrxVar3 = nwlVar.d;
                try {
                    defpackage.aooc.af(obj);
                    sufVar = sufVar2;
                    zrxVar = zrxVar3;
                    objM = obj;
                    ahoqVarW = ahoqVar2;
                } catch (java.lang.Throwable th) {
                    th = th;
                    ahoqVar = ahoqVar2;
                }
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ahoqVar = nwlVar.f;
                zrxVar2 = nwlVar.d;
                try {
                    defpackage.aooc.af(obj);
                    sucVar = (suc) obj;
                    optional = sucVar.a;
                    defpackage.aooh.e(optional, "getSelectedPhoneAccountHandle(...)");
                    phoneAccountHandle = (android.telecom.PhoneAccountHandle) defpackage.aooh.q(optional);
                    if (phoneAccountHandle != null) {
                        aimzVar = a;
                        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/dualsim/impl/CallingAccountLoaderPrecallIntegration", "processPreferredAccount$<anonymous>$<anonymous>", 115, "CallingAccountLoaderPrecallIntegration.kt")).v("Phone account handle was auto selected.");
                        if (android.os.Build.VERSION.SDK_INT >= 33) {
                            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/dualsim/impl/CallingAccountLoaderPrecallIntegration", "processPreferredAccount$<anonymous>$<anonymous>", 119, "CallingAccountLoaderPrecallIntegration.kt")).y("Selected phone account handle: %s", optional);
                        }
                        zoe zoeVarCi = defpackage.aehj.ci(zrxVar2.L());
                        optional3 = sucVar.d;
                        lwxVar2 = new lwx(new lte(phoneAccountHandle, zoeVarCi, 7), 10);
                        if (true == optional3.isPresent()) {
                            lwxVar2.a.a(optional3.get());
                        }
                        zoeVarCi.c(defpackage.aehj.cg(phoneAccountHandle));
                        zrx zrxVarA2 = zoeVarCi.a();
                        defpackage.ajsz.ak(ahoqVar, null);
                        return zrxVarA2;
                    }
                    lvm lvmVarR = ((defpackage.akzx) sucVar.b.orElseThrow(new iaz(17))).r();
                    defpackage.aooh.e(lvmVarR, "build(...)");
                    lvm lvmVar = lvmVarR;
                    defpackage.alat alatVar2 = lvmVar.g;
                    defpackage.aooh.e(alatVar2, "getEntriesList(...)");
                    it = alatVar2.iterator();
                    do {
                        if (it.hasNext()) {
                            if (android.provider.Settings.System.getInt(this.e.getContentResolver(), "airplane_mode_on", 0) != 0) {
                                break;
                            }
                            ((defpackage.aimw) a.b().l("com/android/dialer/dualsim/impl/CallingAccountLoaderPrecallIntegration", "processPreferredAccount$<anonymous>", 151, "CallingAccountLoaderPrecallIntegration.kt")).v("no available accounts, showing an alert dialog to suggest turning off airplane mode");
                            this.c.o(defpackage.rmx.SUGGEST_TURN_OFF_AIRPLANE_MODE_PROMPT_DISPLAYED);
                            zoe zoeVarCi2 = defpackage.aehj.ci(zrxVar2.L());
                            uzx uzxVarCu = defpackage.aehj.cu(zoeVarCi2.b().L());
                            uzx uzxVarCv = defpackage.aehj.cv(zsc.a.m());
                            java.lang.Object obj2 = uzxVarCv.a;
                            ((defpackage.akzx) obj2).u();
                            zsc zscVar2 = ((defpackage.akzx) obj2).b;
                            zscVar2.b |= 4;
                            zscVar2.f = true;
                            uzxVarCu.X(uzxVarCv.ab());
                            zoeVarCi2.d(uzxVarCu.T());
                            zrx zrxVarA3 = zoeVarCi2.a();
                            defpackage.ajsz.ak(ahoqVar, null);
                            return zrxVarA3;
                        }
                    } while (!((lvl) it.next()).f);
                    zoe zoeVarCi3 = defpackage.aehj.ci(zrxVar2.L());
                    uzx uzxVarCu2 = defpackage.aehj.cu(zoeVarCi3.b().L());
                    uzx uzxVarCv2 = defpackage.aehj.cv(zsc.a.m());
                    uzxVarCv2.ac(lvmVar);
                    java.lang.Object obj3 = uzxVarCv2.a;
                    java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.akzx) obj3).b.e);
                    defpackage.aooh.e(listUnmodifiableList, "getDataIdsList(...)");
                    new defpackage.alct(listUnmodifiableList);
                    defpackage.aihd aihdVar = sucVar.c;
                    defpackage.aooh.e(aihdVar, "getDataIds(...)");
                    defpackage.aooh.f(aihdVar, "values");
                    ((defpackage.akzx) obj3).u();
                    zscVar = ((defpackage.akzx) obj3).b;
                    alatVar = zscVar.e;
                    if (!alatVar.c()) {
                        zscVar.e = defpackage.alad.J(alatVar);
                    }
                    defpackage.akyl.i(aihdVar, zscVar.e);
                    optional2 = sucVar.d;
                    lwxVar = new lwx(new npi(uzxVarCv2, 4), 11);
                    if (true == optional2.isPresent()) {
                        lwxVar.a.a(optional2.get());
                    }
                    uzxVarCu2.X(uzxVarCv2.ab());
                    zoeVarCi3.d(uzxVarCu2.T());
                    zrxVarA = zoeVarCi3.a();
                    defpackage.ajsz.ak(ahoqVar, null);
                    return zrxVarA;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            }
            try {
                throw th;
            } catch (java.lang.Throwable th3) {
                defpackage.ajsz.ak(ahoqVar, th);
                throw th3;
            }
        }
        defpackage.aooc.af(obj);
        ahoqVarW = defpackage.ahvr.W(385, "CallingAccountSelector_processPreferredAccount");
        try {
            schemeSpecificPart = android.net.Uri.parse(zrxVar.e).getSchemeSpecificPart();
            sufVar = this.d;
            defpackage.zjs zjsVar = this.b;
            nwlVar.d = zrxVar;
            nwlVar.f = ahoqVarW;
            nwlVar.e = schemeSpecificPart;
            nwlVar.g = sufVar;
            nwlVar.c = 1;
            objM = zjsVar.m(nwlVar);
            if (objM != zrxVarA) {
            }
            return zrxVarA;
        } catch (java.lang.Throwable th4) {
            th = th4;
            ahoqVar = ahoqVarW;
        }
        defpackage.ajcq ajcqVarA = sufVar.a(schemeSpecificPart, (java.util.List) objM, (zrxVar.c == 2 ? (zsf) zrxVar.d : zsf.a).f);
        defpackage.aooh.e(ajcqVarA, "selectAccount(...)");
        nwlVar.d = zrxVar;
        nwlVar.f = ahoqVarW;
        nwlVar.e = null;
        nwlVar.g = null;
        nwlVar.c = 2;
        java.lang.Object objD = defpackage.aosv.D(ajcqVarA, nwlVar);
        if (objD != zrxVarA) {
            zrxVar2 = zrxVar;
            ahoqVar = ahoqVarW;
            obj = objD;
            sucVar = (suc) obj;
            optional = sucVar.a;
            defpackage.aooh.e(optional, "getSelectedPhoneAccountHandle(...)");
            phoneAccountHandle = (android.telecom.PhoneAccountHandle) defpackage.aooh.q(optional);
            if (phoneAccountHandle != null) {
                aimzVar = a;
                ((defpackage.aimw) aimzVar.b().l("com/android/dialer/dualsim/impl/CallingAccountLoaderPrecallIntegration", "processPreferredAccount$<anonymous>$<anonymous>", 115, "CallingAccountLoaderPrecallIntegration.kt")).v("Phone account handle was auto selected.");
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    ((defpackage.aimw) aimzVar.b().l("com/android/dialer/dualsim/impl/CallingAccountLoaderPrecallIntegration", "processPreferredAccount$<anonymous>$<anonymous>", 119, "CallingAccountLoaderPrecallIntegration.kt")).y("Selected phone account handle: %s", optional);
                }
                zoe zoeVarCi4 = defpackage.aehj.ci(zrxVar2.L());
                optional3 = sucVar.d;
                lwxVar2 = new lwx(new lte(phoneAccountHandle, zoeVarCi4, 7), 10);
                if (true == optional3.isPresent()) {
                    lwxVar2.a.a(optional3.get());
                }
                zoeVarCi4.c(defpackage.aehj.cg(phoneAccountHandle));
                zrx zrxVarA4 = zoeVarCi4.a();
                defpackage.ajsz.ak(ahoqVar, null);
                return zrxVarA4;
            }
            lvm lvmVarR2 = ((defpackage.akzx) sucVar.b.orElseThrow(new iaz(17))).r();
            defpackage.aooh.e(lvmVarR2, "build(...)");
            lvm lvmVar2 = lvmVarR2;
            defpackage.alat alatVar3 = lvmVar2.g;
            defpackage.aooh.e(alatVar3, "getEntriesList(...)");
            it = alatVar3.iterator();
            do {
                if (it.hasNext()) {
                    if (android.provider.Settings.System.getInt(this.e.getContentResolver(), "airplane_mode_on", 0) != 0) {
                        break;
                    }
                    ((defpackage.aimw) a.b().l("com/android/dialer/dualsim/impl/CallingAccountLoaderPrecallIntegration", "processPreferredAccount$<anonymous>", 151, "CallingAccountLoaderPrecallIntegration.kt")).v("no available accounts, showing an alert dialog to suggest turning off airplane mode");
                    this.c.o(defpackage.rmx.SUGGEST_TURN_OFF_AIRPLANE_MODE_PROMPT_DISPLAYED);
                    zoe zoeVarCi5 = defpackage.aehj.ci(zrxVar2.L());
                    uzx uzxVarCu3 = defpackage.aehj.cu(zoeVarCi5.b().L());
                    uzx uzxVarCv3 = defpackage.aehj.cv(zsc.a.m());
                    java.lang.Object obj4 = uzxVarCv3.a;
                    ((defpackage.akzx) obj4).u();
                    zsc zscVar3 = ((defpackage.akzx) obj4).b;
                    zscVar3.b |= 4;
                    zscVar3.f = true;
                    uzxVarCu3.X(uzxVarCv3.ab());
                    zoeVarCi5.d(uzxVarCu3.T());
                    zrx zrxVarA5 = zoeVarCi5.a();
                    defpackage.ajsz.ak(ahoqVar, null);
                    return zrxVarA5;
                }
            } while (!((lvl) it.next()).f);
            zoe zoeVarCi6 = defpackage.aehj.ci(zrxVar2.L());
            uzx uzxVarCu4 = defpackage.aehj.cu(zoeVarCi6.b().L());
            uzx uzxVarCv4 = defpackage.aehj.cv(zsc.a.m());
            uzxVarCv4.ac(lvmVar2);
            java.lang.Object obj5 = uzxVarCv4.a;
            java.util.List listUnmodifiableList2 = j$.util.DesugarCollections.unmodifiableList(((defpackage.akzx) obj5).b.e);
            defpackage.aooh.e(listUnmodifiableList2, "getDataIdsList(...)");
            new defpackage.alct(listUnmodifiableList2);
            defpackage.aihd aihdVar2 = sucVar.c;
            defpackage.aooh.e(aihdVar2, "getDataIds(...)");
            defpackage.aooh.f(aihdVar2, "values");
            ((defpackage.akzx) obj5).u();
            zscVar = ((defpackage.akzx) obj5).b;
            alatVar = zscVar.e;
            if (!alatVar.c()) {
                zscVar.e = defpackage.alad.J(alatVar);
            }
            defpackage.akyl.i(aihdVar2, zscVar.e);
            optional2 = sucVar.d;
            lwxVar = new lwx(new npi(uzxVarCv4, 4), 11);
            if (true == optional2.isPresent()) {
                lwxVar.a.a(optional2.get());
            }
            uzxVarCu4.X(uzxVarCv4.ab());
            zoeVarCi6.d(uzxVarCu4.T());
            zrxVarA = zoeVarCi6.a();
            defpackage.ajsz.ak(ahoqVar, null);
        }
        return zrxVarA;
    }
}
