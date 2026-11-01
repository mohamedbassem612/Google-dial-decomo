package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aokz extends defpackage.aoky implements java.util.Iterator, defpackage.aoow {
    private final /* synthetic */ int $cid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aokz(defpackage.aola aolaVar, int i, byte[] bArr) {
        super(aolaVar);
        this.$cid = i;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.$cid != 0) {
            a();
            int i = this.b;
            defpackage.aola aolaVar = this.a;
            if (i >= aolaVar.e) {
                throw new java.util.NoSuchElementException();
            }
            this.b = i + 1;
            this.c = i;
            java.lang.Object obj = aolaVar.b[i];
            b();
            return obj;
        }
        a();
        int i2 = this.b;
        defpackage.aola aolaVar2 = this.a;
        if (i2 >= aolaVar2.e) {
            throw new java.util.NoSuchElementException();
        }
        this.b = i2 + 1;
        this.c = i2;
        java.lang.Object[] objArr = aolaVar2.c;
        defpackage.aooh.c(objArr);
        java.lang.Object obj2 = objArr[this.c];
        b();
        return obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aokz(defpackage.aola aolaVar, int i) {
        super(aolaVar);
        this.$cid = i;
    }
}
