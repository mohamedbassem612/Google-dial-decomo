package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tsn extends defpackage.tsm implements ahei, aheg, ahgg, ahph, ahtq {
    private boolean ak;
    private defpackage.tsq c;
    private android.content.Context d;
    private final emy e = new emy(this, true);
    private final ajwa al = new ajwa(this);
    private final ahda am = new ahda((byte[]) null, (byte[]) null);

    @java.lang.Deprecated
    public tsn() {
        afec.c();
    }

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.al.j();
        try {
            android.view.View viewM = super.M(layoutInflater, viewGroup, bundle);
            if (viewM == null) {
                wsc.cn(this, y());
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

    public final void aU(java.lang.String str) {
        defpackage.tsq tsqVarY = y();
        aimz aimzVar = defpackage.tsq.a;
        aimzVar.b().l("com/android/dialer/sharpie/impl/settings/ui/SharpieSettingsFragmentPeer", "onCreatePreferences", 154, "SharpieSettingsFragmentPeer.kt").v("enter");
        defpackage.tsn tsnVar = tsqVarY.d;
        android.os.Bundle bundle = ((aw) tsnVar).m;
        if (bundle != null && !bundle.isEmpty()) {
            defpackage.rvq rvqVarP = defpackage.akmr.p(bundle, "extra_settings_launch_config", pez.aU(defpackage.rvq.a.m()).n(), akzq.a());
            defpackage.rvo rvoVar = rvqVarP.c == 2 ? (defpackage.rvo) rvqVarP.d : defpackage.rvo.a;
            boolean z = (rvoVar.b == 8 ? (defpackage.rvm) rvoVar.c : defpackage.rvm.a).b;
            aimzVar.b().l("com/android/dialer/sharpie/impl/settings/ui/SharpieSettingsFragmentPeer", "setupDelayFeatureCheckedIfRequired", 325, "SharpieSettingsFragmentPeer.kt").y("shouldDelayEnableSwitch: %s", java.lang.Boolean.valueOf(z));
            if (z) {
                bundle.remove("extra_settings_launch_config");
                tsg tsgVar = tsqVarY.e;
                j$.time.Duration duration = defpackage.tsq.b;
                aooh.f(duration, "duration");
                aoov.an(tsgVar.b, (aolr) null, 0, new defpackage.tkz(tsgVar, duration, (aoln) null, 8), 3);
            }
        }
        tsnVar.c(2132213815);
        ojd ojdVar = tsqVarY.i;
        defpackage.yse yseVar = defpackage.yse.d;
        androidx.preference.PreferenceScreen preferenceScreenDW = tsnVar.dW();
        aooh.e(preferenceScreenDW, "getPreferenceScreen(...)");
        com.android.dialer.externals.aicore.ui.DialerAiCorePreference dialerAiCorePreferenceA = ojdVar.a(yseVar, preferenceScreenDW);
        if (dialerAiCorePreferenceA != null) {
            aimzVar.b().l("com/android/dialer/sharpie/impl/settings/ui/SharpieSettingsFragmentPeer", "onCreatePreferences", 166, "SharpieSettingsFragmentPeer.kt").v("device is eligible for ai core, adding ai core preference");
            dialerAiCorePreferenceA.L(tsnVar.Y(2132020098));
            dialerAiCorePreferenceA.R(false);
        }
        androidx.preference.PreferenceScreen preferenceScreenDW2 = tsnVar.dW();
        android.content.Context context = ((ger) tsnVar).a.a;
        aooh.e(context, "getContext(...)");
        androidx.preference.SwitchPreference switchPreference = new androidx.preference.SwitchPreference(context);
        ((androidx.preference.Preference) switchPreference).q = 2131428939;
        switchPreference.L(context.getString(2132020100));
        switchPreference.Q(context.getString(2132020102));
        switchPreference.p(context.getString(2132020101));
        ((androidx.preference.Preference) switchPreference).v = false;
        ((androidx.preference.Preference) switchPreference).n = new jcj(tsqVarY, 12);
        preferenceScreenDW2.ae(switchPreference);
        androidx.preference.PreferenceScreen preferenceScreenDW3 = tsnVar.dW();
        android.content.Context context2 = ((ger) tsnVar).a.a;
        aooh.e(context2, "getContext(...)");
        com.android.dialer.widget.FooterPreferenceCompat footerPreferenceCompat = new com.android.dialer.widget.FooterPreferenceCompat(context2);
        footerPreferenceCompat.L(context2.getString(2132020108));
        ((androidx.preference.Preference) footerPreferenceCompat).v = false;
        android.text.SpannableString spannableStringD = new defpackage.akwb(tsnVar.z(), false).d(tsnVar.U(2132020109), tsnVar.Y(2132020110), "https://policies.google.com/terms");
        java.lang.String strZ = tsnVar.Z(2132020107, new java.lang.Object[]{100});
        android.text.SpannableString spannableStringB = new defpackage.akwb(tsnVar.z(), false).b(tsnVar.U(2132020121), "https://support.google.com/phoneapp/answer/15654065");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) spannableStringD);
        spannableStringBuilder.append((java.lang.CharSequence) "\n\n");
        spannableStringBuilder.append((java.lang.CharSequence) new android.text.SpannableString(strZ));
        spannableStringBuilder.append((java.lang.CharSequence) "\n");
        spannableStringBuilder.append((java.lang.CharSequence) spannableStringB);
        android.text.SpannableString spannableStringValueOf = android.text.SpannableString.valueOf(spannableStringBuilder);
        aooh.e(spannableStringValueOf, "valueOf(...)");
        footerPreferenceCompat.Q(spannableStringValueOf);
        preferenceScreenDW3.ae(footerPreferenceCompat);
        agsm agsmVar = tsqVarY.h;
        tsg tsgVar2 = tsqVarY.e;
        agsmVar.g(aosv.F(tsgVar2.b, 0, new defpackage.tpd(tsgVar2, (aoln) null, 8), 3), 1L, java.util.concurrent.TimeUnit.SECONDS);
        tsgVar2.f();
        tsqVarY.n.o(tsgVar2.d, new defpackage.tso(tsqVarY));
    }

    @Override // defpackage.tsm
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

    @Override // defpackage.tsm
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
            tsg tsgVar = y().e;
            aoub aoubVar = tsgVar.h;
            if (aoubVar != null) {
                aoubVar.s((java.util.concurrent.CancellationException) null);
            }
            tsgVar.h = null;
            tsgVar.p.i(aoov.an(tsgVar.b, (aolr) null, 0, new defpackage.tpd(tsgVar, (aoln) null, 11, (short[]) null), 3));
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
            cp cpVarI = y().d.H().i();
            if (cpVarI != null) {
                cpVarI.i(2132020126);
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

    public final void ao(android.view.View view, android.os.Bundle bundle) {
        this.al.j();
        try {
            ahvr.x(this).a = view;
            y();
            wsc.cn(this, y());
            super.ao(view, bundle);
            defpackage.tsq tsqVarY = y();
            aooh.f(view, "view");
            url.a(((ger) tsqVarY.d).b, 519);
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

    /* JADX INFO: renamed from: bd, reason: merged with bridge method [inline-methods] */
    public final defpackage.tsq y() {
        defpackage.tsq tsqVar = this.c;
        if (tsqVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.ak) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return tsqVar;
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

    public final defpackage.ahtm f(ahth ahthVar) {
        return this.am.j(ahthVar);
    }

    @Override // defpackage.tsm
    public final void g(android.content.Context context) {
        this.al.j();
        try {
            if (this.ak) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                tsr tsrVar = (tsr) agab.aC(this, tsr.class);
                ahoq ahoqVarY = ahvr.Y(893, defpackage.tsn.class, "CreatePeer");
                try {
                    this.c = tsrVar.ci();
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

    public final void h(android.os.Bundle bundle) {
        this.al.j();
        try {
            super.h(bundle);
            defpackage.tsq tsqVarY = y();
            tsg tsgVar = tsqVarY.e;
            defpackage.tsn tsnVar = tsqVarY.d;
            aoss aossVar = tsgVar.b;
            tsgVar.h = aoov.an(aossVar, (aolr) null, 0, new defpackage.tpd(tsgVar, (aoln) null, 10, (char[]) null), 3);
            tsgVar.g(tsgVar.o, aosv.F(aossVar, 0, new defpackage.tpd(tsgVar, (aoln) null, 12, (int[]) null), 3));
            tsgVar.g = tsgVar.k.m(tsnVar, new npc(tsgVar, 2));
            aoov.an(tsgVar.c, (aolr) null, 0, new roz(tsgVar, new android.net.NetworkRequest.Builder().addCapability(12).build(), (aoln) null, 16), 3);
            tsqVarY.f.h(tsqVarY.l);
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

    public final void l() {
        this.al.j();
        try {
            super.l();
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
        this.al.j();
        try {
            super.m();
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

    @Override // defpackage.tsm
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
