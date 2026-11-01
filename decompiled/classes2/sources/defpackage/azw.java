package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class azw implements azz {
    private final java.lang.String a;
    private final ccp b;

    public azw(defpackage.ayf ayfVar, java.lang.String str) {
        this.a = str;
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(ayfVar, cdu.c);
    }

    public final int a(dpf dpfVar) {
        return e().d;
    }

    public final int b(dpf dpfVar, dpq dpqVar) {
        return e().a;
    }

    public final int c(dpf dpfVar, dpq dpqVar) {
        return e().c;
    }

    public final int d(dpf dpfVar) {
        return e().b;
    }

    public final defpackage.ayf e() {
        return (defpackage.ayf) this.b.a();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.azw) {
            return aooh.n(e(), ((defpackage.azw) obj).e());
        }
        return false;
    }

    public final void f(defpackage.ayf ayfVar) {
        this.b.b(ayfVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return this.a + "(left=" + e().a + ", top=" + e().b + ", right=" + e().c + ", bottom=" + e().d + ')';
    }
}
