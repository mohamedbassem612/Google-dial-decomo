package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amet {
    public final java.lang.String a;
    public final defpackage.altp b;

    public amet(java.lang.String str, defpackage.altp altpVar) {
        this.a = str;
        this.b = altpVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.amet) {
            defpackage.amet ametVar = (defpackage.amet) obj;
            if (this.a.equals(ametVar.a) && this.b.equals(ametVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
