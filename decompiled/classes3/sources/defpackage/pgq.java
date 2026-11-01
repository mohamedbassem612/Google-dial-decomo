package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pgq implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ pgq(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v27, types: [agxi, java.lang.Object] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        int i;
        int i2;
        byte[] bArr = null;
        int i3 = 2;
        int i4 = 1;
        switch (this.$cid) {
            case 0:
                return ((defpackage.pgs) this.a).b((android.telecom.Call.Details) this.b);
            case 1:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                return j$.util.Collection.-EL.stream(((defpackage.spe) entry.getValue()).b).map(new defpackage.phs(this.b, entry, this.a, i4));
            case 2:
                return ((defpackage.pgs) this.a).b((android.telecom.Call.Details) this.b);
            case 3:
                return ((defpackage.pgs) this.a).b((android.telecom.Call.Details) this.b);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.amdx amdxVar = (defpackage.amdx) obj;
                java.lang.String strH = ((defpackage.sql) this.b).h();
                if (!android.text.TextUtils.isEmpty(strH)) {
                    amdxVar.a = "Primary";
                    return j$.util.Optional.of(strH);
                }
                java.lang.Object obj2 = this.a;
                if (((j$.util.Optional) obj2).isPresent()) {
                    amdxVar.a = "CNAP";
                    return obj2;
                }
                amdxVar.a = "Empty";
                return j$.util.Optional.empty();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                android.app.Person personM = ft$.ExternalSyntheticApiModelOutline0.m(obj);
                return ft$.ExternalSyntheticApiModelOutline0.m(ft$.ExternalSyntheticApiModelOutline0.m(ft$.ExternalSyntheticApiModelOutline0.m(personM), ((android.content.Context) this.b).getString(2132017942, this.a, ft$.ExternalSyntheticApiModelOutline0.m(personM).toString())));
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                java.lang.String str = (java.lang.String) obj;
                boolean zStartsWith = str.startsWith("+");
                java.lang.Object obj3 = this.a;
                if (!zStartsWith) {
                    return aiql.z(java.lang.Boolean.valueOf(((java.lang.String) obj3).replaceAll("[^\\d]", "").equals(str.replaceAll("[^\\d]", ""))));
                }
                krv krvVar = (krv) this.b;
                return ahrv.g(((aogc) krvVar.b).aH()).h(new oqe(str, obj3, 6), (java.util.concurrent.Executor) krvVar.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((defpackage.qke) this.b).a.getString(2132019518, this.a, (java.lang.String) obj);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return ((defpackage.qke) this.b).a.getString(2132019559, this.a, (java.lang.String) obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ((defpackage.utx) ((aoin) ((zzx) ((defpackage.zlr) this.a).a).k().get((defpackage.uty) obj)).a()).c((defpackage.utu) this.b);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ((defpackage.utx) ((aoin) ((zzx) ((defpackage.ulw) this.a).c).k().get((defpackage.uty) obj)).a()).f((defpackage.utu) this.b);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                vdo vdoVar = (vdo) this.a;
                return vdoVar.c.f(android.provider.VoicemailContract.Voicemails.buildSourceUri(vdoVar.b.getPackageName()).buildUpon().appendPath(java.lang.String.valueOf((java.lang.Long) obj)).build(), (android.content.ContentValues) this.b, (java.lang.String) null, (java.lang.String[]) null);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.vdg vdgVar = (defpackage.vdg) obj;
                java.lang.String str2 = vdgVar.c;
                java.lang.Object obj4 = this.a;
                ahrv ahrvVarG = ahrv.g(((defpackage.vgs) obj4).f(new defpackage.vez(obj4, str2, 14, bArr)).h());
                java.lang.Object obj5 = this.b;
                defpackage.vfv vfvVar = new defpackage.vfv(obj5, vdgVar, 3);
                ajct ajctVar = ((vgg) obj5).e;
                return ahrvVarG.i(vfvVar, ajctVar).h(new defpackage.vft(8), ajctVar);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                final defpackage.vmx vmxVar = (defpackage.vmx) this.b;
                okj okjVar = vmxVar.c;
                final android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) obj;
                final int iIntValue = ((java.lang.Integer) this.a).intValue();
                final ajcq ajcqVarF = okjVar.f(phoneAccountHandle);
                final ajcq ajcqVarC = vmxVar.c(phoneAccountHandle);
                return ahvr.ak(new ajcq[]{ajcqVarF, ajcqVarC}).p(new ajas() { // from class: vmw
                    public final ajcq a() {
                        java.lang.Integer num = (java.lang.Integer) aiql.H(ajcqVarF);
                        int iIntValue2 = num.intValue();
                        boolean zBooleanValue = ((java.lang.Boolean) aiql.H(ajcqVarC)).booleanValue();
                        defpackage.vmx vmxVar2 = vmxVar;
                        android.telecom.PhoneAccountHandle phoneAccountHandle2 = phoneAccountHandle;
                        int i5 = iIntValue;
                        if (i5 < 0 || iIntValue2 != i5) {
                            if (!zBooleanValue) {
                                return ajcm.a;
                            }
                            defpackage.vmx.a.b().l("com/android/dialer/voicemail/service/receivers/DataSubscriptionChangeReceiver", "handleAccountOnDefaultDataSubscriptionChanged", 181, "DataSubscriptionChangeReceiver.java").M("Phone account %s (subId %d) requires default data SIM but is not default (%d), disabling VVM", phoneAccountHandle2, num, java.lang.Integer.valueOf(i5));
                            return vmxVar2.b(phoneAccountHandle2);
                        }
                        defpackage.vmx.a.b().l("com/android/dialer/voicemail/service/receivers/DataSubscriptionChangeReceiver", "handleAccountOnDefaultDataSubscriptionChanged", 176, "DataSubscriptionChangeReceiver.java").G("Phone account %s matches new default data subId %d, enabling and syncing VVM", phoneAccountHandle2, i5);
                        ahrv ahrvVarG2 = ahrv.g(vmxVar2.d.k(phoneAccountHandle2));
                        defpackage.vmq vmqVar = new defpackage.vmq(phoneAccountHandle2, 3);
                        ajct ajctVar2 = vmxVar2.b;
                        return ahrv.g(ahrvVarG2.i(vmqVar, ajctVar2)).i(new vmv(vmxVar2, phoneAccountHandle2, 0), ajctVar2);
                    }
                }, vmxVar.b);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                android.telecom.PhoneAccountHandle phoneAccountHandle2 = (android.telecom.PhoneAccountHandle) obj;
                defpackage.vmx vmxVar2 = (defpackage.vmx) this.b;
                ajcq ajcqVarC2 = vmxVar2.c(phoneAccountHandle2);
                ajcq ajcqVarF2 = vmxVar2.c.f(phoneAccountHandle2);
                return ahvr.ak(new ajcq[]{ajcqVarC2, ajcqVarF2}).o(new joq(ajcqVarC2, ajcqVarF2, this.a, phoneAccountHandle2, 16, (byte[]) null), vmxVar2.b);
            case 15:
                defpackage.vpr vprVar = (defpackage.vpr) obj;
                akzx akzxVarM = defpackage.vph.a.m();
                java.lang.String str3 = vprVar.a;
                akzxVarM.u();
                defpackage.vph vphVar = (defpackage.vph) akzxVarM.b;
                j$.util.Objects.requireNonNull(str3);
                vphVar.c = str3;
                java.lang.String str4 = vprVar.b;
                akzxVarM.u();
                defpackage.vph vphVar2 = (defpackage.vph) akzxVarM.b;
                j$.util.Objects.requireNonNull(str4);
                vphVar2.e = str4;
                java.lang.String string = ((vpq) this.a).b.getResources().getString(2132018220, ((defpackage.vpp) this.b).next());
                akzxVarM.u();
                defpackage.vph vphVar3 = (defpackage.vph) akzxVarM.b;
                j$.util.Objects.requireNonNull(string);
                vphVar3.g = string;
                j$.util.OptionalLong optionalLong = vprVar.c;
                j$.util.Objects.requireNonNull(akzxVarM);
                optionalLong.ifPresent(new defpackage.vpo(akzxVarM, 0));
                return (defpackage.vph) akzxVarM.p();
            case 16:
                java.lang.Object obj6 = this.a;
                boolean zIsPresent = ((j$.util.Optional) obj6).isPresent();
                java.lang.Object obj7 = this.b;
                if (!zIsPresent) {
                    return j$.util.Optional.empty();
                }
                try {
                    return ((defpackage.zmn) obj7).n.a(((defpackage.zmn) obj7).m.b((android.telecom.PhoneAccountHandle) ((j$.util.Optional) obj6).orElseThrow()));
                } catch (java.lang.SecurityException e) {
                    a.by(defpackage.zmn.a.b(), "Could not get carrier config because permission is missing.", "com/google/android/dialershared/incall/cachedcallinfo/CachedCallInfo", "getCarrierConfig", (char) 354, "CachedCallInfo.java", e);
                    return j$.util.Optional.empty();
                }
            case 17:
                j$.util.Optional optional = (j$.util.Optional) this.a;
                if (!optional.isPresent()) {
                    return j$.util.Optional.empty();
                }
                j$.util.Optional optionalH = ((defpackage.zmn) this.b).m.h((android.telecom.PhoneAccountHandle) optional.orElseThrow());
                if (optionalH.isPresent()) {
                    return android.text.TextUtils.isEmpty(((android.telephony.SubscriptionInfo) optionalH.orElseThrow()).getDisplayName()) ? j$.util.Optional.empty() : j$.util.Optional.of(((android.telephony.SubscriptionInfo) optionalH.orElseThrow()).getDisplayName().toString());
                }
                return j$.util.Optional.empty();
            case 18:
                j$.util.Optional optional2 = (j$.util.Optional) this.a;
                return !optional2.isPresent() ? j$.util.Optional.empty() : j$.util.Optional.of(java.lang.Integer.valueOf(((defpackage.zmn) this.b).a(optional2).c()));
            case 19:
                agyj agyjVar = (agyj) this.a;
                return new agym((agxi) this.b, agyjVar.g, agyjVar.i, agyjVar.e, agyjVar.f);
            default:
                float[][][] fArr = (float[][][]) ((java.util.Map.Entry) obj).getValue();
                aift aiftVar = new aift(4);
                int[][] iArrE = ((alij) this.a).e(fArr);
                int i5 = 0;
                while (i5 < iArrE.length) {
                    alia aliaVar = (alia) ((aify) this.b).get(i5);
                    aift aiftVar2 = new aift(4);
                    int i6 = 0;
                    while (true) {
                        int[] iArr = iArrE[i5];
                        if (i6 < iArr.length) {
                            int i7 = i6 + 1;
                            if (iArr[i6] == i3) {
                                while (true) {
                                    int[] iArr2 = iArrE[i5];
                                    if (i7 < iArr2.length && iArr2[i7] == 1) {
                                        i7++;
                                    }
                                }
                                int i8 = i7 - 1;
                                while (true) {
                                    i = i8 + 1;
                                    if (i8 <= i6 || i8 >= iArrE[i5].length - 1) {
                                        i2 = i3;
                                    } else {
                                        aigf aigfVar = aliaVar.f;
                                        i2 = i3;
                                        if (alij.c(aigfVar, i8, "Invalid feature token map.").equals(aigfVar.get(java.lang.Integer.valueOf(i)))) {
                                            i8 = i;
                                            i3 = i2;
                                        }
                                    }
                                }
                                aiftVar2.i(new alii(i6, i8, fArr[i5][i6][i2]));
                                i6 = i;
                                i3 = i2;
                            } else {
                                i6 = i7;
                            }
                        }
                    }
                    aiftVar.i(aiftVar2.h());
                    i5++;
                    i3 = i3;
                }
                return aiftVar.h();
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }

    public /* synthetic */ pgq(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
