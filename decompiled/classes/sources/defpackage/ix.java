package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ix extends defpackage.lj {
    private static android.animation.TimeInterpolator j;
    private final java.util.ArrayList k = new java.util.ArrayList();
    private final java.util.ArrayList l = new java.util.ArrayList();
    private final java.util.ArrayList m = new java.util.ArrayList();
    private final java.util.ArrayList n = new java.util.ArrayList();
    public final java.util.ArrayList a = new java.util.ArrayList();
    public final java.util.ArrayList b = new java.util.ArrayList();
    public final java.util.ArrayList c = new java.util.ArrayList();
    public final java.util.ArrayList d = new java.util.ArrayList();
    public final java.util.ArrayList e = new java.util.ArrayList();
    final java.util.ArrayList f = new java.util.ArrayList();
    public final java.util.ArrayList g = new java.util.ArrayList();

    static final void k(java.util.List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((defpackage.ld) list.get(size)).a.animate().cancel();
            }
        }
    }

    private final void v(java.util.List list, defpackage.ld ldVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            iw iwVar = (iw) list.get(size);
            if (y(iwVar, ldVar) && iwVar.a == null && iwVar.b == null) {
                list.remove(iwVar);
            }
        }
    }

    private final void w(iw iwVar) {
        defpackage.ld ldVar = iwVar.a;
        if (ldVar != null) {
            y(iwVar, ldVar);
        }
        defpackage.ld ldVar2 = iwVar.b;
        if (ldVar2 != null) {
            y(iwVar, ldVar2);
        }
    }

    private final void x(defpackage.ld ldVar) {
        if (j == null) {
            j = new android.animation.ValueAnimator().getInterpolator();
        }
        ldVar.a.animate().setInterpolator(j);
        b(ldVar);
    }

    private final boolean y(iw iwVar, defpackage.ld ldVar) {
        if (iwVar.b == ldVar) {
            iwVar.b = null;
        } else {
            if (iwVar.a != ldVar) {
                return false;
            }
            iwVar.a = null;
        }
        android.view.View view = ldVar.a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        l(ldVar);
        return true;
    }

    final void a() {
        if (h()) {
            return;
        }
        m();
    }

    @Override // defpackage.km
    public final void b(defpackage.ld ldVar) {
        android.view.View view = ldVar.a;
        view.animate().cancel();
        java.util.ArrayList arrayList = this.m;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((hrr) arrayList.get(size)).e == ldVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                l(ldVar);
                arrayList.remove(size);
            }
        }
        v(this.n, ldVar);
        if (this.k.remove(ldVar)) {
            view.setAlpha(1.0f);
            l(ldVar);
        }
        if (this.l.remove(ldVar)) {
            view.setAlpha(1.0f);
            l(ldVar);
        }
        java.util.ArrayList arrayList2 = this.c;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            java.util.ArrayList arrayList3 = (java.util.ArrayList) arrayList2.get(size2);
            v(arrayList3, ldVar);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        java.util.ArrayList arrayList4 = this.b;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            java.util.ArrayList arrayList5 = (java.util.ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((hrr) arrayList5.get(size4)).e == ldVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    l(ldVar);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        java.util.ArrayList arrayList6 = this.a;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.f.remove(ldVar);
                this.d.remove(ldVar);
                this.g.remove(ldVar);
                this.e.remove(ldVar);
                a();
                return;
            }
            java.util.ArrayList arrayList7 = (java.util.ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(ldVar)) {
                view.setAlpha(1.0f);
                l(ldVar);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
    }

    @Override // defpackage.km
    public final void c() {
        java.util.ArrayList arrayList = this.m;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            defpackage.ld ldVar = (defpackage.ld) ((hrr) arrayList.get(size)).e;
            android.view.View view = ldVar.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            l(ldVar);
            arrayList.remove(size);
        }
        java.util.ArrayList arrayList2 = this.k;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            l((defpackage.ld) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        java.util.ArrayList arrayList3 = this.l;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            defpackage.ld ldVar2 = (defpackage.ld) arrayList3.get(size3);
            ldVar2.a.setAlpha(1.0f);
            l(ldVar2);
            arrayList3.remove(size3);
        }
        java.util.ArrayList arrayList4 = this.n;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            } else {
                w((iw) arrayList4.get(size4));
            }
        }
        arrayList4.clear();
        if (!h()) {
            return;
        }
        java.util.ArrayList arrayList5 = this.b;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            java.util.ArrayList arrayList6 = (java.util.ArrayList) arrayList5.get(size5);
            int size6 = arrayList6.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    defpackage.ld ldVar3 = (defpackage.ld) ((hrr) arrayList6.get(size6)).e;
                    android.view.View view2 = ldVar3.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    l(ldVar3);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
        }
        java.util.ArrayList arrayList7 = this.a;
        int size7 = arrayList7.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            java.util.ArrayList arrayList8 = (java.util.ArrayList) arrayList7.get(size7);
            int size8 = arrayList8.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    defpackage.ld ldVar4 = (defpackage.ld) arrayList8.get(size8);
                    ldVar4.a.setAlpha(1.0f);
                    l(ldVar4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
        }
        java.util.ArrayList arrayList9 = this.c;
        int size9 = arrayList9.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                k(this.f);
                k(this.e);
                k(this.d);
                k(this.g);
                m();
                return;
            }
            java.util.ArrayList arrayList10 = (java.util.ArrayList) arrayList9.get(size9);
            int size10 = arrayList10.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    w((iw) arrayList10.get(size10));
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
        }
    }

    @Override // defpackage.km
    public final void d() {
        long j2;
        java.util.ArrayList arrayList = this.k;
        boolean zIsEmpty = arrayList.isEmpty();
        boolean z = !zIsEmpty;
        java.util.ArrayList arrayList2 = this.m;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        java.util.ArrayList arrayList3 = this.n;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        boolean z2 = !zIsEmpty3;
        java.util.ArrayList arrayList4 = this.l;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4) {
            if (zIsEmpty3) {
                return;
            } else {
                z2 = true;
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            defpackage.ld ldVar = (defpackage.ld) arrayList.get(i);
            android.view.View view = ldVar.a;
            android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.f.add(ldVar);
            viewPropertyAnimatorAnimate.setDuration(120L).alpha(0.0f).setListener(new ir(this, ldVar, viewPropertyAnimatorAnimate, view)).start();
            i++;
            arrayList = arrayList;
            zIsEmpty = zIsEmpty;
        }
        boolean z3 = zIsEmpty;
        arrayList.clear();
        if (!zIsEmpty2) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.addAll(arrayList2);
            this.b.add(arrayList5);
            arrayList2.clear();
            defpackage.ad adVar = new defpackage.ad(this, arrayList5, 7, (char[]) null);
            if (z3) {
                adVar.run();
            } else {
                android.view.View view2 = ((defpackage.ld) ((hrr) arrayList5.get(0)).e).a;
                int i2 = defpackage.dzs.a;
                view2.postOnAnimationDelayed(adVar, 120L);
            }
        }
        if (z2) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.addAll(arrayList3);
            this.c.add(arrayList6);
            arrayList3.clear();
            defpackage.ad adVar2 = new defpackage.ad(this, arrayList6, 8, (char[]) null);
            if (z3) {
                j2 = 120;
                adVar2.run();
            } else {
                android.view.View view3 = ((iw) arrayList6.get(0)).a.a;
                int i3 = defpackage.dzs.a;
                j2 = 120;
                view3.postOnAnimationDelayed(adVar2, 120L);
            }
        } else {
            j2 = 120;
        }
        if (zIsEmpty4) {
            return;
        }
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.addAll(arrayList4);
        this.a.add(arrayList7);
        arrayList4.clear();
        defpackage.ad adVar3 = new defpackage.ad(this, arrayList7, 9, (char[]) null);
        if (z3 && zIsEmpty2 && !z2) {
            adVar3.run();
            return;
        }
        long jMax = (true != z ? 0L : j2) + java.lang.Math.max(!zIsEmpty2 ? 250L : 0L, z2 ? 250L : 0L);
        android.view.View view4 = ((defpackage.ld) arrayList7.get(0)).a;
        int i4 = defpackage.dzs.a;
        view4.postOnAnimationDelayed(adVar3, jMax);
    }

    @Override // defpackage.lj
    public final boolean e(defpackage.ld ldVar, defpackage.ld ldVar2, int i, int i2, int i3, int i4) {
        if (ldVar == ldVar2) {
            return f(ldVar, i, i2, i3, i4);
        }
        android.view.View view = ldVar.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        x(ldVar);
        float f = (i3 - i) - translationX;
        float f2 = (i4 - i2) - translationY;
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        if (ldVar2 != null) {
            x(ldVar2);
            android.view.View view2 = ldVar2.a;
            view2.setTranslationX(-((int) f));
            view2.setTranslationY(-((int) f2));
            view2.setAlpha(0.0f);
        }
        this.n.add(new iw(ldVar, ldVar2, i, i2, i3, i4));
        return true;
    }

    @Override // defpackage.lj
    public final boolean f(defpackage.ld ldVar, int i, int i2, int i3, int i4) {
        android.view.View view = ldVar.a;
        int translationX = (int) view.getTranslationX();
        int translationY = (int) view.getTranslationY();
        x(ldVar);
        int i5 = i + translationX;
        int i6 = i3 - i5;
        int i7 = i2 + translationY;
        int i8 = i4 - i7;
        if (i6 == 0) {
            i6 = 0;
            if (i8 == 0) {
                l(ldVar);
                return false;
            }
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i8 != 0) {
            view.setTranslationY(-i8);
        }
        this.m.add(new hrr(ldVar, i5, i7, i3, i4));
        return true;
    }

    @Override // defpackage.km
    public final boolean g(defpackage.ld ldVar, java.util.List list) {
        return !list.isEmpty() || r(ldVar);
    }

    @Override // defpackage.km
    public final boolean h() {
        return (this.l.isEmpty() && this.n.isEmpty() && this.m.isEmpty() && this.k.isEmpty() && this.e.isEmpty() && this.f.isEmpty() && this.d.isEmpty() && this.g.isEmpty() && this.b.isEmpty() && this.a.isEmpty() && this.c.isEmpty()) ? false : true;
    }

    @Override // defpackage.lj
    public final void i(defpackage.ld ldVar) {
        x(ldVar);
        ldVar.a.setAlpha(0.0f);
        this.l.add(ldVar);
    }

    @Override // defpackage.lj
    public final void j(defpackage.ld ldVar) {
        x(ldVar);
        this.k.add(ldVar);
    }
}
