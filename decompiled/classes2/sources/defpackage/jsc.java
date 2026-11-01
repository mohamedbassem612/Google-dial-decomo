package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jsc implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ jsc(acwu acwuVar, acvj acvjVar, defpackage.dva dvaVar, dvr dvrVar, int i) {
        this.$cid = i;
        this.c = acwuVar;
        this.b = acvjVar;
        this.a = dvaVar;
        this.d = dvrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r14v86, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r15v103, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r15v46, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v54, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, vfj] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v13, types: [aczw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, yml] */
    public final ajcq a(java.lang.Object obj) {
        akzx akzxVarM;
        akzx akzxVarM2;
        switch (this.$cid) {
            case 0:
                akzx akzxVarP = ((spa) ((j$.util.Optional) obj).orElse(spa.a)).p();
                akzxVarP.u();
                spa spaVar = akzxVarP.b;
                java.lang.Object obj2 = this.b;
                j$.util.Objects.requireNonNull(obj2);
                spaVar.d = obj2;
                spaVar.c = 2;
                return ((jsk) this.a).e((java.lang.String) this.c, akzxVarP.p(), (jsm) this.d);
            case 1:
                akzx akzxVarP2 = ((spa) ((j$.util.Optional) obj).orElse(spa.a)).p();
                java.lang.Object obj3 = this.b;
                if (!((soz) obj3).c.isEmpty()) {
                    akzxVarP2.u();
                    spa spaVar2 = akzxVarP2.b;
                    j$.util.Objects.requireNonNull(obj3);
                    spaVar2.d = obj3;
                    spaVar2.c = 4;
                }
                return ((jsk) this.a).e((java.lang.String) this.c, akzxVarP2.p(), (jsm) this.d);
            case 2:
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (optional.isPresent() && ((spa) optional.orElseThrow()).c == 1) {
                    spa spaVar3 = (spa) optional.orElseThrow();
                    akzxVarM = (spaVar3.c == 1 ? (sox) spaVar3.d : sox.a).p();
                } else {
                    akzxVarM = sox.a.m();
                }
                java.lang.Object obj4 = this.b;
                if (j$.util.DesugarCollections.unmodifiableList(akzxVarM.b.c).contains(obj4)) {
                    return ajcm.a;
                }
                akzxVarM.u();
                sox soxVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(obj4);
                alat alatVar = soxVar.c;
                if (!alatVar.c()) {
                    soxVar.c = alad.J(alatVar);
                }
                java.lang.Object obj5 = this.d;
                java.lang.Object obj6 = this.c;
                java.lang.Object obj7 = this.a;
                soxVar.c.add(obj4);
                akzx akzxVarP3 = ((spa) optional.orElse(spa.a)).p();
                akzxVarP3.u();
                spa spaVar4 = akzxVarP3.b;
                sox soxVarP = akzxVarM.p();
                j$.util.Objects.requireNonNull(soxVarP);
                spaVar4.d = soxVarP;
                spaVar4.c = 1;
                return ((jsk) obj7).e((java.lang.String) obj6, akzxVarP3.p(), (jsm) obj5);
            case 3:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                if (optional2.isPresent() && ((spa) optional2.orElseThrow()).c == 1) {
                    spa spaVar5 = (spa) optional2.orElseThrow();
                    akzxVarM2 = (spaVar5.c == 1 ? (sox) spaVar5.d : sox.a).p();
                } else {
                    akzxVarM2 = sox.a.m();
                }
                java.lang.Object obj8 = this.b;
                if (j$.util.DesugarCollections.unmodifiableList(akzxVarM2.b.b).contains(obj8)) {
                    return ajcm.a;
                }
                java.lang.Object obj9 = this.d;
                java.lang.Object obj10 = this.c;
                java.lang.Object obj11 = this.a;
                akzxVarM2.N((java.lang.String) obj8);
                akzx akzxVarP4 = ((spa) optional2.orElse(spa.a)).p();
                akzxVarP4.u();
                spa spaVar6 = akzxVarP4.b;
                sox soxVarP2 = akzxVarM2.p();
                j$.util.Objects.requireNonNull(soxVarP2);
                spaVar6.d = soxVarP2;
                spaVar6.c = 1;
                return ((jsk) obj11).e((java.lang.String) obj10, akzxVarP4.p(), (jsm) obj9);
            case 4:
                java.lang.Object obj12 = this.c;
                java.lang.Object obj13 = this.d;
                defpackage.ljs ljsVar = (defpackage.ljs) obj13;
                ljsVar.l((j$.util.Optional) obj12);
                java.lang.Object obj14 = ljsVar.d;
                java.lang.Object obj15 = this.b;
                java.lang.Object obj16 = this.a;
                synchronized (obj14) {
                    if (((defpackage.ljs) obj13).a() == defpackage.ljr.b) {
                        ((defpackage.ljs) obj13).p.d(((defpackage.ljs) obj13).i.e());
                        if (((defpackage.ljr) ((defpackage.ve) obj16).a).equals(defpackage.ljr.e)) {
                            return ((defpackage.ljs) obj13).e((defpackage.adnw) obj15);
                        }
                    }
                    return aiql.z(java.lang.Boolean.TRUE);
                }
            case 5:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return aiql.z(spb.a);
                }
                java.lang.Object obj17 = this.c;
                java.lang.Object obj18 = this.d;
                java.lang.Object obj19 = this.a;
                java.lang.Object obj20 = this.b;
                sqe sqeVar = (sqe) obj20;
                ajcq ajcqVarA = sqeVar.c.a();
                phd phdVar = new phd(obj20, obj18, 12, (byte[]) null);
                ajct ajctVar = sqeVar.b;
                ajcq ajcqVarI = ahvr.I(ajcqVarA, phdVar, ajctVar);
                return ahvr.ak(new ajcq[]{ajcqVarI, obj17}).o(new joq(ajcqVarI, obj17, obj19, ((android.telecom.Call.Details) obj18).getCallerDisplayName(), 6), ajctVar);
            case 6:
                akzx akzxVarM3 = defpackage.idt.a.m();
                akzxVarM3.u();
                defpackage.idt idtVar = (defpackage.idt) akzxVarM3.b;
                java.lang.Object obj21 = this.c;
                j$.util.Objects.requireNonNull(obj21);
                idtVar.b |= 1;
                idtVar.e = (java.lang.String) obj21;
                akzx akzxVarP5 = ((alad) this.a).p();
                akzxVarP5.u();
                defpackage.ids idsVar = (defpackage.ids) akzxVarP5.b;
                idsVar.b |= 8;
                idsVar.f = true;
                akzxVarM3.u();
                defpackage.idt idtVar2 = (defpackage.idt) akzxVarM3.b;
                defpackage.ids idsVar2 = (defpackage.ids) akzxVarP5.p();
                j$.util.Objects.requireNonNull(idsVar2);
                idtVar2.d = idsVar2;
                idtVar2.c = 3;
                return ((uvb) this.b).a((utq) this.d, (defpackage.idt) akzxVarM3.p());
            case 7:
                return ((val) this.d).c.h(val.d((android.telecom.PhoneAccountHandle) this.a, ((java.lang.Boolean) this.c).booleanValue()), 1, ((defpackage.dva) aiql.H((java.util.concurrent.Future) this.b)).a());
            case 8:
                vcr vcrVar = (vcr) obj;
                return ahvr.H(this.c.h((android.telecom.PhoneAccountHandle) this.a, (vce) this.d, vcrVar), new van(vcrVar, 18), ((vea) this.b).d);
            case 9:
                defpackage.lda ldaVar = new defpackage.lda(this.a, this.d, this.c, (vcj) obj, 6);
                aogc aogcVar = (aogc) this.b;
                return ((afhf) aogcVar.c).a(ldaVar, (java.util.concurrent.Executor) aogcVar.b);
            case 10:
                return ((vgg) this.d).d((vgs) this.b, (android.telecom.PhoneAccountHandle) this.a, (aify) this.c);
            case 11:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                vgg.c.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmSyncService", "downloadAudioIfRequired", 626, "OmtpVvmSyncService.java").y("shouldDownloadAudio: %b", bool);
                if (!bool.booleanValue()) {
                    return ajcm.a;
                }
                java.lang.Object obj22 = this.a;
                java.lang.Object obj23 = this.b;
                ?? r2 = this.c;
                vgg vggVar = (vgg) this.d;
                return ahvr.ae((java.lang.Iterable) j$.util.Collection.-EL.stream((java.util.Collection) r2).map(new phs(vggVar, (vgs) obj23, (android.telecom.PhoneAccountHandle) obj22, 7)).collect(aido.a)).e(new defpackage.onq(17), vggVar.e);
            case 12:
                aify aifyVar = ((vfg) this.d).b;
                if (aifyVar.isEmpty()) {
                    return ajcm.a;
                }
                java.lang.Object obj24 = this.a;
                java.lang.Object obj25 = this.c;
                java.lang.Object obj26 = this.b;
                ahrv ahrvVarG = ahrv.g(((vgs) obj25).f(new vez(obj25, (aihd) j$.util.Collection.-EL.stream(aifyVar).map(new vga(0)).collect(aido.b), 9, (byte[]) null)).h());
                vge vgeVar = new vge(obj26, 0);
                ajct ajctVar2 = ((vgg) obj26).e;
                return ahrvVarG.i(vgeVar, ajctVar2).i(new ved(obj26, obj25, obj24, 15), ajctVar2);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return ((vgg) this.d).d((vgs) this.b, (android.telecom.PhoneAccountHandle) this.a, (aify) this.c);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                j$.util.stream.Stream map = j$.util.Collection.-EL.stream(((vfg) this.d).e).map(new var(20));
                j$.util.stream.Collector collector = aido.a;
                aify aifyVar2 = (aify) map.collect(collector);
                j$.util.stream.Stream stream = j$.util.Collection.-EL.stream(aifyVar2);
                java.lang.Object obj27 = this.b;
                java.lang.Object obj28 = this.c;
                vgg vggVar2 = (vgg) obj27;
                ahrv ahrvVarM = ahvr.M((java.lang.Iterable) stream.map(new phs(vggVar2, (vgs) obj28, (android.telecom.PhoneAccountHandle) this.a, 9)).collect(collector));
                vft vftVar = new vft(13);
                ajct ajctVar3 = vggVar2.e;
                return ahrvVarM.h(vftVar, ajctVar3).i(new vfv(obj28, aifyVar2, 7, (byte[]) null), ajctVar3);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                ymc ymcVar = (ymc) obj;
                return ymcVar.b.d(dff.m(new acxr((yna) this.b, ymcVar, (ymk) this.a, (yml) this.d, (ync) this.c, 1)), new defpackage.fed(6));
            case 16:
                adad adadVar = (adad) obj;
                acvu acvuVar = adadVar.a;
                if (acvuVar != null) {
                    return aiql.z(new acxz(acvuVar));
                }
                java.lang.Object obj29 = this.d;
                acvu acvuVar2 = adadVar.b;
                if (acvuVar2 == null) {
                    defpackage.yg ygVarB = acvh.b();
                    ygVarB.b = acvg.q;
                    ygVarB.d = "Nothing to download for file group: ".concat(java.lang.String.valueOf(((acwb) obj29).c));
                    return aiql.y(ygVarB.d());
                }
                java.lang.Object obj30 = this.c;
                java.lang.Object obj31 = this.a;
                acwx acwxVar = (acwx) this.b;
                ahyn ahynVarH = acwx.h((acwb) obj29, acvuVar2, acwxVar.e);
                aogc aogcVar2 = acwxVar.l;
                java.util.concurrent.Executor executor = acwxVar.f;
                acvj acvjVar = (acvj) obj31;
                adcs adcsVarF = adcs.e(acwx.n(acvuVar2, ahynVarH, (java.lang.String) null, acvjVar.h, acwxVar.d, executor, aogcVar2)).f(new ymu(19), executor);
                java.lang.String str = (java.lang.String) obj30;
                adcs adcsVarF2 = adcsVarF.f(new acwm(acwxVar, false, acvjVar, str, 0), executor);
                ahvr.J(((ajbz) adcsVarF2).b, new defpackage.acwt(acwxVar, false, str), executor);
                return adcsVarF2.f(new ymu(16), ajbm.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ahyn ahynVar = (ahyn) obj;
                if (!ahynVar.f()) {
                    return ajcm.a;
                }
                if (((ajcq) ahynVar.b()).isDone()) {
                    return ajcm.a;
                }
                acvj acvjVar2 = (acvj) this.b;
                if (acvjVar2.i == 2) {
                    java.lang.Object obj32 = this.d;
                    defpackage.dva dvaVar = (defpackage.dva) this.a;
                    dvaVar.r = "progress";
                    dvaVar.n(android.R.drawable.stat_sys_download);
                    ahyn ahynVar2 = acvjVar2.e;
                    java.lang.String str2 = acvjVar2.a;
                    ahynVar2.d(str2);
                    dvaVar.g(str2);
                    dvaVar.s(0, true);
                    dvaVar.a();
                    ((dvr) obj32).b(str2.hashCode(), dvaVar.a());
                }
                return ajcm.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                acwg acwgVar = (acwg) obj;
                java.lang.Object obj33 = this.d;
                if (acwgVar != null && acwgVar.e) {
                    this.b.add(abrz.N((android.content.Context) ((adak) obj33).h, acwgVar.g));
                }
                java.lang.Object obj34 = this.c;
                java.lang.Object obj35 = this.a;
                adak adakVar = (adak) obj33;
                java.lang.Object obj36 = adakVar.d;
                adlt adltVar = (adlt) obj36;
                acwe acweVar = (acwe) obj35;
                return ahvr.H(ahvr.I(adltVar.e.e(acweVar), new acze(obj36, obj35, 8, (byte[]) null), (java.util.concurrent.Executor) adltVar.h), new defpackage.adbh(adakVar, (java.util.concurrent.atomic.AtomicInteger) obj34, acweVar, 1), (java.util.concurrent.Executor) adakVar.f);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                java.lang.Object obj37 = this.b;
                java.lang.Object obj38 = this.a;
                java.lang.Object obj39 = this.d;
                java.lang.Object obj40 = this.c;
                return adcs.e(((acyu) obj40).l((acvu) obj39, (acvr) obj38, (acwe) obj37)).g(new acyj(obj40, obj39, obj38, obj37, 6), ajbm.a);
            default:
                int i = ((adbt) obj).a;
                acyu acyuVar = (acyu) this.c;
                adba adbaVar = acyuVar.b;
                java.lang.Object obj41 = this.a;
                acvu acvuVar3 = (acvu) this.d;
                acvr acvrVar = (acvr) obj41;
                acyu.B(adbaVar, acvuVar3, acvrVar, i);
                java.lang.String str3 = acvrVar.c;
                java.lang.String str4 = acvuVar3.d;
                int i2 = adbe.a;
                return acyuVar.r(acvuVar3, acvrVar, (acwe) this.b, acvuVar3.l);
        }
    }

    public /* synthetic */ jsc(acwx acwxVar, acwb acwbVar, acvj acvjVar, java.lang.String str, int i) {
        this.$cid = i;
        this.b = acwxVar;
        this.d = acwbVar;
        this.a = acvjVar;
        this.c = str;
    }

    public /* synthetic */ jsc(acyu acyuVar, acvu acvuVar, acvr acvrVar, acwe acweVar, int i) {
        this.$cid = i;
        this.c = acyuVar;
        this.d = acvuVar;
        this.a = acvrVar;
        this.b = acweVar;
    }

    public /* synthetic */ jsc(java.lang.Object obj, java.lang.Object obj2, android.telecom.PhoneAccountHandle phoneAccountHandle, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = phoneAccountHandle;
        this.d = obj3;
    }

    public /* synthetic */ jsc(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.d = obj3;
        this.c = obj4;
    }

    public /* synthetic */ jsc(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i, byte[] bArr) {
        this.$cid = i;
        this.d = obj;
        this.b = obj2;
        this.a = obj3;
        this.c = obj4;
    }

    public /* synthetic */ jsc(jsk jskVar, java.lang.Object obj, java.lang.String str, jsm jsmVar, int i) {
        this.$cid = i;
        this.a = jskVar;
        this.b = obj;
        this.c = str;
        this.d = jsmVar;
    }

    public /* synthetic */ jsc(defpackage.ljs ljsVar, j$.util.Optional optional, defpackage.ve veVar, defpackage.adnw adnwVar, int i) {
        this.$cid = i;
        this.d = ljsVar;
        this.c = optional;
        this.a = veVar;
        this.b = adnwVar;
    }

    public /* synthetic */ jsc(uvb uvbVar, utq utqVar, java.lang.String str, defpackage.ids idsVar, int i) {
        this.$cid = i;
        this.b = uvbVar;
        this.d = utqVar;
        this.c = str;
        this.a = idsVar;
    }

    public /* synthetic */ jsc(val valVar, android.telecom.PhoneAccountHandle phoneAccountHandle, java.lang.Boolean bool, ajcq ajcqVar, int i) {
        this.$cid = i;
        this.d = valVar;
        this.a = phoneAccountHandle;
        this.c = bool;
        this.b = ajcqVar;
    }

    public /* synthetic */ jsc(vgg vggVar, aify aifyVar, vgs vgsVar, android.telecom.PhoneAccountHandle phoneAccountHandle, int i) {
        this.$cid = i;
        this.d = vggVar;
        this.c = aifyVar;
        this.b = vgsVar;
        this.a = phoneAccountHandle;
    }
}
