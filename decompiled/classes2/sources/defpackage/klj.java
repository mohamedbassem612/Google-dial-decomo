package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class klj implements agye {
    final /* synthetic */ defpackage.klo a;

    public klj(defpackage.klo kloVar) {
        j$.util.Objects.requireNonNull(kloVar);
        this.a = kloVar;
    }

    public final void a(java.lang.Throwable th) {
        aimz aimzVar = defpackage.klo.a;
        a.by(aimzVar.c(), "onError", "com/android/dialer/calllog/ui/CallLogFragmentPeer$3", "onError", (char) 280, "CallLogFragmentPeer.java", th);
        if (!(th instanceof java.util.concurrent.CancellationException)) {
            throw new java.lang.AssertionError(th);
        }
        aimzVar.b().l("com/android/dialer/calllog/ui/CallLogFragmentPeer$3", "onError", 283, "CallLogFragmentPeer.java").v("data loading cancelled");
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0223  */
    public final /* synthetic */ void b(java.lang.Object obj) {
        java.lang.Object next;
        defpackage.kfd kfdVar = (defpackage.kfd) obj;
        aimz aimzVar = defpackage.klo.a;
        aimzVar.b().l("com/android/dialer/calllog/ui/CallLogFragmentPeer$3", "onNewData", 242, "CallLogFragmentPeer.java").w("onNewData: forceRefreshUiCounter(%s)", kfdVar.c);
        defpackage.klo kloVar = this.a;
        j$.util.Optional optionalOfNullable = kloVar.G;
        kloVar.G = j$.util.Optional.of(kfdVar);
        byte[] bArr = null;
        if (!kfdVar.a) {
            aimzVar.b().l("com/android/dialer/calllog/ui/CallLogFragmentPeer$3", "onNewData", 248, "CallLogFragmentPeer.java").v("no READ_CALL_LOG permission");
            kloVar.x.setVisibility(8);
            com.android.dialer.widget.emptycontentview.EmptyContentView emptyContentViewA = kloVar.a();
            emptyContentViewA.f(2131951622);
            emptyContentViewA.g(2132019472);
            emptyContentViewA.e(2132019755, new defpackage.jln(kloVar, 13, bArr));
            kloVar.f();
            return;
        }
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(!((defpackage.kfd) optionalOfNullable.get()).a));
        }
        if (((java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE)).booleanValue()) {
            kloVar.d.a();
            ((kjr) kloVar.i.a()).b();
        }
        defpackage.kdf kdfVar = kfdVar.b;
        defpackage.kld kldVar = kloVar.f;
        if (((aw) kldVar).Q == null) {
            aimzVar.b().l("com/android/dialer/calllog/ui/CallLogFragmentPeer", "renderUi", 933, "CallLogFragmentPeer.java").v("call log view does not exist");
        } else {
            gus.aI();
            if (kloVar.A.isPresent()) {
                if (kloVar.x.m == null) {
                    aimzVar.b().l("com/android/dialer/calllog/ui/CallLogFragmentPeer", "stopUpdateTimer", 1078, "CallLogFragmentPeer.java").v("ignore initial load");
                } else {
                    aimzVar.b().l("com/android/dialer/calllog/ui/CallLogFragmentPeer", "stopUpdateTimer", 1081, "CallLogFragmentPeer.java").v("timer stopped");
                    kloVar.h.q((aeun) kloVar.A.orElseThrow(), kloVar.g() ? ruc.G : ruc.F, rub.b);
                    kloVar.A = j$.util.Optional.empty();
                }
            }
            if (kloVar.E) {
                kloVar.g.o(rmx.sC);
                kloVar.R.aF(kloVar.x, new defpackage.ioi(kloVar, 16));
            } else {
                kloVar.E = true;
                kloVar.R.aF(kloVar.x, new defpackage.ioi(kloVar, 17));
            }
            if (kdfVar.a.isPresent()) {
                aify aifyVar = (aify) j$.util.Collection.-EL.stream(kdfVar.b()).map(new defpackage.kle(0)).collect(aido.a);
                defpackage.kgo kgoVar = kloVar.H;
                aooh.f(aifyVar, "updatedCallLog");
                defpackage.kna knaVarB = kgoVar.b();
                if (knaVarB == null) {
                    kloVar.e(null);
                } else {
                    kiu kiuVar = knaVarB.c;
                    if (kiuVar == null) {
                        kiuVar = kiu.a;
                    }
                    if (kiuVar != null) {
                        java.util.Iterator it = aifyVar.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (ajsz.cd(defpackage.kgo.f((kiu) next), defpackage.kgo.f(kiuVar)).isEmpty());
                        kiu kiuVar2 = (kiu) next;
                        if (kiuVar2 != null) {
                            defpackage.kna knaVar = defpackage.kna.a;
                            akzx akzxVarM = knaVar.m();
                            aooh.f(akzxVarM, "builder");
                            akzxVarM.u();
                            defpackage.kna knaVar2 = (defpackage.kna) akzxVarM.b;
                            j$.util.Objects.requireNonNull(kiuVar2);
                            knaVar2.c = kiuVar2;
                            knaVar2.b |= 2;
                            alad aladVarP = akzxVarM.p();
                            aooh.e(aladVarP, "build(...)");
                            kgoVar.d((defpackage.kna) aladVarP);
                            defpackage.kna knaVar3 = ((defpackage.knb) ((akzx) kloVar.N.a).b).c;
                            if (knaVar3 != null) {
                                knaVar = knaVar3;
                            }
                            kiu kiuVar3 = knaVar.c;
                            if (kiuVar3 == null) {
                                kiuVar3 = kiu.a;
                            }
                            kloVar.e(kiuVar3);
                        } else {
                            kloVar.e(null);
                        }
                    } else {
                        kloVar.e(null);
                    }
                }
                kloVar.b(kdfVar);
                kloVar.x.setVisibility(0);
                j$.util.Optional optionalOfNullable2 = j$.util.Optional.ofNullable(kldVar.N().findViewById(2131427658));
                if (true == optionalOfNullable2.isPresent()) {
                    ((com.android.dialer.widget.emptycontentview.EmptyContentView) optionalOfNullable2.get()).setVisibility(8);
                }
            } else {
                com.android.dialer.widget.emptycontentview.EmptyContentView emptyContentViewA2 = kloVar.a();
                j$.util.Optional optional = emptyContentViewA2.k;
                if (true == optional.isPresent()) {
                    ((android.widget.ProgressBar) optional.get()).setVisibility(0);
                }
                j$.util.Optional optional2 = emptyContentViewA2.j;
                if (true == optional2.isPresent()) {
                    ((com.airbnb.lottie.LottieAnimationView) optional2.get()).setVisibility(8);
                }
                emptyContentViewA2.g(2132019468);
                emptyContentViewA2.l.setVisibility(8);
                kloVar.x.setVisibility(8);
                kloVar.f();
            }
        }
        kew kewVar = kloVar.F;
        if (anty.Q((java.util.concurrent.atomic.AtomicReference) kewVar.d.a, defpackage.kfa.a, defpackage.key.a)) {
            kew.a.b().l("com/android/dialer/calllog/dataservice/CallLogFragmentDataService", "cleanUpInitialModelAndReloadData", 102, "CallLogFragmentDataService.kt").v("Cleaned up the initial model and will load the full data set");
            kewVar.e.s(ajcm.a, kew.b);
        }
    }

    public final /* synthetic */ void c() {
    }
}
