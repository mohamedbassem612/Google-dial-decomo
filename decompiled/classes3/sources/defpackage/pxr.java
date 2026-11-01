package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pxr extends defpackage.pxp implements ahei, aheg, ahgg, ahph {
    private defpackage.pxt ak;
    private android.content.Context al;
    private boolean an;
    private boolean ao;
    private final emy am = new emy(this, true);
    private final ajwa ap = new ajwa(this);

    @java.lang.Deprecated
    public pxr() {
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

    @Override // defpackage.pxp
    protected final /* synthetic */ amxr aV() {
        return new ahgl(this);
    }

    /* JADX INFO: renamed from: aX, reason: merged with bridge method [inline-methods] */
    public final defpackage.pxt y() {
        defpackage.pxt pxtVar = this.ak;
        if (pxtVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return pxtVar;
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

    @Override // defpackage.pxp
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

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    public final void al() {
        this.ap.j();
        try {
            super.al();
            defpackage.pxt pxtVarY = y();
            aimz aimzVar = defpackage.pxt.a;
            aimzVar.b().l("com/android/dialer/incall/dialog/ui/InCallDialogFragmentPeer", "onPause", 86, "InCallDialogFragmentPeer.java").v("enter");
            az azVarG = pxtVarY.e.G();
            if (azVarG == null || !azVarG.isChangingConfigurations()) {
                her herVar = pxtVarY.g;
                j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(herVar.a.remove(pxtVarY.b));
                aooh.e(optionalOfNullable, "ofNullable(...)");
                if (true == optionalOfNullable.isPresent()) {
                    ((defpackage.qay) optionalOfNullable.get()).a();
                }
            } else {
                aimzVar.b().l("com/android/dialer/incall/dialog/ui/InCallDialogFragmentPeer", "onPause", 92, "InCallDialogFragmentPeer.java").v("configuration change, don't release in-call UI lock (if any)");
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

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Map] */
    public final void an() {
        ahpm ahpmVarE = this.ap.e();
        try {
            super.an();
            defpackage.pxt pxtVarY = y();
            defpackage.pxt.a.b().l("com/android/dialer/incall/dialog/ui/InCallDialogFragmentPeer", "onResume", 75, "InCallDialogFragmentPeer.java").v("enter");
            defpackage.pxl pxlVar = pxtVarY.b;
            if (pxlVar.g) {
                her herVar = pxtVarY.g;
                final defpackage.pxs pxsVar = new defpackage.pxs(pxtVarY, 0);
                j$.util.Map.-EL.computeIfAbsent((java.util.Map) herVar.a, pxlVar, new defpackage.pei(new aonj() { // from class: pxz
                    public final java.lang.Object a(java.lang.Object obj) {
                        aooh.f((defpackage.pxl) obj, "it");
                        return (defpackage.qay) aa$.ExternalSyntheticApiModelOutline1.m(pxsVar);
                    }
                }, 5));
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
        this.ap.j();
        try {
            if (!((al) this).c && !this.an) {
                ahvr.x(this).a = view;
                y();
                pez.z(this, y());
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

    @Override // defpackage.pxp
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
        super.eb(bundle);
        defpackage.pxt pxtVarY = y();
        ucm ucmVar = pxtVarY.f;
        defpackage.pxl pxlVar = pxtVarY.b;
        defpackage.ahtg ahtgVarD = ucmVar.d();
        ahtgVarD.c(pxlVar.d);
        if (!pxlVar.c.isEmpty()) {
            ahtgVarD.l(pxlVar.c);
        }
        if (!pxlVar.e.isEmpty()) {
            ahtgVarD.i(pxlVar.e);
        }
        if (!pxlVar.f.isEmpty()) {
            ahtgVarD.e(pxlVar.f);
        }
        return ahtgVarD.a();
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

    @Override // defpackage.pxp
    public final void g(android.content.Context context) {
        this.ap.j();
        try {
            if (this.ao) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.ak == null) {
                pxu pxuVar = (pxu) agab.aC(this, pxu.class);
                ahoq ahoqVarY = ahvr.Y(558, defpackage.pxr.class, "CreatePeer");
                try {
                    this.ak = pxuVar.aY();
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
                    pez.z(this, y());
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
            defpackage.pxt pxtVarY = y();
            aimz aimzVar = defpackage.pxt.a;
            aimzVar.b().l("com/android/dialer/incall/dialog/ui/InCallDialogFragmentPeer", "onDismiss", 126, "InCallDialogFragmentPeer.java").v("onDismiss");
            az azVarG = pxtVarY.e.G();
            if (azVarG == null || !azVarG.isChangingConfigurations()) {
                defpackage.pxm pxmVar = pxtVarY.c;
                j$.util.concurrent.atomic.DesugarAtomicReference.getAndUpdate(pxmVar.b, new defpackage.oth(pxtVarY.b, 5));
                pxmVar.f.s(ajcm.a, defpackage.pxn.a);
            } else {
                aimzVar.b().l("com/android/dialer/incall/dialog/ui/InCallDialogFragmentPeer", "onDismiss", 130, "InCallDialogFragmentPeer.java").v("configuration change, don't clear display model");
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

    @Override // defpackage.pxp
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
