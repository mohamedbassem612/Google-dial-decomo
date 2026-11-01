package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ocn implements defpackage.znb {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ocn(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.znb
    public final void a(java.lang.String str, android.os.Bundle bundle) {
        int i = this.$cid;
        if (i == 0) {
            aooh.f(str, "event");
            aimz aimzVar = defpackage.ocq.a;
            aimzVar.b().l("com/android/dialer/emergencycalling/satellitesos/impl/service/DisplayEmergencyMessageEventListener", "onConnectionEventReceived", 75, "DisplayEmergencyMessageEventListener.kt").v("enter");
            if (bundle == null) {
                aimzVar.b().l("com/android/dialer/emergencycalling/satellitesos/impl/service/DisplayEmergencyMessageEventListener", "onConnectionEventReceived", 77, "DisplayEmergencyMessageEventListener.kt").v("Null bundle.");
                return;
            }
            java.lang.Object obj = this.a;
            aimz aimzVar2 = zih.a;
            defpackage.ocq ocqVar = (defpackage.ocq) obj;
            aoov.al(ocqVar.b, zih.b.plus(aols.a), 1, new defpackage.ocp(null, ocqVar, str, bundle));
            return;
        }
        if (i == 1) {
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                java.lang.Object obj2 = this.a;
                aooh.c(str);
                defpackage.iog iogVar = (defpackage.iog) obj2;
                aoov.an(iogVar.a, (aolr) null, 0, new defpackage.hyq(iogVar, str, bundle, (aoln) null, 6), 3);
                return;
            }
            return;
        }
        xcy xcyVar = (xcy) this.a;
        if (xcyVar.B && "android.telecom.event.CALL_REMOTELY_HELD".equals(str)) {
            a.bI(xcy.a.b(), "call remotely held", "com/android/incallui/atlas/ui/impl/tidepods/session/HoldForMeSession", "onConnectionEvent", (char) 582, "HoldForMeSession.java", zct.a);
            wxm wxmVar = xcyVar.e;
            long j = xcyVar.r;
            wxmVar.b(j, alex.au);
            xdh xdhVar = xcyVar.o;
            akzx akzxVarM = wya.a.m();
            akzx akzxVarM2 = wxs.a.m();
            akzxVarM2.u();
            wxs wxsVar = akzxVarM2.b;
            wxsVar.c = 1;
            wxsVar.b |= 1;
            akzxVarM.u();
            wya wyaVar = akzxVarM.b;
            wxs wxsVarP = akzxVarM2.p();
            j$.util.Objects.requireNonNull(wxsVarP);
            wyaVar.d = wxsVarP;
            wyaVar.c = 8;
            akzxVarM.u();
            wya wyaVar2 = akzxVarM.b;
            wyaVar2.b |= 1;
            wyaVar2.e = j;
            agsm.i(1174, xdhVar.b(akzxVarM.p()), "failed to update UI state to 'error-silence'", new java.lang.Object[0]);
        }
    }
}
