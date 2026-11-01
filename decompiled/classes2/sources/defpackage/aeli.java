package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class aeli implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;

    public /* synthetic */ aeli(adai adaiVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, int i) {
        this.$cid = i;
        this.b = adaiVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ahzi, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        java.lang.Object obj = this.b;
        if (i == 0) {
            ((afip) ((ahix) ((adai) obj).a.eZ()).e.eZ()).b(1L, new java.lang.Object[]{this.c, this.d, this.e, this.f, java.lang.Boolean.valueOf(this.a)});
            return;
        }
        android.util.Pair pair = (android.util.Pair) obj;
        int iIntValue = ((java.lang.Integer) pair.first).intValue();
        defpackage.ffu ffuVar = (defpackage.ffu) pair.second;
        defpackage.eyz eyzVar = ((defpackage.eyw) this.c).a;
        boolean z = this.a;
        java.lang.Object obj2 = this.f;
        eyzVar.i.h(iIntValue, ffuVar, (defpackage.ffl) this.d, (defpackage.ffq) this.e, (java.io.IOException) obj2, z);
    }

    public /* synthetic */ aeli(defpackage.eyw eywVar, android.util.Pair pair, defpackage.ffl fflVar, defpackage.ffq ffqVar, java.io.IOException iOException, boolean z, int i) {
        this.$cid = i;
        this.c = eywVar;
        this.b = pair;
        this.d = fflVar;
        this.e = ffqVar;
        this.f = iOException;
        this.a = z;
    }
}
