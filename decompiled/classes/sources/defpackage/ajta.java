package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajta implements defpackage.aadz {
    public static final java.util.concurrent.atomic.AtomicReference a = new java.util.concurrent.atomic.AtomicReference();

    @Override // defpackage.aadz
    public final void a(boolean z) {
        synchronized (defpackage.ajtc.a) {
            for (defpackage.ajtc ajtcVar : new java.util.ArrayList(defpackage.ajtc.b.values())) {
                if (ajtcVar.d.get()) {
                    android.util.Log.d("FirebaseApp", "Notifying background state change listeners.");
                    for (defpackage.apnt apntVar : ajtcVar.g) {
                        if (!z) {
                            ((defpackage.ajvp) ((defpackage.ajtc) apntVar.a).f.a()).c();
                        }
                    }
                }
            }
        }
    }
}
