package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class appy {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public defpackage.appy f;
    public defpackage.appy g;

    public appy(byte[] bArr, int i, int i2, boolean z) {
        if (bArr == null) {
            defpackage.aooh.i("data");
        }
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }

    public final defpackage.appy a() {
        defpackage.appy appyVar = this.f;
        if (appyVar == this) {
            appyVar = null;
        }
        defpackage.appy appyVar2 = this.g;
        if (appyVar2 == null) {
            defpackage.aooh.g();
        }
        appyVar2.f = this.f;
        defpackage.appy appyVar3 = this.f;
        if (appyVar3 == null) {
            defpackage.aooh.g();
        }
        appyVar3.g = this.g;
        this.f = null;
        this.g = null;
        return appyVar;
    }

    public final defpackage.appy b() {
        this.d = true;
        return new defpackage.appy(this.a, this.b, this.c, true);
    }

    public final void c(defpackage.appy appyVar, int i) {
        if (appyVar == null) {
            defpackage.aooh.i("sink");
        }
        if (!appyVar.e) {
            throw new java.lang.IllegalStateException("only owner can write");
        }
        int i2 = appyVar.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (appyVar.d) {
                throw new java.lang.IllegalArgumentException();
            }
            int i4 = appyVar.b;
            if (i3 - i4 > 8192) {
                throw new java.lang.IllegalArgumentException();
            }
            byte[] bArr = appyVar.a;
            defpackage.ajsz.cZ(bArr, bArr, 0, i4, i2);
            i2 = appyVar.c - appyVar.b;
            appyVar.c = i2;
            appyVar.b = 0;
        }
        byte[] bArr2 = this.a;
        byte[] bArr3 = appyVar.a;
        int i5 = this.b;
        defpackage.ajsz.cZ(bArr2, bArr3, i2, i5, i5 + i);
        appyVar.c += i;
        this.b += i;
    }

    public final void d(defpackage.appy appyVar) {
        if (appyVar == null) {
            defpackage.aooh.i("segment");
        }
        appyVar.g = this;
        appyVar.f = this.f;
        defpackage.appy appyVar2 = this.f;
        if (appyVar2 == null) {
            defpackage.aooh.g();
        }
        appyVar2.g = appyVar;
        this.f = appyVar;
    }

    public appy() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
