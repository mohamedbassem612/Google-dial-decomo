package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class jgo extends aomh implements aonj {
    private final /* synthetic */ int $cid;
    final /* synthetic */ defpackage.jgp a;
    final /* synthetic */ defpackage.igd b;
    final /* synthetic */ alad c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgo(defpackage.jgp jgpVar, defpackage.igd igdVar, tvx tvxVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = jgpVar;
        this.b = igdVar;
        this.c = tvxVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            aoln aolnVar = (aoln) obj;
            return new defpackage.jgo(this.a, this.c, this.b, aolnVar, 0).b(aojh.a);
        }
        if (i == 1) {
            return new defpackage.jgo(this.a, this.b, this.c, (aoln) obj, 1).b(aojh.a);
        }
        aoln aolnVar2 = (aoln) obj;
        return new defpackage.jgo(this.a, this.c, this.b, aolnVar2, 2, null).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            aooc.af(obj);
            defpackage.jgp jgpVar = this.a;
            jgpVar.j();
            twj twjVar = this.c;
            jgpVar.e.b(twjVar, false);
            jgpVar.d.c(this.b, twjVar);
            return aojh.a;
        }
        if (i == 1) {
            aooc.af(obj);
            defpackage.jgp jgpVar2 = this.a;
            jgpVar2.j();
            tvx tvxVar = this.c;
            jgpVar2.d.b(this.b, tvxVar);
            return aojh.a;
        }
        aooc.af(obj);
        defpackage.jgp jgpVar3 = this.a;
        jgpVar3.j();
        twj twjVar2 = this.c;
        jgpVar3.e.b(twjVar2, true);
        jgpVar3.d.d(this.b, twjVar2);
        return aojh.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgo(defpackage.jgp jgpVar, twj twjVar, defpackage.igd igdVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = jgpVar;
        this.c = twjVar;
        this.b = igdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgo(defpackage.jgp jgpVar, twj twjVar, defpackage.igd igdVar, aoln aolnVar, int i, byte[] bArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = jgpVar;
        this.c = twjVar;
        this.b = igdVar;
    }
}
