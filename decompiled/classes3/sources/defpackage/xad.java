package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xad extends defpackage.xaq implements ahei, aheg, ahgg, ahph, ahtq {
    private boolean ak;
    private defpackage.xan c;
    private android.content.Context d;
    private final emy e = new emy(this, true);
    private final ajwa al = new ajwa(this);
    private final ahda am = new ahda((byte[]) null, (byte[]) null);

    @java.lang.Deprecated
    public xad() {
        afec.c();
    }

    public static defpackage.xad aW() {
        defpackage.xad xadVar = new defpackage.xad();
        amxr.g(xadVar);
        return xadVar;
    }

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.al.j();
        try {
            android.view.View viewM = super.M(layoutInflater, viewGroup, bundle);
            if (viewM == null) {
                wsc.g(this, y());
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

    /* JADX WARN: Code duplicated, block: B:18:0x009d  */
    public final void aU(java.lang.String str) {
        boolean z;
        final defpackage.xan xanVarY = y();
        defpackage.xan.a.b().l("com/android/incallui/atlas/ui/impl/settings/AtlasSettingsFragmentPeer", "onCreatePreferences", 148, "AtlasSettingsFragmentPeer.java").v("enter");
        defpackage.xad xadVar = xanVarY.d;
        xanVarY.o = lpa.a(xadVar.I(), "AtlasSettingsFragmentCompat.autoOptInListener");
        xanVarY.p = lpa.a(xadVar.I(), "AtlasSettingsFragmentCompat.loadEnrollmentStatusListener");
        xanVarY.n = lpa.a(xadVar.I(), "AtlasSettingsFragmentCompat.checkModelAvailabilityListener");
        xanVarY.q = lpa.a(xadVar.I(), "AtlasSettingsFragmentCompat.downloadModelListener");
        xanVarY.r = lpa.a(xadVar.I(), "AtlasSettingsFragmentCompat.saveEnrollmentStatusListener");
        android.os.Bundle bundle = ((aw) xadVar).m;
        if (bundle == null) {
            z = false;
            xanVarY.i = z;
        } else if (bundle.isEmpty()) {
            if (bundle.getBoolean("should_set_default_settings", false)) {
                z = true;
            } else {
                z = false;
            }
            xanVarY.i = z;
        } else {
            defpackage.rvq rvqVarP = defpackage.akmr.p(bundle, "extra_settings_launch_config", defpackage.rvq.a, akzq.a());
            defpackage.rvo rvoVar = rvqVarP.c == 2 ? (defpackage.rvo) rvqVarP.d : defpackage.rvo.a;
            xanVarY.i = (rvoVar.b == 2 ? (defpackage.rvf) rvoVar.c : defpackage.rvf.a).b;
        }
        xadVar.c(2132213764);
        defpackage.xav xavVar = xanVarY.c;
        xavVar.g = xavVar.h.d(xadVar, new npc(xavVar, 5));
        xanVarY.u.n(new agxo(xavVar.j, new kvx(xavVar, 13), defpackage.xav.a), new defpackage.xak(xanVarY));
        android.content.Context context = xanVarY.e;
        androidx.preference.Preference preferenceEe = xadVar.ee(context.getString(2132017373));
        ahvr.ci(preferenceEe);
        xanVarY.k = preferenceEe;
        androidx.preference.Preference preferenceEe2 = xadVar.ee(context.getString(2132017391));
        ahvr.ci(preferenceEe2);
        androidx.preference.Preference preferenceEe3 = xadVar.ee(context.getString(2132017392));
        ahvr.ci(preferenceEe3);
        preferenceEe2.R(true);
        preferenceEe2.q = 2131427489;
        preferenceEe3.R(false);
        preferenceEe3.q = 2131427490;
        androidx.preference.SwitchPreference switchPreferenceEe = xadVar.ee(context.getString(2132017414));
        ahvr.ci(switchPreferenceEe);
        xanVarY.m = switchPreferenceEe;
        androidx.preference.SwitchPreference switchPreference = xanVarY.m;
        ((androidx.preference.Preference) switchPreference).q = 2131427491;
        switchPreference.N(2132017413);
        ((androidx.preference.Preference) xanVarY.m).n = new geh() { // from class: xag
            public final boolean a(androidx.preference.Preference preference, java.lang.Object obj) {
                xanVarY.c(((java.lang.Boolean) obj).booleanValue());
                return true;
            }
        };
        xadVar.ee(context.getString(2132017407)).Q(new defpackage.akwb(context, false).c(context.getText(2132017406), context.getString(2132017408), new defpackage.ahpp(xanVarY.g, 1149, "Atlas how it works click", new defpackage.wtm(xanVarY, 6), 0)));
        if (xanVarY.i) {
            return;
        }
        xanVarY.p.b(xadVar.z(), xanVarY.t.k(), new defpackage.xai(xanVarY, 0), new defpackage.taw(xanVarY, 12));
    }

    /* JADX INFO: renamed from: aX, reason: merged with bridge method [inline-methods] */
    public final defpackage.xan y() {
        defpackage.xan xanVar = this.c;
        if (xanVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.ak) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return xanVar;
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

    @Override // defpackage.xaq
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
            defpackage.xav xavVar = y().c;
            xavVar.e.g(ahvr.H(xavVar.g, new defpackage.wzj(14), xavVar.d), 5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
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
            defpackage.xan xanVarY = y();
            defpackage.xad xadVar = xanVarY.d;
            xadVar.G().i().j(((androidx.preference.Preference) xadVar.dW()).r);
            if (xanVarY.i) {
                xanVarY.i = false;
                xanVarY.l.setVisibility(0);
                xanVarY.l.getViewTreeObserver().addOnGlobalLayoutListener(new gj(xanVarY, 4));
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
            wsc.g(this, y());
            super.ao(view, bundle);
            defpackage.xan xanVarY = y();
            defpackage.xad xadVar = xanVarY.d;
            xanVarY.l = ((ger) xadVar).b;
            xanVarY.l.setVisibility(4);
            ft$.ExternalSyntheticApiModelOutline0.m(((aw) xadVar).Q, ((androidx.preference.Preference) xadVar.dW()).r);
            url.a(xanVarY.l, 519);
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

    @Override // defpackage.xaq
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

    public final defpackage.ahtm f(ahth ahthVar) {
        return this.am.j(ahthVar);
    }

    @Override // defpackage.xaq
    public final void g(android.content.Context context) {
        this.al.j();
        try {
            if (this.ak) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                xao xaoVar = (xao) agab.aC(this, xao.class);
                ahoq ahoqVarY = ahvr.Y(1148, defpackage.xad.class, "CreatePeer");
                try {
                    this.c = xaoVar.cR();
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

    @Override // defpackage.xaq
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
