package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abxz {
    public final android.view.View a;
    public final defpackage.abya b;
    public final java.lang.Object c;

    public abxz(android.view.View view, defpackage.abya abyaVar, java.lang.Object obj) {
        this.a = view;
        this.b = abyaVar;
        this.c = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abxz) {
            defpackage.abxz abxzVar = (defpackage.abxz) obj;
            if (aooh.n(this.a, abxzVar.a) && aooh.n(this.b, abxzVar.b) && aooh.n(this.c, abxzVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "BoundView(view=" + this.a + ", viewData=" + this.b + ", bindingResult=" + this.c + ')';
    }
}
