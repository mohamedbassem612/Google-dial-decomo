package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class zj {
    public static final defpackage.zj a = new defpackage.zj(new int[]{0, 1, 2, 3, 4, 5, 6, 7});
    private final java.util.HashSet b = new java.util.HashSet();

    static {
        new defpackage.zj(new int[]{1, 2, 3, 4, 5, 6, 7});
    }

    private zj(int[] iArr) {
        for (int i : iArr) {
            this.b.add(java.lang.Integer.valueOf(i));
        }
    }

    public final void a(androidx.car.app.model.CarColor carColor) {
        if (this.b.contains(java.lang.Integer.valueOf(carColor.getType()))) {
            return;
        }
        java.util.Objects.toString(carColor);
        throw new java.lang.IllegalArgumentException("Car color type is not allowed: ".concat(java.lang.String.valueOf(carColor)));
    }
}
