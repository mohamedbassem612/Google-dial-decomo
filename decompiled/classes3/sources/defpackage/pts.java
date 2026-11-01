package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pts implements zne {
    private final defpackage.ptt a;

    public pts(defpackage.ptt pttVar) {
        this.a = pttVar;
    }

    public final void b(android.telecom.Call call, int i) {
        ahoq ahoqVarW = ahvr.W(528, "CallEventDriver_StateListener_onStateChanged");
        try {
            defpackage.zpo zpoVarA = defpackage.zpo.a(i);
            defpackage.ptt pttVar = this.a;
            if (zpoVarA != pttVar.d) {
                defpackage.ptt.a.b().l("com/android/dialer/incall/core/call/events/impl/CallEventDriver$StateListener", "onStateChanged", 133, "CallEventDriver.java").I("Telecom state %s -> %s", pttVar.d, zpoVarA);
                pttVar.d = zpoVarA;
                pttVar.a();
            }
            ahoqVarW.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
