package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ufg extends aomh implements aono {
    private final /* synthetic */ int $cid;
    /* synthetic */ java.lang.Object a;
    /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufg(aoln aolnVar, int i) {
        super(3, aolnVar);
        this.$cid = i;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        if (this.$cid != 0) {
            defpackage.ufg ufgVar = new defpackage.ufg((aoln) obj3, 1, null);
            ufgVar.a = (java.util.List) obj;
            ufgVar.b = (java.util.List) obj2;
            return ufgVar.b(aojh.a);
        }
        defpackage.ufg ufgVar2 = new defpackage.ufg((aoln) obj3, 0);
        ufgVar2.a = (vx) obj;
        ufgVar2.b = (defpackage.ufh) obj2;
        return ufgVar2.b(aojh.a);
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Iterable, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object next;
        if (this.$cid == 0) {
            aooc.af(obj);
            java.lang.Object obj2 = this.a;
            defpackage.vaa vaaVarBK = wsc.bK(((alad) this.b).p());
            vx vxVar = (vx) obj2;
            long jX = vxVar.x("global_blacklist_version_v2");
            akzx akzxVar = (akzx) vaaVarBK.a;
            akzxVar.u();
            defpackage.ufh ufhVar = (defpackage.ufh) akzxVar.b;
            ufhVar.b |= 1;
            ufhVar.c = jX;
            long jX2 = vxVar.x("global_blacklist_experiment_id");
            akzxVar.u();
            defpackage.ufh ufhVar2 = (defpackage.ufh) akzxVar.b;
            ufhVar2.b |= 2;
            ufhVar2.d = jX2;
            return vaaVarBK.q();
        }
        aooc.af(obj);
        ?? r9 = this.a;
        ?? r8 = this.b;
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl((java.lang.Iterable) r8, 10));
        for (defpackage.tgh tghVar : r8) {
            if (tghVar.c instanceof defpackage.tgk) {
                java.util.Iterator it = r9.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!aooh.n(((defpackage.tgh) next).a, tghVar.a));
                defpackage.tgh tghVar2 = (defpackage.tgh) next;
                if (true == ((tghVar2 != null ? tghVar2.c : null) instanceof defpackage.tgl)) {
                    tghVar = tghVar2;
                }
            }
            arrayList.add(tghVar);
        }
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufg(aoln aolnVar, int i, byte[] bArr) {
        super(3, aolnVar);
        this.$cid = i;
    }
}
