package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vvb {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailErrorActionsImpl");
    public final android.content.Context b;
    public final rlv c;
    public final ajct d;
    public final ajct e;
    public final agsm f;
    private final zjm g;
    private final acxg h;
    private final ipc i;

    public vvb(android.content.Context context, rlv rlvVar, ipc ipcVar, ajct ajctVar, ajct ajctVar2, zjm zjmVar, acxg acxgVar, agsm agsmVar) {
        this.b = context;
        this.c = rlvVar;
        this.i = ipcVar;
        this.d = ajctVar;
        this.e = ajctVar2;
        this.g = zjmVar;
        this.h = acxgVar;
        this.f = agsmVar;
    }

    public final defpackage.vtw a() {
        akzx akzxVarM = defpackage.vtw.a.m();
        akzxVarM.u();
        defpackage.vtw vtwVar = (defpackage.vtw) akzxVarM.b;
        vtwVar.c = 3;
        vtwVar.b |= 1;
        java.lang.String string = this.b.getString(2132020839);
        akzxVarM.u();
        defpackage.vtw vtwVar2 = (defpackage.vtw) akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        vtwVar2.b |= 2;
        vtwVar2.d = string;
        return (defpackage.vtw) akzxVarM.p();
    }

    public final defpackage.vtw b() {
        akzx akzxVarM = defpackage.vtw.a.m();
        akzxVarM.u();
        defpackage.vtw vtwVar = (defpackage.vtw) akzxVarM.b;
        vtwVar.c = 5;
        vtwVar.b |= 1;
        java.lang.String string = this.b.getString(2132020841);
        akzxVarM.u();
        defpackage.vtw vtwVar2 = (defpackage.vtw) akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        vtwVar2.b |= 2;
        vtwVar2.d = string;
        return (defpackage.vtw) akzxVarM.p();
    }

    public final defpackage.vtw c() {
        akzx akzxVarM = defpackage.vtw.a.m();
        akzxVarM.u();
        defpackage.vtw vtwVar = (defpackage.vtw) akzxVarM.b;
        vtwVar.c = 2;
        vtwVar.b |= 1;
        java.lang.String string = this.b.getString(2132020843);
        akzxVarM.u();
        defpackage.vtw vtwVar2 = (defpackage.vtw) akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        vtwVar2.b |= 2;
        vtwVar2.d = string;
        return (defpackage.vtw) akzxVarM.p();
    }

    public final void d(aw awVar, int i, vzi vziVar) {
        byte[] bArr = null;
        switch (i - 1) {
            case 1:
                this.c.n(rmw.be);
                afsq.G(awVar, new android.content.Intent("android.settings.AIRPLANE_MODE_SETTINGS"));
                return;
            case 2:
                this.c.n(rmw.U);
                android.telecom.PhoneAccountHandle phoneAccountHandleK = ttj.k(vziVar);
                if (phoneAccountHandleK == null) {
                    a.d().l("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailErrorActionsImpl", "setPin", 186, "VoicemailErrorActionsImpl.java").v("Invalid PhoneAccountHandle in VoicemailStatus for setPin");
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.setClassName(this.b, "com.android.dialer.voicemail.settings.pin.VoicemailChangePinActivity");
                intent.putExtra("phone_account_handle", phoneAccountHandleK);
                afsq.G(awVar, intent);
                return;
            case 3:
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                this.c.n(rmw.bf);
                acxg acxgVar = this.h;
                defpackage.amdx amdxVar = new defpackage.amdx(null, null, null);
                amdxVar.t(ttj.k(vziVar));
                amdxVar.v(20);
                acxgVar.w((defpackage.zrx) amdxVar.a);
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                this.c.n(rmw.aR);
                android.telecom.PhoneAccountHandle phoneAccountHandleK2 = ttj.k(vziVar);
                if (phoneAccountHandleK2 == null) {
                    a.d().l("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailErrorActionsImpl", "sync", 223, "VoicemailErrorActionsImpl.java").v("Invalid PhoneAccountHandle in VoicemailStatus for sync");
                    return;
                }
                j$.util.Optional optionalG = this.g.g();
                defpackage.qgz qgzVar = new defpackage.qgz(this, phoneAccountHandleK2, 19, bArr);
                if (true == optionalG.isPresent()) {
                    java.lang.Object obj = optionalG.get();
                    java.lang.Object obj2 = qgzVar.a;
                    java.lang.Object obj3 = qgzVar.b;
                    defpackage.vvb vvbVar = (defpackage.vvb) obj2;
                    vvbVar.f.g(ahrv.g(((vda) obj).a((android.telecom.PhoneAccountHandle) obj3)).i(new vuu(obj3, 2), vvbVar.e), 10L, java.util.concurrent.TimeUnit.SECONDS);
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                this.c.n(rmw.aQ);
                android.telecom.PhoneAccountHandle phoneAccountHandleK3 = ttj.k(vziVar);
                if (phoneAccountHandleK3 == null) {
                    a.d().l("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailErrorActionsImpl", "retry", 257, "VoicemailErrorActionsImpl.java").v("Invalid PhoneAccountHandle in VoicemailStatus for retry");
                } else {
                    j$.util.Optional optionalG2 = this.g.g();
                    defpackage.qgz qgzVar2 = new defpackage.qgz(this, phoneAccountHandleK3, 17, bArr);
                    if (true == optionalG2.isPresent()) {
                        java.lang.Object obj4 = optionalG2.get();
                        java.lang.Object obj5 = qgzVar2.a;
                        java.lang.Object obj6 = qgzVar2.b;
                        defpackage.vvb vvbVar2 = (defpackage.vvb) obj5;
                        vvbVar2.f.g(ahrv.g(((vda) obj4).a((android.telecom.PhoneAccountHandle) obj6)).i(new vuu(obj6, 5), vvbVar2.e), 10L, java.util.concurrent.TimeUnit.SECONDS);
                    }
                }
                defpackage.agby agbyVarO = defpackage.agby.o(awVar.N(), 2132020842, 0);
                agbyVarO.k = 5000;
                agbyVarO.h();
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                awVar.ar(new java.lang.String[]{"android.permission.RECEIVE_SMS"}, 2);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW");
                intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent2.addFlags(268435456);
                intent2.setData(android.net.Uri.parse("package:".concat(java.lang.String.valueOf(awVar.G().getPackageName()))));
                afsq.G(awVar, intent2);
                return;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                android.content.Context context = this.b;
                android.content.Intent intent3 = new android.content.Intent("android.intent.action.CALL", android.net.Uri.parse("tel:".concat(java.lang.String.valueOf(context.getString(2132020703)))));
                intent3.addFlags(268435456);
                ahqx.l(context, intent3);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                j$.util.Optional optionalG3 = this.g.g();
                defpackage.qgz qgzVar3 = new defpackage.qgz(this, vziVar, 18);
                if (true == optionalG3.isPresent()) {
                    java.lang.Object obj7 = optionalG3.get();
                    java.lang.Object obj8 = qgzVar3.b;
                    java.lang.Object obj9 = qgzVar3.a;
                    vda vdaVar = (vda) obj7;
                    defpackage.vvb vvbVar3 = (defpackage.vvb) obj8;
                    vvbVar3.c.o(rmx.oi);
                    android.telecom.PhoneAccountHandle phoneAccountHandleK4 = ttj.k((vzi) obj9);
                    if (phoneAccountHandleK4 == null) {
                        a.d().l("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailErrorActionsImpl", "startVvmPackage", 306, "VoicemailErrorActionsImpl.java").v("Invalid PhoneAccountHandle in VoicemailStatus for startVvmPackage");
                        return;
                    }
                    ahrv ahrvVarG = ahrv.g(vdaVar.a(phoneAccountHandleK4));
                    vuu vuuVar = new vuu(phoneAccountHandleK4, 3);
                    ajct ajctVar = vvbVar3.e;
                    agsm.i(1012, ahrvVarG.i(vuuVar, ajctVar).i(new vuu(obj8, 4), ajctVar), "Failed to open VVM carrier app.", new java.lang.Object[0]);
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                this.c.o(rmx.ok);
                ipc ipcVar = this.i;
                akzx akzxVarM = defpackage.rvq.a.m();
                akzx akzxVarM2 = defpackage.rvo.a.m();
                defpackage.rvc rvcVar = defpackage.rvc.VOICEMAIL;
                akzxVarM2.u();
                ((defpackage.rvo) akzxVarM2.b).d = rvcVar.a();
                defpackage.rvo rvoVar = (defpackage.rvo) akzxVarM2.p();
                akzxVarM.u();
                defpackage.rvq rvqVar = (defpackage.rvq) akzxVarM.b;
                j$.util.Objects.requireNonNull(rvoVar);
                rvqVar.d = rvoVar;
                rvqVar.c = 2;
                afsq.G(awVar, ipcVar.aL((defpackage.rvq) akzxVarM.p()));
                return;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                android.content.Intent intent4 = new android.content.Intent("android.intent.action.VIEW");
                intent4.setAction("android.settings.MANAGE_ALL_SIM_PROFILES_SETTINGS");
                intent4.addFlags(268435456);
                afsq.G(awVar, intent4);
                return;
            default:
                throw new java.lang.AssertionError();
        }
    }
}
