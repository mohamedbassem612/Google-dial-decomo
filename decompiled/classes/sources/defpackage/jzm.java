package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jzm extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    int a;
    private /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzm(defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((defpackage.jzm) c((defpackage.aoxi) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i == 1) {
            return ((defpackage.jzm) c((defpackage.aoxi) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i != 2) {
            return ((defpackage.jzm) c((defpackage.aoxi) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        return ((defpackage.jzm) c((defpackage.aoxi) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.gct gctVar;
        int i = this.$cid;
        if (i == 0) {
            defpackage.aolu aoluVar = defpackage.aolu.a;
            int i2 = this.a;
            defpackage.aooc.af(obj);
            if (i2 == 0) {
                defpackage.aoxi aoxiVar = (defpackage.aoxi) this.b;
                defpackage.aojh aojhVar = defpackage.aojh.a;
                this.a = 1;
                if (aoxiVar.a(aojhVar, this) == aoluVar) {
                    return aoluVar;
                }
            }
            return defpackage.aojh.a;
        }
        if (i == 1) {
            defpackage.aoxi aoxiVar2 = (defpackage.aoxi) this.b;
            defpackage.aolu aoluVar2 = defpackage.aolu.a;
            int i3 = this.a;
            defpackage.aooc.af(obj);
            if (i3 != 0) {
                if (i3 == 1) {
                    gctVar = (defpackage.gct) obj;
                    aoxiVar2 = null;
                }
                return defpackage.aojh.a;
            }
            gctVar = null;
            defpackage.gaj gajVar = new defpackage.gaj(gctVar == defpackage.gct.a, defpackage.gan.a);
            this.b = null;
            this.a = 2;
            if (aoxiVar2.a(gajVar, this) == aoluVar2) {
                return aoluVar2;
            }
            return defpackage.aojh.a;
        }
        if (i != 2) {
            defpackage.aolu aoluVar3 = defpackage.aolu.a;
            int i4 = this.a;
            defpackage.aooc.af(obj);
            if (i4 == 0) {
                defpackage.aoxi aoxiVar3 = (defpackage.aoxi) this.b;
                defpackage.und undVar = defpackage.und.a;
                this.a = 1;
                if (aoxiVar3.a(undVar, this) == aoluVar3) {
                    return aoluVar3;
                }
            }
            return defpackage.aojh.a;
        }
        defpackage.aolu aoluVar4 = defpackage.aolu.a;
        int i5 = this.a;
        defpackage.aooc.af(obj);
        if (i5 == 0) {
            defpackage.aoxi aoxiVar4 = (defpackage.aoxi) this.b;
            defpackage.aojh aojhVar2 = defpackage.aojh.a;
            this.a = 1;
            if (aoxiVar4.a(aojhVar2, this) == aoluVar4) {
                return aoluVar4;
            }
        }
        return defpackage.aojh.a;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.jzm jzmVar = new defpackage.jzm(aolnVar, 0);
            jzmVar.b = obj;
            return jzmVar;
        }
        if (i == 1) {
            defpackage.jzm jzmVar2 = new defpackage.jzm(aolnVar, 1, (byte[]) null);
            jzmVar2.b = obj;
            return jzmVar2;
        }
        if (i != 2) {
            defpackage.jzm jzmVar3 = new defpackage.jzm(aolnVar, 3, (short[]) null);
            jzmVar3.b = obj;
            return jzmVar3;
        }
        defpackage.jzm jzmVar4 = new defpackage.jzm(aolnVar, 2, (char[]) null);
        jzmVar4.b = obj;
        return jzmVar4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzm(defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzm(defpackage.aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzm(defpackage.aoln aolnVar, int i, short[] sArr) {
        super(2, aolnVar);
        this.$cid = i;
    }
}
