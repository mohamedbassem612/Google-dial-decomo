package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class nyf implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ nyf(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v39, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v8, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r15v17, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r15v30, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r15v40, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v44, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r15v47, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object, kfj] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v5, types: [aiii, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        boolean z = false;
        z = false;
        switch (this.$cid) {
            case 0:
                ?? r0 = this.b;
                ?? r15 = this.a;
                defpackage.aimz aimzVar = defpackage.nyh.a;
                defpackage.ahvr.cc(r15.isDone(), "Future was expected to be done: %s", r15);
                int iIntValue = ((java.lang.Integer) defpackage.a.h(r15)).intValue();
                defpackage.ahvr.cc(r0.isDone(), "Future was expected to be done: %s", r0);
                boolean zBooleanValue = ((java.lang.Boolean) defpackage.a.h(r0)).booleanValue();
                if (iIntValue == 1) {
                    return defpackage.nwv.UNAVAILABLE_MISSING_PROVIDER;
                }
                if (iIntValue == 2) {
                    return defpackage.nwv.UNAVAILABLE_SIGNED_OUT;
                }
                if (iIntValue != 3) {
                    return defpackage.nwv.UNKNOWN_API_PROVIDER_AVAILABILITY;
                }
                return zBooleanValue ? defpackage.nwv.AVAILABLE_NO_REACHABILITY : defpackage.nwv.AVAILABLE;
            case 1:
                ((defpackage.zth) ((defpackage.kjw) this.b).n.b.a()).a().edit().putBoolean("annotated_call_log_built", true).apply();
                return this.a.f() ? defpackage.kjv.c : defpackage.kjv.d;
            case 2:
                defpackage.aimz aimzVar2 = defpackage.onw.a;
                defpackage.aidf aidfVar = new defpackage.aidf(null);
                for (java.util.Map.Entry entry : this.b.i()) {
                    java.util.concurrent.Future future = (java.util.concurrent.Future) ((defpackage.aigf) this.a).get(entry.getKey());
                    defpackage.ahvr.cc(future.isDone(), "Future was expected to be done: %s", future);
                    aidfVar.t(defpackage.a.h(future), entry.getValue());
                }
                return aidfVar;
            case 3:
                java.lang.Object obj = this.b;
                try {
                    return ((defpackage.spw) this.a).i(((defpackage.aigf) obj).keySet());
                } catch (defpackage.spv e) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.spw.a.c()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/phonelookup/blockednumber/SystemBlockedNumberPhoneLookupContributor", "getMostRecentInfo", 'u', "SystemBlockedNumberPhoneLookupContributor.java")).v("querying blocked numbers failed");
                    return obj;
                }
            case 4:
                ?? r1 = this.a;
                defpackage.ahvr.cc(r1.isDone(), "Future was expected to be done: %s", r1);
                boolean zBooleanValue2 = ((java.lang.Boolean) defpackage.a.h(r1)).booleanValue();
                ?? r16 = this.b;
                defpackage.ahvr.cc(r16.isDone(), "Future was expected to be done: %s", r16);
                boolean zBooleanValue3 = ((java.lang.Boolean) defpackage.a.h(r16)).booleanValue();
                if (zBooleanValue2 && zBooleanValue3) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 5:
                return ((defpackage.vdc) this.b).b((android.telecom.PhoneAccountHandle) this.a);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                ?? r2 = this.b;
                ?? r17 = this.a;
                try {
                    defpackage.ahvr.cc(r17.isDone(), "Future was expected to be done: %s", r17);
                    defpackage.aify<uzo> aifyVar = (defpackage.aify) defpackage.a.h(r17);
                    defpackage.ahvr.cc(r2.isDone(), "Future was expected to be done: %s", r2);
                    defpackage.aigf aigfVar = (defpackage.aigf) defpackage.a.h(r2);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (uzo uzoVar : aifyVar) {
                        defpackage.kiu kiuVar = uzoVar.d;
                        if (kiuVar == null) {
                            kiuVar = defpackage.kiu.a;
                        }
                        defpackage.akzx akzxVarL = kiuVar.L();
                        defpackage.kiu kiuVar2 = uzoVar.d;
                        if (kiuVar2 == null) {
                            kiuVar2 = defpackage.kiu.a;
                        }
                        hkd hkdVar = kiuVar2.f;
                        if (hkdVar == null) {
                            hkdVar = hkd.a;
                        }
                        kiw kiwVarR = defpackage.gus.aK((spn) aigfVar.getOrDefault(hkdVar, spn.a)).r();
                        akzxVarL.u();
                        defpackage.kiu kiuVar3 = (defpackage.kiu) akzxVarL.b;
                        j$.util.Objects.requireNonNull(kiwVarR);
                        kiuVar3.r = kiwVarR;
                        kiuVar3.b |= 16384;
                        defpackage.akzx akzxVarL2 = uzoVar.L();
                        defpackage.kiu kiuVar4 = (defpackage.kiu) akzxVarL.r();
                        akzxVarL2.u();
                        uzo uzoVar2 = akzxVarL2.b;
                        j$.util.Objects.requireNonNull(kiuVar4);
                        uzoVar2.d = kiuVar4;
                        uzoVar2.b |= 2;
                        arrayList.add(akzxVarL2.r());
                    }
                    return defpackage.aify.n(arrayList);
                } catch (java.util.concurrent.ExecutionException e2) {
                    throw new java.lang.AssertionError(e2);
                }
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                j$.util.Optional optionalA = ((defpackage.vva) this.b).j.A();
                boolean zIsPresent = optionalA.isPresent();
                java.lang.Object obj2 = this.a;
                if (!zIsPresent) {
                    return obj2;
                }
                defpackage.rsr rsrVar = new defpackage.rsr(new defpackage.kaw("is_omtp_voicemail").aH("!= 1"));
                rsrVar.aD(new defpackage.kaw("source_package").aI("=", optionalA.orElseThrow(new defpackage.kjx(4))));
                defpackage.rsr rsrVar2 = (defpackage.rsr) obj2;
                rsrVar2.aC(rsrVar.aB());
                rsrVar2.aC(new defpackage.kaw("source_package").aI("!=", defpackage.vva.a[0]));
                return obj2;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aift aiftVar = new defpackage.aift(4);
                ?? r3 = this.a;
                defpackage.ahvr.cc(r3.isDone(), "Future was expected to be done: %s", r3);
                aiftVar.k((java.lang.Iterable) defpackage.a.h(r3));
                ?? r18 = this.b;
                defpackage.ahvr.cc(r18.isDone(), "Future was expected to be done: %s", r18);
                aiftVar.k((java.lang.Iterable) defpackage.a.h(r18));
                return aiftVar.g();
            case 9:
                return ((defpackage.adnp) this.a).d(this.b);
            case 10:
                ?? r4 = this.b;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(r4.size());
                for (defpackage.aclv aclvVar : r4) {
                    arrayList2.add(new defpackage.aclw(aclvVar, ((defpackage.aclt) this.a).b.a(aclvVar)));
                }
                return arrayList2;
            case 11:
                defpackage.acwx acwxVar = (defpackage.acwx) this.a;
                defpackage.ahyn ahynVar = acwxVar.c;
                if (!ahynVar.f()) {
                    defpackage.adbe.c("%s: Called schedulePeriodicTasksInternal when taskScheduler is not provided.", "MobileDataDownload");
                    return null;
                }
                java.lang.Object obj3 = this.b;
                defpackage.aogc aogcVar = (defpackage.aogc) ahynVar.b();
                defpackage.aigb aigbVar = new defpackage.aigb(4);
                defpackage.acvl acvlVar = acwxVar.e;
                aigbVar.i("MDD.CHARGING.PERIODIC.TASK", defpackage.abrz.ab(acvlVar.v()));
                aigbVar.i("MDD.MAINTENANCE.PERIODIC.GCM.TASK", defpackage.abrz.ab(acvlVar.u()));
                aigbVar.i("MDD.CELLULAR.CHARGING.PERIODIC.TASK", defpackage.abrz.ab(acvlVar.t()));
                aigbVar.i("MDD.WIFI.CHARGING.PERIODIC.TASK", defpackage.abrz.ab(acvlVar.w()));
                defpackage.aigf aigfVarE = aigbVar.e(true);
                defpackage.acxe acxeVarA = defpackage.acxf.a();
                acxeVarA.a = "MDD.CHARGING.PERIODIC.TASK";
                acxeVarA.e(acvlVar.q());
                acxeVarA.c(3);
                defpackage.acwz acwzVar = (defpackage.acwz) obj3;
                defpackage.ahyn ahynVar2 = acwzVar.a;
                acxeVarA.b = defpackage.acwx.l(ahynVar2, aigfVarE, "MDD.CHARGING.PERIODIC.TASK");
                defpackage.ahyn ahynVar3 = acwzVar.b;
                acxeVarA.b(ahynVar3);
                aogcVar.ak(acxeVarA.a());
                defpackage.acxe acxeVarA2 = defpackage.acxf.a();
                acxeVarA2.a = "MDD.MAINTENANCE.PERIODIC.GCM.TASK";
                acxeVarA2.e(acvlVar.r());
                acxeVarA2.c(3);
                acxeVarA2.b = defpackage.acwx.l(ahynVar2, aigfVarE, "MDD.MAINTENANCE.PERIODIC.GCM.TASK");
                acxeVarA2.b(ahynVar3);
                aogcVar.ak(acxeVarA2.a());
                defpackage.acxe acxeVarA3 = defpackage.acxf.a();
                acxeVarA3.a = "MDD.CELLULAR.CHARGING.PERIODIC.TASK";
                acxeVarA3.e(acvlVar.p());
                acxeVarA3.c(1);
                acxeVarA3.b = defpackage.acwx.l(ahynVar2, aigfVarE, "MDD.CELLULAR.CHARGING.PERIODIC.TASK");
                acxeVarA3.b(ahynVar3);
                aogcVar.ak(acxeVarA3.a());
                defpackage.acxe acxeVarA4 = defpackage.acxf.a();
                acxeVarA4.a = "MDD.WIFI.CHARGING.PERIODIC.TASK";
                acxeVarA4.e(acvlVar.s());
                acxeVarA4.c(2);
                acxeVarA4.b = defpackage.acwx.l(ahynVar2, aigfVarE, "MDD.WIFI.CHARGING.PERIODIC.TASK");
                acxeVarA4.b(ahynVar3);
                aogcVar.ak(acxeVarA4.a());
                return null;
            case 12:
                defpackage.adhf.a(this.b, "Cancellation request for pack '%s' failed", this.a);
                return null;
            case 13:
                defpackage.aiof aiofVar = defpackage.adhn.a;
                this.a.size();
                return this.b;
            case 14:
                return java.lang.Boolean.valueOf(j$.util.Collection.-EL.stream((java.util.Collection) this.b).noneMatch(new defpackage.tcw(this.a, 9)));
            case 15:
                java.util.concurrent.CopyOnWriteArrayList<defpackage.adop> copyOnWriteArrayList = ((defpackage.adqn) this.a).b;
                java.lang.Object obj4 = this.b;
                for (defpackage.adop adopVar : copyOnWriteArrayList) {
                    try {
                        adopVar.a((java.lang.String) obj4);
                    } catch (java.lang.Exception e3) {
                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.adqn.a.d()).k(e3)).l("com/google/android/libraries/micore/telephony/common/audiomessages/PersistentVoiceFileManagerWrapper", "notifyVoiceChanged", 244, "PersistentVoiceFileManagerWrapper.java")).y("Error thrown from voice change listener %s", adopVar);
                    }
                }
                return null;
            case 16:
                defpackage.afhr afhrVar = (defpackage.afhr) this.a;
                afhrVar.d.f();
                try {
                    return this.b.call();
                } finally {
                    afhrVar.d.e();
                }
            case 17:
                java.lang.Object objH = defpackage.aiql.H(this.a);
                defpackage.aooh.e(objH, "getDone(...)");
                android.accounts.Account[] accountArr = (android.accounts.Account[]) objH;
                java.util.HashSet<java.lang.String> hashSetAp = defpackage.ahvr.ap(accountArr.length);
                for (android.accounts.Account account : accountArr) {
                    if (!defpackage.aooh.n("Android Enterprise", account.name)) {
                        java.lang.String str = account.name;
                        defpackage.aooh.e(str, "name");
                        hashSetAp.add(str);
                    }
                }
                java.lang.Object objH2 = defpackage.aiql.H(this.b);
                defpackage.aooh.e(objH2, "getDone(...)");
                android.accounts.Account[] accountArr2 = (android.accounts.Account[]) objH2;
                java.util.HashSet hashSetAp2 = defpackage.ahvr.ap(accountArr2.length);
                for (android.accounts.Account account2 : accountArr2) {
                    java.lang.String str2 = account2.name;
                    defpackage.aooh.e(str2, "name");
                    hashSetAp2.add(str2);
                }
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (java.lang.String str3 : hashSetAp) {
                    linkedHashMap.put(str3, java.lang.Boolean.valueOf(hashSetAp2.contains(str3)));
                }
                return linkedHashMap;
            case 18:
                defpackage.apdi apdiVar = (defpackage.apdi) this.a;
                return (defpackage.ajsy) defpackage.ahvr.aC(new defpackage.afab((android.content.pm.PackageManager) apdiVar.d).b(((android.content.Context) apdiVar.a).getPackageName()), new defpackage.ahbx(new defpackage.rou(19), 5)).get(this.b);
            case 19:
                defpackage.ahko ahkoVar = (defpackage.ahko) this.a;
                defpackage.ahyn ahynVar4 = ahkoVar.b;
                if (ahynVar4.f()) {
                    ahynVar4.b();
                }
                return ((defpackage.ajwr) ((defpackage.apni) this.b).a).m(ahkoVar.d, ahkoVar.a + ".pb");
            default:
                defpackage.ahku ahkuVar = (defpackage.ahku) this.a;
                defpackage.ahkk ahkkVar = ahkuVar.g;
                return new java.io.File(((defpackage.ajwr) ((defpackage.aogc) this.b).a).l(ahkkVar.a, ahkkVar.b), ahkuVar.a);
        }
    }

    public /* synthetic */ nyf(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
