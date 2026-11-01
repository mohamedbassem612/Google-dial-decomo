package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aihw extends aieu {
    final /* synthetic */ java.lang.Iterable a;
    final /* synthetic */ int b;

    public aihw(java.lang.Iterable iterable, int i) {
        this.a = iterable;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    public final java.util.Iterator iterator() {
        java.util.Iterator it = this.a.iterator();
        ahvr.ci(it);
        int i = this.b;
        ahvr.bN((boolean) ((i ^ (-1)) >>> 31), "limit is negative");
        return new defpackage.aiic(i, it);
    }
}
