package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@com.android.onboarding.contracts.annotations.InternalOnboardingApi
public final class xnv implements defpackage.xgk {
    public final defpackage.xfz a;
    private final android.os.PersistableBundle b;

    public xnv(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "bundle");
        this.b = persistableBundle;
        defpackage.xfz xfzVar = defpackage.xfz.USER_CANCELLED;
        this.a = defpackage.xer.d(persistableBundle);
    }

    @Override // defpackage.xgk
    public final defpackage.xfz a() {
        return this.a;
    }

    @Override // defpackage.xgk, defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        return new android.os.PersistableBundle(this.b);
    }

    public final java.lang.String toString() {
        return "EncodedTaskInterrupt(" + this.a + ')';
    }
}
