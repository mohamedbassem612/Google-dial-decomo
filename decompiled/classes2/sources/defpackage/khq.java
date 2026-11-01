package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class khq {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final int d;

    public khq(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        aooh.f(str, "name");
        aooh.f(str2, "photoThumbnailUri");
        aooh.f(str3, "lookupKey");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.khq) {
            defpackage.khq khqVar = (defpackage.khq) obj;
            if (aooh.n(this.a, khqVar.a) && aooh.n(this.b, khqVar.b) && aooh.n(this.c, khqVar.c) && this.d == khqVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d;
    }

    public final java.lang.String toString() {
        return "VoipContactInfo(name=" + this.a + ", photoThumbnailUri=" + this.b + ", lookupKey=" + this.c + ", capabilities=" + this.d + ')';
    }
}
