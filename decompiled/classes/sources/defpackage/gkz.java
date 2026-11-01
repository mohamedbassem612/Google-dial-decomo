package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class gkz implements java.lang.Cloneable {
    private gkw[] C;
    public java.util.ArrayList h;
    public java.util.ArrayList i;
    long p;
    gkv q;
    long r;
    public fsu v;
    private static final android.animation.Animator[] w = new android.animation.Animator[0];
    private static final int[] x = {2, 1, 3, 4};
    private static final defpackage.dzk G = new defpackage.dzk();
    private static final java.lang.ThreadLocal y = new java.lang.ThreadLocal();
    private final java.lang.String z = getClass().getName();
    public long a = -1;
    public long b = -1;
    public android.animation.TimeInterpolator c = null;
    final java.util.ArrayList d = new java.util.ArrayList();
    final java.util.ArrayList e = new java.util.ArrayList();
    private java.util.ArrayList A = null;
    private java.util.ArrayList B = null;
    public defpackage.kgl s = new defpackage.kgl();
    public defpackage.kgl t = new defpackage.kgl();
    defpackage.glh f = null;
    public final int[] g = x;
    final java.util.ArrayList j = new java.util.ArrayList();
    private android.animation.Animator[] D = w;
    int k = 0;
    private boolean E = false;
    boolean l = false;
    public defpackage.gkz m = null;
    defpackage.gkz n = null;
    private java.util.ArrayList F = null;
    public java.util.ArrayList o = new java.util.ArrayList();
    public defpackage.dzk u = G;

    private static void R(defpackage.kgl kglVar, android.view.View view, gli gliVar) {
        ((defpackage.aec) kglVar.c).put(view, gliVar);
        int id = view.getId();
        if (id >= 0) {
            android.util.SparseArray sparseArray = (android.util.SparseArray) kglVar.d;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        int i = defpackage.dzs.a;
        java.lang.String transitionName = view.getTransitionName();
        if (transitionName != null) {
            defpackage.aec aecVar = (defpackage.aec) kglVar.b;
            if (aecVar.containsKey(transitionName)) {
                aecVar.put(transitionName, null);
            } else {
                aecVar.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof android.widget.ListView) {
            android.widget.ListView listView = (android.widget.ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                defpackage.adb adbVar = (defpackage.adb) kglVar.a;
                if (adbVar.a(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    adbVar.g(itemIdAtPosition, view);
                    return;
                }
                android.view.View view2 = (android.view.View) adbVar.d(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    adbVar.g(itemIdAtPosition, null);
                }
            }
        }
    }

    private final void f(android.view.View view, boolean z) {
        if (view != null) {
            view.getId();
            java.util.ArrayList arrayList = this.A;
            if (arrayList == null || !arrayList.contains(view)) {
                java.util.ArrayList arrayList2 = this.B;
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        if (((java.lang.Class) this.B.get(i)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof android.view.ViewGroup) {
                    gli gliVar = new gli(view);
                    if (z) {
                        c(gliVar);
                    } else {
                        b(gliVar);
                    }
                    gliVar.c.add(this);
                    o(gliVar);
                    if (z) {
                        R(this.s, view, gliVar);
                    } else {
                        R(this.t, view, gliVar);
                    }
                }
                if (view instanceof android.view.ViewGroup) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                        f(viewGroup.getChildAt(i2), z);
                    }
                }
            }
        }
    }

    private static boolean g(gli gliVar, gli gliVar2, java.lang.String str) {
        java.util.Map map = gliVar2.a;
        java.lang.Object obj = gliVar.a.get(str);
        java.lang.Object obj2 = map.get(str);
        if (obj == null) {
            return obj2 != null;
        }
        if (obj2 != null) {
            return true ^ obj.equals(obj2);
        }
        return true;
    }

    static defpackage.aca h() {
        java.lang.ThreadLocal threadLocal = y;
        defpackage.aca acaVar = (defpackage.aca) threadLocal.get();
        if (acaVar != null) {
            return acaVar;
        }
        defpackage.aca acaVar2 = new defpackage.aca();
        threadLocal.set(acaVar2);
        return acaVar2;
    }

    public boolean A() {
        return !this.j.isEmpty();
    }

    public boolean B(gli gliVar, gli gliVar2) {
        if (gliVar == null || gliVar2 == null) {
            return false;
        }
        java.lang.String[] strArrE = e();
        if (strArrE == null) {
            java.util.Iterator it = gliVar.a.keySet().iterator();
            while (it.hasNext()) {
                if (g(gliVar, gliVar2, (java.lang.String) it.next())) {
                }
            }
            return false;
        }
        for (java.lang.String str : strArrE) {
            if (!g(gliVar, gliVar2, str)) {
            }
        }
        return false;
        return true;
    }

    final boolean C(android.view.View view) {
        int id = view.getId();
        java.util.ArrayList arrayList = this.A;
        if (arrayList != null && arrayList.contains(view)) {
            return false;
        }
        java.util.ArrayList arrayList2 = this.B;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                if (((java.lang.Class) this.B.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        java.util.ArrayList arrayList3 = this.d;
        return (arrayList3.size() == 0 && this.e.size() == 0) || arrayList3.contains(java.lang.Integer.valueOf(id)) || this.e.contains(view);
    }

    public final void D(gkw gkwVar) {
        java.util.ArrayList arrayList = this.F;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            this.F = arrayList;
        }
        arrayList.add(gkwVar);
    }

    public final void E(int i) {
        this.d.add(java.lang.Integer.valueOf(i));
    }

    public void F(android.view.View view) {
        this.e.add(view);
    }

    public final void G(android.view.View view) {
        java.util.ArrayList arrayListE = this.A;
        if (view != null) {
            arrayListE = defpackage.dzk.E(arrayListE, view);
        }
        this.A = arrayListE;
    }

    public void H(java.lang.Class cls) {
        this.B = defpackage.dzk.E(this.B, cls);
    }

    public final void I(gkw gkwVar) {
        defpackage.gkz gkzVar;
        java.util.ArrayList arrayList = this.F;
        if (arrayList != null) {
            if (!arrayList.remove(gkwVar) && (gkzVar = this.m) != null) {
                gkzVar.I(gkwVar);
            }
            if (this.F.size() == 0) {
                this.F = null;
            }
        }
    }

    public void J(android.view.View view) {
        this.e.remove(view);
    }

    public void K(long j) {
        this.b = j;
    }

    public void L(android.animation.TimeInterpolator timeInterpolator) {
        this.c = timeInterpolator;
    }

    public void N(long j) {
        this.a = j;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x0077 A[LOOP:1: B:27:0x0074->B:29:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0090  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf A[SYNTHETIC] */
    public void O(android.view.ViewGroup viewGroup, defpackage.kgl kglVar, defpackage.kgl kglVar2, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        android.animation.Animator animatorA;
        android.animation.Animator animator;
        android.view.View view;
        gli gliVar;
        android.view.View view2;
        android.animation.Animator animator2;
        java.lang.Object obj;
        java.lang.String[] strArrE;
        gli gliVar2;
        gli gliVar3;
        gli gliVar4;
        int i;
        int i2;
        java.lang.Object obj2;
        int i3;
        defpackage.aca acaVarH = h();
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        int size = arrayList.size();
        gkv gkvVar = j().q;
        for (int i4 = 0; i4 < size; i4++) {
            gli gliVar5 = (gli) arrayList.get(i4);
            gli gliVar6 = (gli) arrayList2.get(i4);
            if (gliVar5 != null && !gliVar5.c.contains(this)) {
                gliVar5 = null;
            }
            if (gliVar6 != null && !gliVar6.c.contains(this)) {
                gliVar6 = null;
            }
            if (gliVar5 == null) {
                if (gliVar6 != null) {
                    animatorA = a(viewGroup, gliVar5, gliVar6);
                    if (animatorA == null) {
                        if (gliVar6 != null) {
                            view = gliVar6.b;
                            strArrE = e();
                            if (strArrE != null) {
                                gliVar3 = new gli(view);
                                gliVar4 = (gli) ((defpackage.aec) kglVar2.c).get(view);
                                animator = animatorA;
                                if (gliVar4 != null) {
                                    i3 = 0;
                                    while (i3 < strArrE.length) {
                                        java.util.Map map = gliVar3.a;
                                        java.lang.String[] strArr = strArrE;
                                        java.lang.String str = strArr[i3];
                                        map.put(str, gliVar4.a.get(str));
                                        i3++;
                                        strArrE = strArr;
                                    }
                                }
                                i = acaVarH.d;
                                i2 = 0;
                                while (true) {
                                    if (i2 >= i) {
                                        gliVar2 = gliVar3;
                                        break;
                                    }
                                    klt kltVar = (klt) acaVarH.get((android.animation.Animator) acaVarH.d(i2));
                                    obj2 = kltVar.d;
                                    if (obj2 == null && kltVar.f == view) {
                                        if (((java.lang.String) kltVar.c).equals(this.z) && ((gli) obj2).equals(gliVar3)) {
                                            gliVar2 = gliVar3;
                                            animator = null;
                                            break;
                                        }
                                    }
                                    i2++;
                                }
                            } else {
                                animator = animatorA;
                                gliVar2 = null;
                            }
                            gliVar = gliVar2;
                        } else {
                            animator = animatorA;
                            view = gliVar5.b;
                            gliVar = null;
                        }
                        view2 = view;
                        animator2 = animator;
                        if (animator2 != null) {
                            klt kltVar2 = new klt(view2, this.z, this, viewGroup.getWindowId(), gliVar, animator2);
                            if (gkvVar != null) {
                                obj = animator2;
                                android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                                animatorSet.play(animator2);
                                obj = animatorSet;
                            }
                            obj = animator2;
                            acaVarH.put(obj, kltVar2);
                            this.o.add(obj);
                        }
                    }
                }
            } else if (gliVar6 == null || B(gliVar5, gliVar6)) {
                animatorA = a(viewGroup, gliVar5, gliVar6);
                if (animatorA == null) {
                    if (gliVar6 != null) {
                        view = gliVar6.b;
                        strArrE = e();
                        if (strArrE != null) {
                            gliVar3 = new gli(view);
                            gliVar4 = (gli) ((defpackage.aec) kglVar2.c).get(view);
                            animator = animatorA;
                            if (gliVar4 != null) {
                                i3 = 0;
                                while (i3 < strArrE.length) {
                                    java.util.Map map2 = gliVar3.a;
                                    java.lang.String[] strArr2 = strArrE;
                                    java.lang.String str2 = strArr2[i3];
                                    map2.put(str2, gliVar4.a.get(str2));
                                    i3++;
                                    strArrE = strArr2;
                                }
                            }
                            i = acaVarH.d;
                            i2 = 0;
                            while (true) {
                                if (i2 >= i) {
                                    gliVar2 = gliVar3;
                                    break;
                                }
                                klt kltVar3 = (klt) acaVarH.get((android.animation.Animator) acaVarH.d(i2));
                                obj2 = kltVar3.d;
                                if (obj2 == null) {
                                }
                                i2++;
                            }
                        } else {
                            animator = animatorA;
                            gliVar2 = null;
                        }
                        gliVar = gliVar2;
                    } else {
                        animator = animatorA;
                        view = gliVar5.b;
                        gliVar = null;
                    }
                    view2 = view;
                    animator2 = animator;
                    if (animator2 != null) {
                        klt kltVar4 = new klt(view2, this.z, this, viewGroup.getWindowId(), gliVar, animator2);
                        if (gkvVar != null) {
                            obj = animator2;
                            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
                            animatorSet2.play(animator2);
                            obj = animatorSet2;
                        }
                        obj = animator2;
                        acaVarH.put(obj, kltVar4);
                        this.o.add(obj);
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                klt kltVar5 = (klt) acaVarH.get((android.animation.Animator) this.o.get(sparseIntArray.keyAt(i5)));
                long jValueAt = sparseIntArray.valueAt(i5);
                android.animation.Animator animator3 = (android.animation.Animator) kltVar5.b;
                animator3.setStartDelay((jValueAt - Long.MAX_VALUE) + animator3.getStartDelay());
            }
        }
    }

    public void P(defpackage.dzk dzkVar) {
        if (dzkVar == null) {
            dzkVar = G;
        }
        this.u = dzkVar;
    }

    public void Q(fsu fsuVar) {
        this.v = fsuVar;
    }

    public android.animation.Animator a(android.view.ViewGroup viewGroup, gli gliVar, gli gliVar2) {
        return null;
    }

    public abstract void b(gli gliVar);

    public abstract void c(gli gliVar);

    public boolean d() {
        return false;
    }

    public java.lang.String[] e() {
        return null;
    }

    @Override // 
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public defpackage.gkz clone() {
        try {
            defpackage.gkz gkzVar = (defpackage.gkz) super.clone();
            gkzVar.o = new java.util.ArrayList();
            gkzVar.s = new defpackage.kgl();
            gkzVar.t = new defpackage.kgl();
            gkzVar.h = null;
            gkzVar.i = null;
            gkzVar.q = null;
            gkzVar.m = this;
            gkzVar.F = null;
            gkzVar.n = null;
            return gkzVar;
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public final defpackage.gkz j() {
        defpackage.glh glhVar = this.f;
        return glhVar != null ? glhVar.j() : this;
    }

    final gli k(android.view.View view, boolean z) {
        defpackage.glh glhVar = this.f;
        if (glhVar != null) {
            return glhVar.k(view, z);
        }
        java.util.ArrayList arrayList = z ? this.h : this.i;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    gli gliVar = (gli) arrayList.get(i);
                    if (gliVar != null) {
                        if (gliVar.b == view) {
                            break;
                        }
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                return (gli) (z ? this.i : this.h).get(i);
            }
        }
        return null;
    }

    public final gli l(android.view.View view, boolean z) {
        defpackage.glh glhVar = this.f;
        if (glhVar != null) {
            return glhVar.l(view, z);
        }
        return (gli) ((defpackage.aec) (z ? this.s : this.t).c).get(view);
    }

    public java.lang.String m(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(java.lang.Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.b != -1) {
            sb.append("dur(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.a != -1) {
            sb.append("dly(");
            sb.append(this.a);
            sb.append(") ");
        }
        if (this.c != null) {
            sb.append("interp(");
            sb.append(this.c);
            sb.append(") ");
        }
        java.util.ArrayList arrayList = this.d;
        if (arrayList.size() > 0 || this.e.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            java.util.ArrayList arrayList2 = this.e;
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(')');
        }
        return sb.toString();
    }

    public void n() {
        defpackage.gkz gkzVar = this.n;
        if (gkzVar != null) {
            this.n = null;
            gkzVar.n();
        }
        java.util.ArrayList arrayList = this.j;
        defpackage.aca acaVarH = h();
        int size = arrayList.size();
        android.animation.Animator[] animatorArr = (android.animation.Animator[]) arrayList.toArray(this.D);
        this.D = w;
        while (true) {
            size--;
            if (size < 0) {
                this.D = animatorArr;
                s(this, gky.c, false);
                return;
            } else {
                android.animation.Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.cancel();
                acaVarH.remove(animator);
            }
        }
    }

    final void p(android.view.ViewGroup viewGroup, boolean z) {
        boolean z2;
        q(z);
        java.util.ArrayList arrayList = this.d;
        if (arrayList.size() <= 0 && this.e.size() <= 0) {
            f(viewGroup, z);
            return;
        }
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= arrayList.size()) {
                break;
            }
            android.view.View viewFindViewById = viewGroup.findViewById(((java.lang.Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                gli gliVar = new gli(viewFindViewById);
                if (z) {
                    c(gliVar);
                } else {
                    b(gliVar);
                    z3 = false;
                }
                gliVar.c.add(this);
                o(gliVar);
                if (z3) {
                    R(this.s, viewFindViewById, gliVar);
                } else {
                    R(this.t, viewFindViewById, gliVar);
                }
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            java.util.ArrayList arrayList2 = this.e;
            if (i2 >= arrayList2.size()) {
                return;
            }
            android.view.View view = (android.view.View) arrayList2.get(i2);
            gli gliVar2 = new gli(view);
            if (z) {
                c(gliVar2);
                z2 = true;
            } else {
                b(gliVar2);
                z2 = false;
            }
            gliVar2.c.add(this);
            o(gliVar2);
            if (z2) {
                R(this.s, view, gliVar2);
            } else {
                R(this.t, view, gliVar2);
            }
            i2++;
        }
    }

    final void q(boolean z) {
        if (z) {
            ((defpackage.aec) this.s.c).clear();
            ((android.util.SparseArray) this.s.d).clear();
            ((defpackage.adb) this.s.a).f();
        } else {
            ((defpackage.aec) this.t.c).clear();
            ((android.util.SparseArray) this.t.d).clear();
            ((defpackage.adb) this.t.a).f();
        }
    }

    protected final void r() {
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            s(this, gky.b, false);
            for (int i2 = 0; i2 < ((defpackage.adb) this.s.a).b(); i2++) {
                android.view.View view = (android.view.View) ((defpackage.adb) this.s.a).e(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((defpackage.adb) this.t.a).b(); i3++) {
                android.view.View view2 = (android.view.View) ((defpackage.adb) this.t.a).e(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.l = true;
        }
    }

    public final void s(defpackage.gkz gkzVar, gky gkyVar, boolean z) {
        defpackage.gkz gkzVar2 = this.m;
        if (gkzVar2 != null) {
            gkzVar2.s(gkzVar, gkyVar, z);
        }
        java.util.ArrayList arrayList = this.F;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.F.size();
        gkw[] gkwVarArr = this.C;
        if (gkwVarArr == null) {
            gkwVarArr = new gkw[size];
        }
        this.C = null;
        gkw[] gkwVarArr2 = (gkw[]) this.F.toArray(gkwVarArr);
        for (int i = 0; i < size; i++) {
            gkyVar.a(gkwVarArr2[i], gkzVar);
            gkwVarArr2[i] = null;
        }
        this.C = gkwVarArr2;
    }

    public void t(android.view.View view) {
        if (this.l) {
            return;
        }
        java.util.ArrayList arrayList = this.j;
        int size = arrayList.size();
        android.animation.Animator[] animatorArr = (android.animation.Animator[]) arrayList.toArray(this.D);
        this.D = w;
        while (true) {
            size--;
            if (size < 0) {
                this.D = animatorArr;
                s(this, gky.d, false);
                this.E = true;
                return;
            } else {
                android.animation.Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.pause();
            }
        }
    }

    public final java.lang.String toString() {
        return m("");
    }

    public void u() {
        defpackage.aca acaVarH = h();
        this.p = 0L;
        int i = 0;
        while (true) {
            int size = this.o.size();
            java.util.ArrayList arrayList = this.o;
            if (i >= size) {
                arrayList.clear();
                return;
            }
            android.animation.Animator animator = (android.animation.Animator) arrayList.get(i);
            klt kltVar = (klt) acaVarH.get(animator);
            if (animator != null && kltVar != null) {
                long j = this.b;
                if (j >= 0) {
                    ((android.animation.Animator) kltVar.b).setDuration(j);
                }
                long j2 = this.a;
                if (j2 >= 0) {
                    android.animation.Animator animator2 = (android.animation.Animator) kltVar.b;
                    animator2.setStartDelay(j2 + animator2.getStartDelay());
                }
                android.animation.TimeInterpolator timeInterpolator = this.c;
                if (timeInterpolator != null) {
                    ((android.animation.Animator) kltVar.b).setInterpolator(timeInterpolator);
                }
                this.j.add(animator);
                this.p = java.lang.Math.max(this.p, fh$.ExternalSyntheticApiModelOutline0.m(animator));
            }
            i++;
        }
    }

    public void v() {
        defpackage.aca acaVarH = h();
        java.util.ArrayList arrayList = this.j;
        int size = arrayList.size();
        android.animation.Animator[] animatorArr = (android.animation.Animator[]) arrayList.toArray(this.D);
        this.D = w;
        while (true) {
            size--;
            if (size < 0) {
                this.D = animatorArr;
                arrayList.clear();
                return;
            } else {
                android.animation.Animator animator = animatorArr[size];
                animatorArr[size] = null;
                acaVarH.remove(animator);
            }
        }
    }

    public void w(android.view.View view) {
        if (this.E) {
            if (!this.l) {
                java.util.ArrayList arrayList = this.j;
                int size = arrayList.size();
                android.animation.Animator[] animatorArr = (android.animation.Animator[]) arrayList.toArray(this.D);
                this.D = w;
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    android.animation.Animator animator = animatorArr[size];
                    animatorArr[size] = null;
                    animator.resume();
                }
                this.D = animatorArr;
                s(this, gky.e, false);
            }
            this.E = false;
        }
    }

    protected void x() {
        z();
        defpackage.aca acaVarH = h();
        java.util.ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            android.animation.Animator animator = (android.animation.Animator) arrayList.get(i);
            if (acaVarH.containsKey(animator)) {
                z();
                if (animator != null) {
                    animator.addListener(new gkt(this, acaVarH));
                    long j = this.b;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.a;
                    if (j2 >= 0) {
                        animator.setStartDelay(j2 + animator.getStartDelay());
                    }
                    android.animation.TimeInterpolator timeInterpolator = this.c;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new gku(this));
                    animator.start();
                }
            }
        }
        this.o.clear();
        r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    public void y(long j, long j2) {
        long j3 = this.p;
        ?? r3 = (j > j2 ? 1 : (j == j2 ? 0 : -1)) >>> 31;
        int i = 0;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.l = false;
            s(this, gky.a, r3);
        }
        java.util.ArrayList arrayList = this.j;
        int size = arrayList.size();
        android.animation.Animator[] animatorArr = (android.animation.Animator[]) arrayList.toArray(this.D);
        this.D = w;
        while (i < size) {
            android.animation.Animator animator = animatorArr[i];
            animatorArr[i] = null;
            long jM = fh$.ExternalSyntheticApiModelOutline0.m(animator);
            aa$.ExternalSyntheticApiModelOutline0.m((android.animation.AnimatorSet) animator, java.lang.Math.min(java.lang.Math.max(0L, j), jM));
            i++;
            j3 = j3;
        }
        long j4 = j3;
        this.D = animatorArr;
        if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j4) {
            this.l = true;
        }
        s(this, gky.b, r3);
    }

    protected final void z() {
        if (this.k == 0) {
            s(this, gky.a, false);
            this.l = false;
        }
        this.k++;
    }

    public void M() {
    }

    public void o(gli gliVar) {
    }
}
