package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hpx implements defpackage.zog {
    private static final defpackage.aimz b = defpackage.aimz.i("com/android/dialer/androidauto/impl/incall/listener/CarCallScopeAddedListener");
    public final defpackage.aoyq a = defpackage.aoyx.c(1, 0, 0, 6);

    @Override // defpackage.zog
    public final /* synthetic */ int a() {
        return 0;
    }

    @Override // defpackage.zog
    public final void b(android.telecom.Call.Details details) {
        ((defpackage.aimw) b.b().l("com/android/dialer/androidauto/impl/incall/listener/CarCallScopeAddedListener", "onCallScopeAdded", 22, "CarCallScopeAddedListener.kt")).y("Emitting to CarCallScopeAdded flow, result = %s", java.lang.Boolean.valueOf(this.a.d(defpackage.aojh.a)));
    }
}
