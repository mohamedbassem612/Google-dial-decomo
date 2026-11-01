package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class gks extends defpackage.ce {
    private static boolean A(gkz gkzVar) {
        return (x(gkzVar.d) && x(null) && x(null)) ? false : true;
    }

    @Override // defpackage.ce
    public final java.lang.Object a(java.lang.Object obj) {
        if (obj != null) {
            return ((gkz) obj).i();
        }
        return null;
    }

    @Override // defpackage.ce
    public final java.lang.Object b(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        glh glhVar = new glh();
        glhVar.S((gkz) obj);
        return glhVar;
    }

    @Override // defpackage.ce
    public final void c(java.lang.Object obj, android.view.View view) {
        ((gkz) obj).F(view);
    }

    @Override // defpackage.ce
    public final void d(java.lang.Object obj, java.util.ArrayList arrayList) {
        glh glhVar = (gkz) obj;
        if (glhVar != null) {
            int i = 0;
            if (glhVar instanceof glh) {
                glh glhVar2 = glhVar;
                int iF = glhVar2.f();
                while (i < iF) {
                    d(glhVar2.g(i), arrayList);
                    i++;
                }
                return;
            }
            if (A(glhVar) || !x(((gkz) glhVar).e)) {
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                glhVar.F((android.view.View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.ce
    public final void e(android.view.ViewGroup viewGroup, java.lang.Object obj) {
        gld.b(viewGroup, (gkz) obj);
    }

    public final void f(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        glh glhVar = (gkz) obj;
        int i = 0;
        if (glhVar instanceof glh) {
            glh glhVar2 = glhVar;
            int iF = glhVar2.f();
            while (i < iF) {
                f(glhVar2.g(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (A(glhVar)) {
            return;
        }
        java.util.ArrayList arrayList3 = ((gkz) glhVar).e;
        if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            glhVar.F((android.view.View) arrayList2.get(i));
            i++;
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                glhVar.J((android.view.View) arrayList.get(size2));
            }
        }
    }

    @Override // defpackage.ce
    public final void g(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList) {
        ((gkz) obj).D(new defpackage.gkp(view, arrayList));
    }

    @Override // defpackage.ce
    public final void h(java.lang.Object obj, android.graphics.Rect rect) {
        ((gkz) obj).Q(new defpackage.fsu());
    }

    @Override // defpackage.ce
    public final void i(java.lang.Object obj, android.view.View view) {
        if (view != null) {
            y(view, new android.graphics.Rect());
            ((gkz) obj).Q(new defpackage.fsu());
        }
    }

    @Override // defpackage.ce
    public final void j(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList) {
        glh glhVar = (glh) obj;
        java.util.ArrayList arrayList2 = ((gkz) glhVar).e;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v(arrayList2, (android.view.View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        d(glhVar, arrayList);
    }

    @Override // defpackage.ce
    public final void k(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        glh glhVar = (glh) obj;
        if (glhVar != null) {
            java.util.ArrayList arrayList3 = ((gkz) glhVar).e;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            f(glhVar, arrayList, arrayList2);
        }
    }

    @Override // defpackage.ce
    public final boolean l(java.lang.Object obj) {
        return obj instanceof gkz;
    }

    @Override // defpackage.ce
    public final boolean m() {
        return true;
    }

    @Override // defpackage.ce
    public final boolean n(java.lang.Object obj) {
        boolean zD = ((gkz) obj).d();
        if (!zD) {
            android.util.Log.v("FragmentManager", a.bg(obj, "Predictive back not available for AndroidX Transition ", ". Please enable seeking support for the designated transition by overriding isSeekingSupported()."));
        }
        return zD;
    }

    @Override // defpackage.ce
    public final java.lang.Object o(java.lang.Object obj, java.lang.Object obj2) {
        glh glhVar = new glh();
        if (obj != null) {
            glhVar.S((gkz) obj);
        }
        glhVar.S((gkz) obj2);
        return glhVar;
    }

    @Override // defpackage.ce
    public final void p(java.lang.Object obj, java.lang.Object obj2, java.util.ArrayList arrayList, java.lang.Object obj3, java.util.ArrayList arrayList2) {
        ((gkz) obj).D(new defpackage.gkq(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.ce
    public final void q(java.lang.Object obj, defpackage.dxa dxaVar, java.lang.Runnable runnable) {
        z(obj, dxaVar, null, runnable);
    }

    @Override // defpackage.ce
    public final java.lang.Object r(java.lang.Object obj, java.lang.Object obj2) {
        gkz gkzVar = (gkz) obj;
        gkz gkzVar2 = (gkz) obj2;
        if (gkzVar == null) {
            gkzVar = null;
        }
        if (gkzVar2 == null) {
            return gkzVar;
        }
        glh glhVar = new glh();
        if (gkzVar != null) {
            glhVar.S(gkzVar);
        }
        glhVar.S(gkzVar2);
        return glhVar;
    }

    @Override // defpackage.ce
    public final java.lang.Object s(android.view.ViewGroup viewGroup, java.lang.Object obj) {
        gkz gkzVar = (gkz) obj;
        java.util.ArrayList arrayList = gld.a;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || android.os.Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!gkzVar.d()) {
            throw new java.lang.IllegalArgumentException("The Transition must support seeking.");
        }
        arrayList.add(viewGroup);
        gkz gkzVarI = gkzVar.i();
        glh glhVar = new glh();
        glhVar.S(gkzVarI);
        gkzVar.n = glhVar;
        gld.d(viewGroup, glhVar);
        viewGroup.setTag(2131429315, null);
        gld.c(viewGroup, glhVar);
        viewGroup.invalidate();
        ((gkz) glhVar).q = new defpackage.gkv(glhVar);
        glhVar.D(((gkz) glhVar).q);
        return ((gkz) glhVar).q;
    }

    @Override // defpackage.ce
    public final void t(java.lang.Object obj) {
        ((defpackage.gkv) obj).i();
    }

    @Override // defpackage.ce
    public final void u(java.lang.Object obj, java.lang.Runnable runnable) {
        ((defpackage.gkv) obj).j(runnable);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    @Override // defpackage.ce
    public final void w(java.lang.Object obj, float f) {
        defpackage.gkv gkvVar = (defpackage.gkv) obj;
        if (gkvVar.b) {
            long jH = (long) (f * gkvVar.h());
            long j = 0;
            if (jH == 0) {
                jH = 1;
            }
            long j2 = -1;
            if (jH == gkvVar.h()) {
                jH = gkvVar.h() - 1;
            }
            if (gkvVar.e != null) {
                throw new java.lang.IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            long j3 = gkvVar.a;
            if (jH != j3) {
                if (!gkvVar.c) {
                    if (jH == 0) {
                        if (j3 <= 0) {
                        }
                        if (j2 != j3) {
                            gkvVar.g.y(j2, j3);
                            gkvVar.a = j2;
                        }
                        jH = j2;
                    } else {
                        j = jH;
                    }
                    long jH2 = gkvVar.h();
                    j2 = (j != jH2 || j3 >= jH2) ? j : jH2 + 1;
                    if (j2 != j3) {
                        gkvVar.g.y(j2, j3);
                        gkvVar.a = j2;
                    }
                    jH = j2;
                }
                gkvVar.h.d(android.view.animation.AnimationUtils.currentAnimationTimeMillis(), jH);
            }
        }
    }

    @Override // defpackage.ce
    public final void z(java.lang.Object obj, defpackage.dxa dxaVar, java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        gkz gkzVar = (gkz) obj;
        jxt jxtVar = new jxt(runnable, gkzVar, runnable2);
        synchronized (dxaVar) {
            while (dxaVar.b) {
                try {
                    dxaVar.wait();
                } catch (java.lang.InterruptedException unused) {
                }
            }
            if (dxaVar.c != jxtVar) {
                dxaVar.c = jxtVar;
                if (dxaVar.a) {
                    jxtVar.a();
                }
            }
        }
        gkzVar.D(new defpackage.gkr(runnable2));
    }
}
