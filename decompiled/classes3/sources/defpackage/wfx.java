package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wfx implements android.animation.TimeAnimator.TimeListener {
    public final android.animation.TimeAnimator a;
    public final defpackage.wgc b;
    public defpackage.wfw d;
    public long e;
    public long f;
    public defpackage.wfv g;
    public defpackage.wew h;
    public defpackage.wew i;
    public boolean j;
    public final wsc k;
    public final java.util.ArrayDeque c = new java.util.ArrayDeque();
    private final float[] l = new float[4];
    private final aca m = new aca();

    public wfx(defpackage.wgc wgcVar, android.animation.TimeAnimator timeAnimator, defpackage.wfw wfwVar, wsc wscVar, defpackage.wew wewVar) {
        this.b = wgcVar;
        this.a = timeAnimator;
        this.d = wfwVar;
        this.k = wscVar;
        this.h = wewVar;
        this.g = wsc.Y(wewVar);
        timeAnimator.setTimeListener(this);
    }

    public final java.util.Deque a(defpackage.wex wexVar) {
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        while (true) {
            defpackage.wex wexVar2 = defpackage.wex.h;
            if (wexVar == wexVar2) {
                return arrayDeque;
            }
            arrayDeque.addFirst(wexVar);
            switch (wexVar.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    wexVar = wexVar2;
                    break;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    wexVar = defpackage.wex.e;
                    break;
                default:
                    throw new java.lang.IllegalArgumentException("bad state group".concat(wexVar.toString()));
            }
        }
    }

    public final void b() {
        this.a.pause();
    }

    public final void c(defpackage.wfv wfvVar) {
        defpackage.wfv wfvVar2 = this.g;
        defpackage.wgc wgcVar = this.b;
        wfvVar2.b(wgcVar);
        if (wfvVar == null) {
            this.a.end();
        } else {
            this.g = wfvVar;
            defpackage.wew wewVar = this.i;
            defpackage.wew wewVar2 = defpackage.wew.a;
            if (wewVar != wewVar2 && wewVar != this.h) {
                defpackage.wfv wfvVarW = wsc.W(wsc.Z(wewVar));
                defpackage.wfv wfvVarY = wsc.Y(this.i);
                defpackage.wfv wfvVar3 = this.g;
                if (wfvVar3 == wfvVarW || wfvVar3 == wfvVarY) {
                    this.a.isStarted();
                    defpackage.wew wewVar3 = this.i;
                    this.h = wewVar3;
                    this.i = wewVar2;
                    defpackage.weq weqVar = (defpackage.weq) this.m.get(wewVar3);
                    if (weqVar != null) {
                        weqVar.a();
                    }
                }
            }
            this.g.a(wgcVar);
            this.f = this.e;
        }
        defpackage.wfw wfwVar = this.d;
        if (wfwVar != null) {
            wfwVar.a();
        }
    }

    public final void d() {
        this.j = true;
        android.animation.TimeAnimator timeAnimator = this.a;
        if (timeAnimator.isStarted()) {
            return;
        }
        this.e = 0L;
        timeAnimator.start();
    }

    @Override // android.animation.TimeAnimator.TimeListener
    public final void onTimeUpdate(android.animation.TimeAnimator timeAnimator, long j, long j2) {
        defpackage.wgb wgbVar;
        int i = 0;
        if (this.j) {
            this.j = false;
            c((defpackage.wfv) this.c.pollFirst());
        }
        if (this.a.isStarted()) {
            this.e = j;
            defpackage.weq weqVar = (defpackage.weq) this.m.get(this.h);
            if (weqVar != null) {
                float[] fArr = this.l;
                weqVar.b();
                defpackage.wgc wgcVar = this.b;
                while (i < 4 && i < wgcVar.a.size()) {
                    if (i == 0) {
                        wgbVar = wgcVar.b;
                    } else if (i != 1) {
                        wgbVar = i != 2 ? wgcVar.e : wgcVar.d;
                    } else {
                        wgbVar = wgcVar.c;
                    }
                    wgbVar.j = fArr[i];
                    i++;
                }
            }
            boolean zC = this.g.c(this.f, this.e, this.b);
            defpackage.wfw wfwVar = this.d;
            if (wfwVar != null) {
                wfwVar.a();
            }
            if (zC) {
                return;
            }
            d();
        }
    }
}
