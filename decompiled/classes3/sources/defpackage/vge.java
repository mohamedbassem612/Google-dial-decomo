package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vge implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ vge(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final ajcq a(java.lang.Object obj) {
        int i = 17;
        int i2 = 10;
        int i3 = 4;
        switch (this.$cid) {
            case 0:
                return ahvr.M((java.lang.Iterable) j$.util.Collection.-EL.stream((aihd) obj).map(new thy(this.a, 10)).collect(aido.a));
            case 1:
                vcr vcrVar = vgg.a;
                return ((vcg) obj).p((android.telecom.PhoneAccountHandle) this.a);
            case 2:
                vcr vcrVar2 = vgg.a;
                return ((vcg) obj).j((android.telecom.PhoneAccountHandle) this.a);
            case 3:
                vcr vcrVar3 = vgg.a;
                return ((vcg) obj).j((android.telecom.PhoneAccountHandle) this.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.vhz vhzVar = (defpackage.vhz) obj;
                defpackage.vgs vgsVar = (defpackage.vgs) this.a;
                vgsVar.b = vhzVar;
                defpackage.vtl vtlVarH = vhzVar.h();
                akzx akzxVarM = vzi.a.m();
                android.telecom.PhoneAccountHandle phoneAccountHandle = vgsVar.g;
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
                java.lang.String packageName = vgsVar.c.getPackageName();
                akzxVarM.u();
                vzi vziVar3 = akzxVarM.b;
                j$.util.Objects.requireNonNull(packageName);
                vziVar3.b |= 1;
                vziVar3.c = packageName;
                if (vtlVarH != null) {
                    aimw aimwVarL = defpackage.vgs.a.b().i(zct.a).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "setQuota", 1194, "ImapOperations.java");
                    int i4 = vtlVarH.b;
                    int i5 = vtlVarH.a;
                    aimwVarL.z("Updating Voicemail status table with quota occupied: %d new quota total: %d", i4, i5);
                    akzxVarM.u();
                    vzi vziVar4 = akzxVarM.b;
                    vziVar4.b |= 256;
                    vziVar4.k = i4;
                    akzxVarM.u();
                    vzi vziVar5 = akzxVarM.b;
                    vziVar5.b |= 512;
                    vziVar5.l = i5;
                } else {
                    hgb.j(defpackage.vgs.a.d(), "quota was null", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "setQuota", (char) 1199, "ImapOperations.java", zct.b, zct.a);
                    akzxVarM.u();
                    vzi vziVar6 = akzxVarM.b;
                    vziVar6.b |= 256;
                    vziVar6.k = -1;
                    akzxVarM.u();
                    vzi vziVar7 = akzxVarM.b;
                    vziVar7.b |= 512;
                    vziVar7.l = -1;
                }
                ainm ainmVarB = defpackage.vgs.a.b();
                ainp ainpVar = zct.a;
                a.bI(ainmVarB, "Updated quota occupied and total", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "setQuota", (char) 1205, "ImapOperations.java", ainpVar);
                zjv.i(vgsVar.h.a(ainpVar), mgv.df, aify.p(defpackage.vgs.o(vtlVarH)), (mhc) null, 0, 28);
                return vgsVar.i.e(akzxVarM.p());
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ((vee) ((j$.util.Optional) obj).orElseThrow()).k((android.telecom.PhoneAccountHandle) this.a, defpackage.vcn.a, 3);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                defpackage.vdj vdjVar = new defpackage.vdj(this.a, 11);
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(((vcg) optionalOfNullable.get()).k((android.telecom.PhoneAccountHandle) vdjVar.a));
                }
                return (ajcq) optionalOfNullable.orElse(aiql.z(java.lang.Boolean.FALSE));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                j$.util.Optional optionalOfNullable2 = (j$.util.Optional) obj;
                defpackage.vdj vdjVar2 = new defpackage.vdj(this.a, 12);
                if (true == optionalOfNullable2.isPresent()) {
                    optionalOfNullable2 = j$.util.Optional.ofNullable(((vcg) optionalOfNullable2.get()).f((android.telecom.PhoneAccountHandle) vdjVar2.a));
                }
                return (ajcq) optionalOfNullable2.orElse(aiql.z(aike.a));
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                defpackage.vkj vkjVar = (defpackage.vkj) this.a;
                okj okjVar = vkjVar.e;
                return ahvr.H(aosv.F(okjVar.a, 0, new bck(okjVar, iIntValue, (aoln) null, 7, (byte[]) null), 3), new defpackage.vju(9), vkjVar.c);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return aiql.z(java.lang.Boolean.TRUE);
                }
                java.lang.Object obj2 = this.a;
                defpackage.vkj vkjVar2 = (defpackage.vkj) obj2;
                zrw zrwVar = vkjVar2.d;
                return ahvr.I(aosv.F(zrwVar.d, 0, new defpackage.zqs(zrwVar, (aoln) null, 12, (char[][]) null), 3), new defpackage.vge(obj2, i2), vkjVar2.c);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return aiql.z(java.lang.Boolean.TRUE);
                }
                oko okoVar = ((defpackage.vkj) this.a).f;
                return aosv.F(okoVar.d, 0, new ogf(okoVar, (aoln) null, 14, (short[]) null), 3);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.vlr vlrVar = (defpackage.vlr) obj;
                j$.util.Optional optional = vlrVar.a;
                if (!optional.isPresent()) {
                    j$.util.Optional optional2 = vlrVar.b;
                    ahvr.bZ(optional2.isPresent(), "failure reason should be present when data is absent");
                    throw new defpackage.vle((vcp) optional2.orElseThrow());
                }
                java.lang.Object obj3 = this.a;
                defpackage.vme vmeVar = (defpackage.vme) ((j$.util.Optional) optional.orElseThrow()).orElseThrow(new defpackage.vjq(i3));
                vlf vlfVar = (vlf) obj3;
                return ahvr.H(vlfVar.b.a(vmeVar.b), new defpackage.vfw(vmeVar.c, 15), vlfVar.c);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                ((vlf) this.a).d.o(rmx.jU);
                return aiql.y((java.lang.Exception) obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                j$.util.Optional optional3 = (j$.util.Optional) obj;
                if (!optional3.isPresent()) {
                    return aiql.z(java.lang.Boolean.FALSE);
                }
                return ((vli) this.a).e.e((vzi) optional3.orElseThrow());
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((vlm) this.a).l.i((java.lang.String) null).a(mcd.am);
                return aiql.y((java.lang.Exception) obj);
            case 15:
                return ahvr.F(new defpackage.vdp((defpackage.alic) obj, 16), ((vma) this.a).b);
            case 16:
                return ahvr.F(new defpackage.vdp((defpackage.alic) obj, i), ((vma) this.a).b);
            case 17:
                int iOrdinal = ((defpackage.vcf) obj).ordinal();
                if (iOrdinal == 0) {
                    a.bI(vmc.a.b(), "prefetch disabled", "com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmSyncService", "canPrefetchVoicemails", (char) 378, "RestVvmSyncService.java", zct.a);
                    return aiql.z(java.lang.Boolean.FALSE);
                }
                int i6 = 2;
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new java.lang.IllegalStateException("exhaustive switch");
                    }
                    a.bI(vmc.a.b(), "prefetch always", "com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmSyncService", "canPrefetchVoicemails", (char) 384, "RestVvmSyncService.java", zct.a);
                    return aiql.z(java.lang.Boolean.TRUE);
                }
                java.lang.Object obj4 = this.a;
                a.bI(vmc.a.b(), "prefetch wifi-only", "com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmSyncService", "canPrefetchVoicemails", (char) 381, "RestVvmSyncService.java", zct.a);
                vmc vmcVar = (vmc) obj4;
                zrw zrwVar2 = vmcVar.m;
                return ahvr.H(aosv.F(zrwVar2.d, 0, new defpackage.zqs(zrwVar2, (aoln) null, 4), 3), new defpackage.vmb(obj4, i6), vmcVar.j);
            case 18:
                return aiql.y((java.lang.Throwable) this.a);
            case 19:
                j$.util.Optional optionalOfNullable3 = (j$.util.Optional) obj;
                defpackage.vdj vdjVar3 = new defpackage.vdj(this.a, 17);
                if (true == optionalOfNullable3.isPresent()) {
                    optionalOfNullable3 = j$.util.Optional.ofNullable(((vcc) optionalOfNullable3.get()).c((android.telecom.PhoneAccountHandle) vdjVar3.a));
                }
                return (ajcq) optionalOfNullable3.orElse(aiql.z(java.lang.Boolean.FALSE));
            default:
                j$.util.Optional optionalOfNullable4 = (j$.util.Optional) obj;
                defpackage.vmu vmuVar = new defpackage.vmu(this.a, 1);
                if (true == optionalOfNullable4.isPresent()) {
                    optionalOfNullable4 = j$.util.Optional.ofNullable(((vcg) optionalOfNullable4.get()).i((android.telecom.PhoneAccountHandle) vmuVar.a));
                }
                return (ajcq) optionalOfNullable4.orElse(aiql.z(java.lang.Boolean.FALSE));
        }
    }
}
