package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class cd extends defpackage.ce {
    private static boolean A(android.transition.Transition transition) {
        return (x(transition.getTargetIds()) && x(transition.getTargetNames()) && x(transition.getTargetTypes())) ? false : true;
    }

    @Override // defpackage.ce
    public final java.lang.Object a(java.lang.Object obj) {
        if (obj != null) {
            return ((android.transition.Transition) obj).clone();
        }
        return null;
    }

    @Override // defpackage.ce
    public final java.lang.Object b(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        android.transition.TransitionSet transitionSet = new android.transition.TransitionSet();
        transitionSet.addTransition((android.transition.Transition) obj);
        return transitionSet;
    }

    @Override // defpackage.ce
    public final void c(java.lang.Object obj, android.view.View view) {
        ((android.transition.Transition) obj).addTarget(view);
    }

    @Override // defpackage.ce
    public final void d(java.lang.Object obj, java.util.ArrayList arrayList) {
        android.transition.Transition transition = (android.transition.Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof android.transition.TransitionSet) {
                android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    d(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
                return;
            }
            if (A(transition) || !x(transition.getTargets())) {
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                transition.addTarget((android.view.View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.ce
    public final void e(android.view.ViewGroup viewGroup, java.lang.Object obj) {
        android.transition.TransitionManager.beginDelayedTransition(viewGroup, (android.transition.Transition) obj);
    }

    public final void f(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        java.util.List<android.view.View> targets;
        android.transition.Transition transition = (android.transition.Transition) obj;
        int i = 0;
        if (transition instanceof android.transition.TransitionSet) {
            android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                f(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (A(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget((android.view.View) arrayList2.get(i));
            i++;
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                transition.removeTarget((android.view.View) arrayList.get(size2));
            }
        }
    }

    @Override // defpackage.ce
    public final void g(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList) {
        ((android.transition.Transition) obj).addListener(new defpackage.bz(view, arrayList));
    }

    @Override // defpackage.ce
    public final void h(java.lang.Object obj, android.graphics.Rect rect) {
        ((android.transition.Transition) obj).setEpicenterCallback(new defpackage.cc(rect));
    }

    @Override // defpackage.ce
    public final void i(java.lang.Object obj, android.view.View view) {
        if (view != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            y(view, rect);
            ((android.transition.Transition) obj).setEpicenterCallback(new defpackage.by(rect));
        }
    }

    @Override // defpackage.ce
    public final void j(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList) {
        android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) obj;
        java.util.List<android.view.View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v(targets, (android.view.View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        d(transitionSet, arrayList);
    }

    @Override // defpackage.ce
    public final void k(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            f(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // defpackage.ce
    public final boolean l(java.lang.Object obj) {
        return obj instanceof android.transition.Transition;
    }

    @Override // defpackage.ce
    public final boolean m() {
        if (!bo.Z(4)) {
            return false;
        }
        android.util.Log.i("FragmentManager", "Predictive back not available using Framework Transitions. Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    @Override // defpackage.ce
    public final boolean n(java.lang.Object obj) {
        if (!bo.Z(2)) {
            return false;
        }
        android.util.Log.v("FragmentManager", a.bg(obj, "Predictive back not available for framework transition ", ". Please switch to AndroidX Transition 1.5.0 or higher to enable seeking."));
        return false;
    }

    @Override // defpackage.ce
    public final java.lang.Object o(java.lang.Object obj, java.lang.Object obj2) {
        android.transition.TransitionSet transitionSet = new android.transition.TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((android.transition.Transition) obj);
        }
        transitionSet.addTransition((android.transition.Transition) obj2);
        return transitionSet;
    }

    @Override // defpackage.ce
    public final void p(java.lang.Object obj, java.lang.Object obj2, java.util.ArrayList arrayList, java.lang.Object obj3, java.util.ArrayList arrayList2) {
        ((android.transition.Transition) obj).addListener(new defpackage.ca(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.ce
    public final void q(java.lang.Object obj, defpackage.dxa dxaVar, java.lang.Runnable runnable) {
        ((android.transition.Transition) obj).addListener(new defpackage.cb(runnable));
    }

    @Override // defpackage.ce
    public final java.lang.Object r(java.lang.Object obj, java.lang.Object obj2) {
        android.transition.Transition transition = (android.transition.Transition) obj;
        android.transition.Transition transition2 = (android.transition.Transition) obj2;
        if (transition == null) {
            transition = null;
        }
        if (transition2 == null) {
            return transition;
        }
        android.transition.TransitionSet transitionSet = new android.transition.TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }
}
