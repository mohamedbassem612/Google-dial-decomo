package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acml implements android.view.View.OnAttachStateChangeListener, android.view.View.OnLayoutChangeListener, defpackage.acmx {
    public final android.view.View a;
    public final defpackage.acmd b;
    public android.view.ViewGroup c;
    public final defpackage.acpc d;
    public final defpackage.vaa f;
    private defpackage.acmd g;
    private java.util.List h;
    private final android.view.ViewTreeObserver.OnDrawListener o;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;
    private defpackage.acmd l = null;
    private int p = 2;
    private final android.graphics.Rect m = new android.graphics.Rect();
    public java.lang.Runnable e = null;
    private boolean n = false;

    public acml(android.view.View view, defpackage.acmd acmdVar) {
        final int i = 0;
        this.a = view;
        this.b = acmdVar;
        this.f = acmdVar.d;
        akzz akzzVar = acmdVar.c;
        apdi apdiVar = defpackage.acpb.a;
        alaa alaaVar = akzzVar.b;
        alaaVar.c(apdiVar);
        java.lang.Object objJ = alaaVar.n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        defpackage.acpc acpcVar = (defpackage.acpc) objJ;
        this.d = acpcVar;
        int iAQ = a.aQ(acpcVar.b);
        if (iAQ == 0 || iAQ != 3) {
            this.o = null;
        } else {
            this.o = new android.view.ViewTreeObserver.OnDrawListener() { // from class: acmk
                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
                    int i2 = i;
                    java.lang.Object obj = this;
                    if (i2 == 0) {
                        defpackage.acml acmlVar = (defpackage.acml) obj;
                        if (acmlVar.c.isDirty() && acmlVar.e == null) {
                            acmlVar.e = new defpackage.absj(obj, 4);
                            afec.d(acmlVar.e, acmlVar.d.c);
                            return;
                        }
                        return;
                    }
                    ifq ifqVar = (ifq) obj;
                    java.lang.Long l = ifqVar.n;
                    if (l != null) {
                        long epochMilli = (ifqVar.m + j$.time.Instant.now().toEpochMilli()) - l.longValue();
                        com.google.android.material.slider.Slider slider = ifqVar.p;
                        if (epochMilli != ((long) slider.n())) {
                            ifqVar.c(epochMilli);
                            slider.postInvalidate();
                        }
                    }
                }
            };
        }
    }

    public static android.view.View a(defpackage.acmd acmdVar) {
        defpackage.acmx acmxVar = acmdVar.a;
        if (acmxVar instanceof defpackage.acml) {
            return ((defpackage.acml) acmxVar).a;
        }
        return null;
    }

    public static defpackage.acmd b(android.view.View view) {
        return (defpackage.acmd) view.getTag(2131429374);
    }

    public static boolean n(android.view.View view) {
        return view.getId() == 16908290;
    }

    private static java.lang.String r(android.view.View view) {
        if (view.getId() != -1) {
            try {
                return view.getResources().getResourceEntryName(view.getId());
            } catch (android.content.res.Resources.NotFoundException unused) {
                return java.lang.String.valueOf(view.getClass().getSimpleName()).concat("#ResourceNotFoundException");
            }
        }
        return view.getClass().getSimpleName() + '#' + java.lang.String.valueOf(view.getTag());
    }

    private final void s() {
        java.lang.Runnable runnable = this.e;
        if (runnable != null) {
            afec.f(runnable);
            this.e = null;
        }
    }

    private final void t() {
        int iAQ;
        s();
        defpackage.acpc acpcVar = this.d;
        int iAQ2 = a.aQ(acpcVar.b);
        if (iAQ2 != 0 && iAQ2 == 3) {
            this.a.getViewTreeObserver().removeOnDrawListener(this.o);
        }
        if (this.c == null || ((iAQ = a.aQ(acpcVar.b)) != 0 && iAQ == 2)) {
            this.a.removeOnLayoutChangeListener(this);
        }
        android.view.ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener(this);
            this.c = null;
        }
    }

    private final void u() {
        android.view.ViewGroup viewGroup;
        int iAQ;
        ahvr.bY(this.i);
        boolean z = this.k;
        android.view.View view = this.a;
        if (z) {
            viewGroup = (android.view.ViewGroup) view.getRootView().findViewById(android.R.id.content);
            ahvr.ci(viewGroup);
            this.c = viewGroup;
        } else {
            viewGroup = (android.view.ViewGroup) view.getParent();
            this.c = viewGroup;
        }
        if (viewGroup != null) {
            viewGroup.addOnLayoutChangeListener(this);
        } else if (android.util.Log.isLoggable("GIL", 3) && !aa$.ExternalSyntheticApiModelOutline1.m(this.a)) {
            android.util.Log.d("GIL", "Unexpected null parent: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.b))));
        }
        if (this.c == null || ((iAQ = a.aQ(this.d.b)) != 0 && iAQ == 2)) {
            this.a.addOnLayoutChangeListener(this);
        }
        int iAQ2 = a.aQ(this.d.b);
        if (iAQ2 == 0 || iAQ2 != 3) {
            return;
        }
        this.a.getViewTreeObserver().addOnDrawListener(this.o);
    }

    private final int v() {
        android.view.View view = this.a;
        if (view.getVisibility() != 0) {
            return 2;
        }
        if (this.k && !view.isShown()) {
            return 2;
        }
        defpackage.acpc acpcVar = this.d;
        int iAQ = a.aQ(acpcVar.b);
        if (iAQ != 0 && iAQ != 1) {
            android.view.ViewGroup viewGroup = this.c;
            if (viewGroup == null) {
                return 2;
            }
            android.graphics.Rect rect = this.m;
            rect.set(viewGroup.getScrollX(), this.c.getScrollY(), this.c.getWidth() + this.c.getScrollX(), this.c.getHeight() + this.c.getScrollY());
            if (view.getLeft() > rect.left || view.getTop() > rect.top || view.getRight() < rect.right || view.getBottom() < rect.bottom) {
                if (!rect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                    return 2;
                }
                android.util.Log.d("GIL", "V=".concat(rect.toString()));
                int iWidth = ((rect.width() * rect.height()) * 100) / (view.getWidth() * view.getHeight());
                defpackage.acpa acpaVar = acpcVar.d;
                if (acpaVar == null) {
                    acpaVar = defpackage.acpa.a;
                }
                if (iWidth < acpaVar.b) {
                    return 2;
                }
            }
        }
        return 1;
    }

    private static void w(android.view.View view, defpackage.akgh akghVar) {
        defpackage.acmd acmdVarB = b(view);
        if (acmdVarB != null) {
            defpackage.acmx acmxVar = acmdVarB.a;
            if (acmxVar instanceof defpackage.acml) {
                defpackage.acml acmlVar = (defpackage.acml) acmxVar;
                if (acmlVar.g != null || acmlVar.k) {
                    return;
                }
            }
            akghVar.f(acmdVarB);
            return;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                w(viewGroup.getChildAt(i), akghVar);
            }
        }
    }

    @Override // defpackage.acmx
    public final /* bridge */ /* synthetic */ java.lang.Object c() {
        if (m() || this.k) {
            return null;
        }
        defpackage.acmd acmdVar = this.g;
        if (acmdVar != null || (acmdVar = this.l) != null) {
            return acmdVar;
        }
        for (android.view.ViewParent parent = this.a.getParent(); parent != null && (parent instanceof android.view.View); parent = parent.getParent()) {
            android.view.View view = (android.view.View) parent;
            defpackage.acmd acmdVarB = b(view);
            if (acmdVarB != null) {
                if (this.i) {
                    this.l = acmdVarB;
                }
                return acmdVarB;
            }
            if (n(view)) {
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.acmx
    public final /* bridge */ /* synthetic */ void d(java.lang.Object obj) {
        if (this.h == null) {
            this.h = new java.util.ArrayList();
        }
        defpackage.acmx acmxVar = ((defpackage.acmd) obj).a;
        ahvr.bM(this.h.add(obj));
        acmxVar.j(this.b);
        if (this.i) {
            acmxVar.g();
        }
    }

    @Override // defpackage.acmx
    public final void e() {
        ahvr.bZ(this.g != null, "No parent override to unset");
        this.g = null;
        if (this.i) {
            g();
        }
    }

    @Override // defpackage.acmx
    public final void f() {
        if (this.f.I()) {
            android.view.View view = this.a;
            view.removeOnAttachStateChangeListener(this);
            int i = dzs.a;
            if (view.isAttachedToWindow()) {
                onViewDetachedFromWindow(view);
            }
        }
        defpackage.acmd acmdVar = this.g;
        if (acmdVar != null) {
            acmdVar.a.i(this.b);
        }
        java.util.List list = this.h;
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(list);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                defpackage.acmd acmdVar2 = (defpackage.acmd) arrayList.get(i2);
                if (this.i) {
                    acmdVar2.a.h();
                }
                acmdVar2.a.e();
            }
            this.h.clear();
            this.h = null;
        }
        this.l = null;
        this.a.setTag(2131429374, null);
    }

    @Override // defpackage.acmx
    public final void g() {
        if (!this.i || this.j) {
            return;
        }
        this.j = true;
        this.f.G(this.b);
        java.util.List list = this.h;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((defpackage.acmd) it.next()).a.g();
            }
        }
    }

    @Override // defpackage.acmx
    public final void h() {
        if (this.j) {
            this.j = false;
            java.util.List list = this.h;
            if (list != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(list);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((defpackage.acmd) arrayList.get(i)).a.h();
                }
            }
            this.f.H(this.b);
            this.l = null;
        }
    }

    @Override // defpackage.acmx
    public final /* bridge */ /* synthetic */ void i(java.lang.Object obj) {
        ahvr.bM(this.h.remove(obj));
        defpackage.acmx acmxVar = ((defpackage.acmd) obj).a;
        if (this.j) {
            acmxVar.h();
        }
        acmxVar.e();
    }

    @Override // defpackage.acmx
    public final /* bridge */ /* synthetic */ void j(java.lang.Object obj) {
        ahvr.ci(obj);
        defpackage.acmd acmdVar = this.g;
        boolean z = acmdVar == null;
        defpackage.acmd acmdVar2 = this.b;
        ahvr.ce(z, "CVE (%s) has a parent override (%s). Swapping prohibited.", acmdVar2, acmdVar);
        ahvr.bZ(!this.k, "Isolated trees cannot have parents.");
        if (this.i) {
            ahvr.bW(((defpackage.acmd) obj).a.l(), "Attached CVE (%s) cannot be a child of a detached CVE (%s).", acmdVar2, obj);
            h();
        }
        this.g = (defpackage.acmd) obj;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.Set] */
    public final void k() {
        s();
        int iV = v();
        int i = this.p;
        if (iV != i) {
            this.p = iV;
            if (this.j) {
                defpackage.vaa vaaVar = this.f;
                defpackage.acmd acmdVar = this.b;
                ?? r4 = vaaVar.a;
                if (!r4.isEmpty()) {
                    if (android.util.Log.isLoggable("GIL", 2)) {
                        java.lang.String strValueOf = java.lang.String.valueOf(acmdVar);
                        java.lang.String strAn = aiql.an(i);
                        if (i == 0) {
                            throw null;
                        }
                        android.util.Log.v("GIL", "Visibility: " + strValueOf + "; " + strAn + " -> " + aiql.an(iV));
                    }
                    java.util.Iterator it = r4.iterator();
                    while (it.hasNext()) {
                        defpackage.acmz acmzVar = (defpackage.acmz) ((defpackage.aprf) it.next()).a;
                        acmzVar.f.y();
                        if (acmzVar.c.c(acmdVar, iV)) {
                            acmzVar.b();
                        }
                    }
                }
            }
            if (this.c != null && android.util.Log.isLoggable("GIL", 2)) {
                defpackage.acmd acmdVar2 = this.b;
                java.util.Locale locale = java.util.Locale.US;
                android.view.View view = this.a;
                android.util.Log.v("GIL", java.lang.String.format(locale, "Visibility: %s v=%s\tpbb=%d,%d,%d,%d cbb=%d,%d,%d,%d", acmdVar2, r(view), java.lang.Integer.valueOf(this.c.getScrollX()), java.lang.Integer.valueOf(this.c.getScrollY()), java.lang.Integer.valueOf(this.c.getWidth() + this.c.getScrollX()), java.lang.Integer.valueOf(this.c.getHeight() + this.c.getScrollY()), java.lang.Integer.valueOf(view.getLeft()), java.lang.Integer.valueOf(view.getTop()), java.lang.Integer.valueOf(view.getRight()), java.lang.Integer.valueOf(view.getBottom())));
            }
        }
        this.e = null;
    }

    @Override // defpackage.acmx
    public final boolean l() {
        return this.j;
    }

    @Override // defpackage.acmx
    public final boolean m() {
        return (this.g == null && n(this.a)) || this.k;
    }

    public final void o(boolean z) {
        if (this.k != z) {
            ahvr.bY(this.g == null);
            ahvr.bM((z && n(this.a)) ? false : true);
            if (this.i) {
                t();
            }
            this.k = z;
            if (this.i) {
                u();
            }
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        int iAQ = a.aQ(this.d.b);
        if (iAQ == 0 || iAQ != 2) {
            android.view.View view2 = this.a;
            if (view == view2) {
                ahvr.bY(this.c == null);
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view2.getParent();
                this.c = viewGroup;
                viewGroup.addOnLayoutChangeListener(this);
                view2.removeOnLayoutChangeListener(this);
            }
        } else {
            if (this.n && view == this.c) {
                this.n = false;
                if (android.util.Log.isLoggable("GIL", 2)) {
                    android.util.Log.v("GIL", java.lang.String.format(java.util.Locale.US, "LayoutChange: %s (Skipped)", this.b));
                    return;
                }
                return;
            }
            android.view.View view3 = this.a;
            if (view == view3) {
                this.n = true;
                z = false;
            } else {
                this.n = false;
                z = true;
            }
            if (this.c == null) {
                ahvr.bY(!z);
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) view3.getParent();
                this.c = viewGroup2;
                viewGroup2.addOnLayoutChangeListener(this);
            }
        }
        if (android.util.Log.isLoggable("GIL", 2)) {
            if (this.c == null) {
                java.lang.Throwable th = new java.lang.Throwable();
                th.fillInStackTrace();
                java.util.Locale locale = java.util.Locale.US;
                defpackage.acmd acmdVar = this.b;
                android.view.View view4 = this.a;
                android.util.Log.w("GIL", java.lang.String.format(locale, "You have a bug in your layout code. %s Expected [%s] Got [%s] Parent [%s]", acmdVar, view4, view, view4.getParent()), th);
                return;
            }
            defpackage.acmd acmdVar2 = this.b;
            java.util.Locale locale2 = java.util.Locale.US;
            android.view.View view5 = this.a;
            android.util.Log.v("GIL", java.lang.String.format(locale2, "LayoutChange: %s v=%s p=%d d=%d lr=%d pd=%d plr=%d\tl=%d,%d t=%d,%d r=%d,%d b=%d,%d\tpbb=%d,%d,%d,%d cbb=%d,%d,%d,%d", acmdVar2, r(view5), java.lang.Integer.valueOf(view == this.c ? 1 : 0), java.lang.Integer.valueOf(view5.isDirty() ? 1 : 0), java.lang.Integer.valueOf(view5.isLayoutRequested() ? 1 : 0), java.lang.Integer.valueOf(view.isDirty() ? 1 : 0), java.lang.Integer.valueOf(view.isLayoutRequested() ? 1 : 0), java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i7), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i8), java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(this.c.getScrollX()), java.lang.Integer.valueOf(this.c.getScrollY()), java.lang.Integer.valueOf(this.c.getWidth() + this.c.getScrollX()), java.lang.Integer.valueOf(this.c.getHeight() + this.c.getScrollY()), java.lang.Integer.valueOf(view5.getLeft()), java.lang.Integer.valueOf(view5.getTop()), java.lang.Integer.valueOf(view5.getRight()), java.lang.Integer.valueOf(view5.getBottom())));
        }
        k();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        defpackage.vaa.J(!this.i);
        if (android.util.Log.isLoggable("GIL", 2) && view.getParent() == null) {
            android.util.Log.v("GIL", "Attached View had no parent: ".concat(java.lang.String.valueOf(r(view))));
        }
        this.i = true;
        u();
        g();
        k();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        defpackage.vaa.J(this.i);
        if (android.util.Log.isLoggable("GIL", 2) && view.getParent() == null) {
            android.util.Log.v("GIL", "Detached View had no parent: ".concat(java.lang.String.valueOf(r(view))));
        }
        this.i = false;
        t();
        defpackage.acmd acmdVar = this.g;
        if (acmdVar == null) {
            h();
            return;
        }
        defpackage.acmd acmdVar2 = this.b;
        acmdVar.a.i(acmdVar2);
        boolean z = this.j;
        java.lang.Object[] objArr = {acmdVar2, this.g};
        if (z) {
            aaoo.as(new java.lang.IllegalStateException(ahvr.bK("CVE (%s) was child of detached CVE (%s).", objArr)));
        }
    }

    @Override // defpackage.acmx
    public final int p() {
        return v();
    }

    @Override // defpackage.acmx
    public final void q(defpackage.akgh akghVar) {
        android.view.View view = this.a;
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                w(viewGroup.getChildAt(i), akghVar);
            }
        }
        java.util.List list = this.h;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                akghVar.f((defpackage.acmd) this.h.get(size));
            }
        }
    }
}
