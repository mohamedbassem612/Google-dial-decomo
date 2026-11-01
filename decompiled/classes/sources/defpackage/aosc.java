package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aosc extends defpackage.aotf implements defpackage.aosb, defpackage.aome, defpackage.aovq {
    public final defpackage.aoln a;
    public final defpackage.aolr b;
    public final defpackage.aoro c;
    public final defpackage.aorq d;
    private final defpackage.aorq f;

    public aosc(defpackage.aoln aolnVar, int i) {
        super(i);
        this.a = aolnVar;
        boolean z = defpackage.aosu.a;
        this.b = aolnVar.u();
        defpackage.aorr aorrVar = defpackage.aorr.a;
        this.c = new defpackage.aoro(536870911, aorrVar);
        this.d = new defpackage.aorq(defpackage.aort.a, aorrVar);
        this.f = new defpackage.aorq(null, aorrVar);
    }

    private final defpackage.aotj I() {
        defpackage.aoub aoubVar = (defpackage.aoub) this.b.get(defpackage.aoub.d);
        if (aoubVar == null) {
            return null;
        }
        defpackage.aotj aotjVarU = defpackage.aooc.U(aoubVar, true, new defpackage.aosf(this));
        this.f.d(null, aotjVarU);
        return aotjVarU;
    }

    private final void J(int i) throws defpackage.aotd {
        defpackage.aoro aoroVar;
        int i2;
        do {
            aoroVar = this.c;
            i2 = aoroVar.b;
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("Already resumed");
                }
                boolean z = defpackage.aosu.a;
                defpackage.aoln aolnVarR = r();
                boolean z2 = i == 4;
                if (z2 || !(aolnVarR instanceof defpackage.apbn) || defpackage.aosv.g(i) != defpackage.aosv.g(this.e)) {
                    defpackage.aosv.f(this, aolnVarR, z2);
                    return;
                }
                defpackage.apbn apbnVar = (defpackage.apbn) aolnVarR;
                defpackage.aosp aospVar = apbnVar.a;
                defpackage.aolr aolrVarU = apbnVar.u();
                try {
                    if (aospVar.dB(aolrVarU)) {
                        try {
                            aospVar.a(aolrVarU, this);
                            return;
                        } catch (java.lang.Throwable th) {
                            throw new defpackage.aotd(th, aospVar, aolrVarU);
                        }
                    }
                    java.lang.ThreadLocal threadLocal = defpackage.aovj.a;
                    defpackage.aotm aotmVarA = defpackage.aovj.a();
                    if (aotmVarA.q()) {
                        aotmVarA.o(this);
                        return;
                    }
                    aotmVarA.p(true);
                    try {
                        defpackage.aosv.f(this, r(), true);
                        do {
                        } while (aotmVarA.s());
                    } catch (java.lang.Throwable th2) {
                        try {
                            H(th2);
                        } finally {
                            aotmVarA.n(true);
                        }
                    }
                    return;
                } catch (java.lang.Throwable th3) {
                    throw new defpackage.aotd(th3, aospVar, aolrVarU);
                }
            }
        } while (!aoroVar.c(i2, (536870911 & i2) + 1073741824));
    }

    private static final void K(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.IllegalStateException(defpackage.a.bi(obj2, obj, "It's prohibited to register multiple handlers, tried to register ", ", already has "));
    }

    private static final java.lang.Object L(defpackage.aout aoutVar, java.lang.Object obj, int i, defpackage.aono aonoVar) {
        if (obj instanceof defpackage.aosk) {
            boolean z = defpackage.aosu.a;
            return obj;
        }
        if (!defpackage.aosv.g(i)) {
            return obj;
        }
        if (aonoVar == null) {
            if (!(aoutVar instanceof defpackage.aosa)) {
                return obj;
            }
            aonoVar = null;
        }
        return new defpackage.aosj(obj, aoutVar instanceof defpackage.aosa ? (defpackage.aosa) aoutVar : null, aonoVar, null);
    }

    private final void M(defpackage.apbi apbiVar) {
        int i = this.c.b & 536870911;
        if (i == 536870911) {
            throw new java.lang.IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            apbiVar.k(i, this.b);
        } catch (java.lang.Throwable th) {
            defpackage.aolr aolrVar = this.b;
            toString();
            defpackage.aosv.t(aolrVar, new defpackage.aosl("Exception in invokeOnCancellation handler for ".concat(toString()), th));
        }
    }

    public final void A(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        boolean z = defpackage.aosu.a;
        while (true) {
            defpackage.aorq aorqVar = this.d;
            java.lang.Object obj4 = aorqVar.a;
            j$.util.Objects.checkIndex(0, 6);
            if (obj4 != null) {
                if (obj4 instanceof defpackage.aort) {
                    if (aorqVar.d(obj4, obj)) {
                        return;
                    }
                } else if ((obj4 instanceof defpackage.aosa) || (obj4 instanceof defpackage.apbi)) {
                    K(obj, obj4);
                } else {
                    if (obj4 instanceof defpackage.aosk) {
                        defpackage.aosk aoskVar = (defpackage.aosk) obj4;
                        if (!aoskVar.a()) {
                            K(obj, obj4);
                        }
                        if (obj4 instanceof defpackage.aose) {
                            java.lang.Throwable th = aoskVar.b;
                            if (obj instanceof defpackage.aosa) {
                                t((defpackage.aosa) obj, th);
                                return;
                            }
                            if (obj == null) {
                                defpackage.aooh.h("null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                obj = null;
                            }
                            M((defpackage.apbi) obj);
                            return;
                        }
                        return;
                    }
                    if (obj4 instanceof defpackage.aosj) {
                        defpackage.aosj aosjVar = (defpackage.aosj) obj4;
                        if (aosjVar.b != null) {
                            K(obj, obj4);
                        }
                        if (obj instanceof defpackage.apbi) {
                            return;
                        }
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                            obj3 = null;
                        } else {
                            obj3 = obj;
                        }
                        defpackage.aosa aosaVar = (defpackage.aosa) obj3;
                        if (aosjVar.a()) {
                            t(aosaVar, aosjVar.e);
                            return;
                        } else if (aorqVar.d(obj4, defpackage.aosj.b(aosjVar, aosaVar, null, 29))) {
                            return;
                        }
                    }
                }
            }
            if (obj instanceof defpackage.apbi) {
                return;
            }
            if (obj == null) {
                defpackage.aooh.h("null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                obj2 = null;
            } else {
                obj2 = obj;
            }
            if (aorqVar.d(obj4, new defpackage.aosj(obj4, (defpackage.aosa) obj2, null, null))) {
                return;
            }
        }
    }

    public final void B() {
        defpackage.aorq aorqVar;
        defpackage.apcm apcmVar;
        defpackage.aoln aolnVar = this.a;
        java.lang.Throwable th = null;
        defpackage.apbn apbnVar = aolnVar instanceof defpackage.apbn ? (defpackage.apbn) aolnVar : null;
        if (apbnVar != null) {
            do {
                aorqVar = apbnVar.f;
                java.lang.Object obj = aorqVar.a;
                apcmVar = defpackage.apbo.b;
                if (obj != apcmVar) {
                    if (!(obj instanceof java.lang.Throwable)) {
                        java.util.Objects.toString(obj);
                        throw new java.lang.IllegalStateException("Inconsistent state ".concat(java.lang.String.valueOf(obj)));
                    }
                    if (!aorqVar.d(obj, null)) {
                        throw new java.lang.IllegalArgumentException("Failed requirement.");
                    }
                    th = (java.lang.Throwable) obj;
                    break;
                }
            } while (!aorqVar.d(apcmVar, this));
            if (th != null) {
                x();
                g(th);
            }
        }
    }

    public final void C(java.lang.Object obj, int i, defpackage.aono aonoVar) throws defpackage.aotd {
        defpackage.aorq aorqVar;
        java.lang.Object obj2;
        do {
            aorqVar = this.d;
            obj2 = aorqVar.a;
            int iAg = defpackage.aoov.ag(obj2);
            if (iAg != 0) {
                if (iAg == 1) {
                    defpackage.aose aoseVar = (defpackage.aose) obj2;
                    if (aoseVar.a.b()) {
                        if (aonoVar != null) {
                            v(aonoVar, aoseVar.b, obj);
                            return;
                        }
                        return;
                    }
                }
                java.util.Objects.toString(obj);
                throw new java.lang.IllegalStateException("Already resumed, but proposed with update ".concat(java.lang.String.valueOf(obj)));
            }
        } while (!aorqVar.d(obj2, L((defpackage.aout) obj2, obj, i, aonoVar)));
        y();
        J(i);
    }

    public final boolean D() {
        if (this.e == 2) {
            defpackage.aoln aolnVar = this.a;
            if (aolnVar == null) {
                defpackage.aooh.h("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            }
            if (((defpackage.apbn) aolnVar).f.a != null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aovq
    public final void E(defpackage.apbi apbiVar, int i) {
        defpackage.aoro aoroVar;
        int i2;
        do {
            aoroVar = this.c;
            i2 = aoroVar.b;
            if ((i2 & 536870911) != 536870911) {
                throw new java.lang.IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!aoroVar.c(i2, ((i2 >> 29) << 29) + i));
        A(apbiVar);
    }

    @Override // defpackage.aotf
    public final void F(java.lang.Throwable th) {
        while (true) {
            defpackage.aorq aorqVar = this.d;
            java.lang.Object obj = aorqVar.a;
            j$.util.Objects.checkIndex(0, 4);
            if (obj != null) {
                if (obj instanceof defpackage.aout) {
                    throw new java.lang.IllegalStateException("Not completed");
                }
                if (obj instanceof defpackage.aosk) {
                    return;
                }
                if (obj instanceof defpackage.aosj) {
                    defpackage.aosj aosjVar = (defpackage.aosj) obj;
                    if (aosjVar.a()) {
                        throw new java.lang.IllegalStateException("Must be called at most once");
                    }
                    if (aorqVar.d(obj, defpackage.aosj.b(aosjVar, null, th, 15))) {
                        defpackage.aosa aosaVar = aosjVar.b;
                        if (aosaVar != null) {
                            t(aosaVar, th);
                        }
                        defpackage.aono aonoVar = aosjVar.c;
                        if (aonoVar != null) {
                            v(aonoVar, th, aosjVar.a);
                            return;
                        }
                        return;
                    }
                }
            }
            if (aorqVar.d(obj, new defpackage.aosj(obj, null, null, th))) {
                return;
            }
        }
    }

    public final defpackage.apcm G(java.lang.Object obj, defpackage.aono aonoVar) {
        defpackage.aorq aorqVar;
        java.lang.Object obj2;
        do {
            aorqVar = this.d;
            obj2 = aorqVar.a;
            j$.util.Objects.checkIndex(0, 3);
            if (obj2 == null || !(obj2 instanceof defpackage.aout)) {
                return null;
            }
        } while (!aorqVar.d(obj2, L((defpackage.aout) obj2, obj, this.e, aonoVar)));
        y();
        return defpackage.aosd.a;
    }

    @Override // defpackage.aosb
    public final void c(java.lang.Object obj) throws defpackage.aotd {
        boolean z = defpackage.aosu.a;
        J(this.e);
    }

    @Override // defpackage.aome
    public final java.lang.StackTraceElement cJ() {
        return null;
    }

    @Override // defpackage.aome
    public final defpackage.aome cK() {
        defpackage.aoln aolnVar = this.a;
        if (aolnVar instanceof defpackage.aome) {
            return (defpackage.aome) aolnVar;
        }
        return null;
    }

    @Override // defpackage.aosb
    public final void d(defpackage.aonj aonjVar) {
        A(new defpackage.aorz(aonjVar, 0));
    }

    @Override // defpackage.aosb
    public final void e(java.lang.Object obj, defpackage.aono aonoVar) throws defpackage.aotd {
        C(obj, this.e, aonoVar);
    }

    @Override // defpackage.aosb
    public final void f(defpackage.aosp aospVar, java.lang.Object obj) throws defpackage.aotd {
        defpackage.aoln aolnVar = this.a;
        defpackage.apbn apbnVar = aolnVar instanceof defpackage.apbn ? (defpackage.apbn) aolnVar : null;
        C(obj, (apbnVar != null ? apbnVar.a : null) == aospVar ? 4 : this.e, null);
    }

    @Override // defpackage.aosb
    public final boolean g(java.lang.Throwable th) throws defpackage.aotd {
        defpackage.aorq aorqVar;
        java.lang.Object obj;
        do {
            aorqVar = this.d;
            obj = aorqVar.a;
            if (!(obj instanceof defpackage.aout)) {
                return false;
            }
        } while (!aorqVar.d(obj, new defpackage.aose(this, th, (obj instanceof defpackage.aosa) || (obj instanceof defpackage.apbi))));
        defpackage.aout aoutVar = (defpackage.aout) obj;
        j$.util.Objects.checkIndex(0, 3);
        if (aoutVar != null) {
            if (aoutVar instanceof defpackage.aosa) {
                t((defpackage.aosa) obj, th);
            } else if (aoutVar instanceof defpackage.apbi) {
                M((defpackage.apbi) obj);
            }
        }
        y();
        J(this.e);
        return true;
    }

    @Override // defpackage.aosb
    public final boolean h() {
        return l() instanceof defpackage.aout;
    }

    @Override // defpackage.aosb
    public final boolean i() {
        return !(l() instanceof defpackage.aout);
    }

    @Override // defpackage.aosb
    public final java.lang.Object j(java.lang.Object obj, defpackage.aono aonoVar) {
        return G(obj, aonoVar);
    }

    public final java.lang.Object k() {
        defpackage.aoro aoroVar;
        int i;
        defpackage.aoub aoubVar;
        boolean zD = D();
        do {
            aoroVar = this.c;
            i = aoroVar.b;
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("Already suspended");
                }
                if (zD) {
                    B();
                }
                java.lang.Object objL = l();
                if (objL instanceof defpackage.aosk) {
                    java.lang.Throwable th = ((defpackage.aosk) objL).b;
                    if (defpackage.aosu.b) {
                        throw defpackage.apcl.a(th, this);
                    }
                    throw th;
                }
                if (!defpackage.aosv.g(this.e) || (aoubVar = (defpackage.aoub) this.b.get(defpackage.aoub.d)) == null || aoubVar.t()) {
                    return m(objL);
                }
                java.util.concurrent.CancellationException cancellationExceptionO = aoubVar.o();
                F(cancellationExceptionO);
                if (defpackage.aosu.b) {
                    throw defpackage.apcl.a(cancellationExceptionO, this);
                }
                throw cancellationExceptionO;
            }
        } while (!aoroVar.c(i, (536870911 & i) + 536870912));
        if (s() == null) {
            I();
        }
        if (zD) {
            B();
        }
        return defpackage.aolu.a;
    }

    public final java.lang.Object l() {
        return this.d.a;
    }

    @Override // defpackage.aotf
    public final java.lang.Object m(java.lang.Object obj) {
        return obj instanceof defpackage.aosj ? ((defpackage.aosj) obj).a : obj;
    }

    @Override // defpackage.aotf
    public final java.lang.Object n() {
        return l();
    }

    protected java.lang.String o() {
        return "CancellableContinuation";
    }

    public java.lang.Throwable p(defpackage.aoub aoubVar) {
        return aoubVar.o();
    }

    @Override // defpackage.aotf
    public final java.lang.Throwable q(java.lang.Object obj) {
        java.lang.Throwable thQ = super.q(obj);
        if (thQ == null) {
            return null;
        }
        defpackage.aoln aolnVar = this.a;
        return (defpackage.aosu.b && (aolnVar instanceof defpackage.aome)) ? defpackage.apcl.a(thQ, (defpackage.aome) aolnVar) : thQ;
    }

    @Override // defpackage.aotf
    public final defpackage.aoln r() {
        return this.a;
    }

    public final defpackage.aotj s() {
        return (defpackage.aotj) this.f.a;
    }

    public final void t(defpackage.aosa aosaVar, java.lang.Throwable th) {
        try {
            aosaVar.b(th);
        } catch (java.lang.Throwable th2) {
            defpackage.aolr aolrVar = this.b;
            toString();
            defpackage.aosv.t(aolrVar, new defpackage.aosl("Exception in invokeOnCancellation handler for ".concat(toString()), th2));
        }
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String strC = defpackage.aosv.c(this.a);
        int iAg = defpackage.aoov.ag(l());
        if (iAg != 0) {
            str = iAg != 1 ? "Completed" : "Cancelled";
        } else {
            str = "Active";
        }
        return o() + '(' + strC + "){" + str + "}@" + defpackage.aosv.b(this);
    }

    @Override // defpackage.aoln
    public final defpackage.aolr u() {
        return this.b;
    }

    public final void v(defpackage.aono aonoVar, java.lang.Throwable th, java.lang.Object obj) {
        try {
            aonoVar.a(th, obj, this.b);
        } catch (java.lang.Throwable th2) {
            defpackage.aolr aolrVar = this.b;
            toString();
            defpackage.aosv.t(aolrVar, new defpackage.aosl("Exception in resume onCancellation handler for ".concat(toString()), th2));
        }
    }

    @Override // defpackage.aoln
    public final void w(java.lang.Object obj) throws defpackage.aotd {
        java.lang.Throwable thC = defpackage.aoiw.c(obj);
        if (thC != null) {
            if (defpackage.aosu.b) {
                thC = defpackage.apcl.a(thC, this);
            }
            obj = new defpackage.aosk(thC, false);
        }
        C(obj, this.e, null);
    }

    public final void x() {
        defpackage.aotj aotjVarS = s();
        if (aotjVarS != null) {
            aotjVarS.fz();
            this.f.c(defpackage.aous.a);
        }
    }

    public final void y() {
        if (D()) {
            return;
        }
        x();
    }

    public final void z() {
        defpackage.aotj aotjVarI = I();
        if (aotjVarI == null || !i()) {
            return;
        }
        aotjVarI.fz();
        this.f.c(defpackage.aous.a);
    }
}
