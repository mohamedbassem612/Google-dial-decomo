package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class zl {
    public static final defpackage.zl a = new defpackage.zl(java.util.Collections.EMPTY_LIST);
    public static final defpackage.zl b = new defpackage.zl(java.util.Arrays.asList(androidx.car.app.model.CarIconSpan.class, androidx.car.app.model.ClickableSpan.class, androidx.car.app.model.DistanceSpan.class, androidx.car.app.model.DurationSpan.class, androidx.car.app.model.TimerSpan.class, androidx.car.app.model.ForegroundCarColorSpan.class));
    public static final defpackage.zl c;
    public static final defpackage.zl d;
    public static final defpackage.zl e;
    public static final defpackage.zl f;
    private final java.util.HashSet g;

    static {
        new defpackage.zl(java.util.Arrays.asList(androidx.car.app.model.ClickableSpan.class, androidx.car.app.model.DistanceSpan.class, androidx.car.app.model.DurationSpan.class, androidx.car.app.model.TimerSpan.class));
        c = new defpackage.zl(java.util.Arrays.asList(androidx.car.app.model.ForegroundCarColorSpan.class));
        d = new defpackage.zl(java.util.Arrays.asList(androidx.car.app.model.DistanceSpan.class, androidx.car.app.model.DurationSpan.class, androidx.car.app.model.TimerSpan.class));
        e = new defpackage.zl(java.util.Arrays.asList(androidx.car.app.model.DistanceSpan.class, androidx.car.app.model.DurationSpan.class, androidx.car.app.model.TimerSpan.class, androidx.car.app.model.CarIconSpan.class));
        new defpackage.zl(java.util.Arrays.asList(androidx.car.app.model.DistanceSpan.class, androidx.car.app.model.DurationSpan.class, androidx.car.app.model.TimerSpan.class, androidx.car.app.model.ForegroundCarColorSpan.class));
        f = new defpackage.zl(java.util.Arrays.asList(androidx.car.app.model.DistanceSpan.class, androidx.car.app.model.DurationSpan.class, androidx.car.app.model.TimerSpan.class, androidx.car.app.model.ForegroundCarColorSpan.class, androidx.car.app.model.CarIconSpan.class));
    }

    private zl(java.util.List list) {
        this.g = new java.util.HashSet(list);
    }

    private final void b(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.Class<?> cls = ((androidx.car.app.model.CarText.SpanWrapper) it.next()).getCarSpan().getClass();
            if (!this.g.contains(cls)) {
                throw new java.lang.IllegalArgumentException("CarSpan type is not allowed: ".concat(java.lang.String.valueOf(cls.getSimpleName())));
            }
        }
    }

    public final void a(androidx.car.app.model.CarText carText) {
        b(carText.getSpans());
        java.util.Iterator it = carText.getSpansForVariants().iterator();
        while (it.hasNext()) {
            b((java.util.List) it.next());
        }
    }
}
