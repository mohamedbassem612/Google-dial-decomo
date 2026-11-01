package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gnn {
    private final java.util.List a;
    private final boolean b;
    private final androidx.window.extensions.embedding.ActivityStack.Token c;

    public gnn(java.util.List list, boolean z, androidx.window.extensions.embedding.ActivityStack.Token token) {
        aooh.f(list, "activitiesInProcess");
        this.a = list;
        this.b = z;
        this.c = token;
    }

    public final boolean a(android.app.Activity activity) {
        return this.a.contains(activity);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gnn) {
            defpackage.gnn gnnVar = (defpackage.gnn) obj;
            if (aooh.n(this.a, gnnVar.a) && this.b == gnnVar.b && aooh.n(this.c, gnnVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        androidx.window.extensions.embedding.ActivityStack.Token token = this.c;
        return ((iHashCode + anty.L(this.b)) * 31) + (token != null ? token.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "ActivityStack{activitiesInProcess=" + this.a + ", isEmpty=" + this.b + ", token=" + this.c + '}';
    }
}
