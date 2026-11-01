package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class zk {
    public static final defpackage.zk a = new defpackage.zk(new int[]{1, 2, 4});
    public static final defpackage.zk b = new defpackage.zk(new int[]{1, 2});
    private final int[] c;

    private zk(int[] iArr) {
        this.c = iArr;
    }

    public final void a(androidx.car.app.model.CarIcon carIcon) {
        if (carIcon == null || carIcon.getType() != 1) {
            return;
        }
        androidx.core.graphics.drawable.IconCompat icon = carIcon.getIcon();
        if (icon == null) {
            throw new java.lang.IllegalStateException("Custom icon does not have a backing IconCompat");
        }
        b(icon);
    }

    public final void b(androidx.core.graphics.drawable.IconCompat iconCompat) {
        int iB = iconCompat.b();
        int i = 0;
        while (true) {
            int[] iArr = this.c;
            if (i >= iArr.length) {
                throw new java.lang.IllegalArgumentException(a.bj(iB, "Custom icon type is not allowed: "));
            }
            if (iB == iArr[i]) {
                if (iB != 4 || "content".equalsIgnoreCase(iconCompat.c().getScheme())) {
                    return;
                }
                java.util.Objects.toString(iconCompat);
                throw new java.lang.IllegalArgumentException("Unsupported URI scheme for: ".concat(java.lang.String.valueOf(iconCompat)));
            }
            i++;
        }
    }
}
