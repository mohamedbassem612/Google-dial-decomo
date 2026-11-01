package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class usp extends defpackage.usn implements ahei, aheg, ahgg, ahph {
    private defpackage.uss ak;
    private android.content.Context al;
    private boolean an;
    private boolean ao;
    private final emy am = new emy(this, true);
    private final ajwa ap = new ajwa(this);

    @java.lang.Deprecated
    public usp() {
        afec.c();
    }

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.ap.j();
        try {
            this.an = false;
            ahns.l();
            return null;
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
        return this.am;
    }

    @java.lang.Deprecated
    public final android.content.Context a() {
        if (this.al == null) {
            this.al = new ahgi(this, super.z());
        }
        return this.al;
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
        this.ap.i(i, i2);
        ahns.l();
    }

    @Override // defpackage.usn
    protected final /* synthetic */ amxr aV() {
        return new ahgl(this);
    }

    /* JADX INFO: renamed from: aX, reason: merged with bridge method [inline-methods] */
    public final defpackage.uss y() {
        defpackage.uss ussVar = this.ak;
        if (ussVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return ussVar;
    }

    public final ahqz aY() {
        return (ahqz) this.ap.b;
    }

    public final java.util.Locale aZ() {
        return agab.aE(this);
    }

    public final void af(android.os.Bundle bundle) {
        this.ap.j();
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
        ahpm ahpmVarL = this.ap.l();
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

    @Override // defpackage.usn
    public final void ah(android.app.Activity activity) {
        this.ap.j();
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
        ahpm ahpmVarE = this.ap.e();
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
        this.ap.j();
        try {
            super.al();
            java.lang.Object obj = y().b;
            if (!((android.app.KeyguardManager) ((aw) obj).G().getSystemService(android.app.KeyguardManager.class)).isKeyguardLocked()) {
                ((al) obj).f();
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

    public final void an() {
        ahpm ahpmVarE = this.ap.e();
        try {
            super.an();
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
        this.ap.j();
        try {
            if (!((al) this).c && !this.an) {
                ahvr.x(this).a = view;
                y();
                wsc.bo(this, y());
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

    public final void au(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = ((aw) this).m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        ahvr.bZ(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.au(bundle);
    }

    public final void av(java.lang.Object obj) {
        ajwa ajwaVar = this.ap;
        if (ajwaVar != null) {
            ajwaVar.k();
        }
        super.av(obj);
    }

    public final void aw(java.lang.Object obj) {
        ajwa ajwaVar = this.ap;
        if (ajwaVar != null) {
            ajwaVar.k();
        }
        super.aw(obj);
    }

    public final void ba(ahqz ahqzVar, boolean z) {
        this.ap.h(ahqzVar, z);
    }

    public final void bb(ahqz ahqzVar) {
        this.ap.c = ahqzVar;
    }

    @Override // defpackage.usn
    public final android.view.LayoutInflater e(android.os.Bundle bundle) {
        this.ap.j();
        try {
            android.view.LayoutInflater layoutInflaterE = super.e(bundle);
            android.view.LayoutInflater layoutInflaterCloneInContext = layoutInflaterE.cloneInContext(new ahgi(this, layoutInflaterE));
            ahns.l();
            return layoutInflaterCloneInContext;
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final android.app.Dialog eb(android.os.Bundle bundle) {
        aify aifyVarH;
        java.lang.CharSequence charSequenceExpandTemplate;
        super.eb(bundle);
        defpackage.uss ussVarY = y();
        aw awVar = (aw) ussVarY.b;
        android.view.View viewInflate = android.view.View.inflate(awVar.G(), 2131624224, null);
        android.widget.RadioGroup radioGroup = (android.widget.RadioGroup) viewInflate.findViewById(2131429507);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) awVar.z().getSystemService("layout_inflater");
        boolean z = viewInflate.findViewById(2131427968) != null;
        if (z) {
            ((android.widget.TextView) viewInflate.findViewById(2131427968)).setText(2132020574);
        }
        defpackage.urz urzVar = (defpackage.urz) ussVarY.a;
        long j = urzVar.c;
        aift aiftVar = new aift(4);
        defpackage.urv urvVar = defpackage.urv.a;
        akzx akzxVarM = urvVar.m();
        akzxVarM.u();
        defpackage.urv urvVar2 = (defpackage.urv) akzxVarM.b;
        urvVar2.b |= 1;
        urvVar2.c = -2;
        akzxVarM.u();
        defpackage.urv urvVar3 = (defpackage.urv) akzxVarM.b;
        int i = 1;
        urvVar3.b |= 2;
        urvVar3.d = -2;
        defpackage.urv urvVar4 = (defpackage.urv) akzxVarM.p();
        akzx akzxVarM2 = urvVar.m();
        akzxVarM2.u();
        defpackage.urv urvVar5 = (defpackage.urv) akzxVarM2.b;
        urvVar5.b |= 1;
        urvVar5.c = -3;
        akzxVarM2.u();
        defpackage.urv urvVar6 = (defpackage.urv) akzxVarM2.b;
        int i2 = 2;
        urvVar6.b |= 2;
        urvVar6.d = -3;
        defpackage.urv urvVar7 = (defpackage.urv) akzxVarM2.p();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        ahvr.bU(true, "min (%s) must be less than or equal to max (%s)", 5L, 60L);
        int iMin = (int) java.lang.Math.min(java.lang.Math.max(j / 60, 5L), 60L);
        if (iMin <= 5) {
            aiftVar.i(urvVar7);
            akzx akzxVarM3 = urvVar.m();
            akzxVarM3.u();
            defpackage.urv urvVar8 = (defpackage.urv) akzxVarM3.b;
            urvVar8.b |= 2;
            urvVar8.d = 5;
            akzxVarM3.u();
            defpackage.urv urvVar9 = (defpackage.urv) akzxVarM3.b;
            urvVar9.b |= 1;
            urvVar9.c = 0;
            aiftVar.i((defpackage.urv) akzxVarM3.p());
            aiftVar.i(urvVar4);
            aifyVarH = aiftVar.h();
        } else {
            int i3 = iMin / 5;
            akzx akzxVarP = urvVar7.p();
            akzxVarP.u();
            defpackage.urv urvVar10 = (defpackage.urv) akzxVarP.b;
            urvVar10.b |= 1;
            int i4 = -i3;
            urvVar10.c = i4;
            aiftVar.i((defpackage.urv) akzxVarP.p());
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 5; i5 < i7; i7 = 5) {
                akzx akzxVarM4 = urvVar.m();
                akzxVarM4.u();
                defpackage.urv urvVar11 = (defpackage.urv) akzxVarM4.b;
                urvVar11.b |= 1;
                urvVar11.c = i6;
                i6 += i3;
                akzxVarM4.u();
                defpackage.urv urvVar12 = (defpackage.urv) akzxVarM4.b;
                urvVar12.b |= 2;
                urvVar12.d = i6;
                aiftVar.i((defpackage.urv) akzxVarM4.p());
                i5++;
            }
            akzx akzxVarP2 = urvVar4.p();
            akzxVarP2.u();
            defpackage.urv urvVar13 = (defpackage.urv) akzxVarP2.b;
            urvVar13.b |= 1;
            urvVar13.c = i4;
            aiftVar.i((defpackage.urv) akzxVarP2.p());
            aifyVarH = aiftVar.h();
        }
        int i8 = 0;
        while (true) {
            int i9 = ((aike) aifyVarH).d;
            if (i8 >= i9) {
                break;
            }
            android.widget.RadioButton radioButton = (android.widget.RadioButton) layoutInflater.inflate(2131624230, (android.view.ViewGroup) radioGroup, false);
            radioGroup.addView(radioButton);
            defpackage.urv urvVar14 = (defpackage.urv) aifyVarH.get(i8);
            if (i8 == 0) {
                charSequenceExpandTemplate = android.text.TextUtils.expandTemplate(awVar.z().getText(2132020579), new java.lang.CharSequence[0]);
                i2 = i2;
            } else {
                int i10 = i;
                if (i8 == i10) {
                    android.content.res.Resources resources = awVar.z().getResources();
                    int i11 = urvVar14.d;
                    java.lang.Object[] objArr = new java.lang.Object[i10];
                    objArr[0] = java.lang.Integer.valueOf(i11);
                    charSequenceExpandTemplate = android.text.TextUtils.expandTemplate(resources.getQuantityString(2131886113, i11, objArr), new java.lang.CharSequence[0]);
                    i8 = 1;
                } else if (i8 == i9 - 1) {
                    charSequenceExpandTemplate = android.text.TextUtils.expandTemplate(awVar.z().getText(2132020576), new java.lang.CharSequence[0]);
                } else if (i8 == i9 - 2) {
                    charSequenceExpandTemplate = android.text.TextUtils.expandTemplate(awVar.z().getText(2132020577), java.lang.String.valueOf(urvVar14.c));
                } else {
                    java.lang.CharSequence text = awVar.z().getText(2132020573);
                    i2 = i2;
                    java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[i2];
                    charSequenceArr[0] = java.lang.String.valueOf(urvVar14.c);
                    charSequenceArr[1] = java.lang.String.valueOf(urvVar14.d);
                    charSequenceExpandTemplate = android.text.TextUtils.expandTemplate(text, charSequenceArr);
                }
            }
            radioButton.setText(charSequenceExpandTemplate);
            radioButton.setTag(2131429284, aifyVarH.get(i8));
            i8++;
            i2 = i2;
            i = 1;
        }
        int i12 = urzVar.d;
        java.lang.CharSequence charSequenceExpandTemplate2 = i12 <= 5 ? android.text.TextUtils.expandTemplate(awVar.z().getText(2132020581), new java.lang.CharSequence[0]) : i12 >= 60 ? android.text.TextUtils.expandTemplate(awVar.z().getText(2132020582), new java.lang.CharSequence[0]) : android.text.TextUtils.expandTemplate(awVar.z().getText(2132020580), java.lang.String.valueOf(urzVar.d));
        defpackage.ahtg ahtgVarD = ((ucm) ussVarY.c).d();
        ahtgVarD.l(charSequenceExpandTemplate2);
        ahtgVarD.n(viewInflate);
        ahtgVarD.h(2132020578);
        ahtgVarD.d(android.R.string.cancel);
        if (!z) {
            ahtgVarD.b(2132020574);
        }
        cy cyVarA = ahtgVarD.a();
        final int i13 = 0;
        cyVarA.setOnShowListener(new android.content.DialogInterface.OnShowListener() { // from class: usq
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(android.content.DialogInterface dialogInterface) {
                if (i13 == 0) {
                    ((cy) dialogInterface).b(-1).setEnabled(false);
                }
            }
        });
        ((android.widget.RadioGroup) viewInflate.findViewById(2131429507)).setOnCheckedChangeListener(new defpackage.usr(ussVarY, cyVarA));
        return cyVarA;
    }

    public final void f() {
        ahpm ahpmVarG = ahns.g();
        try {
            super.s(false, false);
            ahpmVarG.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarG.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.usn
    public final void g(android.content.Context context) {
        this.ap.j();
        try {
            if (this.ao) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.ak == null) {
                ust ustVar = (ust) agab.aC(this, ust.class);
                ahoq ahoqVarY = ahvr.Y(940, defpackage.usp.class, "CreatePeer");
                try {
                    this.ak = ustVar.cq();
                    ahoqVarY.close();
                    ((aw) this).ab.c(new ahfz(this.ap, this.am));
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
                ajwa ajwaVar = this.ap;
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
        this.ap.j();
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
        ahpm ahpmVarE = this.ap.e();
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
        ahpm ahpmVarD = this.ap.d();
        try {
            super.j();
            this.ao = true;
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
        this.ap.j();
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
        this.ap.j();
        try {
            super.l();
            defpackage.ahus.k(this);
            if (((al) this).c) {
                if (!this.an) {
                    ahvr.x(this).a = defpackage.ahus.i(this);
                    y();
                    wsc.bo(this, y());
                    this.an = true;
                }
                defpackage.ahus.j(this);
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
        this.ap.j();
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
        this.ap.j();
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

    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.ap.g("DialogFragment:onCancel").close();
    }

    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        ahpm ahpmVarG = this.ap.g("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            defpackage.uss ussVarY = y();
            if (((defpackage.urz) ussVarY.a).i) {
                ((aw) ussVarY.b).G().finish();
            }
            ahpmVarG.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarG.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.usn
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
