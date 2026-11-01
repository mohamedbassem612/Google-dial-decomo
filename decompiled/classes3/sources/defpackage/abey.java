package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abey {
    public final java.lang.String a;
    public final java.util.List b;
    private final java.lang.String c;

    public abey(java.lang.String str, java.util.List list) {
        aooh.f(str, "text");
        aooh.f(list, "annotations");
        this.a = str;
        this.b = list;
        this.c = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abey) {
            defpackage.abey abeyVar = (defpackage.abey) obj;
            if (aooh.n(this.a, abeyVar.a) && aooh.n(this.b, abeyVar.b)) {
                java.lang.String str = abeyVar.c;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
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
        return "AnnotationUiDataImpl(text=" + this.a + ", annotations=" + this.b + ", contentDescription=null)";
    }
}
