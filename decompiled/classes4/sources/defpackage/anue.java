package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anue extends annc {
    public java.util.concurrent.ScheduledExecutorService a;
    public final org.chromium.net.CronetEngine b;
    public boolean d;
    public int e;
    public boolean f;
    public int g;
    private final anzn i;
    public final zzx h = aodq.i;
    public int c = 4194304;

    private anue(java.lang.String str, int i, org.chromium.net.CronetEngine cronetEngine) {
        this.i = new anzn(java.net.InetSocketAddress.createUnresolved(str, i), anxo.d(str, i), new defpackage.anub(this));
        ahvr.cj(cronetEngine, "cronetEngine");
        this.b = cronetEngine;
    }

    public static defpackage.anue h(java.lang.String str, int i, org.chromium.net.CronetEngine cronetEngine) {
        ahvr.cj(cronetEngine, "cronetEngine");
        return new defpackage.anue(str, i, cronetEngine);
    }

    public final anot b() {
        return this.i;
    }
}
