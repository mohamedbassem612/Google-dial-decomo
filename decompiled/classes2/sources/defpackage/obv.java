package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class obv extends aftt {
    final /* synthetic */ defpackage.obf a;
    final /* synthetic */ defpackage.oby b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public obv(defpackage.obf obfVar, defpackage.oby obyVar) {
        super((byte[]) null);
        this.a = obfVar;
        this.b = obyVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, int i) {
        android.view.View view;
        android.view.View viewFindViewById;
        defpackage.obf obfVar = this.a;
        defpackage.oby obyVar = this.b;
        if (pez.aK(obfVar, obyVar.p) && (view = ((aw) obyVar.b).Q) != null && (viewFindViewById = view.findViewById(2131428396)) != null) {
            viewFindViewById.setVisibility(8);
        }
        defpackage.obd obdVarD = obyVar.d();
        if (obdVarD != null) {
            defpackage.obi obiVarB = defpackage.obi.b(obfVar.o);
            if (obiVarB == null) {
                obiVarB = defpackage.obi.SNACKBAR_NOT_PRESENT;
            }
            int iOrdinal = obiVarB.ordinal();
            if (iOrdinal == 1) {
                defpackage.obd.a.b().l("com/android/dialer/emergencycalling/impl/service/EmergencyVoiceController", "onSnackbarMessageDismissed", 111, "EmergencyVoiceController.kt").v("Showed the snackbar message on failure to initiate as RTT.");
                obdVarD.g.set(true);
                obdVarD.k.a(ajcm.a);
            } else if (iOrdinal != 2) {
                defpackage.obd.a.b().l("com/android/dialer/emergencycalling/impl/service/EmergencyVoiceController", "onSnackbarMessageDismissed", 119, "EmergencyVoiceController.kt").y("No dismiss event listener for snackbar key: %s", obiVarB);
            } else {
                obdVarD.h.set(true);
                obdVarD.k.a(ajcm.a);
            }
        }
    }
}
