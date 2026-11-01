package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class taj implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ taj(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
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

    /* JADX WARN: Type inference failed for: r5v59, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v61, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v63, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v65, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v67, types: [java.lang.Object, uqt] */
    /* JADX WARN: Type inference failed for: r5v8, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v30, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        java.lang.Object rqyVar;
        byte[] bArr = null;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        switch (this.$cid) {
            case 0:
                adnm adnmVar = (adnm) obj;
                adoa adoaVar = adoa.a;
                boolean zE = adnmVar.e(adoaVar);
                java.lang.Object obj2 = this.a;
                if (zE) {
                    ((defpackage.tam) obj2).p.a(qbc.fn);
                    return ajcm.a;
                }
                ((defpackage.tam) obj2).p.a(qbc.fo);
                return adnmVar.b(adoaVar);
            case 1:
                return this.a.a(obj);
            case 2:
                return adnw.a((java.io.File) obj, (java.lang.String) this.a);
            case 3:
                oko okoVar = (oko) obj;
                if (((alfc) defpackage.sns.l(((androidx.preference.Preference) this.a).j).au().b.a()).b.contains((java.lang.String) okoVar.q().orElse((java.lang.Object) null))) {
                    int iC = okoVar.c();
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(iC);
                    if (lnr.a(j$.util.Optional.of(numValueOf))) {
                        com.android.dialer.rtt.settings.impl.ui.RttSettingsPreferenceCompat.a.b().l("com/android/dialer/rtt/settings/impl/ui/RttSettingsPreferenceCompat", "isTMobileMno", 299, "RttSettingsPreferenceCompat.java").v("Fi on T-Mobile network");
                    } else if (lnr.a.contains(numValueOf)) {
                        com.android.dialer.rtt.settings.impl.ui.RttSettingsPreferenceCompat.a.b().l("com/android/dialer/rtt/settings/impl/ui/RttSettingsPreferenceCompat", "isTMobileMno", 304, "RttSettingsPreferenceCompat.java").v("Tracfone on T-Mobile network");
                    } else {
                        numValueOf.getClass();
                        if (iC == 2683) {
                            com.android.dialer.rtt.settings.impl.ui.RttSettingsPreferenceCompat.a.b().l("com/android/dialer/rtt/settings/impl/ui/RttSettingsPreferenceCompat", "isTMobileMno", 309, "RttSettingsPreferenceCompat.java").v("Comcast Business on T-Mobile network");
                        } else {
                            numValueOf.getClass();
                            if (iC == 2687) {
                                com.android.dialer.rtt.settings.impl.ui.RttSettingsPreferenceCompat.a.b().l("com/android/dialer/rtt/settings/impl/ui/RttSettingsPreferenceCompat", "isTMobileMno", 314, "RttSettingsPreferenceCompat.java").v("Spectrum on T-Mobile network");
                            } else {
                                z = true;
                            }
                        }
                    }
                } else {
                    com.android.dialer.rtt.settings.impl.ui.RttSettingsPreferenceCompat.a.b().l("com/android/dialer/rtt/settings/impl/ui/RttSettingsPreferenceCompat", "isTMobileMno", 291, "RttSettingsPreferenceCompat.java").v("Not T-Mobile network");
                }
                return java.lang.Boolean.valueOf(z);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return java.lang.Boolean.valueOf(((java.lang.Enum) this.a).equals((defpackage.uab) obj));
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return j$.util.Optional.ofNullable(((udy) this.a).p.j(java.lang.String.valueOf((java.lang.Long) obj)));
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return a.k((aonj) this.a, obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return this.a.a(obj);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return this.a.a(obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return a.k((aonj) this.a, obj);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return this.a.c(((java.lang.Integer) obj).intValue());
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                rqyVar = new defpackage.rqy(this.a, (android.content.Intent) obj, 11);
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return ((defpackage.vaa) this.a).h((defpackage.uyq) obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                vao vaoVar = (vao) this.a;
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) obj;
                ajcq ajcqVarC = vaoVar.c.c(phoneAccountHandle);
                vak vakVar = new vak(3);
                ajct ajctVar = vaoVar.b;
                return ahvr.H(ahvr.H(ajcqVarC, vakVar, ajctVar), new defpackage.van(phoneAccountHandle, z ? 1 : 0), ajctVar);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                java.lang.Object obj3 = this.a;
                return ahvr.F(new defpackage.uwl(obj3, (android.telecom.PhoneAccountHandle) obj, 9, bArr), ((vav) obj3).i);
            case 15:
                android.telecom.PhoneAccount phoneAccount = (android.telecom.PhoneAccount) obj;
                android.text.SpannableString spannableString = new android.text.SpannableString(java.lang.String.valueOf(phoneAccount.getLabel()) + " • " + java.lang.String.valueOf(this.a));
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(phoneAccount.getHighlightColor()), 0, phoneAccount.getLabel().length(), 17);
                rqyVar = spannableString;
                break;
            case 16:
                defpackage.vmb vmbVar = new defpackage.vmb((java.lang.String) obj, 7);
                rsr rsrVar = (rsr) this.a;
                return ((afhf) rsrVar.a).a(vmbVar, (java.util.concurrent.Executor) rsrVar.b);
            case 17:
                return ((val) obj).a((android.telecom.PhoneAccountHandle) this.a);
            case 18:
                return ((vda) obj).c((android.telecom.PhoneAccountHandle) this.a);
            case 19:
                return ((vda) obj).c((android.telecom.PhoneAccountHandle) this.a);
            default:
                return ((vee) obj).h((android.telecom.PhoneAccountHandle) ((j$.util.Optional) this.a).orElseThrow());
        }
        return rqyVar;
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
}
