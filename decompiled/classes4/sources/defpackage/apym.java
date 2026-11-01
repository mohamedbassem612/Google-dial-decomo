package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public class apym extends java.io.IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;

    public apym(java.io.IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void a() {
        this.a = true;
    }

    public apym(java.lang.String str) {
        super(str);
    }

    public apym(java.io.IOException iOException, byte[] bArr) {
        super("Unable to parse map entry.", iOException);
    }
}
