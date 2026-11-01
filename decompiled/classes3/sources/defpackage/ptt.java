package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ptt {
    public static final aimz a = aimz.i("com/android/dialer/incall/core/call/events/impl/CallEventDriver");
    public final mfz b;
    public defpackage.pug c;
    public defpackage.zpo d = defpackage.zpo.b;
    private final android.telecom.Call e;
    private final java.util.concurrent.Executor f;
    private final hwv g;

    public ptt(android.telecom.Call call, hwv hwvVar, ajct ajctVar, mfz mfzVar, defpackage.pum pumVar) {
        this.e = call;
        this.g = hwvVar;
        this.f = new ajdc(ajctVar);
        this.b = mfzVar;
        this.c = pumVar;
    }

    public final void a() {
        int i;
        boolean z;
        ahoq ahoqVarW = ahvr.W(529, "CallEventDriver_updateState");
        try {
            android.telecom.Call call = this.e;
            defpackage.zpo zpoVarA = defpackage.zpo.a(call.getState());
            android.telecom.DisconnectCause disconnectCause = call.getDetails().getDisconnectCause();
            hwv hwvVar = this.g;
            defpackage.zmx zmxVarI = hwvVar.i();
            if (zmxVarI == null) {
                throw new java.lang.NullPointerException("Null interceptionMode");
            }
            if (true != rs$.ExternalSyntheticApiModelOutline0.m(call)) {
                i = 2;
                z = true;
            } else {
                i = 1;
                z = true;
            }
            ajcq ajcqVarE = ahvr.E(new defpackage.pmw(this, new defpackage.pty(zpoVarA, zmxVarI, disconnectCause, i, defpackage.zcy.a(call), hwvVar.n(), hwvVar.m(), call.getState() == 13 ? z : false), 5, null), this.f);
            ahoqVarW.a(ajcqVarE);
            agsm.i(530, ajcqVarE, "failed updating state", new java.lang.Object[0]);
            ahoqVarW.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
