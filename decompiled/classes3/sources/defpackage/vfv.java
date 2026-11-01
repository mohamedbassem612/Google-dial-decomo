package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vfv implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ vfv(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r10v35, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v37, types: [java.lang.Object, java.util.Collection] */
    public final ajcq a(java.lang.Object obj) {
        ajcq ajcqVarZ;
        int i = 2;
        int i2 = 4;
        int i3 = 19;
        int i4 = 0;
        switch (this.$cid) {
            case 0:
                return ((vfx) this.a).e.b((android.telecom.PhoneAccountHandle) this.b);
            case 1:
                return ((vfx) this.a).d.n((android.telecom.PhoneAccountHandle) this.b);
            case 2:
                return ((vgg) this.b).b((aify) this.a);
            case 3:
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (!optional.isPresent()) {
                    a.bI(vgg.c.d(), "Carrier transcription is not available", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmSyncService", "fetchTranscription", (char) 712, "OmtpVvmSyncService.java", zct.b);
                    return aiql.z(0);
                }
                java.lang.Object obj2 = this.b;
                vgg vggVar = (vgg) this.a;
                vggVar.i.n(rmw.bd);
                defpackage.vdm vdmVar = new defpackage.vdm();
                vdmVar.c(optional);
                return vggVar.h.h(((defpackage.vdg) obj2).a, vdmVar.a());
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                akzx akzxVarM = vzi.a.m();
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) this.b;
                java.lang.String id = phoneAccountHandle.getId();
                akzxVarM.u();
                vzi vziVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(id);
                vziVar.b |= 8;
                vziVar.f = id;
                java.lang.String strFlattenToString = phoneAccountHandle.getComponentName().flattenToString();
                akzxVarM.u();
                vzi vziVar2 = akzxVarM.b;
                j$.util.Objects.requireNonNull(strFlattenToString);
                vziVar2.b |= 4;
                vziVar2.e = strFlattenToString;
                vgg vggVar2 = (vgg) this.a;
                java.lang.String packageName = vggVar2.d.getPackageName();
                akzxVarM.u();
                vzi vziVar3 = akzxVarM.b;
                j$.util.Objects.requireNonNull(packageName);
                vziVar3.b |= 1;
                vziVar3.c = packageName;
                akzx akzxVarM2 = vcp.a.m();
                defpackage.vbw vbwVar = defpackage.vbw.SYNC_ERROR_INBOX_ALMOST_FULL;
                akzxVarM2.u();
                vcp vcpVar = akzxVarM2.b;
                vcpVar.c = java.lang.Integer.valueOf(vbwVar.a());
                vcpVar.b = 3;
                vcp vcpVarP = akzxVarM2.p();
                akzxVarM.u();
                vzi vziVar4 = akzxVarM.b;
                j$.util.Objects.requireNonNull(vcpVarP);
                vziVar4.g = vcpVarP;
                vziVar4.b |= 16;
                return vggVar2.o.e(akzxVarM.p());
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                vgg.c.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmSyncService", "markLocalVoicemailsAsRead", 371, "OmtpVvmSyncService.java").v("Marking local voicemail as read");
                aify aifyVar = (aify) j$.util.Collection.-EL.stream(((defpackage.vfg) this.b).c).map(new defpackage.var(i3)).collect(aido.a);
                defpackage.vdm vdmVar2 = new defpackage.vdm();
                vdmVar2.b(j$.util.Optional.of(java.lang.Boolean.TRUE));
                return ((vgg) this.a).h.j(aifyVar, vdmVar2.a());
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ((vgg) this.a).b(((defpackage.vfg) this.b).a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                vcr vcrVar = vgg.a;
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return ((defpackage.vgs) this.b).e((aify) j$.util.Collection.-EL.stream((java.util.Collection) this.a).map(new defpackage.vga(3)).collect(aido.a)).h();
                }
                a.bI(vgg.c.b(), "fail to fetch payload, skip deleting the archived voicemails from server", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmSyncService", "downloadAudioForArchivedVmAndDeleteFromServer", (char) 493, "OmtpVvmSyncService.java", zct.a);
                return ajcm.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                vgg.c.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmSyncService", "markServerVoicemailsAsRead", 396, "OmtpVvmSyncService.java").v("Marking voicemails as clean");
                vgg vggVar3 = (vgg) this.b;
                boolean zBooleanValue = ((java.lang.Boolean) vggVar3.n.a()).booleanValue();
                ?? r10 = this.a;
                aify aifyVar2 = zBooleanValue ? (aify) j$.util.Collection.-EL.stream((java.util.Collection) r10).map(new defpackage.var(20)).map(new defpackage.var(i3)).collect(aido.a) : (aify) j$.util.Collection.-EL.stream((java.util.Collection) r10).map(new defpackage.vga(1)).map(new defpackage.vga(0)).map(new defpackage.vga(2)).collect(aido.a);
                defpackage.vdm vdmVar3 = new defpackage.vdm();
                j$.util.Optional optionalOf = j$.util.Optional.of(java.lang.Boolean.FALSE);
                if (optionalOf == null) {
                    throw new java.lang.NullPointerException("Null isDirty");
                }
                vdmVar3.c = optionalOf;
                return vggVar3.h.j(aifyVar2, vdmVar3.a());
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ((vgj) this.a).e.a((vdd) ((j$.util.Optional) obj).orElseThrow(new defpackage.rqc(i3)), (android.telecom.PhoneAccountHandle) this.b);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                vix vixVar = (vix) this.a;
                if (!((java.lang.Boolean) vixVar.g.a()).booleanValue()) {
                    return ajcm.a;
                }
                java.lang.Object obj3 = this.b;
                vix.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/network/impl/VvmNetworkRequestImpl", "scheduleIpv4TimeoutIfNeeded", 304, "VvmNetworkRequestImpl.java").x("scheduling ipv4 timeout for %d ms", vixVar.a());
                return ahvr.D(new defpackage.viv(obj3, i4), vixVar.a() - 10, java.util.concurrent.TimeUnit.MILLISECONDS, vixVar.c);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                vee veeVar = (vee) ((j$.util.Optional) obj).orElseThrow();
                java.lang.Object obj4 = this.b;
                return ahvr.I(veeVar.a((android.telecom.PhoneAccountHandle) obj4), new defpackage.ved(veeVar, this.a, obj4, i4), veeVar.e);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return ((defpackage.vjr) this.a).i.m((android.telecom.PhoneAccountHandle) this.b);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                vee veeVar2 = (vee) ((j$.util.Optional) obj).orElseThrow();
                defpackage.vcn vcnVar = ((defpackage.vep) this.a).e;
                if (vcnVar == null) {
                    vcnVar = defpackage.vcn.a;
                }
                return veeVar2.k((android.telecom.PhoneAccountHandle) this.b, vcnVar, 1);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                if (!optional2.isPresent()) {
                    return aiql.z((java.lang.Object) null);
                }
                java.lang.Object obj5 = this.b;
                java.lang.Object obj6 = this.a;
                defpackage.voy voyVar = (defpackage.voy) optional2.orElseThrow();
                defpackage.vjy vjyVar = (defpackage.vjy) obj6;
                ahrv ahrvVarG = ahrv.g(vjyVar.b.c((android.telecom.PhoneAccountHandle) obj5));
                defpackage.vjx vjxVar = new defpackage.vjx(obj6, voyVar, obj5, 1, (byte[]) null);
                ajct ajctVar = vjyVar.a;
                return ahrvVarG.i(vjxVar, ajctVar).i(new defpackage.vjx(obj6, obj5, voyVar, i4), ajctVar).h(new defpackage.vfw(voyVar, 9), ajctVar);
            case 15:
                return ((defpackage.vka) this.a).f.a((android.telecom.PhoneAccountHandle) this.b);
            case 16:
                defpackage.vgi vgiVar = (defpackage.vgi) obj;
                if (!vgiVar.b().isPresent()) {
                    a.bI(defpackage.vka.a.d(), "default pin not found in SMS", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/standardomtp/StandardOmtpMailboxInitializer", "setupNewUser", '[', "StandardOmtpMailboxInitializer.java", zct.a);
                    throw new defpackage.vcx(defpackage.vbw.NETWORK_CONNECTION_AUTH_MAILBOX_NOT_INITIALIZED, "default pin not found in SMS");
                }
                java.lang.Object obj7 = this.b;
                java.lang.Object obj8 = this.a;
                defpackage.vka vkaVar = (defpackage.vka) obj8;
                return vkaVar.c.a((android.telecom.PhoneAccountHandle) obj7).d(new defpackage.vgc(obj8, vgiVar, obj7, i2), vkaVar.e).e();
            case 17:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return ajcm.a;
                }
                java.lang.Object obj9 = this.b;
                java.lang.Object obj10 = this.a;
                return ahvr.E(new defpackage.rqy(obj10, obj9, 14), ((defpackage.vke) obj10).a);
            case 18:
                java.lang.Object obj11 = this.a;
                java.lang.Object obj12 = this.b;
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                idc idcVar = new idc(obj11, obj12, 18, (byte[]) null);
                if (true == optionalOfNullable.isPresent()) {
                    java.lang.Object obj13 = optionalOfNullable.get();
                    java.lang.Object obj14 = idcVar.b;
                    java.lang.Object obj15 = idcVar.a;
                    java.lang.String str = ((defpackage.vgm) obj13).e;
                    if (str.indexOf(64) == -1) {
                        a.bI(defpackage.vkj.a.d(), "Invalid IMAP username", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/vvm3/AccountSubscriber", "getNumber", (char) 486, "AccountSubscriber.java", zct.b);
                        ajcqVarZ = ((defpackage.vkj) obj14).c((android.telecom.PhoneAccountHandle) obj15);
                    } else {
                        ajcqVarZ = aiql.z(j$.util.Optional.of(defpackage.vkj.f(str.substring(0, str.indexOf(64)))));
                    }
                    optionalOfNullable = j$.util.Optional.ofNullable(ajcqVarZ);
                }
                return (ajcq) optionalOfNullable.orElse(((defpackage.vkj) obj11).c((android.telecom.PhoneAccountHandle) obj12));
            case 19:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return ((defpackage.vkj) this.a).b((android.telecom.PhoneAccountHandle) this.b);
                }
                throw new java.lang.IllegalStateException("Missing permission for subscriptionManager.getPhoneNumber()");
            default:
                return ((defpackage.vko) this.a).g.a((vdd) ((j$.util.Optional) obj).orElseThrow(new defpackage.vjq(i)), (android.telecom.PhoneAccountHandle) this.b);
        }
    }

    public /* synthetic */ vfv(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
