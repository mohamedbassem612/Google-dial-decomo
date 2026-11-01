package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kku implements defpackage.opu {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calllog/systemcalllogobserver/SystemCallLogGlobalContentObserver");
    private final defpackage.agwz b;
    private final defpackage.aoin c;

    public kku(defpackage.ajct ajctVar, defpackage.aoin aoinVar, defpackage.ahpz ahpzVar, defpackage.aoin aoinVar2) {
        this.b = new defpackage.kkt(this, ahpzVar, ajctVar, aoinVar);
        this.c = aoinVar2;
    }

    @Override // defpackage.opu
    public final android.net.Uri a() {
        return ((java.lang.Boolean) this.c.a()).booleanValue() ? android.provider.CallLog.Calls.CONTENT_URI.buildUpon().appendQueryParameter("include_voip_calls", "true").build() : android.provider.CallLog.Calls.CONTENT_URI;
    }

    @Override // defpackage.opu
    public final defpackage.agwz b() {
        return this.b;
    }

    @Override // defpackage.opu
    public final java.lang.String c() {
        return "SystemCallLogGlobalContentObserver";
    }

    @Override // defpackage.opu
    public final void d() {
    }
}
