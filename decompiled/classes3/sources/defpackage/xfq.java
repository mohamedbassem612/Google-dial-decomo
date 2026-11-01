package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@com.android.onboarding.contracts.annotations.InternalOnboardingApi
public final class xfq implements defpackage.xpa {
    public static final defpackage.xer a = new defpackage.xer(1);
    private final defpackage.xgs b;

    public xfq(defpackage.xgs xgsVar) {
        this.b = xgsVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.xfq) && aooh.n(this.b, ((defpackage.xfq) obj).b);
        }
        return true;
    }

    public final int hashCode() {
        defpackage.xgs xgsVar = this.b;
        if (xgsVar == null) {
            return 0;
        }
        return xgsVar.hashCode();
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        defpackage.xfh.i(persistableBundle, "next_activity", this.b);
        return persistableBundle;
    }

    public final java.lang.String toString() {
        return "ResultRedirectionConfig(nextActivity=" + this.b + ')';
    }
}
