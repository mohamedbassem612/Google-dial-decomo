package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qyz {
    public final java.util.List a;
    public final aonj b;
    public final boolean c;

    public qyz(java.util.List list, aonj aonjVar, boolean z) {
        aooh.f(list, "categoryButtons");
        aooh.f(aonjVar, "categoryButtonClickHandler");
        this.a = list;
        this.b = aonjVar;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.qyz) {
            defpackage.qyz qyzVar = (defpackage.qyz) obj;
            if (aooh.n(this.a, qyzVar.a) && aooh.n(this.b, qyzVar.b) && this.c == qyzVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + anty.L(this.c);
    }

    public final java.lang.String toString() {
        return "CuldesacComposableUiModel(categoryButtons=" + this.a + ", categoryButtonClickHandler=" + this.b + ", useTwoColumnLayout=" + this.c + ')';
    }
}
