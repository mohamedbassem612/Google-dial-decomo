package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class avv implements azz {
    private final int a;
    private final java.lang.String b;
    private final ccp c;
    private final ccp d;

    public avv(int i, java.lang.String str) {
        this.a = i;
        this.b = str;
        dwn dwnVar = dwn.a;
        cdu cduVar = cdu.c;
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableState(dwnVar, cduVar);
        this.d = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.TRUE, cduVar);
    }

    public final int a(dpf dpfVar) {
        return e().e;
    }

    public final int b(dpf dpfVar, dpq dpqVar) {
        return e().b;
    }

    public final int c(dpf dpfVar, dpq dpqVar) {
        return e().d;
    }

    public final int d(dpf dpfVar) {
        return e().c;
    }

    public final dwn e() {
        return (dwn) this.c.a();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.avv) && this.a == ((defpackage.avv) obj).a;
        }
        return true;
    }

    public final void f(boolean z) {
        this.d.b(java.lang.Boolean.valueOf(z));
    }

    public final void g(eax eaxVar) {
        int i = this.a;
        this.c.b(eaxVar.f(i));
        f(eaxVar.y(i));
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return this.b + '(' + e().b + ", " + e().c + ", " + e().d + ", " + e().e + ')';
    }
}
