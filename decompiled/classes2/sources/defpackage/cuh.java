package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cuh extends aojo {
    private android.view.MotionEvent a;
    private final int b;
    private java.util.List c;

    public cuh(android.view.MotionEvent motionEvent, int i) {
        this.a = motionEvent;
        this.b = i;
    }

    private final java.util.List b() {
        java.util.List list = this.c;
        if (list != null) {
            return list;
        }
        android.view.MotionEvent motionEvent = this.a;
        aooh.c(motionEvent);
        int historySize = motionEvent.getHistorySize();
        java.util.ArrayList arrayList = new java.util.ArrayList(historySize);
        for (int i = 0; i < historySize; i++) {
            int i2 = this.b;
            float historicalX = motionEvent.getHistoricalX(i2, i);
            float historicalY = motionEvent.getHistoricalY(i2, i);
            if ((java.lang.Float.floatToRawIntBits(historicalX) & androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY) < 2139095040 && (java.lang.Float.floatToRawIntBits(historicalY) & androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY) < 2139095040) {
                arrayList.add(new defpackage.cuy(motionEvent.getHistoricalEventTime(i), (((long) java.lang.Float.floatToRawIntBits(historicalX)) << 32) | (((long) java.lang.Float.floatToRawIntBits(historicalY)) & 4294967295L), 1.0f, 0L));
            }
        }
        this.c = arrayList;
        this.a = null;
        return arrayList;
    }

    public final int a() {
        return b().size();
    }

    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof defpackage.cuy) {
            return super.contains((defpackage.cuy) obj);
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        return (defpackage.cuy) b().get(i);
    }

    public final int indexOf(java.lang.Object obj) {
        if (obj instanceof defpackage.cuy) {
            return super.indexOf((defpackage.cuy) obj);
        }
        return -1;
    }

    public final int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof defpackage.cuy) {
            return super.lastIndexOf((defpackage.cuy) obj);
        }
        return -1;
    }
}
