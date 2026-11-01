package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qvc {
    public final java.lang.String a;
    public final aomy b;
    public final java.lang.String c;
    public final java.util.List d;
    public final aomy e;
    public final boolean f;
    public final boolean g;

    public qvc(java.lang.String str, aomy aomyVar, java.lang.String str2, java.util.List list, aomy aomyVar2, boolean z, boolean z2) {
        aooh.f(str, "titleLabel");
        aooh.f(aomyVar, "onClose");
        aooh.f(str2, "closeButtonDescription");
        aooh.f(aomyVar2, "onInitialCompose");
        this.a = str;
        this.b = aomyVar;
        this.c = str2;
        this.d = list;
        this.e = aomyVar2;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.qvc) {
            defpackage.qvc qvcVar = (defpackage.qvc) obj;
            if (aooh.n(this.a, qvcVar.a) && aooh.n(this.b, qvcVar.b) && aooh.n(this.c, qvcVar.c) && aooh.n(this.d, qvcVar.d) && aooh.n(this.e, qvcVar.e) && this.f == qvcVar.f && this.g == qvcVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + anty.L(this.f)) * 31) + anty.L(this.g);
    }

    public final java.lang.String toString() {
        return "AudioSelectorUiData(titleLabel=" + this.a + ", onClose=" + this.b + ", closeButtonDescription=" + this.c + ", listItems=" + this.d + ", onInitialCompose=" + this.e + ", isEmptyDefaultData=" + this.f + ", useTwoColumnLayout=" + this.g + ')';
    }
}
