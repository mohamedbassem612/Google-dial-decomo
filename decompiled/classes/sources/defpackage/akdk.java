package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akdk implements defpackage.aipq {
    private static final defpackage.aion a = new defpackage.akdf("", defpackage.aike.a);
    private final defpackage.amwu b;

    public akdk(defpackage.amwu amwuVar) {
        this.b = amwuVar;
    }

    @Override // defpackage.aipq
    public final defpackage.aion a(java.lang.String str) {
        java.util.Set set = (java.util.Set) this.b.a();
        int size = set.size();
        if (size == 0) {
            return a;
        }
        if (size == 1) {
            return ((defpackage.aipq) set.iterator().next()).a(str);
        }
        defpackage.ahvr.bC(size, "expectedSize");
        defpackage.aift aiftVar = new defpackage.aift(size);
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            aiftVar.i(((defpackage.aipq) it.next()).a(str));
        }
        return new defpackage.akdf(str, aiftVar.g());
    }
}
