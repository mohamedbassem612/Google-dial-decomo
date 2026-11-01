package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class agcw extends agaf {
    public static final /* synthetic */ int b = 0;
    public defpackage.agcu a;

    public agcw(defpackage.agcu agcuVar) {
        super(agcuVar);
        this.a = agcuVar;
    }

    public final void a(float f, float f2, float f3, float f4) {
        if (f == this.a.w.left && f2 == this.a.w.top && f3 == this.a.w.right && f4 == this.a.w.bottom) {
            return;
        }
        this.a.w.set(f, f2, f3, f4);
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final android.graphics.drawable.Drawable mutate() {
        this.a = new defpackage.agcu(this.a);
        return this;
    }
}
