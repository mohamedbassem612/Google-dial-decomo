package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uqr implements defpackage.opu {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/suggestcontacts/impl/SuggestContactsGlobalContentObserver");
    private final defpackage.agwz b;

    public uqr(defpackage.ajct ajctVar, defpackage.aoin aoinVar, defpackage.ahpz ahpzVar) {
        this.b = new defpackage.uqq(this, ahpzVar, ajctVar, aoinVar, ajctVar);
    }

    @Override // defpackage.opu
    public final android.net.Uri a() {
        return android.provider.CallLog.Calls.CONTENT_URI;
    }

    @Override // defpackage.opu
    public final defpackage.agwz b() {
        return this.b;
    }

    @Override // defpackage.opu
    public final java.lang.String c() {
        return "SuggestContactsGlobalContentObserver";
    }

    @Override // defpackage.opu
    public final void d() {
    }
}
