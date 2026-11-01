package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class yja extends defpackage.yjb {
    final /* synthetic */ defpackage.yjh a;
    private final android.graphics.Path e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yja(defpackage.yjh yjhVar, android.graphics.Path path, float f) {
        super(yjhVar, f, 0.0f);
        j$.util.Objects.requireNonNull(yjhVar);
        this.a = yjhVar;
        this.e = path;
    }

    @Override // defpackage.yjb, defpackage.yjf
    public final void a(java.lang.String str) {
        java.lang.String str2;
        defpackage.yjh yjhVar = this.a;
        if (yjhVar.i()) {
            defpackage.yjd yjdVar = yjhVar.d;
            if (yjdVar.b) {
                yjhVar.a.drawTextOnPath(str, this.e, this.b, this.c, yjdVar.d);
                str2 = str;
            } else {
                str2 = str;
            }
            defpackage.yjd yjdVar2 = yjhVar.d;
            if (yjdVar2.c) {
                yjhVar.a.drawTextOnPath(str2, this.e, this.b, this.c, yjdVar2.e);
            }
        } else {
            str2 = str;
        }
        this.b += yjhVar.d.d.measureText(str2);
    }
}
