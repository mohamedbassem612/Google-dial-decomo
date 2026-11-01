package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aacy {
    public java.lang.Object a;
    public java.lang.Object b;

    public aacy(byte[] bArr) {
        this.b = defpackage.aoke.a;
    }

    public final defpackage.aacz a() {
        if (this.b == null) {
            this.b = new defpackage.aais();
        }
        if (this.a == null) {
            this.a = android.os.Looper.getMainLooper();
        }
        return new defpackage.aacz((defpackage.aais) this.b, (android.os.Looper) this.a);
    }

    public final void b(java.util.Set set) {
        if (set == null) {
            defpackage.aooh.i("<set-?>");
        }
        this.b = set;
    }

    public final void c(java.util.Set set) {
        if (set == null) {
            defpackage.aooh.i("<set-?>");
        }
        this.a = set;
    }

    public aacy() {
    }

    public aacy(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = defpackage.aoke.a;
    }
}
