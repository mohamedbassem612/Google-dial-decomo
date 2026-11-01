package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xlj implements defpackage.xpa {
    public static final defpackage.xer a = new defpackage.xer(11);
    private final int b;
    private final com.android.onboarding.tasks.ErasedOnboardingTaskToken c;
    private final j$.time.Instant d;

    public xlj(int i, com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken, j$.time.Instant instant) {
        aooh.f(instant, "executionTime");
        this.b = i;
        this.c = erasedOnboardingTaskToken;
        this.d = instant;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xlj) {
            defpackage.xlj xljVar = (defpackage.xlj) obj;
            if (this.b == xljVar.b && aooh.n(this.c, xljVar.c) && aooh.n(this.d, xljVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putInt("contractInputHash", this.b);
        defpackage.xfh.i(persistableBundle, "token", this.c);
        persistableBundle.putLong("executionTime", this.d.toEpochMilli());
        return persistableBundle;
    }

    public final java.lang.String toString() {
        return "TaskExecutionHistory(contractInputHash=" + this.b + ", token=" + this.c + ", executionTime=" + this.d + ')';
    }
}
