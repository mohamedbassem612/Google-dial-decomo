package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wqb extends defpackage.wpv implements ahei, aheg, ahgg, ahph, ahtq {
    private boolean ak;
    private defpackage.wqh c;
    private android.content.Context d;
    private final emy e = new emy(this, true);
    private final ajwa al = new ajwa(this);
    private final ahda am = new ahda((byte[]) null, (byte[]) null);

    @java.lang.Deprecated
    public wqb() {
        afec.c();
    }

    public static defpackage.wqb bd() {
        defpackage.wqb wqbVar = new defpackage.wqb();
        amxr.g(wqbVar);
        return wqbVar;
    }

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.al.j();
        try {
            android.view.View viewM = super.M(layoutInflater, viewGroup, bundle);
            if (viewM == null) {
                wsc.a(this, y());
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
        j$.util.Optional optionalEmpty;
        defpackage.wqh wqhVarY = y();
        aimz aimzVar = defpackage.wqh.a;
        aimzVar.b().l("com/android/dialer/xatu/impl/settings/XatuSettingsFragmentPeer", "onCreatePreferences", 238, "XatuSettingsFragmentPeer.java").v("enter");
        defpackage.wqb wqbVar = wqhVarY.g;
        gez gezVar = ((ger) wqbVar).a;
        android.content.Context context = gezVar.a;
        androidx.preference.PreferenceScreen preferenceScreenF = gezVar.f(context);
        wqbVar.s(preferenceScreenF);
        androidx.preference.Preference preference = new androidx.preference.Preference(context);
        preference.q = -1;
        preference.L("image_header_key");
        preference.v = false;
        preference.A = 2131624267;
        preferenceScreenF.ae(preference);
        aimzVar.b().l("com/android/dialer/xatu/impl/settings/XatuSettingsFragmentPeer", "createEnabledPreference", 276, "XatuSettingsFragmentPeer.java").v("creating enable preference");
        androidx.preference.SwitchPreference switchPreference = new androidx.preference.SwitchPreference(context);
        switchPreference.L("is_enabled_preference_key");
        switchPreference.P(2132021074);
        switchPreference.N(2132021073);
        switchPreference.I(false);
        ((androidx.preference.Preference) switchPreference).v = false;
        ((androidx.preference.Preference) switchPreference).n = new jcj(wqhVarY, 18);
        preferenceScreenF.ae(switchPreference);
        aoin aoinVar = wqhVarY.l;
        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            aimzVar.b().l("com/android/dialer/xatu/impl/settings/XatuSettingsFragmentPeer", "createEnabledShowAheadPreference", 288, "XatuSettingsFragmentPeer.java").v("creating enabled show ahead preference");
            androidx.preference.SwitchPreference switchPreference2 = new androidx.preference.SwitchPreference(context);
            switchPreference2.L("is_enabled_show_ahead_preference_key");
            switchPreference2.P(2132021076);
            switchPreference2.N(2132021075);
            switchPreference2.I(false);
            ((androidx.preference.Preference) switchPreference2).v = false;
            ((androidx.preference.Preference) switchPreference2).n = new jcj(wqhVarY, 19);
            preferenceScreenF.ae(switchPreference2);
            optionalEmpty = j$.util.Optional.of(switchPreference2);
        } else {
            optionalEmpty = j$.util.Optional.empty();
        }
        aimzVar.b().l("com/android/dialer/xatu/impl/settings/XatuSettingsFragmentPeer", "createEnabledAutomaticDisplayPreference", 300, "XatuSettingsFragmentPeer.java").v("creating enabled automatic display preference");
        androidx.preference.SwitchPreference switchPreference3 = new androidx.preference.SwitchPreference(context);
        switchPreference3.L("is_enabled_automatic_display_preference_key");
        switchPreference3.P(2132021072);
        switchPreference3.N(2132021071);
        switchPreference3.I(false);
        ((androidx.preference.Preference) switchPreference3).v = false;
        ((androidx.preference.Preference) switchPreference3).n = new jcj(wqhVarY, 20);
        preferenceScreenF.ae(switchPreference3);
        j$.util.Optional optionalOf = j$.util.Optional.of(switchPreference3);
        aimzVar.b().l("com/android/dialer/xatu/impl/settings/XatuSettingsFragmentPeer", "createHowItWorksPreference", 350, "XatuSettingsFragmentPeer.java").v("creating how-it-works preference");
        wqhVarY.m = new com.android.dialer.widget.FooterPreferenceCompat(context);
        wqhVarY.m.L("how_it_works_key");
        com.android.dialer.widget.FooterPreferenceCompat footerPreferenceCompat = wqhVarY.m;
        com.google.android.gms.googlehelp.GoogleHelp googleHelp = new com.google.android.gms.googlehelp.GoogleHelp((java.lang.String) wqhVarY.k.a());
        googleHelp.q = android.net.Uri.parse("https://support.google.com/phoneapp");
        com.google.android.gms.feedback.ThemeSettings themeSettings = new com.google.android.gms.feedback.ThemeSettings(3, 0);
        themeSettings.a = 3;
        googleHelp.s = themeSettings;
        footerPreferenceCompat.Q(new defpackage.akwb(context, false).c(context.getText(true != ((java.lang.Boolean) aoinVar.a()).booleanValue() ? 2132021082 : 2132021113), context.getString(2132021081), new defpackage.ahpp(wqhVarY.j, 1104, "Xatu how it works click", new defpackage.wgf(wqhVarY, googleHelp.a(), 2, null), 0)));
        com.android.dialer.widget.FooterPreferenceCompat footerPreferenceCompat2 = wqhVarY.m;
        ((androidx.preference.Preference) footerPreferenceCompat2).v = false;
        preferenceScreenF.ae(footerPreferenceCompat2);
        wqhVarY.p.n(wqhVarY.h.c, new defpackage.wqg(wqhVarY, switchPreference, optionalEmpty, optionalOf));
    }

    @Override // defpackage.wpv
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

    @Override // defpackage.wpv
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
            defpackage.wql wqlVar = y().h;
            wqlVar.b.g(ahvr.H(wqlVar.h, new defpackage.wkb(13), wqlVar.g), 5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
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
            y().g.H().i().i(2132021096);
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
            wsc.a(this, y());
            super.ao(view, bundle);
            defpackage.wqh wqhVarY = y();
            defpackage.wqb wqbVar = wqhVarY.g;
            ft$.ExternalSyntheticApiModelOutline0.m(((aw) wqbVar).Q, wqhVarY.e.getString(2132021096));
            url.a(((ger) wqbVar).b, 519);
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

    /* JADX INFO: renamed from: be, reason: merged with bridge method [inline-methods] */
    public final defpackage.wqh y() {
        defpackage.wqh wqhVar = this.c;
        if (wqhVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.ak) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return wqhVar;
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

    @Override // defpackage.wpv
    public final void g(android.content.Context context) {
        this.al.j();
        try {
            if (this.ak) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                wqi wqiVar = (wqi) agab.aC(this, wqi.class);
                ahoq ahoqVarY = ahvr.Y(1103, defpackage.wqb.class, "CreatePeer");
                try {
                    this.c = wqiVar.cN();
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
            defpackage.wqh wqhVarY = y();
            agtj agtjVar = wqhVarY.i;
            agtjVar.h(wqhVarY.b);
            if (((java.lang.Boolean) wqhVarY.l.a()).booleanValue()) {
                agtjVar.h(wqhVarY.c);
            }
            agtjVar.h(wqhVarY.d);
            defpackage.wql wqlVar = wqhVarY.h;
            wqlVar.h = wqlVar.i.d(wqhVarY.g, new npc(wqlVar, 4));
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

    @Override // defpackage.wpv
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
