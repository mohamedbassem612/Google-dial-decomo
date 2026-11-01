package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fiq implements defpackage.fio {
    private int a;
    private int b;
    private int c = 0;
    private amwp[] d = new amwp[100];

    @Override // defpackage.fio
    public final synchronized void a() {
        int i = this.a;
        java.lang.String str = eum.a;
        int iMax = java.lang.Math.max(0, ((i + 65535) / 65536) - this.b);
        int i2 = this.c;
        if (iMax >= i2) {
            return;
        }
        java.util.Arrays.fill(this.d, iMax, i2, (java.lang.Object) null);
        this.c = iMax;
    }

    @Override // defpackage.fio
    public final synchronized void b(defpackage.fgq fgqVar) {
        while (fgqVar != null) {
            amwp[] amwpVarArr = this.d;
            int i = this.c;
            this.c = i + 1;
            amwpVarArr[i] = fgqVar.e();
            this.b--;
            fgqVar = fgqVar.c();
        }
    }

    @Override // defpackage.fio
    public final synchronized amwp c() {
        amwp amwpVar;
        this.b++;
        int i = this.c;
        if (i > 0) {
            amwp[] amwpVarArr = this.d;
            int i2 = i - 1;
            this.c = i2;
            amwpVar = amwpVarArr[i2];
            ahvr.ci(amwpVar);
            this.d[this.c] = null;
        } else {
            amwpVar = new amwp(new byte[65536]);
            int i3 = this.b;
            amwp[] amwpVarArr2 = this.d;
            int length = amwpVarArr2.length;
            if (i3 > length) {
                this.d = (amwp[]) java.util.Arrays.copyOf(amwpVarArr2, length << 1);
            }
        }
        return amwpVar;
    }

    @Override // defpackage.fio
    public final synchronized void d(amwp amwpVar) {
        amwp[] amwpVarArr = this.d;
        int i = this.c;
        this.c = i + 1;
        amwpVarArr[i] = amwpVar;
        this.b--;
    }

    public final synchronized int e() {
        return this.c << 16;
    }

    public final synchronized void f() {
        g(0);
    }

    public final synchronized void g(int i) {
        int i2 = this.a;
        this.a = i;
        if (i < i2) {
            a();
        }
    }
}
