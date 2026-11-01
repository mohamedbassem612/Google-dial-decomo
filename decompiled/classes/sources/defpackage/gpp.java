package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gpp {
    private final defpackage.gmt a;
    private final defpackage.gmt b;
    private final java.lang.String c;

    public gpp(android.content.ComponentName componentName, android.content.ComponentName componentName2) {
        defpackage.gmt gmtVar = new defpackage.gmt(componentName);
        defpackage.gmt gmtVar2 = new defpackage.gmt(componentName2);
        this.a = gmtVar;
        this.b = gmtVar2;
        this.c = null;
        defpackage.goz.a(gmtVar.a, gmtVar.b);
        defpackage.goz.a(gmtVar2.a, gmtVar2.b);
    }

    public final boolean a(android.app.Activity activity, android.content.Intent intent) {
        defpackage.aooh.f(activity, "primaryActivity");
        defpackage.aooh.f(intent, "secondaryActivityIntent");
        return defpackage.goz.c(activity, this.a) && defpackage.goz.d(intent, this.b);
    }

    public final boolean b(android.app.Activity activity, android.app.Activity activity2) {
        defpackage.aooh.f(activity, "primaryActivity");
        defpackage.aooh.f(activity2, "secondaryActivity");
        return defpackage.goz.c(activity, this.a) && defpackage.goz.c(activity2, this.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (defpackage.aooh.n(getClass(), obj != null ? obj.getClass() : null)) {
            defpackage.aooh.d(obj, "null cannot be cast to non-null type androidx.window.embedding.SplitPairFilter");
            defpackage.gpp gppVar = (defpackage.gpp) obj;
            if (defpackage.aooh.n(this.a, gppVar.a) && defpackage.aooh.n(this.b, gppVar.b)) {
                java.lang.String str = gppVar.c;
                if (defpackage.aooh.n(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
    }

    public final java.lang.String toString() {
        defpackage.gmt gmtVar = this.a;
        android.content.ComponentName componentName = new android.content.ComponentName(gmtVar.a, gmtVar.b);
        defpackage.gmt gmtVar2 = this.b;
        return "SplitPairFilter{primaryActivityName=" + componentName + ", secondaryActivityName=" + new android.content.ComponentName(gmtVar2.a, gmtVar2.b) + ", secondaryActivityAction=null}";
    }
}
