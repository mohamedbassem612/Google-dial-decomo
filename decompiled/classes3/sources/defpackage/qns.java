package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qns implements android.view.View.OnLayoutChangeListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public qns(com.android.dialer.timekeeper.histogram.HistogramView histogramView, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(histogramView);
        this.a = histogramView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.$cid;
        int i10 = 17;
        int i11 = 1;
        if (i9 == 0) {
            android.widget.HorizontalScrollView horizontalScrollView = (android.widget.HorizontalScrollView) this.a;
            horizontalScrollView.fullScroll(horizontalScrollView.getLayoutDirection() == 1 ? 66 : 17);
            return;
        }
        if (i9 == 1) {
            defpackage.qnv.a.b().l("com/android/dialer/incall/video/answer/ui/VideoAnswerFragmentPeer", "onViewCreated$<anonymous>", 262, "VideoAnswerFragmentPeer.kt").v("textureView layout changed");
            ((defpackage.qnv) this.a).g();
            return;
        }
        int i12 = 3;
        if (i9 == 2) {
            defpackage.qtd.b.b().l("com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "onViewCreated", 496, "VideoScreenFragmentPeer.java").v("backgroundTextureView layout changed");
            java.lang.Object obj = this.a;
            android.view.TextureView textureView = (android.view.TextureView) view;
            defpackage.qtd qtdVar = (defpackage.qtd) obj;
            j$.util.Optional optionalC = qtdVar.m;
            defpackage.qkv qkvVar = new defpackage.qkv(obj, i12);
            if (true == optionalC.isPresent()) {
                optionalC = ((defpackage.qth) optionalC.get()).c(((defpackage.qtd) qkvVar.a).b());
                optionalC.getClass();
            }
            defpackage.qmp qmpVar = new defpackage.qmp(textureView, i10);
            if (true == optionalC.isPresent()) {
                ((defpackage.qtq) optionalC.get()).e((android.view.TextureView) qmpVar.a);
            }
            j$.util.Optional optional = qtdVar.m;
            defpackage.qmp qmpVar2 = new defpackage.qmp(obj, 18);
            if (true == optional.isPresent()) {
                ((defpackage.qtd) qmpVar2.a).w((defpackage.qth) optional.get());
                return;
            }
            return;
        }
        int i13 = 0;
        if (i9 != 3) {
            if (i9 != 4) {
                java.lang.Object obj2 = this.a;
                if (i9 != 5) {
                    ((defpackage.agdx) obj2).c(view);
                    return;
                } else {
                    ((android.view.View) obj2).getVisibility();
                    return;
                }
            }
            for (int i14 = 0; i14 < 7; i14++) {
                com.android.dialer.timekeeper.histogram.HistogramView histogramView = (com.android.dialer.timekeeper.histogram.HistogramView) this.a;
                com.google.android.material.tabs.TabLayout tabLayout = histogramView.m;
                defpackage.agcm agcmVarC = tabLayout.c(i14);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                agcmVarC.g.findViewsWithText(arrayList, agcmVarC.a, 1);
                ahvr.bY(arrayList.size() == 1);
                if (((android.widget.TextView) arrayList.get(0)).getLineCount() > 1) {
                    while (i11 <= 7) {
                        tabLayout.c(i11 - 1).d(histogramView.l[i11]);
                        i11++;
                    }
                    break;
                }
            }
            ((com.android.dialer.timekeeper.histogram.HistogramView) this.a).m.removeOnLayoutChangeListener(this);
            return;
        }
        aimz aimzVar = defpackage.qtd.b;
        aimzVar.b().l("com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "onViewCreated", 510, "VideoScreenFragmentPeer.java").v("previewTextureView layout changed");
        int i15 = i4 - i2;
        int i16 = i8 - i6;
        int i17 = i3 - i;
        int i18 = i7 - i5;
        if (i17 == i18 && i15 == i16) {
            return;
        }
        java.lang.Object obj3 = this.a;
        aimzVar.b().l("com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "onViewCreated", 516, "VideoScreenFragmentPeer.java").N("previewTextureView size changed, %d x %d -> %d x %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i16), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i15));
        defpackage.qtd qtdVar2 = (defpackage.qtd) obj3;
        j$.util.Optional optionalD = qtdVar2.m;
        defpackage.alue alueVar = new defpackage.alue(i17, i15, i11);
        if (true == optionalD.isPresent()) {
            optionalD = ((defpackage.qth) optionalD.get()).d(new android.util.Size(alueVar.a, alueVar.b));
            optionalD.getClass();
        }
        defpackage.qst qstVar = new defpackage.qst(obj3, i13);
        if (true == optionalD.isPresent()) {
            ((defpackage.qtq) optionalD.get()).e(((defpackage.qtd) qstVar.a).e());
        }
        defpackage.qso qsoVar = qtdVar2.g;
        android.view.View viewF = qsoVar.f();
        qsoVar.i(viewF, qsoVar.b(viewF));
    }

    public /* synthetic */ qns(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public qns(defpackage.agco agcoVar, android.view.View view, int i) {
        this.$cid = i;
        this.a = view;
        j$.util.Objects.requireNonNull(agcoVar);
    }

    public qns(defpackage.agdx agdxVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(agdxVar);
        this.a = agdxVar;
    }
}
