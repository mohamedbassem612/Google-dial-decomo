package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gnl {
    private final defpackage.gmt a;
    private final java.lang.String b;

    public gnl(android.content.ComponentName componentName) {
        defpackage.gmt gmtVar = new defpackage.gmt(componentName);
        this.a = gmtVar;
        this.b = null;
        defpackage.goz.a(gmtVar.a, gmtVar.b);
    }

    public final boolean a(android.app.Activity activity) {
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
        return defpackage.goz.c(activity, this.a);
    }

    public final boolean b(android.content.Intent intent) {
        defpackage.aooh.f(intent, "intent");
        return defpackage.goz.d(intent, this.a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gnl) {
            defpackage.gnl gnlVar = (defpackage.gnl) obj;
            if (defpackage.aooh.n(this.a, gnlVar.a)) {
                java.lang.String str = gnlVar.b;
                if (defpackage.aooh.n(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final java.lang.String toString() {
        return "ActivityFilter(componentName=" + this.a + ", intentAction=null)";
    }
}
