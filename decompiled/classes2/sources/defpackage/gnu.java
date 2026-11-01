package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gnu {
    public int a;
    public int b;

    public gnu() {
        this.a = -1;
        this.b = -16777216;
    }

    public final defpackage.gnv a() {
        return new defpackage.gnv(this.a, this.b);
    }

    public final void b(int i) {
        gnw gnwVar = gnw.c;
        gus.P(i);
        this.b = i;
    }

    public final void c(int i) {
        gnw gnwVar = gnw.c;
        gus.Q(i);
        this.a = i;
    }

    public final void d(defpackage.etx etxVar) {
        this.b = etxVar.j();
        this.a = etxVar.j();
    }

    public gnu(byte[] bArr) {
        this.b = -1;
        this.a = -1;
    }

    public gnu(byte[] bArr, byte[] bArr2) {
    }
}
