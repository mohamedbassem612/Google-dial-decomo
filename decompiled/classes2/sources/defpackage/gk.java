package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gk implements android.view.View.OnAttachStateChangeListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public gk(aekj aekjVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aekjVar);
        this.a = aekjVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        int i = this.$cid;
        if (i == 0 || i == 1) {
            return;
        }
        if (i == 2) {
            aooh.f(view, "v");
            defpackage.ifq ifqVar = (defpackage.ifq) this.a;
            iez iezVar = ifqVar.d;
            iezVar.h();
            ifa ifaVar = ifqVar.j;
            iezVar.g(ifaVar);
            android.media.AudioDeviceInfo audioDeviceInfo = iezVar.l;
            if (audioDeviceInfo != null) {
                ((defpackage.ifj) ifaVar).A(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i == 3) {
            int systemWindowInsetTop = view.getRootWindowInsets().getSystemWindowInsetTop();
            int systemWindowInsetBottom = view.getRootWindowInsets().getSystemWindowInsetBottom();
            android.view.View view2 = (android.view.View) this.a;
            if (systemWindowInsetTop == view2.getPaddingTop() && systemWindowInsetBottom == view2.getPaddingBottom()) {
                return;
            }
            wsc.be((android.view.ViewGroup) view2.getParent(), (gkz) null);
            view2.setPadding(0, systemWindowInsetTop, 0, systemWindowInsetBottom);
            return;
        }
        if (i == 4) {
            aekj aekjVar = (aekj) this.a;
            aekjVar.q(37);
            aekjVar.removeOnAttachStateChangeListener(this);
        } else if (i != 5) {
            aooh.f(view, "v");
        } else {
            ((agdf) this.a).e();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.gl glVar = (defpackage.gl) this.a;
            android.view.ViewTreeObserver viewTreeObserver = glVar.d;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    glVar.d = view.getViewTreeObserver();
                }
                glVar.d.removeGlobalOnLayoutListener(glVar.b);
            }
            view.removeOnAttachStateChangeListener(this);
            return;
        }
        if (i == 1) {
            defpackage.fn fnVar = (defpackage.fn) this.a;
            android.view.ViewTreeObserver viewTreeObserver2 = fnVar.e;
            if (viewTreeObserver2 != null) {
                if (!viewTreeObserver2.isAlive()) {
                    fnVar.e = view.getViewTreeObserver();
                }
                fnVar.e.removeGlobalOnLayoutListener(fnVar.c);
            }
            view.removeOnAttachStateChangeListener(this);
            return;
        }
        if (i != 2) {
            if (i == 3 || i == 4) {
                return;
            }
            if (i == 5) {
                ((agdf) this.a).i();
                return;
            } else {
                aooh.f(view, "v");
                ((aggs) this.a).b();
                return;
            }
        }
        aooh.f(view, "v");
        defpackage.ifq ifqVar = (defpackage.ifq) this.a;
        ifa ifaVar = ifqVar.j;
        iez iezVar = ifqVar.d;
        iezVar.n(ifaVar);
        az azVarG = ifqVar.c.G();
        if (azVarG == null || !azVarG.isChangingConfigurations()) {
            defpackage.ifq.a.b().l("com/android/dialer/audioplayback/impl/ui/AudioPlaybackViewPeer$<anonymous>", "onViewDetachedFromWindow", 273, "AudioPlaybackViewPeer.kt").v("pause audio playback due to player view detached from window");
            defpackage.iek iekVar = ifqVar.k;
            if (iekVar != null) {
                defpackage.ied iedVar = iekVar.c;
                if (iedVar == null) {
                    iedVar = defpackage.ied.a;
                }
                aooh.e(iedVar, "getAudioInfo(...)");
                iezVar.k(iedVar, false);
            }
        }
    }

    public gk(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public gk(agdf agdfVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(agdfVar);
        this.a = agdfVar;
    }
}
