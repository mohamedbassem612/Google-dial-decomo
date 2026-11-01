package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yxu extends defpackage.yxy {
    public final defpackage.yxv a;

    public yxu(defpackage.yxv yxvVar) {
        super(yxvVar.A);
        this.a = yxvVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.yxu) && this.a == ((defpackage.yxu) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "AiCoreQueryFailure(reason=" + this.a + ')';
    }
}
