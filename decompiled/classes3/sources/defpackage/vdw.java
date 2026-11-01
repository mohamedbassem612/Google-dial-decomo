package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vdw implements ajas {
    public final /* synthetic */ vea a;
    public final /* synthetic */ defpackage.vce b;
    public final /* synthetic */ int c;
    public final /* synthetic */ android.telecom.PhoneAccountHandle d;
    public final /* synthetic */ ajcq e;
    public final /* synthetic */ defpackage.amsi f;
    public final /* synthetic */ ajcq g;
    public final /* synthetic */ ajcq h;
    public final /* synthetic */ int i;

    public /* synthetic */ vdw(vea veaVar, defpackage.vce vceVar, int i, android.telecom.PhoneAccountHandle phoneAccountHandle, ajcq ajcqVar, int i2, defpackage.amsi amsiVar, ajcq ajcqVar2, ajcq ajcqVar3) {
        this.a = veaVar;
        this.b = vceVar;
        this.c = i;
        this.d = phoneAccountHandle;
        this.e = ajcqVar;
        this.i = i2;
        this.f = amsiVar;
        this.g = ajcqVar2;
        this.h = ajcqVar3;
    }

    public final ajcq a() {
        int i;
        ahrv ahrvVarI;
        aimz aimzVar = vea.a;
        aimw aimwVarL = aimzVar.b().i(zct.a).l("com/android/dialer/voicemail/service/impl/scheduler/VvmExecutorImpl", "execute", 259, "VvmExecutorImpl.java");
        final defpackage.vce vceVar = this.b;
        java.lang.String strName = defpackage.vcd.a(vceVar.b).name();
        final int i2 = this.c;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i2);
        final android.telecom.PhoneAccountHandle phoneAccountHandle = this.d;
        aimwVarL.M("Beginning VVM action: %s with retryCount: %d for %s", strName, numValueOf, phoneAccountHandle);
        final akzx akzxVarM = amsq.a.m();
        defpackage.amsh amshVar = (defpackage.amsh) aiql.H(this.e);
        akzxVarM.u();
        amsq amsqVar = akzxVarM.b;
        amsqVar.c = amshVar.k;
        amsqVar.b |= 2;
        akzxVarM.u();
        amsq amsqVar2 = akzxVarM.b;
        int i3 = this.i;
        amsqVar2.g = i3 - 1;
        amsqVar2.b |= 32;
        switch (defpackage.vcd.a(vceVar.b).ordinal()) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                i = 6;
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                i = 7;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                i = 8;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                i = 9;
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                i = 10;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                i = 11;
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                i = 17;
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                i = 1;
                break;
            default:
                throw new java.lang.RuntimeException(null, null);
        }
        akzxVarM.u();
        amsq amsqVar3 = akzxVarM.b;
        amsqVar3.d = i - 1;
        amsqVar3.b |= 4;
        if (i3 == 2) {
            defpackage.amsi amsiVar = this.f;
            akzxVarM.u();
            amsq amsqVar4 = akzxVarM.b;
            amsqVar4.b |= 64;
            amsqVar4.h = i2;
            akzxVarM.u();
            amsq amsqVar5 = akzxVarM.b;
            j$.util.Objects.requireNonNull(amsiVar);
            amsqVar5.i = amsiVar;
            amsqVar5.b |= 128;
        }
        final vea veaVar = this.a;
        if (!vea.h(vceVar, phoneAccountHandle, ((long) i2) == ((java.lang.Long) veaVar.f.a()).longValue()).isPresent()) {
            akzx akzxVarM2 = defpackage.amsn.a.m();
            akzx akzxVarM3 = defpackage.amsl.a.m();
            defpackage.vbs vbsVar = defpackage.vbs.ACTION_NOT_SPECIFIED;
            akzxVarM3.u();
            defpackage.amsl amslVar = (defpackage.amsl) akzxVarM3.b;
            amslVar.c = java.lang.Integer.valueOf(vbsVar.a());
            amslVar.b = 3;
            akzxVarM2.u();
            defpackage.amsn amsnVar = (defpackage.amsn) akzxVarM2.b;
            defpackage.amsl amslVar2 = (defpackage.amsl) akzxVarM3.p();
            j$.util.Objects.requireNonNull(amslVar2);
            amsnVar.c = amslVar2;
            amsnVar.b = 2;
            akzxVarM.u();
            amsq amsqVar6 = akzxVarM.b;
            defpackage.amsn amsnVar2 = (defpackage.amsn) akzxVarM2.p();
            j$.util.Objects.requireNonNull(amsnVar2);
            amsqVar6.e = amsnVar2;
            amsqVar6.b |= 8;
            veaVar.j(akzxVarM.p());
            aimzVar.c().m(aioa.b).i(zct.b).l("com/android/dialer/voicemail/service/impl/scheduler/VvmExecutorImpl", "execute", 283, "VvmExecutorImpl.java").I("Work optional not available for VvmAction: %s for %s", defpackage.vcd.a(vceVar.b), phoneAccountHandle);
            throw new java.lang.IllegalStateException("Work optional not available for VvmAction");
        }
        ajcq ajcqVar = this.h;
        final j$.util.Optional optional = (j$.util.Optional) aiql.H(this.g);
        j$.util.Optional optional2 = (j$.util.Optional) aiql.H(ajcqVar);
        if (optional.isPresent() && optional2.isPresent()) {
            vcc vccVar = (vcc) optional2.orElseThrow();
            if (((java.lang.Boolean) veaVar.k.a()).booleanValue()) {
                ahrv ahrvVarG = ahrv.g(veaVar.d());
                defpackage.qgk qgkVar = new defpackage.qgk(9);
                ajct ajctVar = veaVar.d;
                ahrvVarI = ahrvVarG.i(qgkVar, ajctVar).i(new defpackage.vcu(veaVar, phoneAccountHandle, 14), ajctVar).i(new defpackage.vcu(veaVar, phoneAccountHandle, 15), ajctVar);
            } else {
                ahrv ahrvVarG2 = ahrv.g(veaVar.m.p(phoneAccountHandle));
                defpackage.vct vctVar = new defpackage.vct(phoneAccountHandle, 3);
                ajct ajctVar2 = veaVar.d;
                ahrvVarI = ahrvVarG2.i(vctVar, ajctVar2).i(new defpackage.sue(veaVar, vccVar, phoneAccountHandle, 16), ajctVar2);
            }
            ahrv ahrvVarG3 = ahrv.g(ahrvVarI);
            ajat ajatVar = new ajat() { // from class: vdv
                public final ajcq a(java.lang.Object obj) {
                    vfj vfjVar = (vfj) optional.orElseThrow();
                    final vea veaVar2 = veaVar;
                    boolean z = ((long) i2) == ((java.lang.Long) veaVar2.f.a()).longValue();
                    final defpackage.vce vceVar2 = vceVar;
                    final android.telecom.PhoneAccountHandle phoneAccountHandle2 = phoneAccountHandle;
                    defpackage.vdz vdzVar = (defpackage.vdz) vea.h(vceVar2, phoneAccountHandle2, z).orElseThrow();
                    final j$.time.Instant instantNow = j$.time.Instant.now();
                    ahrv ahrvVarG4 = ahrv.g(vdzVar.a(vfjVar));
                    defpackage.vcu vcuVar = new defpackage.vcu(veaVar2, phoneAccountHandle2, 9);
                    ajct ajctVar3 = veaVar2.d;
                    ahrv ahrvVarE = ahrvVarG4.f(defpackage.vcv.class, vcuVar, ajctVar3).f(defpackage.vcx.class, new defpackage.vcu(veaVar2, phoneAccountHandle2, 10), ajctVar3).e(java.lang.Exception.class, new defpackage.tzs(veaVar2, phoneAccountHandle2, 19), ajctVar3);
                    final akzx akzxVar = akzxVarM;
                    return ahrvVarE.h(new ahyc() { // from class: vdy
                        public final java.lang.Object apply(java.lang.Object obj2) {
                            android.telecom.PhoneAccountHandle phoneAccountHandle3;
                            defpackage.vce vceVar3;
                            int i4;
                            vcp vcpVar;
                            defpackage.vbw vbwVarB;
                            defpackage.vbx vbxVarB;
                            defpackage.vbs vbsVarB;
                            vcr vcrVar = (vcr) obj2;
                            j$.time.Instant instantNow2 = j$.time.Instant.now();
                            akzx akzxVarM4 = defpackage.amsn.a.m();
                            if (vcrVar.b == 2) {
                                akzx akzxVarM5 = defpackage.amsl.a.m();
                                if ((vcrVar.b == 2 ? (vcp) vcrVar.c : vcp.a).b == 1) {
                                    vcp vcpVar2 = vcrVar.b == 2 ? (vcp) vcrVar.c : vcp.a;
                                    if (vcpVar2.b == 1) {
                                        vbsVarB = defpackage.vbs.b(((java.lang.Integer) vcpVar2.c).intValue());
                                        if (vbsVarB == null) {
                                            vbsVarB = defpackage.vbs.UNRECOGNIZED;
                                        }
                                    } else {
                                        vbsVarB = defpackage.vbs.UNSPECIFIED;
                                    }
                                    akzxVarM5.u();
                                    defpackage.amsl amslVar3 = (defpackage.amsl) akzxVarM5.b;
                                    amslVar3.c = java.lang.Integer.valueOf(vbsVarB.a());
                                    amslVar3.b = 3;
                                } else {
                                    int i5 = vcrVar.b;
                                    if ((i5 == 2 ? (vcp) vcrVar.c : vcp.a).b == 2) {
                                        vcp vcpVar3 = i5 == 2 ? (vcp) vcrVar.c : vcp.a;
                                        if (vcpVar3.b == 2) {
                                            vbxVarB = defpackage.vbx.b(((java.lang.Integer) vcpVar3.c).intValue());
                                            if (vbxVarB == null) {
                                                vbxVarB = defpackage.vbx.UNRECOGNIZED;
                                            }
                                        } else {
                                            vbxVarB = defpackage.vbx.REST_UNSPECIFIED;
                                        }
                                        akzxVarM5.u();
                                        defpackage.amsl amslVar4 = (defpackage.amsl) akzxVarM5.b;
                                        amslVar4.c = java.lang.Integer.valueOf(vbxVarB.a());
                                        amslVar4.b = 4;
                                    } else {
                                        if (i5 == 2) {
                                            vcpVar = (vcp) vcrVar.c;
                                            i4 = 2;
                                        } else {
                                            i4 = i5;
                                            vcpVar = vcp.a;
                                        }
                                        if (vcpVar.b == 3) {
                                            vcp vcpVar4 = i4 == 2 ? (vcp) vcrVar.c : vcp.a;
                                            if (vcpVar4.b == 3) {
                                                vbwVarB = defpackage.vbw.b(((java.lang.Integer) vcpVar4.c).intValue());
                                                if (vbwVarB == null) {
                                                    vbwVarB = defpackage.vbw.UNRECOGNIZED;
                                                }
                                            } else {
                                                vbwVarB = defpackage.vbw.OMTP_UNSPECIFIED;
                                            }
                                            akzxVarM5.u();
                                            defpackage.amsl amslVar5 = (defpackage.amsl) akzxVarM5.b;
                                            amslVar5.c = java.lang.Integer.valueOf(vbwVarB.a());
                                            amslVar5.b = 5;
                                        } else {
                                            vea.a.d().m(aioa.b).l("com/android/dialer/voicemail/service/impl/scheduler/VvmExecutorImpl", "toMetricsVvmResult", 676, "VvmExecutorImpl.java").v("no FailureReasonSpecified");
                                        }
                                    }
                                }
                                akzxVarM4.u();
                                defpackage.amsn amsnVar3 = (defpackage.amsn) akzxVarM4.b;
                                defpackage.amsl amslVar6 = (defpackage.amsl) akzxVarM5.p();
                                j$.util.Objects.requireNonNull(amslVar6);
                                amsnVar3.c = amslVar6;
                                amsnVar3.b = 2;
                            } else {
                                defpackage.amsm amsmVar = defpackage.amsm.a;
                                akzxVarM4.u();
                                defpackage.amsn amsnVar4 = (defpackage.amsn) akzxVarM4.b;
                                j$.util.Objects.requireNonNull(amsmVar);
                                amsnVar4.c = amsmVar;
                                amsnVar4.b = 1;
                            }
                            android.telecom.PhoneAccountHandle phoneAccountHandle4 = phoneAccountHandle2;
                            defpackage.vce vceVar4 = vceVar2;
                            j$.time.Instant instant = instantNow;
                            akzx akzxVar2 = akzxVar;
                            vea veaVar3 = veaVar2;
                            defpackage.amsn amsnVar5 = (defpackage.amsn) akzxVarM4.p();
                            akzxVar2.u();
                            amsq amsqVar7 = akzxVar2.b;
                            amsq amsqVar8 = amsq.a;
                            j$.util.Objects.requireNonNull(amsnVar5);
                            amsqVar7.e = amsnVar5;
                            amsqVar7.b |= 8;
                            akzm akzmVarDH = ajsz.dH(j$.time.Duration.between(instant, instantNow2));
                            akzxVar2.u();
                            amsq amsqVar9 = akzxVar2.b;
                            j$.util.Objects.requireNonNull(akzmVarDH);
                            amsqVar9.f = akzmVarDH;
                            amsqVar9.b |= 16;
                            veaVar3.j(akzxVar2.p());
                            if (vcrVar.b == 1) {
                                vea.a.b().i(zct.a).l("com/android/dialer/voicemail/service/impl/scheduler/VvmExecutorImpl", "executeWorkOnCarrierService", 562, "VvmExecutorImpl.java").I("Successfully completed vvm work with action: %s for %s", defpackage.vcd.a(vceVar4.b), phoneAccountHandle4);
                                return vcrVar;
                            }
                            if (((java.lang.Boolean) veaVar3.h.a()).booleanValue()) {
                                vceVar3 = vceVar4;
                                vea.a.d().i(zct.a).l("com/android/dialer/voicemail/service/impl/scheduler/VvmExecutorImpl", "executeWorkOnCarrierService", 570, "VvmExecutorImpl.java").P("Could not complete vvm work with action: %s. [GeneralFailureReason: %s, OmtpFailureReason: %s, RestFailureReason: %s] [shouldBeRetried: %b] (phoneAccount %s) ", new aepg(defpackage.vcd.a(vceVar4.b)), vea.a(vcrVar.b == 2 ? (vcp) vcrVar.c : vcp.a), vea.b(vcrVar.b == 2 ? (vcp) vcrVar.c : vcp.a), vea.c(vcrVar.b == 2 ? (vcp) vcrVar.c : vcp.a), java.lang.Boolean.valueOf((vcrVar.b == 2 ? (vcp) vcrVar.c : vcp.a).d), phoneAccountHandle4);
                                phoneAccountHandle3 = phoneAccountHandle4;
                            } else {
                                phoneAccountHandle3 = phoneAccountHandle4;
                                vceVar3 = vceVar4;
                            }
                            vea.a.d().i(zct.b).i(zct.a).l("com/android/dialer/voicemail/service/impl/scheduler/VvmExecutorImpl", "executeWorkOnCarrierService", 585, "VvmExecutorImpl.java").M("Could not complete vvm work with action: %s. Error: %s for %s", defpackage.vcd.a(vceVar3.b), vea.i(vcrVar.b == 2 ? (vcp) vcrVar.c : vcp.a), phoneAccountHandle3);
                            return vcrVar;
                        }
                    }, ajctVar3).i(new jsc(veaVar2, vfjVar, phoneAccountHandle2, vceVar2, 8), ajctVar3);
                }
            };
            ajct ajctVar3 = veaVar.d;
            return ahrvVarG3.i(ajatVar, ajctVar3).f(defpackage.vcx.class, new defpackage.vcu(veaVar, phoneAccountHandle, 11), ajctVar3).f(defpackage.vcv.class, new defpackage.vcu(veaVar, phoneAccountHandle, 12), ajctVar3);
        }
        akzx akzxVarM4 = defpackage.amsn.a.m();
        akzx akzxVarM5 = defpackage.amsl.a.m();
        defpackage.vbs vbsVar2 = defpackage.vbs.VVM_CARRIER_SERVICE_NOT_FOUND;
        akzxVarM5.u();
        defpackage.amsl amslVar3 = (defpackage.amsl) akzxVarM5.b;
        amslVar3.c = java.lang.Integer.valueOf(vbsVar2.a());
        amslVar3.b = 3;
        akzxVarM4.u();
        defpackage.amsn amsnVar3 = (defpackage.amsn) akzxVarM4.b;
        defpackage.amsl amslVar4 = (defpackage.amsl) akzxVarM5.p();
        j$.util.Objects.requireNonNull(amslVar4);
        amsnVar3.c = amslVar4;
        amsnVar3.b = 2;
        akzxVarM.u();
        amsq amsqVar7 = akzxVarM.b;
        defpackage.amsn amsnVar4 = (defpackage.amsn) akzxVarM4.p();
        j$.util.Objects.requireNonNull(amsnVar4);
        amsqVar7.e = amsnVar4;
        amsqVar7.b |= 8;
        veaVar.j(akzxVarM.p());
        aimzVar.c().m(aioa.b).i(zct.b).l("com/android/dialer/voicemail/service/impl/scheduler/VvmExecutorImpl", "execute", 302, "VvmExecutorImpl.java").y("Service optional not available for PhoneAccountHandle with id: %s", phoneAccountHandle.getId());
        throw new java.lang.IllegalStateException("VvmCarrierService not available for PhoneAccountHandle");
    }
}
