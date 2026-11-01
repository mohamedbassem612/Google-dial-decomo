package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kjk {
    public final java.lang.String a;

    public kjk(java.lang.String str) {
        aooh.f(str, "entryText");
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.kjk) && aooh.n(this.a, ((defpackage.kjk) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "DetailedCallHistoryEntryUiModel(entryText=" + this.a + ')';
    }
}
