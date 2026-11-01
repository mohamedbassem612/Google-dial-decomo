package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mtk {
    public final defpackage.mto a;
    public final aomy b;
    public final aomy c;
    public final aomy d;
    public final aomy e;
    public final aomy f;
    public final aomy g;
    public final aomy h;
    public final aomy i;

    public mtk(defpackage.mto mtoVar, aomy aomyVar, aomy aomyVar2, aomy aomyVar3, aomy aomyVar4, aomy aomyVar5, aomy aomyVar6, aomy aomyVar7, aomy aomyVar8) {
        this.a = mtoVar;
        this.b = aomyVar;
        this.c = aomyVar2;
        this.d = aomyVar3;
        this.e = aomyVar4;
        this.f = aomyVar5;
        this.g = aomyVar6;
        this.h = aomyVar7;
        this.i = aomyVar8;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.mtk) {
            defpackage.mtk mtkVar = (defpackage.mtk) obj;
            if (aooh.n(this.a, mtkVar.a) && aooh.n(this.b, mtkVar.b) && aooh.n(this.c, mtkVar.c) && aooh.n(this.d, mtkVar.d) && aooh.n(this.e, mtkVar.e) && aooh.n(this.f, mtkVar.f) && aooh.n(this.g, mtkVar.g) && aooh.n(this.h, mtkVar.h) && aooh.n(this.i, mtkVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final java.lang.String toString() {
        return "DobbyInCallComposableUiModel(dobbyInCallUiModel=" + this.a + ", onEndCallButtonClicked=" + this.b + ", onJoinCallButtonClicked=" + this.c + ", onGoogleTermsOfServiceLinkClicked=" + this.d + ", onLlmGeneratedContentDisclaimerDialogDismissed=" + this.e + ", onGenerativeAiTermsOfServiceLinkClicked=" + this.f + ", onLlmGeneratedContentConsentDialogConfirmButtonClicked=" + this.g + ", onLlmGeneratedContentConsentDialogCancelButtonClicked=" + this.h + ", onLlmGeneratedContentConsentDialogDismissRequested=" + this.i + ')';
    }
}
