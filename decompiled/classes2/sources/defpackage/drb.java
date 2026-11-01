package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class drb {
    public static final defpackage.drb a = new defpackage.drb();

    public final int a(android.view.Window window) {
        android.view.WindowMetrics windowMetricsM = baa$.ExternalSyntheticApiModelOutline1.m(window.getWindowManager());
        android.graphics.Insets insetsM$1 = baa$.ExternalSyntheticApiModelOutline1.m$1(baa$.ExternalSyntheticApiModelOutline1.m(windowMetricsM), baa$.ExternalSyntheticApiModelOutline1.m$2());
        return baa$.ExternalSyntheticApiModelOutline1.m(windowMetricsM).height() - (da$.ExternalSyntheticApiModelOutline0.m$2(insetsM$1) + da$.ExternalSyntheticApiModelOutline0.m(insetsM$1));
    }
}
