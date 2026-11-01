package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jci extends defpackage.jcs implements ahei, aheg, ahgg, ahph, ahtq {
    private boolean ak;
    private defpackage.jcp c;
    private android.content.Context d;
    private final emy e = new emy(this, true);
    private final ajwa al = new ajwa(this);
    private final ahda am = new ahda((byte[]) null, (byte[]) null);

    @java.lang.Deprecated
    public jci() {
        afec.c();
    }

    @Override // defpackage.ger
    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.al.j();
        try {
            android.view.View viewM = super.M(layoutInflater, viewGroup, bundle);
            if (viewM == null) {
                defpackage.hhe.e(this, y());
            }
            ahns.l();
            return viewM;
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ems P() {
        return this.e;
    }

    @java.lang.Deprecated
    public final android.content.Context a() {
        if (this.d == null) {
            this.d = new ahgi(this, super.z());
        }
        return this.d;
    }

    public final void aD(android.content.Intent intent) {
        agab.aD(intent, z());
        aP(intent);
    }

    public final void aP(android.content.Intent intent) {
        agab.aD(intent, z());
        super.aP(intent);
    }

    public final void aR(int i, int i2) {
        this.al.i(i, i2);
        ahns.l();
    }

    @Override // defpackage.ger
    public final void aU(java.lang.String str) {
        defpackage.jcp jcpVarY = y();
        defpackage.jci jciVar = jcpVarY.e;
        jciVar.c(2132213766);
        defpackage.ojd ojdVar = jcpVarY.j;
        yse yseVar = yse.b;
        androidx.preference.PreferenceScreen preferenceScreenDW = jciVar.dW();
        aooh.e(preferenceScreenDW, "getPreferenceScreen(...)");
        com.android.dialer.externals.aicore.ui.DialerAiCorePreference dialerAiCorePreferenceA = ojdVar.a(yseVar, preferenceScreenDW);
        int i = 0;
        if (dialerAiCorePreferenceA != null) {
            defpackage.jcp.a.b().l("com/android/dialer/beesly/impl/settings/ui/BeeslySettingsFragmentPeer", "onCreatePreferences", 239, "BeeslySettingsFragmentPeer.kt").v("device is eligible for ai core, adding ai core preference");
            dialerAiCorePreferenceA.L(jciVar.Y(2132017504));
            dialerAiCorePreferenceA.R(false);
        }
        androidx.preference.PreferenceScreen preferenceScreenDW2 = jciVar.dW();
        android.content.Context context = jciVar.a.a;
        aooh.e(context, "getContext(...)");
        com.android.dialer.widget.SwitchWithLinkPreference switchWithLinkPreference = new com.android.dialer.widget.SwitchWithLinkPreference(context);
        switchWithLinkPreference.q = 2131427569;
        switchWithLinkPreference.L(context.getString(2132017526));
        switchWithLinkPreference.Q(context.getString(2132017527));
        iqm iqmVar = jcpVarY.l;
        switchWithLinkPreference.p(iqmVar.d() ? context.getString(2132017525) : context.getString(2132017524));
        switchWithLinkPreference.v = false;
        switchWithLinkPreference.A = 2131624026;
        switchWithLinkPreference.n = new defpackage.jcj(jcpVarY, i);
        preferenceScreenDW2.ae(switchWithLinkPreference);
        androidx.preference.PreferenceScreen preferenceScreenDW3 = jciVar.dW();
        android.content.Context context2 = jciVar.a.a;
        aooh.e(context2, "getContext(...)");
        androidx.preference.Preference preference = new androidx.preference.Preference(context2);
        preference.q = 2131427558;
        preference.L(context2.getString(2132017514));
        preference.Q(context2.getString(2132017515));
        preference.p(context2.getString(2132017513));
        preference.v = false;
        preference.A = 2131624024;
        preference.o = new defpackage.jrv(jcpVarY, 1);
        preferenceScreenDW3.ae(preference);
        androidx.preference.PreferenceScreen preferenceScreenDW4 = jciVar.dW();
        android.content.Context context3 = jciVar.a.a;
        aooh.e(context3, "getContext(...)");
        com.android.dialer.widget.FooterPreferenceCompat footerPreferenceCompat = new com.android.dialer.widget.FooterPreferenceCompat(context3);
        footerPreferenceCompat.L(context3.getString(2132017532));
        java.lang.String string = iqmVar.d() ? context3.getString(2132017531) : context3.getString(2132017530);
        aooh.c(string);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) string);
        spannableStringBuilder.append((java.lang.CharSequence) " ");
        android.text.SpannableString spannableString = new android.text.SpannableString(jciVar.dX().getString(2132017552));
        spannableString.setSpan(new android.text.style.URLSpan(jciVar.dX().getString(2132017553)), 0, spannableString.length(), 33);
        spannableStringBuilder.append((java.lang.CharSequence) spannableString);
        footerPreferenceCompat.Q(spannableStringBuilder);
        footerPreferenceCompat.v = false;
        footerPreferenceCompat.A = 2131624025;
        preferenceScreenDW4.ae(footerPreferenceCompat);
        jcpVarY.w.i(aoov.am(jcpVarY.c, 0, new icp(jcpVarY, (aoln) null, 19, (short[]) null), 3));
        jcpVarY.v.n(jcpVarY.f.e, new defpackage.jck(jcpVarY));
    }

    /* JADX INFO: renamed from: aW, reason: merged with bridge method [inline-methods] */
    public final defpackage.jcp y() {
        defpackage.jcp jcpVar = this.c;
        if (jcpVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.ak) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return jcpVar;
    }

    @Override // defpackage.jcs
    protected final /* synthetic */ amxr aX() {
        return new ahgl(this);
    }

    public final ahqz aY() {
        return (ahqz) this.al.b;
    }

    public final java.util.Locale aZ() {
        return agab.aE(this);
    }

    public final void af(android.os.Bundle bundle) {
        this.al.j();
        try {
            super.af(bundle);
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

    public final void ag(int i, int i2, android.content.Intent intent) {
        ahpm ahpmVarL = this.al.l();
        try {
            super.ag(i, i2, intent);
            ahpmVarL.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarL.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.jcs
    public final void ah(android.app.Activity activity) {
        this.al.j();
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
        ahpm ahpmVarE = this.al.e();
        try {
            super.ai();
            defpackage.jcp jcpVarY = y();
            if (((java.lang.Boolean) jcpVarY.m.a()).booleanValue()) {
                aoub aoubVar = jcpVarY.o;
                if (aoubVar != null) {
                    aoubVar.s((java.util.concurrent.CancellationException) null);
                }
                jcpVarY.o = null;
            }
            apni apniVar = jcpVarY.w;
            defpackage.jbv jbvVar = jcpVarY.f;
            apniVar.i(aoov.am(jbvVar.b, 0, new icp(jbvVar, (aoln) null, 13, (byte[]) null), 3));
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
        defpackage.jcp jcpVarY = y();
        if (z) {
            return;
        }
        wsc.be((android.view.ViewGroup) jcpVarY.e.H().findViewById(android.R.id.content), new ageb(false));
        jcpVarY.u.h(0);
    }

    public final void al() {
        this.al.j();
        try {
            super.al();
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
        ahpm ahpmVarE = this.al.e();
        try {
            super.an();
            defpackage.cp cpVarI = y().e.H().i();
            if (cpVarI != null) {
                cpVarI.i(2132017558);
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

    @Override // defpackage.ger
    public final void ao(android.view.View view, android.os.Bundle bundle) {
        this.al.j();
        try {
            ahvr.x(this).a = view;
            y();
            defpackage.hhe.e(this, y());
            super.ao(view, bundle);
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

    public final void av(java.lang.Object obj) {
        ajwa ajwaVar = this.al;
        if (ajwaVar != null) {
            ajwaVar.k();
        }
        super.av(obj);
    }

    public final void aw(java.lang.Object obj) {
        ajwa ajwaVar = this.al;
        if (ajwaVar != null) {
            ajwaVar.k();
        }
        super.aw(obj);
    }

    public final void ba(ahqz ahqzVar, boolean z) {
        this.al.h(ahqzVar, z);
    }

    public final void bb(ahqz ahqzVar) {
        this.al.c = ahqzVar;
    }

    public final android.view.LayoutInflater e(android.os.Bundle bundle) {
        this.al.j();
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

    public final ahtm f(ahth ahthVar) {
        return this.am.j(ahthVar);
    }

    @Override // defpackage.jcs
    public final void g(android.content.Context context) {
        this.al.j();
        try {
            if (this.ak) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                jcq jcqVar = (jcq) agab.aC(this, jcq.class);
                ahoq ahoqVarY = ahvr.Y(143, defpackage.jci.class, "CreatePeer");
                try {
                    this.c = jcqVar.k();
                    ahoqVarY.close();
                    ((aw) this).ab.c(new ahfz(this.al, this.e));
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarY.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            ahph ahphVar = ((aw) this).E;
            if (ahphVar instanceof ahph) {
                ajwa ajwaVar = this.al;
                if (ajwaVar.b == null) {
                    ajwaVar.h(ahphVar.aY(), true);
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

    @Override // defpackage.ger
    public final void h(android.os.Bundle bundle) {
        this.al.j();
        try {
            super.h(bundle);
            defpackage.jcp jcpVarY = y();
            agtj agtjVar = jcpVarY.g;
            agtjVar.h(jcpVarY.p);
            agtjVar.h(jcpVarY.q);
            defpackage.jbv jbvVar = jcpVarY.f;
            jbvVar.k = jbvVar.l.m(jcpVarY.e, new defpackage.npc(jbvVar, 1));
            java.lang.Object systemService = jcpVarY.b.getSystemService("connectivity");
            aooh.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            jcpVarY.s = (android.net.ConnectivityManager) systemService;
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

    @Override // defpackage.ger
    public final void i() {
        ahpm ahpmVarE = this.al.e();
        try {
            super.i();
            if (((aw) this).Q == null) {
                this.am.l();
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
        ahpm ahpmVarD = this.al.d();
        try {
            super.j();
            this.ak = true;
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

    @Override // defpackage.ger
    public final void k(android.os.Bundle bundle) {
        this.al.j();
        try {
            super.k(bundle);
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

    @Override // defpackage.ger
    public final void l() {
        this.al.j();
        try {
            super.l();
            defpackage.jcp jcpVarY = y();
            aoov.an(jcpVarY.d, (aolr) null, 0, new defpackage.fyn(jcpVarY, new android.net.NetworkRequest.Builder().addCapability(12).build(), (aoln) null, 18), 3);
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

    @Override // defpackage.ger
    public final void m() {
        this.al.j();
        try {
            super.m();
            defpackage.jcp jcpVarY = y();
            aoov.an(jcpVarY.d, (aolr) null, 0, new defpackage.icr(jcpVarY, (aoln) null, 16), 3);
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

    public final void n(android.os.Bundle bundle) {
        this.al.j();
        try {
            super.n(bundle);
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

    public final void q(java.lang.Class cls, ahtl ahtlVar) {
        this.am.k(cls, ahtlVar);
    }

    @Override // defpackage.jcs
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
