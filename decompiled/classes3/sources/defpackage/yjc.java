package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class yjc extends defpackage.yjf {
    public float a;
    public final float b;
    public final android.graphics.Path c;
    final /* synthetic */ defpackage.yjh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjc(defpackage.yjh yjhVar, float f, float f2, android.graphics.Path path) {
        super(yjhVar);
        j$.util.Objects.requireNonNull(yjhVar);
        this.d = yjhVar;
        this.a = f;
        this.b = f2;
        this.c = path;
    }

    @Override // defpackage.yjf
    public final void a(java.lang.String str) {
        java.lang.String str2;
        defpackage.yjh yjhVar = this.d;
        if (yjhVar.i()) {
            android.graphics.Path path = new android.graphics.Path();
            str2 = str;
            yjhVar.d.d.getTextPath(str2, 0, str.length(), this.a, this.b, path);
            this.c.addPath(path);
        } else {
            str2 = str;
        }
        this.a += yjhVar.d.d.measureText(str2);
    }

    @Override // defpackage.yjf
    public final boolean b(defpackage.yiq yiqVar) {
        if (!(yiqVar instanceof defpackage.yir)) {
            return true;
        }
        defpackage.yjh.h("Using <textPath> elements in a clip path is not supported.", new java.lang.Object[0]);
        return false;
    }
}
