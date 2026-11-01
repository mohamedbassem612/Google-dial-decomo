package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aht extends agn {
    public aiq a;
    public cmj b;
    private boolean e;
    private long c = -9223372034707292160L;
    private long d = dpe.c(0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, 0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY);
    private final ccp f = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cdu.c);

    public aht(aiq aiqVar, cmj cmjVar) {
        this.a = aiqVar;
        this.b = cmjVar;
    }

    public final void a(defpackage.ahs ahsVar) {
        this.f.b(ahsVar);
    }

    public final cyf cX(final cyi cyiVar, cyd cydVar, long j) {
        czc czcVarV;
        defpackage.aht ahtVar;
        defpackage.ahs ahsVar;
        long jD;
        defpackage.ahs ahsVar2;
        if (cyiVar.dw()) {
            this.d = j;
            this.e = true;
            czcVarV = cydVar.v(j);
        } else {
            czcVarV = cydVar.v(this.e ? this.d : j);
        }
        final czc czcVar = czcVarV;
        char c = ' ';
        long j2 = 4294967295L;
        final long j3 = (((long) czcVar.a) << 32) | (((long) czcVar.b) & 4294967295L);
        if (cyiVar.dw()) {
            this.c = j3;
            ahtVar = this;
            c = ' ';
            j2 = 4294967295L;
            jD = j3;
        } else {
            long j4 = this.c;
            if (true != vn.a(j4)) {
                j4 = j3;
            }
            defpackage.ahs ahsVar3 = (defpackage.ahs) this.f.a();
            if (ahsVar3 != null) {
                aii aiiVar = ahsVar3.a;
                boolean z = (anty.ah(j4, ((dpp) aiiVar.d()).a) || aiiVar.k()) ? false : true;
                if (!anty.ah(j4, ((dpp) aiiVar.c()).a) || z) {
                    ahsVar3.b = ((dpp) aiiVar.d()).a;
                    ahsVar2 = ahsVar3;
                    ahtVar = this;
                    aoov.an(M(), (aolr) null, 0, new defpackage.klr(ahsVar2, j4, ahtVar, (aoln) null, 1), 3);
                } else {
                    ahtVar = this;
                    ahsVar2 = ahsVar3;
                }
                ahsVar = ahsVar2;
            } else {
                long j5 = j4;
                ahtVar = this;
                ahsVar = new defpackage.ahs(new aii(new dpp(j5), alo.h, new dpp(4294967297L), "Animatable"), j5);
            }
            ahtVar.a(ahsVar);
            jD = dpe.d(j, ((dpp) ahsVar.a.d()).a);
        }
        final int i = (int) (jD >> c);
        final int i2 = (int) (jD & j2);
        final defpackage.aht ahtVar2 = ahtVar;
        return den.z(cyiVar, i, i2, new aonj() { // from class: ahr
            public final java.lang.Object a(java.lang.Object obj) {
                ((czb) obj).t(czcVar, this.a.b.a(j3, (((long) i) << 32) | (((long) i2) & 4294967295L), cyiVar.p()), 0.0f);
                return aojh.a;
            }
        });
    }

    public final void cZ() {
        a(null);
    }

    public final void dc() {
        this.c = -9223372034707292160L;
        this.e = false;
    }
}
