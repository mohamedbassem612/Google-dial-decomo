package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afoq extends defpackage.afot {
    public final java.util.List a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afoq(java.util.List list) {
        super(2132019653, "allPhotosGridSection", "moreAllPhotos", 258951);
        aooh.f(list, "photos");
        this.a = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.afoq) && aooh.n(this.a, ((defpackage.afoq) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "AllPhotos(photos=" + this.a + ')';
    }
}
