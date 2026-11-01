package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class yjb extends defpackage.yjf {
    public float b;
    public float c;
    final /* synthetic */ defpackage.yjh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjb(defpackage.yjh yjhVar, float f, float f2) {
        super(yjhVar);
        j$.util.Objects.requireNonNull(yjhVar);
        this.d = yjhVar;
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.yjf
    public void a(java.lang.String str) {
        defpackage.yjh yjhVar = this.d;
        if (yjhVar.i()) {
            defpackage.yjd yjdVar = yjhVar.d;
            if (yjdVar.b) {
                yjhVar.a.drawText(str, this.b, this.c, yjdVar.d);
            }
            defpackage.yjd yjdVar2 = yjhVar.d;
            if (yjdVar2.c) {
                yjhVar.a.drawText(str, this.b, this.c, yjdVar2.e);
            }
        }
        this.b += yjhVar.d.d.measureText(str);
    }
}
