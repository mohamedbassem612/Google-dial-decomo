package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cvp {
    public cxi a;
    public cvf b;
    public boolean c;
    public final /* synthetic */ defpackage.cvs d;
    public int e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cvp(defpackage.cvs cvsVar) {
        this();
        this.d = cvsVar;
        this.e = 1;
    }

    public final void a(cvf cvfVar, boolean z) {
        java.util.List list = cvfVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((defpackage.cvm) list.get(i)).c()) {
                c(cvfVar);
                return;
            }
        }
        cxi cxiVar = this.a;
        if (cxiVar == null) {
            throw new java.lang.IllegalStateException("layoutCoordinates not set");
        }
        defpackage.cvs cvsVar = this.d;
        uu.o(cvfVar, cxiVar.k(0L), new bly(this, cvsVar, 20), false);
        if (this.e == 2) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((defpackage.cvm) list.get(i2)).b();
                }
            }
            defpackage.aae aaeVar = cvfVar.f;
            if (aaeVar != null) {
                aaeVar.a = !cvsVar.d;
            }
        }
    }

    public final void b() {
        this.e = 1;
        this.d.d = false;
        this.b = null;
        this.c = false;
    }

    public final void c(cvf cvfVar) {
        if (this.e == 2) {
            cxi cxiVar = this.a;
            if (cxiVar == null) {
                throw new java.lang.IllegalStateException("layoutCoordinates not set");
            }
            uu.o(cvfVar, cxiVar.k(0L), new clc(this.d, 13), true);
        }
        this.e = 3;
    }

    public cvp() {
    }
}
