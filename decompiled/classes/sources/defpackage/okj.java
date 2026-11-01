package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class okj {
    public static final /* synthetic */ int d = 0;
    private static final defpackage.aimz e = defpackage.aimz.i("com/android/dialer/externals/androidapis/telephony/DialerSubscriptionManager");
    private static final android.content.ComponentName f = new android.content.ComponentName("com.android.phone", "com.android.services.telephony.TelephonyConnectionService");
    public final defpackage.aoss a;
    public final defpackage.aolr b;
    public final defpackage.mgu c;
    private final android.content.Context g;
    private final defpackage.aoss h;
    private final defpackage.zjv i;
    private final android.telephony.SubscriptionManager j;

    public okj(android.content.Context context, defpackage.aoss aossVar, defpackage.aoss aossVar2, defpackage.aolr aolrVar, defpackage.zjv zjvVar, defpackage.mgu mguVar) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (aossVar == null) {
            defpackage.aooh.i("blockingScope");
        }
        if (aossVar2 == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("blockingContext");
        }
        if (zjvVar == null) {
            defpackage.aooh.i("externalsLogging");
        }
        if (mguVar == null) {
            defpackage.aooh.i("scopedDiffRecorder");
        }
        this.g = context;
        this.a = aossVar;
        this.h = aossVar2;
        this.b = aolrVar;
        this.i = zjvVar;
        this.c = mguVar;
        java.lang.Object systemService = context.getSystemService("telephony_subscription_service");
        if (systemService == null) {
            defpackage.aooh.h("null cannot be cast to non-null type android.telephony.SubscriptionManager");
        }
        this.j = (android.telephony.SubscriptionManager) systemService;
    }

    private final boolean o(java.lang.Throwable th) {
        if (th instanceof android.os.DeadObjectException) {
            return true;
        }
        java.lang.Throwable cause = th.getCause();
        return cause != null && o(cause);
    }

    public final int a() {
        int iM = fh$.ExternalSyntheticApiModelOutline0.m();
        defpackage.mgu mguVar = this.c;
        j$.util.Objects.requireNonNull(mguVar);
        return defpackage.gus.aD(defpackage.mgv.SUBSCRIPTION_MANAGER_GET_DEFAULT_DATA_SUBSCRIPTION_ID, iM, mguVar).f();
    }

    public final int b(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        if (phoneAccountHandle == null) {
            defpackage.aooh.i("phoneAccountHandle");
        }
        android.telephony.SubscriptionInfo subscriptionInfoC = c(phoneAccountHandle);
        if (subscriptionInfoC != null) {
            return subscriptionInfoC.getSubscriptionId();
        }
        return -1;
    }

    public final android.telephony.SubscriptionInfo c(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        if (phoneAccountHandle == null) {
            defpackage.aooh.i("phoneAccountHandle");
        }
        j$.util.Optional optionalH = h(phoneAccountHandle);
        if (optionalH == null) {
            defpackage.aooh.i("<this>");
        }
        return (android.telephony.SubscriptionInfo) optionalH.orElse((java.lang.Object) null);
    }

    public final android.telephony.SubscriptionInfo d(int i) {
        android.telephony.SubscriptionInfo activeSubscriptionInfoForSimSlotIndex = null;
        try {
            activeSubscriptionInfoForSimSlotIndex = this.j.getActiveSubscriptionInfoForSimSlotIndex(i);
        } catch (java.lang.SecurityException e2) {
            ((defpackage.aimw) ((defpackage.aimw) e.d()).k(e2).l("com/android/dialer/externals/androidapis/telephony/DialerSubscriptionManager", "getActiveSubscriptionInfoForSimSlotIndexLegacy", 226, "DialerSubscriptionManager.kt")).v("SubscriptionManager.getActiveSubscriptionInfoForSimSlotIndex called without permission.");
        } catch (java.lang.RuntimeException e3) {
            if (!o(e3)) {
                throw e3;
            }
            ((defpackage.aimw) ((defpackage.aimw) e.d()).k(e3).l("com/android/dialer/externals/androidapis/telephony/DialerSubscriptionManager", "getActiveSubscriptionInfoForSimSlotIndexLegacy", 239, "DialerSubscriptionManager.kt")).v("SubscriptionManager.getActiveSubscriptionInfoForSimSlotIndex failed due to system error.");
        }
        defpackage.zjv.i(this.i, defpackage.mgv.SUBSCRIPTION_MANAGER_GET_ACTIVE_SUBSCRIPTION_INFO_FOR_SIM_SLOT_INDEX, defpackage.ajsz.aY(defpackage.gus.av(i)), defpackage.aais.aF(activeSubscriptionInfoForSimSlotIndex), 0, 24);
        return activeSubscriptionInfoForSimSlotIndex;
    }

    public final defpackage.ajcq e() {
        return defpackage.aosv.F(this.h, 0, new ogf(this, (defpackage.aoln) null, 10), 3);
    }

    public final defpackage.ajcq f(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.aooh.f(phoneAccountHandle, "phoneAccountHandle");
        return defpackage.aosv.F(this.h, 0, new ohh(this, phoneAccountHandle, (defpackage.aoln) null, 6), 3);
    }

    public final j$.util.Optional g(int i) {
        j$.util.Optional optionalEmpty;
        try {
            java.lang.String strM = ae$.ExternalSyntheticApiModelOutline0.m(this.j, i);
            if (strM.length() == 0) {
                strM = null;
            }
            java.lang.Object objD = new defpackage.mgr(this.c, j$.util.Optional.ofNullable(strM)).a(defpackage.mgv.SUBSCRIPTION_MANAGER_GET_PHONE_NUMBER_V2).d(new exw(i, 3));
            defpackage.aooh.c(objD);
            return (j$.util.Optional) objD;
        } catch (java.lang.SecurityException e2) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) e.d()).k(e2)).i(defpackage.zct.b).l("com/android/dialer/externals/androidapis/telephony/DialerSubscriptionManager", "getPhoneNumberLegacy", 72, "DialerSubscriptionManager.kt")).v("SubscriptionManager.getPhoneNumber called without permission.");
            optionalEmpty = j$.util.Optional.empty();
            defpackage.aooh.c(optionalEmpty);
            return optionalEmpty;
        } catch (java.lang.RuntimeException e3) {
            if (!o(e3)) {
                throw e3;
            }
            ((defpackage.aimw) ((defpackage.aimw) e.d()).k(e3).l("com/android/dialer/externals/androidapis/telephony/DialerSubscriptionManager", "getPhoneNumberLegacy", 83, "DialerSubscriptionManager.kt")).v("SubscriptionManager.getPhoneNumber failed due to system error.");
            optionalEmpty = j$.util.Optional.empty();
            defpackage.aooh.c(optionalEmpty);
            return optionalEmpty;
        }
    }

    public final j$.util.Optional h(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        if (phoneAccountHandle == null) {
            defpackage.aooh.i("phoneAccountHandle");
        }
        java.lang.String id = phoneAccountHandle.getId();
        if (id == null || id.length() == 0) {
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            defpackage.aooh.e(optionalEmpty, "empty(...)");
            return optionalEmpty;
        }
        java.util.List<android.telephony.SubscriptionInfo> listN = n();
        if (listN == null) {
            j$.util.Optional optionalEmpty2 = j$.util.Optional.empty();
            defpackage.aooh.e(optionalEmpty2, "empty(...)");
            return optionalEmpty2;
        }
        for (android.telephony.SubscriptionInfo subscriptionInfo : listN) {
            java.lang.String iccId = (android.os.Build.VERSION.SDK_INT < 33 || !defpackage.aooh.n(f, phoneAccountHandle.getComponentName())) ? subscriptionInfo.getIccId() : java.lang.String.valueOf(subscriptionInfo.getSubscriptionId());
            java.lang.String id2 = phoneAccountHandle.getId();
            defpackage.aooh.e(id2, "getId(...)");
            if (iccId == null) {
                defpackage.aooh.g();
            }
            if (defpackage.aoov.ad(id2, iccId)) {
                j$.util.Optional optionalOf = j$.util.Optional.of(subscriptionInfo);
                defpackage.aooh.e(optionalOf, "of(...)");
                return optionalOf;
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 33 && defpackage.aooh.n(f, phoneAccountHandle.getComponentName())) {
            java.lang.String id3 = phoneAccountHandle.getId();
            defpackage.aooh.e(id3, "getId(...)");
            if (id3 == null) {
                defpackage.aooh.i("<this>");
            }
            java.lang.Integer numP = defpackage.aoov.p(id3, 10);
            if (numP != null) {
                int iIntValue = numP.intValue();
                android.telephony.SubscriptionInfo activeSubscriptionInfo = null;
                try {
                    activeSubscriptionInfo = this.j.getActiveSubscriptionInfo(iIntValue);
                } catch (java.lang.SecurityException e2) {
                    ((defpackage.aimw) ((defpackage.aimw) e.d()).k(e2).l("com/android/dialer/externals/androidapis/telephony/DialerSubscriptionManager", "getActiveSubscriptionInfoLegacy", 124, "DialerSubscriptionManager.kt")).v("SubscriptionManager.getActiveSubscriptionInfo called without permission.");
                } catch (java.lang.RuntimeException e3) {
                    if (!o(e3)) {
                        throw e3;
                    }
                    ((defpackage.aimw) ((defpackage.aimw) e.d()).k(e3).l("com/android/dialer/externals/androidapis/telephony/DialerSubscriptionManager", "getActiveSubscriptionInfoLegacy", 135, "DialerSubscriptionManager.kt")).v("SubscriptionManager.getActiveSubscriptionInfo failed due to system error.");
                }
                defpackage.zjv zjvVar = this.i;
                defpackage.mgv mgvVar = defpackage.mgv.SUBSCRIPTION_MANAGER_GET_ACTIVE_SUBSCRIPTION_INFO;
                java.util.List listSingletonList = java.util.Collections.singletonList(defpackage.gus.av(iIntValue));
                defpackage.aooh.e(listSingletonList, "singletonList(...)");
                defpackage.zjv.i(zjvVar, mgvVar, listSingletonList, defpackage.aais.aF(activeSubscriptionInfo), 0, 24);
                if (activeSubscriptionInfo != null) {
                    j$.util.Optional optionalOf2 = j$.util.Optional.of(activeSubscriptionInfo);
                    defpackage.aooh.e(optionalOf2, "of(...)");
                    return optionalOf2;
                }
            }
        }
        ((defpackage.aimw) ((defpackage.aimw) e.d()).i(defpackage.zct.b).l("com/android/dialer/externals/androidapis/telephony/DialerSubscriptionManager", "getSubscriptionInfoLegacy", 366, "DialerSubscriptionManager.kt")).v("Failed to find SubscriptionInfo for phoneAccountHandle");
        j$.util.Optional optionalEmpty3 = j$.util.Optional.empty();
        defpackage.aooh.e(optionalEmpty3, "empty(...)");
        return optionalEmpty3;
    }

    public final java.lang.Object i(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.b, new defpackage.ohg(this, (defpackage.aoln) null, 15), aolnVar);
    }

    public final java.lang.Object j(int i, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.b, new bck(this, i, (defpackage.aoln) null, 6), aolnVar);
    }

    public final java.lang.Object k(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.b, new ofa(this, phoneAccountHandle, (defpackage.aoln) null, 7), aolnVar);
    }

    public final java.lang.Object l(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.b, new ofa(this, phoneAccountHandle, (defpackage.aoln) null, 8, (byte[]) null), aolnVar);
    }

    public final java.lang.String m(int i) {
        return (java.lang.String) defpackage.aooh.q(g(i));
    }

    public final java.util.List n() {
        try {
            return (java.util.List) new defpackage.mgr(this.c, this.j.getActiveSubscriptionInfoList()).b(defpackage.mgv.SUBSCRIPTION_MANAGER_GET_ACTIVE_SUBSCRIPTION_INFO_LIST).e(new defpackage.kju(10)).d(new defpackage.kju(11));
        } catch (java.lang.SecurityException e2) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) e.d()).k(e2)).i(defpackage.zct.b).l("com/android/dialer/externals/androidapis/telephony/DialerSubscriptionManager", "getActiveSubscriptionInfoListLegacy", 176, "DialerSubscriptionManager.kt")).v("SubscriptionManager.getActiveSubscriptionInfoList called without permission.");
            return null;
        } catch (java.lang.RuntimeException e3) {
            if (!o(e3)) {
                throw e3;
            }
            ((defpackage.aimw) ((defpackage.aimw) e.d()).k(e3).l("com/android/dialer/externals/androidapis/telephony/DialerSubscriptionManager", "getActiveSubscriptionInfoListLegacy", 187, "DialerSubscriptionManager.kt")).v("SubscriptionManager.getActiveSubscriptionInfoList failed due to system error.");
            return null;
        }
    }
}
