package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vec implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ vec(java.lang.Object obj, alad aladVar, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = aladVar;
    }

    public final ajcq a(java.lang.Object obj) {
        java.lang.Object objE;
        defpackage.vbs vbsVarB;
        int i = 8;
        int i2 = 14;
        int i3 = 4;
        switch (this.$cid) {
            case 0:
                return ((java.lang.Boolean) obj).booleanValue() ? ajcm.a : ((vee) this.a).g((android.telecom.PhoneAccountHandle) this.b);
            case 1:
                akzx akzxVarM = defpackage.vce.a.m();
                defpackage.vbm vbmVar = defpackage.vbm.a;
                akzxVarM.u();
                defpackage.vce vceVar = (defpackage.vce) akzxVarM.b;
                j$.util.Objects.requireNonNull(vbmVar);
                vceVar.c = vbmVar;
                vceVar.b = 1;
                return ((vee) this.a).e((android.telecom.PhoneAccountHandle) this.b, (defpackage.vce) akzxVarM.p());
            case 2:
                java.lang.Object obj2 = this.b;
                defpackage.vck vckVar = (defpackage.vck) obj2;
                defpackage.vco vcoVar = vckVar.d;
                if (vcoVar == null) {
                    vcoVar = defpackage.vco.a;
                }
                java.lang.Object obj3 = this.a;
                android.telecom.PhoneAccountHandle phoneAccountHandle = new android.telecom.PhoneAccountHandle(android.content.ComponentName.unflattenFromString(vcoVar.b), vcoVar.c);
                vea veaVar = ((defpackage.veg) obj3).h;
                if (veaVar.i.c(phoneAccountHandle) == 2) {
                    defpackage.vce vceVar2 = vckVar.e;
                    if (vceVar2 == null) {
                        vceVar2 = defpackage.vce.a;
                    }
                    if (vceVar2.b != 2) {
                        return aiql.z(defpackage.vcw.a);
                    }
                }
                ajcq ajcqVarA = veaVar.c.a();
                defpackage.veb vebVar = new defpackage.veb(obj2, 4);
                ajbm ajbmVar = ajbm.a;
                ahrv ahrvVarG = ahrv.g(ahvr.H(ahvr.H(ajcqVarA, vebVar, ajbmVar), new defpackage.veb(obj2, 3), ajbmVar));
                defpackage.sue sueVar = new defpackage.sue(veaVar, phoneAccountHandle, obj2, 15, (byte[]) null);
                ajct ajctVar = veaVar.d;
                return ahrvVarG.i(sueVar, ajctVar).h(new vak(13), ajctVar).e(java.lang.Exception.class, new vak(14), ajctVar);
            case 3:
                defpackage.vcw vcwVar = (defpackage.vcw) obj;
                vcwVar.ordinal();
                java.lang.Object obj4 = this.b;
                java.lang.Object obj5 = this.a;
                defpackage.veg vegVar = (defpackage.veg) obj5;
                return ahvr.I(vegVar.a(), new defpackage.ved(obj5, vcwVar, obj4, 3, (char[]) null), vegVar.c);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((vew) this.a).a((android.telecom.PhoneAccountHandle) this.b, (defpackage.vek) obj);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                vew vewVar = ((defpackage.vfa) this.a).e;
                ven venVar = vewVar.d;
                ahrv ahrvVarG2 = ahrv.g(ahvr.F(new defpackage.vdp((java.lang.String) obj, 4), venVar.b.c));
                java.lang.Object obj6 = this.b;
                return ahvr.I(ahrvVarG2.h(new defpackage.veb(obj6, 5), venVar.c), new defpackage.vec(vewVar, obj6, i3), vewVar.b);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                java.lang.Object obj7 = this.a;
                defpackage.vfa vfaVar = (defpackage.vfa) obj7;
                android.telecom.PhoneAccountHandle phoneAccountHandle2 = (android.telecom.PhoneAccountHandle) obj;
                ajcq ajcqVarK = vfaVar.k.k(phoneAccountHandle2);
                defpackage.vct vctVar = new defpackage.vct(phoneAccountHandle2, 11);
                ajct ajctVar2 = vfaVar.d;
                return ahvr.I(ahvr.I(ajcqVarK, vctVar, ajctVar2), new defpackage.ved(obj7, this.b, phoneAccountHandle2, 4, (byte[]) null), ajctVar2);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((defpackage.viy) obj).c((android.telecom.PhoneAccountHandle) this.b, (defpackage.vci) this.a);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                vfl vflVar = (vfl) this.a;
                ahbv ahbvVar = vflVar.h;
                java.lang.Object obj8 = this.b;
                ahrv ahrvVarG3 = ahrv.g(ahbvVar.q((android.telecom.PhoneAccountHandle) obj8));
                gat gatVar = vflVar.i;
                j$.util.Objects.requireNonNull(gatVar);
                defpackage.veb vebVar2 = new defpackage.veb(gatVar, 10);
                ajct ajctVar3 = vflVar.b;
                return ahrvVarG3.h(vebVar2, ajctVar3).i(new defpackage.vct(obj8, i2), ajctVar3);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ((vfl) this.a).c.b((android.telecom.PhoneAccountHandle) this.b, (java.lang.String) obj, 4);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    java.lang.Object obj9 = this.b;
                    java.lang.Object obj10 = this.a;
                    final vfl vflVar2 = (vfl) obj10;
                    vflVar2.e.o(rmx.jX);
                    final android.telecom.PhoneAccountHandle phoneAccountHandle3 = (android.telecom.PhoneAccountHandle) obj9;
                    ahrv ahrvVarG4 = ahrv.g(vflVar2.h.q(phoneAccountHandle3));
                    gat gatVar2 = vflVar2.i;
                    j$.util.Objects.requireNonNull(gatVar2);
                    defpackage.veb vebVar3 = new defpackage.veb(gatVar2, 9);
                    ajct ajctVar4 = vflVar2.b;
                    return ahrv.g(ahrvVarG4.h(vebVar3, ajctVar4).i(new defpackage.vct(obj9, 15), ajctVar4)).i(new defpackage.vec(obj10, obj9, i), ajctVar4).i(new defpackage.vec(obj10, obj9, 9), ajctVar4).i(new ajat() { // from class: vfk
                        /* JADX WARN: Code duplicated, block: B:31:0x0070  */
                        public final ajcq a(java.lang.Object obj11) {
                            int i4;
                            defpackage.vek vekVar = (defpackage.vek) obj11;
                            if (vekVar.b == 1) {
                            } else {
                                defpackage.veo veoVar = defpackage.veo.a;
                            }
                            vfl vflVar3 = vflVar2;
                            vflVar3.g.isPresent();
                            java.lang.String str = (vekVar.b == 1 ? (defpackage.veo) vekVar.c : defpackage.veo.a).c;
                            int iHashCode = str.hashCode();
                            if (iHashCode != 66) {
                                if (iHashCode != 78) {
                                    if (iHashCode != 80) {
                                        if (iHashCode != 82) {
                                            if (iHashCode == 85 && str.equals("U")) {
                                                i4 = 3;
                                            } else {
                                                i4 = 1;
                                            }
                                        } else if (str.equals("R")) {
                                            i4 = 2;
                                        } else {
                                            i4 = 1;
                                        }
                                    } else if (str.equals("P")) {
                                        i4 = 6;
                                    } else {
                                        i4 = 1;
                                    }
                                } else if (str.equals("N")) {
                                    i4 = 5;
                                } else {
                                    i4 = 1;
                                }
                            } else if (str.equals("B")) {
                                i4 = 4;
                            } else {
                                i4 = 1;
                            }
                            vdq vdqVar = vflVar3.f;
                            agsm.i(974, ahvr.F(new lqh(vdqVar, i4, 7), vdqVar.d), "failed to add SubscriptionStatus", new java.lang.Object[0]);
                            defpackage.veo veoVar2 = vekVar.b == 1 ? (defpackage.veo) vekVar.c : defpackage.veo.a;
                            java.lang.String str2 = veoVar2.c;
                            java.lang.String str3 = veoVar2.d;
                            aimz aimzVar = vfl.a;
                            aimzVar.b().i(zct.a).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpStatusChecker", "isProvisioningStatusActive", 186, "OmtpStatusChecker.java").I("VVM provisioning status received: status=%s, return code=%s", str2, str3);
                            if (android.text.TextUtils.isEmpty(str2)) {
                                aimzVar.c().m(aioa.b).i(zct.b).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpStatusChecker", "isProvisioningStatusActive", 191, "OmtpStatusChecker.java").v("missing status");
                            } else {
                                int iHashCode2 = str2.hashCode();
                                if (iHashCode2 != 66) {
                                    if (iHashCode2 != 78) {
                                        if (iHashCode2 != 80) {
                                            if (iHashCode2 != 82) {
                                                if (iHashCode2 == 85 && str2.equals("U")) {
                                                    throw new defpackage.vcv(defpackage.vbs.ACTIVATE_PROVISIONING_STATE_UNKNOWN);
                                                }
                                            } else if (str2.equals("R")) {
                                                if (android.text.TextUtils.equals(str3, "0")) {
                                                    vflVar3.e.n(rmw.bn);
                                                    vfn vfnVar = vflVar3.d;
                                                    defpackage.vgm vgmVar = (vekVar.b == 1 ? (defpackage.veo) vekVar.c : defpackage.veo.a).e;
                                                    if (vgmVar == null) {
                                                        vgmVar = defpackage.vgm.a;
                                                    }
                                                    return ahvr.H(vfnVar.m(phoneAccountHandle3, vgmVar), new defpackage.vef(7), vflVar3.b);
                                                }
                                            }
                                        } else if (!str2.equals("P")) {
                                        }
                                    } else if (!str2.equals("N")) {
                                    }
                                } else if (str2.equals("B")) {
                                    throw new defpackage.vcv(defpackage.vbs.ACTIVATE_PROVISIONING_STATE_BLOCKED);
                                }
                                aimzVar.c().m(aioa.b).i(zct.b).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpStatusChecker", "isProvisioningStatusActive", 210, "OmtpStatusChecker.java").y("unrecognized status: %s", str2);
                            }
                            vflVar3.e.n(rmw.bo);
                            akzx akzxVarM2 = vcr.a.m();
                            akzx akzxVarM3 = vcp.a.m();
                            defpackage.vbs vbsVar = defpackage.vbs.STATUS_CHECK_NEEDS_ACTIVATION;
                            akzxVarM3.u();
                            vcp vcpVar = akzxVarM3.b;
                            vcpVar.c = java.lang.Integer.valueOf(vbsVar.a());
                            vcpVar.b = 1;
                            akzxVarM2.u();
                            vcr vcrVar = akzxVarM2.b;
                            vcp vcpVarP = akzxVarM3.p();
                            j$.util.Objects.requireNonNull(vcpVarP);
                            vcrVar.c = vcpVarP;
                            vcrVar.b = 2;
                            return aiql.z(akzxVarM2.p());
                        }
                    }, ajctVar4).e(defpackage.vcx.class, new defpackage.vef(6), ajctVar4);
                }
                vfl.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpStatusChecker", "updateStatus", 95, "OmtpStatusChecker.java").v("BERRY account is not activated!");
                akzx akzxVarM2 = vcr.a.m();
                akzx akzxVarM3 = vcp.a.m();
                defpackage.vbs vbsVar = defpackage.vbs.STATUS_CHECK_NEEDS_ACTIVATION;
                akzxVarM3.u();
                vcp vcpVar = akzxVarM3.b;
                vcpVar.c = java.lang.Integer.valueOf(vbsVar.a());
                vcpVar.b = 1;
                akzxVarM2.u();
                vcr vcrVar = akzxVarM2.b;
                vcp vcpVarP = akzxVarM3.p();
                j$.util.Objects.requireNonNull(vcpVarP);
                vcrVar.c = vcpVarP;
                vcrVar.b = 2;
                return aiql.z(akzxVarM2.p());
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                akzx akzxVarM4 = vzi.a.m();
                android.telecom.PhoneAccountHandle phoneAccountHandle4 = (android.telecom.PhoneAccountHandle) this.b;
                java.lang.String id = phoneAccountHandle4.getId();
                akzxVarM4.u();
                vzi vziVar = akzxVarM4.b;
                j$.util.Objects.requireNonNull(id);
                vziVar.b |= 8;
                vziVar.f = id;
                java.lang.String strFlattenToString = phoneAccountHandle4.getComponentName().flattenToString();
                akzxVarM4.u();
                vzi vziVar2 = akzxVarM4.b;
                j$.util.Objects.requireNonNull(strFlattenToString);
                vziVar2.b |= 4;
                vziVar2.e = strFlattenToString;
                akzxVarM4.u();
                vzi vziVar3 = akzxVarM4.b;
                vziVar3.b |= 32;
                vziVar3.h = 0;
                if (((java.lang.Boolean) obj).booleanValue()) {
                    akzxVarM4.u();
                    vzi vziVar4 = akzxVarM4.b;
                    vziVar4.b |= 16384;
                    vziVar4.o = true;
                    a.bI(vfn.a.b(), "Storing error to ask user to reset the pre-configured PIN", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmAccountState", "addAccount", (char) 304, "OmtpVvmAccountState.java", zct.a);
                }
                return ((vfn) this.a).h.e(akzxVarM4.p());
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                java.lang.Object obj11 = this.a;
                vfn vfnVar = (vfn) obj11;
                tvn tvnVar = vfnVar.l;
                java.lang.Object obj12 = this.b;
                tvnVar.m((android.telecom.PhoneAccountHandle) obj12);
                vfnVar.f.n(rmw.aK);
                if (!((java.lang.Boolean) vfnVar.g.a()).booleanValue()) {
                    return ajcm.a;
                }
                vfn.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmAccountState", "clearMwiNotification", 403, "OmtpVvmAccountState.java").y("Clear MWI notification for %s", obj12);
                j$.util.Optional optionalG = vfnVar.k.g();
                defpackage.vdj vdjVar = new defpackage.vdj(obj12, 4);
                if (true == optionalG.isPresent()) {
                    optionalG = j$.util.Optional.ofNullable(((val) optionalG.get()).a((android.telecom.PhoneAccountHandle) vdjVar.a));
                }
                idf idfVar = new idf(obj11, obj12, 4, (byte[]) null);
                if (true != optionalG.isPresent()) {
                    java.lang.Object obj13 = idfVar.b;
                    objE = ahvr.E(new defpackage.rqy(obj13, idfVar.a, 12), ((vfn) obj13).c);
                } else {
                    objE = optionalG.get();
                }
                return (ajcq) objE;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((vfn) this.b).h.e((vzi) this.a);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                vfo vfoVar = (vfo) this.a;
                ahbv ahbvVar2 = vfoVar.j;
                java.lang.Object obj14 = this.b;
                ahrv ahrvVarG5 = ahrv.g(ahbvVar2.q((android.telecom.PhoneAccountHandle) obj14));
                gat gatVar3 = vfoVar.k;
                j$.util.Objects.requireNonNull(gatVar3);
                defpackage.veb vebVar4 = new defpackage.veb(gatVar3, 13);
                ajct ajctVar5 = vfoVar.e;
                return ahrvVarG5.h(vebVar4, ajctVar5).i(new defpackage.vct(obj14, 18), ajctVar5);
            case 15:
                return ((vfo) this.a).f.b((android.telecom.PhoneAccountHandle) this.b, (java.lang.String) obj, 2);
            case 16:
                defpackage.vek vekVar = (defpackage.vek) obj;
                vfo vfoVar2 = (vfo) this.a;
                vfoVar2.g.o(rmx.jY);
                if (vekVar.b == 1) {
                } else {
                    defpackage.veo veoVar = defpackage.veo.a;
                }
                java.lang.Object obj15 = this.b;
                vfoVar2.e();
                return vfoVar2.c((android.telecom.PhoneAccountHandle) obj15, vekVar.b == 1 ? (defpackage.veo) vekVar.c : defpackage.veo.a);
            case 17:
                vcr vcrVar2 = (vcr) obj;
                vcp vcpVar2 = vcrVar2.b == 2 ? (vcp) vcrVar2.c : vcp.a;
                if (vcpVar2.b == 1) {
                    vbsVarB = defpackage.vbs.b(((java.lang.Integer) vcpVar2.c).intValue());
                    if (vbsVarB == null) {
                        vbsVarB = defpackage.vbs.UNRECOGNIZED;
                    }
                } else {
                    vbsVarB = defpackage.vbs.UNSPECIFIED;
                }
                if (vbsVarB == defpackage.vbs.STATUS_CHECK_NEEDS_ACTIVATION) {
                    java.lang.Object obj16 = this.b;
                    agsm.i(980, ((vfr) this.a).b.g((android.telecom.PhoneAccountHandle) obj16), "Failure scheduling VVM Activation from OmtpVvmCarrierService#updateStatus for %s", new java.lang.Object[]{obj16});
                }
                return aiql.z(vcrVar2);
            case 18:
                return ((vfu) this.a).c.a((vdd) ((j$.util.Optional) obj).orElseThrow(new defpackage.rqc(14)), (android.telecom.PhoneAccountHandle) this.b);
            case 19:
                vfx vfxVar = (vfx) this.a;
                ahrv ahrvVarG6 = ahrv.g(vfxVar.g.q((android.telecom.PhoneAccountHandle) this.b));
                gat gatVar4 = vfxVar.h;
                j$.util.Objects.requireNonNull(gatVar4);
                defpackage.vfw vfwVar = new defpackage.vfw(gatVar4, 0);
                ajct ajctVar6 = vfxVar.b;
                return ahrvVarG6.h(vfwVar, ajctVar6).h(new defpackage.vft(5), ajctVar6);
            default:
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (!optional.isPresent()) {
                    return ajcm.a;
                }
                java.lang.Object obj17 = this.b;
                java.lang.Object obj18 = this.a;
                java.lang.String str = (java.lang.String) optional.orElseThrow();
                vku vkuVar = ((vfx) obj18).c;
                android.telecom.PhoneAccountHandle phoneAccountHandle5 = (android.telecom.PhoneAccountHandle) obj17;
                defpackage.vkt vktVarA = vkuVar.a(phoneAccountHandle5, 3);
                j$.util.Objects.requireNonNull(vktVarA);
                return vkuVar.c(phoneAccountHandle5, str, new defpackage.vel(vktVarA, 10), ((java.lang.Long) vkuVar.g.a()).longValue(), 3);
        }
    }

    public /* synthetic */ vec(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
