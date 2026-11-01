package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class alaz extends java.io.IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;

    public alaz(java.io.IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void a() {
        this.a = true;
    }

    public alaz(java.lang.String str) {
        super(str);
    }

    public alaz(java.lang.String str, java.io.IOException iOException) {
        super(str, iOException);
    }
}
