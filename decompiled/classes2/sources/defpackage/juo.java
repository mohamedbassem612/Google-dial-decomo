package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class juo implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ juo(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v80, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v81, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kfj] */
    public final ajcq a(java.lang.Object obj) {
        ajcq ajcqVarH;
        int i = 3;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                defpackage.jyn jynVar = (defpackage.jyn) this.a;
                ((kjr) jynVar.c).a();
                java.lang.Object obj2 = jynVar.a;
                java.lang.Object obj3 = this.c;
                java.lang.Object obj4 = this.b;
                return ((defpackage.jtr) obj2).b.a(3, (defpackage.jrz) obj4, new defpackage.opo(obj2, obj4, obj3, 1, (byte[]) null));
            case 1:
                int iOrdinal = ((defpackage.hwz) obj).ordinal();
                java.lang.Object obj5 = this.a;
                if (iOrdinal == 1) {
                    defpackage.hzb hzbVar = (defpackage.hzb) obj5;
                    hzbVar.d(defpackage.hxb.a);
                    return aiql.z((defpackage.hxb) hzbVar.i.orElseThrow());
                }
                defpackage.hzb hzbVar2 = (defpackage.hzb) obj5;
                if (hzbVar2.i.isPresent()) {
                    defpackage.hzg hzgVar = hzbVar2.g;
                    lpb lpbVar = hzgVar.b;
                    lpb.b();
                    if (hzgVar.c.isEmpty()) {
                        return aiql.z((defpackage.hxb) hzbVar2.i.orElseThrow());
                    }
                }
                return ahvr.G(new defpackage.jsr(obj5, this.b, this.c, 1, (byte[]) null), ajbm.a);
            case 2:
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (optional != null && optional.isPresent()) {
                    z = true;
                }
                java.lang.Object obj6 = this.b;
                java.lang.Object obj7 = this.c;
                java.lang.Object obj8 = this.a;
                ahvr.bZ(z, "tag not found: ".concat(java.lang.String.valueOf(obj7)));
                defpackage.jrz jrzVar = (defpackage.jrz) obj6;
                defpackage.hkd hkdVar = jrzVar.c;
                if (hkdVar == null) {
                    hkdVar = defpackage.hkd.a;
                }
                jsk jskVar = ((defpackage.jvd) obj8).b;
                java.lang.String str = hkdVar.c;
                akzx akzxVarM = zhj.a.m();
                akzx akzxVarM2 = zag.a.m();
                zai zaiVar = (zai) optional.orElseThrow();
                akzxVarM2.u();
                zag zagVar = akzxVarM2.b;
                j$.util.Objects.requireNonNull(zaiVar);
                zagVar.c = zaiVar;
                zagVar.b |= 1;
                java.lang.String str2 = ((zai) optional.orElseThrow()).e;
                akzxVarM2.u();
                zag zagVar2 = akzxVarM2.b;
                j$.util.Objects.requireNonNull(str2);
                zagVar2.b |= 2;
                zagVar2.d = str2;
                akzxVarM.u();
                zhj zhjVar = akzxVarM.b;
                zag zagVarP = akzxVarM2.p();
                j$.util.Objects.requireNonNull(zagVarP);
                zhjVar.g = zagVarP;
                zhjVar.b |= 16;
                zhj zhjVarP = akzxVarM.p();
                akzx akzxVarM3 = jsm.a.m();
                long j = jrzVar.e;
                akzxVarM3.u();
                jsm jsmVar = akzxVarM3.b;
                jsmVar.b |= 1;
                jsmVar.c = j;
                return jskVar.d(str, zhjVarP, akzxVarM3.p());
            case 3:
                defpackage.jvd jvdVar = (defpackage.jvd) this.a;
                jvdVar.f.a();
                defpackage.jtr jtrVar = jvdVar.c;
                java.lang.Object obj9 = this.c;
                java.lang.Object obj10 = this.b;
                return jtrVar.b.a(5, (defpackage.jrz) obj10, new defpackage.ac((java.lang.Object) jtrVar, obj10, obj9, 20, (char[]) null));
            case 4:
                zai zaiVar2 = ((defpackage.jvm) obj).f;
                if (zaiVar2 == null) {
                    zaiVar2 = zai.a;
                }
                java.lang.Object obj11 = this.a;
                java.lang.Object obj12 = this.c;
                java.lang.Object obj13 = this.b;
                akzx akzxVar = (akzx) obj12;
                akzxVar.u();
                defpackage.jvm jvmVar = (defpackage.jvm) akzxVar.b;
                j$.util.Objects.requireNonNull(zaiVar2);
                jvmVar.f = zaiVar2;
                jvmVar.b |= 1;
                return ((jvv) ((defpackage.jve) obj13).c.g().orElseThrow()).b((aify) obj11);
            case 5:
                aify aifyVar = (aify) obj;
                if (!aifyVar.isEmpty()) {
                    akzx akzxVar2 = (akzx) this.c;
                    akzxVar2.u();
                    defpackage.jvm jvmVar2 = (defpackage.jvm) akzxVar2.b;
                    defpackage.jvm jvmVar3 = defpackage.jvm.a;
                    alat alatVar = jvmVar2.d;
                    if (!alatVar.c()) {
                        jvmVar2.d = alad.J(alatVar);
                    }
                    akyl.i(aifyVar, jvmVar2.d);
                }
                ?? r0 = this.a;
                java.lang.Object obj14 = this.b;
                int size = 30 - aifyVar.size();
                jvv jvvVar = (jvv) ((defpackage.jve) obj14).c.g().orElseThrow();
                ahzi ahziVar = jvvVar.d;
                aihd aihdVarO = aihd.o((java.util.Collection) r0);
                ahrv ahrvVarG = ahrv.g((ajcq) ahziVar.eZ());
                defpackage.idd iddVar = new defpackage.idd(jvvVar, aihdVarO, 18);
                ajct ajctVar = jvvVar.b;
                return ahrvVarG.i(iddVar, ajctVar).h(new tbc(size, 1), ajctVar);
            case 6:
                int i2 = ((java.util.concurrent.atomic.AtomicInteger) this.a).get();
                int i3 = ((java.util.concurrent.atomic.AtomicInteger) this.c).get();
                defpackage.kww kwwVar = ((defpackage.kxr) this.b).b;
                return kwwVar.m.g(new defpackage.mjj(kwwVar, i3, i2, 1), kwwVar.c);
            case 7:
                defpackage.hzb hzbVar3 = (defpackage.hzb) obj;
                defpackage.kxr.a.b().l("com/android/dialer/callrecording/impl/service/CallRecorder", "startRecording", 191, "CallRecorder.java").v("set state: recording");
                defpackage.kxr kxrVar = (defpackage.kxr) this.b;
                kxrVar.k.set(defpackage.kxq.c);
                kxrVar.o.a(ajcm.a);
                android.media.AudioFormat audioFormat = hzbVar3.b;
                ahvr.bM(audioFormat.getEncoding() == 2);
                ((java.util.concurrent.atomic.AtomicInteger) this.c).set(audioFormat.getSampleRate());
                defpackage.kww kwwVar2 = kxrVar.b;
                aazc aazcVar = kwwVar2.l;
                agsm.i(233, kwwVar2.m.g(new defpackage.jww(kwwVar2, android.os.SystemClock.elapsedRealtime(), i), kwwVar2.c), "logCallRecordingRunning failed", new java.lang.Object[0]);
                kxrVar.n.b(mce.ek);
                return hzbVar3.b(1000, new xbu(kxrVar, (akzb) this.a, 1), kxrVar.d);
            case 8:
                aigf aigfVar = (aigf) obj;
                aift aiftVar = new aift(4);
                ?? r7 = this.c;
                java.util.Iterator it = r7.iterator();
                while (true) {
                    java.lang.Object obj15 = this.a;
                    if (!it.hasNext()) {
                        return ahvr.H(ahvr.aj(aiftVar.h()).o(new defpackage.jse(8), ajbm.a), new icy((java.lang.Object) r7, aigfVar, this.b, 5, (short[]) null), ((lbu) obj15).a);
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    java.lang.String asString = ((android.content.ContentValues) entry.getValue()).getAsString("timestamp");
                    defpackage.lkq lkqVar = asString == null ? null : (defpackage.lkq) aigfVar.get(asString);
                    if (lkqVar == null) {
                        ajcqVarH = ajcm.a;
                    } else {
                        lbu lbuVar = (lbu) obj15;
                        ajcqVarH = ahvr.H(lbuVar.c(lkqVar), new icy(obj15, entry, lkqVar, 6), lbuVar.a);
                    }
                    aiftVar.i(ajcqVarH);
                }
                break;
            case 9:
                ammt ammtVarDG = ajsz.dG((java.lang.String) this.c, new ammp(), (amms) obj, new ammw(new vaa((short[]) null)));
                defpackage.lcq.b.b().i(zct.a).l("com/android/dialer/callscreen/impl/donation/scotty/CallScreenScottyUploadChannel", "upload", 119, "CallScreenScottyUploadChannel.java").y("Call Screen about to start Scotty end with upload id %s", ((defpackage.lcm) this.b).c);
                return ammtVarDG.a();
            case 10:
                java.lang.Object obj16 = this.a;
                acvi acviVarA = acvj.a();
                acux acuxVar = (acux) obj16;
                acviVarA.c(acuxVar.c);
                acuz acuzVar = acuxVar.g;
                if (acuzVar == null) {
                    acuzVar = acuz.a;
                }
                java.lang.Object obj17 = this.b;
                java.lang.Object obj18 = this.c;
                acviVarA.b(ahyn.h(acuzVar));
                ((j$.util.Optional) obj18).isPresent();
                acviVarA.a = ahwt.a;
                return ((defpackage.ldq) obj17).j.F(acviVarA.a());
            case 11:
                return ((defpackage.adnj) obj).h(((defpackage.lgg) this.b).f, (defpackage.adnw) this.a, (defpackage.adnw) this.c);
            case 12:
                if (!((defpackage.ljr) ((defpackage.ve) this.b).a).equals(defpackage.ljr.e)) {
                    j$.util.Optional optional2 = (j$.util.Optional) this.c;
                    if (optional2.isPresent()) {
                        ((defpackage.adnw) optional2.orElseThrow()).b.isPresent();
                        if (!((java.lang.String) ((defpackage.adnw) optional2.orElseThrow()).b.orElseThrow()).isEmpty()) {
                            defpackage.ljs ljsVar = (defpackage.ljs) this.a;
                            defpackage.adpe adpeVar = ljsVar.i;
                            if (adpeVar.h()) {
                                ljsVar.p.d(adpeVar.e());
                                return ljsVar.e((defpackage.adnw) optional2.orElseThrow());
                            }
                        }
                    }
                }
                return aiql.z(java.lang.Boolean.TRUE);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                acui acuiVar = (acui) obj;
                java.lang.Object obj19 = this.c;
                if (acuiVar != null) {
                    llz.a.b().l("com/android/dialer/callscreen/impl/tts/client/TtsRepository", "findBestClientFileGroup", 193, "TtsRepository.java").y("found ClientFileGroup for %s", obj19);
                    return aiql.z(j$.util.Optional.of(acuiVar));
                }
                java.lang.Object obj20 = this.a;
                java.lang.Object obj21 = this.b;
                aimz aimzVar = llz.a;
                aimzVar.b().l("com/android/dialer/callscreen/impl/tts/client/TtsRepository", "findBestClientFileGroup", 197, "TtsRepository.java").y("no ClientFileGroup for %s", obj19);
                akff akffVar = (akff) obj20;
                if (akffVar.q.equals(llz.b)) {
                    aimzVar.b().l("com/android/dialer/callscreen/impl/tts/client/TtsRepository", "findBestClientFileGroup", 201, "TtsRepository.java").v("replace en-IE with en-GB");
                    return ((llz) obj21).a(akff.e);
                }
                akff akffVar2 = akffVar.r;
                if (akffVar2 != null) {
                    return ((llz) obj21).a(akffVar2);
                }
                aimzVar.b().l("com/android/dialer/callscreen/impl/tts/client/TtsRepository", "findBestClientFileGroup", 207, "TtsRepository.java").y("%s has no parent, no ClientFileGroup found", obj20);
                return aiql.z(j$.util.Optional.empty());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                aigf aigfVar2 = (aigf) obj;
                long jLongValue = ((java.lang.Long) aiql.H((java.util.concurrent.Future) this.c)).longValue();
                if (!aigfVar2.isEmpty()) {
                    java.util.concurrent.atomic.AtomicLong atomicLong = ((ons) this.a).d;
                    atomicLong.set(jLongValue);
                    defpackage.omz omzVar = defpackage.omz.a;
                    ailj ailjVarK = aigfVar2.e().k();
                    while (ailjVarK.hasNext()) {
                        java.util.Map.Entry entry2 = (java.util.Map.Entry) ailjVarK.next();
                        long jLongValue2 = ((java.lang.Long) entry2.getKey()).longValue();
                        defpackage.onr onrVar = (defpackage.onr) entry2.getValue();
                        if (onrVar != null) {
                            defpackage.omz omzVar2 = onrVar.b;
                            if (!omzVar2.equals(omzVar)) {
                                ?? r8 = this.b;
                                android.content.ContentValues contentValues = new android.content.ContentValues();
                                contentValues.put("fides_details", omzVar2.i());
                                r8.d(jLongValue2, contentValues);
                            }
                            j$.util.concurrent.atomic.DesugarAtomicLong.getAndAccumulate(atomicLong, onrVar.a, new defpackage.kvc(4));
                        }
                    }
                }
                return ajcm.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return ((pgs) this.a).h.b((android.telecom.Call.Details) this.b, (ajcq) this.c);
            case 16:
                return ((phe) this.a).i.b((android.telecom.Call.Details) this.b, (ajcq) this.c);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    a.bI(qvx.a.c().m(aioa.b), "missing phone permission", "com/android/dialer/incall/voice/buttons/SwapSimButtonController", "swapSim", (char) 205, "SwapSimButtonController.java", zct.b);
                    return aiql.x();
                }
                java.lang.Object obj22 = this.b;
                java.lang.Object obj23 = this.c;
                java.lang.Object obj24 = this.a;
                qvx.a.b().l("com/android/dialer/incall/voice/buttons/SwapSimButtonController", "swapSim", 208, "SwapSimButtonController.java").v("call disconnected, redialing");
                ahrv ahrvVarG2 = ahrv.g(dff.m(new vus(obj24, obj22, obj23, 1)));
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
                ajcu ajcuVar = ((qvx) obj24).d;
                return ahrvVarG2.j(5000L, timeUnit, ajcuVar).e(java.util.concurrent.TimeoutException.class, new pqn(17), ajcuVar);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                svm svmVar = ((qvx) this.a).j;
                return ahvr.H((ajcq) svmVar.f.eZ(), new icy(svmVar, this.c, this.b, 11, (byte[]) null), svmVar.d);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                java.lang.Object obj25 = this.a;
                qvx qvxVar = (qvx) obj25;
                zrw zrwVar = qvxVar.f;
                return ahvr.I(aosv.F(zrwVar.d, 0, new zqs(zrwVar, (aoln) null, 10, (float[]) null), 3), new defpackage.juo(obj25, this.c, this.b, 17, (byte[]) null), qvxVar.d);
            default:
                sqi sqiVar = (sqi) this.a;
                sqn sqnVar = (sqn) obj;
                ajcq ajcqVarD = sqnVar.d(sqiVar.d, (android.telecom.Call.Details) this.b, (ajcq) this.c);
                soi soiVar = new soi(sqnVar, 4);
                ajct ajctVar2 = sqiVar.e;
                return ahvr.H(ahvr.B(ajcqVarD, java.lang.Throwable.class, soiVar, ajctVar2), new rht(5), ajctVar2);
        }
    }

    public /* synthetic */ juo(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ juo(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ juo(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }
}
