package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xll implements defpackage.xpa {
    public static final defpackage.xer b = new defpackage.xer(12);
    public final j$.time.Duration a;

    public xll(j$.time.Duration duration) {
        this.a = duration;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.xll) && aooh.n(this.a, ((defpackage.xll) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        j$.time.Duration duration = this.a;
        if (duration == null) {
            return 0;
        }
        return duration.hashCode();
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        j$.time.Duration duration = this.a;
        persistableBundle.putString("delayFor", duration != null ? duration.toString() : null);
        return persistableBundle;
    }

    public final java.lang.String toString() {
        return "Input(delayFor=" + this.a + ')';
    }

    public xll() {
        this(null);
    }
}
