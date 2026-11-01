package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uns extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    /* synthetic */ java.lang.Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uns(aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((unq) obj, (aoln) obj2).b(aojh.a);
        }
        if (i == 1) {
            return c((defpackage.tlf) obj, (aoln) obj2).b(aojh.a);
        }
        if (i == 2) {
            return c((efx) obj, (aoln) obj2).b(aojh.a);
        }
        if (i == 3) {
            return c((efx) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 4) {
            return c((aegw) obj, (aoln) obj2).b(aojh.a);
        }
        return c(obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            aooc.af(obj);
            unq unqVar = (unq) this.a;
            tvn tvnVarAM = aais.aM(unqVar.p());
            boolean z = !unqVar.b;
            akzx akzxVar = (akzx) tvnVarAM.a;
            akzxVar.u();
            akzxVar.b.b = z;
            return tvnVarAM.v();
        }
        if (i == 1) {
            aooc.af(obj);
            defpackage.vqu vquVarCx = wsc.cx(((defpackage.tlf) this.a).p());
            akzx akzxVar2 = (akzx) vquVarCx.a;
            akzxVar2.u();
            defpackage.tlf tlfVar = (defpackage.tlf) akzxVar2.b;
            tlfVar.b |= 1;
            tlfVar.c = true;
            return vquVarCx.ah();
        }
        if (i == 2) {
            aooc.af(obj);
            ((efx) this.a).d();
            return aojh.a;
        }
        if (i == 3) {
            aooc.af(obj);
            ((efx) this.a).d();
            return aojh.a;
        }
        if (i == 4) {
            aooc.af(obj);
            return this.a;
        }
        aooc.af(obj);
        tvn tvnVarBS = agab.bS(((aegw) this.a).p());
        java.lang.String string = java.util.UUID.randomUUID().toString();
        aooh.e(string, "toString(...)");
        tvnVarBS.A(string);
        return tvnVarBS.z();
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.uns unsVar = new defpackage.uns(aolnVar, 0);
            unsVar.a = obj;
            return unsVar;
        }
        if (i == 1) {
            defpackage.uns unsVar2 = new defpackage.uns(aolnVar, 1, (byte[]) null);
            unsVar2.a = obj;
            return unsVar2;
        }
        if (i == 2) {
            defpackage.uns unsVar3 = new defpackage.uns(aolnVar, 2, (char[]) null);
            unsVar3.a = obj;
            return unsVar3;
        }
        if (i == 3) {
            defpackage.uns unsVar4 = new defpackage.uns(aolnVar, 3, (short[]) null);
            unsVar4.a = obj;
            return unsVar4;
        }
        if (i != 4) {
            defpackage.uns unsVar5 = new defpackage.uns(aolnVar, 5, (boolean[]) null);
            unsVar5.a = obj;
            return unsVar5;
        }
        defpackage.uns unsVar6 = new defpackage.uns(aolnVar, 4, (int[]) null);
        unsVar6.a = obj;
        return unsVar6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uns(aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uns(aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uns(aoln aolnVar, int i, int[] iArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uns(aoln aolnVar, int i, short[] sArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uns(aoln aolnVar, int i, boolean[] zArr) {
        super(2, aolnVar);
        this.$cid = i;
    }
}
