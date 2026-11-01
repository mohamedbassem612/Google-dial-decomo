package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class roh implements defpackage.ahtl {
    private final /* synthetic */ int $cid;

    public roh(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ahtl
    public final /* synthetic */ ahtm a(defpackage.ahth ahthVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.aooh.f((defpackage.mlc) ahthVar, "event");
            ((defpackage.aimw) defpackage.rog.a.d().l("com/android/dialer/main/impl/MainActivityPeer", "onPreCallDialpadQueryEvent", 335, "MainActivityPeer.kt")).v("This should be invoked only when the first time the activity is recreated after the modernized main activity flag value is propagated.");
            return ahtm.a;
        }
        if (i == 1) {
            defpackage.aooh.f((defpackage.mlb) ahthVar, "event");
            ((defpackage.aimw) defpackage.rog.a.d().l("com/android/dialer/main/impl/MainActivityPeer", "onCallPlacedFromPreCallDialpad", 346, "MainActivityPeer.kt")).v("This should be invoked only when the first time the activity is recreated after the modernized main activity flag value is propagated.");
            return ahtm.a;
        }
        if (i != 2) {
            defpackage.aooh.f((defpackage.rod) ahthVar, "event");
            ((defpackage.aimw) defpackage.rog.a.d().l("com/android/dialer/main/impl/MainActivityPeer", "onShowDialPadEvent", 324, "MainActivityPeer.kt")).v("This should be invoked only when the first time the activity is recreated after the modernized main activity flag value is propagated.");
            return ahtm.a;
        }
        defpackage.aooh.f((defpackage.mld) ahthVar, "event");
        ((defpackage.aimw) defpackage.rog.a.d().l("com/android/dialer/main/impl/MainActivityPeer", "onPreCallDialpadShown", 357, "MainActivityPeer.kt")).v("This should be invoked only when the first time the activity is recreated after the modernized main activity flag value is propagated.");
        return ahtm.a;
    }
}
