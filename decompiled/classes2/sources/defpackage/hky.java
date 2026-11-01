package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class hky implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ hky(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v109, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r13v122, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a(java.lang.Object obj) {
        ajcq ajcqVarO;
        int i = 17;
        int i2 = 8;
        int i3 = 3;
        int i4 = 2;
        byte[] bArr = null;
        int i5 = 0;
        final int i6 = 1;
        switch (this.$cid) {
            case 0:
                return ((java.lang.Boolean) obj).booleanValue() ? this.a : aiql.z(j$.util.Optional.empty());
            case 1:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return aiql.z(java.lang.Boolean.TRUE);
                }
                zjs zjsVar = ((hkz) this.a).c;
                return aosv.F(zjsVar.c, 0, new xtn(zjsVar, (aoln) null, 13, (byte[]) null), 3);
            case 2:
                return ((defpackage.iax) this.a).c.b();
            case 3:
                defpackage.hzi hziVar = (defpackage.hzi) obj;
                return aiql.w(new ajcq[]{this.a, hziVar.c().c().a(false), hziVar.d()});
            case 4:
                android.os.Bundle bundle = (android.os.Bundle) obj;
                defpackage.hvd hvdVar = new defpackage.hvd(bundle, i2);
                java.lang.Object obj2 = this.a;
                defpackage.iok iokVar = (defpackage.iok) obj2;
                j$.util.Optional optional = iokVar.b;
                optional.isPresent();
                j$.util.Optional optionalA = ((defpackage.iny) optional.get()).a((android.os.Bundle) hvdVar.a);
                if (true == optionalA.isPresent()) {
                    defpackage.inz inzVarB = defpackage.inz.b(((defpackage.ioa) optionalA.get()).b);
                    if (inzVarB == null) {
                        inzVarB = defpackage.inz.UNSPECIFIED;
                    }
                    optionalA = j$.util.Optional.ofNullable(inzVarB);
                }
                optionalA.getClass();
                if (!optionalA.isPresent() || (optionalA.orElseThrow() != defpackage.inz.CAR_CRASH && optionalA.orElseThrow() != defpackage.inz.EMERGENCY_SOS)) {
                    defpackage.iok.a.b().l("com/android/dialer/autoassistedemergencycall/safetyhub/impl/service/SafetyhubEmergencyCallDataSender", "sendDataBackToSafetyHub", 114, "SafetyhubEmergencyCallDataSender.java").v("Unable to send data back - not car crash or emergency sos emergency");
                    return ajcm.a;
                }
                defpackage.hvd hvdVar2 = new defpackage.hvd(bundle, 6);
                optional.isPresent();
                j$.util.Optional optionalA2 = ((defpackage.iny) optional.get()).a((android.os.Bundle) hvdVar2.a);
                if (true == optionalA2.isPresent()) {
                    optionalA2 = j$.util.Optional.ofNullable(((defpackage.ioa) optionalA2.get()).c);
                }
                optionalA2.getClass();
                if (optionalA2.isPresent() && !((java.lang.String) optionalA2.orElseThrow()).isEmpty()) {
                    return ahvr.H(((defpackage.ioj) aooc.ar(((afpl) iokVar.d.a()).Y(), defpackage.ioj.class)).W(), new icy(obj2, (java.lang.String) optionalA2.orElseThrow(), bundle, 2, (byte[]) null), iokVar.c);
                }
                defpackage.iok.a.b().l("com/android/dialer/autoassistedemergencycall/safetyhub/impl/service/SafetyhubEmergencyCallDataSender", "sendDataBackToSafetyHub", 128, "SafetyhubEmergencyCallDataSender.java").v("Unable to send data back - emergency call id is not present");
                return ajcm.a;
            case 5:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                java.lang.Object obj3 = this.a;
                defpackage.jny jnyVar = (defpackage.jny) obj3;
                if (jnyVar.g) {
                    defpackage.jny.a.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncer", "onCallRingingStarted", androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER, "CallAnnouncer.java").v("retrieved announcement text after announcement has been cancelled");
                    return ajcm.a;
                }
                if (!optional2.isPresent()) {
                    defpackage.jny.a.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncer", "onCallRingingStarted", 110, "CallAnnouncer.java").v("announcement is empty");
                    return ajcm.a;
                }
                defpackage.jny.a.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncer", "onCallRingingStarted", 107, "CallAnnouncer.java").v("announcement is present");
                defpackage.jnu jnuVar = (defpackage.jnu) optional2.orElseThrow();
                defpackage.jns jnsVar = jnyVar.i;
                return ahvr.I(jnsVar.a(gus.ae(jnsVar.b)), new defpackage.idd(obj3, jnuVar, 4, bArr), jnyVar.b);
            case 6:
                aigf aigfVar = (aigf) obj;
                aihd aihdVarF = aigfVar.f();
                boolean zIsEmpty = aihdVarF.isEmpty();
                java.lang.Object obj4 = this.a;
                if (zIsEmpty) {
                    ajcqVarO = aiql.z(aikj.b);
                } else {
                    java.lang.Iterable<java.util.List> iterableBf = ahvr.bf(aihdVarF, 999);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.util.List list : iterableBf) {
                        adag adagVar = new adag((byte[]) null);
                        adagVar.n("SELECT normalized_phone_number, caller_id_feedback_info, feedback_creation_time_millis FROM caller_id_feedback WHERE normalized_phone_number IN (?");
                        java.util.Iterator it = list.iterator();
                        adagVar.p((java.lang.String) it.next());
                        while (it.hasNext()) {
                            adagVar.n(",?");
                            adagVar.p((java.lang.String) it.next());
                        }
                        adagVar.n(")");
                        arrayList.add(((jsk) obj4).f.F(new defpackage.jsh(adagVar.B(), i6)));
                    }
                    ajcqVarO = ahvr.aj(arrayList).o(new defpackage.hkx(arrayList, 14), ((jsk) obj4).b);
                }
                return ahvr.H(ajcqVarO, new defpackage.hup(aigfVar, 20), ((jsk) obj4).b);
            case 7:
                aify aifyVar = (aify) obj;
                if (aifyVar.isEmpty()) {
                    jsk.a.b().l("com/android/dialer/calleridfeedback/impl/database/CallerIdFeedbackDatabase", "deleteAllMatching", 452, "CallerIdFeedbackDatabase.java").v("feedbackCreationTimestamp list empty");
                    return ajcm.a;
                }
                java.lang.Iterable iterableBf2 = ahvr.bf(aifyVar, 999);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it2 = iterableBf2.iterator();
                while (true) {
                    java.lang.Object obj5 = this.a;
                    if (!it2.hasNext()) {
                        return ahvr.aj(arrayList2).o(new defpackage.jse(0), ((jsk) obj5).b);
                    }
                    java.util.List list2 = (java.util.List) it2.next();
                    wsk wskVar = new wsk("caller_id_feedback");
                    wskVar.e("feedback_creation_time_millis IN (?");
                    java.util.Iterator it3 = list2.iterator();
                    wskVar.f(java.lang.String.valueOf(it3.next()));
                    while (it3.hasNext()) {
                        wskVar.e(",?");
                        wskVar.f(java.lang.String.valueOf(it3.next()));
                    }
                    wskVar.e(")");
                    arrayList2.add(((jsk) obj5).f.G(new defpackage.jsg(wskVar, 1)));
                }
                break;
            case 8:
                final long j = ((jtu) obj).c;
                jtw.a.b().l("com/android/dialer/calleridfeedback/impl/phonelookup/CallerIdFeedbackPhoneLookupContributor", "isDirty", 74, "CallerIdFeedbackPhoneLookupContributor.java").x("Read lastLookupTimestamp:%d", j);
                if (j == 0) {
                    return aiql.z(java.lang.Boolean.TRUE);
                }
                jsk jskVar = ((jtw) this.a).c;
                return ahrv.g(jskVar.g.bk()).h(new ahyc() { // from class: adbc
                    public final java.lang.Object apply(java.lang.Object obj6) {
                        if (i6 != 0) {
                            aimz aimzVar = jsk.a;
                            return ((jsm) obj6).c > j ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
                        }
                        acwf acwfVar = (acwf) obj6;
                        long j2 = j;
                        boolean z = 100 % j2 != 0;
                        if (z) {
                            adbe.c("Bad sample interval (1 percent cohort will not log): %d", java.lang.Long.valueOf(j2));
                        }
                        if (!adag.b(acwfVar.c, j2)) {
                            return ahwt.a;
                        }
                        akzx akzxVarM = defpackage.aixg.a.m();
                        akzxVarM.u();
                        defpackage.aixg aixgVar = (defpackage.aixg) akzxVarM.b;
                        aixgVar.b |= 1;
                        aixgVar.c = true;
                        alcf alcfVar = acwfVar.d;
                        if (alcfVar == null) {
                            alcfVar = alcf.a;
                        }
                        long jB = aldi.b(alcfVar);
                        akzxVarM.u();
                        defpackage.aixg aixgVar2 = (defpackage.aixg) akzxVarM.b;
                        aixgVar2.b |= 2;
                        aixgVar2.d = jB;
                        boolean zB = adag.b(acwfVar.c, 100L);
                        akzxVarM.u();
                        defpackage.aixg aixgVar3 = (defpackage.aixg) akzxVarM.b;
                        aixgVar3.b |= 4;
                        aixgVar3.e = zB;
                        akzxVarM.u();
                        defpackage.aixg aixgVar4 = (defpackage.aixg) akzxVarM.b;
                        aixgVar4.b |= 8;
                        aixgVar4.f = z;
                        return ahyn.h((defpackage.aixg) akzxVarM.p());
                    }
                }, jskVar.b);
            case 9:
                defpackage.jiv jivVar = (defpackage.jiv) this.a;
                return ((kaw) jivVar.c).p(((aogc) jivVar.d).bl(new jsd(jivVar.b(), 3)));
            case 10:
                java.util.Locale locale = (java.util.Locale) obj;
                acvm acvmVarA = acvn.a();
                acvmVarA.b("caller-tag-icons");
                acvn acvnVarA = acvmVarA.a();
                java.lang.Object obj6 = this.a;
                jvs jvsVar = (jvs) obj6;
                rsr rsrVar = jvsVar.f;
                ahrv ahrvVarG = ahrv.g(rsrVar.G(acvnVarA));
                defpackage.jvq jvqVar = new defpackage.jvq(i5);
                ajct ajctVar = jvsVar.c;
                ajcq ajcqVarH = ahrvVarG.h(jvqVar, ajctVar);
                acvm acvmVarA2 = acvn.a();
                acvmVarA2.b(java.lang.String.format("localized-caller-tags-config_%s", locale.toLanguageTag()));
                ajcq ajcqVarI = ahrv.g(rsrVar.G(acvmVarA2.a())).i(new defpackage.idd(obj6, locale, i), ajctVar);
                return ahvr.ak(new ajcq[]{ajcqVarI, ajcqVarH}).p(new defpackage.jsr(obj6, ajcqVarI, ajcqVarH, i4), ajctVar);
            case 11:
                j$.util.Optional optional3 = (j$.util.Optional) obj;
                if (!optional3.isPresent()) {
                    a.bI(defpackage.jwd.a.d(), "PhoneAccountHandle is not available", "com/android/dialer/callingnetworks/impl/CallingNetworksDataController$1", "onCallScopeRemoved", '>', "CallingNetworksDataController.java", zct.b);
                    return ajcm.a;
                }
                java.lang.Object obj7 = this.a;
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) optional3.orElseThrow();
                defpackage.jwd jwdVar = (defpackage.jwd) ((defpackage.jwb) obj7).a;
                jwk jwkVar = jwdVar.d;
                defpackage.gzk gzkVar = new defpackage.gzk(jwkVar, phoneAccountHandle, 9, bArr);
                ajct ajctVar2 = jwkVar.b;
                return ahvr.I(ahrv.g(ahvr.F(gzkVar, ajctVar2)).h(new icy(jwkVar, jwdVar.b, jwdVar.i, 3, (char[]) null), ajctVar2), new defpackage.jwi(jwkVar, jwdVar.f, i5), ajbm.a);
            case 12:
                aihd aihdVar = (aihd) j$.util.Collection.-EL.stream(((java.util.Map) obj).values()).map(new defpackage.etw(17)).collect(aido.b);
                if (aihdVar.isEmpty()) {
                    jwu.a.b().l("com/android/dialer/callingnetworks/impl/CallingNetworksStorage", "deleteAllMatching", 324, "CallingNetworksStorage.java").v("Nothing to delete");
                    return aiql.z((java.lang.Object) null);
                }
                jwu jwuVar = ((jwg) this.a).a;
                if (jwuVar.d.m()) {
                    return aiql.y(new defpackage.jwt());
                }
                java.lang.Iterable<java.util.List> iterableBf3 = ahvr.bf(aihdVar.g(), 999);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.util.List list3 : iterableBf3) {
                    wsk wskVar2 = new wsk("calling_network_properties");
                    wskVar2.e("call_creation_time_millis in (?");
                    java.util.Iterator it4 = list3.iterator();
                    wskVar2.f(java.lang.String.valueOf(it4.next()));
                    while (it4.hasNext()) {
                        wskVar2.f(java.lang.String.valueOf(it4.next()));
                        wskVar2.e(",?");
                    }
                    wskVar2.e(")");
                    arrayList3.add(jwuVar.e.G(new defpackage.jsg(wskVar2, 2)));
                }
                return ahvr.aj(arrayList3).o(ahqx.i(new defpackage.jse(2)), ajbm.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                jys jysVar = (jys) this.a;
                jysVar.g.b();
                jyu jyuVar = jysVar.e;
                return aosv.C(ahvr.ag(jyuVar.b, jyuVar.e, new defpackage.jlk(new defpackage.blq(jyuVar, (aoln) null, 19), (aoln) null, 17, (char[]) null)));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                java.lang.Object obj8 = this.a;
                return ((jys) obj8).b.eU(ahqx.i(new defpackage.jyr(obj8, i5)));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                defpackage.kdb kdbVar = new defpackage.kdb(this.a, i5);
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(((kdd) ((ahbv) kdbVar.a).f).b(((kiv) optionalOfNullable.get()).b));
                }
                return (ajcq) optionalOfNullable.orElse(ajcm.a);
            case 16:
                j$.util.Optional optionalOfNullable2 = (j$.util.Optional) obj;
                defpackage.kdb kdbVar2 = new defpackage.kdb(this.a, i3);
                if (true == optionalOfNullable2.isPresent()) {
                    java.lang.Object obj9 = optionalOfNullable2.get();
                    ahbv ahbvVar = (ahbv) kdbVar2.a;
                    optionalOfNullable2 = j$.util.Optional.ofNullable(ahvr.H(((kdd) ahbvVar.f).c(((kiv) obj9).b), new defpackage.jvq(i2), (java.util.concurrent.Executor) ahbvVar.e));
                }
                return (ajcq) optionalOfNullable2.orElse(aiql.z(j$.util.Optional.empty()));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                j$.util.Optional optionalOfNullable3 = (j$.util.Optional) obj;
                defpackage.kdb kdbVar3 = new defpackage.kdb(this.a, i4);
                if (true == optionalOfNullable3.isPresent()) {
                    optionalOfNullable3 = j$.util.Optional.ofNullable(((kdd) ((ahbv) kdbVar3.a).f).b(((kiv) optionalOfNullable3.get()).b));
                }
                return (ajcq) optionalOfNullable3.orElse(ajcm.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                j$.util.Optional optionalOfNullable4 = (j$.util.Optional) obj;
                defpackage.kdb kdbVar4 = new defpackage.kdb(this.a, i6);
                if (true == optionalOfNullable4.isPresent()) {
                    java.lang.Object obj10 = optionalOfNullable4.get();
                    ahbv ahbvVar2 = (ahbv) kdbVar4.a;
                    optionalOfNullable4 = j$.util.Optional.ofNullable(ahvr.H(((kdd) ahbvVar2.f).c(((kiv) obj10).b), new defpackage.jvq(i2), (java.util.concurrent.Executor) ahbvVar2.e));
                }
                return (ajcq) optionalOfNullable4.orElse(aiql.z(j$.util.Optional.empty()));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((defpackage.kvb) this.a).b((defpackage.kwx) obj);
            default:
                defpackage.kvb kvbVar = (defpackage.kvb) this.a;
                if (!((java.lang.Boolean) kvbVar.e.a()).booleanValue()) {
                    zjx zjxVar = kvbVar.d;
                    aguv aguvVarA = aguz.a(kuy.class);
                    aguvVarA.f(new aguy("recording_auto_deletion_worker", 2));
                    aguvVarA.d(new aguw(new agux(1L, java.util.concurrent.TimeUnit.DAYS), ahwt.a));
                    return zjxVar.b(aguvVarA.a());
                }
                defpackage.kvb.a.b().l("com/android/dialer/callrecording/impl/RecordingDeleter", "deleteStaleRecordingsAndSavePolicy", 82, "RecordingDeleter.java").v("AutoDeletionWorker will run every 15 minutes");
                zjx zjxVar2 = kvbVar.d;
                aguv aguvVarA2 = aguz.a(kuy.class);
                aguvVarA2.f(new aguy("recording_auto_deletion_worker", 2));
                aguvVarA2.d(new aguw(new agux(15L, java.util.concurrent.TimeUnit.MINUTES), ahwt.a));
                return zjxVar2.b(aguvVarA2.a());
        }
    }
}
