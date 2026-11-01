package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vrk implements ajaz {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ vrk(defpackage.rhs rhsVar, java.lang.String str, int i) {
        this.$cid = i;
        this.b = rhsVar;
        this.a = str;
    }

    public final ajbg a() {
        ajcq ajcqVarF;
        if (this.$cid == 0) {
            defpackage.vrl vrlVar = (defpackage.vrl) this.a;
            zjm zjmVar = vrlVar.f;
            boolean zIsPresent = zjmVar.g().isPresent();
            java.lang.Object obj = this.b;
            defpackage.vqt vqtVar = null;
            if (zIsPresent && ((vda) zjmVar.g().orElseThrow()).c((android.telecom.PhoneAccountHandle) obj).isPresent()) {
                vqtVar = vrlVar.e;
            }
            return new ajbg(ahvr.I(ahvr.F(new vms(vqtVar, obj, 4), vrlVar.b), new defpackage.vjx(vrlVar, vqtVar, (android.telecom.PhoneAccountHandle) obj, 19), vrlVar.c));
        }
        zpm zpmVar = ((defpackage.rhs) this.b).b;
        java.lang.Object obj2 = this.a;
        j$.util.Optional optionalE = zpmVar.e((java.lang.String) obj2);
        if (optionalE.isPresent()) {
            defpackage.rhp rhpVarAu = ((defpackage.rhr) ((defpackage.apqr) optionalE.orElseThrow()).a(defpackage.rhr.class)).au();
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = rhpVarAu.d;
            j$.util.Objects.requireNonNull(atomicBoolean);
            ajcqVarF = ahvr.F(new raj(atomicBoolean, 8), rhpVarAu.c);
        } else {
            a.bt(defpackage.rhs.a.d(), "Call id %s was not found in CallScopes", obj2, "com/android/dialer/internationalcallonwifi/service/InternationalCallOnWifiDialogDataService", "hasCallDisconnected", '3', "InternationalCallOnWifiDialogDataService.java", zct.b);
            ajcqVarF = aiql.z(java.lang.Boolean.TRUE);
        }
        return new ajbg(ajcqVarF);
    }

    public /* synthetic */ vrk(defpackage.vrl vrlVar, android.telecom.PhoneAccountHandle phoneAccountHandle, int i) {
        this.$cid = i;
        this.a = vrlVar;
        this.b = phoneAccountHandle;
    }
}
