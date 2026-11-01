package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jrr extends defpackage.jry implements ahei, aheg, ahgg, ahph {
    private boolean ak;
    private defpackage.jrw c;
    private android.content.Context d;
    private final emy e = new emy(this, true);
    private final ajwa al = new ajwa(this);

    @java.lang.Deprecated
    public jrr() {
        afec.c();
    }

    public static defpackage.jrr aW() {
        defpackage.jrr jrrVar = new defpackage.jrr();
        amxr.g(jrrVar);
        return jrrVar;
    }

    @Override // defpackage.ger
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

    public final eoq T() {
        eos eosVar = new eos(super.T());
        eosVar.b(env.c, new android.os.Bundle());
        return eosVar;
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
        defpackage.jrw jrwVarY = y();
        defpackage.jrr jrrVar = jrwVarY.g;
        jrrVar.c(2132213771);
        jrwVarY.b = jrrVar.G().getApplicationContext();
        androidx.preference.PreferenceScreen preferenceScreenDW = jrrVar.dW();
        jrwVarY.c = (com.android.dialer.common.preference.ClickableWhenDisabledSwitchPreference) jrrVar.ee(jrrVar.dX().getString(2132017914));
        jrwVarY.c.n = jrwVarY;
        jrwVarY.d = (com.android.dialer.common.preference.ClickableWhenDisabledSwitchPreference) jrrVar.ee(jrrVar.dX().getString(2132020222));
        if (jrwVarY.d()) {
            preferenceScreenDW.af(jrwVarY.d);
        } else {
            jrwVarY.d.I(((androidx.preference.TwoStatePreference) jrwVarY.c).a);
            jrwVarY.d.n = jrwVarY;
        }
        jrwVarY.f = jrrVar.ee(jrrVar.dX().getString(2132017906));
        com.android.dialer.widget.FooterPreferenceCompat footerPreferenceCompat = jrwVarY.f;
        akwb akwbVar = new akwb(jrwVarY.b, false);
        footerPreferenceCompat.Q(new android.text.SpannableStringBuilder().append((java.lang.CharSequence) jrrVar.dX().getString(2132017911)).append((java.lang.CharSequence) "\n\n").append((java.lang.CharSequence) akwbVar.d(jrrVar.dX().getString(2132017913), jrrVar.dX().getString(2132017916), aaoo.A(jrrVar.G(), "dialer_google_caller_id").toString())).append((java.lang.CharSequence) "\n\n").append((java.lang.CharSequence) akwbVar.d(jrrVar.dX().getString(2132017912), jrrVar.dX().getString(2132017892), aaoo.A(jrrVar.G(), "dialer_data_attribution").toString())));
        jrwVarY.e = (androidx.preference.SwitchPreference) jrrVar.ee(jrrVar.dX().getString(2132017486));
        if (jrwVarY.q.g().isPresent()) {
            return;
        }
        defpackage.jrw.a.b().l("com/android/dialer/callerid/settings/impl/CallerIdSettingsFragmentPeer", "onCreatePreferences", 262, "CallerIdSettingsFragmentPeer.java").v("B2C EC not supported");
        preferenceScreenDW.af(jrwVarY.e);
    }

    /* JADX INFO: renamed from: aX, reason: merged with bridge method [inline-methods] */
    public final defpackage.jrw y() {
        defpackage.jrw jrwVar = this.c;
        if (jrwVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.ak) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return jrwVar;
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

    @Override // defpackage.jry
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

    public final void an() {
        ahpm ahpmVarE = this.al.e();
        try {
            super.an();
            defpackage.jrr jrrVar = y().g;
            jrrVar.G().i().j(jrrVar.dW().r);
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
            super.ao(view, bundle);
            defpackage.jrw jrwVarY = y();
            defpackage.jrr jrrVar = jrwVarY.g;
            url.a(jrrVar.b, 519);
            jrwVarY.r.a(jrrVar, jrrVar.b);
            ft$.ExternalSyntheticApiModelOutline0.m(((aw) jrrVar).Q, jrrVar.dW().r);
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

    @Override // defpackage.jry
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

    @Override // defpackage.jry
    public final void g(android.content.Context context) {
        this.al.j();
        try {
            if (this.ak) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                jrx jrxVar = (jrx) agab.aC(this, jrx.class);
                ahoq ahoqVarY = ahvr.Y(163, defpackage.jrr.class, "CreatePeer");
                try {
                    this.c = jrxVar.x();
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
            defpackage.jrw jrwVarY = y();
            jrwVarY.l.g(2131427724, jrwVarY.n.a, jrwVarY.m.a(jrwVarY.o));
            j$.util.Optional optionalG = jrwVarY.q.g();
            defpackage.jrs jrsVar = new defpackage.jrs(jrwVarY, 0);
            if (true == optionalG.isPresent()) {
                java.lang.Object obj = optionalG.get();
                java.lang.Object obj2 = jrsVar.a;
                ((defpackage.jrw) obj2).i.h(((defpackage.jrw) obj2).k);
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

    @Override // defpackage.ger
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

    @Override // defpackage.jry
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
