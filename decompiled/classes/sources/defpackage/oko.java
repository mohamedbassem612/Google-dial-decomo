package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class oko {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/externals/androidapis/telephony/DialerTelephony");
    public final defpackage.aoss b;
    public final java.util.concurrent.Executor c;
    public final defpackage.aoss d;
    public final defpackage.aolr e;
    public final android.content.Context f;
    public final defpackage.zjv g;
    public final android.telecom.TelecomManager h;
    public final android.telecom.PhoneAccountHandle i;
    public final android.telephony.TelephonyManager j;
    public final defpackage.aeqx k;
    private final android.content.pm.PackageManager l;
    private final defpackage.okh m;
    private final defpackage.rlv n;
    private final defpackage.aoin o;
    private final defpackage.aogc p;

    public oko(defpackage.aoss aossVar, java.util.concurrent.Executor executor, defpackage.aoss aossVar2, defpackage.aolr aolrVar, android.content.Context context, defpackage.zjv zjvVar, defpackage.aeqx aeqxVar, android.telecom.TelecomManager telecomManager, android.content.pm.PackageManager packageManager, defpackage.aogc aogcVar, defpackage.okh okhVar, defpackage.rlv rlvVar, defpackage.aoin aoinVar, android.telecom.PhoneAccountHandle phoneAccountHandle, android.telephony.TelephonyManager telephonyManager) {
        this.b = aossVar;
        this.c = executor;
        this.d = aossVar2;
        this.e = aolrVar;
        this.f = context;
        this.g = zjvVar;
        this.k = aeqxVar;
        this.h = telecomManager;
        this.l = packageManager;
        this.p = aogcVar;
        this.m = okhVar;
        this.n = rlvVar;
        this.o = aoinVar;
        this.i = phoneAccountHandle;
        this.j = telephonyManager;
    }

    private final boolean ab(java.lang.Throwable th) {
        if (th instanceof android.os.DeadObjectException) {
            return true;
        }
        java.lang.Throwable cause = th.getCause();
        return cause != null && ab(cause);
    }

    public final j$.util.Optional A() {
        try {
            defpackage.mgu mguVarH = h();
            defpackage.okf okfVarB = this.m.b(this.j);
            okfVarB.g.a();
            defpackage.zjm zjmVar = okfVarB.a;
            java.lang.String str = (java.lang.String) zjmVar.a();
            if (str == null) {
                zjmVar.b();
            }
            java.lang.Object objG = new defpackage.mgr(mguVarH, j$.util.Optional.ofNullable(str)).a(defpackage.mgv.TELEPHONY_GET_VISUAL_VOICEMAIL_PACKAGE_NAME).g(new defpackage.kju(18));
            if (objG == null) {
                defpackage.aooh.g();
            }
            return (j$.util.Optional) objG;
        } catch (java.lang.SecurityException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e)).i(defpackage.zct.b).l("com/android/dialer/externals/androidapis/telephony/DialerTelephony", "maybeGetVisualVoicemailPackageName", 667, "DialerTelephony.kt")).v("TelephonyManager.getVisualVoicemailPackageName called without permission.");
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            if (optionalEmpty != null) {
                return optionalEmpty;
            }
            defpackage.aooh.g();
            return null;
        }
    }

    public final j$.util.Optional B() {
        try {
            java.lang.Object objG = new defpackage.mgr(h(), j$.util.Optional.ofNullable(this.j.getVoiceMailAlphaTag())).a(defpackage.mgv.TELEPHONY_GET_VOICE_MAIL_ALPHA_TAG).g(new mig(20));
            defpackage.aooh.c(objG);
            return (j$.util.Optional) objG;
        } catch (java.lang.SecurityException unused) {
            ((defpackage.aimw) a.b().l("com/android/dialer/externals/androidapis/telephony/DialerTelephony", "maybeGetVoiceMailAlphaTag", 1144, "DialerTelephony.kt")).v("TelephonyManager.getVoiceMailAlphaTag called without permission.");
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            defpackage.aooh.c(optionalEmpty);
            return optionalEmpty;
        }
    }

    public final j$.util.Optional C() {
        try {
            java.lang.Object objG = new defpackage.mgr(h(), j$.util.Optional.ofNullable(this.j.getVoiceMailNumber())).a(defpackage.mgv.TELEPHONY_GET_VOICE_MAIL_NUMBER).g(new mig(10));
            defpackage.aooh.c(objG);
            return (j$.util.Optional) objG;
        } catch (java.lang.SecurityException unused) {
            ((defpackage.aimw) a.b().l("com/android/dialer/externals/androidapis/telephony/DialerTelephony", "maybeGetVoiceMailNumber", 898, "DialerTelephony.kt")).v("TelephonyManager.getVoiceMailNumber called without permission.");
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            defpackage.aooh.c(optionalEmpty);
            return optionalEmpty;
        }
    }

    /* JADX WARN: Type inference failed for: r8v10, types: [aonj, java.lang.Object] */
    public final j$.util.Optional D(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        j$.util.Optional optionalEmpty;
        byte[] bArr = null;
        if ((phoneAccountHandle != null ? phoneAccountHandle.getComponentName() : null) == null) {
            j$.util.Optional optionalEmpty2 = j$.util.Optional.empty();
            defpackage.aooh.e(optionalEmpty2, "empty(...)");
            return optionalEmpty2;
        }
        try {
            j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(da$.ExternalSyntheticApiModelOutline1.m(this.j, phoneAccountHandle));
            defpackage.okr okrVar = new defpackage.okr(new defpackage.nxi(this, phoneAccountHandle, 2, bArr), 1);
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = j$.util.Optional.ofNullable(okrVar.a.a(optionalOfNullable.get()));
            }
            if (optionalOfNullable == null) {
                defpackage.aooh.g();
            }
            return optionalOfNullable;
        } catch (java.lang.SecurityException e) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).k(e).l("com/android/dialer/externals/androidapis/telephony/DialerTelephony", "withPhoneAccountHandleLegacy", 119, "DialerTelephony.kt")).v("TelephonyManager.createForPhoneAccountHandle called without permission.");
            optionalEmpty = j$.util.Optional.empty();
            if (optionalEmpty == null) {
                defpackage.aooh.g();
                return null;
            }
            return optionalEmpty;
        } catch (java.lang.RuntimeException e2) {
            if (!((java.lang.Boolean) this.o.a()).booleanValue() || !ab(e2)) {
                throw e2;
            }
            ((defpackage.aimw) ((defpackage.aimw) a.b()).k(e2).l("com/android/dialer/externals/androidapis/telephony/DialerTelephony", "withPhoneAccountHandleLegacy", 128, "DialerTelephony.kt")).v("TelephonyManager.createForPhoneAccountHandle failed due to DeadObjectException.");
            optionalEmpty = j$.util.Optional.empty();
            if (optionalEmpty == null) {
                defpackage.aooh.g();
                return null;
            }
            return optionalEmpty;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [aonj, java.lang.Object] */
    public final j$.util.Optional E(int i) {
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(fh$.ExternalSyntheticApiModelOutline0.m(this.j, i));
        nzu nzuVar = new nzu(new npi(this, 19), 13);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(nzuVar.a.a(optionalOfNullable.get()));
        }
        defpackage.aooh.e(optionalOfNullable, "map(...)");
        return optionalOfNullable;
    }

    public final java.lang.Object F(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.e, new defpackage.ohg(this, (defpackage.aoln) null, 19, (char[]) null), aolnVar);
    }

    public final java.lang.Object G(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.e, new defpackage.okl(this, (defpackage.aoln) null, 1, (byte[]) null), aolnVar);
    }

    public final java.lang.Object H(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.e, new defpackage.okl(this, (defpackage.aoln) null, 5, (boolean[]) null), aolnVar);
    }

    public final java.lang.Object I(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.e, new defpackage.okl(this, (defpackage.aoln) null, 6, (float[]) null), aolnVar);
    }

    public final java.lang.Object J(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.e, new defpackage.okl(this, (defpackage.aoln) null, 7, (byte[][]) null), aolnVar);
    }

    public final java.lang.Object K(java.lang.String str, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.e, new ofa(this, str, (defpackage.aoln) null, 10), aolnVar);
    }

    public final java.lang.Object L(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.e, new defpackage.okl(this, (defpackage.aoln) null, 14, (char[][][]) null), aolnVar);
    }

    public final java.lang.Object M(android.telephony.TelephonyCallback telephonyCallback, defpackage.aoln aolnVar) {
        java.lang.Object objAj = defpackage.aoov.aj(this.e, new okm(this, telephonyCallback, (defpackage.aoln) null), aolnVar);
        return objAj != defpackage.aolu.a ? defpackage.aojh.a : objAj;
    }

    public final java.lang.Object N(android.telephony.TelephonyCallback telephonyCallback, defpackage.aoln aolnVar) {
        java.lang.Object objAj = defpackage.aoov.aj(this.e, new okn(this, telephonyCallback, (defpackage.aoln) null), aolnVar);
        return objAj != defpackage.aolu.a ? defpackage.aojh.a : objAj;
    }

    public final java.lang.Object O(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.e, new ofa(this, phoneAccountHandle, (defpackage.aoln) null, 11, (byte[]) null), aolnVar);
    }

    public final java.lang.Object P(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.e, new ofa(this, phoneAccountHandle, (defpackage.aoln) null, 13, (short[]) null), aolnVar);
    }

    public final java.lang.Object Q(int i, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.e, new bck(this, i, (defpackage.aoln) null, 9, (byte[]) null), aolnVar);
    }

    public final java.lang.Object R(int i, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.e, new bck(this, i, (defpackage.aoln) null, 10, (char[]) null), aolnVar);
    }

    public final java.lang.String S() {
        return (java.lang.String) defpackage.aooh.q(v());
    }

    public final java.lang.String T() {
        j$.util.Optional optionalZ = z();
        if (optionalZ == null) {
            defpackage.aooh.i("<this>");
        }
        return (java.lang.String) optionalZ.orElse((java.lang.Object) null);
    }

    public final java.util.List U() {
        java.lang.Object objD = new defpackage.mgr(h(), fn$.ExternalSyntheticApiModelOutline0.m(this.j)).b(defpackage.mgv.TELEPHONY_GET_UICC_CARDS_INFO).e(new mig(9)).d(new mig(15));
        defpackage.aooh.e(objD, "asUserdata(...)");
        return (java.util.List) objD;
    }

    public final void V(android.telephony.PhoneStateListener phoneStateListener, int i) {
        this.j.listen(phoneStateListener, i);
        defpackage.mgv mgvVar = defpackage.mgv.TELEPHONY_LISTEN;
        java.util.List listAY = defpackage.ajsz.aY(defpackage.gus.av(i));
        android.telecom.PhoneAccountHandle phoneAccountHandle = this.i;
        defpackage.zjv.i(this.g, mgvVar, listAY, defpackage.gus.aw(defpackage.aais.aH(phoneAccountHandle != null ? phoneAccountHandle.getId() : null)), 0, 24);
    }

    public final void W(android.telephony.VisualVoicemailSmsFilterSettings visualVoicemailSmsFilterSettings) {
        da$.ExternalSyntheticApiModelOutline1.m(this.j, visualVoicemailSmsFilterSettings);
        new defpackage.mgr(h(), visualVoicemailSmsFilterSettings).b(defpackage.mgv.TELEPHONY_SET_VISUAL_VOICEMAIL_SMS_FILTER_SETTINGS).d(new okk(visualVoicemailSmsFilterSettings));
    }

    public final boolean X(java.lang.String str) {
        defpackage.aooh.f(str, "number");
        try {
            boolean zM = fn$.ExternalSyntheticApiModelOutline0.m(this.j, str);
            defpackage.zjv zjvVar = this.g;
            defpackage.mgv mgvVar = defpackage.mgv.TELEPHONY_IS_EMERGENCY_NUMBER;
            java.util.List listAY = defpackage.ajsz.aY(defpackage.gus.ax(zM));
            android.telecom.PhoneAccountHandle phoneAccountHandle = this.i;
            defpackage.zjv.i(zjvVar, mgvVar, listAY, defpackage.gus.aw(defpackage.aais.aH(phoneAccountHandle != null ? phoneAccountHandle.getId() : null)), 0, 24);
            return zM;
        } catch (java.lang.IllegalStateException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).k(e).l("com/android/dialer/externals/androidapis/telephony/DialerTelephony", "isEmergencyNumberLegacy", 313, "DialerTelephony.kt")).v("Error while checking number for emergency");
            return false;
        }
    }

    public final boolean Y() {
        java.lang.Object objF = new defpackage.mgf(h(), this.j.isHearingAidCompatibilitySupported()).a(defpackage.mgv.TELEPHONY_IS_HEARING_AID_COMPATIBILITY_SUPPORTED).f();
        defpackage.aooh.e(objF, "ifTrue(...)");
        return ((java.lang.Boolean) objF).booleanValue();
    }

    public final boolean Z() {
        java.lang.Object objD = new defpackage.mgr(h(), java.lang.Integer.valueOf(baa$.ExternalSyntheticApiModelOutline1.m$1(this.j))).b(defpackage.mgv.TELEPHONY_GET_ACTIVE_MODEM_COUNT).d(new defpackage.kju(17));
        defpackage.aooh.e(objD, "asUserdata(...)");
        return ((java.lang.Number) objD).intValue() > 1;
    }

    public final int a() {
        java.lang.Object objD = new defpackage.mgr(h(), java.lang.Integer.valueOf(((java.lang.Number) this.m.b(this.j).d.a()).intValue())).b(defpackage.mgv.TELEPHONY_GET_PHONE_COUNT).d(new mig(11));
        defpackage.aooh.e(objD, "asUserdata(...)");
        return ((java.lang.Number) objD).intValue();
    }

    public final boolean aa() {
        java.lang.Object objF = new defpackage.mgf(h(), this.j.isNetworkRoaming()).a(defpackage.mgv.TELEPHONY_IS_NETWORK_ROAMING).f();
        defpackage.aooh.e(objF, "ifTrue(...)");
        return ((java.lang.Boolean) objF).booleanValue();
    }

    public final int b() {
        defpackage.okh okhVar = this.m;
        android.telephony.TelephonyManager telephonyManager = this.j;
        defpackage.mgu mguVarH = h();
        int iIntValue = ((java.lang.Number) okhVar.b(telephonyManager).e.a()).intValue();
        j$.util.Objects.requireNonNull(mguVarH);
        return new defpackage.mgi(mguVarH, defpackage.mgv.TELEPHONY_GET_PHONE_TYPE, java.lang.Integer.valueOf(iIntValue), iIntValue).f();
    }

    public final int c() {
        defpackage.mgu mguVarH = h();
        int iM = ft$.ExternalSyntheticApiModelOutline0.m(this.j);
        j$.util.Objects.requireNonNull(mguVarH);
        return defpackage.gus.aD(defpackage.mgv.TELEPHONY_GET_SIM_CARRIER_ID, iM, mguVarH).f();
    }

    public final int d() {
        defpackage.okf okfVarB = this.m.b(this.j);
        okfVarB.g.a();
        defpackage.zjm zjmVar = okfVarB.c;
        int iIntValue = ((java.lang.Number) zjmVar.a()).intValue();
        int i = -1;
        if (iIntValue == -1) {
            ((defpackage.aimw) defpackage.okh.a.b().l("com/android/dialer/externals/androidapis/telephony/CachedTelephonyManager", "getSimSpecificCarrierId", 84, "CachedTelephonyManager.kt")).v("simSpecificCarrierId from cache is UNKNOWN_CARRIER_ID. Invalidating the cache.");
            zjmVar.b();
            iIntValue = -1;
        }
        if (iIntValue == -1) {
            this.n.o(defpackage.rmx.TELEPHONY_UNKNOWN_CARRIER_ID);
        } else {
            i = iIntValue;
        }
        defpackage.mgu mguVarH = h();
        j$.util.Objects.requireNonNull(mguVarH);
        return new defpackage.mgi(mguVarH, defpackage.mgv.TELEPHONY_GET_SIM_SPECIFIC_CARRIER_ID, java.lang.Integer.valueOf(i), i).f();
    }

    public final int e() {
        defpackage.mgu mguVarH = h();
        int simState = this.j.getSimState();
        j$.util.Objects.requireNonNull(mguVarH);
        return defpackage.gus.aD(defpackage.mgv.TELEPHONY_GET_SIM_STATE, simState, mguVarH).f();
    }

    public final int f() {
        try {
            defpackage.mgu mguVarH = h();
            int iM = fh$.ExternalSyntheticApiModelOutline0.m(this.j);
            j$.util.Objects.requireNonNull(mguVarH);
            return defpackage.gus.aD(defpackage.mgv.TELEPHONY_GET_VOICE_NETWORK_TYPE, iM, mguVarH).f();
        } catch (java.lang.SecurityException e) {
            ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e).l("com/android/dialer/externals/androidapis/telephony/DialerTelephony", "getVoiceNetworkType", 556, "DialerTelephony.kt")).v("TelephonyManager.getVoiceNetworkType called without permission.");
            return 0;
        }
    }

    public final android.os.PersistableBundle g() {
        return (android.os.PersistableBundle) defpackage.aooh.q(s());
    }

    public final defpackage.mgu h() {
        return this.p.aM(this.i);
    }

    public final defpackage.oko i(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        java.lang.Object objOrElse = D(phoneAccountHandle).orElse(this);
        defpackage.aooh.e(objOrElse, "orElse(...)");
        return (defpackage.oko) objOrElse;
    }

    public final defpackage.ajcq j(java.lang.String str) {
        defpackage.aooh.f(str, "number");
        return defpackage.aosv.F(this.d, 0, new ohh(this, str, (defpackage.aoln) null, 7), 3);
    }

    public final defpackage.ajcq k() {
        return defpackage.aosv.F(this.d, 0, new ogf(this, (defpackage.aoln) null, 16, (boolean[]) null), 3);
    }

    public final defpackage.ajcq l() {
        return defpackage.aosv.F(this.b, 0, new defpackage.okl(this, (defpackage.aoln) null, 15, (short[][][]) null), 3);
    }

    public final defpackage.ajcq m(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.aosv.F(this.b, 0, new ofa(this, phoneAccountHandle, (defpackage.aoln) null, 12, (char[]) null), 3);
    }

    public final defpackage.ajcq n(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.aosv.F(this.d, 0, new ohh(this, phoneAccountHandle, (defpackage.aoln) null, 8), 3);
    }

    public final j$.util.Optional o() {
        try {
            j$.util.Optional optionalEmpty = android.os.Build.VERSION.SDK_INT < 34 ? j$.util.Optional.empty() : j$.util.Optional.of(rp$.ExternalSyntheticApiModelOutline0.m(this.j));
            defpackage.aooh.c(optionalEmpty);
            return optionalEmpty;
        } catch (java.lang.IllegalStateException unused) {
            ((defpackage.aimw) a.b().l("com/android/dialer/externals/androidapis/telephony/DialerTelephony", "getPrimaryImei", 935, "DialerTelephony.kt")).v("TelephonyService is unavailable.");
            j$.util.Optional optionalEmpty2 = j$.util.Optional.empty();
            defpackage.aooh.c(optionalEmpty2);
            return optionalEmpty2;
        } catch (java.lang.SecurityException unused2) {
            ((defpackage.aimw) a.b().l("com/android/dialer/externals/androidapis/telephony/DialerTelephony", "getPrimaryImei", 929, "DialerTelephony.kt")).v("TelephonyManager.getPrimaryImei called without permission.");
            j$.util.Optional optionalEmpty3 = j$.util.Optional.empty();
            defpackage.aooh.c(optionalEmpty3);
            return optionalEmpty3;
        } catch (java.lang.UnsupportedOperationException unused3) {
            ((defpackage.aimw) a.b().l("com/android/dialer/externals/androidapis/telephony/DialerTelephony", "getPrimaryImei", 932, "DialerTelephony.kt")).v("The device does not have PackageManager#FEATURE_TELEPHONY_GSM.");
            j$.util.Optional optionalEmpty4 = j$.util.Optional.empty();
            defpackage.aooh.c(optionalEmpty4);
            return optionalEmpty4;
        }
    }

    public final j$.util.Optional p() {
        try {
            defpackage.mgu mguVarH = h();
            android.telephony.ServiceState serviceStateM = da$.ExternalSyntheticApiModelOutline1.m(this.j);
            java.lang.Object objF = new defpackage.mgr(mguVarH, j$.util.Optional.of(java.lang.Integer.valueOf(serviceStateM != null ? serviceStateM.getState() : 1))).a(defpackage.mgv.TELEPHONY_GET_SERVICE_STATE).f(new defpackage.kju(15));
            if (objF == null) {
                defpackage.aooh.g();
            }
            return (j$.util.Optional) objF;
        } catch (java.lang.SecurityException e) {
            ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e).l("com/android/dialer/externals/androidapis/telephony/DialerTelephony", "getServiceStateLegacy", 248, "DialerTelephony.kt")).v("TelephonyManager.getServiceState called without permission.");
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            if (optionalEmpty != null) {
                return optionalEmpty;
            }
            defpackage.aooh.g();
            return null;
        }
    }

    public final j$.util.Optional q() {
        defpackage.okh okhVar = this.m;
        defpackage.mgu mguVarH = h();
        defpackage.okf okfVarB = okhVar.b(this.j);
        okfVarB.g.a();
        java.lang.Object objG = new defpackage.mgr(mguVarH, j$.util.Optional.ofNullable((java.lang.String) okfVarB.b.a())).a(defpackage.mgv.TELEPHONY_GET_SIM_OPERATOR).g(new defpackage.kju(16));
        defpackage.aooh.e(objG, "asStringUserdataIfPresent(...)");
        return (j$.util.Optional) objG;
    }

    public final j$.util.Optional r() {
        try {
            java.lang.Object objF = new defpackage.mgr(h(), j$.util.Optional.of(java.lang.Integer.valueOf(this.j.getCallState()))).a(defpackage.mgv.TELEPHONY_GET_CALL_STATE).f(new mig(12));
            defpackage.aooh.c(objF);
            return (j$.util.Optional) objF;
        } catch (java.lang.SecurityException e) {
            ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e).l("com/android/dialer/externals/androidapis/telephony/DialerTelephony", "maybeGetCallState", 762, "DialerTelephony.kt")).v("TelephonyManager.getCallState called without permission.");
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            defpackage.aooh.c(optionalEmpty);
            return optionalEmpty;
        }
    }

    public final j$.util.Optional s() {
        try {
            j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(da$.ExternalSyntheticApiModelOutline1.m(this.j));
            defpackage.aooh.c(optionalOfNullable);
            return optionalOfNullable;
        } catch (java.lang.SecurityException e) {
            ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e).l("com/android/dialer/externals/androidapis/telephony/DialerTelephony", "maybeGetCarrierConfig", 721, "DialerTelephony.kt")).v("TelephonyManager.getCarrierConfig called without permission.");
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            defpackage.aooh.c(optionalEmpty);
            return optionalEmpty;
        }
    }

    public final j$.util.Optional t() {
        try {
            defpackage.mgu mguVarH = h();
            defpackage.okf okfVarB = this.m.b(this.j);
            okfVarB.g.a();
            java.lang.Object objG = new defpackage.mgr(mguVarH, j$.util.Optional.ofNullable((java.lang.String) okfVarB.f.a())).a(defpackage.mgv.TELEPHONY_GET_GROUP_ID_LEVEL1).g(new defpackage.kju(12));
            if (objG == null) {
                defpackage.aooh.g();
            }
            return (j$.util.Optional) objG;
        } catch (java.lang.SecurityException e) {
            ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e).l("com/android/dialer/externals/androidapis/telephony/DialerTelephony", "maybeGetGroupIdLevel1", 585, "DialerTelephony.kt")).v("TelephonyManager.getGroupIdLevel1 called without permission.");
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            if (optionalEmpty != null) {
                return optionalEmpty;
            }
            defpackage.aooh.g();
            return null;
        }
    }

    public final j$.util.Optional u(java.lang.Integer num) {
        try {
            defpackage.mgu mguVarH = h();
            android.telephony.TelephonyManager telephonyManager = this.j;
            java.lang.Object objH = new defpackage.mgr(mguVarH, j$.util.Optional.ofNullable(num == null ? da$.ExternalSyntheticApiModelOutline1.m$2(telephonyManager) : da$.ExternalSyntheticApiModelOutline1.m(telephonyManager, num.intValue()))).a(defpackage.mgv.TELEPHONY_GET_IMEI).h(new naa(num, 17));
            defpackage.aooh.c(objH);
            return (j$.util.Optional) objH;
        } catch (java.lang.SecurityException e) {
            ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e).l("com/android/dialer/externals/androidapis/telephony/DialerTelephony", "maybeGetImei", 964, "DialerTelephony.kt")).v("TelephonyManager.getImei called without permission.");
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            defpackage.aooh.c(optionalEmpty);
            return optionalEmpty;
        }
    }

    public final j$.util.Optional v() {
        try {
            java.lang.Object objD = new defpackage.mgr(h(), j$.util.Optional.ofNullable(this.j.getLine1Number())).a(defpackage.mgv.TELEPHONY_GET_LINE1_NUMBER_V2).d(new mig(18));
            defpackage.aooh.c(objD);
            return (j$.util.Optional) objD;
        } catch (java.lang.SecurityException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e)).i(defpackage.zct.b).l("com/android/dialer/externals/androidapis/telephony/DialerTelephony", "maybeGetLine1Number", 497, "DialerTelephony.kt")).v("TelephonyManager.getLine1Number called without permission.");
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            defpackage.aooh.c(optionalEmpty);
            return optionalEmpty;
        }
    }

    public final j$.util.Optional w(java.lang.Integer num) {
        if (!this.l.hasSystemFeature("android.hardware.telephony.cdma")) {
            ((defpackage.aimw) a.b().l("com/android/dialer/externals/androidapis/telephony/DialerTelephony", "maybeGetMeid", 991, "DialerTelephony.kt")).v("TelephonyManager.getMeid called without FEATURE_TELEPHONY_CDMA");
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            defpackage.aooh.e(optionalEmpty, "empty(...)");
            return optionalEmpty;
        }
        try {
            defpackage.mgu mguVarH = h();
            android.telephony.TelephonyManager telephonyManager = this.j;
            java.lang.Object objH = new defpackage.mgr(mguVarH, j$.util.Optional.ofNullable(num == null ? da$.ExternalSyntheticApiModelOutline1.m$3(telephonyManager) : da$.ExternalSyntheticApiModelOutline1.m$1(telephonyManager, num.intValue()))).a(defpackage.mgv.TELEPHONY_GET_MEID).h(new naa(num, 16));
            defpackage.aooh.c(objH);
            return (j$.util.Optional) objH;
        } catch (java.lang.SecurityException e) {
            ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e).l("com/android/dialer/externals/androidapis/telephony/DialerTelephony", "maybeGetMeid", 1009, "DialerTelephony.kt")).v("TelephonyManager.getMeid called without permission.");
            j$.util.Optional optionalEmpty2 = j$.util.Optional.empty();
            defpackage.aooh.c(optionalEmpty2);
            return optionalEmpty2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:16:0x002e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0013  */
    public final j$.util.Optional x() {
        java.lang.String str;
        java.lang.String str2;
        android.telephony.TelephonyManager telephonyManager = this.j;
        java.lang.String networkCountryIso = telephonyManager.getNetworkCountryIso();
        if (networkCountryIso == null) {
            str = android.os.SystemProperties.get("debug.dialer.network_country_iso", "");
            if (str == null) {
                defpackage.aooh.g();
            }
            str2 = true != defpackage.aoov.H(str) ? str : null;
            if (str2 == null) {
                networkCountryIso = telephonyManager.getNetworkCountryIso();
            } else {
                networkCountryIso = str2;
            }
        } else {
            if (true == defpackage.aoov.H(networkCountryIso)) {
                networkCountryIso = null;
            }
            if (networkCountryIso == null) {
                str = android.os.SystemProperties.get("debug.dialer.network_country_iso", "");
                if (str == null) {
                    defpackage.aooh.g();
                }
                if (true != defpackage.aoov.H(str)) {
                }
                if (str2 == null) {
                    networkCountryIso = telephonyManager.getNetworkCountryIso();
                } else {
                    networkCountryIso = str2;
                }
            }
        }
        java.lang.Object objG = new defpackage.mgr(h(), j$.util.Optional.ofNullable(networkCountryIso)).a(defpackage.mgv.TELEPHONY_GET_NETWORK_COUNTRY_ISO).g(new defpackage.kju(14));
        defpackage.aooh.e(objG, "asStringUserdataIfPresent(...)");
        return (j$.util.Optional) objG;
    }

    public final j$.util.Optional y() {
        java.lang.Object objG = new defpackage.mgr(h(), j$.util.Optional.ofNullable(da$.ExternalSyntheticApiModelOutline1.m$1(this.j))).a(defpackage.mgv.TELEPHONY_GET_NETWORK_SPECIFIER).g(new mig(17));
        defpackage.aooh.e(objG, "asStringUserdataIfPresent(...)");
        return (j$.util.Optional) objG;
    }

    public final j$.util.Optional z() {
        java.lang.Object objG = new defpackage.mgr(h(), j$.util.Optional.ofNullable(this.j.getSimCountryIso())).a(defpackage.mgv.TELEPHONY_GET_SIM_COUNTRY_ISO).g(new defpackage.kju(13));
        defpackage.aooh.e(objG, "asStringUserdataIfPresent(...)");
        return (j$.util.Optional) objG;
    }
}
