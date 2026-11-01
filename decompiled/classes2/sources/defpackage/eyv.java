package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class eyv implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public eyv(int i, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, java.util.ArrayList arrayList4, int i2) {
        this.$cid = i2;
        this.a = i;
        this.d = arrayList;
        this.c = arrayList2;
        this.e = arrayList3;
        this.b = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.$cid != 0) {
            for (int i = 0; i < this.a; i++) {
                android.view.View view = (android.view.View) ((java.util.ArrayList) this.d).get(i);
                java.lang.String str = (java.lang.String) ((java.util.ArrayList) this.c).get(i);
                int i2 = dzs.a;
                view.setTransitionName(str);
                ((android.view.View) ((java.util.ArrayList) this.e).get(i)).setTransitionName((java.lang.String) ((java.util.ArrayList) this.b).get(i));
            }
            return;
        }
        android.util.Pair pair = (android.util.Pair) this.c;
        int iIntValue = ((java.lang.Integer) pair.first).intValue();
        defpackage.ffu ffuVar = (defpackage.ffu) pair.second;
        defpackage.eyz eyzVar = ((defpackage.eyw) this.b).a;
        int i3 = this.a;
        java.lang.Object obj = this.e;
        eyzVar.i.i(iIntValue, ffuVar, (defpackage.ffl) this.d, (defpackage.ffq) obj, i3);
    }

    public /* synthetic */ eyv(defpackage.eyw eywVar, android.util.Pair pair, defpackage.ffl fflVar, defpackage.ffq ffqVar, int i, int i2) {
        this.$cid = i2;
        this.b = eywVar;
        this.c = pair;
        this.d = fflVar;
        this.e = ffqVar;
        this.a = i;
    }
}
