package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jss implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ jss(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v50, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v53, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v60, types: [java.lang.Object, java.util.List] */
    public final java.lang.Object apply(java.lang.Object obj) {
        int i = 2;
        switch (this.$cid) {
            case 0:
                return java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue() && ((jst) this.a).e.g().isPresent());
            case 1:
                zag zagVar = (zag) obj;
                akzx akzxVarM = spf.a.m();
                akzxVarM.u();
                spf spfVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(zagVar);
                spfVar.d = zagVar;
                spfVar.b |= 2;
                boolean z = ((defpackage.hkd) this.a).g;
                akzxVarM.u();
                spf spfVar2 = akzxVarM.b;
                spfVar2.b |= 1;
                spfVar2.c = z;
                return akzxVarM.p();
            case 2:
                return java.lang.Boolean.valueOf(j$.util.Collection.-EL.stream(((defpackage.jtz) obj).b).anyMatch(new defpackage.jty(this.a, 3)));
            case 3:
                ((kjr) ((defpackage.jyn) this.a).c).a();
                return null;
            case 4:
                defpackage.jvd.a.c().i(zct.b).k((java.lang.IllegalStateException) obj).l("com/android/dialer/calleridfeedback/impl/ui/callertagselector/CallerTagSelectorDataService", "reportSelectedCallerTag", 198, "CallerTagSelectorDataService.java").y("Problem saving positive feedback for tag: %s", this.a);
                return null;
            case 5:
                j$.util.Optional optional = (j$.util.Optional) obj;
                boolean zIsPresent = optional.isPresent();
                java.lang.Object obj2 = this.a;
                if (!zIsPresent) {
                    return obj2;
                }
                akzx akzxVarP = ((alad) obj2).p();
                java.lang.String string = ((java.io.File) optional.orElseThrow()).toURI().toString();
                akzxVarP.u();
                zai zaiVar = akzxVarP.b;
                j$.util.Objects.requireNonNull(string);
                zaiVar.h = string;
                return akzxVarP.p();
            case 6:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                java.lang.Object obj3 = this.a;
                if (optional2 == null || !optional2.isPresent()) {
                    a.bt(jvv.a.c().m(aioa.b), "Missing CallerTagConfig when requesting: %s", obj3, "com/android/dialer/callertags/impl/CallerTagsImpl", "getTagConfig", (char) 197, "CallerTagsImpl.java", zct.b);
                    return j$.util.Optional.empty();
                }
                aigf aigfVar = (aigf) optional2.orElseThrow();
                zai zaiVar2 = zai.a;
                zai zaiVar3 = (zai) aigfVar.getOrDefault(obj3, zaiVar2);
                if (zaiVar3 != null && !zaiVar2.equals(zaiVar3)) {
                    return j$.util.Optional.of(zaiVar3);
                }
                a.bt(jvv.a.d(), "Missing caller tag: %s", obj3, "com/android/dialer/callertags/impl/CallerTagsImpl", "getTagConfig", (char) 204, "CallerTagsImpl.java", zct.b);
                return j$.util.Optional.empty();
            case 7:
                akzx akzxVarM2 = zag.a.m();
                if (((java.lang.Boolean) obj).booleanValue()) {
                    java.lang.String languageTag = ((java.util.Locale) this.a).toLanguageTag();
                    akzxVarM2.u();
                    zag zagVar2 = akzxVarM2.b;
                    j$.util.Objects.requireNonNull(languageTag);
                    zagVar2.b |= 2;
                    zagVar2.d = languageTag;
                }
                return akzxVarM2.p();
            case 8:
                j$.util.Optional optional3 = (j$.util.Optional) obj;
                return java.lang.Boolean.valueOf(optional3 != null && optional3.isPresent() && j$.util.Collection.-EL.stream(((aigf) optional3.orElseThrow()).c()).anyMatch(new defpackage.jty(this.a, 4)));
            case 9:
                ((defpackage.jwd) ((defpackage.jwb) this.a).a).h.a();
                return null;
            case 10:
                xbb xbbVar = (xbb) this.a;
                java.lang.Object obj4 = xbbVar.b;
                long j = xbbVar.a;
                ampl amplVar = (ampl) obj;
                kgl kglVar = (kgl) obj4;
                agsm.i(180, ahvr.ak(new ajcq[]{kglVar.b(j)}).o(new defpackage.jww(obj4, j, i), (java.util.concurrent.Executor) kglVar.a), "failed to clear metrics for call created at %d", new java.lang.Object[]{java.lang.Long.valueOf(j)});
                return amplVar;
            case 11:
                if (!j$.util.Objects.equals((java.lang.Boolean) obj, java.lang.Boolean.TRUE)) {
                    return null;
                }
                ((jxe) this.a).o.i((java.lang.String) null).b(mce.eV);
                return null;
            case 12:
                ((jys) this.a).g.a(((java.lang.Integer) obj).intValue());
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                grn grnVar = kfu.a;
                return this.a.a(obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                if (((java.lang.Long) obj) == null) {
                    return null;
                }
                ((kjr) ((defpackage.hsj) this.a).g.a()).a();
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                defpackage.kue kueVar = (defpackage.kue) obj;
                android.os.Bundle bundle = new android.os.Bundle(kueVar.a);
                bundle.putString("com.google.android.ims.caller_source", "CARRIERSERVICES");
                bundle.putBoolean("is_spam_call", kueVar.d);
                defpackage.onb onbVar = (defpackage.onb) this.a;
                defpackage.kug kugVar = (defpackage.kug) onbVar.d;
                if (kugVar.d(bundle)) {
                    kugVar.b(bundle, kueVar.b, kueVar.c);
                    ((qbe) onbVar.c).a(qbc.di);
                }
                kugVar.i = false;
                return null;
            case 16:
                aigf aigfVar2 = (aigf) obj;
                for (java.util.Map.Entry entry : this.a) {
                    java.lang.Long asLong = ((android.content.ContentValues) entry.getValue()).getAsLong("timestamp");
                    if (asLong != null) {
                        kui kuiVar = (kui) aigfVar2.get(asLong);
                        if (kuiVar != null) {
                            ((android.content.ContentValues) entry.getValue()).put("call_recording_details", kuiVar.i());
                        } else {
                            ((android.content.ContentValues) entry.getValue()).put("call_recording_details", (byte[]) null);
                        }
                    }
                }
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                kwy kwyVar = (kwy) obj;
                alat alatVar = kwyVar.h;
                java.lang.Object obj5 = this.a;
                if (alatVar.contains(obj5)) {
                    return kwyVar;
                }
                akzx akzxVarP2 = kwyVar.p();
                akzxVarP2.u();
                kwy kwyVar2 = akzxVarP2.b;
                j$.util.Objects.requireNonNull(obj5);
                kwyVar2.b();
                kwyVar2.h.add(obj5);
                return akzxVarP2.p();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                akzx akzxVarP3 = ((kwy) obj).p();
                akzxVarP3.u();
                kwy kwyVar3 = akzxVarP3.b;
                kwyVar3.i = ((defpackage.kun) this.a).e;
                kwyVar3.b |= 32;
                return akzxVarP3.p();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                akzx akzxVarP4 = ((kwy) obj).p();
                akzxVarP4.u();
                kwy kwyVar4 = akzxVarP4.b;
                kwyVar4.d = ((defpackage.kwx) this.a).f;
                kwyVar4.b |= 2;
                return akzxVarP4.p();
            default:
                kwy kwyVar5 = (kwy) obj;
                aify aifyVar = (aify) j$.util.Collection.-EL.stream(kwyVar5.h).filter(new defpackage.jty(this.a, 8)).collect(aido.a);
                akzx akzxVarP5 = kwyVar5.p();
                akzxVarP5.u();
                akzxVarP5.b.h = albq.a;
                akzxVarP5.u();
                kwy kwyVar6 = akzxVarP5.b;
                kwyVar6.b();
                akyl.i(aifyVar, kwyVar6.h);
                return akzxVarP5.p();
        }
    }
}
