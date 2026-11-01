package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dtm extends dtr {
    public dtm(dsy dsyVar) {
        super(dsyVar);
        dsyVar.h.d();
        dsyVar.i.d();
        this.f = ((dtb) dsyVar).ar;
    }

    private final void g(defpackage.dtj dtjVar) {
        defpackage.dtj dtjVar2 = this.h;
        dtjVar2.j.add(dtjVar);
        dtjVar.k.add(dtjVar2);
    }

    public final void b() {
        dtb dtbVar = this.d;
        dtb dtbVar2 = dtbVar;
        int i = dtbVar2.b;
        int i2 = dtbVar2.c;
        float f = dtbVar2.a;
        if (dtbVar2.ar == 1) {
            if (i != -1) {
                defpackage.dtj dtjVar = this.h;
                dtjVar.k.add(((dsy) dtbVar).U.h.h);
                this.d.U.h.h.j.add(dtjVar);
                dtjVar.e = i;
            } else {
                defpackage.dtj dtjVar2 = this.h;
                if (i2 != -1) {
                    dtjVar2.k.add(((dsy) dtbVar).U.h.i);
                    this.d.U.h.i.j.add(dtjVar2);
                    dtjVar2.e = -i2;
                } else {
                    dtjVar2.b = true;
                    dtjVar2.k.add(((dsy) dtbVar).U.h.i);
                    this.d.U.h.i.j.add(dtjVar2);
                }
            }
            g(this.d.h.h);
            g(this.d.h.i);
            return;
        }
        if (i != -1) {
            defpackage.dtj dtjVar3 = this.h;
            dtjVar3.k.add(((dsy) dtbVar).U.i.h);
            this.d.U.i.h.j.add(dtjVar3);
            dtjVar3.e = i;
        } else {
            defpackage.dtj dtjVar4 = this.h;
            if (i2 != -1) {
                dtjVar4.k.add(((dsy) dtbVar).U.i.i);
                this.d.U.i.i.j.add(dtjVar4);
                dtjVar4.e = -i2;
            } else {
                dtjVar4.b = true;
                dtjVar4.k.add(((dsy) dtbVar).U.i.i);
                this.d.U.i.i.j.add(dtjVar4);
            }
        }
        g(this.d.i.h);
        g(this.d.i.i);
    }

    public final void c() {
        dtb dtbVar = this.d;
        int i = dtbVar.ar;
        defpackage.dtj dtjVar = this.h;
        if (i == 1) {
            ((dsy) dtbVar).Z = dtjVar.f;
        } else {
            ((dsy) dtbVar).aa = dtjVar.f;
        }
    }

    public final void d() {
        this.h.b();
    }

    public final boolean e() {
        return false;
    }

    public final void f() {
        defpackage.dtj dtjVar = this.h;
        if (!dtjVar.c || dtjVar.i) {
            return;
        }
        dtjVar.c((int) ((((defpackage.dtj) dtjVar.k.get(0)).f * this.d.a) + 0.5f));
    }
}
