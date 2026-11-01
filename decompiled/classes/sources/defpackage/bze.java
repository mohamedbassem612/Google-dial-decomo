package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bze extends defpackage.bzl implements defpackage.dan {
    private bzf k;
    private bzg l;

    private final void j(bzg bzgVar) {
        this.l = bzgVar;
        defpackage.cfo.w(this);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.bzl
    public final void b(defpackage.avl avlVar, long j, float f) {
        float f2;
        bzf bzfVar = this.k;
        if (bzfVar == null) {
            java.lang.Object obj = (android.view.View) defpackage.cfo.G(this, defpackage.dep.f);
            while (!(obj instanceof android.view.ViewGroup)) {
                android.view.ViewParent parent = ((android.view.View) obj).getParent();
                if (!(parent instanceof android.view.View)) {
                    throw new java.lang.IllegalArgumentException(defpackage.a.bg(obj, "Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"));
                }
                obj = parent;
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    bzf bzfVar2 = new bzf(viewGroup.getContext());
                    viewGroup.addView(bzfVar2);
                    bzfVar = bzfVar2;
                    break;
                } else {
                    android.view.View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof bzf) {
                        bzfVar = (bzf) childAt;
                        break;
                    }
                    i++;
                }
            }
            this.k = bzfVar;
            defpackage.aooh.c(bzfVar);
        }
        defpackage.vx vxVar = bzfVar.e;
        bzg bzgVarE = vxVar.E(this);
        if (bzgVarE == null) {
            java.util.List list = bzfVar.c;
            if (list == null) {
                defpackage.aooh.i("<this>");
            }
            bzgVarE = (bzg) (list.isEmpty() ? null : list.remove(0));
            if (bzgVarE == null) {
                int i2 = bzfVar.d;
                java.util.List list2 = bzfVar.b;
                if (i2 > defpackage.ajsz.aZ(list2)) {
                    bzgVarE = new bzg(bzfVar.getContext());
                    bzfVar.addView(bzgVarE);
                    list2.add(bzgVarE);
                } else {
                    bzgVarE = (bzg) list2.get(bzfVar.d);
                    defpackage.bze bzeVar = (defpackage.bze) vxVar.a.get(bzgVarE);
                    if (bzeVar != null) {
                        bzeVar.j((bzg) null);
                        vxVar.F(bzeVar);
                        bzgVarE.a();
                    }
                }
                int i3 = bzfVar.d;
                if (i3 < bzfVar.a - 1) {
                    bzfVar.d = i3 + 1;
                } else {
                    bzfVar.d = 0;
                }
            }
            vxVar.b.put(this, bzgVarE);
            vxVar.a.put(bzgVarE, this);
        }
        bzg bzgVar = bzgVarE;
        defpackage.bzx bzxVarF = super.f(false);
        defpackage.bzw bzwVar = bzxVarF.d;
        if (bzwVar instanceof defpackage.bzv) {
            f2 = 0.1f;
        } else {
            boolean z = bzwVar instanceof bzu;
            f2 = 0.0f;
        }
        float f3 = f2;
        boolean z2 = bzxVarF.a;
        int i4 = defpackage.aopc.i(f);
        long jA = bzxVarF.c.a();
        bup bupVar = new bup(this, 7);
        if (bzgVar.b == null || !defpackage.aooh.n(java.lang.Boolean.valueOf(z2), bzgVar.c)) {
            bzy bzyVar = new bzy(z2);
            bzgVar.setBackground(bzyVar);
            bzgVar.b = bzyVar;
            bzgVar.c = java.lang.Boolean.valueOf(z2);
        }
        bzy bzyVar2 = bzgVar.b;
        defpackage.aooh.c(bzyVar2);
        bzgVar.e = bupVar;
        bzgVar.b(j, i4, jA, f3);
        if (z2) {
            long j2 = avlVar.a;
            bzyVar2.setHotspot(java.lang.Float.intBitsToFloat((int) (j2 >> 32)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)));
        } else {
            bzyVar2.setHotspot(bzyVar2.getBounds().centerX(), bzyVar2.getBounds().centerY());
        }
        bzgVar.c(true);
        j(bzgVar);
    }

    @Override // defpackage.bzl
    public final void d(defpackage.csj csjVar) {
        float f;
        defpackage.cqf cqfVarB = csjVar.q().b();
        bzg bzgVar = this.l;
        if (bzgVar != null) {
            defpackage.bzx bzxVarF = super.f(false);
            defpackage.bzw bzwVar = bzxVarF.d;
            if (bzwVar instanceof defpackage.bzv) {
                f = 0.1f;
            } else {
                boolean z = bzwVar instanceof bzu;
                f = 0.0f;
            }
            bzgVar.b(this.c, defpackage.aopc.i(this.b), bzxVarF.c.a(), f);
            android.graphics.Canvas canvas = defpackage.cpr.a;
            if (cqfVarB == null) {
                defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
            }
            bzgVar.draw(((defpackage.cpq) cqfVarB).a);
        }
    }

    @Override // defpackage.bzl
    public final void e() {
        bzg bzgVar = this.l;
        if (bzgVar != null) {
            bzgVar.c(false);
        }
    }

    @Override // defpackage.cmv
    public final void u() {
        bzf bzfVar = this.k;
        if (bzfVar != null) {
            j((bzg) null);
            defpackage.vx vxVar = bzfVar.e;
            bzg bzgVarE = vxVar.E(this);
            if (bzgVarE != null) {
                bzgVarE.a();
                vxVar.F(this);
                bzfVar.c.add(bzgVarE);
            }
        }
        this.g = null;
        this.h = null;
        this.d = false;
        this.c = 0L;
        this.b = 0.0f;
        this.i.l();
    }
}
