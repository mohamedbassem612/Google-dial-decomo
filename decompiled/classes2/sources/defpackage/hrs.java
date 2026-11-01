package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hrs extends lj {
    public static final /* synthetic */ int l = 0;
    private static final android.animation.TimeInterpolator m = new android.animation.ValueAnimator().getInterpolator();
    public final ems a;
    public final defpackage.hrq b;
    private final java.util.ArrayList n = new java.util.ArrayList();
    private final java.util.ArrayList o = new java.util.ArrayList();
    private final java.util.ArrayList p = new java.util.ArrayList();
    private final java.util.ArrayList q = new java.util.ArrayList();
    public final java.util.ArrayList c = new java.util.ArrayList();
    public final java.util.ArrayList d = new java.util.ArrayList();
    public final java.util.ArrayList e = new java.util.ArrayList();
    public final java.util.ArrayList f = new java.util.ArrayList();
    public final java.util.ArrayList g = new java.util.ArrayList();
    final java.util.ArrayList j = new java.util.ArrayList();
    public final java.util.ArrayList k = new java.util.ArrayList();

    public hrs(ems emsVar, defpackage.hrq hrqVar) {
        this.a = emsVar;
        this.b = hrqVar;
    }

    static final void k(java.util.List list) {
        java.util.Iterator it = ahvr.aN(list).iterator();
        while (it.hasNext()) {
            ((ld) it.next()).a.animate().cancel();
        }
    }

    private final void v(java.util.List list, ld ldVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            defpackage.hrp hrpVar = (defpackage.hrp) list.get(size);
            if (y(hrpVar, ldVar) && hrpVar.a == null && hrpVar.b == null) {
                list.remove(hrpVar);
            }
        }
    }

    private final void w(defpackage.hrp hrpVar) {
        ld ldVar = hrpVar.a;
        if (ldVar != null) {
            y(hrpVar, ldVar);
        }
        ld ldVar2 = hrpVar.b;
        if (ldVar2 != null) {
            y(hrpVar, ldVar2);
        }
    }

    private final void x(ld ldVar) {
        ldVar.a.animate().setInterpolator(m);
        b(ldVar);
    }

    private final boolean y(defpackage.hrp hrpVar, ld ldVar) {
        if (hrpVar.b == ldVar) {
            hrpVar.b = null;
            this.b.j(ldVar);
        } else {
            if (hrpVar.a != ldVar) {
                return false;
            }
            hrpVar.a = null;
            this.b.k(ldVar);
        }
        android.view.View view = ldVar.a;
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

    public final void b(ld ldVar) {
        ldVar.a.animate().cancel();
        java.util.ArrayList arrayList = this.p;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((defpackage.hrr) arrayList.get(size)).e == ldVar) {
                this.b.l(ldVar);
                l(ldVar);
                arrayList.remove(size);
            }
        }
        v(this.q, ldVar);
        if (this.n.remove(ldVar)) {
            this.b.m(ldVar);
            l(ldVar);
        }
        if (this.o.remove(ldVar)) {
            this.b.i(ldVar);
            l(ldVar);
        }
        java.util.ArrayList arrayList2 = this.e;
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
        java.util.ArrayList arrayList4 = this.d;
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
                if (((defpackage.hrr) arrayList5.get(size4)).e == ldVar) {
                    this.b.l(ldVar);
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
        java.util.ArrayList arrayList6 = this.c;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.j.remove(ldVar);
                this.f.remove(ldVar);
                this.k.remove(ldVar);
                this.g.remove(ldVar);
                a();
                return;
            }
            java.util.ArrayList arrayList7 = (java.util.ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(ldVar)) {
                this.b.i(ldVar);
                l(ldVar);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
    }

    public final void c() {
        java.util.ArrayList arrayList = this.p;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            defpackage.hrr hrrVar = (defpackage.hrr) arrayList.get(size);
            defpackage.hrq hrqVar = this.b;
            ld ldVar = (ld) hrrVar.e;
            hrqVar.l(ldVar);
            l(ldVar);
            arrayList.remove(size);
        }
        java.util.ArrayList arrayList2 = this.n;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ld ldVar2 = (ld) arrayList2.get(size2);
            this.b.m(ldVar2);
            l(ldVar2);
            arrayList2.remove(size2);
        }
        java.util.ArrayList arrayList3 = this.o;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ld ldVar3 = (ld) arrayList3.get(size3);
            this.b.i(ldVar3);
            l(ldVar3);
            arrayList3.remove(size3);
        }
        java.util.ArrayList arrayList4 = this.q;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            } else {
                w((defpackage.hrp) arrayList4.get(size4));
            }
        }
        arrayList4.clear();
        if (!h()) {
            return;
        }
        java.util.ArrayList arrayList5 = this.d;
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
                    ld ldVar4 = (ld) ((defpackage.hrr) arrayList6.get(size6)).e;
                    this.b.l(ldVar4);
                    l(ldVar4);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
        }
        java.util.ArrayList arrayList7 = this.c;
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
                    ld ldVar5 = (ld) arrayList8.get(size8);
                    this.b.i(ldVar5);
                    l(ldVar5);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
        }
        java.util.ArrayList arrayList9 = this.e;
        int size9 = arrayList9.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                k(this.j);
                k(this.g);
                k(this.f);
                k(this.k);
                m();
                return;
            }
            java.util.ArrayList arrayList10 = (java.util.ArrayList) arrayList9.get(size9);
            int size10 = arrayList10.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    w((defpackage.hrp) arrayList10.get(size10));
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
        }
    }

    public final void d() {
        java.util.ArrayList arrayList = this.n;
        boolean zIsEmpty = arrayList.isEmpty();
        boolean z = !zIsEmpty;
        java.util.ArrayList arrayList2 = this.p;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        java.util.ArrayList arrayList3 = this.q;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        boolean z2 = !zIsEmpty3;
        java.util.ArrayList arrayList4 = this.o;
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
        while (true) {
            if (i >= size) {
                break;
            }
            ld ldVar = (ld) arrayList.get(i);
            android.view.ViewPropertyAnimator viewPropertyAnimatorE = this.b.e(ldVar);
            java.util.ArrayList arrayList5 = arrayList;
            this.j.add(ldVar);
            android.view.ViewPropertyAnimator duration = viewPropertyAnimatorE.setDuration(120L);
            ems emsVar = this.a;
            defpackage.hrv hrvVar = new defpackage.hrv();
            hrvVar.d(new defpackage.fch(4));
            hrvVar.c(new defpackage.hrn(this, viewPropertyAnimatorE, ldVar, 1));
            duration.setListener(new defpackage.hry(emsVar, hrvVar.a())).start();
            i++;
            arrayList = arrayList5;
            zIsEmpty = zIsEmpty;
            zIsEmpty2 = zIsEmpty2;
        }
        boolean z3 = zIsEmpty;
        boolean z4 = zIsEmpty2;
        arrayList.clear();
        if (!z4) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.addAll(arrayList2);
            this.d.add(arrayList6);
            arrayList2.clear();
            defpackage.gra graVar = new defpackage.gra(this, arrayList6, 8, (byte[]) null);
            if (z3) {
                graVar.run();
            } else {
                android.view.View view = ((ld) ((defpackage.hrr) arrayList6.get(0)).e).a;
                int i2 = dzs.a;
                view.postOnAnimationDelayed(graVar, 120L);
            }
        }
        if (z2) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.addAll(arrayList3);
            this.e.add(arrayList7);
            arrayList3.clear();
            defpackage.gra graVar2 = new defpackage.gra(this, arrayList7, 9, (byte[]) null);
            if (z3) {
                graVar2.run();
            } else {
                ld ldVar2 = ((defpackage.hrp) arrayList7.get(0)).a;
                if (ldVar2 != null) {
                    int i3 = dzs.a;
                    ldVar2.a.postOnAnimationDelayed(graVar2, 120L);
                }
            }
        }
        if (zIsEmpty4) {
            return;
        }
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.addAll(arrayList4);
        this.c.add(arrayList8);
        arrayList4.clear();
        defpackage.gra graVar3 = new defpackage.gra(this, arrayList8, 10, (byte[]) null);
        if (z3 && z4 && !z2) {
            graVar3.run();
            return;
        }
        long jMax = (true != z ? 0L : 120L) + java.lang.Math.max(!z4 ? 250L : 0L, z2 ? 250L : 0L);
        android.view.View view2 = ((ld) arrayList8.get(0)).a;
        int i4 = dzs.a;
        view2.postOnAnimationDelayed(graVar3, jMax);
    }

    public final boolean e(ld ldVar, ld ldVar2, int i, int i2, int i3, int i4) {
        if (ldVar == ldVar2) {
            return f(ldVar, i, i2, i3, i4);
        }
        android.view.View view = ldVar.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        x(ldVar);
        float f = (i3 - i) - translationX;
        float f2 = (i4 - i2) - translationY;
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        this.b.g(ldVar);
        if (ldVar2 != null) {
            x(ldVar2);
            android.view.View view2 = ldVar2.a;
            view2.setTranslationX(-f);
            view2.setTranslationY(-f2);
        }
        this.q.add(new defpackage.hrp(ldVar, ldVar2, i, i2, i3, i4));
        return true;
    }

    public final boolean f(ld ldVar, int i, int i2, int i3, int i4) {
        android.view.View view = ldVar.a;
        int translationX = (int) view.getTranslationX();
        int translationY = (int) view.getTranslationY();
        x(ldVar);
        int i5 = i + translationX;
        int i6 = i2 + translationY;
        if (this.b.n(ldVar, i5, i6, i3, i4)) {
            this.p.add(new defpackage.hrr(ldVar, i5, i6, i3, i4));
            return true;
        }
        l(ldVar);
        return false;
    }

    public final boolean g(ld ldVar, java.util.List list) {
        return !list.isEmpty() || r(ldVar);
    }

    public final boolean h() {
        return (this.o.isEmpty() && this.q.isEmpty() && this.p.isEmpty() && this.n.isEmpty() && this.g.isEmpty() && this.j.isEmpty() && this.f.isEmpty() && this.k.isEmpty() && this.d.isEmpty() && this.c.isEmpty() && this.e.isEmpty()) ? false : true;
    }

    public final void i(ld ldVar) {
        x(ldVar);
        this.b.f(ldVar);
        this.o.add(ldVar);
    }

    public final void j(ld ldVar) {
        x(ldVar);
        this.b.h(ldVar);
        this.n.add(ldVar);
    }
}
