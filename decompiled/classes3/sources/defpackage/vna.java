package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vna implements ahjr {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/service/receivers/FetchVoicemailReceiver");
    public final ajct b;
    public final oko c;
    public final zjm d;
    public final ajyi e;
    private final android.content.Context f;
    private final vdo g;
    private final jna h;
    private final zzx i;
    private final aogc j;

    public vna(android.content.Context context, ajct ajctVar, jna jnaVar, zjm zjmVar, zzx zzxVar, vdo vdoVar, aogc aogcVar, oko okoVar, ajyi ajyiVar) {
        this.f = context;
        this.b = ajctVar;
        this.h = jnaVar;
        this.d = zjmVar;
        this.i = zzxVar;
        this.g = vdoVar;
        this.j = aogcVar;
        this.c = okoVar;
        this.e = ajyiVar;
    }

    public final ajcq a(android.content.Intent intent, int i) {
        boolean zEquals = intent.getAction().equals("android.intent.action.FETCH_VOICEMAIL");
        aimz aimzVar = a;
        if (!zEquals) {
            a.bt(aimzVar.d(), "Received unexpected action: %s", intent.getAction(), "com/android/dialer/voicemail/service/receivers/FetchVoicemailReceiver", "onReceive", 'W', "FetchVoicemailReceiver.java", zct.b);
            return ajcm.a;
        }
        ainm ainmVarB = aimzVar.b();
        ainp ainpVar = zct.a;
        a.bI(ainmVarB, "ACTION_FETCH_VOICEMAIL received", "com/android/dialer/voicemail/service/receivers/FetchVoicemailReceiver", "onReceive", '[', "FetchVoicemailReceiver.java", ainpVar);
        if (this.i.m()) {
            aimzVar.b().l("com/android/dialer/voicemail/service/receivers/FetchVoicemailReceiver", "onReceive", 93, "FetchVoicemailReceiver.java").v("Received broadcast during direct boot");
            return ajcm.a;
        }
        if (!this.d.g().isPresent()) {
            aimzVar.b().l("com/android/dialer/voicemail/service/receivers/FetchVoicemailReceiver", "onReceive", 97, "FetchVoicemailReceiver.java").v("vvmServiceProvider is disabled");
            return ajcm.a;
        }
        android.net.Uri data = intent.getData();
        if (data == null) {
            aimzVar.d().i(zct.b).i(ainpVar).l("com/android/dialer/voicemail/service/receivers/FetchVoicemailReceiver", "onReceive", 107, "FetchVoicemailReceiver.java").y("%s intent sent with no data", "android.intent.action.FETCH_VOICEMAIL");
            return ajcm.a;
        }
        android.content.Context context = this.f;
        java.lang.String queryParameter = data.getQueryParameter("source_package");
        if (!context.getPackageName().equals(queryParameter)) {
            aimzVar.c().m(aioa.b).i(zct.b).i(ainpVar).l("com/android/dialer/voicemail/service/receivers/FetchVoicemailReceiver", "onReceive", 117, "FetchVoicemailReceiver.java").y("ACTION_FETCH_VOICEMAIL is from foreign package: %s", queryParameter);
            return ajcm.a;
        }
        ajcq ajcqVarI = ahvr.I(this.g.f(data), new ajat() { // from class: vmz
            public final ajcq a(java.lang.Object obj) {
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (!optional.isPresent()) {
                    a.bI(defpackage.vna.a.d(), "Can't find the voicemail to download audio in local", "com/android/dialer/voicemail/service/receivers/FetchVoicemailReceiver", "downloadAudio", (char) 142, "FetchVoicemailReceiver.java", zct.b);
                    return ajcm.a;
                }
                defpackage.vna vnaVar = this.a;
                if (vnaVar.e.at()) {
                    defpackage.vna.a.b().l("com/android/dialer/voicemail/service/receivers/FetchVoicemailReceiver", "downloadAudio", 146, "FetchVoicemailReceiver.java").y("FetchVoicemailReceiver downloading audio for UID: %s", ((defpackage.vdg) optional.orElseThrow()).c);
                }
                if (!((defpackage.vdg) optional.orElseThrow()).a().isPresent()) {
                    a.bI(defpackage.vna.a.d(), "Voicemail to download audio doesn't associate with any phone account", "com/android/dialer/voicemail/service/receivers/FetchVoicemailReceiver", "downloadAudio", (char) 154, "FetchVoicemailReceiver.java", zct.b);
                    return ajcm.a;
                }
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) ((defpackage.vdg) optional.orElseThrow()).a().orElseThrow();
                zjm zjmVar = vnaVar.d;
                if (!((vda) zjmVar.g().orElseThrow()).c(phoneAccountHandle).isPresent()) {
                    defpackage.vna.a.b().l("com/android/dialer/voicemail/service/receivers/FetchVoicemailReceiver", "downloadAudio", 164, "FetchVoicemailReceiver.java").v("vvmServiceScheduler doesn't support the phone account");
                    return ajcm.a;
                }
                if (!vnaVar.c.D(phoneAccountHandle).isPresent()) {
                    hgb.j(defpackage.vna.a.c().m(aioa.b), "account no longer valid, cannot retrieve message", "com/android/dialer/voicemail/service/receivers/FetchVoicemailReceiver", "downloadAudio", (char) 174, "FetchVoicemailReceiver.java", zct.b, zct.a);
                    return ajcm.a;
                }
                akzx akzxVarM = defpackage.vcm.a.m();
                java.lang.String string = ((defpackage.vdg) optional.orElseThrow()).a.toString();
                akzxVarM.u();
                defpackage.vcm vcmVar = (defpackage.vcm) akzxVarM.b;
                j$.util.Objects.requireNonNull(string);
                vcmVar.b = string;
                java.lang.String str = ((defpackage.vdg) optional.orElseThrow()).c;
                akzxVarM.u();
                defpackage.vcm vcmVar2 = (defpackage.vcm) akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                vcmVar2.c = str;
                defpackage.vcm vcmVar3 = (defpackage.vcm) akzxVarM.p();
                vee veeVar = (vee) zjm.t(zjmVar, phoneAccountHandle).orElseThrow();
                akzx akzxVarM2 = defpackage.vce.a.m();
                akzx akzxVarM3 = defpackage.vbr.a.m();
                akzxVarM3.u();
                defpackage.vbr vbrVar = (defpackage.vbr) akzxVarM3.b;
                j$.util.Objects.requireNonNull(vcmVar3);
                vbrVar.c = vcmVar3;
                vbrVar.b |= 1;
                akzxVarM2.u();
                defpackage.vce vceVar = (defpackage.vce) akzxVarM2.b;
                defpackage.vbr vbrVar2 = (defpackage.vbr) akzxVarM3.p();
                j$.util.Objects.requireNonNull(vbrVar2);
                vceVar.c = vbrVar2;
                vceVar.b = 9;
                return ahvr.H(veeVar.b(phoneAccountHandle, (defpackage.vce) akzxVarM2.p()), new defpackage.vmj(11), vnaVar.b);
            }
        }, this.b);
        jna jnaVar = this.h;
        aogc aogcVar = this.j;
        akzx akzxVarM = jmz.a.m();
        akzxVarM.u();
        jmz jmzVar = akzxVarM.b;
        jmzVar.b |= 1;
        jmzVar.c = true;
        akzxVarM.u();
        jmz jmzVar2 = akzxVarM.b;
        jmzVar2.d = 7;
        jmzVar2.b |= 2;
        return jnaVar.c(ajcqVarI, aogcVar, akzxVarM.p());
    }
}
