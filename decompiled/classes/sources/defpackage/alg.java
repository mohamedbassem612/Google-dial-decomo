package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class alg {
    public final defpackage.alg a;
    public final defpackage.ccp b;
    public final androidx.compose.runtime.snapshots.SnapshotStateList c;
    public final androidx.compose.runtime.snapshots.SnapshotStateList d;
    public long e;
    private final defpackage.all f;
    private final defpackage.ccp g;
    private final defpackage.ccp h;
    private final defpackage.ccp i;
    private final defpackage.ccp j;
    private final defpackage.cer k;
    private final defpackage.cek l;
    private final defpackage.cek m;

    public alg(defpackage.all allVar, defpackage.alg algVar) {
        this.f = allVar;
        this.a = algVar;
        java.lang.Object objF = f();
        defpackage.cdu cduVar = defpackage.cdu.c;
        this.g = new androidx.compose.runtime.ParcelableSnapshotMutableState(objF, cduVar);
        this.h = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, cduVar);
        this.i = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.ald(f(), f()), cduVar);
        this.l = new androidx.compose.runtime.ParcelableSnapshotMutableLongState(0L);
        this.m = new androidx.compose.runtime.ParcelableSnapshotMutableLongState(Long.MIN_VALUE);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, cduVar);
        this.c = new androidx.compose.runtime.snapshots.SnapshotStateList();
        this.d = new androidx.compose.runtime.snapshots.SnapshotStateList();
        this.j = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, cduVar);
        defpackage.ml mlVar = new defpackage.ml(this, 6);
        defpackage.ajxw ajxwVar = defpackage.ceo.a;
        this.k = new defpackage.cbk(mlVar, null);
        allVar.d(this);
    }

    private final void F(defpackage.alc alcVar) {
        this.i.b(alcVar);
    }

    public final boolean A() {
        java.util.List listC = this.c.c();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            if (((ale) listC.get(i)).a != null) {
                return true;
            }
        }
        java.util.List listC2 = this.d.c();
        int size2 = listC2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((defpackage.alg) listC2.get(i2)).A()) {
                return true;
            }
        }
        return false;
    }

    public final boolean B() {
        return c() != Long.MIN_VALUE;
    }

    public final boolean C() {
        return ((java.lang.Boolean) this.j.a()).booleanValue();
    }

    public final void D(ale aleVar) {
        this.c.add(aleVar);
    }

    public final void E(java.lang.Object obj, java.lang.Object obj2) {
        u(Long.MIN_VALUE);
        defpackage.all allVar = this.f;
        allVar.v(false);
        if (!C() || !defpackage.aooh.n(f(), obj) || !defpackage.aooh.n(h(), obj2)) {
            if (!defpackage.aooh.n(f(), obj) && ((allVar instanceof defpackage.akc) || (allVar instanceof ajf))) {
                allVar.c(obj);
            }
            v(obj2);
            t(true);
            F(new defpackage.ald(obj, obj2));
        }
        java.util.List listC = this.d.c();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            defpackage.alg algVar = (defpackage.alg) listC.get(i);
            if (algVar == null) {
                defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            }
            if (algVar.C()) {
                algVar.E(algVar.f(), algVar.h());
            }
        }
        java.util.List listC2 = this.c.c();
        int size2 = listC2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ale) listC2.get(i2)).f(0L);
        }
        this.e = 0L;
    }

    public final long a() {
        java.util.List listC = this.c.c();
        int size = listC.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = java.lang.Math.max(jMax, ((ale) listC.get(i)).c());
        }
        java.util.List listC2 = this.d.c();
        int size2 = listC2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = java.lang.Math.max(jMax, ((defpackage.alg) listC2.get(i2)).a());
        }
        return jMax;
    }

    public final long b() {
        defpackage.alg algVar = this.a;
        return algVar != null ? algVar.b() : this.l.c();
    }

    public final long c() {
        return this.m.c();
    }

    public final long d() {
        return ((java.lang.Number) this.k.a()).longValue();
    }

    public final defpackage.alc e() {
        return (defpackage.alc) this.i.a();
    }

    public final java.lang.Object f() {
        return this.f.a();
    }

    public final java.lang.Object g() {
        return this.h.a();
    }

    public final java.lang.Object h() {
        return this.g.a();
    }

    public final void i(java.lang.Object obj, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1493585151);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(obj) : cavVarB.D(obj)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(this) ? 16 : 32;
        }
        if (!cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            cavVarB.s();
        } else if (C()) {
            cavVarB.u(467722849);
            ((defpackage.cbt) cavVarB).W(false);
        } else {
            cavVarB.u(466062241);
            z(obj);
            int i4 = i2 & 112;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            byte[] bArr = null;
            if (i4 == 32 || objR == defpackage.cau.a) {
                defpackage.ml mlVar = new defpackage.ml(this, 7);
                defpackage.ajxw ajxwVar = defpackage.ceo.a;
                defpackage.cbk cbkVar = new defpackage.cbk(mlVar, null);
                cbtVar.ab(cbkVar);
                objR = cbkVar;
            }
            if (((java.lang.Boolean) ((defpackage.cer) objR).a()).booleanValue()) {
                cavVarB.u(466470356);
                java.lang.Object objR2 = cbtVar.R();
                java.lang.Object obj2 = defpackage.cau.a;
                if (objR2 == obj2) {
                    defpackage.cdy cdyVar = new defpackage.cdy(cbtVar.v, defpackage.aols.a);
                    cbtVar.ab(cdyVar);
                    objR2 = cdyVar;
                }
                defpackage.aoss aossVar = (defpackage.aoss) objR2;
                boolean zD = cavVarB.D(aossVar) | (i4 == 32);
                java.lang.Object objR3 = cbtVar.R();
                if (zD || objR3 == obj2) {
                    objR3 = new defpackage.nz(aossVar, this, 11, bArr);
                    cbtVar.ab(objR3);
                }
                defpackage.cbp.b(aossVar, this, (defpackage.aonj) objR3, cavVarB);
                cbtVar.W(false);
            } else {
                cavVarB.u(467712929);
                cbtVar.W(false);
            }
            cbtVar.W(false);
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bdx(this, obj, i, 1);
        }
    }

    public final void j() {
        java.util.List listC = this.c.c();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            ale aleVar = (ale) listC.get(i);
            aleVar.b = null;
            aleVar.a = null;
            aleVar.c = false;
        }
        java.util.List listC2 = this.d.c();
        int size2 = listC2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((defpackage.alg) listC2.get(i2)).j();
        }
    }

    public final void k() {
        m();
        this.f.e();
    }

    public final void l(long j, boolean z) {
        if (c() == Long.MIN_VALUE) {
            n(j);
        } else {
            defpackage.all allVar = this.f;
            if (!allVar.w()) {
                allVar.v(true);
            }
        }
        w(false);
        java.util.List listC = this.c.c();
        int size = listC.size();
        boolean zN = true;
        for (int i = 0; i < size; i++) {
            ale aleVar = (ale) listC.get(i);
            if (!aleVar.n()) {
                long jA = z ? aleVar.e().a() : j;
                aleVar.k(aleVar.e().c(jA));
                aleVar.d = aleVar.e().b(jA);
                if (wo.a(aleVar.e(), jA)) {
                    aleVar.i(true);
                }
            }
            zN &= aleVar.n();
        }
        java.util.List listC2 = this.d.c();
        int size2 = listC2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            defpackage.alg algVar = (defpackage.alg) listC2.get(i2);
            if (!defpackage.aooh.n(algVar.h(), algVar.f())) {
                algVar.l(j, z);
            }
            zN &= defpackage.aooh.n(algVar.h(), algVar.f());
        }
        if (zN) {
            m();
        }
    }

    public final void m() {
        u(Long.MIN_VALUE);
        defpackage.all allVar = this.f;
        if ((allVar instanceof defpackage.akc) || (allVar instanceof ajf)) {
            allVar.c(h());
        }
        s(0L);
        allVar.v(false);
        java.util.List listC = this.d.c();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.alg) listC.get(i)).m();
        }
    }

    public final void n(long j) {
        u(j);
        this.f.v(true);
    }

    public final void o(ale aleVar) {
        this.c.remove(aleVar);
    }

    public final void p(float f) {
        java.util.List listC = this.c.c();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            ale aleVar = (ale) listC.get(i);
            if (f == -4.0f || f == -5.0f) {
                ala alaVar = aleVar.b;
                if (alaVar != null) {
                    aleVar.e().h(alaVar.a);
                    aleVar.a = null;
                    aleVar.b = null;
                }
                java.lang.Object obj = f == -4.0f ? aleVar.e().b : aleVar.e().a;
                aleVar.e().h(obj);
                aleVar.e().i(obj);
                aleVar.k(obj);
                aleVar.h(aleVar.e().a());
            } else {
                aleVar.j(f);
            }
        }
        java.util.List listC2 = this.d.c();
        int size2 = listC2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((defpackage.alg) listC2.get(i2)).p(f);
        }
    }

    public final void q(long j) {
        if (c() == Long.MIN_VALUE) {
            u(j);
        }
        s(j);
        w(false);
        java.util.List listC = this.c.c();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            ((ale) listC.get(i)).f(j);
        }
        java.util.List listC2 = this.d.c();
        int size2 = listC2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            defpackage.alg algVar = (defpackage.alg) listC2.get(i2);
            if (!defpackage.aooh.n(algVar.h(), algVar.f())) {
                algVar.q(j);
            }
        }
    }

    public final void r(akh akhVar) {
        java.util.List listC = this.c.c();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            ale aleVar = (ale) listC.get(i);
            if (!defpackage.aooh.n(aleVar.e().a, aleVar.e().b)) {
                aleVar.b = aleVar.e();
                aleVar.a = akhVar;
            }
            aleVar.g(new ala(aleVar.e, aleVar.g, aleVar.a(), aleVar.a(), aleVar.d.c()));
            aleVar.h(aleVar.e().a());
            aleVar.c = true;
        }
        java.util.List listC2 = this.d.c();
        int size2 = listC2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((defpackage.alg) listC2.get(i2)).r(akhVar);
        }
    }

    public final void s(long j) {
        if (this.a == null) {
            this.l.h(j);
        }
    }

    public final void t(boolean z) {
        this.j.b(java.lang.Boolean.valueOf(z));
    }

    public final java.lang.String toString() {
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = this.c;
        int iA = snapshotStateList.a();
        java.lang.String str = "Transition animation values: ";
        for (int i = 0; i < iA; i++) {
            str = str + ((ale) snapshotStateList.get(i)) + ", ";
        }
        return str;
    }

    public final void u(long j) {
        this.m.h(j);
    }

    public final void v(java.lang.Object obj) {
        this.g.b(obj);
    }

    public final void w(boolean z) {
        this.b.b(java.lang.Boolean.valueOf(z));
    }

    public final void x() {
        ala alaVar;
        java.util.List listC = this.c.c();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            ale aleVar = (ale) listC.get(i);
            akh akhVar = aleVar.a;
            if (akhVar != null && (alaVar = aleVar.b) != null) {
                long j = defpackage.aopc.j(akhVar.g * ((double) akhVar.d));
                java.lang.Object objC = alaVar.c(j);
                if (aleVar.c) {
                    aleVar.e().i(objC);
                }
                aleVar.e().h(objC);
                aleVar.h(aleVar.e().a());
                if (aleVar.b() == -2.0f || aleVar.c) {
                    aleVar.k(objC);
                } else {
                    aleVar.f(aleVar.f.b());
                }
                if (j >= akhVar.g) {
                    aleVar.a = null;
                    aleVar.b = null;
                } else {
                    akhVar.c = false;
                }
            }
        }
        java.util.List listC2 = this.d.c();
        int size2 = listC2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((defpackage.alg) listC2.get(i2)).x();
        }
    }

    public final void y(java.lang.Object obj) {
        java.lang.Object objG = g();
        boolean z = objG != null && obj == null && defpackage.aooh.n(h(), f());
        this.h.b(obj);
        if (z) {
            F(new defpackage.ald(objG, h()));
            this.f.c(objG);
            if (!B()) {
                w(true);
            }
            java.util.List listC = this.c.c();
            int size = listC.size();
            for (int i = 0; i < size; i++) {
                ((ale) listC.get(i)).j(-2.0f);
            }
        }
    }

    public final void z(java.lang.Object obj) {
        java.lang.Object objH = h();
        if (defpackage.aooh.n(objH, obj)) {
            return;
        }
        F(new defpackage.ald(objH, obj));
        this.f.c(objH);
        v(obj);
        if (!B()) {
            w(true);
        }
        java.util.List listBZ = defpackage.ajsz.bZ(this.c);
        int size = listBZ.size();
        for (int i = 0; i < size; i++) {
            ((ale) listBZ.get(i)).j(-2.0f);
        }
    }
}
