package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class yje extends defpackage.yjf {
    float a;
    final float b;
    final android.graphics.RectF c;
    final /* synthetic */ defpackage.yjh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yje(defpackage.yjh yjhVar, float f, float f2) {
        super(yjhVar);
        j$.util.Objects.requireNonNull(yjhVar);
        this.d = yjhVar;
        this.c = new android.graphics.RectF();
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.yjf
    public final void a(java.lang.String str) {
        defpackage.yjh yjhVar = this.d;
        if (yjhVar.i()) {
            android.graphics.Rect rect = new android.graphics.Rect();
            yjhVar.d.d.getTextBounds(str, 0, str.length(), rect);
            android.graphics.RectF rectF = new android.graphics.RectF(rect);
            rectF.offset(this.a, this.b);
            this.c.union(rectF);
        }
        this.a += yjhVar.d.d.measureText(str);
    }

    @Override // defpackage.yjf
    public final boolean b(defpackage.yiq yiqVar) {
        if (!(yiqVar instanceof defpackage.yir)) {
            return true;
        }
        defpackage.yir yirVar = (defpackage.yir) yiqVar;
        defpackage.yif yifVarA = yiqVar.t.a(yirVar.a);
        if (yifVarA == null) {
            defpackage.yjh.e("TextPath path reference '%s' not found", yirVar.a);
        } else {
            defpackage.yhn yhnVar = (defpackage.yhn) yifVarA;
            android.graphics.Path path = new defpackage.yiz(this.d, yhnVar.a).a;
            android.graphics.Matrix matrix = yhnVar.e;
            if (matrix != null) {
                path.transform(matrix);
            }
            android.graphics.RectF rectF = new android.graphics.RectF();
            path.computeBounds(rectF, true);
            this.c.union(rectF);
        }
        return false;
    }
}
