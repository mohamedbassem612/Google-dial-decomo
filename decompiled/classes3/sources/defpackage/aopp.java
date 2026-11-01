package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aopp extends defpackage.aokj {
    public boolean a;
    private final int b;
    private final int c;
    private int d;

    public aopp(int i, int i2, int i3) {
        this.b = i3;
        this.c = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.a = z;
        this.d = true != z ? i2 : i;
    }

    @Override // defpackage.aokj
    public final int a() {
        int i = this.d;
        if (i != this.c) {
            this.d = this.b + i;
        } else {
            if (!this.a) {
                throw new java.util.NoSuchElementException();
            }
            this.a = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a;
    }
}
