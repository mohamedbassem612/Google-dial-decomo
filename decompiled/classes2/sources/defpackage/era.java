package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class era extends java.io.IOException {
    public final boolean a;
    public final int b;

    public era(java.lang.String str, java.lang.Throwable th, boolean z, int i) {
        super(str, th);
        this.a = z;
        this.b = i;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        java.lang.String message = super.getMessage();
        return (message != null ? message.concat(" ") : "") + "{contentIsMalformed=" + this.a + ", dataType=" + this.b + '}';
    }
}
