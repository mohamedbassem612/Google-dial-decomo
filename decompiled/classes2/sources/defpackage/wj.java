package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class wj {
    public final int a;
    public final java.lang.Object b;
    public java.lang.Object c;

    public wj(androidx.core.graphics.drawable.IconCompat iconCompat, androidx.car.app.model.CarIconStyle carIconStyle) {
        defpackage.zk.a.b((androidx.core.graphics.drawable.IconCompat) j$.util.Objects.requireNonNull(iconCompat));
        this.a = 1;
        this.b = iconCompat;
        this.c = (androidx.car.app.model.CarIconStyle) j$.util.Objects.requireNonNull(carIconStyle);
    }

    public wj(androidx.core.graphics.drawable.IconCompat iconCompat) {
        defpackage.zk.a.b((androidx.core.graphics.drawable.IconCompat) j$.util.Objects.requireNonNull(iconCompat));
        this.a = 1;
        this.b = iconCompat;
        this.c = null;
    }

    public wj(java.util.List list, android.view.MotionEvent motionEvent, int i) {
        this.b = list;
        this.c = motionEvent;
        this.a = i;
    }
}
