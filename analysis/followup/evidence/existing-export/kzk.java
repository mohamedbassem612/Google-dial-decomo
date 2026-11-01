package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kzk extends defpackage.laa implements ahei, aheg, ahgg, ahph, ahtq {
    private boolean ak;
    private defpackage.kzs c;
    private android.content.Context d;
    private final emy e = new emy(this, true);
    private final ajwa al = new ajwa(this);
    private final ahda am = new ahda((byte[]) null, (byte[]) null);

    @java.lang.Deprecated
    public kzk() {
        afec.c();
    }

    static defpackage.kzk aW() {
        defpackage.kzk kzkVar = new defpackage.kzk();
        amxr.g(kzkVar);
        return kzkVar;
    }

    @Override // defpackage.ger
    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.al.j();
        try {
            android.view.View viewM = super.M(layoutInflater, viewGroup, bundle);
            if (viewM == null) {
                defpackage.hhe.P(this, y());
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
        defpackage.kzs kzsVarY = y();
        defpackage.kzk kzkVar = kzsVarY.e;
        kzkVar.c(2132213796);
        androidx.preference.SwitchPreference switchPreference = (androidx.preference.SwitchPreference) kzkVar.ee(kzkVar.Y(2132019482));
        ahvr.ci(switchPreference);
        kzsVarY.k = switchPreference;
        androidx.preference.SwitchPreference switchPreference2 = kzsVarY.k;
        ahso ahsoVar = kzsVarY.j;
        int i = 3;
        switchPreference2.n = new ahsm(ahsoVar, "Click on recording for non-contacts toggle", new defpackage.jcj(kzsVarY, i));
        kzsVarY.l = kzkVar.ee(kzkVar.Y(2132018230));
        kzsVarY.l.o = new ahsn(ahsoVar, new defpackage.jrv(kzsVarY, i), 0);
        kzsVarY.n = kzkVar.ee(kzkVar.Y(2132020067));
        kzsVarY.n.u = defpackage.laq.class.getName();
        aike aikeVar = defpackage.kzs.b;
        int i2 = aikeVar.d;
        java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[i2];
        java.lang.CharSequence[] charSequenceArr2 = new java.lang.CharSequence[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            defpackage.kwx kwxVar = (defpackage.kwx) aikeVar.get(i3);
            charSequenceArr[i3] = kzsVarY.a(kwxVar);
            charSequenceArr2[i3] = defpackage.kzs.b(kwxVar);
        }
        kzsVarY.m = (androidx.preference.ListPreference) kzkVar.ee(kzkVar.Y(2132017478));
        kzsVarY.m.e(charSequenceArr);
        androidx.preference.ListPreference listPreference = kzsVarY.m;
        listPreference.h = charSequenceArr2;
        listPreference.n = new ahsm(ahsoVar, "AutoDeletionPolicyPreference changed", new defpackage.jcj(kzsVarY, 2));
        aify aifyVarP = kzsVarY.A.p();
        androidx.preference.Preference preferenceEe = kzkVar.ee(kzkVar.Y(2132020667));
        if (aifyVarP.size() == 2 && aifyVarP.contains(defpackage.kun.BEEP_SOUND)) {
            preferenceEe.R(true);
            hgb.c(defpackage.kzs.a.b(), "Show beep sound toggle preference", "com/android/dialer/callrecording/impl/settings/CrosbySettingsFragmentPeer", "configureUseBeepSoundTogglePreference", (char) 421, "CrosbySettingsFragmentPeer.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
            preferenceEe.n = new ahsm(ahsoVar, "PreferredDisclosureType changed", new defpackage.mmo(kzsVarY, aifyVarP, 1));
        } else {
            preferenceEe.R(false);
            hgb.c(defpackage.kzs.a.b(), "Do not show beep sound toggle preference", "com/android/dialer/callrecording/impl/settings/CrosbySettingsFragmentPeer", "configureUseBeepSoundTogglePreference", (char) 416, "CrosbySettingsFragmentPeer.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
        }
        kzsVarY.p = (androidx.preference.PreferenceCategory) kzkVar.ee(kzkVar.Y(2132018202));
        kzsVarY.o = kzkVar.ee(kzkVar.Y(2132020087));
        kzsVarY.o.A = 2131624281;
    }

    /* JADX INFO: renamed from: aX, reason: merged with bridge method [inline-methods] */
    public final defpackage.kzs y() {
        defpackage.kzs kzsVar = this.c;
        if (kzsVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.ak) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return kzsVar;
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

    @Override // defpackage.laa
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
            defpackage.kzs kzsVarY = y();
            defpackage.kzs.a.b().l("com/android/dialer/callrecording/impl/settings/CrosbySettingsFragmentPeer", "onResume", 175, "CrosbySettingsFragmentPeer.java").v("onResume");
            kzsVarY.c.i().i(2132018201);
            agsm.i(244, kzsVarY.f.a(), "unable to clean stale numbers", new java.lang.Object[0]);
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
            defpackage.hhe.P(this, y());
            super.ao(view, bundle);
            url.a(y().e.b, 519);
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

    @Override // defpackage.laa
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

    @Override // defpackage.laa
    public final void g(android.content.Context context) {
        this.al.j();
        try {
            if (this.ak) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                kzt kztVar = (kzt) agab.aC(this, kzt.class);
                ahoq ahoqVarY = ahvr.Y(243, defpackage.kzk.class, "CreatePeer");
                try {
                    this.c = kztVar.U();
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
            defpackage.kzs kzsVarY = y();
            defpackage.kzs.a.b().l("com/android/dialer/callrecording/impl/settings/CrosbySettingsFragmentPeer", "onCreate", 154, "CrosbySettingsFragmentPeer.java").v("enter");
            agtj agtjVar = kzsVarY.h;
            agtjVar.h(kzsVarY.s);
            agtjVar.h(kzsVarY.t);
            agtjVar.h(kzsVarY.y);
            agtjVar.h(kzsVarY.u);
            agtjVar.h(kzsVarY.v);
            agtjVar.h(kzsVarY.w);
            ajwr ajwrVar = kzsVarY.z;
            kvy kvyVar = kzsVarY.f;
            ajwrVar.n(new agxo(kvyVar.m, new defpackage.kvx(kvyVar, 0), defpackage.kzj.a), kzsVarY.x);
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

    @Override // defpackage.laa
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
