package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class rwp implements defpackage.ahzi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ rwp(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r13v104, types: [acvl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v26, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v30, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v88, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v90, types: [aomy, java.lang.Object] */
    @Override // defpackage.ahzi
    public final java.lang.Object eZ() {
        long j;
        java.lang.Object aatcVar;
        switch (this.$cid) {
            case 0:
                defpackage.aihb aihbVar = new defpackage.aihb();
                aihbVar.c("phone_incoming_call");
                aihbVar.c("phone_ongoing_call");
                aihbVar.c("phone_missed_call");
                aihbVar.c("phone_emergency_call");
                aihbVar.c("phone_low_priority");
                aihbVar.c("phone_feedback");
                aihbVar.c("phone_default");
                java.lang.Object obj = this.a;
                defpackage.rwq rwqVar = (defpackage.rwq) obj;
                android.content.Context context = rwqVar.b;
                if (!defpackage.ttj.N(context).ir()) {
                    aihbVar.k(defpackage.rwu.c(context));
                }
                defpackage.aihd aihdVarG = aihbVar.g();
                defpackage.aihd aihdVarA = rwqVar.a();
                if (defpackage.ttj.N(context).ir()) {
                    if (!aihdVarA.containsAll(aihdVarG)) {
                        rwqVar.d();
                        rwqVar.f();
                        rwqVar.e();
                        rwqVar.c();
                        rwqVar.b();
                        rwqVar.g();
                        rwqVar.d.j();
                    }
                } else if (!aihdVarG.equals(aihdVarA) && (!defpackage.rwu.h(context, aihdVarG, aihdVarA) || !aihdVarG.equals(rwqVar.a()))) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.rwq.a.b()).l("com/android/dialer/notification/channel/NotificationChannelManagerCompatSync", "doInitChannels", 112, "NotificationChannelManagerCompatSync.java")).I("doing an expensive initialization of all notification channels, desired channel IDs: %s, existing channel IDs: %s", aihdVarG, aihdVarA);
                    defpackage.ailj it = aihdVarA.iterator();
                    while (it.hasNext()) {
                        java.lang.String str = (java.lang.String) it.next();
                        if (!aihdVarG.contains(str)) {
                            try {
                                da$.ExternalSyntheticApiModelOutline1.m(((defpackage.rwq) obj).c, str);
                            } catch (java.lang.SecurityException e) {
                                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.rwq.a.d()).k(e)).l("com/android/dialer/notification/channel/NotificationChannelManagerCompatSync", "doInitChannels", 126, "NotificationChannelManagerCompatSync.java")).y("deleteObsoleteChannels failed for channel %s", str);
                            }
                        }
                    }
                    rwqVar.d();
                    rwqVar.f();
                    rwqVar.e();
                    rwqVar.c();
                    rwqVar.b();
                    defpackage.rwu.d(rwqVar.b);
                    rwqVar.d.j();
                    rwqVar.g();
                }
                return null;
            case 1:
                try {
                    android.content.Context context2 = ((defpackage.rmb) this.a).b;
                    j = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).firstInstallTime;
                    break;
                } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.rmb.a.c()).i(defpackage.zct.b)).k(e2)).l("com/android/dialer/logging/deviceinfo/DeviceInfoFetcher", "getFirstInstallTime", 'p', "DeviceInfoFetcher.java")).v("deviceInfoBuilder failed to get package manager");
                    j = 0;
                }
                return java.lang.Long.valueOf(j);
            case 2:
                defpackage.acxg acxgVar = defpackage.aasr.a;
                android.content.Context context3 = (android.content.Context) this.a;
                aatcVar = new defpackage.aatc(new defpackage.aata(context3), context3.getSharedPreferences("dialer_phenotype_flags", 0));
                break;
            case 3:
                return (java.lang.Boolean) ((defpackage.ssj) defpackage.agab.aH(((com.android.dialer.phonenumbercache.PhoneNumberCacheProvider) this.a).getContext(), defpackage.ssj.class)).hC().a();
            case 4:
                java.lang.String str2 = (java.lang.String) this.a.a();
                defpackage.aigb aigbVar = new defpackage.aigb(4);
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                    java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        java.lang.String next = itKeys.next();
                        int i = java.lang.Integer.parseInt(next);
                        org.json.JSONArray jSONArray = jSONObject.getJSONArray(next);
                        defpackage.aift aiftVar = new defpackage.aift(4);
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            aiftVar.i(jSONArray.getString(i2));
                        }
                        aigbVar.i(java.lang.Integer.valueOf(i), aiftVar.g());
                        break;
                    }
                } catch (org.json.JSONException e3) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.sss.a.c()).i(defpackage.zct.b)).k(e3)).l("com/android/dialer/phonenumbervariations/PhoneNumberVariationsConfigProvider", "parsePhoneNumberVariations", 'B', "PhoneNumberVariationsConfigProvider.java")).y("Unable to parse patterns of %s.", str2);
                }
                return aigbVar.e(true);
            case 5:
                return (defpackage.acux) this.a.a();
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(((defpackage.zdk) this.a).b.getNetworkOperatorName());
                ((defpackage.aimw) ((defpackage.aimw) defpackage.zdk.a.b()).l("com/google/android/callingshared/logging/telephony/LoggingTelephonyCache", "setUpNetworkMemoize", 129, "LoggingTelephonyCache.java")).v("getNetworkOperatorName");
                return optionalOfNullable;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                j$.util.Optional optionalOfNullable2 = j$.util.Optional.ofNullable(((defpackage.zdk) this.a).b.getNetworkCountryIso());
                ((defpackage.aimw) ((defpackage.aimw) defpackage.zdk.a.b()).l("com/google/android/callingshared/logging/telephony/LoggingTelephonyCache", "setUpNetworkMemoize", 138, "LoggingTelephonyCache.java")).v("getNetworkCountryIso");
                return optionalOfNullable2;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                j$.util.Optional optionalOfNullable3 = j$.util.Optional.ofNullable(((defpackage.zdk) this.a).b.getNetworkOperator());
                ((defpackage.aimw) ((defpackage.aimw) defpackage.zdk.a.b()).l("com/google/android/callingshared/logging/telephony/LoggingTelephonyCache", "setUpNetworkMemoize", 147, "LoggingTelephonyCache.java")).v("getNetworkOperator");
                return optionalOfNullable3;
            case 9:
                try {
                    return j$.util.Optional.ofNullable(((defpackage.zdk) this.a).b.getGroupIdLevel1());
                } catch (java.lang.SecurityException e4) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.zdk.a.c()).i(defpackage.zct.b)).k(e4)).l("com/google/android/callingshared/logging/telephony/LoggingTelephonyCache", "setUpNetworkMemoize", (char) 157, "LoggingTelephonyCache.java")).v("missing permission");
                    return j$.util.Optional.empty();
                }
            case 10:
                defpackage.zdk zdkVar = (defpackage.zdk) this.a;
                if (!((java.lang.Boolean) zdkVar.c.a()).booleanValue()) {
                    android.telephony.TelephonyManager telephonyManager = zdkVar.b;
                    j$.util.Optional optionalEmpty = ft$.ExternalSyntheticApiModelOutline0.m(telephonyManager) == null ? j$.util.Optional.empty() : j$.util.Optional.of(ft$.ExternalSyntheticApiModelOutline0.m(telephonyManager).toString());
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.zdk.a.b()).l("com/google/android/callingshared/logging/telephony/LoggingTelephonyCache", "setUpNetworkMemoize", 183, "LoggingTelephonyCache.java")).v("getSimCarrierIdName");
                    return optionalEmpty;
                }
                java.lang.CharSequence charSequenceM = ft$.ExternalSyntheticApiModelOutline0.m(zdkVar.b);
                if (charSequenceM == null) {
                    return j$.util.Optional.empty();
                }
                j$.util.Optional optionalOf = j$.util.Optional.of(charSequenceM.toString());
                ((defpackage.aimw) ((defpackage.aimw) defpackage.zdk.a.b()).l("com/google/android/callingshared/logging/telephony/LoggingTelephonyCache", "setUpNetworkMemoize", 171, "LoggingTelephonyCache.java")).v("getSimCarrierIdName");
                return optionalOf;
            case 11:
                j$.util.Optional optionalOfNullable4 = j$.util.Optional.ofNullable(((defpackage.zdk) this.a).b.getSimCountryIso());
                ((defpackage.aimw) ((defpackage.aimw) defpackage.zdk.a.b()).l("com/google/android/callingshared/logging/telephony/LoggingTelephonyCache", "setUpNetworkMemoize", 193, "LoggingTelephonyCache.java")).v("getSimCountryIso");
                return optionalOfNullable4;
            case 12:
                java.lang.Object obj2 = this.a;
                if (!((java.lang.Boolean) ((defpackage.zdk) obj2).d.a()).booleanValue()) {
                    return j$.util.Optional.empty();
                }
                try {
                    boolean z = ((defpackage.zdk) obj2).l.getActiveSubscriptionInfoCount() > 1;
                    defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) defpackage.zdk.a.b()).l("com/google/android/callingshared/logging/telephony/LoggingTelephonyCache", "setUpNetworkMemoize", 206, "LoggingTelephonyCache.java");
                    java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
                    aimwVar.y("hasMultipleActiveSims: %b", boolValueOf);
                    return j$.util.Optional.of(boolValueOf);
                } catch (java.lang.SecurityException e5) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.zdk.a.b()).k(e5)).l("com/google/android/callingshared/logging/telephony/LoggingTelephonyCache", "setUpNetworkMemoize", (char) 209, "LoggingTelephonyCache.java")).v("missing READ_PHONE_STATE permission");
                    return j$.util.Optional.empty();
                }
            case 13:
                return this.a.a();
            case 14:
                return this.a.a();
            case 15:
                aatcVar = new defpackage.zxi((android.content.Context) this.a);
                break;
            case 16:
                int i3 = defpackage.aaki.a;
                return ((android.content.Context) this.a).getSharedPreferences("DuoKitPrefs", 0);
            case 17:
                return ((defpackage.ahys) this.a).a;
            case 18:
                return defpackage.acxg.x((android.content.Context) this.a);
            case 19:
                acvo acvoVarX = this.a.x();
                return acvoVarX == acvo.a ? acvo.b : acvoVarX;
            default:
                return java.lang.Boolean.valueOf(((defpackage.adae) this.a).b() != acvo.d);
        }
        return aatcVar;
    }
}
