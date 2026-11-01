package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vfp implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ vfp(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, kfj] */
    public final java.lang.Object apply(java.lang.Object obj) {
        defpackage.vbs vbsVarB;
        defpackage.wqp wqpVar;
        int i = 10;
        java.lang.String str = null;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                str = (vcr) obj;
                if (((vcr) str).b == 1) {
                    java.lang.Object obj2 = this.b;
                    agsm.i(978, ((vfr) this.a).b.i((android.telecom.PhoneAccountHandle) obj2), "Failure scheduling VVM sync from OmtpVvmCarrierService#activate for %s", new java.lang.Object[]{obj2});
                }
                return str;
            case 1:
                str = (vcr) obj;
                if (((vcr) str).b == 1) {
                    java.lang.Object obj3 = this.b;
                    vfr vfrVar = (vfr) this.a;
                    vfrVar.a.g(vfrVar.b.i((android.telecom.PhoneAccountHandle) obj3), 3L, java.util.concurrent.TimeUnit.SECONDS);
                }
                return str;
            case 2:
                str = (vcr) obj;
                if (((vcr) str).b == 1) {
                    java.lang.Object obj4 = this.b;
                    agsm.i(979, ((vfr) this.a).b.j((android.telecom.PhoneAccountHandle) obj4), "Failure scheduling VVM update status from OmtpVvmCarrierService#changePin for %s", new java.lang.Object[]{obj4});
                    return str;
                }
                return str;
            case 3:
                android.net.Uri uri = (android.net.Uri) obj;
                defpackage.vdf vdfVar = new defpackage.vdf();
                defpackage.vgx vgxVar = (defpackage.vgx) this.a;
                java.lang.String str2 = vgxVar.a;
                vdfVar.g(str2);
                vdfVar.d(false);
                vdfVar.e(false);
                vdfVar.f(vgxVar.f);
                vdfVar.c(((java.lang.Boolean) ((vgg) this.b).n.a()).booleanValue() ? android.content.ContentUris.parseId(uri) : java.lang.Long.parseLong(str2));
                vdfVar.h(vgxVar.h);
                vdfVar.i(uri);
                vdfVar.b(false);
                vdfVar.c = defpackage.uzm.TRANSCRIPTION_NOT_STARTED;
                return vdfVar.a();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    java.lang.Object obj5 = this.b;
                    java.lang.Object obj6 = this.a;
                    defpackage.vdm vdmVar = new defpackage.vdm();
                    vgg vggVar = (vgg) obj6;
                    vdmVar.c(j$.util.Optional.of(vggVar.d.getString(2132021024)));
                    agsm.i(982, vggVar.h.h(((defpackage.vdg) obj5).a, vdmVar.a()), "Failed to update the default transcription text!", new java.lang.Object[0]);
                }
                return java.lang.Boolean.FALSE;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                akzx akzxVarP = ((vgn) obj).p();
                java.lang.Object obj7 = this.a;
                j$.util.Objects.requireNonNull(obj7);
                java.lang.Object obj8 = this.b;
                j$.util.Objects.requireNonNull(obj8);
                akzxVarP.u();
                akzxVarP.b.b().put(obj7, obj8);
                return akzxVarP.p();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj9 = this.b;
                if (zBooleanValue) {
                    vix.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/network/impl/VvmNetworkRequestImpl", "createNetworkRequestNew", 251, "VvmNetworkRequestImpl.java").y("remove NOT_RESTRICTED for %s", this.a);
                    ((android.net.NetworkRequest.Builder) obj9).removeCapability(13);
                }
                android.net.NetworkRequest networkRequestBuild = ((android.net.NetworkRequest.Builder) obj9).build();
                vix.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/network/impl/VvmNetworkRequestImpl", "createNetworkRequestNew", 255, "VvmNetworkRequestImpl.java").y("Built network request: %s", networkRequestBuild);
                return networkRequestBuild;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                vli vliVar = (vli) this.a;
                ailj ailjVarK = vliVar.f.e().k();
                while (ailjVarK.hasNext()) {
                    ((rsr) ailjVarK.next()).z((android.telecom.PhoneAccountHandle) this.b);
                }
                vliVar.d.o(rmx.gm);
                return null;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return java.lang.Integer.valueOf(((vlm) this.a).i.b((android.telecom.PhoneAccountHandle) this.b));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                str = (vcr) obj;
                if (((vcr) str).b != 1) {
                    zjm zjmVar = ((vlm) this.a).k;
                    if (!zjmVar.g().isPresent()) {
                        throw new java.lang.IllegalStateException("VvmServiceProvider must be present. Should never get here");
                    }
                    vcp vcpVar = ((vcr) str).b == 2 ? (vcp) ((vcr) str).c : vcp.a;
                    if (vcpVar.b == 1) {
                        vbsVarB = defpackage.vbs.b(((java.lang.Integer) vcpVar.c).intValue());
                        if (vbsVarB == null) {
                            vbsVarB = defpackage.vbs.UNRECOGNIZED;
                        }
                    } else {
                        vbsVarB = defpackage.vbs.UNSPECIFIED;
                    }
                    if (vbsVarB == defpackage.vbs.STATUS_CHECK_NEEDS_ACTIVATION) {
                        java.lang.Object obj10 = this.b;
                        j$.util.Optional optionalT = zjm.t(zjmVar, (android.telecom.PhoneAccountHandle) obj10);
                        defpackage.vdi vdiVar = new defpackage.vdi(obj10, 12);
                        if (true == optionalT.isPresent()) {
                            agsm.i(985, ((vee) optionalT.get()).g((android.telecom.PhoneAccountHandle) vdiVar.a), "Failure scheduling VVM Activation from RestVvmCarrierService#updateStatus", new java.lang.Object[0]);
                            return str;
                        }
                    }
                }
                return str;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                str = (vcr) obj;
                if (((vcr) str).b == 1) {
                    java.lang.Object obj11 = this.b;
                    j$.util.Optional optionalT2 = zjm.t(((vlm) this.a).k, (android.telecom.PhoneAccountHandle) obj11);
                    defpackage.vdi vdiVar2 = new defpackage.vdi(obj11, i);
                    if (true == optionalT2.isPresent()) {
                        agsm.i(984, ((vee) optionalT2.get()).j((android.telecom.PhoneAccountHandle) vdiVar2.a), "Failure scheduling VVM update status from RestVvmCarrierService#changePin", new java.lang.Object[0]);
                        return str;
                    }
                }
                return str;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                vcr vcrVar = (vcr) obj;
                if (vcrVar.b == 1) {
                    java.lang.Object obj12 = this.b;
                    vlm vlmVar = (vlm) this.a;
                    android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) obj12;
                    lop lopVarE = new jyn(vlmVar.b, phoneAccountHandle).e();
                    lopVarE.d("u", (java.lang.String) null);
                    lopVarE.d("pw", (java.lang.String) null);
                    lopVarE.a();
                    vlmVar.l.i((java.lang.String) null).b(mce.dO);
                    j$.util.Optional optionalT3 = zjm.t(vlmVar.k, phoneAccountHandle);
                    defpackage.vdi vdiVar3 = new defpackage.vdi(obj12, 11);
                    if (true == optionalT3.isPresent()) {
                        agsm.i(983, ((vee) optionalT3.get()).i((android.telecom.PhoneAccountHandle) vdiVar3.a), "Failure scheduling VVM Sync from RestVvmCarrierService#activate", new java.lang.Object[0]);
                    }
                }
                return vcrVar;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    throw new java.lang.IllegalStateException("Need read phone state permission");
                }
                str = (java.lang.String) ((vlm) this.a).j.i((android.telecom.PhoneAccountHandle) this.b).v().orElse((java.lang.Object) null);
                if (android.text.TextUtils.isEmpty(str)) {
                    throw new java.lang.IllegalStateException("SIM MSISDN not available");
                }
                return str;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                oko okoVar = ((vmc) this.a).n;
                defpackage.vcf vcfVar = (defpackage.vcf) obj;
                java.lang.Object obj13 = this.b;
                boolean zAa = okoVar.aa();
                boolean z2 = ((android.os.PersistableBundle) okoVar.i((android.telecom.PhoneAccountHandle) obj13).s().orElseThrow(new defpackage.vjq(i))).getBoolean("VVMIgnoreDataRoaming");
                if (vcfVar != defpackage.vcf.a && (!zAa || z2)) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                oko okoVar2 = ((vmc) this.a).n;
                java.lang.Object obj14 = this.b;
                boolean zAa2 = okoVar2.aa();
                boolean z3 = ((android.os.PersistableBundle) okoVar2.i((android.telecom.PhoneAccountHandle) obj14).s().orElseThrow(new defpackage.vjq(i))).getBoolean("VVMIgnoreDataRoaming");
                if (((java.lang.Boolean) obj).booleanValue() && (!zAa2 || z3)) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 15:
                vnu.a.b().l("com/android/dialer/voicemail/service/sodatranscribe/impl/VvmSodaTranscriptionWorkStarter", "enqueueSodaTranscription", 199, "VvmSodaTranscriptionWorkStarter.java").y("Succeeded to enqueue soda transcription work %s", this.b);
                ((vnu) this.a).b.o(rmx.li);
                return java.lang.Integer.valueOf(((java.util.UUID) obj).hashCode());
            case 16:
                defpackage.zul zulVar = (defpackage.zul) obj;
                defpackage.wcz.a.b().l("com/android/dialer/wearsender/spamandcallerid/SpamAndCallerIdInfoSender", "sendSpamAndCallerIdInfo", 157, "SpamAndCallerIdInfoSender.java").y("SentStatus: %s", zulVar.name());
                java.lang.Object obj15 = this.b;
                if (zulVar == defpackage.zul.a) {
                    ((defpackage.wcz) obj15).d.a = true;
                }
                java.lang.Object obj16 = this.a;
                defpackage.wdd wddVar = ((defpackage.wcz) obj15).d;
                wddVar.c(zulVar);
                defpackage.zue zueVar = (defpackage.zue) obj16;
                wddVar.b = zueVar.c;
                wddVar.c = (zueVar.b & 2) != 0;
                return null;
            default:
                java.util.concurrent.atomic.AtomicLong atomicLong = ((whj) this.a).d;
                atomicLong.set(0L);
                ailj ailjVarK2 = ((aigf) obj).e().k();
                while (ailjVarK2.hasNext()) {
                    ?? r1 = this.b;
                    java.util.Map.Entry entry = (java.util.Map.Entry) ailjVarK2.next();
                    java.lang.Long l = (java.lang.Long) entry.getKey();
                    long jLongValue = l.longValue();
                    kfk kfkVar = (kfk) r1;
                    if (!kfkVar.a.containsKey(l) && !kfkVar.c.contains(l) && (wqpVar = (defpackage.wqp) entry.getValue()) != null) {
                        android.content.ContentValues contentValues = new android.content.ContentValues();
                        defpackage.wqt wqtVar = wqpVar.e;
                        if (wqtVar == null) {
                            wqtVar = defpackage.wqt.a;
                        }
                        defpackage.wgu wguVar = wqtVar.d;
                        if (wguVar == null) {
                            wguVar = defpackage.wgu.a;
                        }
                        contentValues.put("xatu_call_details", wguVar.i());
                        r1.d(jLongValue, contentValues);
                        j$.util.concurrent.atomic.DesugarAtomicLong.getAndAccumulate(atomicLong, wqpVar.d, new kvc(5));
                    }
                }
                return str;
        }
    }

    public /* synthetic */ vfp(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
