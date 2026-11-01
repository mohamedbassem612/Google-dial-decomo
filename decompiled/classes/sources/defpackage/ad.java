package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ad implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public ad(dvl dvlVar, android.graphics.Typeface typeface, int i) {
        this.$cid = i;
        this.a = dvlVar;
        this.b = typeface;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v35, types: [emw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v38, types: [dxw, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        int i = 0;
        switch (this.$cid) {
            case 0:
                ce.y((android.view.View) this.a, (android.graphics.Rect) this.b);
                return;
            case 1:
                ((defpackage.ck) this.a).c((defpackage.cj) this.b);
                return;
            case 2:
                defpackage.a.bb((defpackage.cj) this.a, (ag) this.b);
                return;
            case 3:
                defpackage.a.bb((defpackage.cj) this.a, (ag) this.b);
                return;
            case 4:
                java.util.Iterator it = ((ag) this.b).a.iterator();
                while (it.hasNext()) {
                    defpackage.cj cjVar = ((ab) ((ah) it.next())).a;
                    android.view.View view = cjVar.a.Q;
                    if (view != null) {
                        defpackage.den.bR(cjVar.h, view, (android.view.ViewGroup) this.a);
                    }
                }
                return;
            case 5:
                ((defpackage.aw) this.a).k((android.os.Bundle) this.b);
                return;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                ?? r1 = this.a;
                java.lang.Object obj = this.b;
                try {
                    r1.run();
                    return;
                } finally {
                    ((defpackage.db) obj).a();
                }
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                ?? r2 = this.a;
                int size = r2.size();
                while (i < size) {
                    hrr hrrVar = (hrr) r2.get(i);
                    java.lang.Object obj2 = this.b;
                    java.lang.Object obj3 = hrrVar.e;
                    int i2 = hrrVar.a;
                    int i3 = hrrVar.b;
                    int i4 = hrrVar.c;
                    int i5 = hrrVar.d;
                    defpackage.ld ldVar = (defpackage.ld) obj3;
                    android.view.View view2 = ldVar.a;
                    int i6 = i4 - i2;
                    int i7 = i5 - i3;
                    if (i6 != 0) {
                        view2.animate().translationX(0.0f);
                    }
                    if (i7 != 0) {
                        view2.animate().translationY(0.0f);
                    }
                    android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                    defpackage.ix ixVar = (defpackage.ix) obj2;
                    ixVar.e.add(obj3);
                    viewPropertyAnimatorAnimate.setDuration(250L).setListener(new it(ixVar, ldVar, i6, view2, i7, viewPropertyAnimatorAnimate)).start();
                    i++;
                }
                ((java.util.ArrayList) r2).clear();
                ((defpackage.ix) this.b).b.remove((java.lang.Object) r2);
                return;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                ?? r3 = this.a;
                int size2 = r3.size();
                while (i < size2) {
                    iw iwVar = (iw) r3.get(i);
                    java.lang.Object obj4 = this.b;
                    defpackage.ld ldVar2 = iwVar.a;
                    android.view.View view3 = ldVar2 == null ? null : ldVar2.a;
                    defpackage.ld ldVar3 = iwVar.b;
                    android.view.View view4 = ldVar3 != null ? ldVar3.a : null;
                    if (view3 != null) {
                        android.view.ViewPropertyAnimator duration = view3.animate().setDuration(250L);
                        defpackage.ix ixVar2 = (defpackage.ix) obj4;
                        ixVar2.g.add(iwVar.a);
                        duration.translationX(iwVar.e - iwVar.c);
                        duration.translationY(iwVar.f - iwVar.d);
                        duration.alpha(0.0f).setListener(new iu(ixVar2, iwVar, duration, view3)).start();
                    }
                    if (view4 != null) {
                        defpackage.ix ixVar3 = (defpackage.ix) obj4;
                        java.util.ArrayList arrayList = ixVar3.g;
                        android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view4.animate();
                        arrayList.add(iwVar.b);
                        viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new iv(ixVar3, iwVar, viewPropertyAnimatorAnimate2, view4)).start();
                    }
                    i++;
                }
                ((java.util.ArrayList) r3).clear();
                ((defpackage.ix) this.b).c.remove((java.lang.Object) r3);
                return;
            case 9:
                ?? r4 = this.a;
                int size3 = r4.size();
                while (i < size3) {
                    defpackage.ld ldVar4 = (defpackage.ld) r4.get(i);
                    java.lang.Object obj5 = this.b;
                    android.view.View view5 = ldVar4.a;
                    android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view5.animate();
                    defpackage.ix ixVar4 = (defpackage.ix) obj5;
                    ixVar4.d.add(ldVar4);
                    viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(120L).setListener(new is(ixVar4, ldVar4, view5, viewPropertyAnimatorAnimate3)).start();
                    i++;
                }
                ((java.util.ArrayList) r4).clear();
                ((defpackage.ix) this.b).a.remove((java.lang.Object) r4);
                return;
            case 10:
                mj mjVar = (mj) this.a;
                android.support.v7.widget.RecyclerView recyclerView = mjVar.p;
                if (recyclerView == null || !recyclerView.q) {
                    return;
                }
                mi miVar = (mi) this.b;
                if (miVar.n) {
                    return;
                }
                lya lyaVar = miVar.h;
                if (lyaVar.a() != -1) {
                    defpackage.km kmVar = mjVar.p.E;
                    if (kmVar == null || !kmVar.h()) {
                        java.util.List list = mjVar.n;
                        int size4 = list.size();
                        while (i < size4) {
                            if (((mi) list.get(i)).o) {
                                i++;
                            }
                        }
                        defpackage.ahvr.bN(lyaVar instanceof lya, "viewHolder is not an instance of ConversationHistoryCallDetailsEntryViewHolder");
                        lya lyaVar2 = lyaVar;
                        hsh hshVar = lyaVar2.F;
                        hshVar.d();
                        hshVar.k(new ldf(lyaVar2, 19));
                        hshVar.g(0.75f, 1.0f, new android.view.animation.LinearInterpolator(), new kkz(lyaVar2, 4));
                        hshVar.i(new ldf(lyaVar2, 20));
                        hshVar.setDuration(160L).start();
                        return;
                    }
                    mjVar.p.post(this);
                    return;
                }
                return;
            case 11:
                ((defpackage.mp) this.b).fe((defpackage.nf) this.a);
                return;
            case 12:
                java.lang.Object obj6 = this.a;
                java.util.Map map = ((tp) this.b).a;
                synchronized (map) {
                    androidx.car.app.CarAppBinder carAppBinder = (androidx.car.app.CarAppBinder) map.get(obj6);
                    if (carAppBinder != null) {
                        carAppBinder.onDestroyLifecycle();
                    }
                    break;
                }
                return;
            case 13:
                defpackage.emy emyVar = ((ub) this.b).b;
                if (emyVar.d.a(defpackage.emq.b)) {
                    java.lang.Object obj7 = this.a;
                    defpackage.emo emoVar = defpackage.emp.Companion;
                    emyVar.f((defpackage.emp) obj7);
                    return;
                }
                return;
            case 14:
                rt.h((defpackage.cnn) this.a, (android.util.LongSparseArray) this.b);
                return;
            case 15:
                ?? r5 = this.b;
                defpackage.dha dhaVar = (defpackage.dha) r5;
                if (dhaVar.c) {
                    return;
                }
                defpackage.ems emsVar = (defpackage.ems) this.a;
                dhaVar.d = emsVar;
                emsVar.c(r5);
                return;
            case 16:
                ((dvl) this.a).b((android.graphics.Typeface) this.b);
                return;
            case 17:
                this.b.accept(this.a);
                return;
            case 18:
                java.lang.Object obj8 = this.b;
                java.lang.Object obj9 = this.a;
                int i8 = eku.a;
                java.lang.Throwable th = (java.lang.Throwable) obj8;
                android.util.Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in ".concat(java.lang.String.valueOf(obj9)), th);
                throw th;
            case 19:
                epn epnVar = (epn) this.b;
                boolean zF = epnVar.f();
                java.lang.Object obj10 = this.a;
                if (zF) {
                    epnVar.b(obj10);
                } else {
                    epnVar.c(obj10);
                }
                epnVar.f = 3;
                return;
            default:
                hgt.e = (android.media.AudioManager) ((android.content.Context) this.b).getSystemService("audio");
                ((agze) this.a).g();
                return;
        }
    }

    public ad(defpackage.dxw dxwVar, java.lang.Object obj, int i) {
        this.$cid = i;
        this.b = dxwVar;
        this.a = obj;
    }

    public /* synthetic */ ad(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ ad(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public ad(java.lang.Object obj, java.lang.Object obj2, int i, char[] cArr) {
        this.$cid = i;
        this.a = obj2;
        this.b = obj;
    }

    public ad(mj mjVar, mi miVar, int i) {
        this.$cid = i;
        this.b = miVar;
        this.a = mjVar;
    }
}
