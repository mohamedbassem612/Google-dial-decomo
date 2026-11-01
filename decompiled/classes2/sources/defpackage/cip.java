package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cip extends defpackage.cim {
    private final defpackage.ctw c;

    public cip(defpackage.ctw ctwVar) {
        this.c = ctwVar;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        int i = this.b;
        this.b = i + 2;
        java.lang.Object[] objArr = this.a;
        return new defpackage.cib(this.c, objArr[i], objArr[i + 1]);
    }
}
