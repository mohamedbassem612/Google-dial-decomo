package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class oui {
    public final defpackage.ouj a;
    public final int b;
    public final boolean c;
    public final j$.util.Optional d;
    public final java.lang.String e;
    public final j$.util.Optional f;
    public final boolean g;
    public final j$.util.Optional h;
    private final boolean i;

    public oui(defpackage.ouj oujVar, int i, boolean z, j$.util.Optional optional, java.lang.String str, j$.util.Optional optional2, boolean z2, boolean z3, j$.util.Optional optional3) {
        this.a = oujVar;
        this.b = i;
        this.c = z;
        this.d = optional;
        this.e = str;
        this.f = optional2;
        this.i = z2;
        this.g = z3;
        this.h = optional3;
    }

    public static defpackage.oug a() {
        defpackage.oug ougVar = new defpackage.oug(null);
        ougVar.h(true);
        ougVar.c(false);
        ougVar.i(false);
        return ougVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.oui) {
            defpackage.oui ouiVar = (defpackage.oui) obj;
            if (this.a.equals(ouiVar.a) && this.b == ouiVar.b && this.c == ouiVar.c && this.d.equals(ouiVar.d) && this.e.equals(ouiVar.e) && this.f.equals(ouiVar.f) && this.i == ouiVar.i && this.g == ouiVar.g && this.h.equals(ouiVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true == this.g ? 1231 : 1237)) * 1000003) ^ this.h.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.h;
        j$.util.Optional optional2 = this.f;
        j$.util.Optional optional3 = this.d;
        return "AnswerChip{priority=" + java.lang.String.valueOf(this.a) + ", iconRes=" + this.b + ", tintIconWithPrimaryColor=" + this.c + ", tint=" + java.lang.String.valueOf(optional3) + ", label=" + this.e + ", growthkitViewTag=" + java.lang.String.valueOf(optional2) + ", highlighted=" + this.i + ", useGiBranding=" + this.g + ", stateDescription=" + java.lang.String.valueOf(optional) + '}';
    }

    public oui() {
        throw null;
    }
}
