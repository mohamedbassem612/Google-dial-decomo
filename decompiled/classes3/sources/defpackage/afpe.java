package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afpe extends android.util.Property {
    private final android.graphics.Matrix a;

    public afpe() {
        super(android.graphics.Matrix.class, "imageMatrixProperty");
        this.a = new android.graphics.Matrix();
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        android.graphics.Matrix imageMatrix = ((android.widget.ImageView) obj).getImageMatrix();
        android.graphics.Matrix matrix = this.a;
        matrix.set(imageMatrix);
        return matrix;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        ((android.widget.ImageView) obj).setImageMatrix((android.graphics.Matrix) obj2);
    }
}
