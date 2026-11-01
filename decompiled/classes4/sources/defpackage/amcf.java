package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amcf {
    private static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AmSegmentWrapper");
    private static final ahzf b = ahzf.c(ahxm.b).a().f();
    private final defpackage.amfm c;

    public amcf(defpackage.amfm amfmVar) {
        akzx akzxVarP = amfmVar.p();
        defpackage.amft amftVar = amfmVar.d;
        defpackage.amft amftVarG = defpackage.amev.g(amftVar == null ? defpackage.amft.a : amftVar);
        akzxVarP.u();
        defpackage.amfm amfmVar2 = (defpackage.amfm) akzxVarP.b;
        j$.util.Objects.requireNonNull(amftVarG);
        amfmVar2.d = amftVarG;
        amfmVar2.b |= 2;
        defpackage.amfm amfmVar3 = (defpackage.amfm) akzxVarP.p();
        defpackage.amft amftVar2 = amfmVar3.d;
        j$.util.Optional optionalK = defpackage.amev.k(amftVar2 == null ? defpackage.amft.a : amftVar2);
        if (!optionalK.isEmpty()) {
            akzx akzxVarP2 = ((alad) optionalK.get()).p();
            java.lang.String strReplace = ((defpackage.amfy) optionalK.get()).c.replace('-', ' ');
            akzxVarP2.u();
            defpackage.amfy amfyVar = (defpackage.amfy) akzxVarP2.b;
            j$.util.Objects.requireNonNull(strReplace);
            amfyVar.b |= 1;
            amfyVar.c = strReplace;
            defpackage.amfy amfyVar2 = (defpackage.amfy) akzxVarP2.p();
            akzx akzxVarP3 = amfyVar2.p();
            java.lang.String strReplace2 = amfyVar2.c.replace("  ", " ");
            akzxVarP3.u();
            defpackage.amfy amfyVar3 = (defpackage.amfy) akzxVarP3.b;
            j$.util.Objects.requireNonNull(strReplace2);
            amfyVar3.b |= 1;
            amfyVar3.c = strReplace2;
            defpackage.amfy amfyVar4 = (defpackage.amfy) akzxVarP3.p();
            akzx akzxVarP4 = amfmVar3.p();
            defpackage.amft amftVar3 = amfmVar3.d;
            defpackage.amft amftVarF = defpackage.amev.f(amftVar3 == null ? defpackage.amft.a : amftVar3, amfyVar4);
            akzxVarP4.u();
            defpackage.amfm amfmVar4 = (defpackage.amfm) akzxVarP4.b;
            j$.util.Objects.requireNonNull(amftVarF);
            amfmVar4.d = amftVarF;
            amfmVar4.b |= 2;
            amfmVar3 = (defpackage.amfm) akzxVarP4.p();
        }
        this.c = amfmVar3;
    }

    public final int a() {
        return this.c.e;
    }

    public final defpackage.amft b() {
        defpackage.amft amftVar = this.c.d;
        if (amftVar == null) {
            amftVar = defpackage.amft.a;
        }
        akzx akzxVarP = amftVar.p();
        int iA = a();
        akzxVarP.u();
        defpackage.amft amftVar2 = (defpackage.amft) akzxVarP.b;
        amftVar2.b |= 8;
        amftVar2.h = iA;
        return (defpackage.amft) akzxVarP.p();
    }

    public final java.lang.String c() {
        defpackage.amft amftVarB = b();
        aimz aimzVar = defpackage.amev.a;
        int iE = defpackage.amjk.e(amftVarB.c);
        if (iE == 0) {
            throw null;
        }
        int i = iE - 1;
        if (i == 2 || i == 3 || i == 4 || i == 6) {
            if (!this.c.c.isEmpty()) {
                a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AmSegmentWrapper", "getText", 64, "AmSegmentWrapper.java").v("Cache segment with non-text AMItem but with segment text");
            }
            return "";
        }
        int iE2 = defpackage.amjk.e(b().c);
        if (iE2 != 0) {
            return iE2 != 8 ? defpackage.amev.n(b()) : this.c.c;
        }
        throw null;
    }

    public final java.lang.String toString() {
        ahzf ahzfVar = b;
        defpackage.amft amftVar = this.c.d;
        if (amftVar == null) {
            amftVar = defpackage.amft.a;
        }
        return "Segment ID: " + a() + ", text: [" + java.lang.String.valueOf((java.lang.String) ahzfVar.g(defpackage.amev.n(amftVar)).limit(3L).collect(j$.util.stream.Collectors.joining(" "))).concat("...") + ']';
    }
}
