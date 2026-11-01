package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rus {
    private android.graphics.drawable.Drawable a;
    private defpackage.ruz b;
    private defpackage.rvc c;
    private byte d;
    private pez e;

    public final defpackage.rvb a() {
        int i = ~this.d;
        if ((i & 14) == 0) {
            android.graphics.drawable.Drawable drawable = this.a;
            defpackage.ruz ruzVar = this.b;
            defpackage.rvc rvcVar = this.c;
            pez pezVar = this.e;
            if (1 == (i & 1)) {
                drawable = null;
            }
            return new defpackage.rvb(drawable, ruzVar, rvcVar, pezVar);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.d & 2) == 0) {
            sb.append(" prefCategory");
        }
        if ((this.d & 4) == 0) {
            sb.append(" settingsEntry");
        }
        if ((this.d & 8) == 0) {
            sb.append(" title");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(android.graphics.drawable.Drawable drawable) {
        this.a = drawable;
        this.d = (byte) (this.d | 1);
    }

    public final void c(defpackage.rvc rvcVar) {
        this.c = rvcVar;
        this.d = (byte) (this.d | 4);
    }

    public final void d(defpackage.ruz ruzVar) {
        this.b = ruzVar;
        this.d = (byte) (this.d | 2);
    }

    public final void e(pez pezVar) {
        this.e = pezVar;
        this.d = (byte) (this.d | 8);
    }
}
