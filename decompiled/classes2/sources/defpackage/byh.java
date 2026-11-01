package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class byh implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ byh(float f, defpackage.btt bttVar, float f2, int i) {
        this.$cid = i;
        this.a = f;
        this.c = bttVar;
        this.b = f2;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        boolean z;
        if (this.$cid == 0) {
            ((czb) obj).s((czc) this.c, aopc.i(this.a), aopc.i(this.b), 0.0f);
            return aojh.a;
        }
        defpackage.bgt bgtVar = (defpackage.bgt) obj;
        defpackage.btu btuVar = defpackage.btu.a;
        float f = this.a;
        bgtVar.a(btuVar, f);
        defpackage.btt bttVar = (defpackage.btt) this.c;
        boolean zL = bttVar.l();
        float f2 = this.b;
        if (!zL && f2 != 0.0f && ((z = bttVar.c) || f2 > f / 2.0f)) {
            bgtVar.a(defpackage.btu.c, f - (z ? java.lang.Math.min(f / 2.0f, f2 / 2.0f) : f / 2.0f));
        }
        if (f2 != 0.0f) {
            bgtVar.a(defpackage.btu.b, java.lang.Math.max(0.0f, f - f2));
        }
        return aojh.a;
    }

    public /* synthetic */ byh(czc czcVar, float f, float f2, int i) {
        this.$cid = i;
        this.c = czcVar;
        this.a = f;
        this.b = f2;
    }
}
