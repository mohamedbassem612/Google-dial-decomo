package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gli {
    public android.view.View b;
    public final java.util.Map a = new java.util.HashMap();
    final java.util.ArrayList c = new java.util.ArrayList();

    public gli(android.view.View view) {
        this.b = view;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.gli) {
            defpackage.gli gliVar = (defpackage.gli) obj;
            if (this.b == gliVar.b && this.a.equals(gliVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String strConcat = (("TransitionValues@" + java.lang.Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + '\n').concat("    values:");
        java.util.Map map = this.a;
        for (java.lang.String str : map.keySet()) {
            strConcat = strConcat + "    " + str + ": " + map.get(str) + '\n';
        }
        return strConcat;
    }

    @java.lang.Deprecated
    public gli() {
    }
}
