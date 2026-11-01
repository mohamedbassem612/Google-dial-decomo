package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cpu {
    public final android.graphics.Bitmap a;

    public cpu(android.graphics.Bitmap bitmap) {
        this.a = bitmap;
    }

    public final int a() {
        android.graphics.Bitmap.Config config = this.a.getConfig();
        if (config == null) {
            defpackage.aooh.g();
        }
        if (config == android.graphics.Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == android.graphics.Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config != android.graphics.Bitmap.Config.ARGB_4444) {
            if (config == aa$.ExternalSyntheticApiModelOutline0.m()) {
                return 3;
            }
            if (config == aa$.ExternalSyntheticApiModelOutline0.m$1()) {
                return 4;
            }
        }
        return 0;
    }

    public final int b() {
        return this.a.getHeight();
    }

    public final int c() {
        return this.a.getWidth();
    }

    public final void d() {
        this.a.prepareToDraw();
    }
}
