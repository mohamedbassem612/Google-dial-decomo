package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ffp extends defpackage.fhi {
    public defpackage.ffn e;
    private final boolean g;
    private final defpackage.erl h;
    private final defpackage.erk i;
    private defpackage.ffm j;
    private boolean k;
    private boolean l;
    private boolean m;

    public ffp(defpackage.ffw ffwVar, boolean z) {
        boolean z2;
        super(ffwVar);
        if (z) {
            ffwVar.q();
            z2 = true;
        } else {
            z2 = false;
        }
        this.g = z2;
        this.h = new defpackage.erl();
        this.i = new defpackage.erk();
        ffwVar.p();
        this.e = defpackage.ffn.q(ffwVar.F());
    }

    private final java.lang.Object H(java.lang.Object obj) {
        defpackage.ffn ffnVar = this.e;
        java.lang.Object obj2 = defpackage.ffn.c;
        return (ffnVar.d == null || !obj.equals(defpackage.ffn.c)) ? obj : this.e.d;
    }

    private final boolean I(long j) {
        defpackage.ffm ffmVar = this.j;
        int iA = this.e.a(ffmVar.a.a);
        if (iA == -1) {
            return false;
        }
        defpackage.ffn ffnVar = this.e;
        defpackage.erk erkVar = this.i;
        ffnVar.d(iA, erkVar, false);
        long j2 = erkVar.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = java.lang.Math.max(0L, j2 - 1);
        }
        ffmVar.e = j;
        return true;
    }

    @Override // defpackage.fhi
    protected final defpackage.ffu B(defpackage.ffu ffuVar) {
        defpackage.ffn ffnVar = this.e;
        java.lang.Object obj = defpackage.ffn.c;
        java.lang.Object obj2 = ffnVar.d;
        java.lang.Object obj3 = ffuVar.a;
        if (obj2 != null && this.e.d.equals(obj3)) {
            obj3 = defpackage.ffn.c;
        }
        return ffuVar.a(obj3);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005a  */
    @Override // defpackage.fhi
    protected final void C(defpackage.erm ermVar) {
        long j;
        defpackage.ffu ffuVarA = null;
        if (this.l) {
            this.e = this.e.p(ermVar);
            defpackage.ffm ffmVar = this.j;
            if (ffmVar != null) {
                I(ffmVar.e);
            }
        } else if (ermVar.n()) {
            this.e = this.m ? this.e.p(ermVar) : new defpackage.ffn(ermVar, defpackage.erl.a, defpackage.ffn.c);
        } else {
            defpackage.erl erlVar = this.h;
            ermVar.e(0, erlVar, 0L);
            java.lang.Object obj = erlVar.b;
            defpackage.ffm ffmVar2 = this.j;
            if (ffmVar2 != null) {
                this.e.m(ffmVar2.a.a, this.i);
                j = ffmVar2.b;
                this.e.e(0, erlVar, 0L);
                if (j == 0) {
                    j = 0;
                }
            } else {
                j = 0;
            }
            android.util.Pair pairK = ermVar.k(erlVar, this.i, 0, j);
            java.lang.Object obj2 = pairK.first;
            long jLongValue = ((java.lang.Long) pairK.second).longValue();
            this.e = this.m ? this.e.p(ermVar) : new defpackage.ffn(ermVar, obj, obj2);
            defpackage.ffm ffmVar3 = this.j;
            if (ffmVar3 != null && I(jLongValue)) {
                defpackage.ffu ffuVar = ffmVar3.a;
                ffuVarA = ffuVar.a(H(ffuVar.a));
            }
        }
        this.m = true;
        this.l = true;
        j(this.e);
        if (ffuVarA != null) {
            defpackage.ffm ffmVar4 = this.j;
            ahvr.ci(ffmVar4);
            ffmVar4.k(ffuVarA);
        }
    }

    @Override // defpackage.fhi
    public final void D() {
        if (this.g) {
            return;
        }
        this.k = true;
        G();
    }

    @Override // defpackage.fhi, defpackage.ffw
    public final void E(defpackage.ffs ffsVar) {
        defpackage.ffm ffmVar = (defpackage.ffm) ffsVar;
        if (ffmVar.d != null) {
            defpackage.ffw ffwVar = ffmVar.c;
            ahvr.ci(ffwVar);
            ffwVar.E(ffmVar.d);
        }
        if (ffsVar == this.j) {
            this.j = null;
        }
    }

    @Override // defpackage.ffb, defpackage.few
    public final void l() {
        this.l = false;
        this.k = false;
        super.l();
    }

    @Override // defpackage.fhi, defpackage.few, defpackage.ffw
    public final void o(defpackage.eqt eqtVar) {
        if (this.m) {
            defpackage.ffn ffnVar = this.e;
            defpackage.erm ermVar = ffnVar.b;
            this.e = ffnVar.p(ermVar instanceof defpackage.fhf ? new defpackage.fhf(((defpackage.fhf) ermVar).b, eqtVar) : new defpackage.fhf(ermVar, eqtVar));
        } else {
            this.e = defpackage.ffn.q(eqtVar);
        }
        this.f.o(eqtVar);
    }

    @Override // defpackage.fhi, defpackage.ffw
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final defpackage.ffm A(defpackage.ffu ffuVar, defpackage.fio fioVar, long j) {
        defpackage.ffm ffmVar = new defpackage.ffm(ffuVar, fioVar, j);
        ahvr.bY(ffmVar.c == null);
        ffmVar.c = this.f;
        if (this.l) {
            ffmVar.k(ffuVar.a(H(ffuVar.a)));
        } else {
            this.j = ffmVar;
            if (!this.k) {
                this.k = true;
                G();
            }
        }
        return ffmVar;
    }
}
