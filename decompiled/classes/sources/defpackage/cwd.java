package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cwd extends defpackage.cmv implements defpackage.cvr, defpackage.dpf, defpackage.ddb {
    public java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object[] c;
    public androidx.compose.ui.input.pointer.PointerInputEventHandler d;
    public defpackage.cvf e = defpackage.cvy.a;
    public final defpackage.cfc f;
    public final java.lang.Object g;
    public long h;
    private defpackage.aoub i;
    private final defpackage.cfc j;
    private defpackage.cvf k;

    public cwd(java.lang.Object obj, java.lang.Object obj2, java.lang.Object[] objArr, androidx.compose.ui.input.pointer.PointerInputEventHandler pointerInputEventHandler) {
        this.a = obj;
        this.b = obj2;
        this.c = objArr;
        this.d = pointerInputEventHandler;
        defpackage.cfc cfcVar = new defpackage.cfc(new defpackage.cwc[16]);
        this.f = cfcVar;
        this.g = cfcVar;
        this.j = new defpackage.cfc(new defpackage.cwc[16]);
        this.h = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #1 {all -> 0x004f, blocks: (B:6:0x000d, B:12:0x0019, B:13:0x001e, B:14:0x001f, B:17:0x002c, B:18:0x0036, B:20:0x003f), top: B:32:0x000d }] */
    private final void w(defpackage.cvf cvfVar, cvg cvgVar) {
        java.lang.Object[] objArr;
        int i;
        int i2;
        synchronized (this.g) {
            defpackage.cfc cfcVar = this.j;
            cfcVar.o(cfcVar.b, this.f);
        }
        try {
            int iOrdinal = cvgVar.ordinal();
            if (iOrdinal == 0) {
                defpackage.cfc cfcVar2 = this.j;
                objArr = cfcVar2.a;
                i = cfcVar2.b;
                for (i2 = 0; i2 < i; i2++) {
                    ((defpackage.cwc) objArr[i2]).v(cvfVar, cvgVar);
                }
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new defpackage.aois();
                }
                defpackage.cfc cfcVar3 = this.j;
                objArr = cfcVar3.a;
                i = cfcVar3.b;
                while (i2 < i) {
                    ((defpackage.cwc) objArr[i2]).v(cvfVar, cvgVar);
                }
            } else {
                defpackage.cfc cfcVar4 = this.j;
                int i3 = cfcVar4.b - 1;
                java.lang.Object[] objArr2 = cfcVar4.a;
                if (i3 < objArr2.length) {
                    while (i3 >= 0) {
                        ((defpackage.cwc) objArr2[i3]).v(cvfVar, cvgVar);
                        i3--;
                    }
                }
            }
            this.j.g();
        } catch (java.lang.Throwable th) {
            this.j.g();
            throw th;
        }
    }

    @Override // defpackage.ddb
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // defpackage.dpf
    public final float a() {
        return defpackage.cfo.A(this).r.a();
    }

    @Override // defpackage.dpl
    public final float b() {
        return defpackage.cfo.A(this).r.b();
    }

    @Override // defpackage.cmv
    public final void cM() {
        v();
    }

    @Override // defpackage.dpl
    public final /* synthetic */ float dh(long j) {
        return defpackage.dfd.m(this, j);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float di(float f) {
        return (f / a()) + 0.0f;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float dj(int i) {
        return (i / a()) + 0.0f;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float dk(long j) {
        return defpackage.dfd.o(this, j);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float dl(float f) {
        return f * a();
    }

    @Override // defpackage.dpf
    /* JADX INFO: renamed from: do */
    public final /* synthetic */ int mo1do(long j) {
        throw null;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ int dp(float f) {
        return defpackage.dfd.p(this, f);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ long dq(long j) {
        return defpackage.dfd.q(this, j);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ long dr(long j) {
        return defpackage.dfd.r(this, j);
    }

    @Override // defpackage.dpl
    public final /* synthetic */ long ds(float f) {
        return defpackage.dfd.n(this, f);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ long dt(float f) {
        return defpackage.dfd.n(this, (f / a()) + 0.0f);
    }

    @Override // defpackage.ddb
    public final void n() {
        defpackage.cvf cvfVar = this.k;
        if (cvfVar != null) {
            java.util.List list = cvfVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((cvm) list.get(i)).d) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        cvm cvmVar = (cvm) list.get(i2);
                        long j = cvmVar.a;
                        long j2 = cvmVar.c;
                        long j3 = cvmVar.b;
                        float f = cvmVar.e;
                        boolean z = cvmVar.d;
                        arrayList.add(new cvm(j, j3, j2, false, f, j3, j2, z, z, cvmVar.i, 0L, 1.0f, 0L));
                    }
                    defpackage.cvf cvfVar2 = new defpackage.cvf(arrayList, null);
                    this.e = cvfVar2;
                    w(cvfVar2, cvg.a);
                    w(cvfVar2, cvg.b);
                    w(cvfVar2, cvg.c);
                    this.k = null;
                    return;
                }
            }
        }
    }

    @Override // defpackage.ddb
    public final void p(defpackage.cvf cvfVar, cvg cvgVar, long j) {
        this.h = j;
        if (cvgVar == cvg.a) {
            this.e = cvfVar;
        }
        if (this.i == null) {
            this.i = defpackage.aoov.an(M(), null, 4, new defpackage.dmu(this, (defpackage.aoln) null, 1), 1);
        }
        w(cvfVar, cvgVar);
        java.util.List list = cvfVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!defpackage.uu.t((cvm) list.get(i))) {
                this.k = cvfVar;
            }
        }
        cvfVar = null;
        this.k = cvfVar;
    }

    @Override // defpackage.ddb
    public final void q() {
        v();
    }

    @Override // defpackage.cvr
    public final defpackage.dgk r() {
        return defpackage.cfo.A(this).t;
    }

    @Override // defpackage.cvr
    public final java.lang.Object s(defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        defpackage.aosc aoscVar = new defpackage.aosc(defpackage.ajsz.ap(aolnVar), 1);
        aoscVar.z();
        defpackage.cwc cwcVar = new defpackage.cwc(this, aoscVar);
        synchronized (this.g) {
            this.f.n(cwcVar);
            new defpackage.aolt(defpackage.ajsz.ap(defpackage.ajsz.ao(aonnVar, cwcVar, cwcVar)), defpackage.aolu.a).w(defpackage.aojh.a);
        }
        aoscVar.d(new aib(cwcVar, 4));
        return aoscVar.k();
    }

    @Override // defpackage.cmv
    public final void u() {
        v();
    }

    public final void v() {
        defpackage.aoub aoubVar = this.i;
        if (aoubVar != null) {
            aoubVar.s(new cvq());
            this.i = null;
        }
    }

    @Override // defpackage.ddb
    public final /* synthetic */ void D() {
    }
}
