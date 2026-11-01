package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vwz extends defpackage.vwp implements ahei, ahtq {
    private final ahda ak = new ahda((byte[]) null, (byte[]) null);
    private defpackage.vxq c;
    private android.content.Context d;
    private boolean e;

    public static defpackage.vwz s(defpackage.vyg vygVar) {
        defpackage.vwz vwzVar = new defpackage.vwz();
        amxr.g(vwzVar);
        ahgl.b(vwzVar, vygVar);
        return vwzVar;
    }

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.vxq vxqVarY = y();
            ahoq ahoqVarW = ahvr.W(1022, "VisualVoicemailFragmentPeer_onCreateView");
            try {
                defpackage.vul vulVar = vxqVarY.V;
                defpackage.vwz vwzVar = vxqVarY.d;
                ((ahfw) vwzVar).a.c(new defpackage.vuf(vulVar, new defpackage.vue(vulVar, vulVar.e, vulVar.g)));
                vxqVarY.Y.e(vwzVar);
                android.view.View viewInflate = layoutInflater.inflate(2131624705, viewGroup, false);
                android.support.v7.widget.RecyclerView recyclerViewFindViewById = viewInflate.findViewById(2131428773);
                recyclerViewFindViewById.aa(new android.support.v7.widget.LinearLayoutManager(1, false));
                recyclerViewFindViewById.Z((km) null);
                if (vxqVarY.y()) {
                    vxqVarY.l.d(recyclerViewFindViewById, ruc.l);
                } else {
                    vxqVarY.l.d(recyclerViewFindViewById, ruc.j);
                }
                defpackage.ahan ahanVar = vxqVarY.A;
                ahanVar.t(2);
                recyclerViewFindViewById.Y(ahanVar);
                layoutInflater.inflate(2131624707, (android.view.ViewGroup) viewInflate.findViewById(2131428536));
                android.view.View viewFindViewById = viewInflate.findViewById(2131428945);
                android.view.LayoutInflater.from(vxqVarY.g).inflate(2131623984, (android.view.ViewGroup) viewFindViewById);
                viewFindViewById.setOnClickListener(new defpackage.vxa(vxqVarY, 0));
                viewFindViewById.setVisibility(true != vxqVarY.z() ? 8 : 0);
                if (vxqVarY.e.c) {
                    j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(viewInflate.findViewById(2131429378));
                    if (true == optionalOfNullable.isPresent()) {
                        android.view.View view = (android.view.View) optionalOfNullable.get();
                        dtv layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof dtv) {
                            layoutParams.setMarginEnd(0);
                            view.requestLayout();
                        }
                    }
                }
                vxqVarY.p(viewInflate, vxqVarY.z());
                vxqVarY.T = new defpackage.vuk(vulVar, vwzVar.aL("android.permission.RECEIVE_SMS"));
                vxqVarY.ac.n(vxqVarY.T, vxqVarY.U);
                ahoqVarW.close();
                if (viewInflate == null) {
                    wsc.ap(this, y());
                }
                ahns.l();
                return viewInflate;
            } catch (java.lang.Throwable th) {
                try {
                    ahoqVarW.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @java.lang.Deprecated
    public final android.content.Context a() {
        if (this.d == null) {
            this.d = new ahgi(this, super.z());
        }
        return this.d;
    }

    public final void af(android.os.Bundle bundle) {
        this.b.j();
        try {
            aU(bundle);
            defpackage.vxq vxqVarY = y();
            ahoq ahoqVarW = ahvr.W(1021, "VisualVoicemailFragmentPeer_onActivityCreated");
            try {
                defpackage.vxq.a.b().l("com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer", "onActivityCreated", 1608, "VisualVoicemailFragmentPeer.java").v("enter");
                if (bundle != null) {
                    vxqVarY.N = bundle.getBoolean("KEY_SELECT_ALL_MODE", false);
                    if (bundle.containsKey("KEY_SELECTED_ROWS")) {
                        long[] longArray = bundle.getLongArray("KEY_SELECTED_ROWS");
                        java.util.Set set = vxqVarY.O;
                        set.clear();
                        for (long j : longArray) {
                            set.add(java.lang.Long.valueOf(j));
                        }
                    }
                    if (bundle.containsKey("KEY_PLAYER_STATE")) {
                        vxqVarY.M = j$.util.Optional.of(bundle.getString("KEY_PLAYER_STATE"));
                    }
                    if (bundle.containsKey("KEY_ACTION_BAR_EXPANDED_STATE")) {
                        vxqVarY.P.a = true;
                    }
                    if (bundle.containsKey("KEY_EXPANDED_ROW_ID")) {
                        vxqVarY.L = j$.util.Optional.of(new defpackage.vxo(bundle.getLong("KEY_EXPANDED_ROW_ID"), false));
                    }
                    if (bundle.containsKey("HIDDEN_ROWS")) {
                        long[] longArray2 = bundle.getLongArray("HIDDEN_ROWS");
                        int length = longArray2.length;
                        vxqVarY.K = new java.util.HashSet(length == 0 ? java.util.Collections.EMPTY_LIST : new aizl(longArray2, 0, length));
                    }
                    if (bundle.containsKey("KEY_POPUP_SHOWN")) {
                        java.util.Set set2 = vxqVarY.O;
                        if (!set2.isEmpty()) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.addAll(set2);
                            vxqVarY.q(arrayList);
                        }
                    }
                }
                vxqVarY.w();
                vxqVarY.v();
                ahoqVarW.close();
                ahns.l();
            } catch (java.lang.Throwable th) {
                try {
                    ahoqVarW.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.vwp
    public final void ah(android.app.Activity activity) {
        this.b.j();
        try {
            super.ah(activity);
            ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void ai() {
        ahpm ahpmVarE = this.b.e();
        try {
            aX();
            y().ab.i((java.lang.String) null).b(mce.eO);
            ahpmVarE.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarE.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void aj(boolean z) {
        defpackage.vxq vxqVarY = y();
        if (!z) {
            vxqVarY.n(vxqVarY.O);
            return;
        }
        j$.util.Optional optional = vxqVarY.J;
        if (true == optional.isPresent()) {
            ((android.view.ActionMode) optional.get()).finish();
        }
    }

    public final void al() {
        this.b.j();
        try {
            be();
            defpackage.vxq vxqVarY = y();
            ahoq ahoqVarW = ahvr.W(1025, "VisualVoicemailFragmentPeer_onPause");
            try {
                aimz aimzVar = defpackage.vxq.a;
                aimzVar.b().l("com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer", "onPause", 1685, "VisualVoicemailFragmentPeer.java").v("enter");
                if (!((android.app.KeyguardManager) vxqVarY.g.getSystemService(android.app.KeyguardManager.class)).inKeyguardRestrictedInputMode()) {
                    aimzVar.b().l("com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer", "onPause", 1693, "VisualVoicemailFragmentPeer.java").v("clearing all new voicemails");
                    vxqVarY.m.o(rmx.dW);
                    j$.util.Optional optionalG = vxqVarY.aa.g();
                    if (true == optionalG.isPresent()) {
                        vav vavVar = (vav) optionalG.get();
                        vavVar.g.h();
                        android.content.Context context = vavVar.b;
                        dva dvaVar = new dva(context, "phone_low_priority");
                        dvaVar.t = urg.c(context, 2130969018);
                        dvaVar.o = "VisualVoicemailGroup";
                        dvaVar.d(8, true);
                        dvaVar.d(16, true);
                        dvaVar.h(context.getString(2132019569));
                        dvaVar.n(2131232042);
                        optionalG = j$.util.Optional.ofNullable(dvaVar.a());
                    }
                    vxqVarY.k.h();
                    android.content.Context context2 = vxqVarY.b;
                    dva dvaVar2 = new dva(context2, "phone_low_priority");
                    dvaVar2.t = urg.c(context2, 2130969018);
                    dvaVar2.o = "VisualVoicemailGroup";
                    dvaVar2.d(8, true);
                    dvaVar2.d(16, true);
                    dvaVar2.h(context2.getString(2132019569));
                    dvaVar2.n(2131232042);
                    android.app.Notification notification = (android.app.Notification) optionalG.orElse(dvaVar2.a());
                    agsm agsmVar = vxqVarY.h;
                    ajcq ajcqVarC = vxqVarY.f.c();
                    agsmVar.j(ajcqVarC, notification);
                    agsm.i(1026, ajcqVarC, "failed to attach foreground service", new java.lang.Object[0]);
                }
                j$.util.Optional optional = vxqVarY.J;
                if (true == optional.isPresent()) {
                    ((android.view.ActionMode) optional.get()).finish();
                }
                ahoqVarW.close();
                ahns.l();
            } catch (java.lang.Throwable th) {
                try {
                    ahoqVarW.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void an() {
        ahpm ahpmVarE = this.b.e();
        try {
            bf();
            defpackage.vxq vxqVarY = y();
            ahoq ahoqVarW = ahvr.W(1029, "VisualVoicemailFragmentPeer_onResume");
            try {
                rlv rlvVar = vxqVarY.m;
                rlvVar.n(rmw.ae);
                if (!vxqVarY.d.aH()) {
                    vxqVarY.n(vxqVarY.O);
                }
                if (vxqVarY.H) {
                    rlvVar.o(rmx.sE);
                    vxqVarY.o(new defpackage.vet(vxqVarY, 9));
                }
                vxqVarY.H = true;
                ahoqVarW.close();
                ahpmVarE.close();
            } catch (java.lang.Throwable th) {
                try {
                    ahoqVarW.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            try {
                ahpmVarE.close();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void ao(android.view.View view, android.os.Bundle bundle) {
        this.b.j();
        try {
            ahvr.x(this).a = view;
            y();
            wsc.ap(this, y());
            aooh.f(view, "view");
            defpackage.vxq vxqVarY = y();
            vxqVarY.ad.B(vxqVarY.d);
            ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void au(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = ((aw) this).m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        ahvr.bZ(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.au(bundle);
    }

    public final android.view.LayoutInflater e(android.os.Bundle bundle) {
        this.b.j();
        try {
            android.view.LayoutInflater layoutInflaterAM = aM();
            android.view.LayoutInflater layoutInflaterCloneInContext = layoutInflaterAM.cloneInContext(new amyf(layoutInflaterAM, this));
            android.view.LayoutInflater layoutInflaterCloneInContext2 = layoutInflaterCloneInContext.cloneInContext(new ahgi(this, layoutInflaterCloneInContext));
            ahns.l();
            return layoutInflaterCloneInContext2;
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final defpackage.ahtm f(ahth ahthVar) {
        return this.ak.j(ahthVar);
    }

    @Override // defpackage.vwp
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                vxr vxrVar = (vxr) agab.aC(this, vxr.class);
                ahoq ahoqVarY = ahvr.Y(1017, defpackage.vwz.class, "CreatePeer");
                try {
                    this.c = vxrVar.cJ();
                    ahoqVarY.close();
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarY.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            ahns.l();
        } catch (java.lang.Throwable th3) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void h(android.os.Bundle bundle) {
        this.b.j();
        try {
            aW(bundle);
            defpackage.vxq vxqVarY = y();
            agtj agtjVar = vxqVarY.i;
            agtjVar.h(vxqVarY.q);
            agtjVar.h(vxqVarY.r);
            agtjVar.h(vxqVarY.t);
            agtjVar.h(vxqVarY.u);
            agtjVar.h(vxqVarY.v);
            agtjVar.h(vxqVarY.w);
            agtjVar.h(vxqVarY.s);
            ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void i() {
        ahpm ahpmVarE = this.b.e();
        try {
            bc();
            if (((aw) this).Q == null) {
                this.ak.l();
            }
            ahpmVarE.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarE.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void j() {
        ahpm ahpmVarD = this.b.d();
        try {
            bd();
            this.e = true;
            ahpmVarD.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarD.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void k(android.os.Bundle bundle) {
        this.b.j();
        try {
            defpackage.vxq vxqVarY = y();
            java.util.Set set = vxqVarY.O;
            if (!set.isEmpty()) {
                bundle.putLongArray("KEY_SELECTED_ROWS", j$.util.Collection.-EL.stream(set).mapToLong(new fhk(7)).toArray());
            }
            bundle.putBoolean("KEY_SELECT_ALL_MODE", vxqVarY.N);
            j$.util.Optional optional = vxqVarY.M;
            defpackage.vxc vxcVar = new defpackage.vxc(bundle, 4);
            if (true == optional.isPresent()) {
                ((android.os.Bundle) vxcVar.a).putString("KEY_PLAYER_STATE", (java.lang.String) optional.get());
            }
            if (vxqVarY.P.a) {
                bundle.putBoolean("KEY_ACTION_BAR_EXPANDED_STATE", true);
            }
            j$.util.Optional optional2 = vxqVarY.L;
            defpackage.vxc vxcVar2 = new defpackage.vxc(bundle, 5);
            if (true == optional2.isPresent()) {
                java.lang.Object obj = optional2.get();
                ((android.os.Bundle) vxcVar2.a).putLong("KEY_EXPANDED_ROW_ID", ((defpackage.vxo) obj).a);
            }
            if (vxqVarY.I) {
                bundle.putBoolean("KEY_POPUP_SHOWN", true);
            }
            java.lang.Object[] array = vxqVarY.K.toArray();
            int length = array.length;
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                java.lang.Object obj2 = array[i];
                ahvr.ci(obj2);
                jArr[i] = ((java.lang.Number) obj2).longValue();
            }
            bundle.putLongArray("HIDDEN_ROWS", jArr);
            ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void m() {
        this.b.j();
        try {
            bh();
            defpackage.vxq vxqVarY = y();
            if (!vxqVarY.g.isChangingConfigurations()) {
                vxqVarY.ab.i((java.lang.String) null).b(mce.eN);
            }
            ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vwp
    protected final /* synthetic */ amxr p() {
        return new ahgl(this);
    }

    public final void q(java.lang.Class cls, ahtl ahtlVar) {
        this.ak.k(cls, ahtlVar);
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final defpackage.vxq y() {
        defpackage.vxq vxqVar = this.c;
        if (vxqVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return vxqVar;
    }

    @Override // defpackage.vwp
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
