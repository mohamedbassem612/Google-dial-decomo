package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aljb {
    static java.lang.Integer d;
    public final java.lang.Object a;
    public final java.lang.Object b;
    public java.lang.Object c;

    public aljb(aeuo aeuoVar, defpackage.zfj zfjVar) {
        aooh.f(aeuoVar, "timerMetricService");
        this.a = aeuoVar;
        this.b = zfjVar;
    }

    public static final boolean e(int i, int i2) {
        return g(i) && g(i2);
    }

    private final int f(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        android.view.View view = (android.view.View) this.b;
        if (view.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        if (android.util.Log.isLoggable("CustomViewTarget", 4)) {
            android.util.Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        android.content.Context context = view.getContext();
        java.lang.Integer numValueOf = d;
        if (numValueOf == null) {
            android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
            anty.aI(windowManager, "Argument must not be null");
            android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
            android.graphics.Point point = new android.graphics.Point();
            defaultDisplay.getSize(point);
            numValueOf = java.lang.Integer.valueOf(java.lang.Math.max(point.x, point.y));
            d = numValueOf;
        }
        return numValueOf.intValue();
    }

    private static final boolean g(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fd  */
    /* JADX WARN: Type inference failed for: r7v8, types: [aehm, java.lang.Object] */
    public final void a(aify aifyVar) {
        boolean zAP;
        int i;
        java.lang.Object objBm;
        defpackage.aehr aehrVar;
        java.lang.Object obj;
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object obj2 = this.a;
        aeiv aeivVar = (aeiv) obj2;
        aeiv.e(java.lang.String.format(locale, "setAvailableAccounts() %d -> %d.", java.lang.Integer.valueOf(aeivVar.d().d), java.lang.Integer.valueOf(aifyVar.size())));
        int i2 = 4;
        aift aiftVar = new aift(4);
        java.util.Iterator it = aifyVar.iterator();
        while (it.hasNext()) {
            aiftVar.i(defpackage.aehr.a(it.next(), aeivVar.d));
        }
        aike aikeVarH = aiftVar.h();
        synchronized (aeivVar.b) {
            zAP = ahvr.aP(((aeiv) obj2).f, aikeVarH);
        }
        if (zAP) {
            aeiv.e("availableAccounts hasn't changed, returning.");
            aeivVar.f();
        } else {
            java.util.HashMap map = new java.util.HashMap();
            int i3 = aikeVarH.d;
            for (int i4 = 0; i4 < i3; i4++) {
                defpackage.aehr aehrVar2 = (defpackage.aehr) aikeVarH.get(i4);
                map.put(aeivVar.d.b(aehrVar2.a), aehrVar2);
            }
            defpackage.aehr aehrVar3 = aeivVar.g;
            if (aehrVar3 != null) {
                aeivVar.g = (defpackage.aehr) map.get(aeivVar.d.b(aehrVar3.a));
                defpackage.aehr aehrVar4 = aeivVar.g;
                if (aehrVar4 == null) {
                    i = 4;
                } else if (aehrVar4.equals(aehrVar3)) {
                    i = 0;
                } else {
                    i = 5;
                }
            } else {
                i = 0;
            }
            synchronized (aeivVar.b) {
                ((aeiv) obj2).d();
                java.util.Map map2 = ((aeiv) obj2).c;
                defpackage.aeiu aeiuVar = defpackage.aeiu.a;
                if ((aeiuVar.b || ((java.lang.Boolean) aeiuVar.c.a(new defpackage.adfe(12)).d(java.lang.Boolean.FALSE)).booleanValue()) && map.size() == map2.size() + 1) {
                    java.util.HashMap map3 = new java.util.HashMap(map);
                    map3.keySet().removeAll(map2.keySet());
                    if (map3.size() != 1) {
                        objBm = null;
                    } else {
                        objBm = ahvr.bm(map3.values());
                    }
                } else {
                    objBm = null;
                }
                aehrVar = (defpackage.aehr) objBm;
                ((aeiv) obj2).f = aikeVarH;
                map2.clear();
                map2.putAll(map);
            }
            if (aehrVar != null) {
                aeivVar.g = aehrVar;
                defpackage.aelu aeluVar = aeivVar.h;
                if (aeluVar != null) {
                    java.lang.Object obj3 = aehrVar.a;
                    if (aifyVar.size() == 1) {
                        aesg.i(new defpackage.acxq(aeluVar.a, aeluVar.b, obj3, i2));
                    }
                }
                defpackage.aeiu aeiuVar2 = defpackage.aeiu.a;
                aeiuVar2.c = ahwt.a;
                aeiuVar2.b = false;
            } else {
                i2 = i;
            }
            aeivVar.f();
            java.util.concurrent.CopyOnWriteArraySet<aehj> copyOnWriteArraySet = aeivVar.a;
            if (!copyOnWriteArraySet.isEmpty()) {
                for (aehj aehjVar : copyOnWriteArraySet) {
                    aehjVar.r(aeivVar.d());
                    if (i2 != 0) {
                        aehjVar.t(aeivVar.a());
                    }
                }
            }
        }
        if (!aifyVar.isEmpty()) {
            aeiv aeivVar2 = (aeiv) this.a;
            if (aeivVar2.a() == null) {
                java.lang.Object obj4 = this.c;
                if (obj4 == null) {
                    obj = null;
                    break;
                }
                int size = aifyVar.size();
                int i5 = 0;
                do {
                    if (i5 >= size) {
                        obj = null;
                        break;
                    } else {
                        obj = aifyVar.get(i5);
                        i5++;
                    }
                } while (!((java.lang.String) obj4).equals(this.b.b(obj)));
                if (obj == null || !aifyVar.contains(obj)) {
                    obj = aifyVar.get(0);
                }
                ahvr.cj(obj, "LimitedAvailableAccountsModel cannot set null selected account");
                aeivVar2.g(obj);
            }
        }
        if (aifyVar.isEmpty()) {
            return;
        }
        this.c = null;
    }

    public final int b() {
        android.view.View view = (android.view.View) this.b;
        int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return f(view.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
    }

    public final int c() {
        android.view.View view = (android.view.View) this.b;
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return f(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void d() {
        android.view.ViewTreeObserver viewTreeObserver = ((android.view.View) this.b).getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.c);
        }
        this.c = null;
        this.a.clear();
    }

    public aljb(aeiv aeivVar, defpackage.aehm aehmVar) {
        this.a = aeivVar;
        this.b = aehmVar;
    }

    public aljb(aizr aizrVar, j$.time.Duration duration) {
        this.a = duration;
        this.b = aizrVar;
    }

    public aljb(android.view.View view) {
        this.a = new java.util.ArrayList();
        this.b = view;
    }
}
