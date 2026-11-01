package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yzy implements defpackage.zaa {
    public final defpackage.yzx a;

    public yzy(defpackage.yzx yzxVar) {
        this.a = yzxVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.yzy) && this.a == ((defpackage.yzy) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "SkippableWindow(reason=" + this.a + ')';
    }
}
