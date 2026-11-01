package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class q extends defpackage.o {
    public float af = -1.0f;
    public int ag = -1;
    public int ah = -1;
    private defpackage.n aj = this.j;
    public int ai = 0;

    public q() {
        this.q.clear();
        this.q.add(this.aj);
    }

    public final void A(int i) {
        defpackage.n nVar;
        if (this.ai != i) {
            this.ai = i;
            java.util.ArrayList arrayList = this.q;
            arrayList.clear();
            if (this.ai == 1) {
                nVar = this.i;
                this.aj = nVar;
            } else {
                nVar = this.j;
                this.aj = nVar;
            }
            arrayList.add(nVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0010, code lost:
    
        if (r2.ai != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
    
        if (r2.ai == 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return r2.aj;
     */
    @Override // defpackage.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.n t(int r3) {
        /*
            r2 = this;
            int r3 = r3 + (-1)
            r0 = 1
            if (r3 == r0) goto L13
            r1 = 2
            if (r3 == r1) goto Le
            r1 = 3
            if (r3 == r1) goto L13
            r0 = 4
            if (r3 != r0) goto L1a
        Le:
            int r3 = r2.ai
            if (r3 == 0) goto L17
            goto L1a
        L13:
            int r3 = r2.ai
            if (r3 != r0) goto L1a
        L17:
            n r2 = r2.aj
            goto L1b
        L1a:
            r2 = 0
        L1b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q.t(int):n");
    }

    @Override // defpackage.o
    public final void x(defpackage.l lVar) {
        defpackage.o oVar = this.r;
        if (oVar != null) {
            defpackage.n nVarT = oVar.t(2);
            defpackage.n nVarT2 = oVar.t(4);
            if (this.ai == 0) {
                nVarT = oVar.t(3);
                nVarT2 = oVar.t(5);
            }
            if (this.ag != -1) {
                lVar.g(defpackage.l.c(lVar, lVar.e(this.aj), lVar.e(nVarT), this.ag, false));
                return;
            }
            if (this.ah != -1) {
                lVar.g(defpackage.l.c(lVar, lVar.e(this.aj), lVar.e(nVarT2), -this.ah, false));
                return;
            }
            if (this.af != -1.0f) {
                defpackage.m mVarE = lVar.e(this.aj);
                defpackage.m mVarE2 = lVar.e(nVarT);
                defpackage.m mVarE3 = lVar.e(nVarT2);
                float f = this.af;
                defpackage.j jVarA = lVar.a();
                defpackage.i iVar = jVarA.d;
                iVar.f(mVarE, -1.0f);
                iVar.f(mVarE2, 1.0f - f);
                iVar.f(mVarE3, f);
                lVar.g(jVarA);
            }
        }
    }

    @Override // defpackage.o
    public final void y() {
        if (this.r != null) {
            int iP = defpackage.l.p(this.aj);
            if (this.ai == 1) {
                this.w = iP;
                this.x = 0;
                j(this.r.d());
                p(0);
                return;
            }
            this.w = 0;
            this.x = iP;
            p(this.r.h());
            j(0);
        }
    }
}
