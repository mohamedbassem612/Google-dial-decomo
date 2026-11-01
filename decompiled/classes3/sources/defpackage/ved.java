package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ved implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ ved(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.veo veoVar, defpackage.vjb vjbVar, int i) {
        this.$cid = i;
        this.c = phoneAccountHandle;
        this.a = veoVar;
        this.b = vjbVar;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x04df  */
    /* JADX WARN: Code duplicated, block: B:108:0x04e7  */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.lang.Object, java.util.Collection] */
    public final ajcq a(java.lang.Object obj) {
        int i = 4;
        int i2 = 10;
        int i3 = 12;
        int i4 = 18;
        int i5 = 20;
        int i6 = 9;
        int i7 = 16;
        int i8 = 3;
        int i9 = 0;
        byte[] bArr = null;
        int i10 = 2;
        int i11 = 1;
        switch (this.$cid) {
            case 0:
                akzx akzxVarM = defpackage.vce.a.m();
                akzx akzxVarM2 = defpackage.vbt.a.m();
                akzxVarM2.u();
                defpackage.vbt vbtVar = (defpackage.vbt) akzxVarM2.b;
                java.lang.Object obj2 = this.b;
                j$.util.Objects.requireNonNull(obj2);
                vbtVar.c = (defpackage.veo) obj2;
                vbtVar.b |= 1;
                akzxVarM.u();
                defpackage.vce vceVar = (defpackage.vce) akzxVarM.b;
                defpackage.vbt vbtVar2 = (defpackage.vbt) akzxVarM2.p();
                j$.util.Objects.requireNonNull(vbtVar2);
                vceVar.c = vbtVar2;
                vceVar.b = 16;
                return ((vee) this.a).e((android.telecom.PhoneAccountHandle) this.c, (defpackage.vce) akzxVarM.p());
            case 1:
                return ((vee) this.b).e((android.telecom.PhoneAccountHandle) this.c, (defpackage.vce) this.a);
            case 2:
                akzx akzxVarM3 = defpackage.vce.a.m();
                akzx akzxVarM4 = defpackage.vbr.a.m();
                akzxVarM4.u();
                defpackage.vbr vbrVar = (defpackage.vbr) akzxVarM4.b;
                java.lang.Object obj3 = this.a;
                j$.util.Objects.requireNonNull(obj3);
                vbrVar.c = (defpackage.vcm) obj3;
                vbrVar.b |= 1;
                akzxVarM4.u();
                ((defpackage.vbr) akzxVarM4.b).d = true;
                akzxVarM3.u();
                defpackage.vce vceVar2 = (defpackage.vce) akzxVarM3.b;
                defpackage.vbr vbrVar2 = (defpackage.vbr) akzxVarM4.p();
                j$.util.Objects.requireNonNull(vbrVar2);
                vceVar2.c = vbrVar2;
                vceVar2.b = 9;
                defpackage.vce vceVar3 = (defpackage.vce) akzxVarM3.p();
                vee veeVar = (vee) this.b;
                boolean zBooleanValue = ((java.lang.Boolean) veeVar.f.a()).booleanValue();
                java.lang.Object obj4 = this.c;
                return zBooleanValue ? veeVar.e((android.telecom.PhoneAccountHandle) obj4, vceVar3) : veeVar.f((android.telecom.PhoneAccountHandle) obj4, vceVar3);
            case 3:
                java.lang.Object obj5 = this.a;
                int iOrdinal = ((defpackage.vcw) obj5).ordinal();
                java.lang.Object obj6 = this.c;
                java.lang.Object obj7 = this.b;
                if (iOrdinal == 0) {
                    return ahvr.H(((defpackage.veg) obj7).j.aq((defpackage.vck) obj6), new vak(19), ajbm.a);
                }
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        return aiql.z(new gse());
                    }
                    if (iOrdinal == 3) {
                        return ahvr.H(((defpackage.veg) obj7).j.aq((defpackage.vck) obj6), new defpackage.vef(i9), ajbm.a);
                    }
                    throw new java.lang.IllegalArgumentException("Unexpected jobResult: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj5))));
                }
                defpackage.vck vckVar = (defpackage.vck) obj6;
                defpackage.veg vegVar = (defpackage.veg) obj7;
                if (vckVar.f >= ((java.lang.Long) vegVar.f.a()).longValue()) {
                    return ahvr.H(vegVar.j.aq(vckVar), new defpackage.vef(i11), ajbm.a);
                }
                aogc aogcVar = vegVar.j;
                return ahvr.H(((afhf) aogcVar.c).a(new defpackage.veb(obj6, i11), (java.util.concurrent.Executor) aogcVar.b), new vak(20), ajbm.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj8 = this.b;
                int i12 = 5;
                if (!zBooleanValue2) {
                    defpackage.vfa.a.b().l("com/android/dialer/voicemail/service/impl/sms/receiver/AdnMessageReceiver", "onReceive", 100, "AdnMessageReceiver.java").v("disable receiver since vvm is disabled");
                    return ahvr.F(new defpackage.vdp(obj8, i12), ((defpackage.vfa) obj8).c);
                }
                java.lang.Object obj9 = this.a;
                defpackage.vez vezVar = new defpackage.vez(obj8, this.c, i11);
                ajct ajctVar = ((defpackage.vfa) obj8).d;
                return ahvr.I(ahvr.F(vezVar, ajctVar), new defpackage.vec(obj8, obj9, i12), ajctVar);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.vjb vjbVar = (defpackage.vjb) obj;
                int iOrdinal2 = vjbVar.ordinal();
                java.lang.Object obj10 = this.c;
                java.lang.Object obj11 = this.a;
                java.lang.Object obj12 = this.b;
                if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                    vfo vfoVar = (vfo) obj12;
                    android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) obj10;
                    ahrv ahrvVarG = ahrv.g(vfoVar.b(phoneAccountHandle));
                    defpackage.ved vedVar = new defpackage.ved(phoneAccountHandle, (defpackage.veo) obj11, vjbVar, 6);
                    ajct ajctVar2 = vfoVar.e;
                    return ahrvVarG.i(vedVar, ajctVar2).i(new defpackage.ved(obj12, obj10, obj11, 7, (byte[]) null), ajctVar2);
                }
                if (iOrdinal2 == 2) {
                    vfo vfoVar2 = (vfo) obj12;
                    return ahvr.H(vfoVar2.d((android.telecom.PhoneAccountHandle) obj10), new defpackage.vef(11), vfoVar2.e);
                }
                if (iOrdinal2 != 3) {
                    throw new java.lang.RuntimeException(null, null);
                }
                defpackage.veo veoVar = (defpackage.veo) obj11;
                java.lang.String str = veoVar.c;
                java.lang.String str2 = veoVar.d;
                aimz aimzVar = vfo.a;
                aimzVar.b().i(zct.a).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmActivation", "isProvisioningStatusActive", 314, "OmtpVvmActivation.java").I("VVM provisioning status received: status=%s, return code=%s", str, str2);
                int iHashCode = str.hashCode();
                if (iHashCode != 66) {
                    if (iHashCode != 78) {
                        if (iHashCode != 80) {
                            if (iHashCode != 82) {
                                if (iHashCode == 85 && str.equals("U")) {
                                    ((vfo) obj12).g.n(rmw.ay);
                                    throw new defpackage.vcv(defpackage.vbs.ACTIVATE_PROVISIONING_STATE_UNKNOWN);
                                }
                            } else if (str.equals("R")) {
                                if (android.text.TextUtils.equals(str2, "0")) {
                                    vfo vfoVar3 = (vfo) obj12;
                                    return ahvr.H(vfoVar3.a((android.telecom.PhoneAccountHandle) obj10, veoVar), new defpackage.vef(i6), vfoVar3.e);
                                }
                            }
                        } else if (!str.equals("P")) {
                        }
                    } else if (str.equals("N")) {
                        if (android.text.TextUtils.equals(str2, "0")) {
                            vfo vfoVar4 = (vfo) obj12;
                            return ahvr.H(vfoVar4.a((android.telecom.PhoneAccountHandle) obj10, veoVar), new defpackage.vef(i6), vfoVar4.e);
                        }
                    }
                    vfo vfoVar5 = (vfo) obj12;
                    return ahvr.H(vfoVar5.d((android.telecom.PhoneAccountHandle) obj10), new defpackage.vef(i2), vfoVar5.e);
                }
                if (str.equals("B")) {
                    ((vfo) obj12).g.n(rmw.az);
                    throw new defpackage.vcv(defpackage.vbs.ACTIVATE_PROVISIONING_STATE_BLOCKED);
                }
                aimzVar.c().m(aioa.b).i(zct.b).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmActivation", "isProvisioningStatusActive", 336, "OmtpVvmActivation.java").y("unrecognized status: %s", str);
                vfo vfoVar6 = (vfo) obj12;
                return ahvr.H(vfoVar6.d((android.telecom.PhoneAccountHandle) obj10), new defpackage.vef(i2), vfoVar6.e);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                java.lang.Object obj13 = this.c;
                java.lang.Object obj14 = this.a;
                java.lang.Object obj15 = this.b;
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                aimz aimzVar2 = vfo.a;
                ide ideVar = new ide((android.telecom.PhoneAccountHandle) obj13, (defpackage.veo) obj14, (defpackage.vjb) obj15, 2);
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(((defpackage.vjc) optionalOfNullable.get()).b((android.telecom.PhoneAccountHandle) ideVar.a, (defpackage.veo) ideVar.c, (defpackage.vjb) ideVar.b));
                }
                return (ajcq) optionalOfNullable.orElse(aiql.z(anar.t(defpackage.vbw.PROVISION_GENERIC_FAILURE)));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                vcr vcrVar = (vcr) obj;
                int i13 = vcrVar.b;
                java.lang.Object obj16 = this.c;
                java.lang.Object obj17 = this.b;
                if (i13 == 1) {
                    vfo vfoVar7 = (vfo) obj17;
                    return ahvr.H(vfoVar7.a((android.telecom.PhoneAccountHandle) obj16, (defpackage.veo) this.a), new defpackage.veb(vcrVar, i7), vfoVar7.e);
                }
                vfo vfoVar8 = (vfo) obj17;
                return ahvr.H(vfoVar8.d((android.telecom.PhoneAccountHandle) obj16), new defpackage.veb(vcrVar, i4), vfoVar8.e);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return ajcm.a;
                }
                java.lang.Object obj18 = this.a;
                ?? r2 = this.b;
                java.lang.Object obj19 = this.c;
                return ahvr.ae((java.lang.Iterable) j$.util.Collection.-EL.stream((java.util.Collection) r2).filter(new vgb(0)).map(new defpackage.pgq(obj19, obj18, i3, bArr)).collect(aido.a)).e(new onq(18), ((vgg) obj19).e);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.vtl vtlVar = (defpackage.vtl) obj;
                java.lang.Object obj20 = this.b;
                java.lang.Object obj21 = this.a;
                if (vtlVar == null) {
                    return ahvr.H(((defpackage.vgs) obj20).g().h(), new defpackage.vft(i2), ((vgg) obj21).e);
                }
                double d = ((double) vtlVar.b) / ((double) vtlVar.a);
                if (d >= 0.99d) {
                    throw new defpackage.vcv(defpackage.vbw.SYNC_ERROR_INBOX_FULL);
                }
                vgg vggVar = (vgg) obj21;
                return d >= ((java.lang.Double) vggVar.l.a()).doubleValue() ? ahvr.I(((defpackage.vgs) obj20).g().h(), new defpackage.vfv(obj21, this.c, i), vggVar.e) : ahvr.H(((defpackage.vgs) obj20).g().h(), new defpackage.vft(7), vggVar.e);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                aihd aihdVar = (aihd) obj;
                if (aihdVar.isEmpty()) {
                    return aiql.z(aike.a);
                }
                java.lang.Object obj22 = this.c;
                java.lang.Object obj23 = this.b;
                java.lang.Object obj24 = this.a;
                return ahvr.H(((defpackage.vgs) obj23).c("1:* SEEN NOT DELETED").h(), new icy(obj24, aihdVar, obj22, 17, (byte[]) null), ((vgg) obj24).e);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                vgg vggVar2 = (vgg) this.b;
                boolean zBooleanValue3 = ((java.lang.Boolean) vggVar2.m.a()).booleanValue();
                java.lang.Object obj25 = this.a;
                java.lang.Object obj26 = this.c;
                if (!zBooleanValue3) {
                    return ahvr.H(vggVar2.f(vggVar2.a((defpackage.vcn) obj25, (android.telecom.PhoneAccountHandle) obj26)), new defpackage.vft(14), vggVar2.e);
                }
                defpackage.vgx vgxVarA = vggVar2.a((defpackage.vcn) obj25, (android.telecom.PhoneAccountHandle) obj26);
                return vggVar2.h.g(vgxVarA.e, vgxVarA.a);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (!optional.isPresent()) {
                    return aiql.y(new java.lang.IllegalStateException("Cannot find inserted voicemail"));
                }
                java.lang.Object obj27 = this.c;
                java.lang.Object obj28 = this.b;
                java.lang.Object obj29 = this.a;
                aify aifyVarP = aify.p((defpackage.vdg) optional.orElseThrow());
                vgg vggVar3 = (vgg) obj29;
                return ahvr.I(vggVar3.c((defpackage.vgs) obj28, (android.telecom.PhoneAccountHandle) obj27, aifyVarP), new jsc(obj29, obj28, obj27, aifyVarP, 10, (byte[]) null), vggVar3.e);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((vgg) this.a).h((defpackage.vgs) this.b, (android.telecom.PhoneAccountHandle) this.c);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                boolean zIsPresent = optional2.isPresent();
                java.lang.Object obj30 = this.b;
                java.lang.Object obj31 = this.c;
                java.lang.Object obj32 = this.a;
                if (!zIsPresent) {
                    vgg.c.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmSyncService", "updateAudio", 787, "OmtpVvmSyncService.java").v("voicemail payload is empty");
                    vgg vggVar4 = (vgg) obj30;
                    ahrv ahrvVarG2 = ahrv.g(vggVar4.e((android.telecom.PhoneAccountHandle) obj31));
                    defpackage.vge vgeVar = new defpackage.vge(obj31, i10);
                    ajct ajctVar3 = vggVar4.e;
                    return ahrvVarG2.i(vgeVar, ajctVar3).h(new defpackage.vfp(obj30, obj32, i), ajctVar3);
                }
                defpackage.vgy vgyVar = (defpackage.vgy) optional2.orElseThrow();
                vgg vggVar5 = (vgg) obj30;
                ajcq ajcqVarI = vggVar5.h.i(((defpackage.vdg) obj32).a, vgyVar.b, vgyVar.a);
                android.telecom.PhoneAccountHandle phoneAccountHandle2 = (android.telecom.PhoneAccountHandle) obj31;
                ajcq ajcqVarE = vggVar5.e(phoneAccountHandle2);
                defpackage.vge vgeVar2 = new defpackage.vge(obj31, i8);
                ajct ajctVar4 = vggVar5.e;
                ajcq ajcqVarI2 = ahvr.I(ajcqVarE, vgeVar2, ajctVar4);
                return ahvr.H(ahvr.ak(new ajcq[]{ajcqVarI, ajcqVarI2}).o(new kxy(obj30, ajcqVarI2, ajcqVarI, obj32, phoneAccountHandle2, 7), ajctVar4), new defpackage.vft(i3), ajctVar4);
            case 15:
                return ((vgg) this.a).c((defpackage.vgs) this.b, (android.telecom.PhoneAccountHandle) this.c, (aify) j$.util.Collection.-EL.stream((java.util.List) obj).filter(new vgb(3)).collect(aido.a));
            case 16:
                vgg.c.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmSyncService", "markServerVoicemailsAsRead", 385, "OmtpVvmSyncService.java").v("Marking server voicemails as read");
                aify aifyVar = ((defpackage.vfg) this.c).d;
                aify aifyVar2 = (aify) j$.util.Collection.-EL.stream(aifyVar).map(new defpackage.vga(i11)).map(new defpackage.vga(i9)).collect(aido.a);
                java.lang.Object obj33 = this.b;
                ahrv ahrvVarG3 = ahrv.g(((defpackage.vgs) obj33).f(new defpackage.vez(obj33, aifyVar2, i7, bArr)).h());
                java.lang.Object obj34 = this.a;
                return ahrvVarG3.i(new defpackage.vfv(obj34, aifyVar, 8, bArr), ((vgg) obj34).e);
            case 17:
                aify aifyVar3 = ((defpackage.vfg) this.c).f;
                j$.util.stream.Stream map = j$.util.Collection.-EL.stream(aifyVar3).map(new defpackage.vga(i11));
                j$.util.stream.Collector collector = aido.a;
                aify aifyVar4 = (aify) map.collect(collector);
                aify aifyVar5 = (aify) j$.util.Collection.-EL.stream(aifyVar3).map(new defpackage.var(i5)).collect(collector);
                ahrv ahrvVarG4 = ahrv.g(((defpackage.vgs) this.b).e((aify) j$.util.Collection.-EL.stream(aifyVar4).map(new defpackage.vga(i9)).collect(collector)).h());
                java.lang.Object obj35 = this.a;
                return ahrvVarG4.i(new defpackage.vfv(obj35, aifyVar5, i10, bArr), ((vgg) obj35).e);
            case 18:
                return ((vgg) this.a).h((defpackage.vgs) this.b, (android.telecom.PhoneAccountHandle) this.c);
            case 19:
                vee veeVar2 = (vee) ((j$.util.Optional) obj).orElseThrow();
                akzx akzxVarM5 = defpackage.vcm.a.m();
                boolean zBooleanValue4 = ((java.lang.Boolean) ((vgg) this.b).n.a()).booleanValue();
                java.lang.Object obj36 = this.a;
                java.lang.String string = zBooleanValue4 ? ((defpackage.vdg) obj36).c : java.lang.Long.toString(((defpackage.vdg) obj36).b);
                java.lang.Object obj37 = this.c;
                akzxVarM5.u();
                defpackage.vcm vcmVar = (defpackage.vcm) akzxVarM5.b;
                j$.util.Objects.requireNonNull(string);
                vcmVar.c = string;
                java.lang.String string2 = ((defpackage.vdg) obj36).a.toString();
                akzxVarM5.u();
                defpackage.vcm vcmVar2 = (defpackage.vcm) akzxVarM5.b;
                j$.util.Objects.requireNonNull(string2);
                vcmVar2.b = string2;
                return ahvr.I(veeVar2.a((android.telecom.PhoneAccountHandle) obj37), new defpackage.ved(veeVar2, (defpackage.vcm) akzxVarM5.p(), obj37, 2, (char[]) null), veeVar2.e);
            default:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return ajcm.a;
                }
                java.lang.Object obj38 = this.a;
                java.lang.Object obj39 = this.c;
                java.lang.Object obj40 = this.b;
                defpackage.vfm vfmVar = new defpackage.vfm(obj40, obj39, i10);
                ajct ajctVar5 = ((vgg) obj40).e;
                return ahvr.Q(vfmVar, ajctVar5).i(new defpackage.ved(obj40, obj39, obj38, 19, (byte[]) null), ajctVar5);
        }
    }

    public /* synthetic */ ved(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ ved(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ ved(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ ved(vgg vggVar, aify aifyVar, defpackage.vgs vgsVar, int i) {
        this.$cid = i;
        this.c = vggVar;
        this.b = aifyVar;
        this.a = vgsVar;
    }
}
