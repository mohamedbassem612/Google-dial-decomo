package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class wym implements defpackage.ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ wym(java.lang.String str, int i) {
        this.$cid = i;
        this.b = str;
        this.a = "";
    }

    /* JADX WARN: Type inference failed for: r10v21, types: [java.lang.Object, xrh] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kfj] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ahyc
    public final java.lang.Object apply(java.lang.Object obj) {
        wyz wyzVar;
        defpackage.zzt zztVar;
        int i = 0;
        switch (this.$cid) {
            case 0:
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) wyn.a.d()).k((java.lang.Throwable) obj)).i(defpackage.zct.b)).l("com/android/incallui/atlas/ui/impl/businessfinder/AtlasBusinessFinderImpl", "findBusiness", 173, "AtlasBusinessFinderImpl.java")).v("failed to find a business");
                ((wyn) this.a).j.put(((wxo) this.b).a, j$.util.Optional.empty());
                return j$.util.Optional.empty();
            case 1:
                java.util.Map map = ((wmy) this.b).i;
                nzb nzbVar = (nzb) obj;
                java.lang.Object obj2 = this.a;
                map.put(obj2, nzbVar);
                defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) wmy.a.b()).l("com/android/dialer/xatu/impl/service/XatuSupportedNumbers", "checkAndCacheEligibility", 165, "XatuSupportedNumbers.java");
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(nzbVar.c);
                int iAd = defpackage.mni.ad(nzbVar.d);
                aimwVar.M("returning eligible: %b, source: %d for %s", boolValueOf, java.lang.Integer.valueOf((iAd != 0 ? iAd : 1) - 1), defpackage.aais.aC((java.lang.String) obj2));
                return nzbVar;
            case 2:
                j$.util.Optional optional = (j$.util.Optional) obj;
                ((wyn) this.b).j.put(this.a, optional);
                return optional;
            case 3:
                java.util.concurrent.atomic.AtomicLong atomicLong = ((defpackage.wyo) this.a).d;
                atomicLong.set(0L);
                defpackage.ailj it = ((defpackage.aigf) obj).entrySet().iterator();
                while (it.hasNext()) {
                    ?? r1 = this.b;
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    java.lang.Long l = (java.lang.Long) entry.getKey();
                    long jLongValue = l.longValue();
                    defpackage.kfk kfkVar = (defpackage.kfk) r1;
                    if (!kfkVar.a.containsKey(l) && !kfkVar.c.contains(l) && (wyzVar = (wyz) entry.getValue()) != null) {
                        android.content.ContentValues contentValues = new android.content.ContentValues();
                        contentValues.put("atlas_call_details", wyzVar.c.i());
                        r1.d(jLongValue, contentValues);
                        j$.util.concurrent.atomic.DesugarAtomicLong.getAndAccumulate(atomicLong, wyzVar.b, new kvc(6));
                    }
                }
                return null;
            case 4:
                defpackage.aimz aimzVar = com.android.voicemail.impl.DialerVisualVoicemailService.a;
                this.a.jK().d((android.telecom.PhoneAccountHandle) this.b);
                return null;
            case 5:
                defpackage.zyy zyyVar = (defpackage.zyy) obj;
                defpackage.ajcq ajcqVarE = zyyVar.e((zyz) this.b);
                boolean zD = defpackage.aaaf.d(ajcqVarE);
                java.lang.Object obj3 = this.a;
                if (!zD) {
                    return abxl.A(ajcqVarE).c(defpackage.ajbm.INSTANCE, new aaab(obj3, zyyVar, 0));
                }
                try {
                    zztVar = (defpackage.zzt) defpackage.a.h(ajcqVarE);
                    break;
                } catch (java.util.concurrent.ExecutionException unused) {
                    zztVar = defpackage.zzt.b;
                }
                return ((defpackage.aaaf) obj3).c(zyyVar, zztVar);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aigf aigfVar = (defpackage.aigf) obj;
                android.os.Bundle bundle = new android.os.Bundle();
                android.os.Bundle bundle2 = new android.os.Bundle();
                defpackage.aigf aigfVar2 = (defpackage.aigf) this.b;
                defpackage.ailj it2 = aigfVar2.keySet().iterator();
                while (it2.hasNext()) {
                    java.lang.String str = (java.lang.String) it2.next();
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    boolean zBooleanValue = ((java.lang.Boolean) j$.util.Map.-EL.getOrDefault(aigfVar, str, bool)).booleanValue();
                    if (!zBooleanValue) {
                        zBooleanValue = ((java.lang.Boolean) j$.util.Map.-EL.getOrDefault(aigfVar, android.telephony.PhoneNumberUtils.formatNumberToE164(str, (java.lang.String) this.a), bool)).booleanValue();
                    }
                    java.util.Iterator it3 = ((java.util.List) aigfVar2.get(str)).iterator();
                    while (it3.hasNext()) {
                        bundle2.putBoolean((java.lang.String) it3.next(), zBooleanValue);
                    }
                }
                bundle.putBundle("blockedStatus", bundle2);
                return bundle;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                java.util.Iterator it4 = ((java.util.List) obj).iterator();
                while (true) {
                    ?? r3 = this.a;
                    if (!it4.hasNext()) {
                        return r3;
                    }
                    acvu acvuVar = ((adac) it4.next()).b;
                    if (defpackage.afsq.at(acvuVar)) {
                        java.util.Iterator it5 = acvuVar.o.iterator();
                        while (it5.hasNext()) {
                            defpackage.adak adakVar = (defpackage.adak) this.b;
                            r3.add(defpackage.afsq.am(defpackage.afsq.an((android.content.Context) adakVar.h, (defpackage.ahyn) adakVar.k, acvuVar), (acvr) it5.next()));
                        }
                    }
                }
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.Object obj4 = this.b;
                defpackage.acyu acyuVar = (defpackage.acyu) this.a;
                acvu acvuVar2 = (acvu) obj4;
                defpackage.aigf aigfVarC = acyuVar.c(acyuVar.b(acvuVar2), (defpackage.aigf) obj);
                for (acvr acvrVar : acvuVar2.o) {
                    if (!aigfVarC.containsKey(acvrVar)) {
                        java.lang.Object[] objArr = {"FileGroupManager", acvuVar2.d, acvrVar.c};
                        int i2 = defpackage.adbe.a;
                        defpackage.aimz aimzVar2 = defpackage.adbd.a;
                        ((defpackage.aimw) ((defpackage.aimw) aimzVar2.d()).l("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "w", 178, "LogUtil.java")).S("%s: Detected corruption of isolated structure for group %s %s", objArr);
                        ((defpackage.aimw) aimzVar2.d()).T();
                        return java.lang.Boolean.FALSE;
                    }
                }
                return java.lang.Boolean.TRUE;
            case 9:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    ((defpackage.acyu) this.b).b.l(1036);
                }
                return this.a;
            case 10:
                defpackage.aigf aigfVar3 = (defpackage.aigf) obj;
                defpackage.ailj it6 = ((defpackage.aigf) this.a).entrySet().iterator();
                while (true) {
                    java.lang.Object obj5 = this.b;
                    if (!it6.hasNext()) {
                        return ((defpackage.aigb) obj5).e(false);
                    }
                    java.util.Map.Entry entry2 = (java.util.Map.Entry) it6.next();
                    acwe acweVar = (acwe) entry2.getValue();
                    if (acweVar != null && aigfVar3.containsKey(acweVar)) {
                        ((defpackage.aigb) obj5).i((acvr) entry2.getKey(), (android.net.Uri) aigfVar3.get(acweVar));
                    }
                }
                break;
            case 11:
                defpackage.acvz acvzVar = (defpackage.acvz) obj;
                defpackage.akzx akzxVarL = acvzVar.L();
                ?? r2 = this.a;
                for (java.lang.String str2 : j$.util.DesugarCollections.unmodifiableMap(acvzVar.b).keySet()) {
                    try {
                        r2.add(defpackage.afsq.ai(str2));
                    } catch (defpackage.adbx e) {
                        java.lang.Object obj6 = this.b;
                        defpackage.adbe.f(e, "Failed to deserialize groupKey:".concat(java.lang.String.valueOf(str2)));
                        ((defpackage.aczl) obj6).a.a();
                        akzxVarL.ak(str2);
                    }
                }
                return (defpackage.acvz) akzxVarL.r();
            case 12:
                defpackage.akzx akzxVarL2 = ((defpackage.acvz) obj).L();
                akzxVarL2.aj((java.lang.String) this.a, (acvu) this.b);
                return (defpackage.acvz) akzxVarL2.r();
            case 13:
                defpackage.acwh acwhVar = (defpackage.acwh) obj;
                defpackage.aigb aigbVar = new defpackage.aigb(4);
                defpackage.ailj it7 = ((defpackage.aihd) this.a).iterator();
                while (it7.hasNext()) {
                    java.lang.Object obj7 = this.b;
                    acwe acweVar2 = (acwe) it7.next();
                    defpackage.aczp aczpVar = (defpackage.aczp) obj7;
                    acwg acwgVar = (acwg) j$.util.DesugarCollections.unmodifiableMap(acwhVar.b).get(defpackage.afsq.ac(acweVar2, aczpVar.a, aczpVar.b));
                    if (acwgVar != null) {
                        aigbVar.i(acweVar2, acwgVar);
                    }
                }
                return aigbVar.e(false);
            case 14:
                defpackage.akzx akzxVarL3 = ((defpackage.acwh) obj).L();
                akzxVarL3.al((java.lang.String) this.a, (acwg) this.b);
                return (defpackage.acwh) akzxVarL3.r();
            case 15:
                defpackage.acwh acwhVar2 = (defpackage.acwh) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                defpackage.akzx akzxVarL4 = acwhVar2.L();
                java.lang.Object obj8 = this.b;
                for (java.lang.String str3 : j$.util.DesugarCollections.unmodifiableMap(acwhVar2.b).keySet()) {
                    try {
                        arrayList.add(defpackage.afsq.ab(str3, ((defpackage.aczp) obj8).a, ((defpackage.aczp) obj8).b));
                    } catch (defpackage.adbz e2) {
                        akzxVarL4.am(str3);
                        defpackage.adbe.f(e2, "Failed to deserialize newFileKey:".concat(java.lang.String.valueOf(str3)));
                        defpackage.acxa acxaVar = ((defpackage.aczp) obj8).b;
                        defpackage.ahzf.d("|").j(str3).size();
                        acxaVar.a();
                    }
                }
                ((java.util.concurrent.atomic.AtomicReference) this.a).set(arrayList);
                return (defpackage.acwh) akzxVarL4.r();
            case 16:
                defpackage.acwd acwdVar = (defpackage.acwd) obj;
                long jV = defpackage.abrz.V();
                defpackage.ahyn ahynVarH = defpackage.ahwt.a;
                java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(acwdVar.g);
                java.lang.Object obj9 = this.b;
                if (mapUnmodifiableMap.containsKey(obj9)) {
                    ahynVarH = defpackage.ahyn.h(java.lang.Long.valueOf(defpackage.aldi.b((defpackage.alcf) j$.util.DesugarCollections.unmodifiableMap(acwdVar.g).get(obj9))));
                }
                defpackage.akzx akzxVarL5 = acwdVar.L();
                defpackage.alcf alcfVarE = defpackage.aldi.e(jV);
                j$.util.Objects.requireNonNull(obj9);
                j$.util.Objects.requireNonNull(alcfVarE);
                akzxVarL5.u();
                defpackage.acwd acwdVar2 = (defpackage.acwd) akzxVarL5.b;
                defpackage.albe albeVar = acwdVar2.g;
                if (!albeVar.b) {
                    acwdVar2.g = albeVar.a();
                }
                acwdVar2.g.put(obj9, alcfVarE);
                akzxVarL5.u();
                defpackage.acwd acwdVar3 = (defpackage.acwd) akzxVarL5.b;
                acwdVar3.c = null;
                acwdVar3.b &= -2;
                defpackage.acwd acwdVar4 = (defpackage.acwd) akzxVarL5.r();
                if (!ahynVarH.f()) {
                    return acwdVar4;
                }
                java.lang.Object obj10 = this.a;
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
                ((java.util.concurrent.atomic.AtomicReference) obj10).set(defpackage.ahyn.h(java.lang.Long.valueOf((jV - ((java.lang.Long) ahynVarH.b()).longValue()) / 3600000)));
                return acwdVar4;
            case 17:
                java.util.HashMap map2 = new java.util.HashMap(j$.util.DesugarCollections.unmodifiableMap(((defpackage.adcp) obj).b));
                map2.put(this.a, this.b);
                defpackage.akzx akzxVarM = defpackage.adcp.a.m();
                akzxVarM.u();
                defpackage.adcp adcpVar = (defpackage.adcp) akzxVarM.b;
                defpackage.albe albeVar2 = adcpVar.b;
                if (!albeVar2.b) {
                    adcpVar.b = albeVar2.a();
                }
                adcpVar.b.putAll(map2);
                return (defpackage.adcp) akzxVarM.r();
            case 18:
                defpackage.apef apefVar = (defpackage.apef) ((defpackage.aify) this.a).get(0);
                while (!((android.content.SharedPreferences) ((defpackage.aerx) this.b).d.a()).edit().putString("lastExitProcessName", apefVar.c).putLong("lastExitTimestamp", apefVar.g).commit()) {
                    i++;
                    if (i >= 3) {
                        ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).l("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitMetricServiceImpl", "updateLastRecordedAppExit", 220, "ApplicationExitMetricServiceImpl.java")).v("Failed to persist most recent App Exit");
                        return null;
                    }
                    break;
                }
                return null;
            case 19:
                defpackage.akzz akzzVar = (defpackage.akzz) ((aevu) obj).L();
                akzzVar.u();
                aevu aevuVar = akzzVar.b;
                java.lang.Object obj11 = this.a;
                j$.util.Objects.requireNonNull(obj11);
                aevuVar.c = (defpackage.apgu) obj11;
                aevuVar.b |= 1;
                aevu aevuVarR = akzzVar.r();
                ahex ahexVar = (ahex) this.b;
                java.lang.String[] strArr = {ahexVar.d.getClass().getName()};
                android.content.Intent intent = new android.content.Intent();
                android.content.Context context = (android.content.Context) ahexVar.e;
                intent.setComponent(new android.content.ComponentName(context, (java.lang.Class<?>) com.google.android.libraries.performance.primes.transmitter.LifeboatReceiver.class));
                intent.setPackage(context.getPackageName());
                intent.putExtra("Transmitters", strArr);
                intent.putExtra("MetricSnapshot", aevuVarR.i());
                context.sendBroadcast(intent);
                return null;
            default:
                aeyb aeybVar = (aeyb) obj;
                java.lang.Object obj12 = this.b;
                int i3 = aezf.a;
                defpackage.albh albhVar = aeya.a;
                j$.util.Objects.requireNonNull(obj12);
                defpackage.albh albhVar2 = (aeya) aeybVar.b.get(obj12);
                if (albhVar2 != null) {
                    albhVar = albhVar2;
                }
                java.lang.Object obj13 = this.a;
                defpackage.akzx akzxVarL6 = albhVar.L();
                if (!j$.util.DesugarCollections.unmodifiableList(akzxVarL6.b.c).contains(obj13)) {
                    akzxVarL6.ao((java.lang.String) obj13);
                }
                defpackage.akzx akzxVarL7 = aeybVar.L();
                akzxVarL6.u();
                aeya aeyaVar = akzxVarL6.b;
                j$.util.Objects.requireNonNull(obj13);
                aeyaVar.b |= 1;
                aeyaVar.d = (java.lang.String) obj13;
                akzxVarL7.ap((java.lang.String) obj12, (aeya) akzxVarL6.r());
                return akzxVarL7.r();
        }
    }

    public /* synthetic */ wym(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ wym(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
