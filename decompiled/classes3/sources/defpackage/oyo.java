package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class oyo implements defpackage.oye {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public oyo(defpackage.oyc oycVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(oycVar);
        this.a = oycVar;
    }

    @Override // defpackage.oye
    public final void a(boolean z) {
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj = this.a;
            if (z) {
                ((defpackage.oyp) obj).k();
                return;
            } else {
                ((defpackage.oyp) obj).l();
                return;
            }
        }
        if (i != 1) {
            java.lang.Object obj2 = this.a;
            if (z) {
                ((defpackage.oyu) obj2).g();
                return;
            } else {
                ((defpackage.oyu) obj2).h();
                return;
            }
        }
        java.lang.Object obj3 = this.a;
        ahok ahokVarF = ((defpackage.oyc) obj3).f.f(443, "FlingUpDownAnswerMethodFragmentPeer_onProgressChangedListener_onMoveFinish");
        try {
            ((defpackage.oyf) ((defpackage.oyc) obj3).s.orElseThrow()).a = false;
            if (((defpackage.oyc) obj3).l) {
                ((defpackage.oyc) obj3).h.isPresent();
            }
            if (z) {
                ((defpackage.oyc) obj3).j();
            } else {
                ((defpackage.oyc) obj3).k();
            }
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.oye
    public final void b(boolean z) {
        if (this.$cid == 1) {
            java.lang.Object obj = this.a;
            if (z) {
                ((defpackage.oyc) obj).o(5);
            } else {
                ((defpackage.oyc) obj).o(2);
            }
            ((defpackage.oyc) this.a).l();
        }
    }

    @Override // defpackage.oye
    public final void c(float f) {
        if (this.$cid == 1) {
            defpackage.oyc oycVar = (defpackage.oyc) this.a;
            oycVar.q = f;
            if (oycVar.o == 3 && oycVar.c.aK()) {
                oycVar.q();
            }
        }
    }

    @Override // defpackage.oye
    public final void d() {
        if (this.$cid == 1) {
            java.lang.Object obj = this.a;
            defpackage.oyc oycVar = (defpackage.oyc) obj;
            oycVar.i.o(rmx.di);
            oycVar.o(3);
            ahvr.i(new defpackage.ozc(), oycVar.c);
        }
    }

    @Override // defpackage.oye
    public final void e() {
        if (this.$cid == 1) {
            ahvr.i(new defpackage.ozd(), ((defpackage.oyc) this.a).c);
        }
    }

    @Override // defpackage.oye
    public final void f(android.view.MotionEvent motionEvent) {
        android.view.View viewA;
        int i = this.$cid;
        if (i == 0) {
            aooh.f(motionEvent, "downEvent");
            return;
        }
        if (i != 1 || (viewA = ((defpackage.oyc) this.a).a()) == null) {
            return;
        }
        viewA.getX();
        viewA.getWidth();
        viewA.getY();
        viewA.getHeight();
        viewA.getHeight();
        motionEvent.getX();
        motionEvent.getY();
    }

    public oyo(defpackage.oyp oypVar, int i) {
        this.$cid = i;
        this.a = oypVar;
    }

    public oyo(defpackage.oyu oyuVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(oyuVar);
        this.a = oyuVar;
    }
}
