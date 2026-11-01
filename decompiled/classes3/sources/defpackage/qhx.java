package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qhx implements android.hardware.display.DisplayManager.DisplayListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public qhx(defpackage.qdp qdpVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(qdpVar);
        this.a = qdpVar;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        aomy aomyVar;
        if (this.$cid != 0) {
            if (i == 0) {
                java.lang.Object obj = this.a;
                defpackage.qdp qdpVar = (defpackage.qdp) obj;
                boolean z = qdpVar.i.j(0) != 1;
                ahok ahokVarF = qdpVar.d.f(585, "DisplayStateTracker.displayListener.onDisplayChanged");
                try {
                    agsm.i(586, ahvr.E(new gql(this, z, 7), ((defpackage.qdp) obj).b), "Failed to update isDisplayOn or call notifyStateChange.", new java.lang.Object[0]);
                    ahokVarF.close();
                    return;
                } catch (java.lang.Throwable th) {
                    try {
                        ahokVarF.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            return;
        }
        if (i == 0) {
            defpackage.qhz qhzVar = (defpackage.qhz) this.a;
            int iJ = qhzVar.j.j(0);
            int i2 = qhzVar.g;
            qhzVar.g = iJ;
            if (i2 == 2 || i2 == 6) {
                if ((iJ == 1 || iJ == 3 || iJ == 4) && (aomyVar = qhzVar.e) != null) {
                    aomyVar.a();
                }
            }
        }
    }

    public qhx(defpackage.qhz qhzVar, int i) {
        this.$cid = i;
        this.a = qhzVar;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
