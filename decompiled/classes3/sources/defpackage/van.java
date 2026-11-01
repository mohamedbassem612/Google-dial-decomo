package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class van implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ van(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        java.lang.String id;
        switch (this.$cid) {
            case 0:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    vao.a.b().l("com/android/dialer/voicemail/notification/impl/VoicemailNotificationChannel", "getNotificationChannelIdForMultiSim", 73, "VoicemailNotificationChannel.java").v("phone account is not for a SIM, using default channel");
                    return "phone_default";
                }
                java.lang.Object obj2 = this.a;
                if (android.os.Build.VERSION.SDK_INT < 33) {
                    int i = airu.a;
                    id = airt.a.b(((android.telecom.PhoneAccountHandle) obj2).getId(), java.nio.charset.StandardCharsets.UTF_8).toString();
                } else {
                    id = ((android.telecom.PhoneAccountHandle) obj2).getId();
                }
                return java.lang.String.format("%s:%s", "phone_voicemail_account_", id);
            case 1:
                return (j$.util.Optional) ((java.util.concurrent.atomic.AtomicReference) this.a).get();
            case 2:
                vav vavVar = (vav) this.a;
                android.content.Context context = vavVar.b;
                dva dvaVar = new dva(context, (java.lang.String) obj);
                dvaVar.n(2131232064);
                dvaVar.t = urg.c(context, 2130969018);
                dvaVar.o = "VisualVoicemailGroup";
                dvaVar.d(8, true);
                dvaVar.d(16, true);
                dvaVar.g = vavVar.a(context);
                return dvaVar;
            case 3:
                vav vavVar2 = (vav) this.a;
                android.content.Context context2 = vavVar2.b;
                dva dvaVar2 = new dva(context2, (java.lang.String) obj);
                dvaVar2.n(2131232064);
                dvaVar2.t = urg.c(context2, 2130969018);
                dvaVar2.d(8, true);
                dvaVar2.d(16, false);
                dvaVar2.h(context2.getString(2132020902));
                dvaVar2.g(context2.getString(2132020901));
                duz duzVar = new duz();
                duzVar.c(context2.getString(2132020901));
                dvaVar2.o(duzVar);
                dvaVar2.g = vavVar2.a(context2);
                return dvaVar2.a();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.lang.Object obj3 = this.a;
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                defpackage.taj tajVar = new defpackage.taj(obj3, 15);
                if (true == optionalOfNullable.isPresent()) {
                    java.lang.Object obj4 = optionalOfNullable.get();
                    java.lang.Object obj5 = tajVar.a;
                    android.telecom.PhoneAccount phoneAccount = (android.telecom.PhoneAccount) obj4;
                    android.text.SpannableString spannableString = new android.text.SpannableString(java.lang.String.valueOf(phoneAccount.getLabel()) + " • " + java.lang.String.valueOf(obj5));
                    spannableString.setSpan(new android.text.style.ForegroundColorSpan(phoneAccount.getHighlightColor()), 0, phoneAccount.getLabel().length(), 17);
                    optionalOfNullable = j$.util.Optional.ofNullable(spannableString);
                }
                return (java.lang.CharSequence) optionalOfNullable.orElse(obj3);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.Object obj6 = this.a;
                if (obj6 == null) {
                    return null;
                }
                ((android.content.BroadcastReceiver.PendingResult) obj6).finish();
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                akzx akzxVarP = ((vbg) obj).p();
                java.lang.String strO = zjm.o((android.telecom.PhoneAccountHandle) this.a);
                j$.util.Objects.requireNonNull(strO);
                akzxVarP.u();
                akzxVarP.b.b().remove(strO);
                return akzxVarP.p();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return (java.lang.Boolean) j$.util.Map.-EL.getOrDefault(j$.util.DesugarCollections.unmodifiableMap(((vbg) obj).b), zjm.o((android.telecom.PhoneAccountHandle) this.a), java.lang.Boolean.FALSE);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                akzx akzxVarP2 = ((vbg) obj).p();
                java.lang.String strO2 = zjm.o((android.telecom.PhoneAccountHandle) this.a);
                j$.util.Objects.requireNonNull(strO2);
                akzxVarP2.u();
                akzxVarP2.b.b().put(strO2, java.lang.Boolean.TRUE);
                return akzxVarP2.p();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return j$.util.Optional.ofNullable(true == ((java.lang.Boolean) obj).booleanValue() ? this.a : null);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return j$.util.Optional.ofNullable(true == ((java.lang.Boolean) obj).booleanValue() ? this.a : null);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                aimz aimzVar = vdo.a;
                if (!((java.lang.Boolean) ((aigf) obj).get(this.a)).booleanValue()) {
                    return java.lang.Boolean.TRUE;
                }
                vdo.a.b().l("com/android/dialer/voicemail/service/impl/database/VoicemailRepository", "shouldInsertVoicemail", 543, "VoicemailRepository.java").v("found voicemail from blocked number, skipping insertion");
                return java.lang.Boolean.FALSE;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                aimz aimzVar2 = vdo.a;
                return this.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                aimz aimzVar3 = vdo.a;
                return this.a;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                akzx akzxVarM = vcr.a.m();
                vcr vcrVar = ((defpackage.vcx) this.a).a;
                vcp vcpVar = vcrVar.b == 2 ? (vcp) vcrVar.c : vcp.a;
                akzxVarM.u();
                vcr vcrVar2 = akzxVarM.b;
                j$.util.Objects.requireNonNull(vcpVar);
                vcrVar2.c = vcpVar;
                vcrVar2.b = 2;
                return akzxVarM.p();
            case 15:
                vcr vcrVar3 = (vcr) obj;
                vea.a.b().l("com/android/dialer/voicemail/service/impl/scheduler/VvmExecutorImpl", "executeWork", 234, "VvmExecutorImpl.java").I("VvmResult is: %s for %s", vcrVar3, this.a);
                return vcrVar3;
            case 16:
                vcr vcrVar4 = (vcr) obj;
                vea.a.b().l("com/android/dialer/voicemail/service/impl/scheduler/VvmExecutorImpl", "executeWork", 224, "VvmExecutorImpl.java").I("VvmResult is: %s for %s", vcrVar4, this.a);
                return vcrVar4;
            case 17:
                akzx akzxVarM2 = vcr.a.m();
                akzxVarM2.u();
                vcr vcrVar5 = akzxVarM2.b;
                vcp vcpVar2 = ((defpackage.vcv) this.a).a;
                j$.util.Objects.requireNonNull(vcpVar2);
                vcrVar5.c = vcpVar2;
                vcrVar5.b = 2;
                return akzxVarM2.p();
            case 18:
                return this.a;
            case 19:
                return this.a;
            default:
                return this.a;
        }
    }
}
