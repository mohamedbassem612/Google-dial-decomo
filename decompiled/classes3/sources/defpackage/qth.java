package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qth {
    public static final aimz a = aimz.i("com/android/dialer/incall/video/ui/VideoSelector");
    public final android.content.Context b;
    public final android.view.WindowManager c;
    public final mgu d;
    public final defpackage.qtg e;

    public qth(android.content.Context context, android.view.WindowManager windowManager, mgu mguVar, defpackage.qtg qtgVar) {
        this.b = context;
        this.c = windowManager;
        this.d = mguVar;
        this.e = qtgVar;
    }

    public static boolean i(android.util.Size size) {
        if (size.getWidth() <= 0 || size.getHeight() <= 0) {
            a.bI(a.d(), "view layout hasn't finished yet", "com/android/dialer/incall/video/ui/VideoSelector", "checkViewHasNonZeroSize", (char) 352, "VideoSelector.java", zct.b);
            return false;
        }
        a.b().l("com/android/dialer/incall/video/ui/VideoSelector", "checkViewHasNonZeroSize", 357, "VideoSelector.java").v("view has non-zero size");
        return true;
    }

    public final int a() {
        int iIntValue = ((java.lang.Integer) aa$.ExternalSyntheticApiModelOutline1.m(new defpackage.pxs(this, 4))).intValue();
        mgu mguVar = this.d;
        j$.util.Objects.requireNonNull(mguVar);
        return gus.aD(mgv.t, iIntValue, mguVar).f();
    }

    final android.graphics.SurfaceTexture b() {
        defpackage.qtg qtgVar = this.e;
        return (qtgVar.a ? qtgVar.d : qtgVar.e).a;
    }

    public final j$.util.Optional c(android.util.Size size) {
        mgu mguVar = this.d;
        new mgr(mguVar, size).b(mgv.y).d(new defpackage.pvu(18));
        return (j$.util.Optional) mguVar.c(new defpackage.pin(this, size, 11)).a(mgv.A).h(new defpackage.pvu(19));
    }

    public final j$.util.Optional d(android.util.Size size) {
        mgu mguVar = this.d;
        new mgr(mguVar, size).b(mgv.w).d(new defpackage.pvu(18));
        return (j$.util.Optional) mguVar.c(new defpackage.pin(this, size, 7)).a(mgv.x).h(new defpackage.pvu(19));
    }

    public final j$.util.Optional e() {
        return (j$.util.Optional) this.d.c(new defpackage.pxs(this, 3)).a(mgv.G).h(new defpackage.pvu(18));
    }

    public final j$.util.Optional f() {
        return (j$.util.Optional) this.d.c(new defpackage.pxs(this, 5)).a(mgv.F).h(new defpackage.pvu(18));
    }

    public final j$.util.Optional g(android.util.Size size) {
        return (j$.util.Optional) this.d.c(new defpackage.pin(this, size, 10)).a(mgv.C).g(new defpackage.pvu(17));
    }

    public final boolean h(android.util.Size size) {
        return ((java.lang.Boolean) this.d.a(new defpackage.pin(this, size, 8)).a(mgv.E).f()).booleanValue();
    }
}
