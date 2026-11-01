package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agfv {
    public static final /* synthetic */ int a = 0;

    static {
        new xtq("SetupMetricsLogger", (byte[]) null);
    }

    public static void a(android.content.Context context, com.google.android.setupcompat.logging.CustomEvent customEvent) {
        anty.aI(context, "Context cannot be null.");
        defpackage.agfo agfoVarA = defpackage.agfo.a(context);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("CustomEvent_bundle", com.google.android.setupcompat.logging.CustomEvent.a(customEvent));
        agfoVarA.d(1, bundle);
    }
}
