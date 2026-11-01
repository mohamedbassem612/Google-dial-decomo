package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class adrj implements defpackage.adrt {
    protected final defpackage.adrn a;
    public final ajcu b;
    public final java.util.concurrent.ConcurrentMap c = new j$.util.concurrent.ConcurrentHashMap();

    public adrj(defpackage.adrn adrnVar, ajcu ajcuVar) {
        this.a = adrnVar;
        this.b = ajcuVar;
    }

    protected final void a(defpackage.adro adroVar) {
        java.util.concurrent.ConcurrentMap concurrentMap = this.c;
        for (adrs adrsVar : concurrentMap.keySet()) {
            ((adqu) concurrentMap.get(adrsVar)).d(new defpackage.aawj(adrsVar, adroVar, 11, null), defpackage.adri.c);
        }
    }
}
