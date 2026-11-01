package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mk {
    public final float a;
    public final float b;
    public final int c;
    private final float d;
    private final long e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mk(android.window.BackEvent backEvent) {
        this(rp$.ExternalSyntheticApiModelOutline0.m(backEvent), rp$.ExternalSyntheticApiModelOutline0.m$1(backEvent), rp$.ExternalSyntheticApiModelOutline0.m$2(backEvent), rp$.ExternalSyntheticApiModelOutline0.m(backEvent), android.os.Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
        aooh.f(backEvent, "backEvent");
    }

    public final java.lang.String toString() {
        return "BackEventCompat(touchX=" + this.d + ", touchY=" + this.a + ", progress=" + this.b + ", swipeEdge=" + this.c + ", frameTimeMillis=" + this.e + ')';
    }

    public mk(float f, float f2, float f3, int i, long j) {
        this.d = f;
        this.a = f2;
        this.b = f3;
        this.c = i;
        this.e = j;
    }

    public mk(defpackage.fxx fxxVar) {
        this(fxxVar.c, fxxVar.d, fxxVar.b, fxxVar.a, fxxVar.e);
    }
}
