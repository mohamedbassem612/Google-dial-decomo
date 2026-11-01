package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class kxn implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ kxn(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        int i;
        int i2 = 6;
        int i3 = 8;
        switch (this.$cid) {
            case 0:
                defpackage.oii oiiVar = (defpackage.oii) obj;
                boolean zO = oiiVar.o();
                java.lang.Object obj2 = this.a;
                if (zO) {
                    oiiVar.j(new defpackage.khx(obj2, oiiVar, 7));
                    return null;
                }
                rai raiVar = ((defpackage.kxr) obj2).u;
                if (raiVar == null) {
                    return null;
                }
                raiVar.f();
                return null;
            case 1:
                defpackage.kxr kxrVar = (defpackage.kxr) this.a;
                kxrVar.n.b(mce.em);
                ((kjr) kxrVar.f.a()).a();
                return null;
            case 2:
                aimz aimzVar = defpackage.kxr.a;
                java.io.File file = new java.io.File(((defpackage.idv) obj).c);
                long length = file.length();
                int i4 = (int) length;
                if (length != i4) {
                    throw new java.lang.ArithmeticException();
                }
                ((java.util.concurrent.atomic.AtomicInteger) this.a).set(i4);
                return j$.util.Optional.of(file);
            case 3:
                defpackage.hzb hzbVar = (defpackage.hzb) ((j$.util.Optional) obj).orElse((java.lang.Object) null);
                if (hzbVar != null) {
                    return hzbVar;
                }
                ((defpackage.kxr) this.a).q.a(qbc.dc);
                throw new java.lang.IllegalStateException("no audio tee");
            case 4:
                defpackage.hxf hxfVar = (defpackage.hxf) obj;
                defpackage.kxx.a.b().l("com/android/dialer/callrecording/impl/service/CallRecordingButtonController", "onAutomaticRecordingStartDisclosurePlaybackStarted", 500, "CallRecordingButtonController.java").v("enter");
                ((defpackage.kxx) this.a).d();
                return hxfVar;
            case 5:
                return ((java.lang.Boolean) obj).booleanValue() ? ((defpackage.kzi) this.a).f() : j$.util.Optional.empty();
            case 6:
                ((kjr) ((lbl) this.a).d.a()).a();
                return null;
            case 7:
                j$.util.Optional optional = (j$.util.Optional) obj;
                akzx akzxVarM = defpackage.lcm.a.m();
                defpackage.lkq lkqVar = (defpackage.lkq) this.a;
                defpackage.lgp lgpVar = lkqVar.b;
                if (lgpVar != null) {
                    akzxVarM.u();
                    defpackage.lcm lcmVar = (defpackage.lcm) akzxVarM.b;
                    j$.util.Objects.requireNonNull(lgpVar);
                    lcmVar.d = lgpVar;
                    lcmVar.b |= 2;
                }
                defpackage.ljx ljxVar = lkqVar.g;
                if (ljxVar != null) {
                    defpackage.lka lkaVar = ljxVar.e;
                    if (lkaVar == null) {
                        lkaVar = defpackage.lka.a;
                    }
                    if (!lkaVar.c.isEmpty()) {
                        defpackage.lka lkaVar2 = lkqVar.g.e;
                        if (lkaVar2 == null) {
                            lkaVar2 = defpackage.lka.a;
                        }
                        java.lang.String str = lkaVar2.c;
                        akzxVarM.u();
                        defpackage.lcm lcmVar2 = (defpackage.lcm) akzxVarM.b;
                        j$.util.Objects.requireNonNull(str);
                        lcmVar2.b |= 1;
                        lcmVar2.c = str;
                    }
                }
                j$.util.Objects.requireNonNull(akzxVarM);
                defpackage.kwv kwvVar = new defpackage.kwv(akzxVarM, i2);
                if (true == optional.isPresent()) {
                    defpackage.lkb lkbVar = (defpackage.lkb) optional.get();
                    akzx akzxVar = (akzx) kwvVar.a;
                    akzxVar.u();
                    defpackage.lcm lcmVar3 = (defpackage.lcm) akzxVar.b;
                    j$.util.Objects.requireNonNull(lkbVar);
                    lcmVar3.e = lkbVar;
                    lcmVar3.b |= 4;
                }
                defpackage.ljx ljxVar2 = lkqVar.g;
                if (ljxVar2 != null) {
                    defpackage.ljy ljyVar = ljxVar2.c;
                    if (ljyVar == null) {
                        ljyVar = defpackage.ljy.a;
                    }
                    int iAP = a.aP(ljyVar.e);
                    i = iAP != 0 ? iAP : 1;
                    akzxVarM.u();
                    defpackage.lcm lcmVar4 = (defpackage.lcm) akzxVarM.b;
                    lcmVar4.f = i - 1;
                    lcmVar4.b |= 8;
                }
                return (defpackage.lcm) akzxVarM.p();
            case 8:
                return (aify) j$.util.Collection.-EL.stream((java.util.List) obj).filter(new defpackage.jvr(17)).map(new defpackage.jil(this.a, i3)).collect(aido.a);
            case 9:
                defpackage.lkq lkqVar2 = (defpackage.lkq) obj;
                akzx akzxVarM2 = uts.a.m();
                utw utwVar = utw.a;
                akzx akzxVarM3 = utwVar.m();
                java.lang.String str2 = (java.lang.String) this.a;
                java.lang.String strBS = afsq.bS(str2, "activated");
                akzxVarM3.u();
                utw utwVar2 = akzxVarM3.b;
                j$.util.Objects.requireNonNull(strBS);
                utwVar2.b |= 1;
                utwVar2.c = strBS;
                java.lang.String string = java.lang.Boolean.toString(lkqVar2 != null);
                akzxVarM3.u();
                utw utwVar3 = akzxVarM3.b;
                j$.util.Objects.requireNonNull(string);
                utwVar3.b |= 2;
                utwVar3.d = string;
                akzxVarM2.U(akzxVarM3.p());
                if (lkqVar2 != null) {
                    akzx akzxVarM4 = utwVar.m();
                    java.lang.String strBS2 = afsq.bS(str2, "upload_id");
                    akzxVarM4.u();
                    utw utwVar4 = akzxVarM4.b;
                    j$.util.Objects.requireNonNull(strBS2);
                    utwVar4.b |= 1;
                    utwVar4.c = strBS2;
                    defpackage.lka lkaVar3 = lkqVar2.g.e;
                    if (lkaVar3 == null) {
                        lkaVar3 = defpackage.lka.a;
                    }
                    java.lang.String str3 = lkaVar3.c;
                    akzxVarM4.u();
                    utw utwVar5 = akzxVarM4.b;
                    j$.util.Objects.requireNonNull(str3);
                    utwVar5.b |= 2;
                    utwVar5.d = str3;
                    akzxVarM2.U(akzxVarM4.p());
                    akzx akzxVarM5 = utwVar.m();
                    java.lang.String strBS3 = afsq.bS(str2, "disconnect_reason");
                    akzxVarM5.u();
                    utw utwVar6 = akzxVarM5.b;
                    j$.util.Objects.requireNonNull(strBS3);
                    utwVar6.b |= 1;
                    utwVar6.c = strBS3;
                    defpackage.lka lkaVar4 = lkqVar2.g.e;
                    if (lkaVar4 == null) {
                        lkaVar4 = defpackage.lka.a;
                    }
                    int iAd = a.ad(lkaVar4.d);
                    i = iAd != 0 ? iAd : 1;
                    akzxVarM5.u();
                    utw utwVar7 = akzxVarM5.b;
                    java.lang.String strP = a.P(i);
                    j$.util.Objects.requireNonNull(strP);
                    utwVar7.b |= 2;
                    utwVar7.d = strP;
                    akzxVarM2.U(akzxVarM5.p());
                }
                return akzxVarM2.p();
            case 10:
                defpackage.lkq lkqVar3 = (defpackage.lkq) obj;
                if (lkqVar3 == null || lkqVar3.c == null) {
                    defpackage.lcu.a.b().l("com/android/dialer/callscreen/impl/feedbackintegration/CallScreenFeedbackIntegration", "getAudioRecordingData", 150, "CallScreenFeedbackIntegration.java").v("transcript or audio recording path is null");
                    return aike.a;
                }
                java.lang.Object obj3 = this.a;
                akzx akzxVarM6 = utq.a.m();
                alcf alcfVarE = aldi.e(((utu) obj3).c);
                akzxVarM6.u();
                utq utqVar = akzxVarM6.b;
                j$.util.Objects.requireNonNull(alcfVarE);
                utqVar.c = alcfVarE;
                utqVar.b |= 1;
                java.lang.String str4 = lkqVar3.c;
                akzxVarM6.u();
                utq utqVar2 = akzxVarM6.b;
                j$.util.Objects.requireNonNull(str4);
                utqVar2.b |= 2;
                utqVar2.d = str4;
                akzxVarM6.u();
                utq utqVar3 = akzxVarM6.b;
                utqVar3.e = 2;
                utqVar3.b |= 4;
                return aify.p(akzxVarM6.p());
            case 11:
                defpackage.lkq lkqVar4 = (defpackage.lkq) obj;
                if (lkqVar4 == null || lkqVar4.b == null) {
                    defpackage.lcu.a.b().l("com/android/dialer/callscreen/impl/feedbackintegration/CallScreenFeedbackIntegration", "getTranscriptData", 86, "CallScreenFeedbackIntegration.java").v("transcript or conversation is null");
                    return aike.a;
                }
                aift aiftVar = new aift(4);
                for (defpackage.lgo lgoVar : lkqVar4.b.b) {
                    int iAN = a.aN(lgoVar.g);
                    if (iAN == 0) {
                        iAN = 1;
                    }
                    int i5 = iAN - 1;
                    if (i5 == 1) {
                        java.lang.Object obj4 = this.a;
                        akzx akzxVarM7 = uva.a.m();
                        alcf alcfVarE2 = aldi.e(lgoVar.c);
                        akzxVarM7.u();
                        uva uvaVar = akzxVarM7.b;
                        j$.util.Objects.requireNonNull(alcfVarE2);
                        uvaVar.e = alcfVarE2;
                        uvaVar.b |= 1;
                        akzx akzxVarM8 = uue.a.m();
                        java.lang.String str5 = lgoVar.e;
                        akzxVarM8.u();
                        uue uueVar = akzxVarM8.b;
                        j$.util.Objects.requireNonNull(str5);
                        uueVar.b |= 1;
                        uueVar.c = str5;
                        abwd abwdVar = ((utu) obj4).d;
                        if (abwdVar == null) {
                            abwdVar = abwd.a;
                        }
                        akzxVarM8.u();
                        uue uueVar2 = akzxVarM8.b;
                        j$.util.Objects.requireNonNull(abwdVar);
                        uueVar2.d = abwdVar;
                        uueVar2.b |= 2;
                        akzxVarM7.u();
                        uva uvaVar2 = akzxVarM7.b;
                        uue uueVarP = akzxVarM8.p();
                        j$.util.Objects.requireNonNull(uueVarP);
                        uvaVar2.d = uueVarP;
                        uvaVar2.c = 10;
                        aiftVar.i(akzxVarM7.p());
                    } else if (i5 == 2) {
                        akzx akzxVarM9 = uva.a.m();
                        alcf alcfVarE3 = aldi.e(lgoVar.c);
                        akzxVarM9.u();
                        uva uvaVar3 = akzxVarM9.b;
                        j$.util.Objects.requireNonNull(alcfVarE3);
                        uvaVar3.e = alcfVarE3;
                        uvaVar3.b |= 1;
                        akzx akzxVarM10 = uug.a.m();
                        java.lang.String str6 = lgoVar.e;
                        akzxVarM10.u();
                        uug uugVar = akzxVarM10.b;
                        j$.util.Objects.requireNonNull(str6);
                        uugVar.b |= 1;
                        uugVar.c = str6;
                        akzxVarM9.u();
                        uva uvaVar4 = akzxVarM9.b;
                        uug uugVarP = akzxVarM10.p();
                        j$.util.Objects.requireNonNull(uugVarP);
                        uvaVar4.d = uugVarP;
                        uvaVar4.c = 9;
                        aiftVar.i(akzxVarM9.p());
                    } else if (i5 == 3) {
                        akzx akzxVarM11 = uva.a.m();
                        alcf alcfVarE4 = aldi.e(lgoVar.c);
                        akzxVarM11.u();
                        uva uvaVar5 = akzxVarM11.b;
                        j$.util.Objects.requireNonNull(alcfVarE4);
                        uvaVar5.e = alcfVarE4;
                        uvaVar5.b |= 1;
                        akzx akzxVarM12 = uuf.a.m();
                        java.lang.String str7 = lgoVar.e;
                        akzxVarM12.u();
                        uuf uufVar = akzxVarM12.b;
                        j$.util.Objects.requireNonNull(str7);
                        uufVar.b |= 1;
                        uufVar.c = str7;
                        akzxVarM11.u();
                        uva uvaVar6 = akzxVarM11.b;
                        uuf uufVarP = akzxVarM12.p();
                        j$.util.Objects.requireNonNull(uufVarP);
                        uvaVar6.d = uufVarP;
                        uvaVar6.c = 11;
                        aiftVar.i(akzxVarM11.p());
                    }
                }
                return aiftVar.h();
            case 12:
                ((ldb) this.a).e.a();
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                if (!optional2.isPresent()) {
                    defpackage.lej.a.b().l("com/android/dialer/callscreen/impl/service/CachedVoicePackInterpreter", "loadAndCacheInterpreter", 120, "CachedVoicePackInterpreter.java").v("interpreter wasn't present");
                    return j$.util.Optional.empty();
                }
                java.lang.Object obj5 = this.a;
                pgi pgiVar = (pgi) optional2.orElseThrow();
                java.util.concurrent.atomic.AtomicReference atomicReference = ((defpackage.lej) obj5).f;
                if (!anty.aq(atomicReference, pgiVar)) {
                    defpackage.lej.a.b().l("com/android/dialer/callscreen/impl/service/CachedVoicePackInterpreter", "loadAndCacheInterpreter", 125, "CachedVoicePackInterpreter.java").y("another thread set interpreter first, dropping this one with voice: %s", ((pgi) optional2.orElseThrow()).A());
                }
                pgi pgiVar2 = (pgi) atomicReference.get();
                defpackage.lej.a.b().l("com/android/dialer/callscreen/impl/service/CachedVoicePackInterpreter", "loadAndCacheInterpreter", 131, "CachedVoicePackInterpreter.java").y("returning interpreter with voice: %s", pgiVar2.A());
                return j$.util.Optional.of(pgiVar2);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                defpackage.lem lemVar = (defpackage.lem) this.a;
                if (lemVar.f.orElseThrow() != zmw.b || !bool.booleanValue()) {
                    defpackage.lem.a.b().l("com/android/dialer/callscreen/impl/service/CallScreenAudioPreparer", "prepareCallAudioForListening", 75, "CallScreenAudioPreparer.java").v("not revelio on BT");
                    lemVar.c.e(zmw.a);
                    return null;
                }
                defpackage.lem.a.b().l("com/android/dialer/callscreen/impl/service/CallScreenAudioPreparer", "prepareCallAudioForListening", 70, "CallScreenAudioPreparer.java").v("revelio is on BT, need to mute the BT stream");
                lemVar.d.adjustStreamVolume(6, -100, 0);
                lemVar.g = true;
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                defpackage.lll lllVar = (defpackage.lll) obj;
                int iOrdinal = lllVar.ordinal();
                java.lang.Object obj6 = this.a;
                switch (iOrdinal) {
                    case 1:
                        ((defpackage.lev) obj6).w.a(qbc.f);
                        return null;
                    case 2:
                        ((defpackage.lev) obj6).w.a(qbc.g);
                        return null;
                    case 3:
                        ((defpackage.lev) obj6).w.a(qbc.i);
                        return null;
                    case 4:
                        ((defpackage.lev) obj6).w.a(qbc.h);
                        return null;
                    case 5:
                        ((defpackage.lev) obj6).w.a(qbc.e);
                        return null;
                    case 6:
                        ((defpackage.lev) obj6).w.a(qbc.j);
                        return null;
                    default:
                        throw new java.lang.IllegalArgumentException("Unsupported caller type: ".concat(java.lang.String.valueOf(lllVar.name())));
                }
            case 16:
                return defpackage.hhe.H((j$.util.Optional) obj, ((defpackage.llw) this.a).b);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return defpackage.hhe.H((j$.util.Optional) obj, ((defpackage.llw) this.a).b);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return defpackage.hhe.H((j$.util.Optional) obj, ((defpackage.llw) this.a).b);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return defpackage.hhe.H((j$.util.Optional) obj, ((defpackage.llw) this.a).b);
            default:
                return defpackage.hhe.H((j$.util.Optional) obj, ((defpackage.llw) this.a).b);
        }
    }
}
