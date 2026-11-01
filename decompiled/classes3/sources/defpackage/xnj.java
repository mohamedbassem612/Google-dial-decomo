package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xnj implements defpackage.xpa {
    public final android.os.PersistableBundle a;

    public xnj(android.os.PersistableBundle persistableBundle) {
        this.a = persistableBundle;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.xnj) && aooh.n(this.a, ((defpackage.xnj) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.xpa
    @com.android.onboarding.contracts.annotations.InternalOnboardingApi
    public final android.os.PersistableBundle toPersistableBundle() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "PrecalculatedData(data=" + this.a + ')';
    }
}
