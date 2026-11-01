package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agfm extends android.app.Fragment {
    public static final java.lang.String a = "agfm";
    public static final xtq b = new xtq("agfm", (byte[]) null);
    public defpackage.aprf c;
    private com.google.android.setupcompat.logging.MetricKey d;
    private long e;
    private long f = 0;

    public agfm() {
        setRetainInstance(true);
    }

    @Override // android.app.Fragment
    public final void onAttach(android.content.Context context) {
        super.onAttach(context);
        b.w("onAttach host=".concat(java.lang.String.valueOf(getActivity().getClass().getSimpleName())));
        this.d = com.google.android.setupcompat.logging.MetricKey.b("ScreenDuration", getActivity());
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [boolean, int] */
    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        b.w("onDetach host=".concat(java.lang.String.valueOf(getActivity().getClass().getSimpleName())));
        android.app.Activity activity = getActivity();
        com.google.android.setupcompat.logging.MetricKey metricKey = this.d;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
        long j = this.f / 1000000;
        int i = defpackage.agfv.a;
        anty.aI(activity, "Context cannot be null.");
        anty.aI(metricKey, "Timer name cannot be null.");
        afsq.s((boolean) (((j > 0L ? 1 : (j == 0L ? 0 : -1)) ^ (-1)) >>> 31), "Duration cannot be negative.");
        defpackage.agfo agfoVarA = defpackage.agfo.a(activity);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("MetricKey_bundle", com.google.android.setupcompat.logging.MetricKey.a(metricKey));
        bundle.putLong("timeMillis", j);
        agfoVarA.d(2, bundle);
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        b.w("onPause host=".concat(java.lang.String.valueOf(getActivity().getClass().getSimpleName())));
        this.f += java.lang.System.nanoTime() - this.e;
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        b.w("onResume host=" + getActivity().getClass().getSimpleName() + ", startInNanos=" + java.lang.System.nanoTime());
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.e = java.lang.System.nanoTime();
        b.w("onStart host=" + getActivity().getClass().getSimpleName() + ", startInNanos=" + this.e);
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putLong("onScreenStart", java.lang.System.nanoTime());
        defpackage.agfv.a(getActivity(), com.google.android.setupcompat.logging.CustomEvent.b(com.google.android.setupcompat.logging.MetricKey.b("ScreenActivity", getActivity()), persistableBundle));
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        long jNanoTime = java.lang.System.nanoTime();
        b.w("onStop host=" + getActivity().getClass().getSimpleName() + ", onStopTimestamp=" + jNanoTime);
        if (this.c != null) {
            android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
            persistableBundle.putLong("onScreenStop", jNanoTime);
            java.lang.Object obj = this.c.a;
            defpackage.agfh agfhVar = (defpackage.agfh) obj;
            android.app.Activity activity = agfhVar.a;
            if (activity != null && defpackage.aftt.x(activity.getIntent()) && defpackage.agfz.q(agfhVar.getContext())) {
                defpackage.aggf aggfVar = (defpackage.aggf) ((com.google.android.setupcompat.internal.TemplateLayout) obj).j(defpackage.aggf.class);
                if (aggfVar == null) {
                    defpackage.agfh.c.B("FooterBarMixin is null");
                    defpackage.agfv.a(agfhVar.getContext(), com.google.android.setupcompat.logging.CustomEvent.b(com.google.android.setupcompat.logging.MetricKey.b("FooterButtonMetrics", agfhVar.a), persistableBundle));
                } else {
                    aggfVar.i();
                    defpackage.aggh agghVar = aggfVar.g;
                    defpackage.aggh agghVar2 = aggfVar.h;
                    defpackage.agfv.a(agfhVar.getContext(), com.google.android.setupcompat.logging.CustomEvent.b(com.google.android.setupcompat.logging.MetricKey.b("FooterButtonMetrics", agfhVar.a), defpackage.agfn.b(aggfVar.b(), agghVar != null ? agghVar.a("PrimaryFooterButton") : android.os.PersistableBundle.EMPTY, agghVar2 != null ? agghVar2.a("SecondaryFooterButton") : android.os.PersistableBundle.EMPTY, android.os.PersistableBundle.EMPTY, persistableBundle)));
                }
            }
        }
    }
}
