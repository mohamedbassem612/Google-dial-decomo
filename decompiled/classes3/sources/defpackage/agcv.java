package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agcv extends defpackage.agcw {
    protected final void M(android.graphics.Canvas canvas) {
        if (this.a.w.isEmpty()) {
            super.M(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.a.w);
        super.M(canvas);
        canvas.restore();
    }
}
