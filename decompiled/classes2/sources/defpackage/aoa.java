package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aoa extends cmv implements dau, dat, ddc, dcp {
    public aonj a;
    public aonj b;
    public android.view.View i;
    public dpf j;
    public aowi m;
    public defpackage.aok n;
    public defpackage.aol o;
    private cer p;
    private dpp q;
    public float c = Float.NaN;
    public boolean d = true;
    public long e = 9205357640488583168L;
    public float f = Float.NaN;
    public float g = Float.NaN;
    public boolean h = true;
    public final ccp k = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cdu.b);
    public long l = 9205357640488583168L;

    public aoa(aonj aonjVar, aonj aonjVar2, defpackage.aol aolVar) {
        this.a = aonjVar;
        this.b = aonjVar2;
        this.o = aolVar;
    }

    private final long f() {
        if (this.p == null) {
            defpackage.mq mqVar = new defpackage.mq(this, 12);
            ajxw ajxwVar = ceo.a;
            this.p = new cbk(mqVar, (cen) null);
        }
        cer cerVar = this.p;
        if (cerVar != null) {
            return ((cpm) cerVar.a()).a;
        }
        return 9205357640488583168L;
    }

    private final void g() {
        dpf dpfVar;
        defpackage.aok aokVar = this.n;
        if (aokVar == null || (dpfVar = this.j) == null || dpp.b(aokVar.a(), this.q)) {
            return;
        }
        aonj aonjVar = this.b;
        if (aonjVar != null) {
            aonjVar.a(new dpk(dpfVar.dq(dpy.l(aokVar.a()))));
        }
        this.q = new dpp(aokVar.a());
    }

    public final void a(cxi cxiVar) {
        this.k.b(cxiVar);
    }

    public final void b() {
        defpackage.aok aokVar;
        defpackage.aok aokVar2 = this.n;
        if (aokVar2 != null) {
            aokVar2.b();
        }
        android.view.View viewF = this.i;
        if (viewF == null) {
            viewF = wl.f(this);
        }
        this.i = viewF;
        dpf dpfVarD = this.j;
        if (dpfVarD == null) {
            dpfVarD = cfo.D(this);
        }
        this.j = dpfVarD;
        boolean z = this.d;
        long j = this.e;
        float f = this.f;
        float f2 = this.g;
        boolean z2 = this.h;
        float f3 = this.c;
        if (z) {
            aokVar = new defpackage.aok(new android.widget.Magnifier(viewF), null);
        } else {
            long jDr = dpfVarD.dr(j);
            float fDl = dpfVarD.dl(f);
            float fDl2 = dpfVarD.dl(f2);
            android.widget.Magnifier.Builder builder = new android.widget.Magnifier.Builder(viewF);
            if (jDr != 9205357640488583168L) {
                da$.ExternalSyntheticApiModelOutline0.m(builder, aopc.i(java.lang.Float.intBitsToFloat((int) (jDr >> 32))), aopc.i(java.lang.Float.intBitsToFloat((int) (jDr & 4294967295L))));
            }
            if (!java.lang.Float.isNaN(fDl)) {
                da$.ExternalSyntheticApiModelOutline0.m(builder, fDl);
            }
            if (!java.lang.Float.isNaN(fDl2)) {
                da$.ExternalSyntheticApiModelOutline0.m$1(builder, fDl2);
            }
            if (!java.lang.Float.isNaN(f3)) {
                da$.ExternalSyntheticApiModelOutline0.m$2(builder, f3);
            }
            da$.ExternalSyntheticApiModelOutline0.m(builder, z2);
            aokVar = new defpackage.aok(da$.ExternalSyntheticApiModelOutline0.m(builder), null);
        }
        this.n = aokVar;
        g();
    }

    public final void cQ(diq diqVar) {
        diqVar.a(defpackage.aob.a, new defpackage.mq(this, 11));
    }

    public final void d() {
        dpf dpfVarD = this.j;
        if (dpfVarD == null) {
            dpfVarD = cfo.D(this);
            this.j = dpfVarD;
        }
        long j = ((cpm) this.a.a(dpfVarD)).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (f() & 9223372034707292159L) == 9205357640488583168L) {
            this.l = 9205357640488583168L;
            defpackage.aok aokVar = this.n;
            if (aokVar != null) {
                aokVar.b();
                return;
            }
            return;
        }
        this.l = mni.bl(f(), j);
        if (this.n == null) {
            b();
        }
        defpackage.aok aokVar2 = this.n;
        if (aokVar2 != null) {
            long j2 = this.l;
            float f = this.c;
            long j3 = j2 >> 32;
            long j4 = j2 & 4294967295L;
            if (!java.lang.Float.isNaN(f)) {
                da$.ExternalSyntheticApiModelOutline0.m(aokVar2.a, f);
            }
            ft$.ExternalSyntheticApiModelOutline0.m(aokVar2.a, java.lang.Float.intBitsToFloat((int) j3), java.lang.Float.intBitsToFloat((int) j4));
        }
        g();
    }

    public final void dc() {
        v();
        this.m = aooh.H(0, 0, (aonj) null, 7);
        aoov.an(M(), (aolr) null, 4, new defpackage.ahb(this, (aoln) null, 13), 1);
    }

    public final void o(dbm dbmVar) {
        dbmVar.D();
        aowi aowiVar = this.m;
        if (aowiVar != null) {
            aowiVar.b(aojh.a);
        }
    }

    public final void u() {
        defpackage.aok aokVar = this.n;
        if (aokVar != null) {
            aokVar.b();
        }
        this.n = null;
    }

    public final void v() {
        den.u(this, new defpackage.mq(this, 10));
    }

    public final /* synthetic */ boolean w() {
        return false;
    }

    public final /* synthetic */ boolean x() {
        return false;
    }

    public final /* synthetic */ boolean y() {
        return true;
    }

    public final /* synthetic */ void m() {
    }
}
