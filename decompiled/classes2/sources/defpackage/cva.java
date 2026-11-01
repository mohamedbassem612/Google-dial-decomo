package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cva extends cmv implements ddh, ddb, dan {
    public boolean b;
    public cuw c;
    public final boolean a = false;
    private final java.lang.String d = "androidx.compose.ui.input.pointer.PointerHoverIcon";

    public cva(cuw cuwVar) {
        this.c = cuwVar;
    }

    private final void e() {
        cuw cuwVar;
        aoot aootVar = new aoot();
        den.n(this, new defpackage.bxb(8));
        defpackage.cva cvaVar = (defpackage.cva) aootVar.a;
        if (cvaVar == null || (cuwVar = cvaVar.c) == null) {
            cuwVar = this.c;
        }
        d(cuwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void q() {
        if (this.b) {
            this.b = false;
            if (((cmv) this).D) {
                aoot aootVar = new aoot();
                den.n(this, new clc(aootVar, 10));
                defpackage.cva cvaVar = (defpackage.cva) aootVar.a;
                if (cvaVar != null) {
                    cvaVar.e();
                } else {
                    d(null);
                }
            }
        }
    }

    public final /* synthetic */ boolean C() {
        return false;
    }

    public final void b() {
        aoop aoopVar = new aoop();
        aoopVar.a = true;
        den.p(this, new clc(aoopVar, 11));
        if (aoopVar.a) {
            e();
        }
    }

    public final void d(cuw cuwVar) {
        dee deeVar = (dee) cfo.G(this, dfo.q);
        if (deeVar != null) {
            if (cuwVar == null) {
                cuwVar = cvj.a;
            }
            deeVar.c = cuwVar;
            cuw cuwVar2 = deeVar.c;
            boolean z = cuwVar2 instanceof cuw;
            android.content.Context context = deeVar.a;
            android.view.PointerIcon pointerIconM = z ? aa$.ExternalSyntheticApiModelOutline1.m(context, cuwVar2.a) : aa$.ExternalSyntheticApiModelOutline1.m(context, 1000);
            deg degVar = deeVar.b;
            if (aooh.n(aa$.ExternalSyntheticApiModelOutline1.m(degVar), pointerIconM)) {
                return;
            }
            aa$.ExternalSyntheticApiModelOutline1.m(degVar, pointerIconM);
        }
    }

    public final /* synthetic */ java.lang.Object db() {
        return this.d;
    }

    public final void n() {
        q();
    }

    public final void p(cvf cvfVar, defpackage.cvg cvgVar, long j) {
        if (cvgVar == defpackage.cvg.b) {
            java.util.List list = cvfVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                int i2 = ((defpackage.cvm) list.get(i)).i;
                if (!a.x(i2, 3) && !a.x(i2, 4)) {
                    int i3 = cvfVar.e;
                    if (a.x(i3, 4)) {
                        this.b = true;
                        b();
                        return;
                    } else {
                        if (a.x(i3, 5)) {
                            q();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public final void u() {
        q();
    }

    public final /* synthetic */ void D() {
    }
}
