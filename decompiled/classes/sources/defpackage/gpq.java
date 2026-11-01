package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gpq extends defpackage.gpt {
    public final java.util.Set a;
    public final defpackage.gps b;
    public final defpackage.gps c;
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpq(java.util.Set set, defpackage.gpl gplVar, defpackage.gps gpsVar, defpackage.gps gpsVar2, defpackage.gok gokVar, defpackage.gok gokVar2) {
        super(gokVar, gokVar2, gplVar);
        if (set == null) {
            defpackage.aooh.i("filters");
        }
        if (gokVar == null) {
            defpackage.aooh.i("maxAspectRatioInPortrait");
        }
        if (gokVar2 == null) {
            defpackage.aooh.i("maxAspectRatioInLandscape");
        }
        this.a = set;
        this.b = gpsVar;
        this.c = gpsVar2;
        this.d = true;
    }

    @Override // defpackage.gpt, defpackage.gow
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof defpackage.gpq) && super.equals(obj)) {
            defpackage.gpq gpqVar = (defpackage.gpq) obj;
            if (defpackage.aooh.n(this.a, gpqVar.a) && defpackage.aooh.n(this.b, gpqVar.b) && defpackage.aooh.n(this.c, gpqVar.c)) {
                boolean z = gpqVar.d;
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gpt, defpackage.gow
    public final int hashCode() {
        return (((((((super.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + 1231;
    }

    @Override // defpackage.gpt
    public final java.lang.String toString() {
        return "gpq{tag=" + a() + ", defaultSplitAttributes=" + this.l + ", minWidthDp=600, minHeightDp=600, minSmallestWidthDp=600, maxAspectRatioInPortrait=" + this.j + ", maxAspectRatioInLandscape=" + this.k + ", clearTop=true, finishPrimaryWithSecondary=" + this.b + ", finishSecondaryWithPrimary=" + this.c + ", filters=" + this.a + '}';
    }
}
