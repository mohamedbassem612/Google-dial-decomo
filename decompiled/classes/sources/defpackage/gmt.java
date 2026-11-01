package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gmt {
    public final java.lang.String a;
    public final java.lang.String b;

    public gmt(android.content.ComponentName componentName) {
        if (componentName == null) {
            defpackage.aooh.i("componentName");
        }
        java.lang.String packageName = componentName.getPackageName();
        defpackage.aooh.e(packageName, "getPackageName(...)");
        java.lang.String className = componentName.getClassName();
        defpackage.aooh.e(className, "getClassName(...)");
        if (packageName == null) {
            defpackage.aooh.i("packageName");
        }
        if (className == null) {
            defpackage.aooh.i("className");
        }
        this.a = packageName;
        this.b = className;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (defpackage.aooh.n(getClass(), obj != null ? obj.getClass() : null)) {
            defpackage.aooh.d(obj, "null cannot be cast to non-null type androidx.window.core.ActivityComponentInfo");
            defpackage.gmt gmtVar = (defpackage.gmt) obj;
            if (defpackage.aooh.n(this.a, gmtVar.a) && defpackage.aooh.n(this.b, gmtVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ClassInfo { packageName: " + this.a + ", className: " + this.b + " }";
    }
}
