package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zjs {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/dialershared/externals/androidapis/telecom/DialerTelecom");
    public final defpackage.aoss b;
    public final defpackage.aoss c;
    public final defpackage.aolr d;
    public final android.content.Context e;
    public final defpackage.ajct f;
    public final defpackage.zjv g;
    public final defpackage.mgu h;
    public final android.telecom.TelecomManager i;
    public final defpackage.zrw j;
    public final defpackage.zjp k;
    private final defpackage.aoin l;
    private final j$.util.concurrent.ConcurrentHashMap m;

    public zjs(defpackage.aoss aossVar, defpackage.aoss aossVar2, defpackage.aolr aolrVar, android.content.Context context, defpackage.ajct ajctVar, defpackage.zjv zjvVar, defpackage.mgu mguVar, android.telecom.TelecomManager telecomManager, defpackage.zrw zrwVar, defpackage.zjp zjpVar, defpackage.aoin aoinVar) {
        if (aossVar == null) {
            defpackage.aooh.i("blockingScope");
        }
        if (aossVar2 == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("blockingContext");
        }
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (ajctVar == null) {
            defpackage.aooh.i("blockingExecutor");
        }
        if (zjvVar == null) {
            defpackage.aooh.i("externalsLogging");
        }
        if (mguVar == null) {
            defpackage.aooh.i("scopedDiffRecorder");
        }
        if (telecomManager == null) {
            defpackage.aooh.i("telecomManager");
        }
        if (zjpVar == null) {
            defpackage.aooh.i("cachedTelecomManager");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("enableCachingTelecomGetDefaultDialerPackage");
        }
        this.b = aossVar;
        this.c = aossVar2;
        this.d = aolrVar;
        this.e = context;
        this.f = ajctVar;
        this.g = zjvVar;
        this.h = mguVar;
        this.i = telecomManager;
        this.j = zrwVar;
        this.k = zjpVar;
        this.l = aoinVar;
        this.m = new j$.util.concurrent.ConcurrentHashMap();
    }

    public final boolean A(android.telecom.PhoneAccountHandle phoneAccountHandle, java.lang.String str) {
        defpackage.aooh.f(phoneAccountHandle, "accountHandle");
        boolean z = false;
        if (str == null || str.length() == 0) {
            return false;
        }
        defpackage.aoiu aoiuVar = new defpackage.aoiu(phoneAccountHandle, str);
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.m;
        java.lang.Boolean bool = (java.lang.Boolean) concurrentHashMap.get(aoiuVar);
        if (bool != null) {
            return bool.booleanValue();
        }
        if (y() || defpackage.zqz.a(this.e, "android.permission.READ_PHONE_STATE")) {
            boolean zIsVoiceMailNumber = this.i.isVoiceMailNumber(phoneAccountHandle, str);
            defpackage.zjv.i(this.g, defpackage.mgv.TELECOM_IS_VOICEMAIL_NUMBER, defpackage.ajsz.bb(defpackage.aais.aE(phoneAccountHandle), defpackage.gus.ax(false)), defpackage.gus.ax(zIsVoiceMailNumber), 0, 24);
            z = zIsVoiceMailNumber;
        }
        concurrentHashMap.put(aoiuVar, java.lang.Boolean.valueOf(z));
        return z;
    }

    public final java.lang.Object B(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.d, new tyf(this, (defpackage.aoln) null, 18, (char[]) null), aolnVar);
    }

    public final android.net.Uri a() {
        if (x()) {
            android.net.Uri uri = android.provider.CallLog.Calls.CONTENT_URI_WITH_VOICEMAIL;
            defpackage.aooh.e(uri, "CONTENT_URI_WITH_VOICEMAIL");
            return uri;
        }
        android.net.Uri uri2 = android.provider.CallLog.Calls.CONTENT_URI;
        defpackage.aooh.e(uri2, "CONTENT_URI");
        return uri2;
    }

    public final defpackage.ajcq b() {
        return defpackage.aosv.F(this.c, 0, new defpackage.unj(this, (defpackage.aoln) null, 10), 3);
    }

    public final defpackage.ajcq c(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.aosv.F(this.b, 0, new zjr(this, phoneAccountHandle, (defpackage.aoln) null, 0), 3);
    }

    public final defpackage.ajcq d() {
        return defpackage.aosv.F(this.c, 0, new defpackage.unj(this, (defpackage.aoln) null, 11, (byte[]) null), 3);
    }

    public final j$.util.Optional e(android.content.ComponentName componentName, java.lang.String str) {
        for (java.lang.Object obj : s()) {
            android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) obj;
            if (defpackage.aooh.n(phoneAccountHandle.getComponentName(), componentName) && defpackage.aooh.n(phoneAccountHandle.getId(), str)) {
                j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(obj);
                defpackage.aooh.e(optionalOfNullable, "ofNullable(...)");
                return optionalOfNullable;
            }
        }
        obj = null;
        j$.util.Optional optionalOfNullable2 = j$.util.Optional.ofNullable(obj);
        defpackage.aooh.e(optionalOfNullable2, "ofNullable(...)");
        return optionalOfNullable2;
    }

    public final j$.util.Optional f() {
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(((java.lang.Boolean) this.l.a()).booleanValue() ? this.k.a() : this.i.getDefaultDialerPackage());
        defpackage.aooh.e(optionalOfNullable, "ofNullable(...)");
        defpackage.mgu mguVar = this.h;
        if (optionalOfNullable == null) {
            defpackage.aooh.i("<this>");
        }
        new defpackage.mgr(mguVar, defpackage.aais.aG((java.lang.String) optionalOfNullable.orElse((java.lang.Object) null))).b(defpackage.mgv.TELECOM_GET_DEFAULT_DIALER_PACKAGE).d(new defpackage.vaq(10));
        return optionalOfNullable;
    }

    public final j$.util.Optional g(java.lang.String str) {
        if (y() || defpackage.zqz.a(this.e, "android.permission.READ_PHONE_STATE")) {
            return h(str);
        }
        j$.util.Optional optionalEmpty = j$.util.Optional.empty();
        defpackage.aooh.e(optionalEmpty, "empty(...)");
        return optionalEmpty;
    }

    public final j$.util.Optional h(java.lang.String str) {
        android.telecom.PhoneAccountHandle defaultOutgoingPhoneAccount = this.i.getDefaultOutgoingPhoneAccount(str);
        new defpackage.mgr(this.h, defpackage.gus.az(defpackage.aais.aE(defaultOutgoingPhoneAccount), defpackage.aais.aG(str))).b(defpackage.mgv.TELECOM_GET_DEFAULT_OUTGOING_PHONE_ACCOUNT_HANDLE).d(new yoz(8));
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(defaultOutgoingPhoneAccount);
        defpackage.aooh.e(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }

    public final j$.util.Optional i(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        try {
            java.lang.Object objD = new defpackage.mgr(this.h, j$.util.Optional.ofNullable(this.i.getLine1Number(phoneAccountHandle))).a(defpackage.mgv.TELECOM_GET_LINE1_NUMBER_V2).d(new vxb(phoneAccountHandle, 12));
            defpackage.aooh.c(objD);
            return (j$.util.Optional) objD;
        } catch (java.lang.SecurityException e) {
            ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e).l("com/google/android/dialershared/externals/androidapis/telecom/DialerTelecom", "getLine1NumberLegacy", 120, "DialerTelecom.kt")).v("TelecomManager.getLine1Number called without permission.");
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            defpackage.aooh.c(optionalEmpty);
            return optionalEmpty;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0053  */
    /* JADX WARN: Code duplicated, block: B:13:0x005a A[Catch: SecurityException -> 0x005e, TRY_LEAVE, TryCatch #0 {SecurityException -> 0x005e, blocks: (B:4:0x0003, B:6:0x0015, B:11:0x0054, B:13:0x005a, B:7:0x0033, B:9:0x004c), top: B:21:0x0003 }] */
    public final j$.util.Optional j(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        android.telecom.PhoneAccount phoneAccount;
        j$.util.Optional optionalEmpty;
        if (phoneAccountHandle != null) {
            try {
                defpackage.zjp zjpVar = this.k;
                if (((java.lang.Boolean) zjpVar.f.a()).booleanValue()) {
                    zjpVar.c();
                    j$.util.Optional optional = (j$.util.Optional) j$.util.concurrent.ConcurrentMap.-EL.compute(zjpVar.h, phoneAccountHandle, new mbc(new zjn(zjpVar, phoneAccountHandle, 0), 2));
                    if (optional != null) {
                        phoneAccount = (android.telecom.PhoneAccount) optional.orElse((java.lang.Object) null);
                    } else {
                        phoneAccount = null;
                    }
                } else {
                    ((defpackage.aimw) defpackage.zjp.a.b().l("com/google/android/dialershared/externals/androidapis/telecom/CachedTelecomManager", "getPhoneAccount", 66, "CachedTelecomManager.kt")).v("Cache disabled, returning directly from TelecomManager.");
                    phoneAccount = zjpVar.b.getPhoneAccount(phoneAccountHandle);
                }
                optionalEmpty = j$.util.Optional.ofNullable(phoneAccount);
                if (optionalEmpty == null) {
                    defpackage.aooh.g();
                }
            } catch (java.lang.SecurityException e) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).k(e).l("com/google/android/dialershared/externals/androidapis/telecom/DialerTelecom", "getPhoneAccountLegacy", 593, "DialerTelecom.kt")).v("TelecomManager.getPhoneAccount called without permission.");
                optionalEmpty = j$.util.Optional.empty();
                if (optionalEmpty == null) {
                    defpackage.aooh.g();
                    return null;
                }
            }
        } else {
            phoneAccount = null;
            optionalEmpty = j$.util.Optional.ofNullable(phoneAccount);
            if (optionalEmpty == null) {
                defpackage.aooh.g();
            }
        }
        return optionalEmpty;
    }

    public final j$.util.Optional k(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        if (!y() && !defpackage.zqz.a(this.e, "android.permission.READ_PHONE_STATE")) {
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            defpackage.aooh.e(optionalEmpty, "empty(...)");
            return optionalEmpty;
        }
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(this.i.getVoiceMailNumber(phoneAccountHandle));
        defpackage.aooh.e(optionalOfNullable, "ofNullable(...)");
        defpackage.zjv.i(this.g, defpackage.mgv.TELECOM_GET_VOICEMAIL_NUMBER_V2, defpackage.ajsz.aY(defpackage.aais.aE(phoneAccountHandle)), defpackage.gus.ax(optionalOfNullable.isPresent()), 0, 24);
        return optionalOfNullable;
    }

    public final java.lang.Object l(defpackage.aoln aolnVar) {
        java.lang.Object objAj = defpackage.aoov.aj(this.d, new defpackage.zhb(this, (defpackage.aoln) null, 10), aolnVar);
        return objAj != defpackage.aolu.a ? defpackage.aojh.a : objAj;
    }

    public final java.lang.Object m(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.d, new defpackage.gbm(this, (defpackage.aoln) null, 9), aolnVar);
    }

    public final java.lang.Object n(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.d, new defpackage.zhb(this, (defpackage.aoln) null, 11, (byte[]) null), aolnVar);
    }

    public final java.lang.Object o(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.d, new tyf(this, phoneAccountHandle, (defpackage.aoln) null, 20), aolnVar);
    }

    public final java.lang.Object p(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.d, new zjr(this, phoneAccountHandle, (defpackage.aoln) null, 1, (byte[]) null), aolnVar);
    }

    public final java.lang.Object q(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.d, new defpackage.gbm(this, (defpackage.aoln) null, 10, (byte[]) null), aolnVar);
    }

    public final java.lang.Object r(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.d, new defpackage.gbm(this, (defpackage.aoln) null, 11, (char[]) null), aolnVar);
    }

    public final java.util.List s() {
        try {
            java.util.List<android.telecom.PhoneAccountHandle> callCapablePhoneAccounts = this.i.getCallCapablePhoneAccounts();
            defpackage.mgu mguVar = this.h;
            int size = callCapablePhoneAccounts.size();
            j$.util.Objects.requireNonNull(mguVar);
            new defpackage.mgi(mguVar, defpackage.mgv.TELECOM_GET_CALL_CAPABLE_PHONE_ACCOUNTS, java.lang.Integer.valueOf(size), size).f();
            if (callCapablePhoneAccounts != null) {
                return callCapablePhoneAccounts;
            }
            defpackage.aooh.g();
            return callCapablePhoneAccounts;
        } catch (java.lang.SecurityException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).k(e).l("com/google/android/dialershared/externals/androidapis/telecom/DialerTelecom", "getCallCapablePhoneAccountsLegacy", 626, "DialerTelecom.kt")).v("missing permissions when retrieving call-capable phone accounts");
            return defpackage.aokc.a;
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [aonj, java.lang.Object] */
    public final java.util.List t() {
        java.util.List listS = s();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listS) {
            j$.util.Optional optionalJ = j((android.telecom.PhoneAccountHandle) obj);
            defpackage.okr okrVar = new defpackage.okr(new defpackage.rou(7), 8);
            if (true == optionalJ.isPresent()) {
                optionalJ = j$.util.Optional.ofNullable(okrVar.a.a(optionalJ.get()));
            }
            java.lang.Object objOrElse = optionalJ.orElse(java.lang.Boolean.FALSE);
            defpackage.aooh.e(objOrElse, "orElse(...)");
            if (((java.lang.Boolean) objOrElse).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void u(android.net.Uri uri, android.os.Bundle bundle) {
        defpackage.mhc mhcVarL;
        defpackage.mgv mgvVar = defpackage.mgv.TELECOM_PLACE_CALL;
        defpackage.mhc[] mhcVarArr = new defpackage.mhc[3];
        mhcVarArr[0] = defpackage.aais.aG(uri != null ? uri.getScheme() : null);
        java.lang.Integer numValueOf = bundle != null ? java.lang.Integer.valueOf(bundle.getInt("android.telecom.extra.START_CALL_WITH_VIDEO_STATE")) : null;
        if (numValueOf == null) {
            defpackage.kaw kawVarAQ = defpackage.gus.aQ(defpackage.mhc.a.m());
            kawVarAQ.N("");
            mhcVarL = kawVarAQ.L();
        } else {
            defpackage.kaw kawVarAQ2 = defpackage.gus.aQ(defpackage.mhc.a.m());
            long jIntValue = numValueOf.intValue();
            defpackage.akzx akzxVar = (defpackage.akzx) kawVarAQ2.a;
            akzxVar.u();
            defpackage.mhc mhcVar = (defpackage.mhc) akzxVar.b;
            mhcVar.b = 3;
            mhcVar.c = java.lang.Long.valueOf(jIntValue);
            mhcVarL = kawVarAQ2.L();
        }
        mhcVarArr[1] = mhcVarL;
        android.telecom.PhoneAccountHandle phoneAccountHandle = bundle != null ? (android.telecom.PhoneAccountHandle) bundle.getParcelable("android.telecom.extra.PHONE_ACCOUNT_HANDLE") : null;
        defpackage.zjv zjvVar = this.g;
        mhcVarArr[2] = defpackage.aais.aE(phoneAccountHandle);
        defpackage.zjv.i(zjvVar, mgvVar, defpackage.ajsz.bb(mhcVarArr), null, 0, 28);
        this.i.placeCall(uri, bundle);
    }

    public final void v() {
        if (y() || defpackage.zqz.a(this.e, "android.permission.MODIFY_PHONE_STATE")) {
            try {
                defpackage.zjv.i(this.g, defpackage.mgv.TELECOM_SILENCE_RINGER, null, null, 0, 30);
                this.i.silenceRinger();
            } catch (java.lang.SecurityException e) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).k(e).l("com/google/android/dialershared/externals/androidapis/telecom/DialerTelecom", "silenceRingerLegacy", 303, "DialerTelecom.kt")).v("TelecomManager.silenceRinger called without permission.");
            }
        }
    }

    public final boolean w(java.lang.String str, android.telecom.PhoneAccountHandle phoneAccountHandle) {
        boolean z = false;
        if (y() || defpackage.zqz.a(this.e, "android.permission.MODIFY_PHONE_STATE")) {
            try {
                android.telecom.TelecomManager telecomManager = this.i;
                if (phoneAccountHandle == null) {
                    boolean zHandleMmi = telecomManager.handleMmi(str);
                    defpackage.zjv.i(this.g, defpackage.mgv.TELECOM_HANDLE_MMI, defpackage.ajsz.bb(defpackage.aais.aG(str), defpackage.gus.aw("null")), defpackage.gus.ax(zHandleMmi), 0, 24);
                    z = zHandleMmi;
                } else {
                    boolean zHandleMmi2 = telecomManager.handleMmi(str, phoneAccountHandle);
                    defpackage.zjv.i(this.g, defpackage.mgv.TELECOM_HANDLE_MMI, defpackage.ajsz.bb(defpackage.aais.aG(str), defpackage.aais.aE(phoneAccountHandle)), defpackage.gus.ax(zHandleMmi2), 0, 24);
                    z = zHandleMmi2;
                }
            } catch (java.lang.SecurityException e) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).k(e).l("com/google/android/dialershared/externals/androidapis/telecom/DialerTelecom", "handleMmiLegacy", 434, "DialerTelecom.kt")).v("TelecomManager.handleMmi called without permission.");
            }
        }
        return z;
    }

    public final boolean x() {
        if (y()) {
            return true;
        }
        android.content.Context context = this.e;
        defpackage.aify aifyVar = defpackage.zqz.a;
        return defpackage.dvx.c(context, "com.android.voicemail.permission.READ_VOICEMAIL") == 0 && defpackage.dvx.c(context, "com.android.voicemail.permission.WRITE_VOICEMAIL") == 0;
    }

    public final boolean y() {
        boolean zEquals = android.text.TextUtils.equals(this.e.getPackageName(), ((java.lang.Boolean) this.l.a()).booleanValue() ? this.k.a() : this.i.getDefaultDialerPackage());
        if (!zEquals) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).h(100).l("com/google/android/dialershared/externals/androidapis/telecom/DialerTelecom", "isDefaultDialerLegacy", 564, "DialerTelecom.kt")).v("Dialer is not currently set to be default dialer");
        }
        return zEquals;
    }

    public final boolean z() {
        boolean zM;
        try {
            zM = uyg$.ExternalSyntheticApiModelOutline2.m(this.i);
        } catch (java.lang.SecurityException e) {
            ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e).l("com/google/android/dialershared/externals/androidapis/telecom/DialerTelecom", "isTtySupportedLegacy", 198, "DialerTelecom.kt")).v("TelecomManager.isTtySupported called without permission.");
            zM = false;
        }
        java.lang.Object objF = new defpackage.mgf(this.h, zM).a(defpackage.mgv.TELECOM_IS_TTY_SUPPORTED).f();
        defpackage.aooh.e(objF, "ifTrue(...)");
        return ((java.lang.Boolean) objF).booleanValue();
    }
}
