package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vfw implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ vfw(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c0  */
    /* JADX WARN: Type inference failed for: r11v70, types: [java.lang.Iterable, java.lang.Object] */
    public final java.lang.Object apply(java.lang.Object obj) {
        defpackage.vfc vfcVar;
        switch (this.$cid) {
            case 0:
                return ((gat) this.a).z((vcs) obj);
            case 1:
                return ((vfx) this.a).f;
            case 2:
                return ((gat) this.a).A((vcs) obj);
            case 3:
                vcs vcsVar = (vcs) obj;
                zzx zzxVar = (zzx) ((gat) this.a).d;
                return zzxVar.k().containsKey(vcsVar) ? j$.util.Optional.of((defpackage.vjd) ((aoin) zzxVar.k().get(vcsVar)).a()) : j$.util.Optional.empty();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((vgl) this.a).b((j$.util.Optional) obj);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return vgl.e();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return j$.util.Optional.ofNullable((defpackage.vgm) j$.util.DesugarCollections.unmodifiableMap(((vgn) obj).b).get(rsr.y((android.telecom.PhoneAccountHandle) this.a)));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                akzx akzxVarP = ((vgn) obj).p();
                java.lang.Object obj2 = this.a;
                j$.util.Objects.requireNonNull(obj2);
                akzxVarP.u();
                akzxVarP.b.b().remove(obj2);
                return akzxVarP.p();
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                vix.a.b().k((java.lang.SecurityException) obj).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/network/impl/VvmNetworkRequestImpl", "createNetwork", 151, "VvmNetworkRequestImpl.java").v("ConnectivityManager#requestNetwork throws SecurityException, which means the appropriate permissions for this API are missing.");
                ((dsd) this.a).d(new defpackage.vis("missing permissions"));
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return android.net.Uri.parse(((defpackage.voy) this.a).e);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.String str = (java.lang.String) obj;
                if (((java.lang.String) this.a).equals(defpackage.vkj.e(str, "transactionid"))) {
                    return defpackage.vkj.e(str, "spgurl");
                }
                throw new defpackage.vki("transactionId mismatch");
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                ((vkx) this.a).b = j$.util.Optional.empty();
                return null;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                vcr vcrVar = vlc.a;
                return this.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.lang.String str2 = ((defpackage.voy) this.a).e;
                vcr vcrVar2 = vlf.a;
                return android.net.Uri.parse(str2);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((vlf) this.a).d.o(rmx.jT);
                return vlf.a;
            case 15:
                vcr vcrVar3 = vlf.a;
                return new defpackage.vld((java.lang.String) this.a, (defpackage.vmd) obj);
            case 16:
                java.lang.String str3 = (java.lang.String) ((vlm) this.a).i.g(((java.lang.Integer) obj).intValue()).orElse((java.lang.Object) null);
                if (android.text.TextUtils.isEmpty(str3)) {
                    throw new java.lang.IllegalStateException("SIM MSISDN not available");
                }
                return str3;
            case 17:
                java.lang.String str4 = (java.lang.String) obj;
                if (str4.matches("^.*[^a-zA-Z0-9].*$")) {
                    java.lang.Object obj3 = this.a;
                    a.bt(vlm.a.c().m(aioa.b), "Retrieved phone number in an unexpected format: %s", str4, "com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmCarrierService", "getMsisdn", (char) 382, "RestVvmCarrierService.java", zct.b);
                    ((vlm) obj3).h.o(rmx.kb);
                }
                return "tel%3A%2B".concat(java.lang.String.valueOf(str4.replaceAll("[^0-9]", "")));
            case 18:
                defpackage.alic alicVar = (defpackage.alic) obj;
                if (alicVar.a == 204) {
                    return aike.a;
                }
                aike aikeVar = ((vls) this.a).f.d(alicVar).a;
                aift aiftVar = new aift(4);
                for (int i = 0; i < aikeVar.d; i++) {
                    defpackage.vlx vlxVar = (defpackage.vlx) aikeVar.get(i);
                    j$.util.Optional optionalFindFirst = j$.util.Collection.-EL.stream(vlxVar.d).filter(new vgb(7)).findFirst();
                    if (true == optionalFindFirst.isPresent()) {
                        optionalFindFirst = j$.util.Optional.ofNullable(((defpackage.vlw) optionalFindFirst.get()).b);
                    }
                    java.lang.String str5 = (java.lang.String) optionalFindFirst.orElseThrow(new defpackage.pxs(vlxVar, 12));
                    aigf aigfVar = vlxVar.b;
                    j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable((java.lang.String) aigfVar.get("x-cns-greeting-type"));
                    if (true == optionalOfNullable.isPresent()) {
                        java.lang.String str6 = (java.lang.String) optionalOfNullable.get();
                        int iHashCode = str6.hashCode();
                        if (iHashCode != -1638409633) {
                            if (iHashCode == 383714781 && str6.equals("voice-signature")) {
                                vfcVar = defpackage.vfc.b;
                            } else {
                                vfcVar = defpackage.vfc.a;
                            }
                        } else if (str6.equals("normal-greeting")) {
                            vfcVar = defpackage.vfc.c;
                        } else {
                            vfcVar = defpackage.vfc.a;
                        }
                        optionalOfNullable = j$.util.Optional.ofNullable(vfcVar);
                    }
                    defpackage.vfc vfcVar2 = (defpackage.vfc) optionalOfNullable.orElseThrow(new defpackage.pxs(vlxVar, 13));
                    j$.util.OptionalLong optionalLongOf = aigfVar.containsKey("content-duration") ? j$.util.OptionalLong.of(java.util.concurrent.TimeUnit.SECONDS.toMillis(java.lang.Long.parseLong((java.lang.String) aigfVar.get("content-duration")))) : j$.util.OptionalLong.empty();
                    j$.util.OptionalLong.empty();
                    if (optionalLongOf == null) {
                        throw new java.lang.NullPointerException("Null durationMillis");
                    }
                    if (str5 == null) {
                        throw new java.lang.NullPointerException("Null audioUrl");
                    }
                    java.lang.String str7 = vlxVar.a;
                    if (vfcVar2 == null) {
                        throw new java.lang.NullPointerException("Null greetingType");
                    }
                    aiftVar.i(new defpackage.vme(optionalLongOf, str5, str7, vfcVar2, vlxVar.c.contains("$CNS-Greeting-On")));
                }
                return aiftVar.h();
            case 19:
                aimz aimzVar = vls.a;
                aift aiftVar2 = new aift(4);
                aiftVar2.k((java.lang.Iterable) this.a);
                aiftVar2.k((aify) obj);
                return aiftVar2.h();
            default:
                try {
                    return vma.b(((vma) this.a).a(vma.e((defpackage.alic) obj).getJSONObject("object")));
                } catch (org.json.JSONException e) {
                    throw new defpackage.vmh(e);
                }
        }
    }
}
