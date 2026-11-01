package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class fys extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    /* synthetic */ java.lang.Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fys(defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((defpackage.fys) c((defpackage.aokg) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i == 1) {
            return ((defpackage.fys) c((defpackage.cdm) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i == 2) {
            return ((defpackage.fys) c((defpackage.dzn) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i != 3) {
            return ((defpackage.fys) c((defpackage.aoyz) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        return ((defpackage.fys) c((kbx) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.aokg aokgVar = (defpackage.aokg) this.a;
            defpackage.aooc.af(obj);
            return java.lang.Boolean.valueOf(aokgVar != null);
        }
        if (i == 1) {
            defpackage.cdm cdmVar = (defpackage.cdm) this.a;
            defpackage.aooc.af(obj);
            return java.lang.Boolean.valueOf(cdmVar == defpackage.cdm.a);
        }
        if (i != 2) {
            if (i != 3) {
                defpackage.aooc.af(obj);
                return java.lang.Boolean.valueOf(((defpackage.aoyz) this.a) != defpackage.aoyz.a);
            }
            defpackage.aooc.af(obj);
            return new defpackage.kcr((kbx) this.a);
        }
        defpackage.dzn dznVar = (defpackage.dzn) this.a;
        defpackage.aooc.af(obj);
        if (defpackage.dzn.j(2)) {
            java.util.Objects.toString(dznVar);
            defpackage.dzn.k(2, "Sent ".concat(java.lang.String.valueOf(dznVar)));
        }
        return defpackage.aojh.a;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.fys fysVar = new defpackage.fys(aolnVar, 0);
            fysVar.a = obj;
            return fysVar;
        }
        if (i == 1) {
            defpackage.fys fysVar2 = new defpackage.fys(aolnVar, 1, (byte[]) null);
            fysVar2.a = obj;
            return fysVar2;
        }
        if (i == 2) {
            defpackage.fys fysVar3 = new defpackage.fys(aolnVar, 2, (char[]) null);
            fysVar3.a = obj;
            return fysVar3;
        }
        if (i != 3) {
            defpackage.fys fysVar4 = new defpackage.fys(aolnVar, 4, (int[]) null);
            fysVar4.a = obj;
            return fysVar4;
        }
        defpackage.fys fysVar5 = new defpackage.fys(aolnVar, 3, (short[]) null);
        fysVar5.a = obj;
        return fysVar5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fys(defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fys(defpackage.aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fys(defpackage.aoln aolnVar, int i, int[] iArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fys(defpackage.aoln aolnVar, int i, short[] sArr) {
        super(2, aolnVar);
        this.$cid = i;
    }
}
