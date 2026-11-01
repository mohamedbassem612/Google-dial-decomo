package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class xo {
    public boolean a;
    public androidx.car.app.model.CarText b;
    public final androidx.car.app.model.CarText c;
    public androidx.car.app.model.CarText d;
    public androidx.car.app.model.CarIcon e;
    public androidx.car.app.model.Action f;
    public androidx.car.app.model.ActionStrip g;
    public final java.util.List h = new java.util.ArrayList();
    public androidx.car.app.model.Header i;

    public xo(androidx.car.app.model.CarText carText) {
        this.c = (androidx.car.app.model.CarText) j$.util.Objects.requireNonNull(carText);
    }

    public final androidx.car.app.model.MessageTemplate a() {
        if (this.c.isEmpty()) {
            throw new java.lang.IllegalStateException("Message cannot be empty");
        }
        java.lang.String strConcat = "".concat(java.lang.String.valueOf(android.util.Log.getStackTraceString(null)));
        if (!strConcat.isEmpty()) {
            this.d = androidx.car.app.model.CarText.create(strConcat);
        }
        return new androidx.car.app.model.MessageTemplate(this);
    }
}
