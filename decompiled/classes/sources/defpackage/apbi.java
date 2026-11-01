package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class apbi implements defpackage.aout {
    public final defpackage.aorq a;
    public final long b;
    private final defpackage.aorq c;
    private final defpackage.aoro d;

    public apbi(long j, defpackage.apbi apbiVar, int i) {
        defpackage.aorr aorrVar = defpackage.aorr.a;
        this.a = new defpackage.aorq(null, aorrVar);
        this.c = new defpackage.aorq(apbiVar, aorrVar);
        this.b = j;
        this.d = new defpackage.aoro(i << 16, aorrVar);
    }

    public abstract int a();

    public abstract void k(int i, defpackage.aolr aolrVar);

    public final java.lang.Object l() {
        return this.a.a;
    }

    public final defpackage.apbi m() {
        java.lang.Object objL = l();
        if (objL == defpackage.apbh.a) {
            return null;
        }
        return (defpackage.apbi) objL;
    }

    public final defpackage.apbi n() {
        return (defpackage.apbi) this.c.a;
    }

    public final void o() {
        this.c.b(null);
    }

    public final void p() {
        java.lang.Object obj;
        defpackage.apbi apbiVarM;
        boolean z = defpackage.aosu.a;
        if (q()) {
            return;
        }
        while (true) {
            defpackage.apbi apbiVarN = n();
            while (apbiVarN != null && apbiVarN.t()) {
                apbiVarN = (defpackage.apbi) apbiVarN.c.a;
            }
            defpackage.apbi apbiVarM2 = m();
            defpackage.aooh.c(apbiVarM2);
            while (apbiVarM2.t() && (apbiVarM = apbiVarM2.m()) != null) {
                apbiVarM2 = apbiVarM;
            }
            defpackage.aorq aorqVar = apbiVarM2.c;
            do {
                obj = aorqVar.a;
            } while (!aorqVar.d(obj, ((defpackage.apbi) obj) == null ? null : apbiVarN));
            if (apbiVarN != null) {
                apbiVarN.a.c(apbiVarM2);
            }
            if (!apbiVarM2.t() || apbiVarM2.q()) {
                if (apbiVarN == null || !apbiVarN.t()) {
                    return;
                }
            }
        }
    }

    public final boolean q() {
        return m() == null;
    }

    public final void r() {
        if (this.d.b() == a()) {
            p();
        }
    }

    public final boolean s() {
        return defpackage.aoro.a.addAndGet(this.d, -65536) == a() && !q();
    }

    public final boolean t() {
        return this.d.b == a() && !q();
    }

    public final boolean u() {
        defpackage.aoro aoroVar;
        int i;
        do {
            aoroVar = this.d;
            i = aoroVar.b;
            if (i == a() && !q()) {
                return false;
            }
        } while (!aoroVar.c(i, 65536 + i));
        return true;
    }
}
