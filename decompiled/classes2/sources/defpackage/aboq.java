package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aboq {
    public final java.util.List a;
    public final boolean b;
    public final boolean c;

    public aboq(java.util.List list, boolean z) {
        aooh.f(list, "items");
        this.a = list;
        this.b = true;
        this.c = z;
    }

    public static /* synthetic */ defpackage.aboq a(defpackage.aboq aboqVar) {
        java.util.List list = aboqVar.a;
        aooh.f(list, "items");
        return new defpackage.aboq(list, true);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aboq) {
            defpackage.aboq aboqVar = (defpackage.aboq) obj;
            if (aooh.n(this.a, aboqVar.a)) {
                boolean z = aboqVar.b;
                if (this.c == aboqVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + anty.L(true)) * 31) + anty.L(this.c);
    }

    public final java.lang.String toString() {
        return "TranscriptionMessageListUiData(items=" + this.a + ", enableAutoScrollNearBottom=true, enableAnimationStates=" + this.c + ')';
    }
}
