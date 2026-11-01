package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anmk {
    public static final defpackage.anmk a = new defpackage.anmk(new defpackage.anmh(1), defpackage.anmh.a);
    private final java.util.concurrent.ConcurrentMap b = new j$.util.concurrent.ConcurrentHashMap();

    public anmk(defpackage.anmj... anmjVarArr) {
        for (defpackage.anmj anmjVar : anmjVarArr) {
            this.b.put(anmjVar.b(), anmjVar);
        }
    }
}
