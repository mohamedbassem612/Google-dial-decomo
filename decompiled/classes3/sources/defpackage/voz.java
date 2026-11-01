package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class voz extends defpackage.voo implements ahei, aheg, ahgg, ahph, ahtq {
    private boolean ak;
    private defpackage.vpc c;
    private android.content.Context d;
    private final emy e = new emy(this, true);
    private final ajwa al = new ajwa(this);
    private final ahda am = new ahda((byte[]) null, (byte[]) null);

    @java.lang.Deprecated
    public voz() {
        afec.c();
    }

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.al.j();
        try {
            android.view.View viewM = super.M(layoutInflater, viewGroup, bundle);
            if (viewM == null) {
                wsc.aw(this, y());
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

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Set] */
    public final void aU(java.lang.String str) {
        defpackage.vpc vpcVarY = y();
        vpcVarY.s.n(rmw.aS);
        defpackage.voz vozVar = vpcVarY.r;
        android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) ((aw) vozVar).m.getParcelable("phone_account_handle");
        ahvr.ci(phoneAccountHandle);
        vpcVarY.f = phoneAccountHandle;
        vozVar.c(2132213821);
        vozVar.s(((ger) vozVar).a.d);
        vpcVarY.g = vozVar.ee(vozVar.Y(2132020941));
        vpcVarY.g.o = new jrv(vpcVarY, 8);
        vpcVarY.h = vozVar.ee(vozVar.Y(2132020862));
        vpcVarY.h.o = new jrv(vpcVarY, 9);
        vpcVarY.i = vozVar.ee(vozVar.Y(2132020861));
        vpcVarY.i.t = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://fi.google.com/account#settings/greetings"));
        vpcVarY.j = vozVar.ee(vozVar.Y(2132020849));
        ((androidx.preference.Preference) vpcVarY.j).o = new jrv(vpcVarY, 10);
        vpcVarY.l = vozVar.ee(vozVar.Y(2132020976));
        ((androidx.preference.Preference) vpcVarY.l).n = new jcj(vpcVarY, 14);
        vpcVarY.m = vozVar.ee(vozVar.Y(2132020972));
        ((androidx.preference.Preference) vpcVarY.m).n = new jcj(vpcVarY, 15);
        vpcVarY.k = vozVar.ee(vozVar.Y(2132020978));
        ((androidx.preference.Preference) vpcVarY.k).n = new jcj(vpcVarY, 16);
        vpcVarY.n = vozVar.ee(vozVar.Y(2132020968));
        com.android.dialer.common.preference.SwitchPreferenceWithClickableSummaryCompat switchPreferenceWithClickableSummaryCompat = vpcVarY.n;
        android.content.Context context = vpcVarY.p;
        switchPreferenceWithClickableSummaryCompat.p(new defpackage.akwb(context, ((java.lang.Boolean) vpcVarY.w.a()).booleanValue()).b(context.getText(2132020970), context.getString(2132020969)));
        ((androidx.preference.Preference) vpcVarY.n).n = new jcj(vpcVarY, 17);
        vpcVarY.o = vozVar.ee(vozVar.Y(2132020864));
        vpcVarY.o.o = new jrv(vpcVarY, 11);
        vpcVarY.z.a.add(vpcVarY);
        vpcVarY.y.n(new defpackage.vrn(vpcVarY.t, vpcVarY.f, 0), vpcVarY.b);
    }

    @Override // defpackage.voo
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

    @Override // defpackage.voo
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

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void ai() {
        ahpm ahpmVarE = this.al.e();
        try {
            super.ai();
            defpackage.vpc vpcVarY = y();
            vpcVarY.z.a.remove(vpcVarY);
            defpackage.vrp vrpVar = vpcVarY.t;
            vrpVar.e.g(ahvr.H(vrpVar.i, new defpackage.vmj(17), vrpVar.c), 5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
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
            defpackage.vpc vpcVarY = y();
            defpackage.voz vozVar = vpcVarY.r;
            vozVar.G().i().j(vpcVarY.d.isPresent() ? (java.lang.CharSequence) vpcVarY.d.orElseThrow() : ((androidx.preference.Preference) vozVar.dW()).r);
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
            wsc.aw(this, y());
            super.ao(view, bundle);
            defpackage.voz vozVar = y().r;
            ft$.ExternalSyntheticApiModelOutline0.m(((aw) vozVar).Q, ((androidx.preference.Preference) vozVar.dW()).r);
            url.a(((ger) vozVar).b, 519);
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
    public final defpackage.vpc y() {
        defpackage.vpc vpcVar = this.c;
        if (vpcVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.ak) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return vpcVar;
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

    @Override // defpackage.voo
    public final void g(android.content.Context context) {
        this.al.j();
        try {
            if (this.ak) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                vpd vpdVar = (vpd) agab.aC(this, vpd.class);
                ahoq ahoqVarY = ahvr.Y(1000, defpackage.voz.class, "CreatePeer");
                try {
                    this.c = vpdVar.cD();
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
            defpackage.vpc vpcVarY = y();
            vpcVarY.u.h(vpcVarY.c);
            defpackage.vrp vrpVar = vpcVarY.t;
            vrpVar.i = vrpVar.j.d(vpcVarY.r, new npc(vrpVar, 3));
            vpcVarY.v.j(ruc.bv);
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

    @Override // defpackage.voo
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
