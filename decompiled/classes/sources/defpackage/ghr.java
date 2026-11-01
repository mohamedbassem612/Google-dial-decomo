package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ghr extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ defpackage.gfy b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ defpackage.aonj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghr(defpackage.aoln aolnVar, defpackage.gfy gfyVar, boolean z, boolean z2, defpackage.aonj aonjVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = gfyVar;
        this.d = z;
        this.c = z2;
        this.e = aonjVar;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((defpackage.ghr) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i != 1) {
            return ((defpackage.ghr) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        return ((defpackage.ghr) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.aolu aoluVar;
        int i = this.$cid;
        if (i == 0) {
            aoluVar = defpackage.aolu.a;
            int i2 = this.a;
            defpackage.aooc.af(obj);
            if (i2 != 0) {
                return obj;
            }
            defpackage.gfy gfyVar = this.b;
            defpackage.ghw ghwVar = new defpackage.ghw(!(gfyVar.r() && gfyVar.s()) && this.c, this.d, gfyVar, null, this.e, 1, null);
            this.a = 1;
            java.lang.Object objW = gfyVar.w(ghwVar, this);
            if (objW != aoluVar) {
                return objW;
            }
        } else if (i != 1) {
            aoluVar = defpackage.aolu.a;
            int i3 = this.a;
            defpackage.aooc.af(obj);
            if (i3 != 0) {
                return obj;
            }
            defpackage.gfy gfyVar2 = this.b;
            defpackage.ghw ghwVar2 = new defpackage.ghw(this.c, this.d, gfyVar2, null, this.e, 0);
            this.a = 1;
            java.lang.Object objW2 = gfyVar2.w(ghwVar2, this);
            if (objW2 != aoluVar) {
                return objW2;
            }
        } else {
            aoluVar = defpackage.aolu.a;
            int i4 = this.a;
            defpackage.aooc.af(obj);
            if (i4 != 0) {
                return obj;
            }
            defpackage.gfy gfyVar3 = this.b;
            boolean z = this.d;
            boolean z2 = this.c;
            defpackage.aonj aonjVar = this.e;
            this.a = 1;
            java.lang.Object objO = defpackage.dez.o(gfyVar3, z, z2, aonjVar, this);
            if (objO != aoluVar) {
                return objO;
            }
        }
        return aoluVar;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? new defpackage.ghr(aolnVar, this.b, this.d, this.c, this.e, 2) : new defpackage.ghr(this.b, this.d, this.c, this.e, aolnVar, 1, null);
        }
        return new defpackage.ghr(this.b, this.c, this.d, this.e, aolnVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghr(defpackage.gfy gfyVar, boolean z, boolean z2, defpackage.aonj aonjVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = gfyVar;
        this.c = z;
        this.d = z2;
        this.e = aonjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghr(defpackage.gfy gfyVar, boolean z, boolean z2, defpackage.aonj aonjVar, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = gfyVar;
        this.d = z;
        this.c = z2;
        this.e = aonjVar;
    }
}
