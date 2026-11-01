package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bzk implements defpackage.aoxi {
    final /* synthetic */ defpackage.aoop a;
    final /* synthetic */ defpackage.bzl b;
    final /* synthetic */ java.util.List c;
    final /* synthetic */ defpackage.aoot d;
    final /* synthetic */ defpackage.aoss e;

    public bzk(defpackage.aoop aoopVar, defpackage.bzl bzlVar, java.util.List list, defpackage.aoot aootVar, defpackage.aoss aossVar) {
        this.a = aoopVar;
        this.b = bzlVar;
        this.c = list;
        this.d = aootVar;
        this.e = aossVar;
    }

    /* JADX WARN: Code duplicated, block: B:88:0x0184  */
    @Override // defpackage.aoxi
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.apai apaiVar;
        int i;
        float f;
        defpackage.alm almVar;
        defpackage.alm almVar2;
        avi aviVar = (defpackage.avj) obj;
        boolean z = aviVar instanceof defpackage.avn;
        defpackage.aoop aoopVar = this.a;
        boolean z2 = aoopVar.a;
        if (z) {
            defpackage.bzl bzlVar = this.b;
            if (bzlVar.d) {
                bzlVar.i((defpackage.avn) aviVar);
            } else {
                bzlVar.i.q(aviVar);
            }
        }
        if (aviVar instanceof defpackage.avh) {
            this.c.add(aviVar);
        } else if (aviVar instanceof avi) {
            this.c.remove(aviVar.a);
        } else if (aviVar instanceof defpackage.avd) {
            this.c.add(aviVar);
            aoopVar.a = true;
        } else if (aviVar instanceof ave) {
            java.util.List list = this.c;
            list.remove(((ave) aviVar).a);
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    aoopVar.a = false;
                    break;
                }
                if (((defpackage.avj) list.get(i2)) instanceof defpackage.avd) {
                    break;
                }
                i2++;
            }
        } else if (aviVar instanceof defpackage.avb) {
            this.c.add(aviVar);
        } else {
            if (!(aviVar instanceof avc)) {
                if (aviVar instanceof ava) {
                    this.c.remove(((ava) aviVar).a);
                }
                return defpackage.aojh.a;
            }
            this.c.remove(((avc) aviVar).a);
        }
        defpackage.avj avjVar = (defpackage.avj) defpackage.ajsz.bJ(this.c);
        defpackage.bzl bzlVar2 = this.b;
        defpackage.bzx bzxVarF = bzlVar2.f(false);
        defpackage.aoot aootVar = this.d;
        if (!defpackage.aooh.n(aootVar.a, avjVar)) {
            if (avjVar != null) {
                boolean z3 = avjVar instanceof defpackage.avh;
                if (z3) {
                    defpackage.bzt bztVar = bzxVarF.f;
                    f = 0.08f;
                } else if (avjVar instanceof defpackage.avd) {
                    defpackage.bzr bzrVar = bzxVarF.e;
                    if (bzrVar instanceof defpackage.bzq) {
                        f = 0.1f;
                    } else {
                        if (!(bzrVar instanceof bzo)) {
                            boolean z4 = bzrVar instanceof bzp;
                        }
                        f = 0.0f;
                    }
                } else if (avjVar instanceof defpackage.avb) {
                    defpackage.bzn bznVar = bzxVarF.g;
                    f = 0.16f;
                } else {
                    f = 0.0f;
                }
                defpackage.alm almVar3 = defpackage.bzh.a;
                if (z3) {
                    almVar = defpackage.bzh.a;
                } else {
                    if ((avjVar instanceof defpackage.avd) || (avjVar instanceof defpackage.avb)) {
                        almVar2 = new defpackage.alm(45, defpackage.ajk.d, 2);
                    } else {
                        almVar = defpackage.bzh.a;
                    }
                    apaiVar = null;
                    i = 3;
                    defpackage.aoov.an(this.e, null, 0, new fxo(bzlVar2, f, almVar2, (defpackage.aoln) null, 1), 3);
                }
                almVar2 = almVar;
                apaiVar = null;
                i = 3;
                defpackage.aoov.an(this.e, null, 0, new fxo(bzlVar2, f, almVar2, (defpackage.aoln) null, 1), 3);
            } else {
                apaiVar = null;
                i = 3;
                defpackage.avj avjVar2 = (defpackage.avj) aootVar.a;
                boolean z5 = avjVar2 instanceof defpackage.avh;
                defpackage.alm almVar4 = defpackage.bzh.a;
                defpackage.alm almVar5 = (z5 || (avjVar2 instanceof defpackage.avd) || !(avjVar2 instanceof defpackage.avb)) ? defpackage.bzh.a : new defpackage.alm(150, defpackage.ajk.d, 2);
                defpackage.aoov.an(this.e, null, 0, new defpackage.bnl(bzlVar2, almVar5, (defpackage.aoln) null, 8), 3);
            }
            if (aviVar instanceof defpackage.avf) {
                if (bzxVarF.e instanceof bzo) {
                    boolean z6 = aoopVar.a;
                    if (z2 != z6) {
                        defpackage.aoov.an(this.e, apaiVar, 0, new bzj(bzlVar2, true == z6 ? 1.0f : 0.0f, aoopVar, bzxVarF, (defpackage.aoln) null), i);
                    }
                } else {
                    defpackage.aoov.an(this.e, apaiVar, 0, new bgx(bzlVar2, apaiVar, 20), i);
                }
            }
            aootVar.a = avjVar;
        }
        return defpackage.aojh.a;
    }
}
