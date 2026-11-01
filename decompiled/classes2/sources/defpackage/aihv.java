package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aihv extends aieu {
    final /* synthetic */ java.lang.Iterable a;
    final /* synthetic */ int b;

    public aihv(java.lang.Iterable iterable, int i) {
        this.a = iterable;
        this.b = i;
    }

    public final java.util.Iterator iterator() {
        java.lang.Iterable iterable = this.a;
        if (iterable instanceof java.util.List) {
            java.util.List list = (java.util.List) iterable;
            return list.subList(java.lang.Math.min(list.size(), this.b), list.size()).iterator();
        }
        int i = this.b;
        java.util.Iterator it = iterable.iterator();
        ahvr.aR(it, i);
        return new defpackage.aihu(this, it);
    }
}
