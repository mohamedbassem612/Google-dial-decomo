package com.android.dialer.incall.producersmonitor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ProducersMonitor {
    private static final aimz e = aimz.i("com/android/dialer/incall/producersmonitor/ProducersMonitor");
    public final long a;
    public final long b;
    public final long c;
    public final defpackage.uss d;
    private final boolean f;

    public ProducersMonitor(defpackage.uss ussVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4) {
        this.d = ussVar;
        this.a = ((java.lang.Long) aoinVar.a()).longValue();
        this.b = ((java.lang.Long) aoinVar2.a()).longValue();
        this.c = ((java.lang.Long) aoinVar3.a()).longValue();
        this.f = ((java.lang.Boolean) aoinVar4.a()).booleanValue();
    }

    public final void a(java.lang.String str, defpackage.amzw amzwVar, float f) {
        if (this.f) {
            e.b().l("com/android/dialer/incall/producersmonitor/ProducersMonitor", "logMsg", 116, "ProducersMonitor.java").F(str, amzwVar, f);
        }
    }
}
