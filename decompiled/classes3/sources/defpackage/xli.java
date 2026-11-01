package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xli implements defpackage.xpa {
    public static final defpackage.xer b = new defpackage.xer(10);
    public final java.util.List a;

    public xli(java.util.List list) {
        this.a = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.xli) && aooh.n(this.a, ((defpackage.xli) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        defpackage.xfh.k(persistableBundle, "TaskExecutionHistoryList", this.a);
        return persistableBundle;
    }

    public final java.lang.String toString() {
        return "PersistableTaskExecutionHistories(histories=" + this.a + ')';
    }
}
