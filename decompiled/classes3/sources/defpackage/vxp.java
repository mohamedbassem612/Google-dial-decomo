package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class vxp implements android.view.ActionMode.Callback {
    public boolean a;
    final /* synthetic */ defpackage.vxq b;

    public vxp(defpackage.vxq vxqVar) {
        j$.util.Objects.requireNonNull(vxqVar);
        this.b = vxqVar;
        this.a = false;
    }

    private final void a(int i) {
        defpackage.vxq vxqVar = this.b;
        if (!vxqVar.y()) {
            ((android.view.ViewGroup.MarginLayoutParams) vxqVar.g.findViewById(2131429466).getLayoutParams()).topMargin = i;
            return;
        }
        androidx.constraintlayout.widget.Guideline guidelineFindViewById = vxqVar.g.findViewById(2131428447);
        dtv layoutParams = guidelineFindViewById.getLayoutParams();
        if (guidelineFindViewById.a && layoutParams.a == i) {
            return;
        }
        layoutParams.a = i;
        guidelineFindViewById.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(android.view.ActionMode actionMode, android.view.MenuItem menuItem) {
        defpackage.vxq vxqVar = this.b;
        ahok ahokVarF = vxqVar.j.f(1019, "VisualVoicemailFragmentPeer_onActionItemClicked");
        try {
            boolean z = true;
            if (menuItem.getItemId() == 2131427402) {
                rlv rlvVar = vxqVar.m;
                rlvVar.n(rmw.eG);
                java.util.Set set = vxqVar.O;
                if (!set.isEmpty()) {
                    vxqVar.l(mce.dY);
                    akzx akzxVarM = defpackage.vwf.a.m();
                    akzxVarM.u();
                    defpackage.vwf vwfVar = (defpackage.vwf) akzxVarM.b;
                    alan alanVar = vwfVar.b;
                    if (!alanVar.c()) {
                        vwfVar.b = alad.I(alanVar);
                    }
                    akyl.i(set, vwfVar.b);
                    defpackage.vwf vwfVar2 = (defpackage.vwf) akzxVarM.p();
                    defpackage.vwe vweVar = new defpackage.vwe();
                    amxr.g(vweVar);
                    ahgl.b(vweVar, vwfVar2);
                    vweVar.r(vxqVar.d.I(), "delete_selected_items_dialog");
                    rlvVar.n(rmw.eH);
                }
            } else if (menuItem.getItemId() == 2131427404) {
                boolean z2 = vxqVar.N;
                vxqVar.N = !z2;
                if (z2) {
                    vxqVar.m.n(rmw.eF);
                    vxqVar.O.clear();
                    vxqVar.s();
                } else {
                    vxqVar.m.n(rmw.eE);
                    java.util.Set set2 = vxqVar.O;
                    set2.clear();
                    j$.util.stream.Stream map = j$.util.Collection.-EL.stream(vxqVar.D).map(new defpackage.vun(7));
                    j$.util.Objects.requireNonNull(set2);
                    map.forEach(new defpackage.vel(set2, 11));
                    vxqVar.s();
                }
                vxqVar.w();
            } else if (menuItem.getItemId() != 2131427400) {
                z = false;
            } else if (!vxqVar.O.isEmpty()) {
                vxqVar.m.n(rmw.bl);
                agtj agtjVar = vxqVar.i;
                defpackage.voc vocVar = vxqVar.Z;
                agtjVar.i(new defpackage.zoe((java.lang.Object) ahvr.H(((afhf) vocVar.b).c(), new vrx(8), (java.util.concurrent.Executor) vocVar.a)), vxqVar.t);
            }
            ahokVarF.close();
            return z;
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        this.b.J = j$.util.Optional.of(actionMode);
        actionMode.getMenuInflater().inflate(2131755008, menu);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(android.view.ActionMode actionMode) {
        defpackage.vxq vxqVar = this.b;
        vxqVar.J = j$.util.Optional.empty();
        defpackage.vwz vwzVar = vxqVar.d;
        if (((ahfw) vwzVar).a.d.a(emq.e) && vwzVar.aK()) {
            az azVar = vxqVar.g;
            if (azVar.isChangingConfigurations()) {
                return;
            }
            vxqVar.O.clear();
            vxqVar.N = false;
            vxqVar.w();
            vxqVar.h.g(vxqVar.p.a(true), 5L, java.util.concurrent.TimeUnit.SECONDS);
            this.a = false;
            a(azVar.getResources().getDimensionPixelSize(2131165768));
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        defpackage.vxq vxqVar = this.b;
        vxqVar.h.g(vxqVar.p.a(false), 5L, java.util.concurrent.TimeUnit.SECONDS);
        a(0);
        this.a = true;
        if (!vxqVar.z() || vxqVar.S) {
            return false;
        }
        menu.findItem(2131427400).setVisible(true);
        return true;
    }
}
