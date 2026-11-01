package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class klw implements android.view.View.OnTouchListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ klw(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        switch (this.$cid) {
            case 0:
                if (motionEvent.getActionMasked() != 0) {
                    return false;
                }
                ((defpackage.kma) this.a).B = new defpackage.knk((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                return false;
            case 1:
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action != 0) {
                    if (action != 1) {
                        return false;
                    }
                    defpackage.jv jvVar = (defpackage.jv) this.a;
                    jvVar.n.removeCallbacks(jvVar.q);
                    return false;
                }
                defpackage.jv jvVar2 = (defpackage.jv) this.a;
                android.widget.PopupWindow popupWindow = jvVar2.p;
                if (popupWindow == null || !popupWindow.isShowing() || x < 0 || x >= popupWindow.getWidth() || y < 0 || y >= popupWindow.getHeight()) {
                    return false;
                }
                jvVar2.n.postDelayed(jvVar2.q, 250L);
                return false;
            case 2:
                if (motionEvent.getAction() != 1) {
                    return false;
                }
                j$.util.Optional optionalA = ((defpackage.lmk) this.a).a();
                if (true == optionalA.isPresent()) {
                    agsm.i(265, ((defpackage.lev) optionalA.get()).j.e(true), "failed to mute caller", new java.lang.Object[0]);
                }
                break;
                break;
            case 3:
                android.util.Size sizeC = qso.c(view);
                float rawX = motionEvent.getRawX() - (sizeC.getWidth() / 2.0f);
                qso qsoVar = (qso) this.a;
                android.graphics.Rect rect = qsoVar.c;
                float fA = rawX - rect.left;
                if (qsoVar.k()) {
                    fA = qsoVar.a(fA, sizeC);
                }
                android.graphics.PointF pointF = new android.graphics.PointF(fA, (motionEvent.getRawY() - (sizeC.getHeight() / 2.0f)) - rect.top);
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    qsoVar.d().setVisibility(4);
                    qsoVar.e().setVisibility(4);
                    j$.util.Optional optional = qsoVar.h;
                    if (true == optional.isPresent()) {
                        ((android.view.ViewPropertyAnimator) optional.get()).cancel();
                    }
                    android.view.ViewPropertyAnimator listener = view.animate().translationX(pointF.x).translationY(pointF.y).setInterpolator(wsc.bq(view.getContext(), urq.e)).setDuration(wsc.bp(view.getContext(), urp.b)).setListener(null);
                    listener.start();
                    qsoVar.h = j$.util.Optional.of(listener);
                } else if (actionMasked == 1) {
                    float rawX2 = motionEvent.getRawX();
                    float rawY = motionEvent.getRawY();
                    qqo qqoVarA = qqp.a();
                    qqoVarA.a = rawX2 - ((float) rect.left) >= ((float) (qsoVar.d / 2)) ? 2 : 1;
                    qqoVarA.b = rawY - ((float) rect.top) < ((float) (qsoVar.e / 2)) ? 1 : 2;
                    qsoVar.g = qqoVarA.a();
                    qtd qtdVarS = qsoVar.b.s();
                    qqp qqpVar = qsoVar.g;
                    qtd.b.b().l("com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "onUpdatePreviewPosition", 838, "VideoScreenFragmentPeer.java").y("preview position is updated: %s", qqpVar);
                    j$.util.Optional optionalK = qtdVarS.k();
                    qst qstVar = new qst(qqpVar, 3);
                    if (true == optionalK.isPresent()) {
                        java.lang.Object obj = optionalK.get();
                        java.lang.Object obj2 = qstVar.a;
                        qrv qrvVar = (qrv) obj;
                        qrvVar.e(qbc.bZ);
                        qrvVar.h.set(obj2);
                        qrvVar.s.a(ajcm.a);
                    }
                    qsoVar.g();
                } else if (actionMasked == 2) {
                    qsoVar.i(view, pointF);
                } else {
                    qso.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/incall/video/ui/PreviewPositioner", "onTouch", 177, "PreviewPositioner.java").w("unexpected motion event arrival : %d", motionEvent.getActionMasked());
                }
                break;
            case 4:
                int actionMasked2 = motionEvent.getActionMasked();
                java.lang.Object obj3 = this.a;
                if (actionMasked2 == 0) {
                    ((thn) obj3).F = new wgg((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                }
                thn thnVar = (thn) obj3;
                if (!thnVar.G.isEmpty()) {
                    return false;
                }
                aift aiftVar = new aift(4);
                uzx uzxVar = thnVar.I;
                akzx akzxVarM = uxr.a.m();
                java.lang.String str = thnVar.x;
                akzxVarM.u();
                uxr uxrVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                uxrVar.b |= 1;
                uxrVar.c = str;
                aiftVar.i(new uxt(uzxVar, akzxVarM.p(), 1));
                wsc wscVar = thnVar.K;
                android.app.Activity activity = thnVar.E;
                akzx akzxVarM2 = uxu.a.m();
                java.lang.String str2 = thnVar.x;
                akzxVarM2.u();
                uxu uxuVar = akzxVarM2.b;
                j$.util.Objects.requireNonNull(str2);
                uxuVar.b |= 1;
                uxuVar.c = str2;
                aiftVar.i(new uxt(wscVar, activity, akzxVarM2.p(), 0));
                thnVar.G = aiftVar.h();
                return false;
            case 5:
                int actionMasked3 = motionEvent.getActionMasked();
                java.lang.Object obj4 = this.a;
                if (actionMasked3 == 0) {
                    ((tie) obj4).F = new wgg((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                }
                tie tieVar = (tie) obj4;
                if (!tieVar.G.isEmpty()) {
                    return false;
                }
                aift aiftVar2 = new aift(4);
                uzx uzxVar2 = tieVar.I;
                akzx akzxVarM3 = uxr.a.m();
                java.lang.String str3 = tieVar.z;
                akzxVarM3.u();
                uxr uxrVar2 = akzxVarM3.b;
                j$.util.Objects.requireNonNull(str3);
                uxrVar2.b |= 1;
                uxrVar2.c = str3;
                aiftVar2.i(new uxt(uzxVar2, akzxVarM3.p(), 1));
                wsc wscVar2 = tieVar.J;
                android.app.Activity activity2 = tieVar.E;
                akzx akzxVarM4 = uxu.a.m();
                java.lang.String str4 = tieVar.z;
                akzxVarM4.u();
                uxu uxuVar2 = akzxVarM4.b;
                j$.util.Objects.requireNonNull(str4);
                uxuVar2.b |= 1;
                uxuVar2.c = str4;
                aiftVar2.i(new uxt(wscVar2, activity2, akzxVarM4.p(), 0));
                tieVar.G = aiftVar2.h();
                return false;
            case 6:
                int actionMasked4 = motionEvent.getActionMasked();
                java.lang.Object obj5 = this.a;
                if (actionMasked4 == 0) {
                    ((tih) obj5).G = new wgg((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                }
                tih tihVar = (tih) obj5;
                if (!tihVar.H.isEmpty()) {
                    return false;
                }
                aift aiftVar3 = new aift(4);
                uzx uzxVar3 = tihVar.J;
                akzx akzxVarM5 = uxr.a.m();
                java.lang.String str5 = tihVar.z;
                akzxVarM5.u();
                uxr uxrVar3 = akzxVarM5.b;
                j$.util.Objects.requireNonNull(str5);
                uxrVar3.b |= 1;
                uxrVar3.c = str5;
                aiftVar3.i(new uxt(uzxVar3, akzxVarM5.p(), 1));
                wsc wscVar3 = tihVar.K;
                android.app.Activity activity3 = tihVar.F;
                akzx akzxVarM6 = uxu.a.m();
                java.lang.String str6 = tihVar.z;
                akzxVarM6.u();
                uxu uxuVar3 = akzxVarM6.b;
                j$.util.Objects.requireNonNull(str6);
                uxuVar3.b |= 1;
                uxuVar3.c = str6;
                aiftVar3.i(new uxt(wscVar3, activity3, akzxVarM6.p(), 0));
                tihVar.H = aiftVar3.h();
                return false;
            case 7:
                int actionMasked5 = motionEvent.getActionMasked();
                java.lang.Object obj6 = this.a;
                if (actionMasked5 == 0) {
                    ((tio) obj6).J = new wgg((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                }
                tio tioVar = (tio) obj6;
                if (!tioVar.K.isEmpty()) {
                    return false;
                }
                aift aiftVar4 = new aift(4);
                uzx uzxVar4 = tioVar.M;
                akzx akzxVarM7 = uxr.a.m();
                java.lang.String str7 = tioVar.E;
                akzxVarM7.u();
                uxr uxrVar4 = akzxVarM7.b;
                j$.util.Objects.requireNonNull(str7);
                uxrVar4.b |= 1;
                uxrVar4.c = str7;
                aiftVar4.i(new uxt(uzxVar4, akzxVarM7.p(), 1));
                wsc wscVar4 = tioVar.N;
                android.app.Activity activity4 = tioVar.I;
                akzx akzxVarM8 = uxu.a.m();
                java.lang.String str8 = tioVar.E;
                akzxVarM8.u();
                uxu uxuVar4 = akzxVarM8.b;
                j$.util.Objects.requireNonNull(str8);
                uxuVar4.b |= 1;
                uxuVar4.c = str8;
                aiftVar4.i(new uxt(wscVar4, activity4, akzxVarM8.p(), 0));
                tioVar.K = aiftVar4.h();
                return false;
            case 8:
                ackh ackhVar = (ackh) this.a;
                android.view.View.OnClickListener onClickListener = ackhVar.k;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                if (ackhVar.j == null || motionEvent.getActionMasked() != 4 || !ackhVar.a.contains(java.lang.Math.round(motionEvent.getRawX()), java.lang.Math.round(motionEvent.getRawY()))) {
                    return false;
                }
                ackhVar.j.onClick(ackhVar.f);
                return false;
            case 9:
                com.google.android.material.search.SearchView searchView = (com.google.android.material.search.SearchView) this.a;
                if (!searchView.k()) {
                    return false;
                }
                searchView.k.clearFocus();
                return false;
            default:
                if (motionEvent.getAction() != 1) {
                    return false;
                }
                agdb agdbVar = (agdb) this.a;
                if (agdbVar.p()) {
                    agdbVar.c = false;
                }
                agdbVar.m();
                agdbVar.n();
                return false;
        }
        return true;
    }

    public klw(defpackage.jv jvVar, int i) {
        this.$cid = i;
        this.a = jvVar;
    }
}
