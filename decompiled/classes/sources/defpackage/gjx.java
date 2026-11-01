package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class gjx extends defpackage.gjz {
    public volatile defpackage.gka a;
    public volatile defpackage.gka b;
    private final defpackage.acx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjx(defpackage.gkb gkbVar) {
        super(gkbVar);
        defpackage.gjr.a.incrementAndGet();
        int i = defpackage.acy.a;
        this.d = new defpackage.acx(6);
        long[] jArr = defpackage.adx.a;
        new defpackage.adw(6);
        boolean z = gkbVar.e;
    }

    public defpackage.gka a(long j) {
        defpackage.gka gkaVar;
        defpackage.acx acxVar = this.d;
        synchronized (acxVar) {
            java.lang.Object objA = acxVar.a(j);
            if (objA == null) {
                objA = new defpackage.gka(j, this);
                acxVar.h(j, objA);
            }
            gkaVar = (defpackage.gka) objA;
        }
        return gkaVar;
    }
}
