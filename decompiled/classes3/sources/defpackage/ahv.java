package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahv {
    public final aonj a;
    public final ajl b;

    public ahv(aonj aonjVar, ajl ajlVar) {
        this.a = aonjVar;
        this.b = ajlVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ahv) {
            defpackage.ahv ahvVar = (defpackage.ahv) obj;
            if (this.a == ahvVar.a && aooh.n(this.b, ahvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "SlideConfig(slideOffset=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
