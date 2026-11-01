package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rde extends defpackage.aftt {
    final /* synthetic */ defpackage.rdk a;
    final /* synthetic */ java.lang.String b;
    final /* synthetic */ defpackage.qtz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rde(defpackage.rdk rdkVar, java.lang.String str, defpackage.qtz qtzVar) {
        super(null);
        this.a = rdkVar;
        this.b = str;
        this.c = qtzVar;
    }

    @Override // defpackage.aftt
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, int i) {
        defpackage.rdk rdkVar = this.a;
        defpackage.qtz qtzVar = rdkVar.z;
        if (qtzVar == null || (this.b.equals(rdkVar.y) && qtzVar == this.c)) {
            android.view.View view = ((aw) rdkVar.c).Q;
            if (view == null) {
                defpackage.rdk.a.d().i(zct.b).l("com/android/dialer/incall/voice/ui/VoiceFragmentPeer", "hideSnackbarContainers", 2171, "VoiceFragmentPeer.kt").v("rootView is null.");
            } else if (rdkVar.p() || rdkVar.r()) {
                android.view.View viewFindViewById = view.findViewById(2131428969);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(8);
                }
            } else {
                view.findViewById(2131428971).setVisibility(8);
                view.findViewById(2131428970).setVisibility(8);
            }
        }
        defpackage.rap rapVarC = rdkVar.c(this.b);
        if (rapVarC == null) {
            defpackage.rdk.a.d().i(zct.b).l("com/android/dialer/incall/voice/ui/VoiceFragmentPeer$createSnackbar$<anonymous>", "onDismissed", 2107, "VoiceFragmentPeer.kt").v("controller is not available.");
            return;
        }
        defpackage.qtz qtzVar2 = this.c;
        defpackage.qub qubVar = (defpackage.qub) rapVarC.f.get(qtzVar2);
        if (qubVar == null) {
            defpackage.rap.a.b().l("com/android/dialer/incall/voice/service/VoiceController", "onSnackbarMessageDismissed", 205, "VoiceController.java").y("Listener for %s not injected to CallScopeComponent.", qtzVar2.name());
        } else {
            qubVar.c();
        }
    }
}
