package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zhb extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhb(abhx abhxVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = abhxVar;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return ((defpackage.zhb) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 1:
                return ((defpackage.zhb) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 2:
                return ((defpackage.zhb) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 3:
                return ((defpackage.zhb) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 4:
                return ((defpackage.zhb) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 5:
                return ((defpackage.zhb) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.zhb) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((defpackage.zhb) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.zhb) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 9:
                return ((defpackage.zhb) c((defpackage.zji) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 10:
                return ((defpackage.zhb) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 11:
                return ((defpackage.zhb) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 12:
                return ((defpackage.zhb) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 13:
                return ((defpackage.zhb) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 14:
                return ((defpackage.zhb) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 15:
                return ((defpackage.zhb) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 16:
                return ((defpackage.zhb) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 17:
                c((defpackage.aoss) obj, (defpackage.aoln) obj2);
                return defpackage.anar.o(defpackage.aojh.a);
            case 18:
                return ((defpackage.zhb) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 19:
                return ((defpackage.zhb) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            default:
                return ((defpackage.zhb) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
    }

    /* JADX WARN: Type inference failed for: r10v81, types: [aoir, java.lang.Object] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        android.content.pm.ServiceInfo serviceInfo = null;
        switch (this.$cid) {
            case 0:
                defpackage.aooc.af(obj);
                try {
                    android.content.pm.ServiceInfo[] serviceInfoArr = ((android.content.pm.PackageManager) ((uyg) this.a).a).getPackageInfo("com.google.android.apps.messaging", 4).services;
                    if (serviceInfoArr == null) {
                        return zha.c;
                    }
                    for (android.content.pm.ServiceInfo serviceInfo2 : serviceInfoArr) {
                        if (defpackage.aooh.n(serviceInfo2.name, "com.google.android.apps.messaging.external.p2p.impl.ExternalRcsEndpointService")) {
                            serviceInfo = serviceInfo2;
                            return (serviceInfo == null && serviceInfo.isEnabled()) ? zha.a : zha.c;
                        }
                    }
                    if (serviceInfo == null) {
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    return zha.b;
                }
            case 1:
                defpackage.aooc.af(obj);
                zfu zfuVar = (zfu) this.a;
                zfuVar.g = true;
                return java.lang.Boolean.valueOf(zfuVar.h.e(null));
            case 2:
                defpackage.aooc.af(obj);
                defpackage.akfh.a((android.content.Context) ((uyg) this.a).b);
                akfx akfxVarH = akfx.h();
                defpackage.aooh.e(akfxVarH, "getInstance(...)");
                return akfxVarH;
            case 3:
                defpackage.aooc.af(obj);
                try {
                    return ((zho) this.a).c.getActiveSubscriptionInfoList();
                } catch (java.lang.SecurityException e) {
                    ((defpackage.aimw) ((defpackage.aimw) zho.a.d()).k(e).l("com/google/android/callingshared/telephony/CallingSubscriptionManager", "getActiveSubscriptionInfoList$<anonymous>", 114, "CallingSubscriptionManager.kt")).v("SubscriptionManager.getActiveSubscriptionInfoList called without permission.");
                    return null;
                } catch (java.lang.RuntimeException e2) {
                    ((defpackage.aimw) ((defpackage.aimw) zho.a.d()).k(e2).l("com/google/android/callingshared/telephony/CallingSubscriptionManager", "getActiveSubscriptionInfoList$<anonymous>", 120, "CallingSubscriptionManager.kt")).v("SubscriptionManager.getActiveSubscriptionInfoList failed due to system error.");
                    return null;
                }
            case 4:
                defpackage.aooc.af(obj);
                try {
                    java.util.List<android.telecom.PhoneAccountHandle> callCapablePhoneAccounts = ((zhp) this.a).b.getCallCapablePhoneAccounts();
                    return callCapablePhoneAccounts == null ? defpackage.aokc.a : callCapablePhoneAccounts;
                } catch (java.lang.SecurityException e3) {
                    ((defpackage.aimw) ((defpackage.aimw) zhp.a.d()).k(e3).l("com/google/android/callingshared/telephony/CallingTelecom", "getCallCapablePhoneAccounts$<anonymous>", 78, "CallingTelecom.kt")).v("Error getting call capable phone accounts");
                    return defpackage.aokc.a;
                }
            case 5:
                defpackage.aooc.af(obj);
                return ((android.telephony.TelephonyManager) ((uyg) this.a).a).getNetworkCountryIso();
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aooc.af(obj);
                return new java.lang.Integer(((android.telephony.TelephonyManager) ((uyg) this.a).a).getPhoneType());
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.aooc.af(obj);
                return ((android.telephony.TelephonyManager) ((uyg) this.a).a).getSimCountryIso();
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aooc.af(obj);
                return java.lang.Boolean.valueOf(((android.telephony.TelephonyManager) ((uyg) this.a).a).isNetworkRoaming());
            case 9:
                defpackage.aooc.af(obj);
                defpackage.akzx akzxVarM = defpackage.zji.a.m();
                defpackage.aooh.f(akzxVarM, "builder");
                long epochMilli = j$.time.Instant.now().toEpochMilli();
                akzxVarM.u();
                defpackage.zji zjiVar = (defpackage.zji) akzxVarM.b;
                zjiVar.b |= 1;
                zjiVar.c = epochMilli;
                defpackage.alad aladVarR = akzxVarM.r();
                defpackage.aooh.e(aladVarR, "build(...)");
                return (defpackage.zji) aladVarR;
            case 10:
                defpackage.aooc.af(obj);
                java.lang.Object obj2 = this.a;
                defpackage.zjs zjsVar = (defpackage.zjs) obj2;
                if (!zjsVar.y() && !defpackage.zqz.a(zjsVar.e, "android.permission.MODIFY_PHONE_STATE")) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.zjs.a.d()).i(defpackage.zct.b).l("com/google/android/dialershared/externals/androidapis/telecom/DialerTelecom", "cancelMissedCallsNotificationLegacy", 349, "DialerTelecom.kt")).v("no modify phone state permission");
                }
                try {
                    defpackage.zjv.i(((defpackage.zjs) obj2).g, defpackage.mgv.TELECOM_CANCEL_MISSED_CALL_NOTIFICATION, null, null, 0, 30);
                    ((defpackage.zjs) obj2).i.cancelMissedCallsNotification();
                    break;
                } catch (java.lang.SecurityException e4) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.zjs.a.d()).i(defpackage.zct.b)).k(e4).l("com/google/android/dialershared/externals/androidapis/telecom/DialerTelecom", "cancelMissedCallsNotificationLegacy", 361, "DialerTelecom.kt")).v("TelecomManager.cancelMissedCallsNotification called without permission.");
                }
                return defpackage.aojh.a;
            case 11:
                defpackage.aooc.af(obj);
                return ((defpackage.zjs) this.a).a();
            case 12:
                defpackage.aooc.af(obj);
                return java.lang.Boolean.valueOf(((defpackage.zjs) this.a).x());
            case 13:
                defpackage.aooc.af(obj);
                defpackage.zjs zjsVar2 = (defpackage.zjs) this.a;
                java.lang.Object objF = new defpackage.mgf(zjsVar2.h, zjsVar2.i.isInCall()).a(defpackage.mgv.TELECOM_IS_IN_CALL).f();
                defpackage.aooh.e(objF, "ifTrue(...)");
                java.lang.Boolean bool = (java.lang.Boolean) objF;
                bool.booleanValue();
                return bool;
            case 14:
                defpackage.aooc.af(obj);
                return java.lang.Boolean.valueOf(((defpackage.zjs) this.a).z());
            case 15:
                defpackage.aooc.af(obj);
                ((defpackage.zjs) this.a).v();
                return defpackage.aojh.a;
            case 16:
                defpackage.aooc.af(obj);
                return ((defpackage.zth) this.a).d.a();
            case 17:
                return defpackage.anar.o(obj);
            case 18:
                defpackage.aooc.af(obj);
                abow abowVar = (abow) this.a;
                abowVar.b = true;
                abowVar.c.d();
                return defpackage.aojh.a;
            case 19:
                defpackage.aooc.af(obj);
                abow abowVar2 = (abow) this.a;
                abowVar2.a = true;
                abowVar2.c.d();
                return defpackage.aojh.a;
            default:
                defpackage.aooc.af(obj);
                java.lang.Boolean bool2 = (java.lang.Boolean) ((defpackage.abvh) this.a).f.a();
                bool2.booleanValue();
                return bool2;
        }
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                return new defpackage.zhb((uyg) this.a, aolnVar, 0, (boolean[]) null);
            case 1:
                return new defpackage.zhb((zfu) this.a, aolnVar, 1);
            case 2:
                return new defpackage.zhb((uyg) this.a, aolnVar, 2, (int[]) null);
            case 3:
                return new defpackage.zhb((zho) this.a, aolnVar, 3);
            case 4:
                return new defpackage.zhb((zhp) this.a, aolnVar, 4);
            case 5:
                return new defpackage.zhb((uyg) this.a, aolnVar, 5);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return new defpackage.zhb((uyg) this.a, aolnVar, 6, (byte[]) null);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return new defpackage.zhb((uyg) this.a, aolnVar, 7, (char[]) null);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return new defpackage.zhb((uyg) this.a, aolnVar, 8, (short[]) null);
            case 9:
                return new defpackage.zhb((defpackage.zjl) this.a, aolnVar, 9);
            case 10:
                return new defpackage.zhb((defpackage.zjs) this.a, aolnVar, 10);
            case 11:
                return new defpackage.zhb((defpackage.zjs) this.a, aolnVar, 11, (byte[]) null);
            case 12:
                return new defpackage.zhb((defpackage.zjs) this.a, aolnVar, 12, (char[]) null);
            case 13:
                return new defpackage.zhb((defpackage.zjs) this.a, aolnVar, 13, (short[]) null);
            case 14:
                return new defpackage.zhb((defpackage.zjs) this.a, aolnVar, 14, (int[]) null);
            case 15:
                return new defpackage.zhb((defpackage.zjs) this.a, aolnVar, 15, (boolean[]) null);
            case 16:
                return new defpackage.zhb((defpackage.zth) this.a, aolnVar, 16);
            case 17:
                return new defpackage.zhb((abhx) this.a, aolnVar, 17);
            case 18:
                return new defpackage.zhb((abow) this.a, aolnVar, 18);
            case 19:
                return new defpackage.zhb((abow) this.a, aolnVar, 19, (byte[]) null);
            default:
                return new defpackage.zhb((defpackage.abvh) this.a, aolnVar, 20);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhb(abow abowVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = abowVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhb(abow abowVar, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = abowVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhb(defpackage.abvh abvhVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = abvhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhb(uyg uygVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = uygVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhb(uyg uygVar, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = uygVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhb(uyg uygVar, defpackage.aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = uygVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhb(uyg uygVar, defpackage.aoln aolnVar, int i, int[] iArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = uygVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhb(uyg uygVar, defpackage.aoln aolnVar, int i, short[] sArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = uygVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhb(uyg uygVar, defpackage.aoln aolnVar, int i, boolean[] zArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = uygVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhb(zfu zfuVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = zfuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhb(zho zhoVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = zhoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhb(zhp zhpVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = zhpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhb(defpackage.zjl zjlVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = zjlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhb(defpackage.zjs zjsVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = zjsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhb(defpackage.zjs zjsVar, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = zjsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhb(defpackage.zjs zjsVar, defpackage.aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = zjsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhb(defpackage.zjs zjsVar, defpackage.aoln aolnVar, int i, int[] iArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = zjsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhb(defpackage.zjs zjsVar, defpackage.aoln aolnVar, int i, short[] sArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = zjsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhb(defpackage.zjs zjsVar, defpackage.aoln aolnVar, int i, boolean[] zArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = zjsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhb(defpackage.zth zthVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = zthVar;
    }
}
