package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class veb implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ veb(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0286  */
    public final java.lang.Object apply(java.lang.Object obj) {
        boolean z;
        switch (this.$cid) {
            case 0:
                return (defpackage.vck) ((java.util.concurrent.atomic.AtomicReference) this.a).get();
            case 1:
                vcl vclVar = (vcl) obj;
                int i = ((defpackage.vck) this.a).c;
                alat alatVar = vclVar.b;
                for (int i2 = 0; i2 < alatVar.size(); i2++) {
                    defpackage.vck vckVar = (defpackage.vck) alatVar.get(i2);
                    if (vckVar.c == i) {
                        akzx akzxVarP = vckVar.p();
                        int i3 = vckVar.f + 1;
                        akzxVarP.u();
                        ((defpackage.vck) akzxVarP.b).f = i3;
                        defpackage.vck vckVar2 = (defpackage.vck) akzxVarP.p();
                        akzx akzxVarP2 = vclVar.p();
                        akzxVarP2.u();
                        vcl vclVar2 = akzxVarP2.b;
                        j$.util.Objects.requireNonNull(vckVar2);
                        vclVar2.b();
                        vclVar2.b.set(i2, vckVar2);
                        return akzxVarP2.p();
                    }
                }
                throw new java.lang.IllegalArgumentException(a.bj(i, "Job could not be found: "));
            case 2:
                vcl vclVar3 = (vcl) obj;
                int i4 = ((defpackage.vck) this.a).c;
                alat alatVar2 = vclVar3.b;
                for (int i5 = 0; i5 < alatVar2.size(); i5++) {
                    if (((defpackage.vck) alatVar2.get(i5)).c == i4) {
                        akzx akzxVarP3 = vclVar3.p();
                        akzxVarP3.u();
                        vcl vclVar4 = akzxVarP3.b;
                        vclVar4.b();
                        vclVar4.b.remove(i5);
                        return akzxVarP3.p();
                    }
                }
                throw new java.lang.IllegalArgumentException(a.bj(i4, "Job could not be found: "));
            case 3:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj2 = this.a;
                if (zBooleanValue) {
                    j$.time.Instant instantNow = j$.time.Instant.now();
                    alcf alcfVar = ((defpackage.vck) obj2).h;
                    if (alcfVar == null) {
                        alcfVar = alcf.a;
                    }
                    j$.time.Duration durationBetween = j$.time.Duration.between(ajsz.dK(alcfVar), instantNow);
                    akzx akzxVarM = defpackage.amsi.a.m();
                    akzxVarM.u();
                    defpackage.amsi amsiVar = (defpackage.amsi) akzxVarM.b;
                    amsiVar.d = 2;
                    amsiVar.b |= 2;
                    akzm akzmVarDH = ajsz.dH(durationBetween);
                    akzxVarM.u();
                    defpackage.amsi amsiVar2 = (defpackage.amsi) akzxVarM.b;
                    j$.util.Objects.requireNonNull(akzmVarDH);
                    amsiVar2.c = akzmVarDH;
                    amsiVar2.b |= 1;
                    return (defpackage.amsi) akzxVarM.p();
                }
                j$.time.Duration durationOfNanos = j$.time.Duration.ofNanos(aazc.b());
                defpackage.vcj vcjVar = ((defpackage.vck) obj2).g;
                if (vcjVar == null) {
                    vcjVar = defpackage.vcj.a;
                }
                akzm akzmVar = vcjVar.c;
                if (akzmVar == null) {
                    akzmVar = akzm.a;
                }
                j$.time.Duration durationMinus = durationOfNanos.minus(ajsz.dJ(akzmVar));
                akzx akzxVarM2 = defpackage.amsi.a.m();
                akzxVarM2.u();
                defpackage.amsi amsiVar3 = (defpackage.amsi) akzxVarM2.b;
                amsiVar3.d = 1;
                amsiVar3.b |= 2;
                akzm akzmVarDH2 = ajsz.dH(durationMinus);
                akzxVarM2.u();
                defpackage.amsi amsiVar4 = (defpackage.amsi) akzxVarM2.b;
                j$.util.Objects.requireNonNull(akzmVarDH2);
                amsiVar4.c = akzmVarDH2;
                amsiVar4.b |= 1;
                return (defpackage.amsi) akzxVarM2.p();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.lang.Integer num = (java.lang.Integer) obj;
                if (num.intValue() != -1) {
                    defpackage.vcj vcjVar2 = ((defpackage.vck) this.a).g;
                    if (vcjVar2 == null) {
                        vcjVar2 = defpackage.vcj.a;
                    }
                    z = vcjVar2.d != num.intValue();
                }
                return java.lang.Boolean.valueOf(z);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                android.os.Bundle bundle = (android.os.Bundle) obj;
                akzx akzxVarM3 = defpackage.vek.a.m();
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) this.a;
                java.lang.String strFlattenToString = phoneAccountHandle.getComponentName().flattenToString();
                akzxVarM3.u();
                defpackage.vek vekVar = (defpackage.vek) akzxVarM3.b;
                j$.util.Objects.requireNonNull(strFlattenToString);
                vekVar.d = strFlattenToString;
                java.lang.String id = phoneAccountHandle.getId();
                akzxVarM3.u();
                defpackage.vek vekVar2 = (defpackage.vek) akzxVarM3.b;
                j$.util.Objects.requireNonNull(id);
                vekVar2.e = id;
                ahvr.bN(bundle.containsKey("st"), "missing provisioning status");
                java.lang.String str = (!bundle.getString("st").equals("R") || bundle.containsKey("pw")) ? "STATUS" : "SYNC";
                int iHashCode = str.hashCode();
                if (iHashCode != -1839152142) {
                    if (iHashCode == 2560667 && str.equals("SYNC")) {
                        akzx akzxVarM4 = defpackage.vep.a.m();
                        defpackage.veq veqVar = defpackage.veq.EVENT_MAILBOX_UPDATE;
                        akzxVarM4.u();
                        ((defpackage.vep) akzxVarM4.b).c = veqVar.a();
                        defpackage.vep vepVar = (defpackage.vep) akzxVarM4.p();
                        akzxVarM3.u();
                        defpackage.vek vekVar3 = (defpackage.vek) akzxVarM3.b;
                        j$.util.Objects.requireNonNull(vepVar);
                        vekVar3.c = vepVar;
                        vekVar3.b = 2;
                        return (defpackage.vek) akzxVarM3.p();
                    }
                } else if (str.equals("STATUS")) {
                    defpackage.veo veoVarC = ven.c(phoneAccountHandle, bundle);
                    akzxVarM3.u();
                    defpackage.vek vekVar4 = (defpackage.vek) akzxVarM3.b;
                    j$.util.Objects.requireNonNull(veoVarC);
                    vekVar4.c = veoVarC;
                    vekVar4.b = 1;
                    return (defpackage.vek) akzxVarM3.p();
                }
                throw new java.lang.IllegalArgumentException("unrecognized sms prefix: ".concat(str));
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                zzx zzxVar = ((vew) this.a).f;
                vcs vcsVar = (vcs) obj;
                return zzxVar.k().containsKey(vcsVar) ? j$.util.Optional.of((defpackage.vjr) ((aoin) zzxVar.k().get(vcsVar)).a()) : j$.util.Optional.empty();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                a.bI(defpackage.vfa.a.d(), "receive a invalid sms", "com/android/dialer/voicemail/service/impl/sms/receiver/AdnMessageReceiver", "onReceive", 'u', "AdnMessageReceiver.java", zct.b);
                defpackage.vfa vfaVar = (defpackage.vfa) this.a;
                vfaVar.g.o(rmx.gk);
                akzx akzxVarM5 = defpackage.amsp.a.m();
                java.lang.String string = java.util.UUID.randomUUID().toString();
                akzxVarM5.u();
                defpackage.amsp amspVar = (defpackage.amsp) akzxVarM5.b;
                j$.util.Objects.requireNonNull(string);
                amspVar.b |= 1;
                amspVar.c = string;
                akzxVarM5.u();
                defpackage.amsp amspVar2 = (defpackage.amsp) akzxVarM5.b;
                amspVar2.d = 7;
                amspVar2.b |= 2;
                akzxVarM5.u();
                defpackage.amsp amspVar3 = (defpackage.amsp) akzxVarM5.b;
                amspVar3.e = 2;
                amspVar3.b |= 4;
                vfaVar.f.c((defpackage.amsp) akzxVarM5.p());
                return null;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                vcs vcsVar2 = (vcs) obj;
                zzx zzxVar2 = (zzx) ((gat) this.a).b;
                return zzxVar2.k().containsKey(vcsVar2) ? j$.util.Optional.of((defpackage.viy) ((aoin) zzxVar2.k().get(vcsVar2)).a()) : j$.util.Optional.empty();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ((gat) this.a).A((vcs) obj);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ((gat) this.a).z((vcs) obj);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                vfo vfoVar = (vfo) this.a;
                vfoVar.g.n(rmw.aG);
                vfoVar.i.i((java.lang.String) null).a(mcd.am);
                return ((defpackage.vcx) obj).a;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return ((gat) this.a).A((vcs) obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((gat) this.a).z((vcs) obj);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                java.lang.Object obj3 = this.a;
                rmw rmwVar = rmw.aF;
                vfo vfoVar2 = (vfo) obj3;
                rlv rlvVar = vfoVar2.g;
                rlvVar.n(rmwVar);
                rlvVar.n(rmw.aw);
                vfoVar2.i.i((java.lang.String) null).a(mcd.am);
                vfoVar2.h.f(vfo.b);
                return null;
            case 15:
                ((vfo) this.a).g.n(rmw.aD);
                return null;
            case 16:
                aimz aimzVar = vfo.a;
                return this.a;
            case 17:
                vcs vcsVar3 = (vcs) obj;
                zzx zzxVar3 = (zzx) ((gat) this.a).a;
                return zzxVar3.k().containsKey(vcsVar3) ? j$.util.Optional.of((defpackage.vjc) ((aoin) zzxVar3.k().get(vcsVar3)).a()) : j$.util.Optional.empty();
            case 18:
                aimz aimzVar2 = vfo.a;
                return this.a;
            case 19:
                return java.lang.Boolean.valueOf(((vfu) this.a).y((vbu) obj));
            default:
                return java.lang.Boolean.valueOf(((vfu) this.a).x((vbu) obj));
        }
    }
}
