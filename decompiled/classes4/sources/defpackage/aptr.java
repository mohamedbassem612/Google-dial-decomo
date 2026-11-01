package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aptr {
    public final defpackage.apto a;
    public defpackage.aptp e;
    public defpackage.aptp h;
    public final java.util.LinkedList d = new java.util.LinkedList();
    public int f = 14;
    public final defpackage.aptn c = new defpackage.aptj();
    public final defpackage.aprr b = defpackage.aprr.b;
    public final defpackage.aptl g = new defpackage.aptl(null, null);

    public aptr(defpackage.apto aptoVar) {
        this.a = aptoVar;
    }

    public final java.io.InputStream a() {
        defpackage.aptp aptpVar = this.h;
        int i = aptpVar.l;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 6 || i2 == 12 || i2 == 8 || i2 == 9) {
            return aptpVar.j;
        }
        throw new java.lang.IllegalStateException("Invalid state: ".concat(defpackage.aptp.e(i)));
    }

    public final defpackage.apti b() {
        defpackage.aptp aptpVar = this.h;
        int i = aptpVar.l;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 6 || i2 == 8 || i2 == 9 || i2 == 12 || i2 == 13) {
            return aptpVar.o;
        }
        throw new java.lang.IllegalStateException("Invalid state :".concat(defpackage.aptp.e(i)));
    }
}
