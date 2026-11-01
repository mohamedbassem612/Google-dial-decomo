package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qij {
    public final defpackage.qik a;
    private final int b = 2131231941;

    public qij(defpackage.qik qikVar) {
        this.a = qikVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.qij) {
            defpackage.qij qijVar = (defpackage.qij) obj;
            int i = qijVar.b;
            if (this.a == qijVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1643680731;
    }

    public final java.lang.String toString() {
        return "BadgeIcon(iconResId=2131231941, priority=" + this.a + ')';
    }
}
