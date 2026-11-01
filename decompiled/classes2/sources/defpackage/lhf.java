package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lhf extends defpackage.lhm implements ahei, aheg, ahgg, ahph, ahtq {
    private boolean ak;
    private defpackage.lhh c;
    private android.content.Context d;
    private final emy e = new emy(this, true);
    private final ajwa al = new ajwa(this);
    private final ahda am = new ahda((byte[]) null, (byte[]) null);

    @java.lang.Deprecated
    public lhf() {
        afec.c();
    }

    public static defpackage.lhf aW() {
        defpackage.lhf lhfVar = new defpackage.lhf();
        amxr.g(lhfVar);
        return lhfVar;
    }

    @Override // defpackage.ger
    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.al.j();
        try {
            android.view.View viewM = super.M(layoutInflater, viewGroup, bundle);
            if (viewM == null) {
                defpackage.hhe.G(this, y());
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
        defpackage.lhh lhhVarY = y();
        aimz aimzVar = defpackage.lhh.a;
        aimzVar.b().l("com/android/dialer/callscreen/impl/settings/CallScreenSettingsFragmentPeer", "onCreatePreferences", 189, "CallScreenSettingsFragmentPeer.java").v("enter");
        defpackage.lhf lhfVar = lhhVarY.c;
        gez gezVar = lhfVar.a;
        android.content.Context context = gezVar.a;
        androidx.preference.PreferenceScreen preferenceScreenF = gezVar.f(context);
        lhfVar.s(preferenceScreenF);
        aimzVar.b().l("com/android/dialer/callscreen/impl/settings/CallScreenSettingsFragmentPeer", "createVoicePreference", 213, "CallScreenSettingsFragmentPeer.java").v("creating voice preference");
        androidx.preference.Preference preference = new androidx.preference.Preference(context);
        preference.L("voice_preference_key");
        preference.P(2132020826);
        preference.u = defpackage.lia.class.getName();
        preference.v = false;
        preference.q = -1;
        preference.R(false);
        preferenceScreenF.ae(preference);
        aimzVar.b().l("com/android/dialer/callscreen/impl/settings/CallScreenSettingsFragmentPeer", "createDemoPreference", 225, "CallScreenSettingsFragmentPeer.java").v("creating show demo preference");
        androidx.preference.Preference preference2 = new androidx.preference.Preference(context);
        preference2.L("demo_preference_key");
        preference2.P(2132017796);
        preference2.q = -1;
        akzx akzxVarM = defpackage.oln.a.m();
        akzxVarM.u();
        defpackage.oln olnVar = (defpackage.oln) akzxVarM.b;
        olnVar.c = 1;
        olnVar.b |= 1;
        preference2.t = defpackage.oll.a(context, (defpackage.oln) akzxVarM.p()).setFlags(536870912);
        preferenceScreenF.ae(preference2);
        if (!((java.lang.Boolean) lhhVarY.h.a()).booleanValue()) {
            preference2.R(false);
        }
        com.android.dialer.widget.FooterPreferenceCompat footerPreferenceCompat = new com.android.dialer.widget.FooterPreferenceCompat(context);
        footerPreferenceCompat.L("how_it_works_preference_key");
        footerPreferenceCompat.Q(new akwb(context, false).a(context.getResources().getText(2132017810), new defpackage.lde(lhhVarY, 3)));
        footerPreferenceCompat.v = false;
        preferenceScreenF.ae(footerPreferenceCompat);
        lhhVarY.k.n(lhhVarY.d.b.b, new defpackage.lhg(lhhVarY, preference));
    }

    /* JADX INFO: renamed from: aX, reason: merged with bridge method [inline-methods] */
    public final defpackage.lhh y() {
        defpackage.lhh lhhVar = this.c;
        if (lhhVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.ak) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return lhhVar;
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

    @Override // defpackage.lhm
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
            defpackage.lhh lhhVarY = y();
            lhhVarY.b.unregisterReceiver(lhhVarY.g);
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
            defpackage.lhh lhhVarY = y();
            lhhVarY.c.G().i().i(2132017848);
            j$.util.Optional optional = lhhVarY.j;
            defpackage.kwv kwvVar = new defpackage.kwv(lhhVarY, 14);
            if (true == optional.isPresent()) {
                ((defpackage.lhh) kwvVar.a).a((defpackage.liq) optional.get());
            }
            lhhVarY.d.f.t(ajcm.a, defpackage.lil.b);
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
            defpackage.hhe.G(this, y());
            super.ao(view, bundle);
            defpackage.lhh lhhVarY = y();
            ft$.ExternalSyntheticApiModelOutline0.m(((aw) lhhVarY.c).Q, lhhVarY.b.getString(2132017848));
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

    @Override // defpackage.lhm
    protected final /* synthetic */ amxr bc() {
        return new ahgl(this);
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

    @Override // defpackage.lhm
    public final void g(android.content.Context context) {
        this.al.j();
        try {
            if (this.ak) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                lhi lhiVar = (lhi) agab.aC(this, lhi.class);
                ahoq ahoqVarY = ahvr.Y(293, defpackage.lhf.class, "CreatePeer");
                try {
                    this.c = lhiVar.ab();
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
            defpackage.lhh lhhVarY = y();
            defpackage.lhf lhfVar = lhhVarY.c;
            defpackage.ljg ljgVar = lhhVarY.f;
            defpackage.lhe lheVar = lhhVarY.d;
            j$.util.Objects.requireNonNull(lheVar);
            lhhVarY.i = lhfVar.O(ljgVar, new defpackage.kse(lheVar, 2));
            dvx.f(lhhVarY.b, lhhVarY.g, defpackage.ljh.a, (java.lang.String) null, 2);
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

    @Override // defpackage.lhm
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
