package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajmx {
    public final java.lang.Class a;
    public final java.lang.Class b;

    public ajmx(java.lang.Class cls, java.lang.Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ajmx)) {
            return false;
        }
        defpackage.ajmx ajmxVar = (defpackage.ajmx) obj;
        return ajmxVar.a.equals(this.a) && ajmxVar.b.equals(this.b);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b});
    }

    public final java.lang.String toString() {
        java.lang.Class cls = this.b;
        return this.a.getSimpleName() + " with primitive type: " + cls.getSimpleName();
    }
}
