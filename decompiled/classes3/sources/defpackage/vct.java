package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vct implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ vct(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v49, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a(java.lang.Object obj) {
        int i = 3;
        int i2 = 2;
        switch (this.$cid) {
            case 0:
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (!optional.isPresent()) {
                    return ajcm.a;
                }
                zth zthVar = (zth) this.a;
                return ahrv.g(((zjm) zthVar.c).m((android.telecom.PhoneAccountHandle) optional.orElseThrow())).i(new defpackage.udu(optional, 20), (java.util.concurrent.Executor) zthVar.d);
            case 1:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                if (!optional2.isPresent()) {
                    return ajcm.a;
                }
                zth zthVar2 = (zth) this.a;
                return ahrv.g(((zjm) zthVar2.c).m((android.telecom.PhoneAccountHandle) optional2.orElseThrow())).i(new defpackage.udu(optional2, 19), (java.util.concurrent.Executor) zthVar2.d);
            case 2:
                java.util.List list = (java.util.List) obj;
                j$.util.stream.Stream stream = j$.util.Collection.-EL.stream(list);
                java.lang.Object obj2 = this.a;
                j$.util.stream.Stream map = stream.map(new thy(obj2, 8));
                j$.util.stream.Collector collector = aido.a;
                ahrv ahrvVarM = ahvr.M((java.lang.Iterable) map.collect(collector));
                vak vakVar = new vak(7);
                ?? r6 = ((zth) obj2).d;
                return ahvr.ak(new ajcq[]{ahrvVarM.h(vakVar, (java.util.concurrent.Executor) r6), ahvr.M((java.lang.Iterable) j$.util.Collection.-EL.stream(list).map(new thy(obj2, 9)).collect(collector)).h(new vak(8), (java.util.concurrent.Executor) r6)}).o(new onq(15), (java.util.concurrent.Executor) r6);
            case 3:
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                defpackage.vdj vdjVar = new defpackage.vdj(this.a, 2);
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(((vcg) optionalOfNullable.get()).n((android.telecom.PhoneAccountHandle) vdjVar.a));
                }
                return (ajcq) optionalOfNullable.orElse(aiql.z(java.lang.Boolean.FALSE));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((vcc) obj).c((android.telecom.PhoneAccountHandle) this.a);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.vck vckVar = (defpackage.vck) obj;
                vee veeVar = (vee) this.a;
                veeVar.d.isPresent();
                defpackage.vce vceVar = vckVar.e;
                if (vceVar == null) {
                    vceVar = defpackage.vce.a;
                }
                agux aguxVar = vceVar.b == 4 ? new agux(1L, java.util.concurrent.TimeUnit.MINUTES) : new agux(0L, java.util.concurrent.TimeUnit.MINUTES);
                aift aiftVar = new aift(4);
                grl grlVar = new grl();
                grlVar.b(gsi.b);
                grn grnVarA = grlVar.a();
                aguv aguvVarA = aguz.a(veh.class);
                aguvVarA.f(new aguy(java.lang.String.valueOf(vckVar.c), 2));
                defpackage.vco vcoVar = vckVar.d;
                if (vcoVar == null) {
                    vcoVar = defpackage.vco.a;
                }
                java.lang.String str = vcoVar.c;
                defpackage.vce vceVar2 = vckVar.e;
                if (vceVar2 == null) {
                    vceVar2 = defpackage.vce.a;
                }
                zjx zjxVar = veeVar.b;
                aguvVarA.e(aihd.r(str, defpackage.vcd.a(vceVar2.b).name()));
                aguvVarA.b(grnVarA);
                ipc ipcVar = new ipc((char[]) null);
                ipcVar.v("id", vckVar.c);
                aguvVarA.f = ipcVar.q();
                aguvVarA.c(aguxVar);
                aiftVar.i(zjxVar.b(aguvVarA.a()));
                return ahvr.aj(aiftVar.h()).o(new onq(16), ajbm.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ((vcc) obj).c((android.telecom.PhoneAccountHandle) this.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((vcc) obj).d((android.telecom.PhoneAccountHandle) this.a);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                j$.util.Optional optional3 = (j$.util.Optional) obj;
                if (!optional3.isPresent()) {
                    return aiql.z(new gsd());
                }
                java.lang.Object obj3 = this.a;
                defpackage.vck vckVar2 = (defpackage.vck) optional3.orElseThrow();
                defpackage.veg vegVar = (defpackage.veg) obj3;
                return ahrv.g(vegVar.a()).i(new defpackage.vec(obj3, (java.lang.Object) vckVar2, i2), vegVar.c).i(new defpackage.vec(obj3, (java.lang.Object) vckVar2, i), ajbm.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ((java.lang.Boolean) obj).booleanValue() ? aiql.z(j$.util.Optional.empty()) : this.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                j$.util.Optional optional4 = (j$.util.Optional) obj;
                if (!optional4.isPresent()) {
                    return ajcm.a;
                }
                java.lang.Object obj4 = this.a;
                final defpackage.vjr vjrVar = (defpackage.vjr) optional4.orElseThrow();
                ajcq ajcqVarF = ahvr.F(new defpackage.vez(vjrVar, obj4, 18), vjrVar.c);
                final defpackage.vek vekVar = (defpackage.vek) obj4;
                return ahvr.I(ajcqVarF, new ajat() { // from class: vjp
                    public final ajcq a(java.lang.Object obj5) {
                        ahrv ahrvVarY;
                        j$.util.Optional optionalOfNullable2 = (j$.util.Optional) obj5;
                        defpackage.vjo vjoVar = new defpackage.vjo(vjrVar, vekVar);
                        if (true == optionalOfNullable2.isPresent()) {
                            java.lang.Object obj6 = optionalOfNullable2.get();
                            defpackage.vjr vjrVar2 = vjoVar.a;
                            defpackage.vek vekVar2 = vjoVar.b;
                            android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) obj6;
                            int i3 = vekVar2.b;
                            if (i3 == 1) {
                                defpackage.veo veoVar = (defpackage.veo) vekVar2.c;
                                defpackage.vjr.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/standardomtp/DefaultOmtpSmsReceiver", "processStatusMessage", 104, "DefaultOmtpSmsReceiver.java").v("enter");
                                vjrVar2.e.o(rmx.jZ);
                                defpackage.vfm vfmVar = new defpackage.vfm(vjrVar2, phoneAccountHandle, 4);
                                ajct ajctVar = vjrVar2.b;
                                ahrvVarY = ahvr.Q(vfmVar, ajctVar).i(new defpackage.vfv(phoneAccountHandle, veoVar, 11, null), ajctVar);
                            } else {
                                if (i3 != 2) {
                                    int iAQ = a.aQ(i3);
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder("unrecognized sms prefix: ");
                                    sb.append(iAQ - 1);
                                    throw new java.lang.IllegalArgumentException(sb.toString());
                                }
                                defpackage.vep vepVar = (defpackage.vep) vekVar2.c;
                                aimz aimzVar = defpackage.vjr.a;
                                aimzVar.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/standardomtp/DefaultOmtpSmsReceiver", "processSyncMessage", 116, "DefaultOmtpSmsReceiver.java").v("enter");
                                defpackage.veq veqVarB = defpackage.veq.b(vepVar.c);
                                if (veqVarB == null) {
                                    veqVarB = defpackage.veq.UNRECOGNIZED;
                                }
                                defpackage.veq veqVar = veqVarB;
                                aimzVar.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/standardomtp/DefaultOmtpSmsReceiver", "processSyncMessage", 119, "DefaultOmtpSmsReceiver.java").y("Received SYNC sms with event %s", veqVar);
                                int iOrdinal = veqVar.ordinal();
                                if (iOrdinal != 1) {
                                    int i4 = 3;
                                    if (iOrdinal == 2) {
                                        defpackage.vfm vfmVar2 = new defpackage.vfm(vjrVar2, phoneAccountHandle, i4);
                                        ajct ajctVar2 = vjrVar2.b;
                                        ahrvVarY = ahvr.Q(vfmVar2, ajctVar2).i(new defpackage.vge(phoneAccountHandle, 5), ajctVar2);
                                    } else {
                                        if (iOrdinal == 3) {
                                            throw new java.lang.UnsupportedOperationException("Not implemented yet");
                                        }
                                        a.bt(aimzVar.c().m(aioa.b), "Unrecognized sync trigger event: %s", veqVar, "com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/standardomtp/DefaultOmtpSmsReceiver", "processSyncMessage", (char) 199, "DefaultOmtpSmsReceiver.java", zct.b);
                                        ahrvVarY = ajcm.a;
                                    }
                                } else {
                                    java.lang.String str2 = vepVar.d;
                                    if (!"v".equals(str2)) {
                                        a.bt(aimzVar.d(), "Non-voice message of type '%s' received, ignoring", str2, "com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/standardomtp/DefaultOmtpSmsReceiver", "processSyncMessage", (char) 127, "DefaultOmtpSmsReceiver.java", zct.b);
                                        ahrvVarY = ajcm.a;
                                    } else if ((vepVar.b & 1) != 0) {
                                        aoin aoinVar = vjrVar2.f;
                                        ajcq ajcqVarH = ajcm.a;
                                        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                                            vdo vdoVar = vjrVar2.g;
                                            defpackage.vdk vdkVar = new defpackage.vdk();
                                            defpackage.vcn vcnVar = vepVar.e;
                                            if (vcnVar == null) {
                                                vcnVar = defpackage.vcn.a;
                                            }
                                            vdkVar.f(vcnVar.c);
                                            defpackage.vcn vcnVar2 = vepVar.e;
                                            if (vcnVar2 == null) {
                                                vcnVar2 = defpackage.vcn.a;
                                            }
                                            alcf alcfVar = vcnVar2.d;
                                            if (alcfVar == null) {
                                                alcfVar = alcf.a;
                                            }
                                            vdkVar.b(j$.time.Duration.ofSeconds(alcfVar.b).toMillis());
                                            defpackage.vcn vcnVar3 = vepVar.e;
                                            if (vcnVar3 == null) {
                                                vcnVar3 = defpackage.vcn.a;
                                            }
                                            akzm akzmVar = vcnVar3.f;
                                            if (akzmVar == null) {
                                                akzmVar = akzm.a;
                                            }
                                            vdkVar.c(akzmVar.b);
                                            defpackage.vcn vcnVar4 = vepVar.e;
                                            if (vcnVar4 == null) {
                                                vcnVar4 = defpackage.vcn.a;
                                            }
                                            vdkVar.g(vcnVar4.e);
                                            vdkVar.h(vjrVar2.h.getPackageName());
                                            vdkVar.e(phoneAccountHandle);
                                            vdkVar.d(false);
                                            ajcqVarH = ahvr.H(vdoVar.d(vdkVar.a()), new defpackage.vft(18), vjrVar2.b);
                                        }
                                        ahrv ahrvVarG = ahrv.g(ajcqVarH);
                                        defpackage.vfv vfvVar = new defpackage.vfv(vjrVar2, phoneAccountHandle, 12);
                                        ajct ajctVar3 = vjrVar2.b;
                                        ahrvVarY = ahrvVarG.i(vfvVar, ajctVar3).i(new defpackage.vfv(phoneAccountHandle, vepVar, 13, null), ajctVar3).e(defpackage.vcv.class, new defpackage.vft(19), ajctVar3);
                                    } else {
                                        ahrvVarY = aiql.y(new java.lang.IllegalArgumentException("invalid vvm message"));
                                    }
                                }
                            }
                            optionalOfNullable2 = j$.util.Optional.ofNullable(ahrvVarY);
                        }
                        return (ajcq) optionalOfNullable2.orElseThrow(new defpackage.vjq(0));
                    }
                }, vjrVar.b);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                j$.util.Optional optionalOfNullable2 = (j$.util.Optional) obj;
                defpackage.vdj vdjVar2 = new defpackage.vdj(this.a, 3);
                if (true == optionalOfNullable2.isPresent()) {
                    optionalOfNullable2 = j$.util.Optional.ofNullable(((vcc) optionalOfNullable2.get()).d((android.telecom.PhoneAccountHandle) vdjVar2.a));
                }
                return (ajcq) optionalOfNullable2.orElse(aiql.z(java.lang.Boolean.FALSE));
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return ((defpackage.viy) obj).b((android.telecom.PhoneAccountHandle) this.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((defpackage.viy) obj).a((android.telecom.PhoneAccountHandle) this.a);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                j$.util.Optional optional5 = (j$.util.Optional) obj;
                if (optional5.isPresent()) {
                    return ((defpackage.viz) optional5.orElseThrow()).b(j$.util.Optional.of(this.a));
                }
                throw new java.lang.IllegalStateException("could not find SMS Builder for phone account");
            case 15:
                j$.util.Optional optional6 = (j$.util.Optional) obj;
                if (optional6.isPresent()) {
                    return ((defpackage.vja) optional6.orElseThrow()).a((android.telecom.PhoneAccountHandle) this.a);
                }
                throw new java.lang.IllegalStateException("could not find SMS receiver registry for phone account");
            case 16:
                j$.util.Optional optional7 = (j$.util.Optional) obj;
                if (optional7.isPresent()) {
                    return ((vfn) this.a).i.e((vzi) optional7.orElseThrow());
                }
                return aiql.z(java.lang.Boolean.FALSE);
            case 17:
                j$.util.Optional optional8 = (j$.util.Optional) obj;
                aimz aimzVar = vfo.a;
                if (optional8.isPresent()) {
                    return ((defpackage.vja) optional8.orElseThrow()).a((android.telecom.PhoneAccountHandle) this.a);
                }
                throw new java.lang.IllegalStateException("could not find SMS receiver registry for phone account");
            case 18:
                j$.util.Optional optional9 = (j$.util.Optional) obj;
                aimz aimzVar2 = vfo.a;
                if (optional9.isPresent()) {
                    return ((defpackage.viz) optional9.orElseThrow()).a(j$.util.Optional.of(this.a));
                }
                throw new java.lang.IllegalStateException("could not find SMS Builder for phone account");
            case 19:
                j$.util.Optional optional10 = (j$.util.Optional) obj;
                aimz aimzVar3 = vfo.a;
                return optional10.isPresent() ? ((defpackage.vjc) optional10.orElseThrow()).a((defpackage.veo) this.a) : aiql.z(defpackage.vjb.d);
            default:
                j$.util.Optional optional11 = (j$.util.Optional) obj;
                if (optional11.isPresent()) {
                    return ((defpackage.vja) optional11.orElseThrow()).b((android.telecom.PhoneAccountHandle) this.a);
                }
                throw new java.lang.IllegalStateException("could not find SMS receiver registry for phone account");
        }
    }
}
