package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class akyw extends defpackage.akyv {
    private final byte[] a;
    private int b;
    private final int c;

    public akyw(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i + i2;
    }

    @Override // defpackage.akyy
    public final byte a() {
        int i = this.b;
        if (i >= this.c) {
            throw new java.util.NoSuchElementException();
        }
        this.b = i + 1;
        return this.a[i];
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c;
    }
}
