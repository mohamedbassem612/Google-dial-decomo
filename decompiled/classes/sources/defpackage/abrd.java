package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abrd implements java.io.Serializable, defpackage.abrn {
    private static final java.util.concurrent.TimeUnit a = java.util.concurrent.TimeUnit.MINUTES;
    private static final long serialVersionUID = 0;

    @Override // defpackage.abrn
    public final int a() {
        return 1;
    }

    @Override // java.lang.annotation.Annotation
    public final java.lang.Class annotationType() {
        return defpackage.abrn.class;
    }

    @Override // defpackage.abrn
    public final int b() {
        return 1000;
    }

    @Override // defpackage.abrn
    public final int c() {
        return 1;
    }

    @Override // defpackage.abrn
    public final int d() {
        return 1;
    }

    @Override // defpackage.abrn
    public final int e() {
        return 1000;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.abrn) {
            defpackage.abrn abrnVar = (defpackage.abrn) obj;
            abrnVar.d();
            abrnVar.e();
            abrnVar.a();
            abrnVar.b();
            abrnVar.c();
            abrnVar.f();
            if (a.equals(abrnVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.abrn
    public final long f() {
        return 1L;
    }

    @Override // defpackage.abrn
    public final java.util.concurrent.TimeUnit g() {
        return a;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (a.hashCode() ^ (-810573619)) - 1944263094;
    }

    @Override // java.lang.annotation.Annotation
    public final java.lang.String toString() {
        return "@com.google.android.libraries.concurrent.monitoring.ThreadMonitoringConfiguration()";
    }
}
