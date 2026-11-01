package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qye {
    public final java.lang.String a;
    public final aomy b;
    public final java.lang.String c;
    public final java.util.List d;
    public final aonj e;
    public final boolean f;

    public qye(java.lang.String str, aomy aomyVar, java.lang.String str2, java.util.List list, aonj aonjVar, boolean z) {
        aooh.f(str, "titleLabel");
        aooh.f(aomyVar, "closeClickHandler");
        aooh.f(str2, "closeButtonDescription");
        aooh.f(list, "voiceButtons");
        aooh.f(aonjVar, "voiceButtonClickHandler");
        this.a = str;
        this.b = aomyVar;
        this.c = str2;
        this.d = list;
        this.e = aonjVar;
        this.f = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.qye) {
            defpackage.qye qyeVar = (defpackage.qye) obj;
            if (aooh.n(this.a, qyeVar.a) && aooh.n(this.b, qyeVar.b) && aooh.n(this.c, qyeVar.c) && aooh.n(this.d, qyeVar.d) && aooh.n(this.e, qyeVar.e) && this.f == qyeVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + anty.L(this.f);
    }

    public final java.lang.String toString() {
        return "CallAssistComposableUiModel(titleLabel=" + this.a + ", closeClickHandler=" + this.b + ", closeButtonDescription=" + this.c + ", voiceButtons=" + this.d + ", voiceButtonClickHandler=" + this.e + ", useTwoColumnLayout=" + this.f + ')';
    }
}
