package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mla extends defpackage.mks implements ahei {
    private defpackage.mli c;
    private android.content.Context d;
    private boolean e;

    public static defpackage.mla q() {
        defpackage.mla mlaVar = new defpackage.mla();
        amxr.g(mlaVar);
        return mlaVar;
    }

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.mli mliVarY = y();
            defpackage.mli.a.b().l("com/android/dialer/dialpadview/ui/PreCallDialpadFragmentPeer", "onCreateView", 279, "PreCallDialpadFragmentPeer.java").v("enter");
            mliVarY.t = j$.util.Optional.empty();
            android.view.View viewInflate = layoutInflater.inflate(2131624153, viewGroup, false);
            defpackage.mla mlaVar = mliVarY.g;
            if (mlaVar.dX().getBoolean(2131034169)) {
                android.content.Context contextZ = mlaVar.z();
                int i = com.android.dialer.dialpadview.DialpadView.f;
                viewInflate.setBackgroundColor(urg.c(contextZ, 2130969107));
            }
            viewInflate.buildLayer();
            defpackage.mkw mkwVar = mliVarY.i;
            ailj ailjVarK = defpackage.mkw.a.e().k();
            while (ailjVarK.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) ailjVarK.next();
                int iIntValue = ((java.lang.Integer) entry.getKey()).intValue();
                defpackage.miv mivVar = (defpackage.miv) entry.getValue();
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButtonFindViewById = viewInflate.findViewById(iIntValue);
                if (mivVar == defpackage.miv.VOICE_BUTTON || mivVar == defpackage.miv.RTT_VOICE_BUTTON || mivVar == defpackage.miv.WAIT_TIME_VOICE_BUTTON) {
                    extendedFloatingActionButtonFindViewById.m(mkwVar.f.G().getDrawable(2131231340));
                }
                aguv aguvVar = new aguv((byte[]) null);
                aguvVar.l(agal.a);
                extendedFloatingActionButtonFindViewById.q(new agal(aguvVar));
                mkwVar.c.put(mivVar, extendedFloatingActionButtonFindViewById);
                if (defpackage.mkw.b.contains(mivVar)) {
                    ahvr.cc((((com.google.android.material.button.MaterialButton) extendedFloatingActionButtonFindViewById).c == null || extendedFloatingActionButtonFindViewById.getContentDescription() == null) ? false : true, "no default icon and content description provided for button type %s ", mivVar.name());
                    java.util.Map map = mkwVar.e;
                    android.graphics.drawable.Drawable drawable = ((com.google.android.material.button.MaterialButton) extendedFloatingActionButtonFindViewById).c;
                    if (drawable == null) {
                        throw new java.lang.NullPointerException("Null icon");
                    }
                    java.lang.String string = extendedFloatingActionButtonFindViewById.getContentDescription().toString();
                    if (string == null) {
                        throw new java.lang.NullPointerException("Null contentDescription");
                    }
                    map.put(mivVar, new defpackage.mkv(drawable, string));
                }
                extendedFloatingActionButtonFindViewById.setOnClickListener(new defpackage.lde(mkwVar, 17));
            }
            final defpackage.mlm mlmVar = mliVarY.h;
            aooh.f(viewInflate, "fragmentView");
            android.view.View viewFindViewById = viewInflate.findViewById(2131427997);
            aooh.e(viewFindViewById, "findViewById(...)");
            mlmVar.m = (com.android.dialer.dialpadview.DialpadView) viewFindViewById;
            com.android.dialer.dialpadview.DialpadView dialpadView = mlmVar.m;
            if (dialpadView == null) {
                aooh.j("dialpadView");
                dialpadView = null;
            }
            android.widget.EditText editText = dialpadView.b;
            aooh.e(editText, "getDigits(...)");
            mlmVar.k = editText;
            android.widget.EditText editText2 = mlmVar.k;
            if (editText2 == null) {
                aooh.j("digits");
                editText2 = null;
            }
            editText2.setCursorVisible(false);
            android.widget.EditText editText3 = mlmVar.k;
            if (editText3 == null) {
                aooh.j("digits");
                editText3 = null;
            }
            editText3.setKeyListener(defpackage.mjg.a);
            android.widget.EditText editText4 = mlmVar.k;
            if (editText4 == null) {
                aooh.j("digits");
                editText4 = null;
            }
            editText4.setOnClickListener(new defpackage.lde(mlmVar, 18));
            android.widget.EditText editText5 = mlmVar.k;
            if (editText5 == null) {
                aooh.j("digits");
                editText5 = null;
            }
            editText5.setOnLongClickListener(new defpackage.lmf(mlmVar, 2));
            mlmVar.l = rlt.a(mlmVar.c.z(), (android.telecom.PhoneAccountHandle) null);
            android.view.View viewFindViewById2 = viewInflate.findViewById(2131428622);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setOnLongClickListener(new defpackage.lmf(mlmVar, 3));
                java.util.Iterator it = defpackage.mlm.b.keySet().iterator();
                while (it.hasNext()) {
                    defpackage.mir.a(viewInflate.findViewById(((java.lang.Number) it.next()).intValue()), new miq() { // from class: mlk
                        public final void a(android.view.View view, boolean z) {
                            defpackage.mlm mlmVar2 = mlmVar;
                            if (!z) {
                                java.util.Set set = mlmVar2.o;
                                set.remove(view);
                                if (set.isEmpty()) {
                                    agsm.i(366, mlmVar2.d.b(), "fail to stop the tone of a dialpad key", new java.lang.Object[0]);
                                    return;
                                }
                                return;
                            }
                            defpackage.mll mllVar = (defpackage.mll) defpackage.mlm.b.get(java.lang.Integer.valueOf(view.getId()));
                            if (mllVar != null) {
                                mlmVar2.b(mllVar.a);
                                view.performHapticFeedback(1);
                                agsm.i(367, mlmVar2.d.a(mllVar.b, -1), "fail to play the tone of a dialpad key", new java.lang.Object[0]);
                                mlmVar2.o.add(view);
                            }
                        }
                    });
                }
            }
            int i2 = dzs.a;
            java.lang.Object objB = dzo.b(viewInflate, 2131429546);
            aooh.e(objB, "requireViewById(...)");
            int i3 = 4;
            ((android.view.View) objB).setOnLongClickListener(new defpackage.lmf(mlmVar, i3));
            com.android.dialer.dialpadview.DialpadView dialpadView2 = mlmVar.m;
            if (dialpadView2 == null) {
                aooh.j("dialpadView");
                dialpadView2 = null;
            }
            android.widget.ImageButton imageButton = dialpadView2.c;
            int i4 = 5;
            if (imageButton != null) {
                imageButton.setOnClickListener(new defpackage.lde(mlmVar, 19));
                imageButton.setOnLongClickListener(new defpackage.lmf(mlmVar, i4));
            }
            defpackage.mlp mlpVar = mliVarY.j;
            mlpVar.b = ((com.android.dialer.dialpadview.DialpadView) viewInflate.findViewById(2131427997)).d;
            defpackage.mlo mloVar = new defpackage.mlo(mlpVar, mlpVar.e.G(), mlpVar.b);
            new fe(mloVar.a).inflate(2131755015, mloVar.b);
            mloVar.g = new rai(mlpVar);
            mloVar.f = new rai(mlpVar);
            mlpVar.c = mloVar;
            android.view.View view = mlpVar.b;
            defpackage.kf kfVar = mlpVar.c;
            if (kfVar.e == null) {
                kfVar.e = new defpackage.ke(kfVar, kfVar.c);
            }
            view.setOnTouchListener(kfVar.e);
            mlpVar.b.setOnClickListener(new defpackage.lde(mlpVar, 20));
            mlpVar.d = false;
            ajwr ajwrVar = mliVarY.A;
            defpackage.mjm mjmVar = mliVarY.l;
            ajwrVar.n(new agxo(mjmVar.h, new defpackage.kvx(mjmVar, i3), defpackage.mjm.a), mliVarY.v);
            if (((java.lang.Boolean) mliVarY.p.a()).booleanValue()) {
                aozh aozhVar = mliVarY.r.b;
                defpackage.ahhb ahhbVar = mliVarY.s;
                defpackage.lvd lvdVar = new defpackage.lvd(mliVarY, i4);
                aooh.f(ahhbVar, "streamMixin");
                afsq.T(ahhbVar.a(aozhVar), new defpackage.lvd(lvdVar, 7));
            }
            mliVarY.c(viewInflate, mce.w);
            android.view.View viewFindViewById3 = viewInflate.findViewById(2131427997);
            ahbv ahbvVar = mliVarY.B;
            aguv aguvVar2 = new aguv((byte[]) null);
            aguvVar2.i(ahbvVar.y());
            aguvVar2.j(ahbvVar.y());
            agaf agafVar = new agaf(new agal(aguvVar2));
            agafVar.R(android.content.res.ColorStateList.valueOf(urg.c((android.content.Context) ahbvVar.a, 2130969108)));
            viewFindViewById3.setBackground(agafVar);
            viewFindViewById3.setElevation(0.0f);
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

    @Override // defpackage.mks
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
            defpackage.mli mliVarY = y();
            defpackage.mli.a.b().l("com/android/dialer/dialpadview/ui/PreCallDialpadFragmentPeer", "onDestroy", 489, "PreCallDialpadFragmentPeer.java").v("enter");
            defpackage.mkt mktVar = mliVarY.k;
            if (mktVar.a.isPresent()) {
                defpackage.mjo mjoVar = (defpackage.mjo) mktVar.a.orElseThrow();
                mjoVar.a();
                mjoVar.c = null;
                mktVar.a = j$.util.Optional.empty();
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

    public final void aj(boolean z) {
        defpackage.mli mliVarY = y();
        if (!z) {
            ahvr.i(new defpackage.mkq(), mliVarY.g);
            mliVarY.l.c();
        }
        if (((java.lang.Boolean) mliVarY.p.a()).booleanValue()) {
            mliVarY.r.c(!z);
            if (z && mliVarY.u != null && mliVarY.t.isPresent()) {
                defpackage.mjr mjrVar = mliVarY.u;
                mliVarY.g(mjrVar, mjrVar.c);
            }
        }
    }

    public final void al() {
        this.b.j();
        try {
            be();
            defpackage.mli mliVarY = y();
            defpackage.mli.a.b().l("com/android/dialer/dialpadview/ui/PreCallDialpadFragmentPeer", "onPause", 466, "PreCallDialpadFragmentPeer.java").v("enter");
            defpackage.mlm mlmVar = mliVarY.h;
            agsm.i(371, mlmVar.d.b(), "fail to stop tone controller", new java.lang.Object[0]);
            mlmVar.o.clear();
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

    public final void an() {
        ahpm ahpmVarE = this.b.e();
        try {
            bf();
            defpackage.mli mliVarY = y();
            defpackage.mli.a.b().l("com/android/dialer/dialpadview/ui/PreCallDialpadFragmentPeer", "onResume", 414, "PreCallDialpadFragmentPeer.java").v("enter");
            defpackage.mjk mjkVar = mliVarY.n;
            agsm.i(362, mjkVar.h.g(new defpackage.lgc(mjkVar, 15), mjkVar.e), "fail to check and enable dtmf tone", new java.lang.Object[0]);
            if (((java.lang.Boolean) mliVarY.p.a()).booleanValue()) {
                mliVarY.r.b(true);
            }
            java.lang.String strA = mliVarY.h.a();
            mliVarY.e(strA);
            if (mliVarY.d) {
                ((aw) mliVarY.g).Q.getViewTreeObserver().addOnWindowFocusChangeListener(new agfg(mliVarY, 1));
            }
            if (!mliVarY.c) {
                ahvr.i(new defpackage.mkp(strA), mliVarY.g);
            }
            if (mliVarY.c) {
                mliVarY.c(((aw) mliVarY.g).Q, mce.x);
                mliVarY.c = false;
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

    @Override // defpackage.mks
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.mks
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                mlj mljVar = (mlj) agab.aC(this, mlj.class);
                ahoq ahoqVarY = ahvr.Y(360, defpackage.mla.class, "CreatePeer");
                try {
                    this.c = mljVar.aq();
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
            defpackage.mli mliVar = this.c;
            defpackage.mli.a.b().l("com/android/dialer/dialpadview/ui/PreCallDialpadFragmentPeer", "onAttach", 255, "PreCallDialpadFragmentPeer.java").v("enter");
            defpackage.mkt mktVar = mliVar.k;
            mktVar.c = android.text.TextUtils.getLayoutDirectionFromLocale(java.util.Locale.getDefault()) == 1;
            mktVar.d = mktVar.e.dX().getBoolean(2131034122);
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
            defpackage.mli mliVarY = y();
            defpackage.mli.a.b().l("com/android/dialer/dialpadview/ui/PreCallDialpadFragmentPeer", "onCreate", 261, "PreCallDialpadFragmentPeer.java").v("enter");
            agtj agtjVar = mliVarY.o;
            agtjVar.h(mliVarY.w);
            agtjVar.h(mliVarY.x);
            defpackage.mkt mktVar = mliVarY.k;
            mktVar.b = wsc.bp(mktVar.e.z(), urp.h);
            mliVarY.c = bundle == null;
            if (bundle != null) {
                mliVarY.b = bundle.getBoolean("pref_is_dialpad_slide_out");
                mliVarY.f = bundle.getBoolean("pref_digits_filled_by_intent");
                mliVarY.d = bundle.getBoolean("pref_is_overflow_menu_showing", false);
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
            defpackage.mli mliVarY = y();
            bundle.putBoolean("pref_is_dialpad_slide_out", mliVarY.b);
            bundle.putBoolean("pref_digits_filled_by_intent", mliVarY.f);
            defpackage.mlp mlpVar = mliVarY.j;
            boolean z = false;
            if (mlpVar != null && mlpVar.d) {
                z = true;
            }
            bundle.putBoolean("pref_is_overflow_menu_showing", z);
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
        android.text.TextWatcher textWatcherE;
        this.b.j();
        try {
            bg();
            defpackage.mli mliVarY = y();
            defpackage.mli.a.b().l("com/android/dialer/dialpadview/ui/PreCallDialpadFragmentPeer", "onStart", 398, "PreCallDialpadFragmentPeer.java").v("enter");
            defpackage.mjk mjkVar = mliVarY.n;
            agsm.i(363, mjkVar.h.g(new defpackage.lgc(mjkVar, 13), mjkVar.f), "fail to init tone controller", new java.lang.Object[0]);
            defpackage.mlm mlmVar = mliVarY.h;
            if (mlmVar.n == null) {
                android.widget.EditText editText = null;
                if (mlmVar.q.aD()) {
                    textWatcherE = mlmVar.f.e(370, mlmVar.g, "text changed without formatting");
                } else {
                    java.lang.String str = mlmVar.l;
                    if (str == null) {
                        throw new java.lang.IllegalStateException("Required value was null.");
                    }
                    if (ahvr.r(str, "AR")) {
                        apni apniVar = mlmVar.p;
                        aimz aimzVar = zih.a;
                        apniVar.i(aoov.al(mlmVar.i, zih.b.plus(aols.a), 1, new defpackage.loe((aoln) null, mlmVar, 8)));
                        textWatcherE = mlmVar.f.e(369, mlmVar.h, "text changed with AR formatting");
                    } else {
                        apni apniVar2 = mlmVar.p;
                        aimz aimzVar2 = zih.a;
                        apniVar2.i(aoov.al(mlmVar.i, zih.b.plus(aols.a), 1, new defpackage.loe((aoln) null, mlmVar, 9, (byte[]) null)));
                        textWatcherE = mlmVar.f.e(368, mlmVar.g, "text changed with formatting");
                    }
                }
                mlmVar.n = textWatcherE;
                android.widget.EditText editText2 = mlmVar.k;
                if (editText2 == null) {
                    aooh.j("digits");
                } else {
                    editText = editText2;
                }
                android.text.TextWatcher textWatcher = mlmVar.n;
                if (textWatcher == null) {
                    throw new java.lang.IllegalStateException("Required value was null.");
                }
                editText.addTextChangedListener(textWatcher);
            }
            if (((java.lang.Boolean) mliVarY.p.a()).booleanValue()) {
                defpackage.mkj mkjVar = mliVarY.r;
                mkjVar.b(true);
                mkjVar.c(!mliVarY.g.aH());
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

    public final void m() {
        this.b.j();
        try {
            bh();
            defpackage.mli mliVarY = y();
            defpackage.mli.a.b().l("com/android/dialer/dialpadview/ui/PreCallDialpadFragmentPeer", "onStop", 472, "PreCallDialpadFragmentPeer.java").v("enter");
            defpackage.mjk mjkVar = mliVarY.n;
            agsm.i(364, mjkVar.h.g(new defpackage.lgc(mjkVar, 16), mjkVar.e), "fail to release tone generator in controller", new java.lang.Object[0]);
            defpackage.mlm mlmVar = mliVarY.h;
            if (mlmVar.n != null) {
                android.widget.EditText editText = mlmVar.k;
                if (editText == null) {
                    aooh.j("digits");
                    editText = null;
                }
                editText.removeTextChangedListener(mlmVar.n);
                mlmVar.n = null;
            }
            if (((java.lang.Boolean) mliVarY.p.a()).booleanValue() && !mliVarY.g.H().isChangingConfigurations()) {
                mliVarY.r.b(false);
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

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final defpackage.mli y() {
        defpackage.mli mliVar = this.c;
        if (mliVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return mliVar;
    }

    @Override // defpackage.mks
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
