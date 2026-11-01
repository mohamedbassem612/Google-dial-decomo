package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dtn extends dtr {
    private final void g(defpackage.dtj dtjVar) {
        defpackage.dtj dtjVar2 = this.h;
        dtjVar2.j.add(dtjVar);
        dtjVar.k.add(dtjVar2);
    }

    public final void b() {
        dsv dsvVar = this.d;
        if (dsvVar instanceof dsv) {
            defpackage.dtj dtjVar = this.h;
            dtjVar.b = true;
            dsv dsvVar2 = dsvVar;
            int i = dsvVar2.a;
            boolean z = dsvVar2.b;
            int i2 = 0;
            if (i == 0) {
                dtjVar.l = 4;
                while (i2 < dsvVar2.as) {
                    dsy dsyVar = dsvVar2.ar[i2];
                    if (z || dsyVar.ah != 8) {
                        defpackage.dtj dtjVar2 = dsyVar.h.h;
                        dtjVar2.j.add(dtjVar);
                        dtjVar.k.add(dtjVar2);
                    }
                    i2++;
                }
                g(this.d.h.h);
                g(this.d.h.i);
                return;
            }
            if (i == 1) {
                dtjVar.l = 5;
                while (i2 < dsvVar2.as) {
                    dsy dsyVar2 = dsvVar2.ar[i2];
                    if (z || dsyVar2.ah != 8) {
                        defpackage.dtj dtjVar3 = dsyVar2.h.i;
                        dtjVar3.j.add(dtjVar);
                        dtjVar.k.add(dtjVar3);
                    }
                    i2++;
                }
                g(this.d.h.h);
                g(this.d.h.i);
                return;
            }
            if (i == 2) {
                dtjVar.l = 6;
                while (i2 < dsvVar2.as) {
                    dsy dsyVar3 = dsvVar2.ar[i2];
                    if (z || dsyVar3.ah != 8) {
                        defpackage.dtj dtjVar4 = dsyVar3.i.h;
                        dtjVar4.j.add(dtjVar);
                        dtjVar.k.add(dtjVar4);
                    }
                    i2++;
                }
                g(this.d.i.h);
                g(this.d.i.i);
                return;
            }
            if (i == 3) {
                dtjVar.l = 7;
                while (i2 < dsvVar2.as) {
                    dsy dsyVar4 = dsvVar2.ar[i2];
                    if (z || dsyVar4.ah != 8) {
                        defpackage.dtj dtjVar5 = dsyVar4.i.i;
                        dtjVar5.j.add(dtjVar);
                        dtjVar.k.add(dtjVar5);
                    }
                    i2++;
                }
                g(this.d.i.h);
                g(this.d.i.i);
            }
        }
    }

    public final void c() {
        dsv dsvVar = this.d;
        if (dsvVar instanceof dsv) {
            int i = dsvVar.a;
            if (i == 0 || i == 1) {
                ((dsy) dsvVar).Z = this.h.f;
            } else {
                ((dsy) dsvVar).aa = this.h.f;
            }
        }
    }

    public final void d() {
        this.l = null;
        this.h.b();
    }

    public final boolean e() {
        return false;
    }

    public final void f() {
        dsv dsvVar = this.d;
        int i = dsvVar.a;
        defpackage.dtj dtjVar = this.h;
        java.util.Iterator it = dtjVar.k.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((defpackage.dtj) it.next()).f;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            dtjVar.c(i3 + dsvVar.c);
        } else {
            dtjVar.c(i2 + dsvVar.c);
        }
    }
}
