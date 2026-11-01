package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class las implements agye {
    final /* synthetic */ defpackage.lay a;

    public las(defpackage.lay layVar) {
        j$.util.Objects.requireNonNull(layVar);
        this.a = layVar;
    }

    public final void a(java.lang.Throwable th) {
        a.bq(defpackage.lay.a.c(), "failed to retrieve crosby settings", "com/android/dialer/callrecording/impl/settings/SelectedContactNumbersFragmentPeer$2", "onError", (char) 154, "SelectedContactNumbersFragmentPeer.java", th, zct.b);
        this.a.a().setEnabled(false);
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        defpackage.lap lapVar = (defpackage.lap) obj;
        defpackage.lay layVar = this.a;
        android.widget.Switch switchA = layVar.a();
        switchA.setChecked(lapVar.c);
        switchA.setEnabled(true);
        defpackage.lba lbaVarB = defpackage.lba.b(lapVar.e);
        if (lbaVarB == null) {
            lbaVarB = defpackage.lba.UNKNOWN;
        }
        defpackage.lay.a.b().l("com/android/dialer/callrecording/impl/settings/SelectedContactNumbersFragmentPeer", "setUiMode", 435, "SelectedContactNumbersFragmentPeer.java").y("UiMode: %s", lbaVarB);
        int iOrdinal = lbaVarB.ordinal();
        if (iOrdinal == 1) {
            layVar.a().setEnabled(true);
            layVar.b().setVisibility(8);
        } else if (iOrdinal == 2) {
            layVar.a().setEnabled(false);
            layVar.b().setText(layVar.c.Y(2132020063));
            layVar.b().setVisibility(0);
        } else {
            if (iOrdinal != 3) {
                throw new java.lang.AssertionError();
            }
            layVar.a().setEnabled(false);
            layVar.b().setText(layVar.c.Y(2132020064));
            layVar.b().setVisibility(0);
        }
        layVar.i.x(lapVar.d);
    }

    public final void c() {
        this.a.a().setEnabled(false);
    }
}
