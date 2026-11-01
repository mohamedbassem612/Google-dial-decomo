package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class fzw extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ defpackage.aoot b;
    final /* synthetic */ defpackage.aonj c;
    final /* synthetic */ java.lang.Object d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzw(defpackage.aoot aootVar, defpackage.aonj aonjVar, defpackage.aows aowsVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = aootVar;
        this.c = aonjVar;
        this.d = aowsVar;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return ((defpackage.fzw) c((defpackage.kgl) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        return ((defpackage.fzw) c((defpackage.aows) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [aoxh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2, types: [aoxh, java.lang.Object] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        int i = this.$cid;
        java.lang.Object obj2 = this.e;
        if (i != 0) {
            defpackage.kgl kglVar = (defpackage.kgl) obj2;
            defpackage.aolu aoluVar = defpackage.aolu.a;
            int i2 = this.a;
            defpackage.aooc.af(obj);
            if (i2 == 0) {
                defpackage.aoxh aoxhVarB = defpackage.aoxo.b(new defpackage.fzh(new defpackage.aowy(new defpackage.aoxm((defpackage.aoxh) kglVar.a, new defpackage.fzu(this.b, this.c, null), (defpackage.aoln) null, 1)), 14), new defpackage.een(4), defpackage.aoxo.b);
                defpackage.fzv fzvVar = new defpackage.fzv(this.d, 0);
                this.e = null;
                this.a = 1;
                if (aoxhVarB.fM(fzvVar, this) == aoluVar) {
                    return aoluVar;
                }
            }
            return defpackage.aojh.a;
        }
        defpackage.aows aowsVar = (defpackage.aows) obj2;
        defpackage.aolu aoluVar2 = defpackage.aolu.a;
        int i3 = this.a;
        defpackage.aooc.af(obj);
        if (i3 == 0) {
            ?? r11 = this.d;
            defpackage.fzw fzwVar = new defpackage.fzw(this.b, this.c, aowsVar, (defpackage.aoln) null, 1);
            this.e = null;
            this.a = 1;
            if (defpackage.aoov.aF(r11, fzwVar, this) == aoluVar2) {
                return aoluVar2;
            }
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aoxh, java.lang.Object] */
    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        if (this.$cid != 0) {
            defpackage.fzw fzwVar = new defpackage.fzw(this.b, this.c, (defpackage.aows) this.d, aolnVar, 1);
            fzwVar.e = obj;
            return fzwVar;
        }
        defpackage.fzw fzwVar2 = new defpackage.fzw((defpackage.aoxh) this.d, this.b, this.c, aolnVar, 0);
        fzwVar2.e = obj;
        return fzwVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzw(defpackage.aoxh aoxhVar, defpackage.aoot aootVar, defpackage.aonj aonjVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = aoxhVar;
        this.b = aootVar;
        this.c = aonjVar;
    }
}
