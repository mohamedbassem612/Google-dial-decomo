package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ozh implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ ozh(defpackage.abfs abfsVar, boolean z, aomy aomyVar, int i) {
        this.$cid = i;
        this.c = abfsVar;
        this.a = z;
        this.b = aomyVar;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [aomy, java.lang.Object] */
    public final java.lang.Object a() {
        int i = this.$cid;
        if (i == 0) {
            defpackage.ozk ozkVar = (defpackage.ozk) this.b;
            if (ozkVar.e()) {
                defpackage.ozk.a.b().l("com/android/dialer/incall/answer/method/ui/horizontalswipe/impl/HorizontalSwipeAnswerMethodFragmentPeer", "toUiData$<anonymous>", 171, "HorizontalSwipeAnswerMethodFragmentPeer.kt").v("Call scope was removed. Not sending event.");
                return aojh.a;
            }
            if (this.a) {
                defpackage.qbe qbeVarG = ozkVar.g();
                if (qbeVarG != null) {
                    qbeVarG.a(qbc.nt);
                }
                defpackage.ozn oznVarB = ozkVar.b();
                if (oznVarB != null) {
                    oznVarB.b(new defpackage.ozq(defpackage.ozr.ANSWER));
                }
            }
            defpackage.own ownVar = (defpackage.own) this.c;
            ahvr.i(pez.am(ownVar), ozkVar.b);
            gpd gpdVar = ozkVar.i;
            boolean z = ownVar.h;
            zas zasVarI = gpdVar.i(ownVar.a);
            if (z) {
                zasVarI.b(mce.aH);
            } else if (ownVar.l) {
                zasVarI.b(mce.aq);
            } else if (!ownVar.f && !ownVar.i) {
                zasVarI.b(mce.ap);
                zasVarI.b(mce.ar);
            }
            return aojh.a;
        }
        if (i == 1) {
            return java.lang.Float.valueOf(this.a ? ((java.lang.Number) ((aii) this.c).d()).floatValue() : ((java.lang.Number) ((aii) this.b).d()).floatValue() / 3000.0f);
        }
        if (i != 2) {
            if (i == 3) {
                java.lang.Object obj = this.c;
                defpackage.rcc rccVarD = ((defpackage.rdk) obj).d();
                return new defpackage.qxl(rccVarD != null && rccVarD.p, new defpackage.pqf(obj, 6), (java.lang.String) this.b, this.a);
            }
            float fFloatValue = ((java.lang.Number) this.b.a()).floatValue();
            defpackage.abfs abfsVar = (defpackage.abfs) this.c;
            float f = abfsVar.g * fFloatValue;
            float f2 = abfsVar.b / 2.0f;
            return java.lang.Float.valueOf(this.a ? f2 + f : f2 - f);
        }
        defpackage.ozk ozkVar2 = (defpackage.ozk) this.b;
        if (ozkVar2.e()) {
            defpackage.ozk.a.b().l("com/android/dialer/incall/answer/method/ui/horizontalswipe/impl/HorizontalSwipeAnswerMethodFragmentPeer", "toUiData$<anonymous>", 184, "HorizontalSwipeAnswerMethodFragmentPeer.kt").v("Call scope was removed. Not sending event.");
            return aojh.a;
        }
        if (this.a) {
            defpackage.qbe qbeVarG2 = ozkVar2.g();
            if (qbeVarG2 != null) {
                qbeVarG2.a(qbc.nu);
            }
            defpackage.ozn oznVarB2 = ozkVar2.b();
            if (oznVarB2 != null) {
                oznVarB2.b(new defpackage.ozq(defpackage.ozr.REJECT));
            }
        }
        defpackage.own ownVar2 = (defpackage.own) this.c;
        ahvr.i(pez.al(ownVar2), ozkVar2.b);
        ozkVar2.i.i(ownVar2.a).b(mce.aj);
        return aojh.a;
    }

    public /* synthetic */ ozh(defpackage.ozk ozkVar, boolean z, defpackage.own ownVar, int i) {
        this.$cid = i;
        this.b = ozkVar;
        this.a = z;
        this.c = ownVar;
    }

    public /* synthetic */ ozh(defpackage.rdk rdkVar, java.lang.String str, boolean z, int i) {
        this.$cid = i;
        this.c = rdkVar;
        this.b = str;
        this.a = z;
    }

    public /* synthetic */ ozh(boolean z, aii aiiVar, aii aiiVar2, int i) {
        this.$cid = i;
        this.a = z;
        this.c = aiiVar;
        this.b = aiiVar2;
    }
}
