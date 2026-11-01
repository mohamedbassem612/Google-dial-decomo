package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aluh implements defpackage.alug {
    private final /* synthetic */ int $cid;
    private int b = 4;
    private boolean a = true;

    public aluh(int i) {
        this.$cid = i;
    }

    private final void f(int i) {
        if (this.b != 3) {
            this.b = i;
        }
    }

    @Override // defpackage.alug
    public final void a(defpackage.alro alroVar) {
        int i = this.$cid;
        boolean z = this.a;
        if (i == 0) {
            if (z) {
                apdi apdiVar = defpackage.alqv.f;
                alroVar.c(apdiVar);
                if (((alaa) alroVar).n.l((alac) apdiVar.a)) {
                    this.b = 2;
                }
                apdi apdiVar2 = defpackage.alqy.f;
                alroVar.c(apdiVar2);
                if (((alaa) alroVar).n.l((alac) apdiVar2.a)) {
                    this.b = 4;
                    return;
                }
                return;
            }
            return;
        }
        if (z) {
            apdi apdiVar3 = defpackage.alqv.f;
            alroVar.c(apdiVar3);
            akzs akzsVar = ((alaa) alroVar).n;
            alac alacVar = (alac) apdiVar3.a;
            if (akzsVar.l(alacVar)) {
                alroVar.c(apdiVar3);
                java.lang.Object objJ = ((alaa) alroVar).n.j(alacVar);
                if (objJ == null) {
                    objJ = apdiVar3.b;
                } else {
                    apdiVar3.c(objJ);
                }
                alqu alquVar = ((defpackage.alqv) objJ).c;
                if (alquVar == null) {
                    alquVar = alqu.a;
                }
                if ((alquVar.c == 1 ? (defpackage.alqm) alquVar.d : defpackage.alqm.a).b.isEmpty()) {
                    if (!(alquVar.c == 2 ? (defpackage.alqr) alquVar.d : defpackage.alqr.a).b.isEmpty()) {
                        f(4);
                    }
                } else {
                    f(2);
                }
            }
            apdi apdiVar4 = defpackage.alqy.f;
            alroVar.c(apdiVar4);
            if (((alaa) alroVar).n.l((alac) apdiVar4.a)) {
                this.b = 3;
            }
            apdi apdiVar5 = defpackage.alqx.d;
            alroVar.c(apdiVar5);
            if (((alaa) alroVar).n.l((alac) apdiVar5.a)) {
                this.b = 1;
            }
        }
    }

    @Override // defpackage.alug
    public final void b(defpackage.alsi alsiVar) {
        int i = this.$cid;
        boolean z = this.a;
        if (i != 0) {
            if (z) {
                apdi apdiVar = defpackage.alwp.b;
                alsiVar.c(apdiVar);
                akzs akzsVar = ((alaa) alsiVar).n;
                alac alacVar = (alac) apdiVar.a;
                if (akzsVar.l(alacVar)) {
                    alsiVar.c(apdiVar);
                    java.lang.Object objJ = ((alaa) alsiVar).n.j(alacVar);
                    if (objJ == null) {
                        objJ = apdiVar.b;
                    } else {
                        apdiVar.c(objJ);
                    }
                    defpackage.alwp alwpVar = (defpackage.alwp) objJ;
                    apdi apdiVar2 = defpackage.alyf.e;
                    alwpVar.c(apdiVar2);
                    if (((alaa) alwpVar).n.l((alac) apdiVar2.a)) {
                        this.b = 1;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (z) {
            apdi apdiVar3 = defpackage.alwp.b;
            alsiVar.c(apdiVar3);
            akzs akzsVar2 = ((alaa) alsiVar).n;
            alac alacVar2 = (alac) apdiVar3.a;
            if (akzsVar2.l(alacVar2)) {
                alsiVar.c(apdiVar3);
                java.lang.Object objJ2 = ((alaa) alsiVar).n.j(alacVar2);
                if (objJ2 == null) {
                    objJ2 = apdiVar3.b;
                } else {
                    apdiVar3.c(objJ2);
                }
                defpackage.alwp alwpVar2 = (defpackage.alwp) objJ2;
                apdi apdiVar4 = defpackage.alyf.e;
                alwpVar2.c(apdiVar4);
                if (((alaa) alwpVar2).n.l((alac) apdiVar4.a)) {
                    this.b = 3;
                }
            }
        }
    }

    @Override // defpackage.alug
    public final void c() {
        if (this.$cid == 0) {
            this.b = 4;
        } else {
            this.b = 1;
            this.a = true;
        }
    }

    @Override // defpackage.alug
    public final void d() {
        int i = this.$cid;
        this.a = false;
    }

    @Override // defpackage.alug
    public final void e(akzx akzxVar) {
        int i = this.$cid;
        int i2 = this.b;
        if (i != 0) {
            akzxVar.u();
            defpackage.alwy alwyVar = (defpackage.alwy) akzxVar.b;
            defpackage.alwy alwyVar2 = defpackage.alwy.a;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            alwyVar.f = i3;
            alwyVar.b |= 4;
            akzxVar.u();
            defpackage.alwy alwyVar3 = (defpackage.alwy) akzxVar.b;
            alwyVar3.e = 3;
            alwyVar3.b |= 2;
            return;
        }
        akzxVar.u();
        defpackage.alwy alwyVar4 = (defpackage.alwy) akzxVar.b;
        defpackage.alwy alwyVar5 = defpackage.alwy.a;
        int i4 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        alwyVar4.e = i4;
        alwyVar4.b |= 2;
        akzxVar.u();
        defpackage.alwy alwyVar6 = (defpackage.alwy) akzxVar.b;
        alwyVar6.f = 0;
        alwyVar6.b |= 4;
    }

    public aluh(int i, byte[] bArr) {
        this.$cid = i;
    }
}
