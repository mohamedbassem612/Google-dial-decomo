package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tav extends defpackage.tat implements ahei, aheg, ahgg, ahph {
    private boolean ak;
    private defpackage.tax c;
    private android.content.Context d;
    private final emy e = new emy(this, true);
    private final ajwa al = new ajwa(this);

    @java.lang.Deprecated
    public tav() {
        afec.c();
    }

    public static defpackage.tav bd() {
        defpackage.tav tavVar = new defpackage.tav();
        amxr.g(tavVar);
        return tavVar;
    }

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.al.j();
        try {
            android.view.View viewM = super.M(layoutInflater, viewGroup, bundle);
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
        defpackage.tax taxVarY = y();
        defpackage.tav tavVar = taxVarY.f;
        tavVar.c(2132213812);
        android.content.Context context = taxVarY.g;
        androidx.preference.Preference preferenceEe = tavVar.ee(context.getString(2132017977));
        ahvr.ci(preferenceEe);
        taxVarY.j = preferenceEe;
        taxVarY.j.A = 2131624280;
        taxVarY.k = lpa.a(tavVar.I(), "RevelioSettingsFragmentCompat.callScreenActivationListener");
        android.os.Bundle bundle = ((aw) tavVar).m;
        int i = 0;
        taxVarY.u = false;
        if (bundle != null) {
            if (bundle.containsKey("extra_settings_launch_config")) {
                defpackage.rvq rvqVarP = defpackage.akmr.p(bundle, "extra_settings_launch_config", defpackage.rvq.a, akzq.a());
                defpackage.rvo rvoVar = rvqVarP.c == 2 ? (defpackage.rvo) rvqVarP.d : defpackage.rvo.a;
                taxVarY.u = (rvoVar.b == 3 ? (defpackage.rvk) rvoVar.c : defpackage.rvk.a).b;
            } else {
                taxVarY.u = bundle.getBoolean("should_set_default_settings", false);
            }
        }
        androidx.preference.Preference preferenceEe2 = tavVar.ee(context.getString(2132017978));
        ahvr.ci(preferenceEe2);
        taxVarY.t = preferenceEe2;
        j$.util.Optional optionalG = taxVarY.A.g();
        defpackage.rhb rhbVar = new defpackage.rhb(taxVarY, 19);
        int i2 = 1;
        if (true == optionalG.isPresent()) {
            ((defpackage.tax) rhbVar.a).t.u = lia.class.getName();
        }
        androidx.preference.Preference preferenceEe3 = tavVar.ee(context.getString(2132019906));
        akzx akzxVarM = oln.a.m();
        akzxVarM.u();
        oln olnVar = akzxVarM.b;
        olnVar.c = 2;
        olnVar.b |= 1;
        preferenceEe3.t = oll.a(context, akzxVarM.p()).setFlags(536870912);
        taxVarY.m = lpa.a(tavVar.I(), "TidepodsRevelioSettingsFragmentCompat.saveAudioSetupListener");
        taxVarY.n = lpa.a(tavVar.I(), "TidepodsRevelioSettingsFragmentCompat.saveAudioClickListener");
        androidx.preference.SwitchPreference switchPreferenceEe = tavVar.ee(context.getString(2132019935));
        ahvr.ci(switchPreferenceEe);
        taxVarY.l = switchPreferenceEe;
        if (((java.lang.Boolean) taxVarY.h.a()).booleanValue()) {
            taxVarY.l.I(false);
            taxVarY.m.b(context, taxVarY.B.g(), new kll(taxVarY, 5), new defpackage.taw(taxVarY, i));
            ((androidx.preference.Preference) taxVarY.l).n = new jcj(taxVarY, 8);
        } else {
            defpackage.tax.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/settings/RevelioSettingsFragmentPeer", "setUpSaveAudioPreference", 277, "RevelioSettingsFragmentPeer.java").v("setUpSaveAudioPreference: save call screen audio disabled");
            tavVar.dW().af(taxVarY.l);
        }
        taxVarY.p = lpa.a(tavVar.I(), "TidepodsRevelioSettingsFragmentCompat.deleteOldRecordingsSetupListener");
        taxVarY.q = lpa.a(tavVar.I(), "TidepodsRevelioSettingsFragmentCompat.deleteOldRecordingsClickListener");
        androidx.preference.SwitchPreference switchPreferenceEe2 = tavVar.ee(context.getString(2132019902));
        ahvr.ci(switchPreferenceEe2);
        taxVarY.o = switchPreferenceEe2;
        if (((java.lang.Boolean) taxVarY.i.a()).booleanValue()) {
            taxVarY.o.I(false);
            taxVarY.p.b(context, taxVarY.B.f(), new kll(taxVarY, 4), new defpackage.taw(taxVarY, i2));
            ((androidx.preference.Preference) taxVarY.o).n = new jcj(taxVarY, 9);
        } else {
            defpackage.tax.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/settings/RevelioSettingsFragmentPeer", "setUpDeleteOldRecordingsPreference", 348, "RevelioSettingsFragmentPeer.java").v("Deleting old recordings disabled.");
            tavVar.dW().af(taxVarY.o);
        }
        taxVarY.r = lpa.a(tavVar.I(), "TidepodsRevelioSettingsFragmentCompat.callerIdAndSpamGetterListener");
        taxVarY.s = lpa.a(tavVar.I(), "TidepodsRevelioSettingsFragmentCompat.callerIdAndSpamSetterListener");
        com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat tidepodsCallerActionPreferenceCompatEe = tavVar.ee(context.getString(2132020207));
        ahvr.ci(tidepodsCallerActionPreferenceCompatEe);
        taxVarY.v = tidepodsCallerActionPreferenceCompatEe;
        taxVarY.v.q(2, tavVar);
        com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat tidepodsCallerActionPreferenceCompatEe2 = tavVar.ee(context.getString(2132019770));
        ahvr.ci(tidepodsCallerActionPreferenceCompatEe2);
        taxVarY.w = tidepodsCallerActionPreferenceCompatEe2;
        taxVarY.w.q(3, tavVar);
        com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat tidepodsCallerActionPreferenceCompatEe3 = tavVar.ee(context.getString(2132018748));
        ahvr.ci(tidepodsCallerActionPreferenceCompatEe3);
        taxVarY.x = tidepodsCallerActionPreferenceCompatEe3;
        taxVarY.x.q(4, tavVar);
        com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat tidepodsCallerActionPreferenceCompatEe4 = tavVar.ee(context.getString(2132019812));
        ahvr.ci(tidepodsCallerActionPreferenceCompatEe4);
        taxVarY.y = tidepodsCallerActionPreferenceCompatEe4;
        taxVarY.y.q(5, tavVar);
        tavVar.ee(context.getString(2132019926)).Q(taxVarY.z.b(tavVar.G(), context.getString(2132019901)));
        tavVar.ee(context.getString(2132017977)).P(2132017976);
    }

    @Override // defpackage.tat
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

    @Override // defpackage.tat
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

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void an() {
        ahpm ahpmVarE = this.al.e();
        try {
            super.an();
            defpackage.tax taxVarY = y();
            defpackage.tax.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/settings/RevelioSettingsFragmentPeer", "showActivatingCallScreenPreferenceAndDisableVoicePreference", 461, "RevelioSettingsFragmentPeer.java").v("showing activation preference");
            defpackage.tav tavVar = taxVarY.f;
            tavVar.dW().ae(taxVarY.j);
            taxVarY.t.I(false);
            lpa lpaVar = taxVarY.k;
            android.content.Context context = taxVarY.g;
            defpackage.rdp rdpVar = taxVarY.C;
            lpaVar.b(context, ((ajwr) rdpVar.a).e(ahqx.b(new defpackage.plx(rdpVar, 11)), (java.util.concurrent.Executor) rdpVar.d), new kll(taxVarY, 8), new jox(14));
            if (taxVarY.u) {
                taxVarY.u = false;
                taxVarY.r.b(context, taxVarY.D.e(), new kll(taxVarY, 6), new jox(12));
            }
            tavVar.G().i().j(((androidx.preference.Preference) tavVar.dW()).r);
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
            super.ao(view, bundle);
            url.a(((ger) y().f).b, 519);
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
    public final defpackage.tax y() {
        defpackage.tax taxVar = this.c;
        if (taxVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.ak) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return taxVar;
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

    @Override // defpackage.tat
    public final void g(android.content.Context context) {
        this.al.j();
        try {
            if (this.ak) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                taz tazVar = (taz) agab.aC(this, taz.class);
                ahoq ahoqVarY = ahvr.Y(869, defpackage.tav.class, "CreatePeer");
                try {
                    this.c = tazVar.cd();
                    ahoqVarY.close();
                    this.c.E = this;
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

    public final void p(androidx.preference.Preference preference) {
        defpackage.tax taxVarY = y();
        java.lang.String str = preference.s;
        if (str == null || !(preference instanceof com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat)) {
            return;
        }
        defpackage.tap tapVar = new defpackage.tap();
        amxr.g(tapVar);
        ahgl.c(tapVar, str);
        defpackage.tav tavVar = taxVarY.f;
        tapVar.aO(tavVar);
        tapVar.r(tavVar.J(), "dialog_preference");
    }

    @Override // defpackage.tat
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
