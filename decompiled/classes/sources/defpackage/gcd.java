package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gcd implements defpackage.aoxi {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public gcd(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, ruc] */
    @Override // defpackage.aoxi
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, defpackage.aoln aolnVar) throws java.lang.Throwable {
        int i = this.$cid;
        if (i == 0) {
            defpackage.dzn dznVar = (defpackage.dzn) obj;
            if (defpackage.dzn.j(2)) {
                java.util.Objects.toString(dznVar);
                defpackage.dzn.k(2, "Collected ".concat(java.lang.String.valueOf(dznVar)));
            }
            defpackage.gcf gcfVar = (defpackage.gcf) this.a;
            java.lang.Object objAj = defpackage.aoov.aj(gcfVar.b, new defpackage.gcc(dznVar, gcfVar, (defpackage.kgl) this.b, null), aolnVar);
            return objAj != defpackage.aolu.a ? defpackage.aojh.a : objAj;
        }
        if (i == 1) {
            java.lang.Object objD = ((defpackage.gbl) this.a).d((defpackage.gac) this.b, (defpackage.fzs) obj, aolnVar);
            return objD != defpackage.aolu.a ? defpackage.aojh.a : objD;
        }
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        ?? r5 = this.b;
        if (zBooleanValue) {
            r5.k((defpackage.aenj) this.a);
        } else {
            r5.o((defpackage.aenj) this.a);
        }
        return defpackage.aojh.a;
    }

    public gcd(defpackage.ruc rucVar, defpackage.aenj aenjVar, int i) {
        this.$cid = i;
        this.b = rucVar;
        this.a = aenjVar;
    }
}
