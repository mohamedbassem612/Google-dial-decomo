package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kgp {
    private static final aimz a = aimz.i("com/android/dialer/calllog/filters/impl/CallLogFiltersProviderImpl");
    private final defpackage.kgo b;

    public kgp(defpackage.kgo kgoVar) {
        aooh.f(kgoVar, "stateImpl");
        this.b = kgoVar;
    }

    public final defpackage.kgo a() {
        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/calllog/filters/impl/CallLogFiltersProviderImpl", "getState", 19, "CallLogFiltersProviderImpl.kt").v("enter");
        return this.b;
    }
}
