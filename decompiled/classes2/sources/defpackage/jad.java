package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jad {
    public final aomy a;
    public final aomy b;
    public final aomy c;
    public final aomy d;
    public final aomy e;
    public final aomy f;
    public final boolean g;
    private final long h;
    private final aomy i;

    public jad(aomy aomyVar, aomy aomyVar2, aomy aomyVar3, aomy aomyVar4, aomy aomyVar5, aomy aomyVar6, aomy aomyVar7, boolean z) {
        aooh.f(aomyVar, "recordDurationMillis");
        aooh.f(aomyVar2, "onStateChanged");
        aooh.f(aomyVar3, "onPauseClicked");
        aooh.f(aomyVar4, "onResumeClicked");
        aooh.f(aomyVar5, "onRestartClicked");
        aooh.f(aomyVar6, "onSaveClicked");
        aooh.f(aomyVar7, "onBackClick");
        this.h = 60000L;
        this.i = aomyVar;
        this.a = aomyVar2;
        this.b = aomyVar3;
        this.c = aomyVar4;
        this.d = aomyVar5;
        this.e = aomyVar6;
        this.f = aomyVar7;
        this.g = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.jad) {
            defpackage.jad jadVar = (defpackage.jad) obj;
            long j = jadVar.h;
            if (aooh.n(this.i, jadVar.i) && aooh.n(this.a, jadVar.a) && aooh.n(this.b, jadVar.b) && aooh.n(this.c, jadVar.c) && aooh.n(this.d, jadVar.d) && aooh.n(this.e, jadVar.e) && aooh.n(this.f, jadVar.f) && this.g == jadVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.i.hashCode() + 1860000) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + anty.L(this.g);
    }

    public final java.lang.String toString() {
        return "RecordGreetingComposableUiModel(maxRecordDurationMillis=60000, recordDurationMillis=" + this.i + ", onStateChanged=" + this.a + ", onPauseClicked=" + this.b + ", onResumeClicked=" + this.c + ", onRestartClicked=" + this.d + ", onSaveClicked=" + this.e + ", onBackClick=" + this.f + ", isLargeScreen=" + this.g + ')';
    }
}
