package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class smu {
    public final aomy a;
    public final aomy b;
    public final aomy c;
    public final aonj d;
    public final aomy e;
    public final aonj f;
    public final aonj g;
    public final aomy h;
    public final aomy i;
    public final aonj j;
    public final aomy k;
    public final aomy l;
    public final aonj m;
    public final aomy n;
    public final aonj o;
    public final aonj p;
    public final aonj q;
    public final aomy r;
    public final aomy s;
    public final aonj t;
    public final aomy u;

    public smu(aomy aomyVar, aomy aomyVar2, aomy aomyVar3, aonj aonjVar, aomy aomyVar4, aonj aonjVar2, aonj aonjVar3, aomy aomyVar5, aomy aomyVar6, aonj aonjVar4, aomy aomyVar7, aomy aomyVar8, aonj aonjVar5, aomy aomyVar9, aonj aonjVar6, aonj aonjVar7, aonj aonjVar8, aomy aomyVar10, aomy aomyVar11, aonj aonjVar9, aomy aomyVar12) {
        this.a = aomyVar;
        this.b = aomyVar2;
        this.c = aomyVar3;
        this.d = aonjVar;
        this.e = aomyVar4;
        this.f = aonjVar2;
        this.g = aonjVar3;
        this.h = aomyVar5;
        this.i = aomyVar6;
        this.j = aonjVar4;
        this.k = aomyVar7;
        this.l = aomyVar8;
        this.m = aonjVar5;
        this.n = aomyVar9;
        this.o = aonjVar6;
        this.p = aonjVar7;
        this.q = aonjVar8;
        this.r = aomyVar10;
        this.s = aomyVar11;
        this.t = aonjVar9;
        this.u = aomyVar12;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.smu) {
            defpackage.smu smuVar = (defpackage.smu) obj;
            if (aooh.n(this.a, smuVar.a) && aooh.n(this.b, smuVar.b) && aooh.n(this.c, smuVar.c) && aooh.n(this.d, smuVar.d) && aooh.n(this.e, smuVar.e) && aooh.n(this.f, smuVar.f) && aooh.n(this.g, smuVar.g) && aooh.n(this.h, smuVar.h) && aooh.n(this.i, smuVar.i) && aooh.n(this.j, smuVar.j) && aooh.n(this.k, smuVar.k) && aooh.n(this.l, smuVar.l) && aooh.n(this.m, smuVar.m) && aooh.n(this.n, smuVar.n) && aooh.n(this.o, smuVar.o) && aooh.n(this.p, smuVar.p) && aooh.n(this.q, smuVar.q) && aooh.n(this.r, smuVar.r) && aooh.n(this.s, smuVar.s) && aooh.n(this.t, smuVar.t) && aooh.n(this.u, smuVar.u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31) + this.s.hashCode()) * 31) + this.t.hashCode()) * 31) + this.u.hashCode();
    }

    public final java.lang.String toString() {
        return "OnboardingFlowCallbacks(onBack=" + this.a + ", onBackResizable=" + this.b + ", onConfirm=" + this.c + ", onCustomizationMenu=" + this.d + ", onGalleryButton=" + this.e + ", onFontColorSelected=" + this.f + ", onFontStyleSelected=" + this.g + ", onCameraButton=" + this.h + ", onRemoveButton=" + this.i + ", onConfirmResizable=" + this.j + ", onPreviewClick=" + this.k + ", onGooglePhotosClick=" + this.l + ", onDragImage=" + this.m + ", onCustomTypographyIconClick=" + this.n + ", onFontWidthChange=" + this.o + ", onFontWeightChange=" + this.p + ", onFontRoundnessChange=" + this.q + ", onSaveCustomFontClick=" + this.r + ", onCancelCustomFontClick=" + this.s + ", onContactNameGloballyPositioned=" + this.t + ", onRemixClick=" + this.u + ')';
    }
}
