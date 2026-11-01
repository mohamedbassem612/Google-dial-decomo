package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qiv {
    public final boolean a;
    private final int b = 0;
    private final int c = 0;

    public qiv(boolean z) {
        this.a = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.qiv) {
            defpackage.qiv qivVar = (defpackage.qiv) obj;
            int i = qivVar.b;
            int i2 = qivVar.c;
            if (this.a == qivVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return anty.L(this.a);
    }

    public final java.lang.String toString() {
        return "NotificationProgress(maxProgress=0, progress=0, indeterminate=" + this.a + ')';
    }
}
