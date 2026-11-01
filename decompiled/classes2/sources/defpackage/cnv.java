package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cnv extends cmv implements dcp, cnu, dat {
    public aonj a;
    private final defpackage.cnw b;
    private boolean c;

    public cnv(defpackage.cnw cnwVar, aonj aonjVar) {
        this.b = cnwVar;
        this.a = aonjVar;
        cnwVar.a = this;
    }

    public final void b() {
        this.c = false;
        this.b.p();
        cfo.w(this);
    }

    public final void cL() {
        b();
    }

    public final void cM() {
        b();
    }

    public final void cZ() {
        b();
    }

    public final long k() {
        return dpy.l(((czc) cfo.B(this, 4)).c);
    }

    public final void m() {
        b();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aoiq */
    /* JADX WARN: Type inference failed for: r4v3, types: [aonj, java.lang.Object] */
    public final void o(dbm dbmVar) throws aoiq {
        if (!this.c) {
            defpackage.cnw cnwVar = this.b;
            cnwVar.p();
            den.u(this, new defpackage.bxq(this, cnwVar, 3, null));
            if (cnwVar.b == null) {
                cwh.b("DrawResult not defined, did you forget to call onDraw?");
                throw new aoiq();
            }
            this.c = true;
        }
        defpackage.ni niVar = this.b.b;
        if (niVar == null) {
            aooh.g();
        }
        niVar.a.a(dbmVar);
    }

    public final dpf r() {
        return cfo.A(this).r;
    }

    public final dpq s() {
        return cfo.A(this).s;
    }

    public final void v() {
        b();
    }

    public final void u() {
    }
}
