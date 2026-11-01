package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahmk {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/apps/tiktok/sync/monitoring/SyncMonitoringDispatcherImpl");
    public final defpackage.aoin b;
    public final defpackage.aoin c;
    public final defpackage.ahda d;
    private final defpackage.aoin e;

    public ahmk(defpackage.ahda ahdaVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3) {
        this.d = ahdaVar;
        this.e = aoinVar;
        this.b = aoinVar2;
        this.c = aoinVar3;
    }

    public final defpackage.ajcq a(defpackage.ajcq ajcqVar, defpackage.ajat ajatVar) {
        java.util.Set set = (java.util.Set) this.e.a();
        defpackage.aihb aihbVarI = defpackage.aihd.i(set.size());
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            aihbVarI.c(new ahem(this, ajatVar, (akxm) it.next(), 3, (byte[]) null));
        }
        return this.d.d(new defpackage.ahmg(ajcqVar, 3), aihbVarI.g());
    }
}
