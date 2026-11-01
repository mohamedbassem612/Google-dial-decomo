package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class ahfw extends defpackage.aw implements defpackage.ahph, defpackage.ahgg, defpackage.aheg {
    public final defpackage.emy a;
    protected final defpackage.ajwa b;
    private final java.util.concurrent.atomic.AtomicBoolean c;

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public ahfw() throws afeb {
        defpackage.afec.c();
        this.b = new defpackage.ajwa(this);
        this.a = new defpackage.emy(this, true);
        this.c = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    protected static final void bi(android.view.LayoutInflater layoutInflater) {
        if (layoutInflater == null) {
            defpackage.aooh.i("inflater");
        }
    }

    private static final boolean ea(android.content.Intent intent, android.content.Context context) {
        java.lang.String str = intent.getPackage();
        if (str != null) {
            if (str.equals(context != null ? context.getPackageName() : null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aw
    public android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) throws java.io.IOException {
        defpackage.aooh.f(layoutInflater, "inflater");
        defpackage.ajsz.ak(this.b.f(), null);
        return null;
    }

    @Override // defpackage.aw, defpackage.emx
    public final defpackage.ems P() {
        return this.a;
    }

    @Override // defpackage.aw
    public final void aD(android.content.Intent intent) {
        android.content.Context contextZ = z();
        if (ea(intent, contextZ != null ? contextZ.getApplicationContext() : null)) {
            defpackage.ahqx.k(intent);
        }
        aP(intent);
    }

    @Override // defpackage.aw
    public final void aP(android.content.Intent intent) {
        android.content.Context contextZ = z();
        if (ea(intent, contextZ != null ? contextZ.getApplicationContext() : null)) {
            defpackage.ahqx.k(intent);
        }
        super.aP(intent);
    }

    @Override // defpackage.aw
    public final void aR(int i, int i2) throws java.io.IOException {
        defpackage.ajsz.ak(this.b.i(i, i2), null);
    }

    @Override // defpackage.aw
    public final void aS(int i, int i2) throws java.io.IOException {
        defpackage.ajsz.ak(this.b.i(i, i2), null);
    }

    protected final void aU(android.os.Bundle bundle) {
        super.af(bundle);
    }

    protected final void aV(int i, int i2, android.content.Intent intent) {
        super.ag(i, i2, intent);
    }

    protected final void aW(android.os.Bundle bundle) {
        super.h(bundle);
    }

    protected final void aX() {
        super.ai();
    }

    @Override // defpackage.ahph
    public final defpackage.ahqz aY() {
        return (defpackage.ahqz) this.b.b;
    }

    @Override // defpackage.ahgg
    public final java.util.Locale aZ() {
        return defpackage.agab.aE(this);
    }

    @Override // defpackage.aw
    public void af(android.os.Bundle bundle) {
        this.b.f();
        try {
            super.af(bundle);
            defpackage.ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    defpackage.ahns.l();
                } catch (java.lang.Throwable th3) {
                    aoil.b(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // defpackage.aw
    public void ag(int i, int i2, android.content.Intent intent) throws java.io.IOException {
        defpackage.ahpm ahpmVarL = this.b.l();
        try {
            super.ag(i, i2, intent);
            defpackage.ajsz.ak(ahpmVarL, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(ahpmVarL, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.aw
    public void ai() throws java.io.IOException {
        defpackage.ahpm ahpmVarE = this.b.e();
        try {
            super.ai();
            defpackage.ajsz.ak(ahpmVarE, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(ahpmVarE, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.aw
    public void al() throws java.io.IOException {
        defpackage.ahpm ahpmVarF = this.b.f();
        try {
            super.al();
            defpackage.ajsz.ak(ahpmVarF, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(ahpmVarF, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.aw
    public void an() throws java.io.IOException {
        defpackage.ahpm ahpmVarE = this.b.e();
        try {
            super.an();
            ahpmVarE.close();
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    ahpmVarE.close();
                } catch (java.lang.Throwable th3) {
                    aoil.b(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // defpackage.aw
    public void ao(android.view.View view, android.os.Bundle bundle) {
        if (view == null) {
            defpackage.aooh.i("view");
        }
        this.b.f();
        defpackage.ahns.l();
    }

    @Override // defpackage.aw
    public final void av(java.lang.Object obj) {
        this.b.k();
        super.av(obj);
    }

    @Override // defpackage.aw
    public final void aw(java.lang.Object obj) {
        this.b.k();
        super.aw(obj);
    }

    @Override // defpackage.ahph
    public final void ba(defpackage.ahqz ahqzVar, boolean z) {
        this.b.h(ahqzVar, z);
    }

    @Override // defpackage.ahph
    public final void bb(defpackage.ahqz ahqzVar) {
        this.b.c = ahqzVar;
    }

    protected final void bc() {
        super.i();
    }

    protected final void bd() {
        super.j();
    }

    protected final void be() {
        super.al();
    }

    protected final void bf() {
        super.an();
    }

    protected final void bg() {
        super.l();
    }

    protected final void bh() {
        super.m();
    }

    @Override // defpackage.aw
    public void g(android.content.Context context) {
        super.g(context);
        defpackage.emx emxVar = this.E;
        if (emxVar instanceof defpackage.ahph) {
            defpackage.ajwa ajwaVar = this.b;
            if (ajwaVar.b == null) {
                ajwaVar.h(((defpackage.ahph) emxVar).aY(), true);
            }
        }
        defpackage.ajwa ajwaVar2 = this.b;
        defpackage.aw awVar = (defpackage.aw) ajwaVar2.a;
        awVar.I().ae(new defpackage.ahpw(((defpackage.ahnm) defpackage.agab.aH(awVar.z(), defpackage.ahnm.class)).fh()));
        if (this.c.compareAndSet(false, true)) {
            this.ab.c(new defpackage.ahfz(ajwaVar2, this.a));
        }
    }

    @Override // defpackage.aw
    public void h(android.os.Bundle bundle) {
        this.b.f();
        try {
            super.h(bundle);
            defpackage.ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    defpackage.ahns.l();
                } catch (java.lang.Throwable th3) {
                    aoil.b(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // defpackage.aw
    public void i() throws java.io.IOException {
        defpackage.ahpm ahpmVarE = this.b.e();
        try {
            super.i();
            defpackage.ajsz.ak(ahpmVarE, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(ahpmVarE, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.aw
    public void k(android.os.Bundle bundle) throws java.io.IOException {
        defpackage.ajsz.ak(this.b.f(), null);
    }

    @Override // defpackage.aw
    public void l() {
        this.b.f();
        try {
            super.l();
            defpackage.ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    defpackage.ahns.l();
                } catch (java.lang.Throwable th3) {
                    aoil.b(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // defpackage.aw
    public void m() throws java.io.IOException {
        defpackage.ahpm ahpmVarF = this.b.f();
        try {
            super.m();
            defpackage.ajsz.ak(ahpmVarF, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(ahpmVarF, th);
                throw th2;
            }
        }
    }
}
