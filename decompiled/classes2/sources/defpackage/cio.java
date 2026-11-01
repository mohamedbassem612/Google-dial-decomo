package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cio extends defpackage.cim {
    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i = this.b;
        this.b = i + 2;
        return this.a[i];
    }
}
