package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class idd implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ idd(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r13v43, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v37, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, rlv] */
    public final ajcq a(java.lang.Object obj) {
        java.lang.Object objZ;
        java.lang.Object objZ2;
        java.lang.Object objZ3;
        int i = 4;
        int i2 = 3;
        int i3 = 0;
        int i4 = 2;
        int i5 = 1;
        switch (this.$cid) {
            case 0:
                java.lang.Object obj2 = this.a;
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                defpackage.idc idcVar = new defpackage.idc(obj2, this.b, 2);
                if (true == optionalOfNullable.isPresent()) {
                    java.lang.Object obj3 = optionalOfNullable.get();
                    java.lang.Object obj4 = idcVar.a;
                    java.lang.Object obj5 = idcVar.b;
                    ((defpackage.idh) obj4).e.a(qbc.hs);
                    optionalOfNullable = j$.util.Optional.ofNullable(((defpackage.iax) obj3).d((j$.time.Duration) obj5));
                }
                defpackage.idb idbVar = new defpackage.idb(obj2, i);
                if (true != optionalOfNullable.isPresent()) {
                    ((defpackage.idh) idbVar.a).e.a(qbc.hr);
                    objZ = aiql.z(j$.util.Optional.empty());
                } else {
                    objZ = optionalOfNullable.get();
                }
                return (ajcq) objZ;
            case 1:
                java.lang.Object obj6 = this.a;
                j$.util.Optional optionalOfNullable2 = (j$.util.Optional) obj;
                defpackage.idc idcVar2 = new defpackage.idc(obj6, this.b, 0);
                if (true == optionalOfNullable2.isPresent()) {
                    java.lang.Object obj7 = optionalOfNullable2.get();
                    java.lang.Object obj8 = idcVar2.a;
                    java.lang.Object obj9 = idcVar2.b;
                    ((defpackage.idh) obj8).e.a(qbc.hs);
                    optionalOfNullable2 = j$.util.Optional.ofNullable(((defpackage.iax) obj7).e((j$.time.Duration) obj9));
                }
                defpackage.idb idbVar2 = new defpackage.idb(obj6, i4);
                if (true != optionalOfNullable2.isPresent()) {
                    ((defpackage.idh) idbVar2.a).e.a(qbc.hr);
                    objZ2 = aiql.z(j$.util.Optional.empty());
                } else {
                    objZ2 = optionalOfNullable2.get();
                }
                return (ajcq) objZ2;
            case 2:
                java.lang.Object obj10 = this.a;
                j$.util.Optional optionalOfNullable3 = (j$.util.Optional) obj;
                defpackage.idc idcVar3 = new defpackage.idc(obj10, this.b, 1);
                if (true == optionalOfNullable3.isPresent()) {
                    java.lang.Object obj11 = optionalOfNullable3.get();
                    java.lang.Object obj12 = idcVar3.a;
                    java.lang.Object obj13 = idcVar3.b;
                    ((defpackage.idh) obj12).e.a(qbc.hs);
                    optionalOfNullable3 = j$.util.Optional.ofNullable(((defpackage.iax) obj11).f((j$.time.Duration) obj13));
                }
                defpackage.idb idbVar3 = new defpackage.idb(obj10, i3);
                if (true != optionalOfNullable3.isPresent()) {
                    ((defpackage.idh) idbVar3.a).e.a(qbc.hr);
                    objZ3 = aiql.z(j$.util.Optional.empty());
                } else {
                    objZ3 = optionalOfNullable3.get();
                }
                return (ajcq) objZ3;
            case 3:
                ?? r13 = this.b;
                ((jna) this.a).c.j((ajcq) r13, (android.app.Notification) obj);
                return r13;
            case 4:
                android.speech.tts.TextToSpeech textToSpeech = (android.speech.tts.TextToSpeech) obj;
                defpackage.jny jnyVar = (defpackage.jny) this.b;
                if (jnyVar.g) {
                    defpackage.jny.a.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncer", "beginAnnouncement", 141, "CallAnnouncer.java").v("retrieved tts after announcement has been cancelled");
                    return ajcm.a;
                }
                defpackage.jnu jnuVar = (defpackage.jnu) this.a;
                textToSpeech.setAudioAttributes(jnuVar.c);
                jnyVar.e = j$.util.Optional.of(textToSpeech);
                return jnuVar.d.isPresent() ? jnyVar.f(jnuVar) : jnyVar.e(jnuVar);
            case 5:
                jsd jsdVar = new jsd(this.b, 0);
                jsk jskVar = (jsk) this.a;
                return jskVar.d.p(jskVar.g.bl(jsdVar));
            case 6:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return aiql.z(spf.a);
                }
                java.lang.Object obj14 = this.a;
                jst jstVar = (jst) this.b;
                return ahvr.H(((jvv) jstVar.e.g().orElseThrow()).a(), new defpackage.jss(obj14, i5), jstVar.b);
            case 7:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                defpackage.jtt.a.b().l("com/android/dialer/calleridfeedback/impl/logging/LoggingLimiter", "attemptAndRecordLog", 49, "LoggingLimiter.java").y("Feedback sent to server: %b", bool);
                return bool.booleanValue() ? ahvr.E((java.lang.Runnable) this.b, ((defpackage.jtt) this.a).b) : ajcm.a;
            case 8:
                defpackage.jrz jrzVar = (defpackage.jrz) this.a;
                return ((defpackage.jtp) ((defpackage.jyn) this.b).a).a(jrzVar, defpackage.jyn.d(jrzVar) ? defpackage.aixq.USER_CONFIRMED_BUSINESS_CNAP : defpackage.aixq.USER_CONFIRMED_BUSINESS);
            case 9:
                defpackage.jrz jrzVar2 = (defpackage.jrz) this.a;
                return ((defpackage.jtp) ((defpackage.jyn) this.b).a).a(jrzVar2, defpackage.jyn.d(jrzVar2) ? defpackage.aixq.USER_DENIED_BUSINESS_CNAP : defpackage.aixq.USER_DENIED_BUSINESS);
            case 10:
                defpackage.hwv hwvVar = (defpackage.hwv) this.b;
                hwvVar.e.o(rmx.es);
                ((kjr) hwvVar.c).a();
                return ((defpackage.jiv) hwvVar.a).a((defpackage.jrz) this.a, 3);
            case 11:
                defpackage.hwv hwvVar2 = (defpackage.hwv) this.b;
                hwvVar2.e.o(rmx.er);
                ((kjr) hwvVar2.c).a();
                return ((defpackage.jiv) hwvVar2.a).a((defpackage.jrz) this.a, 2);
            case 12:
                defpackage.hwv hwvVar3 = (defpackage.hwv) this.b;
                hwvVar3.e.o(rmx.eW);
                ((kjr) hwvVar3.c).a();
                return ((defpackage.jiv) hwvVar3.a).d((defpackage.jrz) this.a, 2);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.hwv hwvVar4 = (defpackage.hwv) this.b;
                hwvVar4.e.o(rmx.eX);
                ((kjr) hwvVar4.c).a();
                return ((defpackage.jiv) hwvVar4.a).d((defpackage.jrz) this.a, 3);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                java.lang.String str = ((zai) obj).b;
                java.lang.Object obj15 = this.b;
                defpackage.jvd jvdVar = (defpackage.jvd) obj15;
                zjm zjmVar = jvdVar.g;
                if (!zjmVar.g().isPresent()) {
                    a.bt(defpackage.jvd.a.c().m(aioa.b), "Tags unavailable when attempting to submit: %s", str, "com/android/dialer/calleridfeedback/impl/ui/callertagselector/CallerTagSelectorDataService", "reportSelectedCallerTag", (char) 155, "CallerTagSelectorDataService.java", zct.b);
                    return ajcm.a;
                }
                java.lang.Object obj16 = this.a;
                ahrv ahrvVarG = ahrv.g(((jvv) zjmVar.g().orElseThrow()).c(str));
                defpackage.juo juoVar = new defpackage.juo(obj15, (java.lang.Object) str, obj16, 2, (byte[]) null);
                ajct ajctVar = jvdVar.d;
                return ahrvVarG.i(juoVar, ajctVar).i(new defpackage.juo(obj15, obj16, str, i2), ajctVar).e(java.lang.IllegalStateException.class, new defpackage.jss(str, i), ajctVar);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                aify aifyVar = (aify) obj;
                if (!aifyVar.isEmpty()) {
                    ((akzx) this.b).B(aify.x(j$.util.Comparator.-CC.comparing(new defpackage.etw(8)), aifyVar));
                }
                jvv jvvVar = (jvv) ((defpackage.jve) this.a).c.g().orElseThrow();
                return ahrv.g((ajcq) jvvVar.e.eZ()).h(new defpackage.jvq(i), jvvVar.b);
            case 16:
                aify aifyVar2 = (aify) obj;
                boolean zIsEmpty = aifyVar2.isEmpty();
                java.lang.Object obj17 = this.b;
                if (!zIsEmpty) {
                    ((akzx) obj17).B(aify.x(j$.util.Comparator.-CC.comparing(new defpackage.etw(8)), aifyVar2));
                }
                java.lang.Object obj18 = this.a;
                long epochMilli = j$.time.Instant.now().toEpochMilli();
                akzx akzxVar = (akzx) obj17;
                akzxVar.u();
                defpackage.jvm jvmVar = (defpackage.jvm) akzxVar.b;
                defpackage.jvm jvmVar2 = defpackage.jvm.a;
                jvmVar.c = epochMilli;
                defpackage.jve jveVar = (defpackage.jve) obj18;
                return jveVar.d.p(jveVar.e.bl(new jsd(obj17, 6)));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                acui acuiVar = (acui) obj;
                java.lang.Object obj19 = this.b;
                if (acuiVar == null || acuiVar.h.isEmpty()) {
                    a.bt(jvs.a.b().m(aioa.b), "No file group for caller tags locale: %s", ((java.util.Locale) obj19).toLanguageTag(), "com/android/dialer/callertags/configprovider/mdd/MddCallerTagsConfigProvider", "getTagConfigs", (char) 150, "MddCallerTagsConfigProvider.java", zct.b);
                    return aiql.z(j$.util.Optional.empty());
                }
                j$.util.Optional optionalFindAny = j$.util.Collection.-EL.stream(acuiVar.h).filter(new defpackage.jvr(0)).findAny();
                if (optionalFindAny.isPresent()) {
                    java.lang.Object obj20 = this.a;
                    return ahvr.F(new defpackage.gzk(obj20, android.net.Uri.parse(((acuh) optionalFindAny.orElseThrow()).d), 7, null), ((jvs) obj20).d);
                }
                jvs.a.b().m(aioa.b).l("com/android/dialer/callertags/configprovider/mdd/MddCallerTagsConfigProvider", "getTagConfigs", 159, "MddCallerTagsConfigProvider.java").y("No proto file for caller tags locale: %s", ((java.util.Locale) obj19).toLanguageTag());
                return aiql.z(j$.util.Optional.empty());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                java.util.ArrayList arrayList = new java.util.ArrayList((java.util.Collection) ahvr.am(((aigf) ((j$.util.Optional) obj).orElse(aikj.b)).f(), (java.util.Set) this.b));
                java.util.Collections.shuffle(arrayList);
                return ((jvv) this.a).b(aify.n(arrayList));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                jxe jxeVar = (jxe) this.a;
                boolean z = !jxeVar.m.a().isEmpty();
                aift aiftVar = new aift(4);
                piw piwVar = new piw(jxeVar, z, aiftVar, (java.lang.Boolean) obj, 1);
                j$.util.Optional optional = (j$.util.Optional) this.b;
                if (true == optional.isPresent()) {
                    java.lang.Object obj21 = optional.get();
                    java.lang.Object obj22 = piwVar.b;
                    boolean z2 = piwVar.a;
                    java.lang.Object obj23 = piwVar.d;
                    java.lang.Object obj24 = piwVar.c;
                    if (z2) {
                        ((aift) obj23).i(((jxe) obj22).n.i(((java.lang.Long) obj21).longValue(), defpackage.jxn.q));
                    }
                    if (!((java.lang.Boolean) obj24).booleanValue()) {
                        jxe jxeVar2 = (jxe) obj22;
                        jxeVar2.l.o(rmx.sq);
                        ((aift) obj23).i(jxeVar2.n.i(((java.lang.Long) obj21).longValue(), defpackage.jxn.p));
                    }
                }
                return ahvr.aj(aiftVar.h()).o(new defpackage.jse(3), jxeVar.j);
            default:
                return ((defpackage.kvb) this.a).c.b((defpackage.kwx) this.b);
        }
    }

    public /* synthetic */ idd(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
