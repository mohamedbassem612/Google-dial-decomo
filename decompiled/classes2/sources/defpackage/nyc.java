package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nyc extends android.telecom.Call.Callback {
    final /* synthetic */ defpackage.nye a;

    public nyc(defpackage.nye nyeVar) {
        j$.util.Objects.requireNonNull(nyeVar);
        this.a = nyeVar;
    }

    @Override // android.telecom.Call.Callback
    public final void onCallDestroyed(android.telecom.Call call) {
        defpackage.nye.a.b().l("com/android/dialer/duo/impl/DuoFallbackServiceConnection$1", "onCallDestroyed", 149, "DuoFallbackServiceConnection.java").v("call destroyed");
        this.a.a();
    }

    @Override // android.telecom.Call.Callback
    public final void onStateChanged(android.telecom.Call call, int i) {
        if (i == 7) {
            defpackage.yrs yrsVar = this.a.c;
            if (yrsVar == null) {
                defpackage.nye.a.b().l("com/android/dialer/duo/impl/DuoFallbackServiceConnection$1", "onStateChanged", 130, "DuoFallbackServiceConnection.java").v("target null");
            } else {
                try {
                    yrsVar.eS(2, yrsVar.eP());
                    defpackage.nye.a.b().l("com/android/dialer/duo/impl/DuoFallbackServiceConnection$1", "onStateChanged", 134, "DuoFallbackServiceConnection.java").v("calling target.onSourceDisconnected()");
                } catch (android.os.RemoteException e) {
                    a.bq(defpackage.nye.a.c(), "failed to call target.onSourceDisconnected()", "com/android/dialer/duo/impl/DuoFallbackServiceConnection$1", "onStateChanged", (char) 140, "DuoFallbackServiceConnection.java", e, zct.b);
                }
            }
            this.a.a();
        }
    }
}
