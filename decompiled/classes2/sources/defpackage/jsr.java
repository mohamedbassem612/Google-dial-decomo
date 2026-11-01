package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jsr implements ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ jsr(j$.util.Optional optional, amzg amzgVar, ajct ajctVar, int i) {
        this.$cid = i;
        this.c = optional;
        this.b = amzgVar;
        this.a = ajctVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v126, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v128, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v143, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v31, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v111, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v61, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v70, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v8, types: [ajct, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v91, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v93, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v95, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v99, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v1, types: [hxa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v42, types: [amzg, java.lang.Object] */
    public final ajcq a() {
        ajcq ajcqVarZ;
        java.lang.Object obj;
        ajcq ajcqVarI;
        defpackage.oqk oqkVar;
        int i = 18;
        int i2 = 15;
        int i3 = 0;
        int i4 = 5;
        byte[] bArr = null;
        int i5 = 1;
        switch (this.$cid) {
            case 0:
                boolean z = ((jsq) aiql.H((java.util.concurrent.Future) this.b)).c;
                boolean zBooleanValue = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.c)).booleanValue();
                if (zBooleanValue == z) {
                    return aiql.z(java.lang.Boolean.FALSE);
                }
                java.lang.Object obj2 = this.a;
                jst.a.b().l("com/android/dialer/calleridfeedback/impl/eligibilitylookup/CrowdsourceEligibilityPhoneLookupContributor", "isDirty", 116, "CrowdsourceEligibilityPhoneLookupContributor.java").L("Caller ID previous setting:%s current setting:%s", z, zBooleanValue);
                jst jstVar = (jst) obj2;
                return ahrv.g(jstVar.f.bl(new defpackage.ook(zBooleanValue, 1))).h(new defpackage.exn(i), jstVar.b);
            case 1:
                return ((defpackage.hzb) this.b).a(this.a, this.c);
            case 2:
                j$.util.Optional optional = (j$.util.Optional) aiql.H((java.util.concurrent.Future) this.b);
                aigf aigfVar = (aigf) aiql.H((java.util.concurrent.Future) this.c);
                if (!optional.isPresent() || ((zah) optional.orElseThrow()).b.isEmpty()) {
                    return aiql.z(j$.util.Optional.empty());
                }
                if (aigfVar.isEmpty()) {
                    return aiql.z(optional);
                }
                aift aiftVar = new aift(4);
                java.util.Iterator it = ((zah) optional.orElseThrow()).b.iterator();
                while (true) {
                    java.lang.Object obj3 = this.a;
                    if (!it.hasNext()) {
                        aify aifyVarH = aiftVar.h();
                        return ahvr.aj(aifyVarH).o(new defpackage.hkx(aifyVarH, 17), ((jvs) obj3).c);
                    }
                    zai zaiVar = (zai) it.next();
                    j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable((acuh) aigfVar.get(zaiVar.g));
                    if (!optionalOfNullable.isPresent() || zaiVar.g.isEmpty()) {
                        ajcqVarZ = aiql.z(zaiVar);
                    } else {
                        jvs jvsVar = (jvs) obj3;
                        ajcqVarZ = ahvr.H(jvsVar.e.a(android.net.Uri.parse(((acuh) optionalOfNullable.orElseThrow()).d)), new defpackage.jss(zaiVar, i4), jvsVar.d);
                    }
                    aiftVar.i(ajcqVarZ);
                }
                break;
            case 3:
                java.lang.Integer num = (java.lang.Integer) aiql.H((java.util.concurrent.Future) this.b);
                num.intValue();
                j$.util.Optional optionalOf = j$.util.Optional.of(num);
                defpackage.kxr kxrVar = (defpackage.kxr) this.a;
                defpackage.kww kwwVar = kxrVar.b;
                kwwVar.i = optionalOf;
                java.lang.Integer num2 = (java.lang.Integer) aiql.H((java.util.concurrent.Future) this.c);
                num2.intValue();
                kwwVar.j = j$.util.Optional.of(num2);
                kwt kwtVar = kxrVar.e;
                j$.util.Optional optionalA = kwtVar.a();
                j$.util.Objects.requireNonNull(kwtVar);
                kwwVar.h = j$.util.Optional.of(((java.util.Locale) (true != optionalA.isPresent() ? ((kwt) new defpackage.idb(kwtVar, i4).a).b() : optionalA.get())).toLanguageTag());
                return ajcm.a;
            case 4:
                return !((java.lang.Boolean) ((j$.util.Optional) this.c).orElse(java.lang.Boolean.FALSE)).booleanValue() ? aiql.z(j$.util.Optional.empty()) : ahvr.H(this.b.d(), new defpackage.kwz(15), (java.util.concurrent.Executor) this.a);
            case 5:
                j$.util.Optional optional2 = (j$.util.Optional) aiql.H((java.util.concurrent.Future) this.b);
                defpackage.lcm lcmVar = (defpackage.lcm) aiql.H((java.util.concurrent.Future) this.c);
                defpackage.lcq lcqVar = ((defpackage.lcl) this.a).e;
                aigf aigfVar2 = defpackage.lcq.a;
                aoin aoinVar = lcqVar.c;
                if (!aigfVar2.containsKey(aoinVar.a())) {
                    return aiql.y(new java.lang.IllegalStateException(java.lang.String.format("flag domain: %s not found", aoinVar.a())));
                }
                java.lang.String str = (java.lang.String) aigfVar2.get(aoinVar.a());
                akzx akzxVarM = ahwh.a.m();
                java.lang.String str2 = lcmVar.c;
                akzxVarM.u();
                ahwh ahwhVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(str2);
                ahwhVar.b |= 4;
                ahwhVar.e = str2;
                akzxVarM.u();
                ahwh ahwhVar2 = akzxVarM.b;
                j$.util.Objects.requireNonNull(lcmVar);
                ahwhVar2.g = lcmVar;
                ahwhVar2.b |= 32;
                return ahrv.g(ahvr.F(new defpackage.gzk(optional2, akzxVarM, 19, bArr), lcqVar.d)).i(new defpackage.juo((java.lang.Object) lcqVar, (java.lang.Object) str, (java.lang.Object) lcmVar, 9, (byte[]) null), lcqVar.e).h(new defpackage.lbs(13), lcqVar.f);
            case 6:
                defpackage.lev levVar = (defpackage.lev) this.a;
                if (!((java.lang.Boolean) levVar.l.a()).booleanValue() && aiql.H((java.util.concurrent.Future) this.b) == defpackage.lgj.a) {
                    return ajcm.a;
                }
                j$.util.Optional optional3 = (j$.util.Optional) aiql.H((java.util.concurrent.Future) this.c);
                if (!optional3.isPresent()) {
                    return ajcm.a;
                }
                if (((android.telecom.DisconnectCause) optional3.orElseThrow()).getCode() != 2) {
                    return ((android.telecom.DisconnectCause) optional3.orElseThrow()).getCode() == 3 ? levVar.i.c(defpackage.lgq.a) : levVar.i.c(defpackage.lgq.e);
                }
                defpackage.lev.a.b().l("com/android/dialer/callscreen/impl/service/CallScreenController", "stopListeningOnDisconnectedCall", 300, "CallScreenController.java").v("we hung up, stop listening silently.");
                return levVar.i.c(defpackage.lgq.c);
            case 7:
                ?? r1 = this.c;
                java.lang.Object obj4 = this.b;
                java.lang.Object obj5 = this.a;
                ahoq ahoqVarW = ahvr.W(284, "CallScreenSession_avatarSessionManager");
                try {
                    defpackage.lgg.a.b().l("com/android/dialer/callscreen/impl/service/CallScreenSession", "<init>", 114, "CallScreenSession.java").v("callAvatarSessionManagerOnce started");
                    ajcq ajcqVarI2 = ahvr.I(ahvr.H(((ljf) obj4).a(), new defpackage.lgd(obj4, 12), ajbm.a), new defpackage.ldp(obj5, i2), (java.util.concurrent.Executor) r1);
                    ahoqVarW.a(ajcqVarI2);
                    ahoqVarW.close();
                    return ajcqVarI2;
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarW.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case 8:
                defpackage.lgp lgpVar = (defpackage.lgp) ((j$.util.Optional) aiql.H((java.util.concurrent.Future) this.b)).orElse(defpackage.lgp.a);
                defpackage.lkb lkbVar = (defpackage.lkb) aiql.H((java.util.concurrent.Future) this.c);
                defpackage.lgv lgvVar = (defpackage.lgv) this.a;
                defpackage.lju ljuVar = lgvVar.l;
                if (!((java.lang.Boolean) ljuVar.d.a()).booleanValue()) {
                    defpackage.lju.a.b().l("com/android/dialer/callscreen/impl/storage/TranscriptSaver", "saveTranscriptWithFeedbackData", 124, "TranscriptSaver.java").v("storing transcript is skipped as the flag is not enabled");
                    return ajcm.a;
                }
                java.lang.String str3 = lgvVar.d;
                long j = lgvVar.s;
                pgi pgiVar = ljuVar.g;
                ahrv ahrvVarG = ahrv.g(ahvr.F(new vgq(pgiVar, j, lkbVar, 1), (java.util.concurrent.Executor) pgiVar.b));
                lix lixVar = new lix(5);
                ajct ajctVar = ljuVar.b;
                return ahrvVarG.e(java.io.IOException.class, lixVar, ajctVar).i(new defpackage.acyl(ljuVar, j, lgpVar, lkbVar, str3, 1), ajctVar).h(new defpackage.lgd(ljuVar, i), ajctVar);
            case 9:
                ?? r2 = this.c;
                java.lang.Object obj6 = this.b;
                defpackage.mjm mjmVar = (defpackage.mjm) this.a;
                return mjmVar.f.g(new defpackage.hsl(mjmVar, (java.util.Set) r2, (aify) obj6, 10), mjmVar.b);
            case 10:
                return ((defpackage.nzg) this.b).d.F(new ufj(this.c, (alad) this.a, 1));
            case 11:
                j$.util.Optional optionalOfNullable2 = (j$.util.Optional) aiql.H((java.util.concurrent.Future) this.b);
                vzl vzlVar = new vzl(this.a, ((java.lang.Long) aiql.H((java.util.concurrent.Future) this.c)).longValue(), 1);
                if (true == optionalOfNullable2.isPresent()) {
                    java.lang.Object obj7 = optionalOfNullable2.get();
                    java.lang.Object obj8 = vzlVar.b;
                    long j2 = vzlVar.a;
                    java.lang.Integer num3 = (java.lang.Integer) obj7;
                    if (num3.intValue() == j2) {
                        nzh.a.b().l("com/android/dialer/eligibilityexpansion/EligibilityExpansionDatabaseWorker", "syncDatabase", 82, "EligibilityExpansionDatabaseWorker.java").x("database has latest version: %d", j2);
                        ajcqVarI = ajcm.a;
                    } else {
                        nzh nzhVar = (nzh) obj8;
                        defpackage.nzm nzmVar = nzhVar.d;
                        aoin aoinVar2 = nzmVar.e;
                        acvm acvmVarA = acvn.a();
                        acvmVarA.b((java.lang.String) aoinVar2.a());
                        ajcqVarI = ahvr.I(ahvr.I(nzmVar.f.G(acvmVarA.a()), new defpackage.ocj(nzmVar, i5), nzmVar.c), new defpackage.ljp(obj8, num3, 14), nzhVar.b);
                    }
                    optionalOfNullable2 = j$.util.Optional.ofNullable(ajcqVarI);
                }
                if (true != optionalOfNullable2.isPresent()) {
                    a.bI(nzh.a.d(), "no mdd data downloaded", "com/android/dialer/eligibilityexpansion/EligibilityExpansionDatabaseWorker", "syncDatabase", 'k', "EligibilityExpansionDatabaseWorker.java", zct.b);
                    obj = ajcm.a;
                } else {
                    obj = optionalOfNullable2.get();
                }
                return (ajcq) obj;
            case 12:
                j$.util.Optional optional4 = (j$.util.Optional) aiql.H((java.util.concurrent.Future) this.b);
                j$.util.Optional optional5 = (j$.util.Optional) aiql.H((java.util.concurrent.Future) this.c);
                if (!optional4.isPresent() || !optional5.isPresent()) {
                    return ajcm.a;
                }
                defpackage.oql oqlVar = (defpackage.oql) optional4.orElseThrow();
                com.google.android.libraries.surveys.SurveyData surveyData = (com.google.android.libraries.surveys.SurveyData) optional5.orElseThrow();
                aify aifyVarB = oqlVar.b();
                aift aiftVar2 = new aift(4);
                java.util.ArrayList arrayList = new java.util.ArrayList((java.util.Collection) aifyVarB);
                arrayList.add(defpackage.oqu.DIALER_HATS_PSD_DEFAULT);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                int size = arrayList.size();
                while (true) {
                    java.lang.Object obj9 = this.a;
                    if (i3 >= size) {
                        oqi oqiVar = (oqi) obj9;
                        ahvr.J(ahvr.aj(arrayList2).o(new defpackage.lly(arrayList2, aiftVar2, i2, bArr), oqiVar.d), new defpackage.afjo(oqiVar, surveyData, oqlVar, 1), oqiVar.e);
                        return ajcm.a;
                    }
                    aoin aoinVar3 = (aoin) ((oqi) obj9).n.k().get((defpackage.oqu) arrayList.get(i3));
                    if (aoinVar3 != null && (oqkVar = (defpackage.oqk) aoinVar3.a()) != null) {
                        arrayList2.add(oqkVar.a());
                    }
                    i3++;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aify aifyVar = pzq.a;
                java.lang.Object obj10 = this.a;
                boolean zContains = aifyVar.contains(obj10);
                java.lang.Object obj11 = this.b;
                if (!zContains && !pzq.a((pzp) obj10)) {
                    ((pzt) obj11).c.t = j$.util.Optional.empty();
                }
                pzt pztVar = (pzt) obj11;
                if (!pztVar.d.isPresent()) {
                    pztVar.d = j$.util.Optional.of(obj10);
                    if (!pzq.a((pzp) obj10)) {
                        j$.util.Optional optional6 = (j$.util.Optional) this.c;
                        if (!optional6.isPresent()) {
                            return ajcm.a;
                        }
                        pztVar.e.c(qbc.hl);
                        return pztVar.f.i(((java.lang.Long) optional6.orElseThrow()).longValue(), defpackage.jxn.n);
                    }
                }
                return ajcm.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return aosv.F((aoss) this.c, 0, new defpackage.ohh((amzg) this.a, (amzg) this.b, (aoln) null, 16), 3);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return ahvr.F(new qfb(this.c, this.a, 8, (byte[]) null), (java.util.concurrent.Executor) this.b);
            case 16:
                ajcq ajcqVarD = this.b.d();
                ?? r3 = this.a;
                return ahvr.I(ajcqVarD, new phd(this.c, (java.lang.Object) r3, 20, (byte[]) null), (java.util.concurrent.Executor) r3);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                java.lang.String str4 = (java.lang.String) ((j$.util.Optional) aiql.H((java.util.concurrent.Future) this.b)).orElse((java.lang.Object) null);
                int iP = rsr.p((zna) aiql.H((java.util.concurrent.Future) this.c));
                szs szsVar = (szs) this.a;
                j$.util.Optional optionalOfNullable3 = szsVar.y;
                if (true == optionalOfNullable3.isPresent()) {
                    optionalOfNullable3 = j$.util.Optional.ofNullable(((tan) optionalOfNullable3.get()).d);
                }
                return szsVar.n.d(szsVar.k, str4, iP, optionalOfNullable3);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((tzv) this.a).d(aify.q(this.b, this.c));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                j$.util.Optional optional7 = (j$.util.Optional) aiql.H((java.util.concurrent.Future) this.b);
                j$.util.Optional optional8 = (j$.util.Optional) aiql.H((java.util.concurrent.Future) this.c);
                if (!optional7.isPresent() || (optional8.isPresent() && ((java.lang.Integer) optional8.orElseThrow()).intValue() >= ((java.lang.Integer) optional7.orElseThrow()).intValue())) {
                    return ajcm.a;
                }
                java.lang.Object obj12 = this.a;
                int iIntValue = ((java.lang.Integer) optional7.orElseThrow()).intValue();
                utf.a.b().l("com/android/dialer/timekeeper/impl/mdd/TimeKeeperDataRepository", "refreshDatabaseInternal", 118, "TimeKeeperDataRepository.java").v("start to refresh database");
                utf utfVar = (utf) obj12;
                return ahrv.g(ahrv.g(utfVar.a()).i(new udu(obj12, 11), utfVar.c)).i(new defpackage.lhb(obj12, iIntValue, 6), utfVar.b);
            default:
                uzn uznVar = ((uzo) this.a).c;
                if (uznVar == null) {
                    uznVar = uzn.a;
                }
                return ((vav) this.b).d.h(vav.i(uznVar.f), 1, (android.app.Notification) aiql.H((java.util.concurrent.Future) this.c));
        }
    }

    public /* synthetic */ jsr(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ jsr(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ jsr(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ jsr(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }
}
