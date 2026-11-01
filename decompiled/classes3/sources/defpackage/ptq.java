package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ptq implements zog {
    private final android.telecom.Call a;
    private final defpackage.ptt b;
    private final aoin c;
    private final hwv d;

    public ptq(android.telecom.Call call, hwv hwvVar, defpackage.ptt pttVar, aoin aoinVar) {
        this.a = call;
        this.d = hwvVar;
        this.b = pttVar;
        this.c = aoinVar;
    }

    public final int a() {
        return -100;
    }

    public final void b(android.telecom.Call.Details details) {
        defpackage.pug pugVar = (defpackage.pug) this.c.a();
        defpackage.ptt pttVar = this.b;
        pttVar.c = pugVar;
        aimz aimzVar = defpackage.ptt.a;
        aimzVar.b().l("com/android/dialer/incall/core/call/events/impl/CallEventDriver$AddedListener", "onCallScopeAdded", 162, "CallEventDriver.java").y("state UNKNOWN -> %s", pttVar.c.b());
        android.telecom.Call call = this.a;
        pttVar.d = defpackage.zpo.a(call.getState());
        try {
            if (call.getDetails().getExtras() != null && call.getDetails().getExtras().getBoolean("android.telecom.extra.SILENT_RINGING_REQUESTED")) {
                aimzVar.b().l("com/android/dialer/incall/core/call/events/impl/CallEventDriver$AddedListener", "onCallScopeAdded", 170, "CallEventDriver.java").v("call screened as silent, setting to intercepted");
                hwv hwvVar = this.d;
                ((java.util.concurrent.atomic.AtomicReference) hwvVar.b).set(defpackage.zmx.b);
            }
        } catch (java.lang.IllegalArgumentException e) {
            a.by(defpackage.ptt.a.b(), "Failed to determine if silent ringing was requested", "com/android/dialer/incall/core/call/events/impl/CallEventDriver$AddedListener", "onCallScopeAdded", (char) 179, "CallEventDriver.java", e);
        }
        this.b.a();
    }
}
