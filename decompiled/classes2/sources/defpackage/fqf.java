package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fqf implements defpackage.fme {
    public static final defpackage.fqf a = new defpackage.fqf(true);
    public static final defpackage.fqf b = new defpackage.fqf(false);
    public final boolean c;

    private fqf(boolean z) {
        this.c = z;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IncorrectFragmentation{expected=");
        sb.append(!this.c);
        sb.append('}');
        return sb.toString();
    }
}
