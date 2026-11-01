package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ocj implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ocj(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a(java.lang.Object obj) {
        java.lang.Object objZ;
        int i = 19;
        int i2 = 4;
        int i3 = 5;
        int i4 = 11;
        byte[] bArr = null;
        int i5 = 1;
        switch (this.$cid) {
            case 0:
                return a.j((aonj) this.a, obj);
            case 1:
                acui acuiVar = (acui) obj;
                if (acuiVar == null) {
                    a.bI(defpackage.nzm.a.c().m(aioa.b), "No file group found for Eligibility Expansion.", "com/android/dialer/eligibilityexpansion/mdd/EligibilityExpansionRepository", "getData", 'a', "EligibilityExpansionRepository.java", zct.b);
                    return aiql.z(j$.util.Optional.empty());
                }
                java.lang.Object obj2 = this.a;
                j$.util.Optional optionalFindAny = j$.util.Collection.-EL.stream(acuiVar.h).filter(new defpackage.jty(obj2, i4)).findAny();
                if (true == optionalFindAny.isPresent()) {
                    optionalFindAny = j$.util.Optional.ofNullable(((acuh) optionalFindAny.get()).d);
                }
                if (true == optionalFindAny.isPresent()) {
                    optionalFindAny = j$.util.Optional.ofNullable(android.net.Uri.parse((java.lang.String) optionalFindAny.get()));
                }
                defpackage.nzu nzuVar = new defpackage.nzu(obj2, 1);
                if (true == optionalFindAny.isPresent()) {
                    java.lang.Object obj3 = optionalFindAny.get();
                    java.lang.Object obj4 = nzuVar.a;
                    optionalFindAny = j$.util.Optional.ofNullable(ahvr.F(new defpackage.lly(obj4, (android.net.Uri) obj3, i4, bArr), ((defpackage.nzm) obj4).b));
                }
                if (true != optionalFindAny.isPresent()) {
                    a.bI(defpackage.nzm.a.c().m(aioa.b), "No file found for Eligibility Expansion.", "com/android/dialer/eligibilityexpansion/mdd/EligibilityExpansionRepository", "getData", 'y', "EligibilityExpansionRepository.java", zct.b);
                    objZ = aiql.z(j$.util.Optional.empty());
                } else {
                    objZ = optionalFindAny.get();
                }
                return (ajcq) objZ;
            case 2:
                defpackage.onu onuVar = (defpackage.onu) obj;
                j$.util.Optional optional = onuVar.a;
                j$.util.Optional optional2 = onuVar.b;
                if (!optional.isPresent() || !optional2.isPresent()) {
                    return ajcm.a;
                }
                java.lang.Object obj5 = this.a;
                java.lang.Long l = (java.lang.Long) optional.orElseThrow();
                l.longValue();
                defpackage.omz omzVar = (defpackage.omz) optional2.orElseThrow();
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put("call_creation_time_millis", l);
                contentValues.put("fides_details", omzVar.i());
                defpackage.onb onbVar = (defpackage.onb) obj5;
                return ahvr.H(((onv) onbVar.b).b.G(new defpackage.jsg(contentValues, 7)), new defpackage.oqe(obj5, omzVar, i5, bArr), onbVar.a);
            case 3:
                java.lang.Long l2 = (java.lang.Long) obj;
                l2.longValue();
                adag adagVar = new adag((byte[]) null);
                adagVar.n("SELECT call_creation_time_millis,fides_details FROM fides WHERE call_creation_time_millis > ?");
                adagVar.o(l2);
                adag adagVarB = adagVar.B();
                java.lang.Object obj6 = this.a;
                ons onsVar = (ons) obj6;
                return ahvr.I(onsVar.b.a(adagVarB), new defpackage.ocj(obj6, i3), onsVar.a);
            case 4:
                aify aifyVar = (aify) obj;
                if (aifyVar.isEmpty()) {
                    return ajcm.a;
                }
                java.lang.Iterable iterableBf = ahvr.bf(aifyVar, 999);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = iterableBf.iterator();
                while (true) {
                    java.lang.Object obj7 = this.a;
                    if (!it.hasNext()) {
                        return ahvr.aj(arrayList).o(new defpackage.onq(2), ((onv) obj7).a);
                    }
                    java.util.List list = (java.util.List) it.next();
                    wsk wskVar = new wsk("fides");
                    wskVar.e("call_creation_time_millis IN (?");
                    java.util.Iterator it2 = list.iterator();
                    wskVar.f(java.lang.String.valueOf(it2.next()));
                    while (it2.hasNext()) {
                        wskVar.e(",?");
                        wskVar.f(java.lang.String.valueOf(it2.next()));
                    }
                    wskVar.e(")");
                    arrayList.add(((onv) obj7).b.G(new defpackage.jsg(wskVar, 6)));
                }
                break;
            case 5:
                aigf aigfVar = (aigf) obj;
                if (aigfVar.isEmpty()) {
                    return aiql.z(aikj.b);
                }
                ons onsVar2 = (ons) this.a;
                return ahvr.H(onsVar2.e.ac(aigfVar.f()), new defpackage.mjl(aigfVar, i4), onsVar2.c);
            case 6:
                j$.util.Optional optional3 = (j$.util.Optional) obj;
                if (!optional3.isPresent()) {
                    return ajcm.a;
                }
                java.lang.Object obj8 = this.a;
                return ahvr.F(new defpackage.lly(obj8, ((defpackage.oql) optional3.orElseThrow()).c(), 17), ((oqi) obj8).c);
            case 7:
                j$.util.Optional optional4 = (j$.util.Optional) obj;
                return !optional4.isPresent() ? aiql.z(j$.util.Optional.empty()) : dff.m(new defpackage.jnr(this.a, optional4, i2));
            case 8:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    ots.a.b().l("com/android/dialer/incall/activity/outgoingcalllauncher/InCallActivityCallDialingStartedListener", "onCallDialingStarted", 68, "InCallActivityCallDialingStartedListener.java").v("start call in bubble mode, avoid firing InCallActivityIntent");
                    return ajcm.a;
                }
                java.lang.Object obj9 = this.a;
                ots otsVar = (ots) obj9;
                java.lang.Boolean bool = (java.lang.Boolean) otsVar.e.e().orElse(java.lang.Boolean.FALSE);
                boolean zBooleanValue = bool.booleanValue();
                aimz aimzVar = ots.a;
                aimzVar.b().l("com/android/dialer/incall/activity/outgoingcalllauncher/InCallActivityCallDialingStartedListener", "onCallDialingStarted", 74, "InCallActivityCallDialingStartedListener.java").y("isInCallUiVisible: %b", bool);
                if (zBooleanValue) {
                    aimzVar.b().l("com/android/dialer/incall/activity/outgoingcalllauncher/InCallActivityCallDialingStartedListener", "onCallDialingStarted", 76, "InCallActivityCallDialingStartedListener.java").v("in-call UI is already showing, avoid firing InCallActivityIntent");
                    otsVar.d.a(qbc.hj);
                    return ajcm.a;
                }
                ajcq ajcqVarB = otsVar.b().B();
                ajcq ajcqVarBb = otsVar.b().bb();
                return ahvr.ak(new ajcq[]{ajcqVarB, ajcqVarBb}).o(new defpackage.hsl(obj9, ajcqVarB, ajcqVarBb, 13, (byte[]) null), otsVar.c);
            case 9:
                ozy ozyVar = (ozy) aooc.ar((defpackage.hkl) obj, ozy.class);
                wjc wjcVar = (wjc) this.a;
                return ahvr.I(wjcVar.b(ozyVar), new ozx(wjcVar, ozyVar), (java.util.concurrent.Executor) wjcVar.e);
            case 10:
                boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj10 = this.a;
                return zBooleanValue2 ? ((pqm) ((wjc) obj10).i).d() : ((pqm) ((wjc) obj10).i).b();
            case 11:
                j$.util.Optional optional5 = (j$.util.Optional) obj;
                return optional5.isPresent() ? ((oul) optional5.orElseThrow()).b() : ((pqm) ((wjc) this.a).i).h();
            case 12:
                return ((pqm) this.a).b();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                akzx akzxVar = (akzx) obj;
                java.lang.Object obj11 = this.a;
                qat qatVar = new qat(obj11, akzxVar, 3, (byte[]) null);
                qbl qblVar = (qbl) obj11;
                ajct ajctVar = qblVar.b;
                qbe qbeVar = qblVar.d;
                ajcq ajcqVarF = ahvr.F(new defpackage.omj(qbeVar, 18), qbeVar.c);
                j$.util.Objects.requireNonNull(akzxVar);
                return ahvr.ak(new ajcq[]{ahrv.g(ahvr.G(qatVar, ajctVar)).e(java.lang.SecurityException.class, new pqn(4), ajbm.a), ahvr.H(ajcqVarF, new phr(akzxVar, 12), ajctVar)}).o(new defpackage.omj(akzxVar, i), qblVar.c);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                qdo qdoVar = (qdo) this.a;
                return qdoVar.f.isEmpty() ? qdoVar.a() : ajcm.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return ((java.lang.Boolean) obj).booleanValue() ? ((qdo) this.a).b() : ajcm.a;
            case 16:
                qdv qdvVar = (qdv) obj;
                qdu qduVar = (qdu) this.a;
                if (!qduVar.l.h()) {
                    return ajcm.a;
                }
                if (qdvVar.c) {
                    java.util.function.Supplier supplier = qduVar.f;
                    if (!((android.os.PowerManager.WakeLock) aa$.ExternalSyntheticApiModelOutline1.m(supplier)).isHeld()) {
                        qdu.a.b().l("com/android/dialer/incall/proximitysensor/impl/incall/InCallProximityController", "turnOnProximitySensor", 117, "InCallProximityController.java").v("acquiring wake lock");
                        zjv.i(qduVar.d, mgv.dU, (java.util.List) null, (mhc) null, 0, 30);
                        ((android.os.PowerManager.WakeLock) aa$.ExternalSyntheticApiModelOutline1.m(supplier)).acquire();
                        qduVar.a(qbc.dA);
                        qed qedVar = qduVar.e;
                        qedVar.m.i(ahvr.ag(qedVar.c, qedVar.l, new pbw(qedVar, (aoln) null, 6, (byte[]) null)));
                    }
                } else {
                    qduVar.b(qdvVar.d);
                }
                return qdvVar.e ? qduVar.c.b() : qduVar.c.a();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return ((defpackage.iax) this.a).e(j$.time.Duration.ofMillis(200L));
                }
                qeg.a.b().l("com/android/dialer/incall/rtt/audiodetector/impl/AudioDetector", "listenToCallAudio", 142, "AudioDetector.java").v("Doesn't have microphone permission for audio recording");
                return aiql.z(j$.util.Optional.empty());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                j$.util.Optional optional6 = (j$.util.Optional) obj;
                if (optional6.isPresent()) {
                    return ((qeg) this.a).c((defpackage.iax) optional6.orElseThrow());
                }
                a.bI(qeg.a.d(), "callAudio is not found", "com/android/dialer/incall/rtt/audiodetector/impl/AudioDetector", "beginDetectingAudio", (char) 127, "AudioDetector.java", zct.b);
                return ajcm.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                j$.util.Optional optional7 = (j$.util.Optional) obj;
                if (optional7.isPresent()) {
                    return ((qfa) this.a).d.e((java.lang.String) optional7.orElseThrow());
                }
                return ajcm.a;
            default:
                qfg qfgVar = ((qfa) this.a).d;
                if (qfgVar.b.isEmpty()) {
                    qfg.a.b().l("com/android/dialer/incall/rtt/service/RttCallMessagesCache", "saveTranscript", 206, "RttCallMessagesCache.java").v("Transcript not saved. No messages available.");
                    return ajcm.a;
                }
                ajcq ajcqVarC = ((defpackage.qff) aooc.ar(qfgVar.k.Y(), defpackage.qff.class)).C();
                phr phrVar = new phr(qfgVar, 19);
                ajct ajctVar2 = qfgVar.d;
                return ahrv.g(ahvr.H(ajcqVarC, phrVar, ajctVar2)).i(new qfc(qfgVar, 5), ajctVar2);
        }
    }
}
