package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class krt extends defpackage.ksi implements ahei, aheg, ahgg, ahph {
    private defpackage.krv ak;
    private android.content.Context al;
    private boolean an;
    private final emy am = new emy(this, true);
    private final ajwa ao = new ajwa(this);

    @java.lang.Deprecated
    public krt() {
        afec.c();
    }

    public static defpackage.krt aU() {
        defpackage.krt krtVar = new defpackage.krt();
        amxr.g(krtVar);
        return krtVar;
    }

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.ao.j();
        try {
            defpackage.krv krvVarY = y();
            aooh.f(layoutInflater, "inflater");
            android.view.View viewInflate = layoutInflater.inflate(2131624233, viewGroup, false);
            android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(2131428262);
            java.lang.CharSequence text = textView.getText();
            aooh.e(text, "getText(...)");
            defpackage.kgq kgqVar = new defpackage.kgq(krvVarY, 6);
            android.text.SpannableString spannableString = new android.text.SpannableString(text);
            android.text.style.URLSpan[] uRLSpanArr = (android.text.style.URLSpan[]) spannableString.getSpans(0, spannableString.length(), android.text.style.URLSpan.class);
            aooh.c(uRLSpanArr);
            for (android.text.style.URLSpan uRLSpan : uRLSpanArr) {
                spannableString.setSpan(new defpackage.kru(uRLSpan, kgqVar), spannableString.getSpanStart(uRLSpan), spannableString.getSpanEnd(uRLSpan), spannableString.getSpanFlags(uRLSpan));
                spannableString.removeSpan(uRLSpan);
            }
            textView.setText(spannableString);
            textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            viewInflate.findViewById(2131428261).setOnClickListener(new defpackage.jln(krvVarY, 17, null));
            ahns.l();
            return viewInflate;
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
        this.ao.i(i, i2);
        ahns.l();
    }

    /* JADX INFO: renamed from: aV, reason: merged with bridge method [inline-methods] */
    public final defpackage.krv y() {
        defpackage.krv krvVar = this.ak;
        if (krvVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.an) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return krvVar;
    }

    @Override // defpackage.ksi
    protected final /* synthetic */ amxr aW() {
        return new ahgl(this);
    }

    public final ahqz aY() {
        return (ahqz) this.ao.b;
    }

    public final java.util.Locale aZ() {
        return agab.aE(this);
    }

    public final void af(android.os.Bundle bundle) {
        this.ao.j();
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
        ahpm ahpmVarL = this.ao.l();
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

    @Override // defpackage.ksi
    public final void ah(android.app.Activity activity) {
        this.ao.j();
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
        ahpm ahpmVarE = this.ao.e();
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
        this.ao.j();
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
        ahpm ahpmVarE = this.ao.e();
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
        this.ao.j();
        ahns.l();
    }

    public final void av(java.lang.Object obj) {
        ajwa ajwaVar = this.ao;
        if (ajwaVar != null) {
            ajwaVar.k();
        }
        super.av(obj);
    }

    public final void aw(java.lang.Object obj) {
        ajwa ajwaVar = this.ao;
        if (ajwaVar != null) {
            ajwaVar.k();
        }
        super.aw(obj);
    }

    public final void ba(ahqz ahqzVar, boolean z) {
        this.ao.h(ahqzVar, z);
    }

    public final void bb(ahqz ahqzVar) {
        this.ao.c = ahqzVar;
    }

    @Override // defpackage.ksi
    public final android.view.LayoutInflater e(android.os.Bundle bundle) {
        this.ao.j();
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
        defpackage.krv krvVarY = y();
        afqy afqyVar = new afqy((android.content.Context) krvVarY.b, ((defpackage.al) krvVarY.a).b);
        afqyVar.setOnShowListener(new defpackage.jlg(afqyVar, 3));
        return afqyVar;
    }

    public final void f() {
        ahpm ahpmVarG = ahns.g();
        try {
            super.f();
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

    @Override // defpackage.ksi
    public final void g(android.content.Context context) {
        this.ao.j();
        try {
            if (this.an) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.ak == null) {
                krw krwVar = (krw) agab.aC(this, krw.class);
                ahoq ahoqVarY = ahvr.Y(215, defpackage.krt.class, "CreatePeer");
                try {
                    this.ak = krwVar.N();
                    ahoqVarY.close();
                    ((aw) this).ab.c(new ahfz(this.ao, this.am));
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
                ajwa ajwaVar = this.ao;
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
        this.ao.j();
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
        ahpm ahpmVarE = this.ao.e();
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
        ahpm ahpmVarD = this.ao.d();
        try {
            super.j();
            this.an = true;
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
        this.ao.j();
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void l() {
        this.ao.j();
        try {
            super.l();
            ahus.k(this);
            if (this.c) {
                ahus.j(this);
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
        this.ao.j();
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
        this.ao.j();
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
        this.ao.g("DialogFragment:onCancel").close();
    }

    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        ahpm ahpmVarG = this.ao.g("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
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

    @Override // defpackage.ksi
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
