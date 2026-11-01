package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eq implements defpackage.ew {
    final defpackage.ew a;
    int b = 0;
    int c = -1;
    int d = -1;
    java.lang.Object e = null;

    public eq(defpackage.ew ewVar) {
        this.a = ewVar;
    }

    @Override // defpackage.ew
    public final void a(int i, int i2, java.lang.Object obj) {
        int i3;
        int i4;
        int i5;
        if (this.b == 3 && i <= (i4 = this.d + (i3 = this.c)) && (i5 = i + i2) >= i3 && this.e == obj) {
            this.c = java.lang.Math.min(i, i3);
            this.d = java.lang.Math.max(i4, i5) - this.c;
            return;
        }
        e();
        this.c = i;
        this.d = i2;
        this.e = obj;
        this.b = 3;
    }

    @Override // defpackage.ew
    public final void b(int i, int i2) {
        int i3;
        if (this.b == 1 && i >= (i3 = this.c)) {
            int i4 = this.d;
            if (i <= i3 + i4) {
                this.d = i4 + i2;
                this.c = java.lang.Math.min(i, i3);
                return;
            }
        }
        e();
        this.c = i;
        this.d = i2;
        this.b = 1;
    }

    @Override // defpackage.ew
    public final void c(int i, int i2) {
        e();
        this.a.c(i, i2);
    }

    @Override // defpackage.ew
    public final void d(int i, int i2) {
        int i3;
        if (this.b == 2 && (i3 = this.c) >= i && i3 <= i + i2) {
            this.d += i2;
            this.c = i;
        } else {
            e();
            this.c = i;
            this.d = i2;
            this.b = 2;
        }
    }

    public final void e() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                defpackage.ew ewVar = this.a;
                if (i != 2) {
                    ewVar.a(this.c, this.d, this.e);
                } else {
                    ewVar.d(this.c, this.d);
                }
            } else {
                this.a.b(this.c, this.d);
            }
            this.e = null;
            this.b = 0;
        }
    }
}
