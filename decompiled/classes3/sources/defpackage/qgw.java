package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qgw extends defpackage.qgt implements ahei, ahtq {
    private final ahda ak = new ahda((byte[]) null, (byte[]) null);
    private defpackage.qhj c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            final defpackage.qhj qhjVarY = y();
            qhjVarY.p.g(2131428820, qhjVarY.O.aa(defpackage.qhi.class, new defpackage.qam(3)), qhjVarY.q.a(qhjVarY.H));
            android.view.View viewInflate = layoutInflater.inflate(2131624240, viewGroup, false);
            viewInflate.setBackgroundColor(urg.c(viewInflate.getContext(), android.R.attr.colorBackground));
            viewInflate.findViewById(2131428839).setOnClickListener(new nti(qhjVarY, 19));
            qhjVarY.w = j$.util.Optional.of(qhjVarY.L.g(viewInflate.findViewById(2131428848)));
            defpackage.qgw qgwVar = qhjVarY.l;
            qhjVarY.m = new defpackage.qhv(qgwVar, viewInflate, qhjVarY.M, ((java.lang.Boolean) qhjVarY.t.a()).booleanValue());
            if (bundle != null) {
                qhjVarY.m.c(bundle.getBoolean("overflow_emergency_call", false));
            }
            viewInflate.findViewById(2131428846).setOnClickListener(new nti(qhjVarY, 20));
            android.view.View viewFindViewById = viewInflate.findViewById(2131428825);
            viewFindViewById.setOnClickListener(new defpackage.qht(qhjVarY, 1));
            viewFindViewById.setEnabled(false);
            final android.widget.EditText editText = (android.widget.EditText) viewInflate.findViewById(2131428821);
            editText.setOnEditorActionListener(qhjVarY);
            if (bundle != null && bundle.containsKey("input_messages")) {
                editText.setText(bundle.getString("input_messages"));
                editText.setSelection(editText.getText().length());
            }
            editText.addTextChangedListener(qhjVarY);
            editText.setOnKeyListener(new android.view.View.OnKeyListener() { // from class: qhb
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(android.view.View view, int i, android.view.KeyEvent keyEvent) {
                    j$.util.Optional optionalF = qhjVarY.f();
                    if (i != 67 || keyEvent.getAction() != 0 || !android.text.TextUtils.isEmpty(editText.getText()) || !optionalF.isPresent()) {
                        return false;
                    }
                    defpackage.qfj qfjVar = (defpackage.qfj) optionalF.orElseThrow();
                    zpz zpzVar = qfjVar.o;
                    defpackage.qfd qfdVar = qfjVar.d;
                    zpzVar.a(ahrv.g(ahrv.g(qfdVar.d.a()).h(new defpackage.pqn(8), ajbm.a)).i(new defpackage.qfc(qfdVar, 3), qfdVar.c));
                    return true;
                }
            });
            boolean z = qgwVar.dX().getBoolean(2131034122);
            boolean z2 = android.text.TextUtils.getLayoutDirectionFromLocale(java.util.Locale.getDefault()) == 1;
            if (z) {
                qhjVarY.B = android.view.animation.AnimationUtils.loadAnimation(qgwVar.z(), z2 ? 2130772002 : 2130772003);
                qhjVarY.C = android.view.animation.AnimationUtils.loadAnimation(qgwVar.z(), true != z2 ? 2130772006 : 2130772005);
            } else {
                qhjVarY.B = android.view.animation.AnimationUtils.loadAnimation(qgwVar.z(), 2130772001);
                qhjVarY.C = android.view.animation.AnimationUtils.loadAnimation(qgwVar.z(), 2130772004);
            }
            qhjVarY.B.setInterpolator(hrm.a);
            qhjVarY.C.setInterpolator(hrm.b);
            viewInflate.findViewById(2131428849).setTextAlignment(5);
            ahpr ahprVar = new ahpr(qhjVarY.r, 607, "rtt_chat_fragment_apply_window_insets_compat", new ebx(viewInflate, 5));
            int i = dzs.a;
            dzk.o(viewInflate, ahprVar);
            if (viewInflate == null) {
                pez.w(this, y());
            }
            ahns.l();
            return viewInflate;
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @java.lang.Deprecated
    public final android.content.Context a() {
        if (this.d == null) {
            this.d = new ahgi(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.qgt
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

    public final void ao(android.view.View view, android.os.Bundle bundle) {
        this.b.j();
        try {
            ahvr.x(this).a = view;
            y();
            pez.w(this, y());
            aooh.f(view, "view");
            defpackage.qhj qhjVarY = y();
            view.addOnAttachStateChangeListener(new gk(view, 3));
            defpackage.qgw qgwVar = qhjVarY.l;
            android.support.v7.widget.RecyclerView recyclerViewFindViewById = ((aw) qgwVar).Q.findViewById(2131428847);
            amcn amcnVar = new amcn();
            amcnVar.d = new defpackage.qgx(qhjVarY, 0);
            qhjVarY.b = amcnVar.m();
            recyclerViewFindViewById.Y(qhjVarY.b);
            qgwVar.G();
            android.support.v7.widget.LinearLayoutManager linearLayoutManager = new android.support.v7.widget.LinearLayoutManager(1, false);
            linearLayoutManager.t(true);
            recyclerViewFindViewById.r = false;
            recyclerViewFindViewById.aa(linearLayoutManager);
            recyclerViewFindViewById.au(new defpackage.qhg(qhjVarY));
            view.setFocusableInTouchMode(true);
            qgwVar.H().fc().d(qgwVar, qhjVarY.G);
            if (qgwVar.I().e("tag_on_hold_fragment") == null) {
                u uVar = new u(qgwVar.I());
                uVar.e(2131428845, defpackage.qcd.q(), "tag_on_hold_fragment", 1);
                uVar.c();
            }
            if (bundle != null) {
                view.getViewTreeObserver().addOnWindowFocusChangeListener(new defpackage.qhf(qhjVarY, bundle));
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

    @Override // defpackage.qgt
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                qhk qhkVar = (qhk) agab.aC(this, qhk.class);
                ahoq ahoqVarY = ahvr.Y(605, defpackage.qgw.class, "CreatePeer");
                try {
                    this.c = qhkVar.bh();
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
            defpackage.qhj qhjVarY = y();
            qhjVarY.g.h(qhjVarY.I);
            qhjVarY.u = qhjVarY.l.O(new pa(), new kse(qhjVarY, 5));
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
            defpackage.qhj qhjVarY = y();
            if (qhjVarY.n()) {
                qhjVarY.m.dismiss();
            }
            if (qhjVarY.m()) {
                qhjVarY.n.dismiss();
            }
            qhjVarY.D.ifPresent(new defpackage.qgy(qhjVarY, 0));
            if (((java.lang.Boolean) qhjVarY.s.a()).booleanValue()) {
                qhjVarY.c().removeTextChangedListener(qhjVarY);
            }
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
            defpackage.qhj qhjVarY = y();
            bundle.putString("input_messages", qhjVarY.c().getText().toString());
            bundle.putBoolean("overflow_showed", qhjVarY.n());
            bundle.putBoolean("audio_select_showed", qhjVarY.m());
            bundle.putBoolean("overflow_emergency_call", qhjVarY.m.m);
            j$.util.Optional optionalOfNullable = qhjVarY.v;
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.qfz) optionalOfNullable.get()).n));
            }
            bundle.putBoolean("is_add_call_enabled", ((java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE)).booleanValue());
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

    public final void l() {
        this.b.j();
        try {
            bg();
            defpackage.qhj qhjVarY = y();
            if (qhjVarY.v.isPresent()) {
                j$.util.Optional optionalF = qhjVarY.f();
                if (true == optionalF.isPresent()) {
                    ((defpackage.qfj) optionalF.get()).c();
                }
            } else {
                defpackage.qhj.a.b().l("com/android/dialer/incall/rtt/ui/RttChatFragmentPeer", "onStart", 875, "RttChatFragmentPeer.java").v("Could not activate message watcher in onStart. Model not available.");
            }
            qhjVarY.y = true;
            qhjVarY.M.i((java.lang.String) null).b(mce.eI);
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
            defpackage.qhj qhjVarY = y();
            if (qhjVarY.v.isPresent()) {
                j$.util.Optional optionalF = qhjVarY.f();
                if (true == optionalF.isPresent()) {
                    defpackage.qfj qfjVar = (defpackage.qfj) optionalF.get();
                    qfjVar.d();
                    qfjVar.a();
                }
            } else {
                defpackage.qhj.a.b().l("com/android/dialer/incall/rtt/ui/RttChatFragmentPeer", "onStop", 897, "RttChatFragmentPeer.java").v("Could not deactivate message watcher in onStop. Model not available.");
            }
            qhjVarY.y = false;
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

    @Override // defpackage.qgt
    protected final /* synthetic */ amxr p() {
        return new ahgl(this);
    }

    public final void q(java.lang.Class cls, ahtl ahtlVar) {
        this.ak.k(cls, ahtlVar);
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final defpackage.qhj y() {
        defpackage.qhj qhjVar = this.c;
        if (qhjVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return qhjVar;
    }

    @Override // defpackage.qgt
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
